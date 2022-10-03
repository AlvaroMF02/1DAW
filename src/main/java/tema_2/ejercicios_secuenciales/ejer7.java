package tema_2.ejercicios_secuenciales;

import javax.swing.JOptionPane;

/**
 *
 * @author alvaro
 */
public class ejer7 {

    public static void main(String[] args) {
        //VARIABLES
        double euros;
        String eurosString;
        final double VALORDOLAR = 0.98;
        double dolares;

        eurosString = JOptionPane.showInputDialog("¿Cuántos € quieres pasar a $?");
        euros = Integer.parseInt(eurosString);

        //€ A $
        dolares = euros * VALORDOLAR;

        JOptionPane.showMessageDialog(null, euros + "€ son " + dolares + "$");
    }
}
