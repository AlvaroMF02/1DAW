package tema_2.ejercicios_de_introduccion;

/**
 *
 * @author alvaro
 */
public class ejer6 {
    public static void main(String[] args) {
        
        // a    FUNCIONA
        boolean adivina = ((83 == 'a') && false);
        System.out.println(adivina);
        
        //b     FUNCIONA YA QUE TE DA EL NUMERO QUE REPRESENTA
        int a = 'a';
        System.out.println(a);
        
        
                
        // c    NO FUNCIONA PORQUE SE INICIALIZA CON UN DECIMAL
        //int number = 2.14;
        //System.out.println(number);
        
        //d     NO FUNCIONA PORQUE SE HA ESCRITO CON LA COMA EN VEZ DE CON PUNTO
        //double pi = 3,14;
	//System.out.println(pi);
        
        
        //e     FUNCIONA PORQUE DA TRUE
        boolean test = (1==1);
	System.out.println(test);
    }
}
