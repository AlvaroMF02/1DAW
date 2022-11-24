package tema_4.explicaicionENUM;

/**
 *
 * @author alvaro
 */
public enum NewEnum {
    
    //OBJETOS QUE QUIERO CREAR        "ESTADOS"
    //UTILIZA EL CONSTRUCTOR CREADO ABAJO
    DESPIERTO(1, "Despierto"),
    JUGANDO(2, "Jugando"),
    COMIENDO(3, "Comiendo"),
    DURMIENDO(4, "Durmiendo");
    
    
    
    private int codigoEstado;
    private String estado;
            
            
    //CONSTRUCTOR PRIVADO
    private NewEnum(int codigoEstado, String estado) {
        this.codigoEstado = codigoEstado;
        this.estado = estado;
    }
    
    //GETTER POR SI QUIERO EL CODIGO O EL ESTADO

    public int getCodigoEstado() {
        return codigoEstado;
    }

    public String getEstado() {
        return estado;
    }
    
            
}
