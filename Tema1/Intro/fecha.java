import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
public class fecha{
    public static void main(String[] args) {
//fecha actual
        LocalDate fechaAct=LocalDate.now();
        LocalTime horaAct=LocalTime.now();
        LocalDateTime fechaHoraAct=LocalDateTime.now();

        System.out.println("Fecha actual: "+fechaAct);
        System.out.println("Hora actual: "+horaAct);
        System.out.println("FechaHora actual: "+fechaHoraAct);
//crear fecha
        LocalDate fechaQ=LocalDate.of(2003,7,11);
        LocalTime horaQ=LocalTime.of(8,15);
        LocalDateTime fechaHoraQ=LocalDateTime.of(2022,Month.OCTOBER,17,8,36,0);

        System.out.println("Fecha cualquiera: "+fechaQ);
        System.out.println("Hora cualquiera: "+horaQ);
        System.out.println("Fecha hora cualquiera: "+fechaHoraQ);
//GET(probar solo, hay demasiados)
        System.out.println("GET DAY: "+fechaHoraQ.getDayOfMonth());
        System.out.println("GET DAY of Year: "+fechaHoraQ.getDayOfYear());
//INSTANT
        Instant instante=Instant.now();

        System.out.println("INSTANT: "+instante);
//AÑADIR/QUITAR TIEMPO
        System.out.println("SUMADO: "+fechaHoraAct.plusWeeks(1));
        System.out.println("RESTADO: "+fechaHoraAct.minusHours(20));
//AJUSTE TEMPORALES
        System.out.println("Ultimo dia del mes: "+fechaAct.with(TemporalAdjusters.lastDayOfMonth()));
//FORMATO
        DateTimeFormatter formato= DateTimeFormatter.ofPattern("yyyy'年' MM'月' dd'日'  EEEE");
        System.out.println("Formato mio: "+fechaAct.format(formato));
        System.out.println("Semana en ingles: "+fechaAct.format(formato.withLocale(new Locale("en","EN"))));
//DIFERENCIA ENTRE FECHA PERIOD Y ChronoUnit
        System.out.println("Diferencia de año de dos fechas con ChronoUnit: "+ChronoUnit.YEARS.between(fechaQ, fechaAct));
        System.out.println("Diferencia de dia de dos fechas con ChronoUnit: "+ChronoUnit.DAYS.between(fechaQ, fechaAct));
        Period res=fechaAct.until(fechaQ);
        System.out.println("Diferencia fecha con period: "+res);
        System.out.println("Diferencia fecha con period: "+res.getDays()+"dias "+res.getMonths()+"mes "+res.getYears()+"año");
    }
}