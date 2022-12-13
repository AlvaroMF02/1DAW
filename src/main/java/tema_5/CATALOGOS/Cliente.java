package tema_5.CATALOGOS;

import java.util.Objects;

/**
 *
 * @author alvaro
 */
public class Cliente {

    private String nombre;
    private String apellido;
    private String nif;

    //CONSTRUCTORES
    public Cliente() {
        this.nombre = "Pepe";
        this.apellido = "Flores";
        this.nif = "45974364L";
    }

    public Cliente(String nombre, String apellido, String nif) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = nif;
    }

    //GETTER SETTER
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNif() {
        return nif;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
    
    //TOSTRING

    @Override
    public String toString() {
        return "Cliente{" + "Nombre=" + nombre + ", Apellido=" + apellido + ", NIF=" + nif + '}';
    }
    
    //EQUALS Y HASHCODE

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.apellido);
        hash = 97 * hash + Objects.hashCode(this.nif);
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
        final Cliente other = (Cliente) obj;
        return Objects.equals(this.nif, other.nif);
    }
    
    
}
