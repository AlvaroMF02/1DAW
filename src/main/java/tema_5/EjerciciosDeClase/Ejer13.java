package tema_5.EjerciciosDeClase;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class Ejer13 {

    public static void main(String[] args) {

        int numero;
        int[] almacen = new int[0];
        int tamanio = 0;
        int contadorNumer = 0;
        int cantidad = 0;

        do {
            
            numero = leerNumero();
            tamanio++;

            //COPIA PARA AGRANDAR EL ARRAY
            almacen = Arrays.copyOf(almacen, tamanio);
            //GUARDAR EL NUMERO
            almacen[tamanio - 1] = numero;

        } while (numero != 0);

        //ORDENAR ARRAY
        Arrays.sort(almacen);
        for (int i = 0; i < almacen.length; i++) {
            
            if (almacen[i] == almacen[i+1]) {
                
            }
            
        }
    }

    public static int leerNumero() {
        Scanner teclado = new Scanner(System.in);
        int numero = 1;
        boolean repetir = true;
        do {
            try {
                do {
                    System.out.println("Indica un numero");
                    numero = teclado.nextInt();

                    if (numero < 0 || numero > 20) {
                        System.out.println("Escribe un numero entre 1 y 20");
                    }
                } while (numero < 0 || numero > 20);

                repetir = false;

            } catch (InputMismatchException ime) {
                teclado.nextLine();
                System.out.println("Escribe bien");
            }

        } while (repetir);

        return numero;
    }
}
