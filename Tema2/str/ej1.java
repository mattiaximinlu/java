
/*Ejercicio 1
Lee de teclado un texto y devuelve por pantalla la cantidad de caracteres tiene dicho texto.
 */
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una sequencia de caracteres: ");
        String lenght = sc.nextLine();
        sc.close();
        System.out.println("-------------------------------------");
        System.out.println("Has introducido " + lenght.length() + " caracteres");
    }
}