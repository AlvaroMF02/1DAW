package tema_5.OtroVejiculo;

import java.util.Arrays;

/**
 *
 * @author alvaro
 */
public class CatalogoClientes {

    private int numCliente;
    private Cliente[] listaCliente;

    public CatalogoClientes(int tamanyo) {

        tamanyo = Math.abs(tamanyo);

        this.numCliente = tamanyo;
        this.listaCliente = new Cliente[tamanyo];

        //RELLENAR EL ARRAY CON LOS VALORES ALEATORIOS DE LA CLASE CLIENTE
        for (int i = 0; i < this.listaCliente.length; i++) {
            this.listaCliente[i] = new Cliente();
        }

    }

    //GETTER
    public int getNumCliente() {
        return numCliente;
    }

    //MOSTRAR LOS CLIENTES
    public void mostrarCatal() {
        for (Cliente cli : listaCliente) {
            System.out.println(cli);
        }
    }

    //BUSCAR UN CLIENTE DEL CATALOGO
    public int buscarCliente(Cliente aux) {

        for (int i = 0; i < this.listaCliente.length; i++) {
            if (aux.equals(listaCliente[i])) {
                return i;
            }
        }
        return -1;
    }

    //BORRAR CLIENTE DEL CATALOGO
    public boolean borrarCliente(Cliente aux) {

        int posicion = buscarCliente(aux);

        if (posicion >= 0) {
            this.listaCliente[posicion] = null;
            this.numCliente--;
            return true;
        }

        return false;
    }

    //CREAR UNA COPIA CON MAS GRANDE PARA AÑADIR OTRO VEHICULO
    //SI HAY HUECO EN EL ARRAY SE INSERTA UN VEHICULO NUEVO
    public void anadirVehiculo(Cliente cli) {
        //HAY HUECO
        if (this.numCliente < this.listaCliente.length) {

            //BUSCAR EL ESPACIO EN NULL
            for (int i = 0; i < this.listaCliente.length; i++) {
                //SI HAY ESPACIO SE GUARDA EN I
                if (this.listaCliente[i] == null) {
                    this.listaCliente[i] = cli;
                    this.numCliente++;
                    break;                                              //SE GUARDA AL CLIENTE
                }
            }

        } else {  //CASO EN EL QUE EL ARRAY ESTA LLENO

            
            //this.listaCliente = Arrays.copyOf(this.listaCliente, ++this.numCliente);    //CREAO UNA COPIA DEL ARRAY PERO CON UN ESPACIO MAS QUE SE QUEDARÁ A NULL
            //CREAR UNA COPIA CON UN ESPACIO MAS
            this.listaCliente = copia();
            this.listaCliente[this.numCliente - 1] = cli;

            System.out.println("Se guarda Cliente nuevo");
        }

    }

    //TO STRING
    public String toString() {

        String tempo = "";

        for (Cliente cli : listaCliente) {
            if (cli != null) {
                tempo += cli.toString() + "\n";
            }
        }

        return tempo;
    }

    //COPIA PRIVADA 
    //PQ NO ES UNA COPIA DEL CATALOGO????
    private Cliente[] copia() {

        Cliente[] copia = new Cliente[this.numCliente + 1];

        for (int i = 0; i < this.listaCliente.length; i++) {
            copia[i] = this.listaCliente[i];
        }

        return copia;
    }

}
