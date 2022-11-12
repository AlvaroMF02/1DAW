package tema_4.relacionA.EJ7_8_9;

/**
 *
 * @author alvaro
 */
public class CajaCarton {
    
    //ATRIBUTOS
    private double ancho;   //milimetros
    private double alto;
    private double largo;
    private double peso;    //gramos
    
    //CONSTRUCTOR

    public CajaCarton(double ancho, double alto, double largo, double peso) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
        this.peso = peso;
    }
    
    //GETTER SETTER

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    //METODOS
    public void abrir(){
        
    }
    
    public void cerrar(){
        
    }
    
    //TOSTRING

    @Override
    public String toString() {
        return "CajaCarton{" + "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + ", peso=" + peso + '}';
    }
    
    
    
}
