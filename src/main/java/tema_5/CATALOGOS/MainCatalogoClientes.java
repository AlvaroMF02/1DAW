package tema_5.CATALOGOS;

/**
 *
 * @author alvaro
 */
public class MainCatalogoClientes {

    public static void main(String[] args) {

        System.out.println("--------------------------------------");
        System.out.println("PRUEBA DE LOS METODOS CATALOGOCLIENTE");
        System.out.println("--------------------------------------");

        //CREAR CATALOGO CON 10 CLIENTES ALEEATORIOS GRACIAS A LAS CLASES ENUM CREADAS
        CatalogoClientes catalogo = new CatalogoClientes(10);
        System.out.println("Número de clientes: " + catalogo.getNumCliente());
        //MOSTRAR EL CATALOGO
        catalogo.mostrarCatal();

        //BORRAR UN CLIENTE
        System.out.println("\n--------------------------------------");
        System.out.println("##### BORRAR UN CLIENTE #####");
        System.out.println("--------------------------------------");
        catalogo.borrarCliente(catalogo.getListaCliente()[4]);
        catalogo.mostrarCatal();
        System.out.println("Numeros de clientes despues de borrar uno: " + catalogo.getNumCliente());

        //AÑADIR UN CLIENTE AL CATALOGO CUANDO HAY ESPACIO EN EN ARRAY
        System.out.println("\n--------------------------------------");
        System.out.println("##### AÑADIR CLIENTE EN UN ESPACIO #####");
        System.out.println("--------------------------------------");
        Cliente clienteNuevo = new Cliente();
        clienteNuevo.setNif("123456789");
        catalogo.anadirCliente(clienteNuevo);
        catalogo.mostrarCatal();
        System.out.println("Numeros de clientes al añadir uno nuevo: " + catalogo.getNumCliente());

        //AÑADIR UN VEHICULO AL CATALOGO CUANDO NO HAY ESPACIO EN EN ARRAY
        System.out.println("\n--------------------------------------");
        System.out.println("##### AÑADIR CLIENTE SIN ESPACIO #####");
        System.out.println("--------------------------------------");
        Cliente clienteNuevo2 = new Cliente();
        clienteNuevo.setNif("987654321");
        catalogo.anadirCliente(clienteNuevo2);
        catalogo.mostrarCatal();
        System.out.println("Numeros de clientes al añadir uno nuevo: " + catalogo.getNumCliente());

        //BUSCAR UN CLIENTE DEL CATALOGO
        System.out.println("\n--------------------------------------");
        System.out.println("##### BUSCAR CLIENTE #####");
        System.out.println("--------------------------------------");
        int posicion = catalogo.buscarCliente(clienteNuevo);
        System.out.println("El cliente buscado esta en la posicion: " + posicion);

    }
}
