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
        
        //CREAR CATALOGO CON 10 CLIENTES
        CatalogoClientes catalClientes = new CatalogoClientes(10);
        
        //MOSTRAR EL CATALOGO DE LOS CLIENTES
        catalClientes.mostrarCatal();
        System.out.println("Hay " + catalClientes.getNumCliente() + " clientes");
        //System.out.println(catalClientes.toString());
        
        
        //CREO DOS CLIENTE NUEVO CON EL QUE HACER LAS PRUEBAS
        Cliente cli = new Cliente("Álvaro", "Martinez", "0987");
        Cliente cli2 = new Cliente("Lara", "Lopez", "1234");
        //SOLO ME DEJA METER DOS?????   PUEDE Q TENGA MAL HECHA LA COPIA 
        //Cliente cli3 = new Cliente("Angel", "Sanchez", "1358");
        
        
        //AÑADIR CLIENTE
        System.out.println("##### AÑADIR CLIENTE #####");
        catalClientes.anadirCliente(cli);
        catalClientes.anadirCliente(cli2);
        catalClientes.mostrarCatal();
        //CUENTA 11 COMO SI UN DEFAULT SE BORRARA Y SE METIERAN LOS DOS NUEVOS
        System.out.println("Hay " + catalClientes.getNumCliente() + " clientes");
        
        
        //BORRAR CLIENTE
        System.out.println("\n##### BORRAR UN CLIENTE #####");
        catalClientes.borrarCliente(cli);
        catalClientes.mostrarCatal();
        System.out.println("Hay " + catalClientes.getNumCliente() + " clientes");
        

        //BUSCAR CLIENTE
        System.out.println("\n##### BUSCAR UN CLIENTE #####");
        int posicion = catalClientes.buscarCliente(cli2);
        System.out.println("El cliente está ne la posicion: " + posicion); 
    }
}
