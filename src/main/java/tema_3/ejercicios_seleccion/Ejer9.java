package tema_3.ejercicios_seleccion;

/**
 *
 * @author alvaro
 */
public class Ejer9 {

    public static void main(String[] args) {
        int variable = 3, variable2;
        switch (variable) {

            case 1:
                variable2 = 5;
                break;
            case 2:
                variable2 = 20;
                break;
            case 3:
                variable2 = 30;
            case 4:
                variable2 = 10;
            default:
                variable2 = 100;
                break;
        }
        //LA VARIABLE DOS VALE 100
    }
}
