package tema_5.OtroVejiculo;

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
