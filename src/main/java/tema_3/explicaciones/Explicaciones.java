package tema_3.explicaciones;

import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class Explicaciones {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //VARIBLES
        String nombre;
        String letraBuscar;
        boolean letraContenida;
        int indice;
        String resultado;

        System.out.println("¿Como te llamas?");
        nombre = teclado.nextLine();

        System.out.println("Introduce la letra a buscar");
        letraBuscar = teclado.nextLine();

        //SI LA LETRA ESTA CONTENIDA EN EL NOMBRE MOSTRAR EL NUMERO DE 
        //CARACTERES QUE TIENE EL NOMBRE Y LA POSICION EN LA QUE ESTA LA LETRA
        //EN OTRO CASO VEREMOS SI EL NUMERO DE LETRAS ES PAR O IMPAR
        
        //sentencia booleana para ver si el nombre contiene la letra
        letraContenida = nombre.contains(letraBuscar);

        if (letraContenida) {
            System.out.println("Carácteres:" + nombre.length());
            //sumo 1 para que se vea mejor la posicion, lo mejor es quitarla 
            //por si trabajamos con la posicion
            indice = nombre.indexOf(letraBuscar) + 1;
            System.out.println("La letra " + letraBuscar + " está en la posicion "
                    + indice);
        } else {
            System.out.println("Carácteres:" + nombre.length());
            resultado = (nombre.length() % 2 == 0) ? "ES PAR" : "ES IMPAR";     //OPRERADOR TERNARIO
            System.out.println(resultado);
        }

    }
}
