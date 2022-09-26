package tema_2.ejercicios_de_introduccion;

/**
 *
 * @author alvaro
 */
public class ejer5 {
    public static void main(String[] args) {
        //VARIABLES
        boolean  verdadero = true;
        boolean  falso = false;
        
        String resultados = """
                            RESULTADOS
                            verdadero && verdadero = %b
                            verdadero && falso = %b
                            falso && verdadero = %b
                            falso && falso = %b
                            verdadero || verdadero = %b
                            verdadero || falso = %b
                            falso || verdadero = %b
                            falso || falso = %b
                            
                            """
                .formatted(verdadero&&verdadero,verdadero&&falso,falso&&verdadero,falso && falso
                ,verdadero || verdadero,verdadero || falso,falso || verdadero,falso || falso);

        //RESULTADOS
        System.out.println(resultados);
        
        System.out.println(" !verdadero =" + !verdadero);
        System.out.println(" !falso =" + !falso);
        
        
        
    }
}
