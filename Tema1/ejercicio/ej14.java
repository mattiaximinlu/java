
/*Ejercicio 14
Dada la siguiente función:     y = ax2 + bx + c

Crea un programa que pida los coeficientes a, b y c, asi como el valor de x y calcule el valor resultante de y.
 */
import java.util.Scanner;

public class ej14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Segun la siguiente funcion: y = ax\u00B2 + bx + c");
        System.out.print("a vale: ");
        int a = sc.nextInt();
        System.out.print("b vale: ");
        int b = sc.nextInt();
        System.out.print("c vale: ");
        int c = sc.nextInt();
        System.out.print("x vale: ");
        int x = sc.nextInt();
        int y = a * x * x + b * x + c;
        System.out.println(a + "x\u00B2+" + b + "x+" + c + "=" + y);
        sc.close();
    }
}
