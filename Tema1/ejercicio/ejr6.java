/*Ejercicio 6
Escribe un programa que calcule el área de un triángulo. */
import java.util.Scanner;
public class ejr6 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce la base del triangulo: ");
        float b=sc.nextFloat();
        System.out.print("Introduce la altura del triangulo: ");
        float h=sc.nextFloat();
        sc.close();
        System.out.println("El area del triangulo es: "+b*h/2);
    }
    
}
