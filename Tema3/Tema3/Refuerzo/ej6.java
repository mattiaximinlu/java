import java.util.Scanner;

/*Ejercicio 6
Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
una altura h. Aplica la fórmula t =
√2h
g
siendo g = 9.81m/s */
public class ej6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("h(m): ");
        float h=sc.nextFloat();
        sc.close();
        double t=Math.sqrt(2*h/9.81);
        System.out.println((h>0)?"Tarda "+t+" segundos":"No puedes poner un numero negativo");
    }
}
