package tema_3.ejercicios_seleccion;

import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class Ejer4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resultado;

        System.out.print("Introduce tu edad:");
        int edad = scanner.nextInt();

        resultado = (edad < 18) ? "MENOR DE EDAD" : "MAYOR DE EDAD";

        System.out.println(resultado);
    }
}
