package tema_2.ejercicios_de_introduccion;

import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class ejer8 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        //VARIABLE
        int tiempo;
        int segundos;
        int minutos;
        int horas;
        
        //PASAR LOS SEGUNDOS A MINUTOS Y HORAS
        System.out.println("Indica el tiempo en segundos");
        tiempo = teclado.nextInt();
        
        //OPERACIONES
        horas = tiempo / 3600;
        minutos = tiempo % 60;      //cojo el resto de la division
        segundos = minutos % 60;
        
        
        System.out.println("El tiempo es de " + horas +" horas "+ minutos +" min "+ segundos +" seg");
        
    }
}
