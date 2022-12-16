package tema_5.CATALOGOS_sin_acabar;

import java.util.Random;

/**
 *
 * @author alvaro
 */
public enum Color {

    ROJO, NEGRO, AMARILLO, VERDE, AZUL, BLANCO;

    public static Color getAleatorio() {

        Random alea = new Random();

        Color[] colores = Color.values();

        int posicionAlea = alea.nextInt(0, colores.length);

        return colores[posicionAlea];
    }

}
