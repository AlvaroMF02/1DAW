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
//        Serie peakeBlinders = ServicioSerie.leerTecladoSerie();
//        System.out.println(peakeBlinders);
//        
//        
//        //DAR LIKE A UNA
//        ServicioSerie.darLike(LosSimpson);
//        System.out.println(LosSimpson);
        
        //######################################################################
        //COMPARAR
        boolean copia = LosSimpson.equals(house);
        System.out.println(copia);
        
        Serie LosSimpson2 = ServicioSerie.copiar(LosSimpson);
        System.out.println(LosSimpson2);
        //COMPARO
        copia = LosSimpson.equals(LosSimpson2);
        System.out.println(copia);
        
        //HASHCODE LAS DOS SERIES IGUALES
        System.out.println(LosSimpson2.hashCode());
        System.out.println(LosSimpson.hashCode());
        
        
        
        
    }
}
