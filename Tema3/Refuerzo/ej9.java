/*Ejercicio 9
Realiza un programa que resuelva una ecuación de segundo grado (del tipo
ax2 + bx + c = 0). */
import java.util.Scanner;
public class ej9 {
    public static void main(String[] args) {
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax2 + bx + c= 0");

        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca el valor de a: ");
        float a = sc.nextFloat();
        System.out.print("Ahora introduzca el valor de b: ");
        float b = sc.nextFloat();
        System.out.print("Ahora introduzca el valor de c: ");
        float c = sc.nextFloat();
        sc.close();
        double b2=Math.pow(b,2);
        double raiz=b2-4*a*c;
        if (raiz<0){
            System.out.println("Esa ecuación no tiene solución real.");
        }
        else if(-b+Math.sqrt(raiz)==0 && -b-Math.sqrt(raiz)==0&& a==0){
            System.out.println("x1=infinito");
            System.out.println("x2=infinito");
        }
        else if(-b+Math.sqrt(raiz)==0 && a==0){
            System.out.println("x1=infinito");
            System.out.println("Esa ecuación no tiene solución real.");
        }
        else if(-b-Math.sqrt(raiz)==0 && a==0){
            System.out.println("Esa ecuación no tiene solución real.");
            System.out.println("x2=infinito");
        }
        else if(a==0){
            System.out.println("Esa ecuación no tiene solución real.");
        }
        else{
            System.out.println("x1="+((-b+Math.sqrt(raiz))/(2*a)));
            System.out.println("x2="+((-b-Math.sqrt(raiz))/(2*a)));
        }
    }
}
