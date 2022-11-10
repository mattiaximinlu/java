import java.util.Scanner;

/*Ejercicio 5
Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b =
0). */
public class ej5 {
    public static void main(String[] args) {
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");

        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca el valor de a: ");
        float a = sc.nextFloat();
        System.out.print("Ahora introduzca el valor de b: ");
        float b = sc.nextFloat();
        sc.close();
        if (a==0 && b==0){
            System.out.println("x=infinito");
        }
        else if(a==0){
            System.out.println("Esa ecuación no tiene solución real.");
        }
        else{
            System.out.println("x="+(-b/a));
        }
    }
}
