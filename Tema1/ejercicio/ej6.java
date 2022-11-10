
/*Ejercicio 6
Realiza el programa que calcule la potencia al cubo de un número que el usuario introduzca:   X3
*/
import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número que quieres hacerlo al cubo: ");
        int numero = sc.nextInt();
        sc.close();
        System.out.println("-------------------------------------");
        System.out.println("El numero cubo de " + numero + " es " + numero * numero * numero);
    }
}