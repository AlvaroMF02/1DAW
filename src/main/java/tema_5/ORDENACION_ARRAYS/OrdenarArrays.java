package tema_5.ORDENACION_ARRAYS;

import java.util.Arrays;

/**
 *
 * @author alvaro
 */
public class OrdenarArrays {

    public static void main(String[] args) {

        //METODO BURBUJA
        int numeros[] = {6, 5, 3, 1, 2};
        int tmp;
        //METODO BURBUJA
        for (int i = 0; i < numeros.length - 1; i++) {

            for (int j = i + 1; j < numeros.length; j++) {

                if (numeros[i] > numeros[j]) {
                    tmp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = tmp;
                }
            }
        }
        System.out.println("Ordenado con burbuja: ");
        for (int i : numeros) {
            System.out.print(i + ", ");
        }
        
        
        
        
        

        //METODO SORT CLASE ARRAYS
        int[] array = {3, 2, 1, 9};
        System.out.println("\nOrdenado con metodo sort: ");
        Arrays.sort(array);
        for (int i : array) {
            System.out.print(i + ", ");
        }

    }
}
