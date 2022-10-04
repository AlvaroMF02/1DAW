package tema_2.ejercicios_secuenciales;

import javax.swing.JOptionPane;

/**
 *
 * @author alvaro
 */
public class ejer11 {

    public static void main(String[] args) {
        //VARIABLES
        double radio;
        String radioString;
        double areaSemicirculo;
        double altura;
        String alturaString;
        double areaTriangulo;
        double areaTotal;

        radioString = JOptionPane.showInputDialog("Indica el radio de la figura");
        radio = Double.parseDouble(radioString);

        alturaString = JOptionPane.showInputDialog("Indica la altura de la figura");
        altura = Double.parseDouble(alturaString);

        //r = Double.parseDouble(JOptionPane.showInputDialog("¿Cuanto mide el radio del semi circulo?"));
        //OPERACIONES
        //CALCULAR AREA DEL SEMICIRCULO
        areaSemicirculo = Math.PI * (radio * 2); //cambiar exponentes Math.pow

        //CALCULAR AREA TRIANGULO
        areaTriangulo = ((radio * 2) * altura) / 2;

        //AREA TOTAL
        areaTotal = areaSemicirculo + areaTriangulo;

        JOptionPane.showMessageDialog(null, "El area de la figura es de " + Math.rint(areaTotal * 100) / 100); //quito decimales
    }
}
