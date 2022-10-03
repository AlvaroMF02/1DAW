package tema_2.ejercicios_secuenciales;

import javax.swing.JOptionPane;

/**
 *
 * @author alvaro
 */
public class ejer5 {

    public static void main(String[] args) {
        //pide numero de grupos teniendo en cuenta que son 30h a la semana
        //averiguar el nº de profesores pidiendo las horas 

        //VARIABLES
        int cantidadGrupos;
        String cantidadGruposString;
        int horasProfesor;
        String horasProfesorString;
        int profesNecesarios;
        final int horasSemanalesTotal;

        cantidadGruposString = JOptionPane.showInputDialog("Indica la cantidad de grupos que hay");
        cantidadGrupos = Integer.parseInt(cantidadGruposString);

        //CALCULO DE LAS HORAS TOTALES A LA SÉMANA
        horasSemanalesTotal = cantidadGrupos * 30;
        JOptionPane.showMessageDialog(null, "Al ser " + cantidadGrupos + " grupos, habrá " + horasSemanalesTotal + " horas semanales");

        horasProfesorString = JOptionPane.showInputDialog("Escribe las horas que imparte cada profesor semanalmente");
        horasProfesor = Integer.parseInt(horasProfesorString);

        profesNecesarios = horasSemanalesTotal / horasProfesor;

        JOptionPane.showMessageDialog(null, "Se deberían de contratar " + profesNecesarios + " profes");

    }
}
