package tema_5.CATALOGOS;

/**
 *
 * @author alvaro
 */
public class MainCatalogoVehiculo {

    public static void main(String[] args) {

        System.out.println("--------------------------------------");
        System.out.println("PRUEBA DE LOS METODOS CATALOGOVEHICULOS");
        System.out.println("--------------------------------------");

        //CREACION DE UN CATALOGO ALEATORIO
        CatalogoVehiculos catalogo = new CatalogoVehiculos(10);
        System.out.println("Numero de vehiculos del catalogo " + catalogo.getNumeroVehiculo());
        //MOSTRAR EL CATALOGO
        catalogo.mostrarCatalogo();
        
        //BORRAR UN VEHICULO
        System.out.println("\n##### BORRAR UN VEHICULO #####");
        catalogo.borrarVehiculo(catalogo.getListaVehiculo()[6]);
        catalogo.mostrarCatalogo();
        System.out.println("Numeros de vehiculos despues de borrar uno: " + catalogo.getNumeroVehiculo());
        
        //AÑADIR UN VEHICULO AL CATALOGO CUANDO HAY ESPACIO EN EN ARRAY
        System.out.println("\n##### AÑADIR VEHICULO EN UNA POSICION EN MEDIO #####");
        Vehiculo aux = new Vehiculo();
        catalogo.anadirVehiculo(aux);
        aux.setBastidor("12345");
        catalogo.mostrarCatalogo();
        System.out.println("Numeros de vehiculos: " + catalogo.getNumeroVehiculo());

        //AÑADIR UN VEHICULO AL CATALOGO CUANDO NO HAY ESPACIO EN EN ARRAY
        System.out.println("\n##### AÑADIR VEHICULO AL FINAL #####");
        Vehiculo aux2 = new Vehiculo();
        aux2.setBastidor("99999");
        catalogo.anadirVehiculo(aux2);
        catalogo.mostrarCatalogo();
        System.out.println("Numeros de vehiculos: " + catalogo.getNumeroVehiculo());


        //BUSCAR UN VEHICULO DEL CATALOGO
        System.out.println("\n##### BUSCAR UN VEHICULO #####");
        int posicion = catalogo.buscarVehiculo(aux);
        
        System.out.println("El vehiculo buscado se encuentra en la posicion: " + posicion);
        
    }
}
