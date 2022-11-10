
/*Ejercicio 3
Partir un texto introducido por el usuario por la posición que tambien introduzca el usuario.
Mostrar las 2 partes de la cadena: “Parte izquierda xxxxx y parte derecha xxxxx”
 */
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una sequencia de caracteres: ");
        String str = sc.nextLine();
        System.out.print("Cual posición quieres cortar: ");
        int pos = sc.nextInt();
        int longitud = str.length();
        sc.close();
        if (pos <= longitud && pos > 0) {
            String car = str.charAt(pos - 1) + "";
            String[] split = str.split(car, 2);
            System.out.println("Por la izquierta está \"" + split[0] + "\" por la derecha hay \"" + split[1] + "\"");
        } else {
            System.out.println("Posicion invalida");
        }
    }
}