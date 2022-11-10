
import java.util.Scanner;

public class semana {
    public static void main(String[] args) {
        int res = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dia de la semana: ");
        String resSemana = sc.nextLine().toLowerCase();
        sc.close();
        switch (resSemana) {
            case "lunes":
                res++;
            case "martes":
                res += 1;
            case "miercoles":
                res = res + 1;
            case "jueves":
                res++;
            case "viernes":
                res++;
                System.out.println("TRABAJAAAAAAAAAA quedan " + res + " dias hasta el finde");
                break;
            case "sabado":
            case "domingo":
                System.out.println("FIESTAAA");
                break;
            default:
                System.out.println("No es un dia de la semana.");
        }
    }
}