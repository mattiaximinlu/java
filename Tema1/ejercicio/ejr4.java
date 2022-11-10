/*Ejercicio 4
Escribe un programa que sume, reste, multiplique y divida dos números
introducidos por teclado. */
import java.util.Scanner;
public class ejr4 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce un número: ");
        float num1=sc.nextFloat();
        System.out.print("Introduce otro número: ");
        float num2=sc.nextFloat();
        sc.close();
        System.out.println("La suma de "+num1+" y "+num2+" es "+(num1+num2));
        System.out.println("La resta de "+num1+" y "+num2+" es "+(num1-num2));
        System.out.println("La moltiplicacion de "+num1+" y "+num2+" es "+num1*num2);
        System.out.println("La division de "+num1+" y "+num2+" es "+(int)(num1/num2)+" y resta "+num1%num2+" floated seria "+num1/num2);
    }
    
}
