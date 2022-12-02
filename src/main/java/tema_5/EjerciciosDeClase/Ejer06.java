package tema_5.EjerciciosDeClase;

import java.util.Arrays;

/**
 *
 * @author alvaro
 */
public class Ejer06 {
    
    public static void main(String[] args) {
        
        //ARRAYS
        int [] array1 = {1,2,3};
        int [] array2 = {1,2,3};
        int [] array3 = {1,2,3,4};
        int [] array4 = {1,2,3};
        int [] array5 = {1,2,3};
        int [] array6 = {1,2,2};
        
        
        //USANDO METODO EQUALS DE ARRAYS
        System.out.println("Comparacion array 1 y 2 : " + Arrays.equals(array1, array2));
        System.out.println("Comparacion array 1 y 3 : " + Arrays.equals(array1, array3));
        System.out.println("Comparacion array 1 y 4 : " + Arrays.equals(array1, array4));
        System.out.println("Comparacion array 1 y 5 : " + Arrays.equals(array1, array5));
        System.out.println("Comparacion array 1 y 6 : " + Arrays.equals(array1, array6));

        
        
    }
    
    //COMPARAR CADA ARRAY
    public boolean compararArrays(int [] aux){
        boolean iguales = false;
        
        
        
        
        return iguales;
    }
    
}
