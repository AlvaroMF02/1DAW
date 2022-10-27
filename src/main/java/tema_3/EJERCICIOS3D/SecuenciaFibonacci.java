package tema_3.EJERCICIOS3D;

/**
 *
 * @author alvaro
 */
public class SecuenciaFibonacci {

    public static void main(String[] args) {

        final int F0 = 0;
        final int F1 = 1;
        int fn = 0;
        //fn = contador - 1 + contador - 2;

        for (int i = 0; i < 35; i++) {
            fn=F1+F0;
            
            //F1=F0;
            
            System.out.println(fn);
        }

    }
}
