
/*
Ejercicio 16
Empresa de un parque de atracciones quiere una aplicación que les ayude al cobro de entradas a las familias que sacan las entradas.
Existen las entradas infantiles a 15,50€ y de adultos a 20€. En caso de que el importe sea mayor a 100€ se aplicará un descuento del 5%.
 */
import java.util.Scanner;

public class ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuanto niños hay? ");
        int niño = sc.nextInt();
        System.out.print("Cuantos adultos hay? ");
        int adulto = sc.nextInt();

        float cobro = niño * (float) 15.50 + adulto * 20;
        if (cobro > 100) {
            System.out.println("Son " + cobro * 0.95 + "€");
        } else {
            System.out.println("Son " + cobro + "€");
        }
        sc.close();
    }
}
