package tema_5.CATALOGOS;

import java.time.LocalDate;

/**
 *
 * @author alvaro
 */
public class MainAlquileres {

    public static void main(String[] args) {

        /*
        CLASE EMPRESA CON (CIF,NOMBRE,CATALOGOCLI,CALTALOGOVEHI,CATALOGOALQUI) el catalquiler lo crea pero en null
        METODOS: REGISRTAR CLIENTE, REGISTRAR VEHICULO, BUSCARCLIENTE(NIF), BUSCARVEHICULO(BASTIDOR)
        HACER LOS CAMBIOS DE CLIENTE EN VEHICULO
        HACER EL MAIN DE ALQUILER
        */
        
        

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
