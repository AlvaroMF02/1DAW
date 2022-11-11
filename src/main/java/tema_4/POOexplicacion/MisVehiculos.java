package tema_4.POOexplicacion;

import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class MisVehiculos {

    //HACER 7, 8, 9
    public static void main(String[] args) {

        //INSTANCIACION DE LA CLASE SCANNER
        Scanner teclado = new Scanner(System.in);

        //INSTANCIACION DE LA CLASE VEHICULO LLAMADA V1
        Vehiculo v1 = new Vehiculo();
        //v1.matricula = "932BSDA8";
        //v1.marca = "miau";

        //System.out.println("Matricula: " + v1.matricula);
        //System.out.println("Marca: " + v1.marca);
        
        /**
         *
         * FERRARI MIAU
         *
         */
        Vehiculo ferrari = new Vehiculo();

        //ferrari.color = "Rosa";
        //ferrari.modelo = "Testarrosa";
        //ferrari.marca = "Ferrari";
        System.out.println("\n----------FERRARI----------");
        //System.out.println("Color del ferrari: " + ferrari.color);

        /**
         *
         * CON CONSTRUCTOR
         *
         */
        System.out.println("\n----------CON-CONSTRUCTOR----------");

        Vehiculo mercedes = new Vehiculo("256737H", "mercedes", "A1",
                "amarillo", false, true);

        System.out.println(mercedes);
        System.out.println("\nMOSTRSR UN SOLO ATRIBUTO");
        //System.out.println(mercedes.color);

        /**
         *
         * CONSTRUCTOR CON 3 ATRIBUTOS
         *
         */
        System.out.println("\n----------CONSTRUCTOR CON 3 A TRIB----------");

        Vehiculo jeep = new Vehiculo("9723R", "gris", "L9");
        System.out.println("LOS DEMAS ATRIB ESTAN POR DEFECTO");
        System.out.println("----------MOSTRAR JEEP TOSTRING----------");
        System.out.println(jeep);

        System.out.println("-----------------------------------------");
        System.out.println("MOSTRAR CON GET");
        System.out.println(jeep.getMatricula());

        System.out.println("CAMBIAR CON SET");
        jeep.setMatricula("0000ZZZ");
        System.out.println(jeep.getMatricula());

    }
}
