
/**
 * Laboratorio de Bases Advanzadas creado por Josué Solis.
 */
package Logica;

//imports necesario para conectar la aplicacion con Mongo
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import org.bson.Document;


/**
 * Clase que crea una conexion local con MongoDB y hace los CRUD
 * 
 * @author Alies234
 * @version 0.1
 */

public class MongoConnection {

    private MongoClient mongoClient;
    
    /**
    *Contructor de la clase
    */
    public MongoConnection() {
    }//Fin del contructor
    
    /**
     * Metodo que crea una conexion local con MongoDB
     * @return una conexion con una base de datos de MongoDB, la base se llama Cine
     */
    public MongoDatabase creaMongoClient(){
     
        this.mongoClient = new MongoClient( "localhost" , 27017 );
        System.out.println("La conexion con el servidor fue exitosa");
        
        //Connecting with database
	MongoDatabase dbs = mongoClient.getDatabase("Cine");
        System.out.println("¡Se establecío una conexion exitosa con la base de datos!");
        System.out.println("Nombre de la base "+dbs.getName());
        return dbs;
    }//Fin del metodo creaMongoClient
    
    /**
     * Metodo que guarda la información del objeto pelicula en la base Cine de MongoDB
     * @param pelicula, un objeto de tipo pelicula
     * @return boolean, confirma si el proceso tuvo exito True o fallo False 
     */
    public boolean guardarPelicula(Pelicula pelicula){
        boolean exito = true;
        
        try {
            MongoDatabase dbs = creaMongoClient();
        
            Document doc = createDBObjectPelicula(pelicula);
            MongoCollection col = dbs.getCollection("Peliculas");
        
            col.insertOne(doc);
        } catch (Exception e) {
            exito = false;
        }

        mongoClient.close();
        return exito;
    }//Fin del metodo guardarPelicula
    
    /**
     * Metodo que guarda la información del objeto Compania en la base Cine de MongoDB
     * @param compania, un objeto de tipo Compania
     * @return boolean, confirma si el proceso tuvo exito True o fallo False 
     */
    public boolean guardarCompania(Compania compania){
        boolean exito = true;
        
        try {
            MongoDatabase dbs = creaMongoClient();
        
            Document doc = createDBObjectCompania(compania);
            MongoCollection col = dbs.getCollection("Companias");
        
            col.insertOne(doc);
        } catch (Exception e) {
            exito = false;
        }

        mongoClient.close();
        return exito;
    }//Fin del metodo guardarCompania
    
    /**
     * Metodo que elimina la información del objeto pelicula en la base Cine de MongoDB
     * @param pelicula, un objeto de tipo pelicula
     * @return boolean, confirma si el proceso tuvo exito True o fallo False 
     */    
    public boolean borrarPelicula(Pelicula pelicula){
         boolean exito = true;
        
        try {
            MongoDatabase dbs = creaMongoClient();
        
            Document doc = createDBObjectPelicula(pelicula);
            MongoCollection col = dbs.getCollection("Peliculas");
        
            col.deleteOne(doc);
        } catch (Exception e) {
            exito = false;
        }

        mongoClient.close();
        return exito;
    }//Fin del metodo borrarPelicula
    
    /**
     * Metodo que elimina la información del objeto Compania en la base Cine de MongoDB
     * @param compania , un objeto de tipo Compania
     * @return boolean, confirma si el proceso tuvo exito True o fallo False 
     */    
    public boolean borrarCompania(Compania compania){
         boolean exito = true;
        
        try {
            MongoDatabase dbs = creaMongoClient();
        
            Document doc = createDBObjectCompania(compania);
            MongoCollection col = dbs.getCollection("Companias");
        
            col.deleteOne(doc);
        } catch (Exception e) {
            exito = false;
        }

        mongoClient.close();
        return exito;
    }//Fin del metodo borrarCompania
    
    /**
     * Metodo que leer la información del objeto pelicula en la base Cine de MongoDB
     * @param pelicula, un objeto de tipo pelicula
     * @return boolean, confirma si el proceso tuvo exito True o fallo False 
     */    
    public boolean leerPelicula(Pelicula pelicula){
         boolean exito = true;
        
        try {
            MongoDatabase dbs = creaMongoClient();
        
            Document doc = createDBObjectPelicula(pelicula);
            MongoCollection col = dbs.getCollection("Peliculas");
        
            FindIterable<Document> F = col.find();
            
            for (Document docs : F) {
                System.out.print(docs.toString());
            }
        } catch (Exception e) {
            exito = false;
        }

        mongoClient.close();
        return exito;
    }//Fin del metodo leerPelicula
    
    /**
     * Metodo que leer la información del objeto Compania en la base Cine de MongoDB
     * @param compania , un objeto de tipo Compania
     * @return boolean, confirma si el proceso tuvo exito True o fallo False 
     */    
    public boolean leerCompania(Compania compania){
         boolean exito = true;
        
        try {
            MongoDatabase dbs = creaMongoClient();
        
            Document doc = createDBObjectCompania(compania);
            MongoCollection col = dbs.getCollection("Companias");
        
            FindIterable<Document> F = col.find();
            
            for (Document docs : F) {
                System.out.print(docs.toString());
            }

        } catch (Exception e) {
            exito = false;
        }

        mongoClient.close();
        return exito;
    }//Fin del metodo leerCompania
    
    /**
     * Metedo que crea un Document
     * @param Peli, un objeto de tipo Pelicula
     * @return Document, un arreglo JSON con toda la información del objeto pelicula
     */
    private static Document createDBObjectPelicula(Pelicula Peli) {
		Document docBuilder = new Document();
								
		docBuilder.append("nombrePelicula", Peli.getNombrePelicula());
                docBuilder.append("nombreDirector", Peli.getNombreDirector());
                docBuilder.append("genero", Peli.getGenero());
                docBuilder.append("paisDeProduccion", Peli.getPaisDeProduccion());
                
                if(Peli.getFranquicia()!=null){
                    docBuilder.append("franquicia", Peli.getFranquicia());
                }
                
                docBuilder.append("companíaProductora", Peli.getCompaníaProductora());
                docBuilder.append("año", Peli.getAnio());
                docBuilder.append("minutos", Peli.getMinutos());
                docBuilder.append("actores", Peli.getActores());
                
		return docBuilder;
    }//Fin del metodo leerDBObjectPelicula
    
    /**
    * Metedo que crea un Document
    * @param Comp, un objeto de tipo Compania
    * @return Document, un arreglo JSON con toda la información del objeto Compania
    */
    private static Document createDBObjectCompania(Compania Comp) {
		Document docBuilder = new Document();
								
		docBuilder.append("nombreCompania", Comp.getNombreCompania());
                docBuilder.append("añoFundacion", Comp.getAnioFundacion());
                
                if(Comp.getPaginaOficial()!=null){
                    docBuilder.append("paginaOficial", Comp.getPaginaOficial());
                }
                

                
		return docBuilder;
    }//Fin del metodo CreateDBObjectCompania
}//Fin de la clase MongoConnection
