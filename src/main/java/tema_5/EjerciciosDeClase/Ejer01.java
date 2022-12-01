package tema_5.EjerciciosDeClase;

/**
 *
 * @author alvaro
 */
public class Ejer01 {

    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5, 6};
        int total = 0;

        for (int i = 0; i < numeros.length; i++) {

            System.out.println(numeros[i]);
            total += numeros[i];

        }

        System.out.println("Total: " + total);
    }
}
