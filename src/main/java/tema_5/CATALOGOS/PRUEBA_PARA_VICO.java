package tema_5.CATALOGOS;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class PRUEBA_PARA_VICO {

    //MODULARIZAR TODO :)
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Empresa rentacar = new Empresa();

        //HACER QUE LA EMPRESA INDIQUE LA TARIFA QUE QUIERE
        //PONER EN EL MENU PARA VER EL LISTADO
        int eleccionMenu = 0;
        int eleccionAlq = 0;

        //LA EMPRESA INDICA LA TARIFA QUE SE COBRARÁ
        System.out.println("Indique la tarifa que se va a cobrar");
        int tarifa = teclado.nextInt();                                                     //CONTROLAR EXCEPCIONES
        //ASIGNAR TARIFA
        rentacar.getCatalogoVehi().cambiarTarifa(tarifa);
        
        do {
            mostrarMenu();
            System.out.println("¿Qué desea hacer?");
            eleccionMenu = teclado.nextInt();                                               //CONTROLAR EXCEPCIONES

            switch (eleccionMenu) {
                case 1:
                    //CREAR CLIENTE Y ALMACENARLO                                           HACER PARA QUE NO SE PUEDAN REPETIR
                    rentacar.registrarCliente(crearCliente());
                    break;

                case 2:
                    //CREAR VEHICULO Y ALMACENARLO                                          HACER PARA QUE NO SE PUEDAN REPETIR
                    rentacar.registrarVehiculo(crearVehiculo());
                    break;

                case 3:
                    do {
                        mostrarMenuAlquiler();
                        eleccionAlq = teclado.nextInt();
                        switch (eleccionAlq) {
                            case 1:
                                System.out.println("Registrar cliente nuevo");
                                //CREAR CLIENTE Y ALMACENARLO                               HACER PARA QUE NO SE PUEDAN REPETIR
                                rentacar.registrarCliente(crearCliente());
                                break;

                            case 2:
                                System.out.println("Escoger cliente nuevo");

                                break;

                            case 3:
                                System.out.println("Registrar vehiculo nuevo");
                                //CREAR VEHICULO Y ALMACENARLO                               HACER PARA QUE NO SE PUEDAN REPETIR
                                rentacar.registrarVehiculo(crearVehiculo());
                                break;

                            case 4:
                                System.out.println("Escoger cliente nuevo");

                                break;

                            case 5:
                                System.out.println("Alquiler cancelado");

                                break;
                        }
                    } while (eleccionAlq != 5);

                    //ASIGNAR UNO CON EL NIF / MOSTRAR EL CATALOGO PARA QUE ESCOJA
                    System.out.println("Indique el nif del cliente con el que se alquilará el vehiculo");
                    //CREAR UNO NUEVO
                    System.out.println("DATOS CLIENTE:");
                    Cliente nuevoCli = CatalogoClientes.leerTecladoCliente();

                    //ASIGNAR VEHICULO CON EL BASTIDOR / MOSTRAR EL CATALOGO PARA QUE ESCOJA
                    System.out.println("Indique el bastidor del vehiculo que se alquilará");
                    //CREAR VEHICULO NUEVO
                    System.out.println("DATOS VEHICULO:");
                    Vehiculo nuevoVehic = CatalogoVehiculos.leerTecladoVehiculo();

                    rentacar.registrarAlquiler(nuevoCli, nuevoVehic, LocalDate.now(), eleccionMenu);    //CAMBIAR LA FECHANOW Y HACERLO DE OTRA FORMA, PREGUNTAR SI NO ESTA MAL HACERLO ASI
                    rentacar.getCatalogoAlq().mostrarCatal();
                    break;

                case 4:
                    System.out.println(rentacar.toString());
                    break;

                case 5:
                    System.out.println("Agur");
                    break;
            }

        } while (eleccionMenu != 5);

    }

    public static void mostrarMenu() {
        String menu = """
                      -------------------------------------------------------
                                            MENU EMPRESA
                      -------------------------------------------------------
                                      1- REGISTRAR UN CLIENTE
                                      2- REGISTRAR UN VEHICULO
                                      3- REGISTRAR UN ALQUILER
                                      4- MOSTRAR CATALOGOS
                                      5- SALIR
                      -------------------------------------------------------""";
        System.out.println(menu);
    }

    public static void mostrarMenuAlquiler() {
        String menu = """
                      ##################################
                      #         NUEVO ALQUILER         #
                      ##################################
                      #                                #
                      # 1- REGISTRAR UN CLIENTE NUEVO  #
                      # 2- ESCOGER UN CLIENTE          #
                      # 3- REGISTRAR UN VEHICULO NUEVO #
                      # 4- ESCOGER UN VEHICULO         #
                      # 5- CANCELAR ALQUILER           #
                      #                                #
                      ##################################""";
        System.out.println(menu);
    }

    public static Cliente crearCliente() {
        System.out.println("Registrar Cliente:");
        Cliente cli = CatalogoClientes.leerTecladoCliente();

        return cli;
    }

    public static Vehiculo crearVehiculo() {
        System.out.println("Registrar Vehiculo:");
        Vehiculo vehic = CatalogoVehiculos.leerTecladoVehiculo();

        return vehic;
    }
}
