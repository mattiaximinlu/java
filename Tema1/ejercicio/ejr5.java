/*Ejercicio 5
Escribe un programa que calcule el área de un rectángulo. */
import java.util.Scanner;
public class ejr5 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce la base del rectangulo: ");
        float b=sc.nextFloat();
        System.out.print("Introduce la altura del rectangulo: ");
        float h=sc.nextFloat();
        sc.close();
        System.out.println("El area del rectangulo es: "+b*h);

    }
    
}
