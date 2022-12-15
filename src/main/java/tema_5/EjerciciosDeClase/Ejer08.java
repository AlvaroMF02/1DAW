package tema_5.EjerciciosDeClase;

import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class Ejer08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numero;

        System.out.println("Indique el tamaño del array");
        int tamanio = teclado.nextInt();

        int[] enteros = new int[tamanio];

        //METER VALORES EN EL ARRAY
        for (int i = 0; i < enteros.length; i++) {
            System.out.println("Indica un numero para la posicion " + (i + 1));
            numero = teclado.nextInt();
            enteros[i] = numero;
        }

        //MOSTRAR ESTRELLITAS
        for (int i = 0; i < enteros.length; i++) {
            System.out.println("");
            for (int j = 0; j < enteros[i]; j++) {
                System.out.print("*");
            }
        }

    }
}
