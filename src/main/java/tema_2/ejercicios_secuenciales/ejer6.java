package tema_2.ejercicios_secuenciales;

import javax.swing.JOptionPane;

/**
 *
 * @author alvaro
 */
public class ejer6 {
    //FALTA REDUCIR LOS DECIMALES

    public static void main(String[] args) {

        //VARIABLES
        double inversionP1;
        String inversionP1String;
        double porcentajeInv1;
        double inversionP2;
        String inversionP2String;
        double porcentajeInv2;
        double inversionP3;
        String inversionP3String;
        double porcentajeInv3;

        double inversionTotal;

        inversionP1String = JOptionPane.showInputDialog("¿Cuámto vas a invertir? P1");
        inversionP1 = Integer.parseInt(inversionP1String);

        inversionP2String = JOptionPane.showInputDialog("¿Cuámto vas a invertir? P2");
        inversionP2 = Integer.parseInt(inversionP2String);

        inversionP3String = JOptionPane.showInputDialog("¿Cuámto vas a invertir? P3");
        inversionP3 = Integer.parseInt(inversionP3String);

        //OPERACIONES
        //CALCULAR CUANTO SERÍA EL 1% PARA HACER UNA REGLA DE 3
        inversionTotal = inversionP1 + inversionP2 + inversionP3;
        double unoPorciento = inversionTotal / 100;

        //REGLA DE 3
        porcentajeInv1 = inversionP1 / unoPorciento;
        porcentajeInv2 = inversionP2 / unoPorciento;
        porcentajeInv3 = inversionP3 / unoPorciento;

        JOptionPane.showMessageDialog(null, "La persona 1 ha invertido un " + porcentajeInv1 + "% \n"
                + "La persona 2 ha invertido un " + porcentajeInv2 + "% \n"
                + "La persona 3 ha invertido un " + porcentajeInv3);

    }
}
