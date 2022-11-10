import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
/*Realiza un programa que pregunte la fecha y hora del examen de Programación.
Dada dicha fecha:

    Muéstrala en el formato: "El examen será el LUNES, 15 de MAYO del 23"
    Indica cuantos horas quedan hasta ese día */
public class ej1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Cuando se hace el examen");
        System.out.print("Dia: ");
        int dia=sc.nextInt();
        System.out.print("Mes: ");
        int mes=sc.nextInt();
        System.out.print("Año: ");
        int año=sc.nextInt();
        System.out.println("Hora: ");
        int hora=sc.nextInt();
        System.out.println("Minuto: ");
        int min=sc.nextInt();
        sc.close();

        final DateTimeFormatter formato=DateTimeFormatter.ofPattern("EEEE',' dd 'de' MMMM 'del' YY");
        final LocalDateTime examen=LocalDateTime.of(año, mes, dia,hora,min);
        LocalDateTime ahora=LocalDateTime.now();
        long horas=ChronoUnit.HOURS.between(ahora, examen);

        System.out.println("El examen será el "+examen.format(formato));
        System.out.println("Quedan "+horas+" horas al examen");
    }
    
    
}
