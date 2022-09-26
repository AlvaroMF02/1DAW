package tema_2.ejercicios_de_introduccion;

/**
 *
 * @author alvaro
 */
public class ejer2 {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        double d = 4.5;
        double e = 5.7;
        double f = 6.9;

        System.out.println("Variables de tipo int: " + a + ", " + b + ", " + c);
        System.out.println("Variables de tipo double: " + d + ", " + e + ", " + f);

        //cambiamos las variables
        b = c;
        c = a;
        a = b;

        System.out.println("DESPUES DE LOS CAMBIOS: \n"
                + "a=" + a + "\n"                                                                                                                                                                                                                                                                                                                                                                          
                + "b=" + b + "\n"
                + "c=" + c);

    }
}
