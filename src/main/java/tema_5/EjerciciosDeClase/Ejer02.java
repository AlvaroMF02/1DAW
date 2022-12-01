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
        
        
        System.out.println("¿Cuántas personas hay?");
        cantiPerson = teclado.nextInt();
        
        int [] altura = new int[cantiPerson];
        
        for (int i = 0; i < altura.length; i++) {
            System.out.println("Indica la altura de la " + i + "º persona:");
            
            altura[i]=teclado.nextInt();
            i = Math.abs(i);
        }
        
        for (int i = 0; i < altura.length; i++) {
            total += altura[i];
        }
        
        
    }
}
