
/*Ejercicios 2
Leer de teclado un texto y un número y buscar que letra está en dicha posición. Controlar que la posición no sobrepase la longitud del texto introducido.
 */
import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una sequencia de caracteres: ");
        String str = sc.nextLine();
        System.out.print("Cual posición quieres comprobar: ");
        int pos = sc.nextInt();
        int longitud = str.length();
        sc.close();
        if (pos <= longitud && pos > 0) {
            System.out.println("En la posicion " + pos + " está la letra " + str.charAt(pos - 1));
        } else {
            System.out.println("Posicion invalida");
        }
    }
}