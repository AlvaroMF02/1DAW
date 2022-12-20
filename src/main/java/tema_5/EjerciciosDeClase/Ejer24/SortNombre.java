
package tema_5.EjerciciosDeClase.Ejer24;

import java.util.Comparator;

/**
 *
 * @author alvaro
 */


class SortNombre implements Comparator<Cancion> {
    @Override
    public int compare(Cancion a, Cancion b) {
        return a.getNombre().compareTo(b.getNombre());
    }
}
