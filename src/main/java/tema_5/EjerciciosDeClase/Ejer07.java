package tema_5.EjerciciosDeClase;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class Ejer07 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random alea = new Random();

        System.out.println("Indique el tamaño de los arrays");
        int tamanyo = teclado.nextInt();

        int[] lista1 = new int[tamanyo];
        int[] lista2 = new int[tamanyo];
        int[] multiplicado;

        //RELLENAR ARRAYS
        for (int i = 0; i < tamanyo; i++) {
            lista1[i] = alea.nextInt(1, 100 + 1);
            lista2[i] = alea.nextInt(1, 100 + 1);
        }

        mostrar(lista1);
        System.out.println("\n###");
        mostrar(lista2);
        System.out.println("\n###");
        multiplicado = multiplicar(lista1, lista2);

        mostrar(multiplicado);

    }

    //MULTIPLICAR
    public static int[] multiplicar(int[] aux1, int[] aux2) {
        int[] listaMulti = new int[aux1.length];

        for (int i = 0; i < aux1.length; i++) {
            listaMulti[i] = aux1[i] * aux2[i];
        }

        return listaMulti;
    }

    //MOSTRAR ARRAYS
    public static void mostrar(int[] aux) {
        for (int i = 0; i < aux.length; i++) {
            System.out.print(aux[i] + ", ");
        }

    }
}
