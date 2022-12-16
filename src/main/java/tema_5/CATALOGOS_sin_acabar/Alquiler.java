package tema_5.CATALOGOS_sin_acabar;

import java.time.LocalDate;

/**
 *
 * @author alvaro
 */
public class Alquiler {

    private int idAlquiler;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private LocalDate fechaIni;
    private int duracionDias;

    private static int contador = 0;

    //CONSTRUCTOR
    public Alquiler(Cliente cliente, Vehiculo vehiculo, LocalDate fechaIni, int duracionDias) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaIni = fechaIni;
        this.duracionDias = duracionDias;
        contador++;
        this.idAlquiler = contador;
    }

    public Alquiler() {
    }
    
    

    //GETTER Y SETER
    
    public int getIdAlquiler() {
        return idAlquiler;
    }

    public void setIdAlquiler(int idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDate getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(LocalDate fechaIni) {
        this.fechaIni = fechaIni;
    }

    public int getDuracionDias() {
        return duracionDias;
    }

    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }

    //MUESTRA LOS NIF Y LOS BASTIDORES DE LOS CLIENTES Y VEHICULOS
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alquiler{");
        sb.append("idAlquiler=").append(idAlquiler);
        sb.append(", cliente=").append(cliente.getNif());
        sb.append(", vehiculo=").append(vehiculo.getBastidor());
        sb.append(", fechaIni=").append(fechaIni);
        sb.append(", duracionDias=").append(duracionDias);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + this.idAlquiler;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alquiler other = (Alquiler) obj;
        return this.idAlquiler == other.idAlquiler;
    }

}
