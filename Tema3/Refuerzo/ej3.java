/*Ejercicio 3

Escribe un programa en que dado un número del 1 a 7 escriba el correspon-
diente nombre del día de la semana. */
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero de la semana: ");
        int semana = sc.nextInt();
        sc.close();
        switch (semana) {
            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("miercoles");
                break;
            case 4:
            System.out.println("jueves");
                break;
            case 5:
                System.out.println("viernes");
                break;
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("domingo");
                break;
            default:
                System.out.println("No es un numero valido.");
        }
    }
}