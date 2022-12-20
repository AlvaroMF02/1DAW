package tema_5.EjerciciosDeClase.Ejer24;

import java.util.Comparator;

/**
 *
 * @author alvaro
 */


class SortAutor implements Comparator<Cancion> {
    @Override
    public int compare(Cancion a, Cancion b) {
        return a.getAutor().compareTo(b.getAutor());
    }
}
