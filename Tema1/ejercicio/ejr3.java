/*Ejercicio 3
Realiza un conversor de pesetas a pesetas. La cantidad de pesetas que se quiere
convertir debe ser introducida por teclado. */
import java.util.Scanner;
public class ejr3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Conversor de peseta a euro.");
        System.out.print("pesetas: ");
        float peseta=sc.nextFloat();

        float euro=peseta/(float)166.39;
        System.out.println(peseta+"Pts="+euro+"€");
        sc.close();
    }     
}
