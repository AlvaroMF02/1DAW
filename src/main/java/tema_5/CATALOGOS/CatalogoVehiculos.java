package tema_5.CATALOGOS;

import java.util.Arrays;

/**
 *
 * @author alvaro
 */
public class CatalogoVehiculos {

    private int numeroVehiculo;
    private Vehiculo[] listaVehiculo;

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

    public void mostrarCatalogo() {
        for (Vehiculo v : listaVehiculo) {
            System.out.println(v);
        }

    }

    public int buscarVehiculo(Vehiculo v) {
        //BUSQUEDA SECUENCIAL
        for (int i = 0; i < this.listaVehiculo.length; i++) {
            if (v.equals(listaVehiculo[i])) {
                return i;
            }
        }

        return -1;
    }

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
                    System.out.println("Se guarda vehiculo en: " + i);
                    break;
                }
            }
        } else {  //CASO EN EL QUE EL ARRAY ESTA LLENO

            this.listaVehiculo = Arrays.copyOf(this.listaVehiculo, ++this.numeroVehiculo);    //CREO UNA COPIA DEL ARRAY PERO CON UN ESPACIO MAS QUE SE QUEDARÁ A NULL

            this.listaVehiculo[this.numeroVehiculo - 1] = v;

            System.out.println("Se guarda vehiculo nuevo");
        }

    }

    public String toString() {
        String tmp = "";

        for (Vehiculo v : listaVehiculo) {

            if (v != null) {
                tmp += v.toString() + "\n";
            }

        }

        return tmp;
    }

    //METODO COPIA
    private Vehiculo[] copia() {

        Vehiculo[] copia = new Vehiculo[this.numeroVehiculo + 1];

        for (int i = 0; i < this.listaVehiculo.length; i++) {
            copia[i] = this.listaVehiculo[i];
        }

        return copia;
    }

}
