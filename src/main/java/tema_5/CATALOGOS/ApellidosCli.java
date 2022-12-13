package tema_5.CATALOGOS;

import java.util.Random;

/**
 *
 * @author alvaro
 */
public enum ApellidosCli {

    MARTINEZ, FLORES, SANCHEZ, CARMONA, RAMIREZ, CASTILLA;

    public static ApellidosCli getAleatorio() {
        Random alea = new Random();

        ApellidosCli[] apellidos = ApellidosCli.values();

        int posicionAlea = alea.nextInt(0, apellidos.length);

        return apellidos[posicionAlea];
    }

}
