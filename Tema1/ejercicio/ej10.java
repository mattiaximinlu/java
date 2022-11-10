
/*Ejercicio 10
Escribe un programa que calcule el salario semanal de un empleado en base a
las horas trabajadas, a razón de 12 euros la hora.
 */
import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        final int salario = 12;
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantas horas has trabajado esa semana: ");
        int horas = sc.nextInt();
        sc.close();
        System.out.println("-------------------------------------");
        System.out.println("Tu salario semanal es: " + horas * salario);
    }
}