package Logica;

/**
 * Objeto Compania que posee diferentes atributos
 * 
 * @author Alies234
 * @version 0.1
 */
public class Compania {
    
    private String nombreCompania;
    private int anioFundacion;
    private String paginaOficial;

    /**
     * Contructor de la clase Compania, resibe todos los parametros de la clase
     * @param nombreCompania, el nombre de la compañia
     * @param anioFundacion, el año de fundacion de la compañia
     * @param paginaOficial, el URL oficial de la compañia
    */
    public Compania(String nombreCompania, int anioFundacion, String paginaOficial) {
        this.nombreCompania = nombreCompania;
        this.anioFundacion = anioFundacion;
        this.paginaOficial = paginaOficial;
    }//Fin del constructor
    
        /**
     * Contructor de la clase Compania, resibe todos los parametros de la clase, menos paginaOficial
     * @param nombreCompania, el nombre de la compañia
     * @param anioFundacion, el año de fundacion de la compañia
     *
    */
    public Compania(String nombreCompania, int anioFundacion) {
        this.nombreCompania = nombreCompania;
        this.anioFundacion = anioFundacion;
        this.paginaOficial = null;
    }//Fin del constructor

    //Aqui comienza todos los getters & setters de la clase
    public String getNombreCompania() {
        return nombreCompania;
    }

    public void setNombreCompania(String nombreCompania) {
        this.nombreCompania = nombreCompania;
    }

    public int getAnioFundacion() {
        return anioFundacion;
    }

    public void setAnioFundacion(int anioFundacion) {
        this.anioFundacion = anioFundacion;
    }

    public String getPaginaOficial() {
        return paginaOficial;
    }

    public void setPaginaOficial(String paginaOficial) {
        this.paginaOficial = paginaOficial;
    }
    //Aqui termina todos los getters & setters de la clase
    
    
}//Fin de la clase Compania
