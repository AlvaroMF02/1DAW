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
        double presupGinecologia;     //40%
        double presupTraumatologia;   //30%
        double presupPediatria;       //30%

        System.out.println("Indique el presupuesto de este año para el hospital");
        presupuesto = teclado.nextDouble();

        //OPERACIONES
        presupGinecologia = presupuesto * 0.4;
        presupTraumatologia = presupuesto * 0.3;
        presupPediatria = presupuesto * 0.3;

        //RESULTADO
        String resultados = """
                           
                           RESULTADOS
                           Ginecología recibe %.2f
                           Traumatología recibe %.2f 
                           Pediatría recibe %.2f
                           """.formatted(presupGinecologia, presupTraumatologia, presupPediatria);

        System.out.println(resultados);

    }
}
