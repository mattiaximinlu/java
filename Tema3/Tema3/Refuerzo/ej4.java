/*Ejercicio 4
Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
las horas extras. Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
la hora. */
import java.util.Scanner;
public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
        int hora = sc.nextInt();
        sc.close();
        if (hora>40){
            int salario=hora*16;
            System.out.println("El sueldo semanal que le corresponde es \""+hora+"horas * "+16+"€\": "+salario+"€");
        }else{
            int salario=hora*12;
            System.out.println("El sueldo semanal que le corresponde es \""+hora+"horas * "+12+"€\": "+salario+"€");
        }
    }
}