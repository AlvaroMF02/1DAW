package tema_2.ejercicios_secuenciales;

import javax.swing.JOptionPane;

/**
 *
 * @author alvaro
 */
public class ejercicioRepasoSecuencial {

    public static void main(String[] args) {
        //TIENDA EN LA QUE HAY UN % DE DESCUENTO QUE PIDAS POR PANTALLA Y LA CANTIDAD
        //EL DESCUENTO SE APLICARÁ AL TODOS LOS PRODUCTOS

        //VARIABLES
        double descuento;
        double producto;
        double productosTotal;
        int cantidad;
        String resultado;
        double descuentoTotal;
        double totalFinal;

        //PIDO DATOS 
        descuento = Double.parseDouble(JOptionPane.showInputDialog
        ("¿Qué descuento hay en la tienda?"));

        producto = Double.parseDouble(JOptionPane.showInputDialog
        ("¿Cuanto cuesta el producto que desea comprar?"));

        cantidad = Integer.parseInt(JOptionPane.showInputDialog
        ("¿Cuántos productos se ha llevado?"));
        productosTotal=cantidad*producto;
        
        //MUESTRO LOS DATOS CON LOS QUE SE VA A TRABAJAR
        JOptionPane.showMessageDialog(null,
                "Ahora se le aplicará un " + descuento + "% de descuento");

        //OPERACION
        descuentoTotal = productosTotal * (descuento / 100);
        totalFinal = productosTotal - descuentoTotal;

        resultado = """
                    *********************************************
                                COMPRA DEL DIA
                    Descuento:                              %.2f
                    Precio producto:                 %.2f
                    Cantidad:                                  %d
                    ---------------------------------------------
                    TOTAL:                                   %.2f
                    *********************************************
                    """.formatted(descuento,producto,cantidad,totalFinal);

        JOptionPane.showMessageDialog(null, resultado);

    }
}
