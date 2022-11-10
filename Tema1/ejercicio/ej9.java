
/*Ejercicio 9
Realiza un programa que devuelva si un número entero introducido es par o impar.
 */
import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int paridad = sc.nextInt();
        sc.close();
        System.out.println("-------------------------------------");
        if (paridad % 2 == 0) {
            System.out.println(paridad + " es un numero par");
        } else {
            System.out.println(paridad + " no es un numero par");
        }
    }
}