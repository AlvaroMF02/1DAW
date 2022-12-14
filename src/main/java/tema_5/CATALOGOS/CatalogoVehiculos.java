package tema_5.CATALOGOS;

import java.util.Arrays;

/**
 *
 * @author alvaro
 */
public class CatalogoVehiculos {

    private int numeroVehiculo;
    private Vehiculo[] listaVehiculo;

    //CONSTRUCTOR
    public CatalogoVehiculos(int tamanyo) {

        tamanyo = Math.abs(tamanyo);

        this.numeroVehiculo = tamanyo;
        this.listaVehiculo = new Vehiculo[tamanyo];         //CREAR LA ESTRUCTURA

        //DAR VALORES
        for (int i = 0; i < this.listaVehiculo.length; i++) {
            this.listaVehiculo[i] = new Vehiculo();
        }

    }

    //DICE EL NUMERO DE VEHICULOS QUE HAY EN EL CATALOGO
    public int getNumeroVehiculo() {
        return numeroVehiculo;
    }

    //SE QUITA PARA QUE AL USARLO EN EL MAIN EL USUARIO NO VEA Q ES UN ARRAY . PRIVACIDAD
    public Vehiculo[] getListaVehiculo() {
        return listaVehiculo;
    }

    //MOSTRAR LOS VEHICULOS
    public void mostrarCatalogo() {
        for (Vehiculo v : listaVehiculo) {
            System.out.println(v);
        }

    }
    //BUSCAR UN VEHICULO DEL CATALOGO
    private int buscarVehiculo(Vehiculo v) {        //PRIVADO PQ SOLO LO UTILIZO EN EL METODO DE ABAJO

        if (v != null) {
            for (int i = 0; i < this.listaVehiculo.length; i++) {
                //CAMBIOS PARA QUE NO COJA NULLS
                if (v.equals(listaVehiculo[i] != null && v.equals(this.listaVehiculo[i]))) {
                    return i;
                }
            }
        }

        return -1;
    }

    //DEVUELVE UN CLIENTE 
    public Vehiculo buscarVehiculo(String bastidor) {

        Vehiculo aux = new Vehiculo();
        aux.setBastidor(bastidor);            //FUEZO A QUE LE CLIENTE TENGA EL BASTIDOR Q BUSCO
        int posicion = buscarVehiculo(aux);

        return (posicion >= 0) ? this.listaVehiculo[posicion] : null;
        //SI ES MAYOR O IGUAL A CERO DEVUELVE LA EL CLIENTE ENTERO
    }

    //BORRAR VEHICULO
    public boolean borrarVehiculo(Vehiculo v) {

        int pos = buscarVehiculo(v);

        if (pos >= 0) {
            this.listaVehiculo[pos] = null;
            this.numeroVehiculo--;
            return true;
        }

        return false;
    }

    //CREAR UNA COPIA CON MAS GRANDE PARA AÑADIR OTRO VEHICULO
    //SI HAY HUECO EN EL ARRAY SE INSERTA UN VEHICULO NUEVO
    public void anadirVehiculo(Vehiculo v) {
        //HAY HUECO
        if (this.numeroVehiculo < this.listaVehiculo.length) {
            //BUSCAR EL ESPACIO EN NULL
            for (int i = 0; i < this.listaVehiculo.length; i++) {
                //SI HAY ESPACIO SE GUARDA EN I
                if (this.listaVehiculo[i] == null) {
                    this.listaVehiculo[i] = v;
                    this.numeroVehiculo++;
                    //System.out.println("Se guarda vehiculo en: " + i);
                    break;
                }
            }
        } else {  //CASO EN EL QUE EL ARRAY ESTA LLENO

            //this.listaVehiculo = Arrays.copyOf(this.listaVehiculo, ++this.numeroVehiculo);    //CREO UNA COPIA DEL ARRAY PERO CON UN ESPACIO MAS QUE SE QUEDARÁ A NULL
            this.listaVehiculo = copia();
            this.listaVehiculo[this.numeroVehiculo] = v;
            this.numeroVehiculo++;
        }

    }

    //METODO COPIA
    private Vehiculo[] copia() {

        Vehiculo[] copia = new Vehiculo[this.numeroVehiculo + 1];

        for (int i = 0; i < this.listaVehiculo.length; i++) {
            copia[i] = this.listaVehiculo[i];
        }

        return copia;
    }

    //TO STRING
    public String toString() {
        String tmp = "";

        for (Vehiculo v : listaVehiculo) {

            if (v != null) {
                tmp += v.toString() + "\n";
            }

        }

        return tmp;
    }
}
