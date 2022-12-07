package tema_5.EjerciciosVico;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class Ejer01 {

    //LEER NUMERO POR TECLADO INT
    //DECIR SI ES CAPICUA
    //PASAR EL NUMERO A STRING 
    //DE STRING A CHAR[]
    //EN UN METODO QUE RECORRA POR DELANTE Y POR DETRAS COMPARANDO SI ES CAPICUA RETURN FALSE TRUE
    //[7 1 2 2 1 7]
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        String numAString;
        boolean comprobacion;

        System.out.println("Indica el número");
        numero = teclado.nextInt();

        //PASAR NUMERO A STRING
        numAString = String.valueOf(numero);

        //ARRAY EN EL QUE SE GUARDARÁ LOS VALORES
        char[] stringAChar = new char[numAString.length()];

        //GUARDAR EL STRING EN UN ARRAY DE CHAR
        for (int i = 0; i < numAString.length(); i++) {
            stringAChar[i] = numAString.charAt(i);
        }

        comprobacion = comprobarCapicua(stringAChar);
        System.out.println("¿El número introducido es capicua?: " + comprobacion);

    }

    public static boolean comprobarCapicua(char[] aux) {

        boolean comprobacion = false;

        //CONTADOR DEL MISMO TAMAÑO Q EL ARRAY
        int contador = aux.length;
        
//        if (aux.length/2 != aux.length/2) {     HACERLO PARA IMPAR
//            
//            
//        }
        
        
        //VER SI EL ARRAY ES CAPICUA
        System.out.println(contador);
        for (int i = 0; i < aux.length; i++) {      
            
            contador--;
            
            if (aux[i] != aux[contador]) {

                comprobacion = false;
                break;

            } else {

                comprobacion = true;
            }



        }

        return comprobacion;
    }
}
