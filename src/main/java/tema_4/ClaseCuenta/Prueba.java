package tema_4.ClaseCuenta;

/**
 *
 * @author alvaro
 */
public class Prueba {
    public static void main(String[] args) {
        
        //CREAMOS UN PAR DE OBJETOS Y PROBAMOS LOS METODOS DE CALCULO CUENTA
        
        System.out.println("CUENTA 1");
        Cuenta c1 = new Cuenta();
        System.out.println(c1);
        
        System.out.println("\nCUENTA 2");
        Cuenta c2 = new Cuenta("23584196G", "Álvaro", 12.26, 10.0);
        System.out.println(c2);
        
        System.out.println("\n*************************************************");
        System.out.println("______________________CALCULOS_____________________");
        
        System.out.println("\n*************************************************");
        System.out.println("INGRESAR DINERO");
        CalculoCuenta.ingresarDinero(c1, 50.26);
        CalculoCuenta.ingresarDinero(c2, 900);
        System.out.println("*************************************************");
        
        System.out.println("\n*************************************************");
        System.out.println("INGRESAR INTERES");
        CalculoCuenta.ingresarInteres(c1);
        CalculoCuenta.ingresarInteres(c2);
        System.out.println("*************************************************");
        
        System.out.println("\n*************************************************");
        System.out.println("RETIRAR DINERO");
        CalculoCuenta.retirarDinero(c1, 12.30);
        CalculoCuenta.retirarDinero(c2, 12000);
        System.out.println("*************************************************");
    }
}
