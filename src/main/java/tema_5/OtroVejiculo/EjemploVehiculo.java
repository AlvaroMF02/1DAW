package tema_5.OtroVejiculo;

/**
 *
 * @author alvaro
 */
public class EjemploVehiculo {

    public static void main(String[] args) {

        CatalogoVehiculos catalogo = new CatalogoVehiculos(10);
        System.out.println("Numero de vehiculos del catalogo " + catalogo.getNumeroVehiculo());

        catalogo.mostrarCatalogo();
        System.out.println("*******************************");

        System.out.println("Numeros de vehiculos antes de borrar uno: " + catalogo.getNumeroVehiculo());

        catalogo.borrarVehiculo(catalogo.getListaVehiculo()[6]);
        catalogo.mostrarCatalogo();

        System.out.println("Numeros de vehiculos despues de borrar uno: " + catalogo.getNumeroVehiculo());

//        String resultado = catalogo.toString();
//        System.out.println(resultado);
        System.out.println("AÑADIR VEHICULO EN UNA POSICION EN MEDIO");
        Vehiculo aux = new Vehiculo();
        catalogo.anadirVehiculo(aux);
        aux.setBastidor("12345");
        catalogo.mostrarCatalogo();
        System.out.println("Numeros de vehiculos: " + catalogo.getNumeroVehiculo());

        System.out.println("AÑADIR VEHICULO AL FINAL");
        Vehiculo aux2 = new Vehiculo();
        aux2.setBastidor("99999");
        catalogo.anadirVehiculo(aux2);
        catalogo.mostrarCatalogo();
        System.out.println("Numeros de vehiculos: " + catalogo.getNumeroVehiculo());
    }
}
