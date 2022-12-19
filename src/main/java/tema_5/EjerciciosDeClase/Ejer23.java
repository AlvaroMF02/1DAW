package tema_5.EjerciciosDeClase;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author alvaro
 */
public class Ejer23 {

    public static void main(String[] args) {

        Random alea = new Random();
        int cantidadLista1;
        int cantidadLista2;
        int numRandom;

        //CREAR DOS LISTAS DE INTEGER
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();

        //CANTIDAD DE ELEMENTOS ENTRE 5 Y 15 EN LISTA 1
        cantidadLista1 = alea.nextInt(5, 15 + 1);

        
        //CANTIDAD DE ELEMENTOS ENTRE 10 Y 20 EN LISTA 2
        cantidadLista2 = alea.nextInt(10, 20 + 1);

        
        //AGREGAR NUMEROS ENTRE 50 Y 100
        //LISTA 1
        for (int i = 0; i < cantidadLista1; i++) {
            numRandom = alea.nextInt(50, 100 + 1);
            //RELLENAR LISTA
            lista1.add(numRandom);
        }

        //LISTA 2
        for (int i = 0; i < cantidadLista2; i++) {
            numRandom = alea.nextInt(50, 100 + 1);
            //RELLENAR LISTA
            lista2.add(numRandom);
        }

        //MOSTRAR LISTAS
        System.out.println("Lista 1:");
        mostrarLista(lista1);
        System.out.println("\nLista 2:");
        mostrarLista(lista2);

        //CREAR LISTA 3 CON ELEMENTOS DE LA LISTA 1 Y QUE NO ESTEN EN LA LISTA 2    SIGUE SALIENDO ERROR
        ArrayList<Integer> lista3 = new ArrayList<>();

        for (int i = 0; i < lista1.size(); i++) {

            if (!lista1.contains(lista2.get(i))) {
                lista3.add(lista1.get(i));
            }
        }
        System.out.println("\nLista 3:");
        mostrarLista(lista3);
        
        
        //CREAR LISTA 4 CON ELEMENTOS PARES DE LISTA 1 E IMPARES DE LISTA 2
        ArrayList<Integer> lista4 = new ArrayList<>();
        
        for (int i = 0; i < lista1.size(); i++) {

            if (lista1.get(i) % 2 == 0) {
                lista4.add(lista1.get(i));
            }
        }
        
        for (int i = 0; i < lista2.size(); i++) {

            if (lista2.get(i) % 2 != 0) {
                lista4.add(lista2.get(i));
            }
        }
        System.out.println("\nLista 4:");
        mostrarLista(lista4);
    }

    //IMPRIMIR LISTAS
    public static void mostrarLista(ArrayList lista) {
        for (Object lis : lista) {
            System.out.print(lis +" - ");
        }
                
    }
}
