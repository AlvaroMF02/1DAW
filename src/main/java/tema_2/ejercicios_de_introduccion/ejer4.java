package tema_2.ejercicios_de_introduccion;

/**
 *
 * @author alvaro
 */
public class ejer4 {
    public static void main(String[] args) {
        
        //VARIABLES
        int a = 10;
        int b = 20;
        
        
        //DECLARACIONES CON OPERACIONES
        boolean c = a<b;
        boolean d = a>b;
        boolean e = a==b;
        boolean f = a!=b;
        
        String resultados = """
                            RESULTADOS
                            a < b = %b
                            a > b = %b
                            a == b = %b
                            a != b = %b
                            """.formatted(c,d,e,f) ;
        
        
        //SALIDA POR PANTALLA
        
        System.out.println(resultados);
    }
}
