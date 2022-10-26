package tema_3.EJERCICIOS3D;

import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class InversorPalabras {

    public static void main(String[] args) {
        //LEER PALABRA POR TECLADO HASTA Q PONGA SALIR
        //LEER UNA PALABRA Y DARLE LA VUELTA
        Scanner teclado = new Scanner(System.in);

        //VARIABLES
        String palabra;
        char palabraInvert;
        int contador;

        do {
            System.out.println("ESCRIBA UNA PALABRA, ESCRIBA SALIR SI DESEA FINALIZAR");
            palabra = teclado.nextLine();
            contador = palabra.length();

            for (int i = 0; i < palabra.length(); i++) {
                contador--;
                System.out.print(palabra.charAt(contador));

            }

            System.out.println("\n");

        } while (!palabra.equalsIgnoreCase("salir"));

    }
}
