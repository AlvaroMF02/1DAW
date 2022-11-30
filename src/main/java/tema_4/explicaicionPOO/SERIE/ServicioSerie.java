package tema_4.explicaicionPOO.SERIE;

import java.util.Scanner;

/**
 *
 * @author alvaro
 */
//ESTA CLASE SIRVE DE CONEXION ENTRE EL MAIN Y MI CLASE SERIE
public class ServicioSerie {

    private static Scanner teclado = new Scanner(System.in);

    public static Serie leerTecladoSerie() {
        Serie serie;
        //PEDIR CADA DATO
        System.out.println("TITULO: ");
        String tituloSerie = teclado.nextLine();

        System.out.println("GENERO: ");
        String generoSerie = teclado.nextLine();

        System.out.println("SINOPSIS: ");
        String sinopsisSerie = teclado.nextLine();

        System.out.println("PRODUCTORA: ");
        String productoraSerie = teclado.nextLine();

        System.out.println("TEMPORADAS: ");
        int temporadasSeries = teclado.nextInt();

        System.out.println("LIKES: ");
        int likesSerie = teclado.nextInt();

        teclado.nextLine();
        //INSTANCIACION DEL OBJETO
        serie = new Serie(tituloSerie, generoSerie, sinopsisSerie,
                productoraSerie, temporadasSeries, likesSerie);

        return serie;
    }
    
    
    public static void darLike (Serie serie) {
        System.out.println("¿Te ha gustado la serie " + serie.getTitulo() + "?");
        String respuesta = teclado.nextLine();
        
        if (respuesta.equalsIgnoreCase("si")) {
            serie.darLike();
        }
    }
    
    public static Serie copiar(Serie ser){
        Serie copia = new Serie();
        
        copia.setGenero(ser.getGenero());
        copia.setProductor(ser.getProductor());
        copia.setSinopsis(ser.getSinopsis());
        copia.setTitulo(ser.getTitulo());
        copia.setnTemporadas(ser.getnTemporadas());
        
        return copia;
    }
    

}
