package tema_2.ejercicios_secuenciales;

import javax.swing.JOptionPane;

/**
 *
 * @author alvaro
 */
public class ejer10 {

    public static void main(String[] args) {
        //VARIABLES
        String ladoAString;
        double ladoA;
        String ladoBString;
        double ladoB;
        String ladoCString;
        double ladoC;
        double area;
        
        ladoAString = JOptionPane.showInputDialog("Indica los metros del lado A");
        ladoA = Double.parseDouble(ladoAString);
        
        ladoBString = JOptionPane.showInputDialog("Indica los metros del lado B");
        ladoB = Double.parseDouble(ladoBString);
        
        ladoCString = JOptionPane.showInputDialog("Indica los metros del lado C");
        ladoC = Double.parseDouble(ladoCString);

        //OPERACIONES
        //AREA TRAPECIO RECTANGULO = b*((a+c)/2)
        area = ladoB * ((ladoA + ladoC) / 2);
        
        JOptionPane.showMessageDialog(null, "El area es de " + area + "m");
        
    }
}
