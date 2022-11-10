
/*Ejercicio 11
Realiza un programa que calcule la nota que hace falta sacar en el segundo
examen de la asignatura Programación para obtener la media deseada. Hay
que tener en cuenta que la nota del primer examen cuenta el 40% y la del
segundo examen un 60%.
Ejemplo 1:
Introduce la nota del primer examen: 7
¿Qué nota quieres sacar en el trimestre? 8.5
Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo examen.

Ejemplo 2:
Introduce la nota del primer examen: 8
¿Qué nota quieres sacar en el trimestre? 7
Para tener un 7 en el trimestre necesitas sacar un 6.33 en el segundo examen.
 */
import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la nota del primer examen: ");
        float notaP = sc.nextFloat();
        System.out.print("¿Qué nota quieres sacar en el trimestre?: ");
        float notaF = sc.nextFloat();
        sc.close();
        float valeP = notaP * 40 / 100;
        float valeS = notaF - valeP;
        float notaS = valeS * 100 / 60;
        System.out.println(
                "Para tener un " + notaF + " en el trimestre necesitas sacar un " + notaS + " en el segundo examen.");
    }
}
