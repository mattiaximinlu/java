
/*Ejercicio 3:
Diseñar un programa que pida al usuario su fecha de nacimiento (solo el año)  y calcule su edad a 1 de Enero.
 */
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("En que año naciste: ");
        int nacimiento = sc.nextInt();
        sc.close();
        System.out.println("-------------------------------------");
        System.out.println("Tienes " + (2022 - nacimiento) + " años");
    }
}