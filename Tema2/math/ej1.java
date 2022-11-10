/*Ejercicio 1

Realiza un programa que dado un número decimal escriba su valor absoluto.
 */
import java.util.Scanner;
public class ej1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce un número decimal: ");
        float num=sc.nextFloat();
        sc.close();
        num=Math.abs(num);
        System.out.println(num);
    }
}
