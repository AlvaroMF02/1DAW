package tema_2.explicaciones;

import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class Prueba {

    public static void main(String[] args) {

        //VARIABLES
        final int VELOCIDAD = 8;
        final double MINUTOS_HORA = 60.0;

        int minutosCorriendo;
        double distanciaRecorrida;

        
        //ENTRADA DE DATOS POR TECLADO
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce los min que está corriendo");
        minutosCorriendo = teclado.nextInt();
        
        System.out.println("Introduce la distancia recorrida");
        distanciaRecorrida = teclado.nextDouble();
        
        
        System.out.println("Has recorrido " + distanciaRecorrida + " km en "+ minutosCorriendo + " minutos");
        
        
        //OPERACIONES
        distanciaRecorrida = minutosCorriendo/MINUTOS_HORA*VELOCIDAD;
        
        System.out.println("La distancia recorrida es de " + distanciaRecorrida);
        
        
    }
}
