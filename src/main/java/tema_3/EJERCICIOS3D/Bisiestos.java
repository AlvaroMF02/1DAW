package tema_3.EJERCICIOS3D;

import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class Bisiestos {

    public static void main(String[] args) {
        //BUCLE HASTA Q EL USUARIO META UN 0
        //SI INTRODUCE UN AÑO NEGATIVO SE PONE POSITIVO
        //SI NO ES CERO Y POSITIVO NOS TIENE QUE DECIR SI ES BISESTO O NO

        //PARA Q SEA BISISESTO TIENE Q SER DIVISIBLE POR 4
        //Y NO DIVISIBLE POR CIEN O DIVISIBLE POR 400
        Scanner teclado = new Scanner(System.in);

        //VARIABLE
        int anio;

        //BUCLE PARA LA SALIDA DEL PROGRAMA
        do {
            System.out.println("INDICA UN AÑO");
            anio = teclado.nextInt();

            if (anio == 0) {
                break;
            }

            //CONVERTIR EL AÑO NEGATIVO A POSITIVO
            if (anio < 0) {
                anio = anio * -1;
            }

            //CALCULAR SI ES BISIESTO
            if (anio % 4 == 0 && !(anio % 100 != 0 || anio % 400 != 0)) {
                System.out.println(anio + " es bisiesto");
            } else {
                System.out.println(anio + " no es bisiesto");
            }

        } while (anio != 0);

        System.out.println("INDICA UN AÑO");
        anio = teclado.nextInt();

    }
}
