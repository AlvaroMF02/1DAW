package tema_5.BUSQUEDAS_ARRAYS;

/**
 *
 * @author alvaro
 */
public class BusquedaArrays {

    public static void main(String[] args) {

        //BUSQUEDA SECUENCIAL
        int array[] = {1,5,2,9,45,4,10};
        int indice = busquqedaSecuencial(45, array);
        System.out.println(indice);

    }

    public static int busquqedaSecuencial(int numeroBuscar, int[] array) {
        int indice = -1;

        //RECORRER EL ARRAY COMPLETO
        for (int i = 0; i < array.length; i++) {

            if (array[i] == numeroBuscar) {
                indice = i;
                break;              //PARA QUE NO SIGA
            }
        }

        return indice;
    }
}
