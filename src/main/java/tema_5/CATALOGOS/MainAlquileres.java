package tema_5.CATALOGOS;

import java.time.LocalDate;

/**
 *
 * @author alvaro
 */
public class MainAlquileres {
    public static void main(String[] args) {
        
//        
//        Cliente c = new Cliente();
//        Vehiculo v = new Vehiculo();
        
        CatalogoVehiculos cv = new CatalogoVehiculos(5);
        CatalogoClientes cc = new CatalogoClientes(5);
        
         Vehiculo v = cv.buscarVehiculo("4");
        Cliente c = cc.buscarCliente("4");
        
        Alquiler a = new Alquiler(c, v, LocalDate.now(), 8);
        
        
       
        
        
        System.out.println(c);
        System.out.println(v);
        System.out.println(a);
        
    }
}
