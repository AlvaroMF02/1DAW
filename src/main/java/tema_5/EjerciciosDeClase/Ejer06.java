package tema_5.EjerciciosDeClase;

import java.util.Arrays;

/**
 *
 * @author alvaro
 */
public class Ejer06 {

    public static void main(String[] args) {

        //ARRAYS
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {1, 2, 3, 4};
        int[] array4 = {1, 2, 3};
        int[] array5 = {1, 2, 3};
        int[] array6 = {1, 2, 2};

        //USANDO METODO EQUALS DE ARRAYS
        System.out.println("Comparacion array 1 y 2 : " + Arrays.equals(array1, array2));
        System.out.println("Comparacion array 1 y 3 : " + Arrays.equals(array1, array3));
        System.out.println("Comparacion array 1 y 4 : " + Arrays.equals(array1, array4));
        System.out.println("Comparacion array 1 y 5 : " + Arrays.equals(array1, array5));
        System.out.println("Comparacion array 1 y 6 : " + Arrays.equals(array1, array6));

        
        //COMPARAR CON MI METODO
        boolean comparacion = compararArrays(array1, array2);
        System.out.println("Comparacion 1 y 2: " + comparacion);
        
        comparacion = compararArrays(array1, array3);
        System.out.println("Comparacion 1 y 3: " + comparacion);
    }

    //COMPARAR CADA ARRAY
    public static boolean compararArrays(int[] aux, int[] aux2) {
        boolean iguales = false;

        if (aux.length != aux2.length) {
            return false;
        } else {
            for (int i = 0; i < aux.length; i++) {
                if (aux[i] != aux2[i]) {
                    return false;
                } else {
                    iguales = true;
                }
            }
        }

        return iguales;
    }

}
