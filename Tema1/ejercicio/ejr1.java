/*Ejercicio 1
Realiza un programa que pida dos números y que luego muestre el resultado
de su multiplicación. */
import java.util.Scanner;
 public class ejr1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce el primer numero:  ");
        float num1=sc.nextFloat();
        System.out.print("Introduce el segundo numero:  ");
        float num2=sc.nextFloat();

        float multiplicación=num1*num2;
        System.out.println("La moltiplicacion de "+num1+" y "+num2+" es "+multiplicación);
        sc.close();
    }     
}
