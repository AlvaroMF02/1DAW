package tema_2.ejercicios_de_introduccion;

/**
 *
 * @author alvaro
 */
public class ejer1 {

    public static void main(String[] args) {
        //Declaracion de todo tipo de variables
        byte varByte = 2;
        short varShort = 1;
        final int varInt = 6;
        long varLong = 232;
        float varFloat = 2235.2313f;
        final double varDouble = 4482.8936;
        char varChar = 'J';
        boolean varBoolean = false;
        
        String varString = "variable String";
        
        
        System.out.println(" Byte: " + varByte + "\n" +
                " Short: " + varShort + "\n" +
                " Int: " + varInt + "\n" +
                " Long: " + varLong + "\n" +
                " Float: " + varFloat + "\n" +
                " Double: " + varDouble + "\n" +
                " Char: " + varChar + "\n" +
                " Boolean: " + varBoolean + "\n" +
                " String: " + varString);
        
        
        //limitacion de la salida de decimales
        System.out.printf(" El numero double con dos decimales se ve asi %.2f", varDouble );
        System.out.println("");
        System.out.printf(" El numero float con dos decimales se ve asi %.2f", varFloat);
        
    }
}
