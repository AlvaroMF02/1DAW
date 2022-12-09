package tema_5.OtroVejiculo;

/**
 *
 * @author alvaro
 */
public class CatalogoVehiculosBorrarBuscar {
    
    private int numeroVehiculo;
    private Vehiculo[] listaVehiculo;

    public CatalogoVehiculosBorrarBuscar(int tamanyo) {
        
        tamanyo = Math.abs(tamanyo);
        
        this.numeroVehiculo = tamanyo;
        this.listaVehiculo = new Vehiculo[tamanyo];         //CREAR LA ESTRUCTURA
        
        //DAR VALORES
        for (int i = 0; i < this.listaVehiculo.length; i++) {
            this.listaVehiculo[i] = new Vehiculo();
        }
        
    }

    public int getNumeroVehiculo() {
        return numeroVehiculo;
    }

    public Vehiculo[] getListaVehiculo() {
        return listaVehiculo;
    }
    
    
    public void mostrarCatalogo(){
        for (Vehiculo v : listaVehiculo) {
            System.out.println(v);
        }
        
    }
    
    public int buscarVehiculo(Vehiculo v){
        for (int i = 0; i < this.listaVehiculo.length; i++) {
            if (v.equals(listaVehiculo[i])) {
                return i;
            }
        }
        
        return -1;
    }
    
    
    
    public void borrarVehiculo(Vehiculo v){
        
        int pos = buscarVehiculo(v);
        
        if (pos >= 0) {
            this.listaVehiculo[pos] = null;
        }
        
    }
    
    
}
