package tema_2.ejercicios_de_introduccion;

/**
 *
 * @author alvaro
 */
public class ejer3 {

    public static void main(String[] args) {

        //VARIABLES
        int a = 10;
        int b = 5;
        int i = 0;

        double c = 71.3;
        double d = 4.8;

        //OPERACIONES
        int resul1int = a + b;
        int resul2int = a - b;
        int resul3int = a * b;
        int resul4int = a / b;

        double resul1doub = c + d;
        double resul2doub = c - d;
        double resul3doub = c * d;
        double resul4doub = c / d;

        String resultados = """
                            RESULTADOS ENTEROS
                            a + b = %d
                            a - b = %d
                            a * b = %d
                            a / b = %d
                            
                            RESULTADOS DECIMALES
                            c + d = %.2f
                            c - d = %.2f
                            c * d = %.2f
                            c / d = %.2f
                            
                            OPERACIONES RARAS"""
                .formatted(resul1int, resul2int, resul3int, resul4int,
                         resul1doub, resul2doub, resul3doub, resul4doub);

        System.out.println(resultados);

        //OPERACIONES RARAS
        System.out.println(a *= 3);
        System.out.println(b -= 1);
        System.out.println(a /= b);
        System.out.println(c += d);
        
        System.out.println(i++);
        System.out.println(++i);

    }
}
