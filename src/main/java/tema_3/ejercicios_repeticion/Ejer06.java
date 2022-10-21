package tema_3.ejercicios_repeticion;

import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class Ejer06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, x;
        System.out.print("Ingrese el valor final:");
        n = teclado.nextInt();
        x = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        }
    }
}
