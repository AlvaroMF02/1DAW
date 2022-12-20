package tema_5.EjerciciosDeClase.Ejer24;

import java.util.Objects;

/**
 *
 * @author alvaro
 */
public class Cancion {

    //ATRIBUTOS
    private String nombre;
    private String autor;
    private String album;
    private int idCancion;

    //CONSTRUCTOR
    public Cancion(String nombre, String autor, String album, int idCancion) {
        this.nombre = nombre;
        this.autor = autor;
        this.album = album;
        this.idCancion = idCancion;
    }

    public Cancion() {
    }

    //GETTER SETTER

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getIdCancion() {
        return idCancion;
    }

    public void setIdCancion(int idCancion) {
        this.idCancion = idCancion;
    }
    

    @Override
    public String toString() {
        return "Cancion{" + "nombre=" + nombre + ", autor=" + autor + ", album=" + album + '}';
    }

    //BUSQUEDA POR ID CANCION

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.nombre);
        hash = 71 * hash + Objects.hashCode(this.autor);
        hash = 71 * hash + Objects.hashCode(this.album);
        hash = 71 * hash + this.idCancion;
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
        final Cancion other = (Cancion) obj;
        if (this.idCancion != other.idCancion) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return Objects.equals(this.album, other.album);
    }
    
    
    
}
