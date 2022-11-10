
/*
Ejercicio 8
Realiza el ejercicio 7 pero utilizando los códigos ASCII de los caracteres.
 */
import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("48-57:num");
        System.out.println("32:space");
        System.out.println("65-90:may");
        System.out.print("Introduce un número ASCII: ");
        int car = sc.nextInt();
        sc.close();
        if (Character.isDigit((char) car)) {
            System.out.println("Es un número: " + (char) car);
        } else {
            if (Character.isSpaceChar((char) car)) {
                System.out.println("Es un espacio");
            } else {
                if (Character.isUpperCase((char) car)) {
                    System.out.println("Es un carácter en mayuscula: " + (char) car);
                } else {
                    System.out.println("No es ni número, ni espacio, ni un carácter en mayuscula");
                }
            }
        }
    }
}