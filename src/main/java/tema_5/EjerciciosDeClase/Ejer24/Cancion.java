package tema_5.EjerciciosDeClase.Ejer24;

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
        int hash = 7;
        hash = 11 * hash + this.idCancion;
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
        return this.idCancion == other.idCancion;
    }
    
    
}
