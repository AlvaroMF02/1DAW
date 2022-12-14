package tema_5.CATALOGOS;

import java.util.Arrays;

/**
 *
 * @author alvaro
 */
public class CatalogoAlquiler {

    private int numAlquiler;
    private Alquiler[] listaAlquileres;

    //CONSTRUCTOR
    public CatalogoAlquiler(int tamanyo) {
        tamanyo = Math.abs(tamanyo);
        this.numAlquiler = 0;
        this.listaAlquileres = new Alquiler[tamanyo];
    }

    public CatalogoAlquiler() {
    }

    //GETTERS
    public int getNumAlquiler() {
        return numAlquiler;
    }

    //SE QUITA PARA QUE AL USARLO EN EL MAIN EL USUARIO NO VEA Q ES UN ARRAY . PRIVACIDAD
    public Alquiler[] getListaAlquiler() {
        return listaAlquileres;
    }

    //MOSTRAR LOS CLIENTES
    public void mostrarCatal() {
        for (Alquiler cli : listaAlquileres) {
            System.out.println(cli);
        }
    }

    //BUSCAR UN CLIENTE DEL CATALOGO
    private int buscarAlquiler(Alquiler aux) {        //PRIVADO PQ SOLO LO UTILIZO EN EL METODO DE ABAJO

        if (aux != null) {
            for (int i = 0; i < this.listaAlquileres.length; i++) {
                //CAMBIOS PARA QUE NO COJA NULLS
                if (aux.equals(listaAlquileres[i] != null && aux.equals(this.listaAlquileres[i]))) {
                    return i;
                }
            }
        }

        return -1;
    }

    //DEVUELVE UN CLIENTE 
    public Alquiler buscarAlquiler(int id) {

        Alquiler aux = new Alquiler();
        aux.setIdAlquiler(id);            //FUEZO A QUE LE CLIENTE TENGA EL NIF Q BUSCO
        int posicion = CatalogoAlquiler.this.buscarAlquiler(aux);

        return (posicion >= 0) ? this.listaAlquileres[posicion] : null;
        //SI ES MAYOR P IGUAL A CERO DEVUELVE LA EL CLIENTE ENTERO
    }

    //BORRAR CLIENTE DEL CATALOGO
    public void borrarAlquiler(Alquiler aux) {

        int posicion = CatalogoAlquiler.this.buscarAlquiler(aux);

        if (posicion >= 0) {
            this.listaAlquileres[posicion] = null;
            this.numAlquiler--;
        }
    }

    //CREAR UNA COPIA CON MAS GRANDE PARA AÑADIR OTRO VEHICULO
    //SI HAY HUECO EN EL ARRAY SE INSERTA UN VEHICULO NUEVO
    public void anadirAlquiler(Alquiler alq) {
        //HAY HUECO
        if (this.numAlquiler < this.listaAlquileres.length) {

            //BUSCAR EL ESPACIO EN NULL
            for (int i = 0; i < this.listaAlquileres.length; i++) {
                //SI HAY ESPACIO SE GUARDA EN I
                if (this.listaAlquileres[i] == null) {
                    this.listaAlquileres[i] = alq;
                    this.numAlquiler++;
                    break;                                              //SE GUARDA AL CLIENTE
                }
            }

        } else {  //CASO EN EL QUE EL ARRAY ESTA LLENO

            //this.listaCliente = Arrays.copyOf(this.listaCliente, ++this.numCliente);
            this.listaAlquileres = copia();
            this.listaAlquileres[this.numAlquiler] = alq;
            this.numAlquiler++;
        }

    }

    //COPIA PRIVADA 
    private Alquiler[] copia() {

        Alquiler[] copia = new Alquiler[this.numAlquiler + 1];

        for (int i = 0; i < this.listaAlquileres.length; i++) {
            copia[i] = this.listaAlquileres[i];
        }

        return copia;
    }

    //TO STRING
    public String toString() {

        String tempo = "";

        for (Alquiler cli : listaAlquileres) {
            if (cli != null) {
                tempo += cli.toString() + "\n";
            }
        }

        return tempo;
    }
}
