package tema_5.CATALOGOS;

import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class PRUEBA_PARA_VICO {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Empresa rentacar = new Empresa();
        
        int eleccion = 0;
        
        do {
            mostrarMenu();
            System.out.println("¿Qué desea hacer?");
            eleccion = teclado.nextInt();
            
            switch (eleccion) {
                case 1:
                    System.out.println("Ha escogido registrar a un cliente nuevo");
                    Cliente cli = CatalogoClientes.leerTecladoSerie();
                    
                    break;
                    
                case 2:
                    System.out.println("Ha escogido registrar a un vehiculo nuevo");
                    
                    break;
                    
                case 3:
                    System.out.println("Ha escogido registrar a un alquiler nuevo");
                    
                    break;
                    
                default:
                    System.out.println("Escoja una de las opciones del menú");
            }
            
            
            
            
            
            
            
        } while (eleccion != 4);
        
        
    }
    
    public static void mostrarMenu(){
        String menu = """
                      -------------------------------------------------------
                                            MENU EMPRESA
                      -------------------------------------------------------
                                      1- REGISTRAR UN CLIENTE
                                      2- REGISTRAR UN VEHICULO
                                      3- REGISTRAR UN ALQUILER
                                      4- SALIR
                      -------------------------------------------------------""";
        System.out.println(menu);
    }
}
