package tema_3.ejercicios_seleccion;

import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class Ejer2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //VARIABLES
        String resultado;
        double numX;
        int numEntero;
        int valorAbsoluto;

        //A
        System.out.println("APARTADO A \n");
        System.out.println("Indica un número");
        numX = teclado.nextDouble();
        resultado = (numX >= 135) ? "MAYOR" : "MENOR";
        System.out.println(resultado);

        //B
        System.out.println("\nAPARTADO B \n");
        System.out.println("Indica un número");
        numX = teclado.nextDouble();
        resultado = (numX <= 0) ? "MENOR QUE 0" : "MAYOR QUE 0";
        System.out.println(resultado);

        //C
        System.out.println("\nIndica un número para ver su valor absoluto");
        numEntero = teclado.nextInt();

        if (numEntero<0) {
            valorAbsoluto=(numEntero-numEntero)-numEntero;
            System.out.println("El valor absoluto es |"+valorAbsoluto+"|");
            
        } else {
            System.out.println("El valor absoluto es |"+numEntero+"|");
        }
    }
}
