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
        int [] almacen;
        
        do {
            
            numero = leerNumero();
            almacen = rellenarArray(numero);
            
        } while (numero != 0);

        for (int i : almacen) {
            System.out.println(i);
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
    
    public static int []rellenarArray(int numero){
        int [] aux = new int[2];
        //0
        //GENERAR UNA COPIA + 1 DE TAMAÑO PARA IR AÑADIENDO MAS NUMEROS
        aux = Arrays.copyOf(aux, aux.length + 1);
        //1
        aux [aux.length+1] = numero;
        System.out.println(aux.length);
        return aux;
    }
}
