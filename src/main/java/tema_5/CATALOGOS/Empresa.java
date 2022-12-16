package tema_5.CATALOGOS;

import java.time.LocalDate;
import java.util.Objects;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author alvaro
 */
public class Empresa {

    private String cif;
    private String nombre;
    private CatalogoAlquiler catalogoAlq;
    private CatalogoVehiculos catalogoVehi;
    private CatalogoClientes catalogoCli;

    //CONSTRUCTOR
    public Empresa() {

        this.cif = RandomStringUtils.randomAlphanumeric(5);
        this.nombre = RandomStringUtils.randomAlphabetic(5);
        this.catalogoAlq = new CatalogoAlquiler(0);
        this.catalogoCli = new CatalogoClientes(10);
        this.catalogoVehi = new CatalogoVehiculos(10);
    }

    //GETTER SETTER
    public String getCif() {
        return cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CatalogoAlquiler getCatalogoAlq() {
        return catalogoAlq;
    }

    public void setCatalogoAlq(CatalogoAlquiler catalogoAlq) {
        this.catalogoAlq = catalogoAlq;
    }

    public CatalogoClientes getCatalogoCli() {
        return catalogoCli;
    }

    public void setCatalogoCli(CatalogoClientes catalogoCli) {
        this.catalogoCli = catalogoCli;
    }

    public CatalogoVehiculos getCatalogoVehi() {
        return catalogoVehi;
    }

    public void setCatalogoVehi(CatalogoVehiculos catalogoVehi) {
        this.catalogoVehi = catalogoVehi;
    }
    

    //TO STRING GRANDOTE
    public String toString() {
        String resultado = "";
        resultado = """
                    ----------------------------------------------
                    Empresa: %s
                    CIF: %s 
                    ----------------------------------------------
                    
                          ###### CATALOGO DE CLIENTES ######
                    """.formatted(this.nombre, this.cif);

        //GUARDAR CATALOGO DE CLIENTES
        for (Cliente listaCliente : this.catalogoCli.getListaCliente()) {
            resultado += listaCliente + "\n";
        }

        resultado += "\n      ###### CATALOGO DE VEHICULOS ######\n";
        //GUARDAR CATALOGO DE VEHICULOS
        for (Vehiculo listaVehiculo : this.catalogoVehi.getListaVehiculo()) {
            resultado += listaVehiculo + "\n";
        }

        resultado += "\n      ###### CATALOGO DE ALQUILERES ######\n";
        //GUARDAR CATALOGO DE ALQUILERES
        for (Alquiler listaAlquiler : this.catalogoAlq.getListaAlquiler()) {
            resultado += listaAlquiler + "\n";
        }
        resultado += "----------------------------------------------";

        return resultado;
    }

    //REGISTRAR CLIENTE
    public void registrarCliente(Cliente c) {
        this.catalogoCli.anadirCliente(c);
    }

    //BUSCAR CLIENTE
    public Cliente buscarCliente(Cliente c) {
        return this.catalogoCli.buscarCliente(c.getNif());
    }

    //REGISTRAR VEHICULO
    public void registrarVehiculo(Vehiculo v) {
        this.catalogoVehi.anadirVehiculo(v);
    }

    //BUSCAR VEHICULO
    public Vehiculo buscarVehiculo(Vehiculo v) {
        return this.catalogoVehi.buscarVehiculo(v.getBastidor());
    }

    //BUSCAR ALQUILER
    private int buscarAlquiler(Alquiler aux) {        //PRIVADO PQ SOLO LO UTILIZO EN EL METODO DE ABAJO

        if (aux != null) {
            for (int i = 0; i < this.catalogoAlq.getListaAlquiler().length; i++) {
                //CAMBIOS PARA QUE NO COJA NULLS
                if (aux.equals(this.catalogoAlq.getListaAlquiler()[i] != null && aux.equals(this.catalogoAlq.getListaAlquiler()[i]))) {
                    return i;
                }
            }
        }

        return -1;
    }

    //REGISTRAR ALQUILER
    public void registrarAlquiler(Cliente cli, Vehiculo v, LocalDate fecha, int nDias) {
        
        if (buscarCliente(cli) == null && buscarVehiculo(v) == null && v.isDisponible()) {

            v.setDisponible(false);
            Alquiler alquiler = new Alquiler(cli, v, fecha, nDias);
            this.catalogoAlq.anadirAlquiler(alquiler);

        }

    }

    //RECIBIR VEHICULO ALQUILADO (Alquiler c)
    public void recibirAlquiler(Alquiler a) {

        if (buscarAlquiler(a) >= 0) {
            a.getVehiculo().setDisponible(true);
        }

    }

    //EQUALS Y HASHCODE
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.cif);
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
        final Empresa other = (Empresa) obj;
        return Objects.equals(this.cif, other.cif);
    }

}
