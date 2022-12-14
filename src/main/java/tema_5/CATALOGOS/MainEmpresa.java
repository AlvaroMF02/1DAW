package tema_5.CATALOGOS;

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
        emp.regiustrarVehiculo(veh);
        //MOSTRAR
        System.out.println(emp.toString());

        //BUSCAR
        emp.buscarCliente(cli);
        emp.buscarVehiculo(veh);
        
    }
}
