package tema_4.explicaicionENUM;

/**
 *
 * @author alvaro
 */
public class PruebaEnum {
    public static void main(String[] args) {
        
        NewEnum prueba = NewEnum.COMIENDO;
        System.out.println("Codigo de la prueba " + prueba.getCodigoEstado());
        System.out.println("Estado de la prueba " + prueba.getEstado());
    }
}
