package tema_3.ejercicios_seleccion;

import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class Ejer5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //VARIABLES
        int opcion;
        double ladoCuadrado;
        double areaCuadrado;
        double baseTriangulo;
        double alturaTriangulo;
        double areaTriangulo;
        double radioCirculo;
        double areaCirculo;

        //MENU
        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar\n");

        System.out.print("Elija una opción: ");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            System.out.println("\nHa seleccionado calcular el área de un cuadrado...");

            //PIDO DATOS
            System.out.println("\nIntroduzca uno de los lados del cuadrado");
            ladoCuadrado = entrada.nextDouble();

            //CALCULO EL AREA
            areaCuadrado = ladoCuadrado * ladoCuadrado;

            //MUESTRO DATOS
            System.out.println("El area del cuadrado es " + areaCuadrado);

        } else {

            if (opcion == 2) {
                System.out.println("\nHa seleccionado calcular el área de un triángulo...");

                //PIDO DATOS
                System.out.println("\nIntroduzca la base");
                baseTriangulo = entrada.nextDouble();
                System.out.println("\nIntroduzca la altura");
                alturaTriangulo = entrada.nextDouble();

                //CALCULO EL AREA
                areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;

                //MUESTRO DATOS
                System.out.println("El area del triangulo es " + areaTriangulo);

            } else {
                if (opcion == 3) {
                    System.out.println("\nHa seleccionado calcular el área de un círculo...");
                    //PIDO DATOS base por altura /2

                    System.out.println("\nIntroduzca el radio del Circulo");
                    radioCirculo = entrada.nextDouble();
                    //CALCULO EL AREA

                    areaCirculo = (Math.PI * (radioCirculo * radioCirculo));
                    //MUESTRO DATOS

                    System.out.printf("El area del circulo es %.2f", areaCirculo);

                } else {

                    System.out.println("\nHa seleccionado terminar");
                }
            }
        }
    }
}
