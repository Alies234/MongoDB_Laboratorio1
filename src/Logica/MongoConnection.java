
/**
 * Laboratorio de Bases Advanzadas creado por Josué Solis.
 */
package Logica;

//imports necesario para conectar la aplicacion con Mongo
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

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
        System.out.println("server connection successfully done");
        
        //Connecting with database
	MongoDatabase dbs = mongoClient.getDatabase("Cine");
        System.out.println("Connect to database successfully");
        System.out.println("Database Name"+dbs.getName());
        return dbs;
    }//Fin del metodo creaMongoClient
    
    public boolean guardarPelicula(Pelicula pelicula){
        boolean exito = false;
        
        return exito;
    }
    
}//Fin de la clase MongoConnection
