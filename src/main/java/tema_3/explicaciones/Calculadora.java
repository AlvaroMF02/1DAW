package tema_3.explicaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author alvaro
 */
public class Calculadora {

    public static void main(String[] args) {

        double operando1;
        double operando2;
        double resultado;
        String menu;
        String opcion;

        operando1 = Double.parseDouble(JOptionPane.showInputDialog
        ("Introduce el operando 1"));

        operando2 = Double.parseDouble(JOptionPane.showInputDialog
        ("Introduce el operando 2"));

        menu = """
                   ****************************
                   CALCULADORA
                   ****************************
                   1- SUMA
                   2- RESTA
                   3- MULTIPLICACION
                   4- DIVISION
                   ****************************
                   """;
        opcion = JOptionPane.showInputDialog(menu);

            //SUMA
        if (opcion.equals("1")) {
            resultado = operando1 + operando2;
            System.out.printf("Resultado de la suma: %.2f", resultado);

            //RESTA
        } else if (opcion.equals("2")) {
            resultado = operando1 - operando2;
            System.out.printf("Resultado de la resta: %.2f", resultado);

            //MULTIPLICACION    
        } else if (opcion.equals("3")) {
            resultado = operando1 * operando2;
            System.out.printf("Resultado de la multiplicacion: %.2f", resultado);

            //DIVISION
        } else if (opcion.equals("4")) {
            resultado = operando1 / operando2;
            System.out.printf("Resultado de la division: %.2f", resultado);

        }else{
            JOptionPane.showMessageDialog(null, "OPCION INCORRECTA");
        }
    }
}
