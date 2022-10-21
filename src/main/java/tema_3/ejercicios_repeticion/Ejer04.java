package tema_3.ejercicios_repeticion;

/**
 *
 * @author alvaro
 */
public class Ejer04 {

    public static void main(String[] args) {
        int numero = 1;

        while (numero < 11) {
            System.out.println("Número: " + numero);
            numero++;
        }
        do {
            System.out.println("Número: " + --numero);
        } while (numero > 1);

    }
}
