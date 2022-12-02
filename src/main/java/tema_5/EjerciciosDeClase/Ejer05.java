package tema_5.EjerciciosDeClase;

import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class Ejer05 {

    public static void main(String[] args) {

        int cantidadCeros = 0;

        int[] arrayNumeros = new int[10];

        //LEER VALORES
        leerValores(arrayNumeros);

        //MOSTRAR ARRAY
        mostrarArray(arrayNumeros);

        //MOSTRAR LA MEDIA DE POSITIVOS
        mediaPosit(arrayNumeros);

        //MOSTRAR LA MEDIA DE NEGATIVOS
        mediaNega(arrayNumeros);

        //MOSTRAR LA CANTIDAD DE CEROS
        cantidadCeros = devolverCeros(arrayNumeros);

        System.out.println("Cantidad de ceros: " + cantidadCeros);

    }

    public static Scanner teclado = new Scanner(System.in);

    //LEER LOS VALORES POR TECLADO
    public static void leerValores(int[] aux) {

        int numero;

        System.out.println("Introduzca 10 numeros enteros: ");

        for (int i = 0; i < 10; i++) {
            System.out.println("Numero " + (i + 1));
            numero = teclado.nextInt();

            aux[i] = numero;
        }
    }

    //MUESTRA LA CANTIDAD DE POSITIVOS
    public static int devolverPosit(int[] aux) {

        int positivos = 0;

        for (int i = 0; i < 10; i++) {

            if (aux[i] > 0) {

                positivos++;

            }
        }

        return positivos;
    }

    //MUESTRA LA CANTIDAD DE NEGATIVOS
    public static int devolverNegat(int[] aux) {

        int negativos = 0;

        for (int i = 0; i < 10; i++) {

            if (aux[i] < 0) {

                negativos++;

            }
        }

        return negativos;
    }

    //MUESTRA LA CANTIDAD DE CEROS
    public static int devolverCeros(int[] aux) {

        int ceros = 0;

        for (int i = 0; i < 10; i++) {

            if (aux[i] == 0) {

                ceros++;

            }
        }

        return ceros;
    }

    //MUESTRA EL ARRAY
    public static void mostrarArray(int[] aux) {

        for (int i = 0; i < 10; i++) {

            System.out.print(aux[i] + " - ");
        }
    }

    //CALCULAR LA MEDIA DE POSITIVOS
    public static void mediaPosit(int[] aux) {

        double media = 0;
        int numeros = 0;

        for (int i = 0; i < 10; i++) {

            if (aux[i] > 0) {

                numeros +=  aux[i];

            }
        }

        int cantidaPos = devolverPosit(aux);

        media = numeros/cantidaPos;

        System.out.println("\nMedia de positivos: " + media);
    }

    //CALCULAR LA MEDIA DE NEGATIVOS
    public static void mediaNega(int[] aux) {

        double media = 0;
        int numeros = 0;

        for (int i = 0; i < 10; i++) {

            if (aux[i] < 0) {

                numeros +=  aux[i];

            }
        }

        int cantidaNeg = devolverNegat(aux);

        media = numeros/cantidaNeg;

        System.out.println("Media de negativos: " + media);
    }

}
