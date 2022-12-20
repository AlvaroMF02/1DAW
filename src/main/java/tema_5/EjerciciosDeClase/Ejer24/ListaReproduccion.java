package tema_5.EjerciciosDeClase.Ejer24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author alvaro
 */
public class ListaReproduccion {

    List<Cancion> lista;

    //CONSTRUCTOR
    public ListaReproduccion() {
        this.lista = new ArrayList<>();
        
        //RELLENAR EL CON VALORES NULOS
        for (int i = 0; i < this.lista.size(); i++) {
            this.lista.add(new Cancion());
        }
        
    }

    //DEVUELVE EL NUMERO DE CANCIONES
    public int numeroCanciones() {
        int cantidad = 0;

        cantidad = this.lista.size();

        return cantidad;
    }

    //MUESTRA SI LA LISTA ESTA VACIA
    public boolean estaVacia() {                                                //COMPROBARLO
        boolean vacia = false;

        if (numeroCanciones() == 0) {
            vacia = true;
        }

        return vacia;
    }

    //MUESTRA LA CANCION QUE INDIQUES POR EL ID                                 //COMPROBARLO
    public void escucharCancion(int id) {
        if (!estaVacia()) {
            this.lista.get(id);
        }
    }

    //CAMBIA LA CANCION POR UNA NUEVA QUE SE PASA                               //COMPROBARLO
    public void cambiarCancion(int posicion, Cancion nueva) {
        this.lista.set(posicion, nueva);
    }

    //AÑADE LA CANCION QUE LE PASE                                              //COMPROBARLO
    public void grabarCancion(Cancion nueva) {
        this.lista.add(nueva);
    }

    //ELIMINA LA CANCION QUE INDIQUES                                           //COMPROBARLO INDEX OUT OF BOUND
    public void eliminaCancion(int id) {
        this.lista.remove(id);
    }

    //ELIMINA LA CANCION QUE INDIQUES PERO CON OBJETO                           //COMPROBARLO INDEX OUT OF BOUND
    public void eliminaCancion(Cancion c) {
        this.lista.remove(c);
    }

    //MUESTRA LOS NOMBRES DE LAS CANCIONES                                      //COMPROBARLO
    public String imprimirLista(ListaReproduccion tmp) {

        String nombres = "";

        for (Cancion cancion : lista) {
            nombres += cancion.getNombre() + "\n";
        }

        return nombres;
    }

    //PASA LA POSICION DE LA CANCION QUE BUSQUES
    public int buscarCancion(Cancion c) {                                        //COMPROBAR

        int posicion = 0;

        posicion = this.lista.indexOf(c);

        return posicion;
    }

    //ORDENA LA LISTA POR EL NOMBRE                                             //COMPROBAR
    public void ordenarListaNombre() {
        Collections.sort(lista, new SortNombre());
    }

    //ORDENA LA LISTA POR EL AUTOR                                              //COMPROBAR
    public void ordenarListaAutor() {
        Collections.sort(lista, new SortAutor());
    }

    //BUSCAR CANCIONES POR LISTA
    //BUSCAR CANCIONES POR OBJETO
    //BUSCAR CANCIONES POR CRITERIOCOMPARATOR
}
