package tema_5.OtroVejiculo;

/**
 *
 * @author alvaro
 */
public class EjemploVehiculo {
    
    public static void main(String[] args) {
        
        CatalogoVehiculosBorrarBuscar catalogo = new CatalogoVehiculosBorrarBuscar(10);
        
        
        catalogo.mostrarCatalogo();
        System.out.println("*******************************");
        
        catalogo.borrarVehiculo(catalogo.getListaVehiculo()[6]);
        catalogo.mostrarCatalogo();
        
        
    }
}
