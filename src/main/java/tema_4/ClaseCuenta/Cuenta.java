package tema_4.ClaseCuenta;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author alvaro
 */
public class Cuenta {

    //ATRIBUTOS
    private String nCeunta;     //20 DIGITOS ALEATORIOS
    private String nif;
    private String nombre;
    private double saldo;
    private double interes;     //ENTRE 0.1 Y 3

    //CONSTRUCTOR POR DEFECTO CON LA CUENTA ALEATORIA
    public Cuenta(String nif, String nombre, double saldo, double interes) {
        this.nCeunta = generarCuenta();
        this.nif = nif;
        this.nombre = nombre;
        this.saldo = saldo;
        this.interes = interes;
    }

    //CONSTRUCTOR PARAMETRIZADOCON LA CUENTA ALEATORIA
    public Cuenta() {
        this.nCeunta = generarCuenta();
    }

    //GETTER SETTERS, SIN SET PARA NCEUNTA
    public String getnCeunta() {
        return nCeunta;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public String generarCuenta() {
        String cuenta;
        cuenta = RandomStringUtils.randomNumeric(20);
        return cuenta;
    }

    //TOSTRING
    @Override
    public String toString() {
        return "Cuenta ->" + "\nCUENTA: " + nCeunta + "\nNIF: " + nif + "\nNOMBRE: " + nombre + "\nSALDO: " + saldo + "\nINTERES: " + interes;
    }

}
