package tema_5.CATALOGOS;

import java.time.LocalDate;

/**
 *
 * @author Álvaro
 */
public class MainEmpresa {

    public static void main(String[] args) {

        Empresa emp = new Empresa();

        //CREO UN VEHICULO Y UN CILENTE NUEVO PARA HACER LAS PRUEBAS
        Cliente cli = new Cliente();
        Vehiculo veh = new Vehiculo();
        
        //AÑADIR A SUS CATALOGOS CORRESPONDIENTES
        emp.registrarCliente(cli);
        emp.registrarVehiculo(veh);
        //MOSTRAR
        System.out.println(emp.toString());

        //BUSCAR
        emp.buscarCliente(cli);
        emp.buscarVehiculo(veh);
        
        
        //COMPROBAR EL REGISTRO DE UN ALQUILER
        emp.registrarAlquiler(cli, veh, LocalDate.now(), 3);
        System.out.println(emp.toString());
        
        //RECIBIR EL VEHICULO
        emp.recibirAlquiler(emp.getCatalogoAlq().buscarAlquiler(1));
        System.out.println(emp.toString());
        
    }
}
