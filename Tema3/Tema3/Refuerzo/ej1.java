import java.util.Scanner;

/*Ejercicio 1
Escribe un programa que pida por teclado un día de la semana y que diga qué
asignatura toca a primera hora ese día. */
public class ej1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Día de la semana: ");
        String semana=sc.nextLine().toLowerCase();
        sc.close();
        switch (semana){
            case "lunes":
                System.out.println("A primera hora toca programacion");
                break;
            case "martes":
            case "viernes":
                System.out.println("A primera hora toca base de datos");
                break;
            case "miercoles":
                System.out.println("A primera hora toca FOL");
                break;
            case "jueves":
                System.out.println("A primera hora toca Sistema Informatico");
                break;
            case "sabado":
            case "domingo":
                System.out.println("No hay clase");
                break;
            default:
                System.out.println("No es un dia de la semana");
        }
    }
}
