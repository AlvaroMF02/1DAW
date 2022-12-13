package tema_5.CATALOGOS;

import java.util.Arrays;

/**
 *
 * @author alvaro
 */
public class CatalogoClientes {

    private int numCliente;
    private Cliente[] listaCliente;

    //CONSTRUCTOR
    public CatalogoClientes(int tamanyo) {

        tamanyo = Math.abs(tamanyo);

        this.numCliente = tamanyo;
        this.listaCliente = new Cliente[tamanyo];

        //RELLENAR EL ARRAY CON LOS VALORES ALEATORIOS DE LA CLASE CLIENTE
        for (int i = 0; i < this.listaCliente.length; i++) {
            this.listaCliente[i] = new Cliente();
        }

    }

    //GETTERS
    public int getNumCliente() {
        return numCliente;
    }
    
    //SE QUITA PARA QUE AL USARLO EN EL MAIN EL USUARIO NO VEA Q ES UN ARRAY . PRIVACIDAD
    public Cliente[] getListaCliente() {
        return listaCliente;
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
    public void borrarCliente(Cliente aux) {

        int posicion = buscarCliente(aux);

        if (posicion >= 0) {
            this.listaCliente[posicion] = null;
            this.numCliente--;
        }
    }

    //CREAR UNA COPIA CON MAS GRANDE PARA AÑADIR OTRO VEHICULO
    //SI HAY HUECO EN EL ARRAY SE INSERTA UN VEHICULO NUEVO
    public void anadirCliente(Cliente cli) {
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

            //this.listaCliente = Arrays.copyOf(this.listaCliente, ++this.numCliente);
            this.listaCliente = copia();
            this.listaCliente[this.numCliente] = cli;
            this.numCliente++;
        }

    }

    

    //COPIA PRIVADA 
    private Cliente[] copia() {

        Cliente[] copia = new Cliente[this.numCliente + 1];

        for (int i = 0; i < this.listaCliente.length; i++) {
            copia[i] = this.listaCliente[i];
        }

        return copia;
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
}
