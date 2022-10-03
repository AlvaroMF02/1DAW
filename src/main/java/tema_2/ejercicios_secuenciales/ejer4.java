package tema_2.ejercicios_secuenciales;

import javax.swing.JOptionPane;

/**
 *
 * @author alvaro
 */
public class ejer4 {

    public static void main(String[] args) {

        //VARIABLES
        final int PRECIOFIJO = 125; //+ 8C POR KM RECORRIDO
        double presupuestoTotal;
        double kmQueRecorre;
        String kmQueRecorreString;

        kmQueRecorreString = JOptionPane.showInputDialog("Indica los km que recorrerá el UBER");
        kmQueRecorre = Double.parseDouble(kmQueRecorreString);

        //OPERACIONES
        //COMO TODO ESTA A CENTIMOS LO PASO A EUROS DIVIDIENDO /100
        presupuestoTotal = ((kmQueRecorre * 8) + PRECIOFIJO) / 100;

        JOptionPane.showMessageDialog(null, "Tu total es de: " + presupuestoTotal + "€");

    }
}
