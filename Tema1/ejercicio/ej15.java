
/*Ejercicio 15
Un Biólogo necesita calcular el número de patas de distintas especies que esta estudiando y capturando:
Hormiga -> 6 patas
Arañas -> 8 patas
Cochinitas -> 14 patas
La aplicación debe preguntar por el número capturado de cada una de ellas y devolver el número total de patas.
 */
import java.util.Scanner;

public class ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantas hormigas has capturado? ");
        int hormiga = sc.nextInt();
        System.out.print("Cuantas Arañas has capturado? ");
        int araña = sc.nextInt();
        System.out.print("Cuantas Cochinitas has capturado? ");
        int cochinita = sc.nextInt();
        int total = hormiga * 6 + araña * 8 + cochinita * 14;
        System.out.println("En total hay " + total + " patas");
        sc.close();
    }
}
