import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class examenEj2 {
    public static void main(String[] args) {
        DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd 'de' MMMM'('EEEE') de' YYYY");
        //redondear hacia abajo para que 2000 y 2030 tengan la misma probabilidad con los otros años.
        int año=(int)Math.floor(Math.random()*31+2000);
        int mes=(int)Math.ceil(Math.random()*12);
        int dia;
        boolean treinta=mes==4 || mes==6 || mes==9 || mes==11;
        boolean ventiocho=mes==2 && !(año%4==0);
        boolean ventinueve=mes==2 && año%4==0;

        dia=(ventiocho || ventinueve)?
        ((ventinueve)?
        (int)Math.ceil(Math.random()*29):
        (int)Math.ceil(Math.random()*28)):
        (treinta)?
        (int)Math.ceil(Math.random()*30):
        (int)Math.ceil(Math.random()*31);
        LocalDate fecha=LocalDate.of(año, mes, dia);
        LocalDate finAño=LocalDate.of(año, 12, 31);
        System.out.println("Es el día "+fecha.format(formato));
        System.out.println("Faltan "+ChronoUnit.DAYS.between(fecha, finAño)+" diás para llegar al 31/12/"+año);
        ChronoUnit.DAYS.between(fecha, finAño);
    }
}
