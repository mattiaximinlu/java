
/*Ejercicio 4
Dado un texto, reemplazar el carácter indicado por el usuario por otro caracter también indicado por el usuario.
 */
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una sequencia de caracteres: ");
        String str = sc.nextLine();
        System.out.print("Que quieres cambiar: ");
        String cambia = sc.nextLine();
        if (str.indexOf(cambia) != -1) {
            System.out.print("En que quieres cambiar: ");
            String cambiarEn = sc.nextLine();
            sc.close();
            System.out.println("La sequencia de caracteres se ha quedado en: " + str.replace(cambia, cambiarEn));
        } else {
            System.out.println("No se ha encontrado");
        }
    }
}