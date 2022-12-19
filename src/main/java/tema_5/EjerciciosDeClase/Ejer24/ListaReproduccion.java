package tema_5.EjerciciosDeClase.Ejer24;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alvaro
 */
public class ListaReproduccion {
    
    List <Cancion> lista;

    //CONSTRUCTOR
    public ListaReproduccion(int tamanio) {
        
        tamanyo = Math.abs(tamanyo);

        this.lista = new ArrayList<>(tamanyo);

        //RELLENAR EL ARRAY CON LOS VALORES ALEATORIOS DE LA CLASE CLIENTE
        for (int i = 0; i < this.lista.size(); i++) {
            this.lista.add(new Cliente());
        }
    }
    
    
    
    
}
