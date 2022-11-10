/*Ejercicio 2

Realiza un programa que realice el exponencial de un número por otro número. Ambos números deben ser introducidos por teclado.
 */
import java.util.Scanner;
public class ej2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num=sc.nextInt();
        System.out.print("Introduce el exponencial: ");
        int exp=sc.nextInt();
        sc.close();
        int res=(int)Math.pow(num,exp);
        System.out.println(num +" elevado a la "+ exp +" es "+res);

    }
}
