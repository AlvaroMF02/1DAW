package tema_2.explicaciones;

import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class expresiones_logicas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //VARIABLES
        String nombre, apellido;
        int edad, estatura;
        double peso;

        //SI HAY QUE LEER TEXTOS Y NUMEROS CON SCANNER
        //PRIMERO SE LEEN LOS TEXTOS Y AL FINAL LOS NUMEROS
        //SI LO ANTERIOR NO ES POSIBLE, HAY QIE TENER EN CUENTA QUE
        //DESPUES DE LEER UN NUMERO SI VAMOS A LEER UN TEXTO
        //HAY QUE LIMPIAR EL BUFFER (teclado.nextLine())
        
        //limpiar el buffer
        teclado.nextLine();
        
        System.out.println("Intriduce tu nombre");
        nombre = teclado.nextLine();
        
        System.out.println("Intriduce tu apellido");
        apellido = teclado.nextLine();
        
        
        System.out.println("Introduce tu edad");
        edad= teclado.nextInt();
        
        System.out.println("Introduce tu estatura");
        estatura= teclado.nextInt();
        
        System.out.println("Introduce tu peso");
        peso= teclado.nextDouble();
        
        //guardar en variables booleanas el resultad de evaluar las siguientes expresiones
        //A- SI LA EDAD ESTA COMPRENDIDA ENTR 25 Y 35 AÑOS INCLUIDOS
        boolean a= edad>= 25 && edad<=35;
        //B EL PESO ES MAYOR DE 50KG O MENOR O IGUAL DE 100KG
        boolean b = peso>50.0 && peso<=100;
        //C NO MIDE 1,75
        boolean c = peso<1.75;
        //D LA ESTATURA ESTA ENTRE 100CM Y 180CM, EXCLUIDOS
        boolean d = estatura>100 && estatura>180;
        //E LA EDAD MAS 10 AÑOS NO SUPERA LOS 60
        boolean e =(edad+10)<60;
        //F EL NOMBRE ES IGUAL A "PABLO", IGNORANDO MAYUSCULAS Y MINUSCULAS. EQUALSIGNORECAS
        boolean f= nombre.equalsIgnoreCase("Pablo");
        //G EL APELLIDO CONTIENE LA LETRA J CONTAINS
        boolean g= apellido.contains("j");
        //H EL APPELLIDO TERMINA EN DEZ
        boolean h = apellido.endsWith("dez");
        //I LA EDAD NO ESTA ETRE 40 Y 50
        boolean i =edad>=40 && edad <=50;
    }
}
