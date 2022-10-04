package tema_2.ejercicios_secuenciales;

import javax.swing.JOptionPane;

/**
 *
 * @author alvaro
 */
public class ejer9 {

    public static void main(String[] args) {
        //VARIABLES
        String precioString;
        double precio;
        final double IVA = 0.21;
        double precioMasIva;

        precioString = JOptionPane.showInputDialog("Indique el precio del producto");
        precio = Double.parseDouble(precioString);

        //OPERACION
        precioMasIva = (precio * IVA) + precio;

        JOptionPane.showMessageDialog(null, "El precio más IVA es: " + precioMasIva);

    }
}
