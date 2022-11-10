
/*Ejercicio 7
Realiza el programa que calcule la longitud y el área de una circunferencia utilizando el valor de su radio introducido por el usuario.
(Debes de usar una constante para guardar el valor de pi)
Longitud = 2pi * radio
Área = pi * radio2 
*/
import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        final float pi = (float) 3.1415926;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el radio: ");
        int radio = sc.nextInt();
        sc.close();
        float Longitud = 2 * pi * radio;
        float area = pi * radio * radio;
        System.out.println("-------------------------------------");
        System.out.println("La area de una circunferencia con el radio " + radio + " es: " + area);
        System.out.println("La longitud de una circunferencia con el radio " + radio + " es: " + Longitud);
    }
}