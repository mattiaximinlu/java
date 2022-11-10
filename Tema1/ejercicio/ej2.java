
/*Ejercicio 2:
Diseñar un programa que pida al usuario su edad y muestre la que tendrá el pŕoximo año.
 */
import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String name = sc.nextLine();
        System.out.print("Cuantos años tienes ahora: ");
        int edad = sc.nextInt();
        sc.close();
        System.out.println("-------------------------------------");
        System.out.println("Tu nombre es \"" + name + "\"\nEl proximo año vas a cumplir " + (edad + 1) + " años");
    }

}