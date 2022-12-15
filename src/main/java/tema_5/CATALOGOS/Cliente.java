package tema_5.CATALOGOS;

import java.util.Objects;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author alvaro
 */
public class Cliente {

    private NombresClie nombre;
    private ApellidosCli apellido;
    private String nif;
    private static int contador = 0;

    //CONSTRUCTOR ALEATORIO
    public Cliente() {
        this.nombre = NombresClie.getAleatorio();
        this.apellido = ApellidosCli.getAleatorio();
        this.nif = String.valueOf(++contador);//RandomStringUtils.randomAlphanumeric(9);
        
        //PARA FACILITAR LA PRUEBA EN EL MAIN
        //contador++;
        //this.nif = String.valueOf(contador);
    }
    
    //CONSTRUCTOR NORMAL
    public Cliente(NombresClie nombre, ApellidosCli apellido, String nif) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = nif;
    }
    

    //GETTER SETTER
    public NombresClie getNombre() {
        return nombre;
    }

    public void setNombre(NombresClie nombre) {
        this.nombre = nombre;
    }

    public ApellidosCli getApellido() {
        return apellido;
    }

    public void setApellido(ApellidosCli apellido) {
        this.apellido = apellido;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    //TOSTRING
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", nif=" + nif + '}';
    }

    //EQUALS Y HASHCODE
    @Override
    public int hashCode() {
        int hash = 3;
//        hash = 97 * hash + Objects.hashCode(this.nombre);
//        hash = 97 * hash + Objects.hashCode(this.apellido);
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
