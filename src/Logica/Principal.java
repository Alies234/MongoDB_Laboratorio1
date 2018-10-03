package Logica;

/**
 * Clase principal.
 * 
 * @author Alies234
 * @version 0.1
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MongoConnection MC = new MongoConnection();
        MC.creaMongoClient();
    }
    
}
