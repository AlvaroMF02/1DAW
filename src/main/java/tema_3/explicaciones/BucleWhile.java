package tema_3.explicaciones;

import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class BucleWhile {

    public static void main(String[] args) {
        
        
        //INICIALIZACION DE LA VARIABLE DE CONTROL
        int numero = 0;

        //***********************************************
        //*********************WHILE*********************
        //***********************************************
        
        while (numero <= 10) {
            //SIEMPRE DENTRO, HAY Q ACTUALIZAR LA VARIABLE D CONTROL
            System.out.println(numero);
            numero++;
        }

        System.out.println("*************************************");
        
        //DEL 20 AL 0
        numero = 20;
        while (numero >= 0) {
            System.out.println(numero);
            numero--;
        }

        //50 a 70 de 3 en 3
        
        numero = 50;
        while (numero<=70) {            
            System.out.println(numero);
            numero+=3;
        }
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un numero entre 100 y 200");
        int num= teclado.nextInt();
        
        while (num<100 || num>200) {            
            System.out.println("TE HAS EQUIVOCADO");
            System.out.println("intentalo otra vez");
            num = teclado.nextInt();
        }
        
        
        
    }
}
