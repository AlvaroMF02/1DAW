package tema_4.ClaseCuenta;

import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class CalculoCuenta {

    public static Scanner teclado = new Scanner(System.in);

    //INGRESAR INTERES (CUENTA CUENTA) AUMENTA EL SALDO DE LA CUENTA
    public static void ingresarInteres(Cuenta cuenta) {
        double saldoTotal;
        System.out.println("¿De cuanto es el interés?");
        double interes = teclado.nextDouble();

        //CALCULO
        //SALDO = SALDO + SALDO * INTERES
        saldoTotal = cuenta.getSaldo() + cuenta.getSaldo() * interes;
        cuenta.setSaldo(saldoTotal);

        System.out.println("Tu saldo es de " + saldoTotal);

    }

    //INGRESAR DINERO (CUENTA CUENTA, DOUBLE CANTIDAD)
    public static void ingresarDinero(Cuenta cuenta, double cantidad) {

        System.out.println("Tu saldo actual es de: " + cuenta.getSaldo());

        System.out.println("\nLa cantidad a ingresar es: " + cantidad);

        cuenta.setSaldo(cuenta.getSaldo() + cantidad);

        System.out.println("\nTu saldo actual es de: " + cuenta.getSaldo());

    }
    
    
    //RETIRAR DINERO (CUENTA CUENTA DOUBLE CANTIDAD) NO SE PUEDE RETIRAR DINERO QUE MO HAY
    public static void retirarDinero (Cuenta cuenta, double cantidad){
        
        System.out.println("Tu saldo actual es de: " + cuenta.getSaldo());
        
        System.out.println("\nLa cantidad a retirar es: " + cantidad);
        
        //BUCLE PARA FILTRAR EL DINERO
        do {            
            if (cantidad < cuenta.getSaldo()) {
                System.out.println("Debes retirar dinero que tengas");
            } else {
                cuenta.setSaldo(cuenta.getSaldo() - cantidad);
            }
        } while (cantidad < cuenta.getSaldo());
        
        System.out.println("\nTu saldo actual es de: " + cuenta.getSaldo());
    }
}
