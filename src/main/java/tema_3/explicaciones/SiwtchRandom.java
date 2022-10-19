package tema_3.explicaciones;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class SiwtchRandom {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random generador = new Random();

        //SI EL USUARIO INTRODUCE A, B, O C SE DEBE GUARDAR UN ALEA ENTR 1 Y 10
        //SI INTRODUCE D, GUARDAR ALEA ENTRE 11 Y 25
        //SI INTRODUCE E, ALEA ENTRE 26 Y 33
        //EN OTRO CASE EL ALEA ESTARA ENTRE 34 Y 100
        String letra;
        int alea;

        
        System.out.println("****************************************");
        System.out.println("PRUEBAS");
        //GENERAR NUMERO ALEATORIO
        alea=generador.nextInt();
        System.out.println("El numero es:"+alea );
        
        //GENERAR NUMERO ALEATORIO ENTRE UN RANGO
        //0-9
        alea=generador.nextInt(10);
        System.out.println("El numero es:"+alea );
        
        //GENERAR NUMERO ALEATORIO ENTRE UN RANGO
        //1-19
        alea=generador.nextInt(19)+1;
        System.out.println("El numero es:"+alea );

        //GENERAR NUMERO ALEATORIO ENTRE UN RANGO
        //12-18
        alea=generador.nextInt(7)+12;           //(mayor - menor + 1) + menor
        System.out.println("El numero es:"+alea );
        
        System.out.println("****************************************");
        
        
        
        
        System.out.println("Introduce una letra (A, B, C, D o E)");
        letra = teclado.nextLine();

        switch (letra) {
            case "A","B","C" -> {//1-10
                alea = generador.nextInt(10) + 1;
                System.out.println("El numero es:" + alea);
            }
            case "D" -> {//11-25
                alea = generador.nextInt(15) + 11;
                System.out.println("El numero es:" + alea);
            }
            case "E" -> {//26-33
                alea = generador.nextInt(8) + 26;
                System.out.println("El numero es:" + alea);
            }
            default -> {//34-100
                alea = generador.nextInt(67) + 34;
                System.out.println("El numero es:" + alea);
            }
        }

    }
}
