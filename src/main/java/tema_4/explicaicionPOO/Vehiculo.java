package tema_4.explicaicionPOO;

/**
   PREGUNTAS (CREDITOS: FERNANDO)
  -----------------------------------------------------------------------------
  
 * ¿Qué es un programa orientado a objetos?
    Es un modelo de programación informática que organiza el diseño de software en
    torno a datos u objetos, en lugar de funciones y lógica. Un objeto se puede
    definir como un campo de datos que tiene atributos y comportamiento únicos.

 *  ¿Qué es una clase?
    Una clase es un molde donde vamos a indicar los atributos y metodos de los objetos
    que queremos modelar

 *  ¿Qué es un objeto?
    Es una variable de tipo referencia que contiene los datos concretos de una instancia de una clase

 *  ¿Cuáles son los pilares de la POO? Explica brevemente cada uno de ellos.
    -Encapsulamiento 
    -Herencia La herencia permite crear nuevas clases a partir de otras ya creadas
    -Polimorfismo Que puede adoptar muchas formas
    -Abstraccion Consiste en captar la características esenciales de un objeto, así como su comportamiento

 *  ¿Qué ventajas aporta la POO?
    -Facilita la reutilizacion del software a traves de la herencia, la encapsulacion
     y el polimorfimos que son las herramientas mas potentes del paradigma de la POO
    -Facilita la construccion de programas portables
    -Facilita el mantenimiento
    -Provoca que las tareas de anilisis diseño e implementacion sean mas 
    ya que se manejan objetos

 *  ¿Cuáles son las partes de una clase?
    -Definicion 
    -Atributos
    -Metodos

 *  ¿Qué elementos componen la definición de una clase? Explica brevemente cada uno
    -Objetos Elementos tangibles o intangibles del sistema es decir los sustantivos
    -Atributos Las caracteristicas de los objetos
    -Metodos Acciones que deben realizar

 *  ¿Qué es un método constructor?
    sirven para “crear”  objetos de una clase en especifico


 *  ¿Qué son los métodos de consulta o getters?
    Son metodos para  recibir datos


 *  ¿Qué son los métodos modificadores o setters?
    Son metodos para enviar datos

 *  ¿En qué consiste la instanciación de un objeto?
    Se llama instancia a todo objeto que derive de algún otro. De esta forma, todos
    los objetos son instancias de algún otro, menos la clase Object que es la madre de toda

 *  ¿Para qué sirve el operador ‘new’?
    crear una instancia de un tipo de objeto definido por el usuario

 *  ¿Cuál es la función del método main()?
    Como punto de partida para la ejecución del programa. Normalmente, controla la
    ejecución del programa dirigiendo las llamadas a otras funciones del programa.

 *  ¿Cómo se declara el método main()?
    public static void main(String[] args) {
    }
 
  -------------------------------------------------------------------------------
 
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
