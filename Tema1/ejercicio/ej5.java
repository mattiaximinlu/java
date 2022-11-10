
/*Ejercicio 5
Realiza el programa que calcule la multiplicación de 2 números decimales.
 */
import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("introduce el primer numero decimal que quieres multiplicar: ");
        float decimal1 = sc.nextFloat();
        System.out.print("introduce el segundo numero decimal que quieres multiplicar: ");
        float decimal2 = sc.nextFloat();
        sc.close();
        System.out.println("-------------------------------------");
        System.out.println("La multiplicacion de " + decimal1 + " y " + decimal2 + " es " + decimal1 * decimal2);
    }
}