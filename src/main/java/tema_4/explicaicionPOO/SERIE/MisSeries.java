package tema_4.explicaicionPOO.SERIE;

/**
 *
 * @author alvaro
 */
public class MisSeries {
    public static void main(String[] args) {
        
        Serie LosSimpson= new Serie("Los Simpson", "Comedio", "...", "Disney", 1000);
        System.out.println(LosSimpson);
        
        Serie house = new Serie();
        System.out.println(house);
        
        Serie prisonBreak = new Serie("Prison Break", "Accion", "...", "abc", 5, 666666);
        System.out.println(prisonBreak);
        
        //######################################################################
        
        //CREAR UN OBJETO SERIE LEYENDO LOS DATOS POR TECLADO
        Serie peakeBlinders = ServicioSerie.leerTecladoSerie();
        System.out.println(peakeBlinders);
        
        
        //DAR LIKE A UNA
        ServicioSerie.darLike(LosSimpson);
        System.out.println(LosSimpson);
    }
}
