package tema_2.explicaciones;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author alvaro
 */
public class joption {
    public static void main(String[] args) {
        
        //LECTURA DE DATOS CON J OPTION
                
        //VARIABLE
        String datos;
      
        
        //LEER DATOS CON JOPTION
        datos = JOptionPane.showInputDialog("Escribe tu nombre");
        
        //MOSTRAR DATOS
        JOptionPane.showMessageDialog(null, "Tu nombre es "+ datos);
        
        
        
      
    }
}
