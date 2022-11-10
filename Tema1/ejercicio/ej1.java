import java.util.Scanner;

/*Ejercicio 1:
Diseñar un programa que pida al usuario su nombre, un número entero, un número decimal 
la hora actual y los muestre por pantalla.

Ejemplo Salida:
Tu nombre es “Pepe”
El numero introducido es ‘55’ 
Y la hora introducida era las “12:34”
 */
public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String name = sc.nextLine();
        System.out.print("Introduce un numero entero: ");
        int entero = sc.nextInt();
        System.out.print("Introduce un numero decimal: ");
        float decimal = sc.nextFloat();
        System.out.print("Introduce la hora (XX:XX): ");
        String vasura = sc.nextLine();
        String hora = sc.nextLine();
        System.out.println("-------------------------------------");
        System.out.println(vasura + "Tu nombre es \"" + name + "\"\nEl numero introducido es: \"" + entero
                + "\"\nEl decimal introducido es: \"" + decimal + "\"\nLa hora introducida es: " + hora);
        sc.close();
    }
}