package Logica;

//import para usar las lista default de Java
import java.util.List;

/**
 * Objeto Pelicula que posee diferentes atributos
 * 
 * @author Alies234
 * @version 0.1
 */
public class Pelicula {
    
    private String nombrePelicula;  
    private String nombreDirector;  
    private String genero;  
    private String paisDeProduccion;  
    private String franquicia;
    private String companíaProductora;
    private int anio;
    private int minutos;
    private List<String> Actores;

    /**
     * Contructor de la clase pelicula que resive todos los parametros globales meno franquicia
     * @param nombrePelicula El nombre de la pelicula
     * @param nombreDirector El nombre del director de  la pelicula
     * @param genero El genero al cual pertenece la pelicula
     * @param paisDeProduccion El pais donde se creo la pelicula
     * @param companíaProductora La compañia que realizo la pelicula
     * @param anio  El año el cual se realizor la pelicula
     * @param minutos Los minutos que dura la pelicula
     * @param Actores Lista de actores que participaron el la pelicula
     */
    public Pelicula(String nombrePelicula, String nombreDirector, String genero, String paisDeProduccion, String companíaProductora, int anio, int minutos, List<String> Actores) {
        this.nombrePelicula = nombrePelicula;
        this.nombreDirector = nombreDirector;
        this.genero = genero;
        this.paisDeProduccion = paisDeProduccion;
        this.companíaProductora = companíaProductora;
        this.anio = anio;
        this.minutos = minutos;
        this.Actores = Actores;
    }//Fin de Pelicula

    /**
     * Contructor que resibe todo los parametros de la clase
     * @param nombrePelicula El nombre de la pelicula
     * @param nombreDirector El nombre del director de  la pelicula
     * @param genero El genero al cual pertenece la pelicula
     * @param paisDeProduccion El pais donde se creo la pelicula
     * @param franquicia La franquicia a la cual pertenece la pelicula
     * @param companíaProductora La compañia que realizo la pelicula
     * @param anio  El año el cual se realizor la pelicula
     * @param minutos Los minutos que dura la pelicula
     * @param Actores Lista de actores que participaron el la pelicula
     */
    public Pelicula(String nombrePelicula, String nombreDirector, String genero, String paisDeProduccion, String franquicia, String companíaProductora, int anio, int minutos, List<String> Actores) {
        this.nombrePelicula = nombrePelicula;
        this.nombreDirector = nombreDirector;
        this.genero = genero;
        this.paisDeProduccion = paisDeProduccion;
        this.franquicia = franquicia;
        this.companíaProductora = companíaProductora;
        this.anio = anio;
        this.minutos = minutos;
        this.Actores = Actores;
    }//Fin del metodo pelicula 
    //Aqui comienza todos los getters & setters del la clase
    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPaisDeProduccion() {
        return paisDeProduccion;
    }

    public void setPaisDeProduccion(String paisDeProduccion) {
        this.paisDeProduccion = paisDeProduccion;
    }

    public String getFranquicia() {
        return franquicia;
    }

    public void setFranquicia(String franquicia) {
        this.franquicia = franquicia;
    }

    public String getCompaníaProductora() {
        return companíaProductora;
    }

    public void setCompaníaProductora(String companíaProductora) {
        this.companíaProductora = companíaProductora;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public List<String> getActores() {
        return Actores;
    }

    public void setActores(List<String> Actores) {
        this.Actores = Actores;
    }
    //Aqui termina todos los getters & setters del la clase
    
    
}//Fin de la clase
