package tema_2.ejercicios_secuenciales;

import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class ejer8 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //VARIABLES
        double presupuesto;
        double ginecologia;     //40%
        double traumatologia;   //30%
        double pediatria;       //30%

        System.out.println("Indique el presupuesto de este año para el hospital");
        presupuesto = teclado.nextDouble();

        //OPERACIONES
        ginecologia = presupuesto * 0.4;
        traumatologia = presupuesto * 0.3;
        pediatria = presupuesto * 0.3;

        /* HACIENDOLO CON ESTO ME DA ERROR
       
        String resultados = """
                           
                           RESULTADOS
                           Ginecología (40%) recibe %.2f
                           Traumatología (30%) recibe %.2f 
                           Pediatría (30%) recibe %.2f
                           """.formatted(ginecologia, traumatologia, pediatria);

        System.out.println(resultados);
         */
        
        //RESULTADO
        System.out.println("Ginecología (40%) recibe "+ginecologia);
        System.out.println("Traumatología (30%) recibe "+traumatologia);
        System.out.println("Pediatría (30%) recibe "+pediatria);
        
    }
}
