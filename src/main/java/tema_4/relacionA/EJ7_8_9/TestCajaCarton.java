package tema_4.relacionA.EJ7_8_9;

/**
 *
 * @author alvaro
 */
public class TestCajaCarton {
    
    public static void main(String[] args) {
        
        CajaCarton cajaGrande = new CajaCarton(250, 400, 500, 200);
        CajaCarton cajaChica = new CajaCarton(25, 30, 15, 17);
                
        System.out.println("CAJA GRANDE GETTER");
        System.out.println("Ancho: "+cajaGrande.getAncho());
        System.out.println("Alto: "+cajaGrande.getAlto());
        System.out.println("Largo: "+cajaGrande.getLargo());
        System.out.println("Peso: "+cajaGrande.getPeso() + "\n");
        
        System.out.println("CAJA CHICA GETTER");
        System.out.println("Ancho: "+cajaChica.getAncho());
        System.out.println("Alto: "+cajaChica.getAlto());
        System.out.println("Largo: "+cajaChica.getLargo());
        System.out.println("Peso: "+cajaChica.getPeso() + "\n");
        
        System.out.println("_________________________________________________");
        
        System.out.println("CAJA GRANDE TOSTRING");
        System.out.println(cajaGrande+ "\n");
        System.out.println("CAJA CHICA TOSTRING");
        System.out.println(cajaChica);
    }
}
