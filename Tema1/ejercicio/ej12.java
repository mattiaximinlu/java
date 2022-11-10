
/*Ejercicio 12
Diseñar algoritmo que nos indique si podemos salir a la calle. Debemos tener en cuenta para tomar esa 
decisión los siguientes aspectos: Si esta lloviendo o no, si hemos terminado nuestras tareas.
 Existe una opción en la que indistintamente de lo anterior, podemos salir a la calle, es que vayamos
  a ir a la biblioteca ( a realizar algún trabajo o estudiar). 
El programa debe pedir al usuario si llueve, si ha finalizado las tareas y si necesita ir
 a la biblioteca y mostrar si puede o no ir a la biblioteca.
 */
import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vas a la biblioteca? ");
        String biblioteca = sc.nextLine();
        if (biblioteca.equals("si")) {
            System.out.println("Puedes ir a la biblioteca.");
        } else {
            System.out.print("Esta lloviendo? ");
            String lluvia = sc.nextLine();
            if (lluvia.equals("si")) {
                System.out.println("Pues, no salga.");
            } else {
                System.out.print("Has terminado las tareas de programacion? ");
                String tarea = sc.nextLine();
                System.out.println((tarea.equals("si")) ? "Puedes salir" : "No puedes salir.");
            }
        }
        sc.close();
    }
}
