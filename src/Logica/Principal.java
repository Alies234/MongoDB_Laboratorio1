package Logica;

import java.util.Arrays;
import java.util.List;

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
        
        Compania C = new Compania("Mavel Studios", 1993);
        /*List<String> Actores = Arrays.asList("Robert Downey Jr",
                "Chris Hemsworth",
                "Mark Ruffalo",
                "Chris Evans",
                "Scarlett Johansson",
                "Benedict Cumberbatch",
                "Don Cheadle",
                "Tom Holland",
                "Chadwick Boseman",
                "Paul Bettany",
                "Elizabeth Olsen",
                "Anthony Mackie",
                "Sebastian Stan",
                "Danai Gurira",
                "Letitia Wright",
                "Dave Bautista",
                "Zoe Saldana",
                "Josh Brolin",
                "Chris Pratt");

        Pelicula P = new Pelicula("Avenger: Infinity War", "Los hermanos Russo", "Accion",
                "Avenger", "Estados Unidos", "Marvel Studios", 2018, 149, Actores);
        
        MC.guardarPelicula(P);
    */
        MC.leerCompania(C);
    }//Fin del metodo main

}//Fin  de la clase principal
