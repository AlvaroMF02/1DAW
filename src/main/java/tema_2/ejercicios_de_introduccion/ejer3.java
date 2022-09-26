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
        int resul1int = a+b;
        int resul2int = a-b;
        int resul3int = a*b;
        int resul4int = a/b;
        
        double resul1doub = c+d;
        double resul2doub = c-d;
        double resul3doub = c*d;
        double resul4doub = c/d;
        
//        String resultados = """
//                            a+b=
//                            a-b=
//                            a*b=
//                            a/b=
//                            """;
//        System.out.println(resultados);
        
         System.out.println("RESULTADOS INT"
         +"\n a+b="+resul1int
         +"\n a-b="+resul2int
         +"\n a*b="+resul3int
         +"\n a/b="+resul4int);

         System.out.println("RESULTADOS DOUBLE"
         +"\n c+d="+resul1doub
         +"\n c-d="+resul2doub
         +"\n c*d="+resul3doub
         +"\n c/d="+resul4doub);
         
         

    }
}
