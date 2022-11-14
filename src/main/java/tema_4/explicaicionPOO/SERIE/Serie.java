package tema_4.explicaicionPOO.SERIE;

/**
 *
 * @author alvaro
 */
public class Serie {
    
    //ATRIBUTOS DE CLASE (STATIC)
    
    //ATRIBUTO DE INSTANCIA (NO STATIC)
    private String titulo;
    private String genero;
    private String sinopsis;
    private String productor;
    private int nTemporadas;
    private int nLikes;
    
    //CONSTRUCTOR
    public Serie(String titulo, String genero, String sinopsis, String productor, int nTemporadas, int nLikes) {
        this.titulo = titulo;
        this.genero = genero;
        this.sinopsis = sinopsis;
        this.productor = productor;
        this.nTemporadas = nTemporadas;
        this.nLikes = nLikes;
    }

    public Serie(String titulo, String genero, String sinopsis, String productor, int nTemporadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.sinopsis = sinopsis;
        this.productor = productor;
        this.nTemporadas = nTemporadas;
    }
    
    public Serie() {
        //TODO QUEDA POR DEFECTO
    }
    
    //GETTER SETTER

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public int getnTemporadas() {
        return nTemporadas;
    }

    public void setnTemporadas(int nTemporadas) {
        this.nTemporadas = nTemporadas;
    }

    //MEOTDO DAR LIKE
    public void darLike(){
        this.nLikes++;
    }
    
    //METODO TOOSTRING
    @Override
    public String toString() {
        return "Serie:" + "\ntitulo = " + titulo + "\nenero = " + genero + "\nsinopsis = " + sinopsis + "\nproductor = " + productor + "\nTemporadas = " + nTemporadas + "\nLIKES = " + nLikes + "\n";
    }
    
}
