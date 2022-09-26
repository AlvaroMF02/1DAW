package tema_2.ejercicio_repaso_repe;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class Prueba {

    public static void main(String[] args) {

        /*
        //hacer que se metan los datos solos
        Scanner teclado = new Scanner(System.in);
        
        //INGRESAR DATOS
        for (int i = 0; i < 3; i++) {
            System.out.println("Indique sus datos de teléfono"); 
            
        }
        
        */
        ArrayList<Llamadas> listaLlamadas = new ArrayList();

        //asignacion de datos a las llamadas a mano
        Llamadas llamada1 = new Llamadas("002", "685214677", "325235874", LocalDateTime.of(2022, 3, 14, 15, 00), LocalDateTime.of(2022, 3, 14, 16, 3));
        Llamadas llamada2 = new Llamadas("023", "623584677", "369588741", LocalDateTime.of(2022, 4, 6, 2, 15), LocalDateTime.of(2022, 4, 6, 2, 30));
        Llamadas llamada3 = new Llamadas("034", "685211258", "125488741", LocalDateTime.of(2022, 9, 22, 22, 30), LocalDateTime.of(2022, 9, 22, 16, 00));

        //meter las llamadas en una lista
        listaLlamadas.add(llamada1);
        listaLlamadas.add(llamada2);
        listaLlamadas.add(llamada3);

        //metodo para ver la duracion de la llamada
        //llamada1.calcularTiempo(LocalDateTime.MIN, LocalDateTime.MIN)
    }
}
