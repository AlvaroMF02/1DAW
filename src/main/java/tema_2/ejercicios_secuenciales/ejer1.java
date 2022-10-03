package tema_2.ejercicios_secuenciales;

import javax.swing.JOptionPane;

/**
 *
 * @author alvaro
 */
public class ejer1 {

    public static void main(String[] args) {
        //VARIABLES
        String gradosCent;
        double gradosFareng;
        final int DIFERENCIAGRADOS = 32;

        gradosCent = JOptionPane.showInputDialog("Indica los grados Centigrados");
        gradosFareng = Double.parseDouble(gradosCent);
        JOptionPane.showMessageDialog(null, gradosCent + " grados son " + gradosFareng * DIFERENCIAGRADOS + " Farenheit");
    }
}
