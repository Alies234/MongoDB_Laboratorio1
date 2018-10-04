
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
import com.mongodb.client.MongoCollection;
import org.bson.Document;


/**
 * Clase que crea una conexion local con MongoDB y hace los CRUD
 * 
 * @author Alies234
 * @version 0.1
 */

public class MongoConnection {

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
     
        MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
        System.out.println("La conexion con el servidor fue exitosa");
        
        //Connecting with database
	MongoDatabase dbs = mongoClient.getDatabase("Cine");
        System.out.println("¡Se establecío una conexion exitosa con la base de datos!");
        System.out.println("Nombre de la base "+dbs.getName());
        return dbs;
    }//Fin del metodo creaMongoClient
    
    public boolean guardarPelicula(Pelicula pelicula){
        boolean exito = false;
        
        try {
            MongoDatabase dbs = creaMongoClient();
        
            Document doc = createDBObjectPelicula(pelicula);
            MongoCollection col = dbs.getCollection("Peliculas");
        
            col.insertOne(doc);
            exito = true;
        } catch (Exception e) {
            System.out.println("ERROR: " + e.toString());
        }

        
        return exito;
    }
    
    /**
     * Metedo que crea un DBObject
     * @param Peli, un objeto de tipo Pelicula
     * @return DBObject, un arreglo JSON con toda la información del objeto pelicula
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
	}
    
}//Fin de la clase MongoConnection
