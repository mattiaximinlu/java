
/* Pedir fecha de nacimiento
 * Mostrar en pantallla: dia, mes con letra, yy
 * mostrar edad
 * cuanto queta para tu proximo cumpleaño con period y chronounit
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ej {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dia de nacimiento: ");
        int dia = sc.nextInt();
        System.out.print("Mes de nacimiento: ");
        int mes = sc.nextInt();
        System.out.print("Año de nacimiento: ");
        int año = sc.nextInt();
        sc.close();
        final DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd, MMMMM, yy");
        final LocalDate nac = LocalDate.of(año, mes, dia);
        final LocalDate act = LocalDate.now();
        int edad=(int)ChronoUnit.YEARS.between(nac, act);
        LocalDate proxCumple=nac.plusYears(edad+1);
        int proxCumpleDia=(int)ChronoUnit.DAYS.between(act, proxCumple);
        System.out.println("Fecha de nacimiento: "+nac.format(formato));
        System.out.println("Tienes "+edad+" años");
        System.out.println("Tu proximos cumple lo cumplirás en "+proxCumpleDia+" dias");
    }
}
