package tema_3.NumerosRomanos;

import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class NumerosRomanos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //VARIABLES
        int opcion;
        int numero;
        String nombre;
        String menu = """
                      ******************************
                                    MENU
                      
                      1 -> REPRESENTAR NUMERO ROMANO
                      2 -> CONTAR VOCALES DE NOMBRE
                      3 -> SALIR
                      
                      ******************************
                      """;

        //DO WHILE PARA CONTROLAR LA SALIDA DEL PROGRAMA
        do {
            System.out.println(menu);
            System.out.println("Indique una opcion");
            opcion = teclado.nextInt();

            //PASAR A NUMEROS ROMANOS DEL 1 AL 10
            switch (opcion) {
                case 1:
                    System.out.println("Indica el numero del 1 al 10");
                    numero = teclado.nextInt();

                    switch (numero) {
                        case 1:
                            System.out.println("El numero es: I\n");
                            break;
                        case 2:
                            System.out.println("El numero es: II\n");
                            break;
                        case 3:
                            System.out.println("El numero es: III\n");
                            break;
                        case 4:
                            System.out.println("El numero es: IV\n");
                            break;
                        case 5:
                            System.out.println("El numero es: V\n");
                            break;
                        case 6:
                            System.out.println("El numero es: VI\n");
                            break;
                        case 7:
                            System.out.println("El numero es: VII\n");
                            break;
                        case 8:
                            System.out.println("El numero es: VIII\n");
                            break;
                        case 9:
                            System.out.println("El numero es: IX\n");
                            break;
                        case 10:
                            System.out.println("El numero es: X\n");
                            break;
                        default:
                            System.out.println("EL NUMERO DEBE SER DEL 1 AL 10 \n");
                    }
                    break;
                //CONTAL VOCALES DE UN NOMBRE
                case 2:
                    //CREO LA VARIBLE DENTRO DEL BUCLE PARA QUE NO SE VAYA SUMANDO 
                    int vocales = 0;
                    System.out.println("Escriba un nombre");
                    teclado.nextLine();
                    nombre = teclado.nextLine();
                    nombre = nombre.toLowerCase();

                    //BUCLE CON EL QUE FILTRO LAS VOCALES Y LAS SUMO
                    for (int i = 0; i < nombre.length(); i++) {
                        if (nombre.charAt(i) == 'a'
                                || nombre.charAt(i) == 'e'
                                || nombre.charAt(i) == 'i'
                                || nombre.charAt(i) == 'o'
                                || nombre.charAt(i) == 'u') {
                            vocales++;
                        }
                    }

                    System.out.println(vocales + "\n");

                    break;
                //SALIDA
                case 3:
                    System.out.println("SALIDA DEL PROGRAMA \n");

            }
        } while (opcion != 3);
    }
}
