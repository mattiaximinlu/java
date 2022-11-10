
/*Ejercicio 4:
Modifica el programa anterior para que calcule la edad del usuario en una fecha que el usuario debe de introducir. (Solo con los años)
 */
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("En que año naciste: ");
        int añoNacimiento = sc.nextInt();
        System.out.print("En que año Estamos: ");
        int añoActual = sc.nextInt();
        sc.close();
        System.out.println("-------------------------------------");
        System.out.println("Tienes " + (añoActual - añoNacimiento) + " años");
    }
}