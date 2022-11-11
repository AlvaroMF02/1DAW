package tema_4.POOexplicacion;

/**
 * PREGUNTAS
 * -----------------------------------------------------------------------------
 * ¿Qué es un programa orientado a objetos? Es un molde donde vamos a indicar
 * los atributos y metodos de los objetos que queremos modelas
 *
 * ¿Qué es una clase? Es una variable de tipo referencia que contiene los datos
 * concretos de una instancia de una clase
 *
 * ¿Qué es un objeto?
 *
 *
 * ¿Cuáles son los pilares de la POO? Explica brevemente cada uno de ellos.
 * Definicion, atributos y metodos
 *
 * ¿Qué ventajas aporta la POO?
 *
 *
 * ¿Cuáles son las partes de una clase?
 *
 *
 * ¿Qué elementos componen la definición de una clase? Explica brevemente cada
 *
 *
 * ¿Qué es un método constructor?
 *
 *
 * ¿Qué son los métodos de consulta o getters?
 *
 *
 * ¿Qué son los métodos modificadores o setters?
 *
 *
 * ¿En qué consiste la instanciación de un objeto? ¿Para qué sirve el operador
 * ‘new’?
 *
 *
 * ¿Cuál es la función del método main()? ¿Cómo se declara el método main()?
 *
 *
 * ¿Cómo interaccionan los objetos de una aplicación?
 *
 * -------------------------------------------------------------------------------
 *
 */
//DEFINICION (DONDE DICES QUE ES UNA CLASE, PUBLICA, QUE SE LLAMA VEHICULO)
public class Vehiculo {

    //ATRIBUTOS
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private boolean tarifa;     //PRECIO ALQUILER DIA
    private boolean disponible; //ALQUILADO O LIBRE

    //CONSTRUCTOR
    public Vehiculo(String matricula, String marca, String modelo, String color,
            boolean tarifa, boolean disponible) {

        //atributo del objeto = al parametro que le paso ()
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }

    //CONSTRUCTOR SIN NADA
    public Vehiculo() {
    }
    
    //CONSTRUCTOR CON 3 ATRIB
    public Vehiculo(String matricula, String color, String modelo) {
        this.matricula = matricula;
        this.color = color;
        this.modelo = modelo;
        //EL RESTO DE ATRIBUTOS SE QUEDAN POR DEFECTO
    }

    //METODOS GET
    public String getMatricula() {
        return this.matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public boolean isTarifa() {
        return tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }
    
    
    //METODOS SET
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTarifa(boolean tarifa) {
        this.tarifa = tarifa;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    
    
    //METODO PARA MOSTRAR LOS ATRIBUTOS
    @Override
    public String toString() {
        return "Vehiculo: " + "\nmatricula=" + matricula + "\nmarca=" + marca
                + "\nmodelo=" + modelo + "\ncolor=" + color + "\ntarifa=" + tarifa
                + "\ndisponible=" + disponible;
    }

}
