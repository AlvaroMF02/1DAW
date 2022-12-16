package tema_5.CATALOGOS_sin_acabar;

import java.util.Random;

/**
 *
 * @author alvaro
 */
public enum NombresClie {
    
    ALVARO, ANGEL, FRAN, CRISTINA, VICKI, ANA;
    
    
    public static NombresClie getAleatorio(){
        
        Random alea = new Random();
        
        NombresClie [] nombres = NombresClie.values();
        
        int posicionAlea = alea.nextInt(0,nombres.length);
        
        return nombres[posicionAlea];
    }
}
