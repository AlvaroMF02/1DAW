package tema_3.explicaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author alvaro
 */
public class CalculadoraSwitch {
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

        
        //OPERAICON SWITCH HECHA CON NETBEANS DE COPIAR Y PEGAR Y DARLA A LA CAMPANA
        //SUMA
        switch (opcion) {
            case "1":
                resultado = operando1 + operando2;
                System.out.printf("Resultado de la suma: %.2f", resultado);
                
                //RESTA
                break;
            case "2":
                resultado = operando1 - operando2;
                System.out.printf("Resultado de la resta: %.2f", resultado);
                
                //MULTIPLICACION    
                break;
            case "3":
                resultado = operando1 * operando2;
                System.out.printf("Resultado de la multiplicacion: %.2f", resultado);
                
                //DIVISION
                break;
            case "4":
                resultado = operando1 / operando2;
                System.out.printf("Resultado de la division: %.2f", resultado);
                break;
            default:
                JOptionPane.showMessageDialog(null, "OPCION INCORRECTA");
                break;
        }
    }
}
