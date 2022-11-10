
/*Ejercicio 8
Realiza un programa que resuelva la pregunta de si el próximo año vas a ir de vacaciones y donde será: Si tienes dinero entonces puedes ir de vacaciones, la otra opción para poder ir de vacaciones es tener reserva y tener pasaporte en regla.
Para saber donde irás de vacaciones es sencillo: Puedes ir a la playa o la montaña y siempre iréis a la playa a no ser que tus 3 hijos quieran ir a la montaña.
 */
import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("El próximo año vas a ir de vacaciones? ");
        String vacaciones = sc.nextLine();
        String poder;
        if (vacaciones.equals("si")) {
            System.out.print("Tienes dinero? ");
            String dinero = sc.nextLine();
            if (dinero.equals("si")) {
                poder = "si";
            } else {
                System.out.print("Tienes reserva? ");
                String reserva = sc.nextLine();
                if (reserva.equals("si")) {
                    System.out.print("Tienes pasaporte en regla? ");
                    String pasaporte = sc.nextLine();
                    if (pasaporte.equals("si")) {
                        poder = "si";
                    } else {
                        poder = "no";
                    }
                } else {
                    poder = "no";
                }
            }
            if (poder.equals("si")) {
                System.out.print("Tus hijos quieren ir a la montaña?");
                String montaña = sc.nextLine();
                if (montaña.equals("si")) {
                    System.out.println("Perfecto vais a la montaña.");
                } else {
                    System.out.println("Pues, vais a la playa.");
                }
            } else {
                System.out.println("No podeis ir.");
            }
        } else {
            System.out.println("Pues.....adios. ");
        }
        sc.close();
    }
}
