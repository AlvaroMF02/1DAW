package tema_5.CATALOGOS;

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
        
        this.cif = RandomStringUtils.randomAlphanumeric(9);
        this.nombre = RandomStringUtils.randomAlphabetic(5);
        this.catalogoAlq = new CatalogoAlquiler(10);
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
    
    
    //TO STRING GRANDOTE
    public String toString(){
        String resultado = "";
        resultado = """
                    ----------------------------------------------
                    Empresa: %s
                    CIF: %s 
                    ----------------------------------------------
                    
                          ###### CATALOGO DE CLIENTES ######
                    """.formatted(this.nombre,this.cif);
        
        //GUARDAR CATALOGO DE CLIENTES
        for (Cliente listaCliente : this.catalogoCli.getListaCliente()) {
            resultado += listaCliente+"\n";
        }
                        
        resultado += "\n      ###### CATALOGO DE VEHICULOS ######\n";
        //GUARDAR CATALOGO DE VEHICULOS
        for (Vehiculo listaVehiculo : this.catalogoVehi.getListaVehiculo()) {
            resultado += listaVehiculo+"\n";
        }
        
        resultado += "\n      ###### CATALOGO DE ALQUILERES ######\n";
        //GUARDAR CATALOGO DE ALQUILERES
        for (Alquiler listaAlquiler : this.catalogoAlq.getListaAlquiler()) {
            resultado += listaAlquiler+"\n";
        }
        resultado += "----------------------------------------------";
        
        return resultado;
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
