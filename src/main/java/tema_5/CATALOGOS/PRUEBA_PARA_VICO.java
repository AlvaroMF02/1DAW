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

        int eleccion = 0;

        do {
            mostrarMenu();
            System.out.println("¿Qué desea hacer?");
            eleccion = teclado.nextInt();

            switch (eleccion) {
                case 1:
                    System.out.println("Ha escogido registrar a un cliente nuevo");
                    Cliente cli = CatalogoClientes.leerTecladoCliente();

                    //METER EL CLIENTE EN EL CATALOGO Y MOSTRARLO     ¿QUITAR NIF Y DEJARLO ALEATORIO?
                    rentacar.registrarCliente(cli);
                    rentacar.getCatalogoCli().mostrarCatal();
                    break;

                case 2:
                    System.out.println("Ha escogido registrar a un vehiculo nuevo");
                    Vehiculo vehic = CatalogoVehiculos.leerTecladoVehiculo();

                    //METER EL VEHICULO EN EL CATALOGO Y MOSTRARLO              //SE DEBEN CREAR LOS CATALOGOS LLENOS?
                    rentacar.registrarVehiculo(vehic);
                    rentacar.getCatalogoVehi().mostrarCatalogo();
                    break;

                case 3:
                    System.out.println("Ha escogido registrar a un alquiler nuevo");

                    //TODO ES UN IF ELSE PARA Q EL USUARIO ELIJA SI QUIERE CREAR UN USUARIO Y VEHICULO NUEVO O ESCOJER UNO DEL CATALOGO
                    
                    //ASIGNAR UNO CON EL NIF
                    System.out.println("Indique el nif del cliente con el que se alquilará el vehiculo");
                    //CREAR UNO NUEVO
                    System.out.println("DATOS CLIENTE:");
                    Cliente nuevoCli = CatalogoClientes.leerTecladoCliente();

                    //ASIGNAR VEHICULO CON EL BASTIDOR
                    System.out.println("Indique el bastidor del vehiculo que se alquilará");
                    //CREAR VEHICULO NUEVO
                    System.out.println("DATOS VEHICULO:");
                    Vehiculo nuevoVehic = CatalogoVehiculos.leerTecladoVehiculo();

                    rentacar.registrarAlquiler(nuevoCli, nuevoVehic, LocalDate.now(), eleccion);    //CAMBIAR LA FECHANOW Y HACERLO DE OTRA FORMA, PREGUNTAR SI NO ESTA MAL HACERLO ASI
                    rentacar.getCatalogoAlq().mostrarCatal();
                    break;

                case 4:
                    System.out.println("Agur");
                    break;
            }

        } while (eleccion != 4);

    }

    public static void mostrarMenu() {
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
