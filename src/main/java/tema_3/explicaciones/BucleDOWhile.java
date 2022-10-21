package tema_3.explicaciones;

import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class BucleDOWhile {
    public static void main(String[] args) {
        //***********************************************
        //*********************DO-WHILE******************
        //***********************************************
        
        int numero = 0;
        
        do {
            System.out.println(numero);
            numero++;
            
        } while (numero<=10);
        
        System.out.println("****************************");
        System.out.println("****************************");
        //de 10 a 0
        numero = 10;
        do {
            System.out.println(numero);
            numero--;
            
        } while (numero>=0);
        
        
        System.out.println("****************************");
        System.out.println("****************************");
        
        Scanner teclado = new Scanner(System.in);
        int valor;
        do {
            System.out.println("INDIQUE UN VALOR ENTRE 100 Y 200");
            valor = teclado.nextInt();
            
        } while (valor < 100 || valor >200);
       
    }
}
