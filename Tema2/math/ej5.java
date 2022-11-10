
/*Ejercicio 5

Vamos a realizar un programa que pregunte por un número de segundos y nos diga en que minuto estamos.
Por ejemplo: 50 segundos -> minuto 1
                     130 segundos -> minuto 3
 */
import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Segundos: ");
        int seg = sc.nextInt();
        sc.close();
        int min = (int) (Math.ceil(seg / 60.0));
        System.out.println(seg + " segundo -> minuto " + min);
    }
}
