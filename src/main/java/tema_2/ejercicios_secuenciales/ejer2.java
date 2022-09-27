package tema_2.ejercicios_secuenciales;

import java.util.Scanner;

/**
 *
 * @author alvaro
 */

/*
Algoritmo que lea por teclado el valor del radio de una circunferencia y calcule
la longitud, el área de la circunferencia y el volumen de una esfera con ese radio.
 */
public class ejer2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //VARIABLES
        final double PI = Math.PI;
        double radio;
        double longitud;
        double area;
        double volumen;

        System.out.println("Indique el radio de la circunferencia");
        radio = teclado.nextDouble();

        //OPERACIONES
        //longitud
        longitud = (PI * 2) * radio;

        //area
        area = PI * (Math.pow(radio, 2));

        //volumen
        volumen = (4 / 3) * PI * Math.pow(radio, 3);

        String resultados = """
                             
                            RESULTADOS
                             
                            Longitud = %.2f
                            Área = %.2f
                            Volumen = %.2f
                            """.formatted(longitud, area, volumen);

        System.out.println(resultados);
    }
}
