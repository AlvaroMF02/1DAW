package tema_3.ejercicios_repeticion;

/**
 *
 * @author alvaro
 */
public class Ejer03 {
    public static void main(String[] args) {
        int numero = 15;
        
        for (int i = 0; i < 25; i++) {
            numero = numero +numero;
            System.out.println(numero);
        }
    }
}
