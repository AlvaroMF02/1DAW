package tema_5.EjerciciosDeClase;

import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class Ejer02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //VARIABLES
        int cantiPerson;           //CONTROLAR EXCEPCIONES
        int total = 0;
        double media;

        System.out.println("¿Cuántas personas són?");
        cantiPerson = teclado.nextInt();

        int[] altura = new int[cantiPerson];

        for (int i = 0; i < altura.length; i++) {
            System.out.println("Indica la altura de la " + (i + 1) + "º persona:");

            altura[i] = teclado.nextInt();
            i = Math.abs(i);
            total += altura[i];
        }

        //HACER LA MEDIA
        media = total / cantiPerson;
        System.out.println(media);      //LA MEDIA NO SALE EXACTA
    }
}
