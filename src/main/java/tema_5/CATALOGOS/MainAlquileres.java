package tema_5.CATALOGOS;

import java.time.LocalDate;

/**
 *
 * @author alvaro
 */
public class MainAlquileres {

    public static void main(String[] args) {

System.out.println("--------------------------------------");
        System.out.println("PRUEBA DE LOS METODOS CATALOGOALQUILERES");
        System.out.println("--------------------------------------");
        
        //CREAR CATALOGO CON 10 CLIENTES ALEEATORIOS GRACIAS A LAS CLASES ENUM CREADAS
        CatalogoAlquiler catalogo = new CatalogoAlquiler(10);
        System.out.println("Número de alquileres: " + catalogo.getNumAlquiler());
        //MOSTRAR EL CATALOGO
        catalogo.mostrarCatal();
        
        //COPIAR DE UN RANDOM :)
        CatalogoVehiculos cv = new CatalogoVehiculos(5);
        CatalogoClientes cc = new CatalogoClientes(5);

        Vehiculo v = cv.buscarVehiculo("3");
        Cliente c = cc.buscarCliente("4");

        Alquiler a = new Alquiler(c, v, LocalDate.now(), 8);
        System.out.println(a);

        CatalogoAlquiler ca = new CatalogoAlquiler(10);
        System.out.println(ca);

    }
}
