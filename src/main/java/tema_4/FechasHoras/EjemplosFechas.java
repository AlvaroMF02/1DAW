package tema_4.FechasHoras;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 *
 * @author alvaro
 */
public class EjemplosFechas {

    public static void main(String[] args) {

        //CLASE QUE GUARDA FECHAS
        LocalDate fechaHoy = LocalDate.now();

        System.out.println("Año: " + fechaHoy.getYear());
        System.out.println("Mes: " + fechaHoy.getMonth());

        Month mesActual = fechaHoy.getMonth();
        System.out.println("Month: " + mesActual);

        //FECHAS CONCRETAS
        LocalDate fecha = LocalDate.of(2002, 6, 14);
        LocalDate fecha2 = LocalDate.of(2001, Month.JUNE, 14);
        System.out.println(fecha);
        System.out.println(fecha2);

        //SI SON IGUALES
        if (fecha.equals(fecha2)) {
            System.out.println("son iguales");
        } else {
            System.out.println("son distintas");
        }

        //ANTERIOR Y POSTERIOR
        if (fecha.isBefore(fecha2)) {
            System.out.println(fecha + " es anterior a " + fecha2);
        } else {
            System.out.println(fecha + " es posterior a " + fecha2);
        }

        //CLASE PARA GUARDAR 
        MonthDay nocheVieja = MonthDay.of(12, 31);

        YearMonth anyoMes = YearMonth.of(2023, 2);

        //OPERACIONES CON FECHAS
        LocalDate sumardias = fechaHoy.plusDays(100);
        LocalDate sumarMes = fechaHoy.plusMonths(13);
        System.out.println(sumardias);
        System.out.println(sumarMes);

        LocalDate dosSiglosdes = sumarMes.plus(2, ChronoUnit.CENTURIES);
        System.out.println(dosSiglosdes);

        long diferenciaDias = ChronoUnit.DAYS.between(fecha, fecha2);
        System.out.println(diferenciaDias);
        long years = ChronoUnit.YEARS.between(fecha, fecha2);
        System.out.println(years);
        
        
        boolean esBisiesto = fechaHoy.isLeapYear();
        System.out.println(esBisiesto);
        
        
        System.out.println(fechaHoy.lengthOfMonth());
        
        
        Locale configLocal = Locale.getDefault();                                                    //SHORT, NARROW
        System.out.println("Fecha de hoy Dia " + fechaHoy.getDayOfWeek().getDisplayName(TextStyle.FULL, configLocal));
        
        DateTimeFormatter formatoFechas = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fechaHoy.format(formatoFechas);
        System.out.println(fechaFormateada);
    }
}
