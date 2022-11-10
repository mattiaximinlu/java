import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ej30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Por favor, introduzca la primera hora. ");
        System.out.print("Semana: ");
        int semana1=sc.nextInt();
        System.out.print("Hora: ");
        int hora1=sc.nextInt();
        System.out.println("Por favor, introduzca la segonda hora. ");
        System.out.print("Semana: ");
        int semana2=sc.nextInt();
        System.out.print("Hora: ");
        int hora2=sc.nextInt();
        sc.close();
        DateTimeFormatter format=DateTimeFormatter.ofPattern("HH':00 del' EEEE");
        //el mes 5 del año 0, el dia 1 es lunes.
        LocalDateTime dia1=LocalDateTime.of(0,5,semana1,hora1,0);
        LocalDateTime dia2=LocalDateTime.of(0,5,semana2,hora2,0);
        long diferencia=ChronoUnit.HOURS.between(dia1, dia2);
        if (diferencia>=0) {
            System.out.println("Entre "+dia1.format(format)+" y las "+dia2.format(format)+" hay "+diferencia+" horas/s");
        } else {
            
        }
    }
}
