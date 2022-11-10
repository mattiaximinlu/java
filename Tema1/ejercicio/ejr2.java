/*Ejercicio 2
Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
convertir debe ser introducida por teclado.
 */
import java.util.Scanner;
public class ejr2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Conversor de euro a pesetas.");
        System.out.print("euros: ");
        float euro=sc.nextFloat();

        float peseta=euro*(float)166.39;
        System.out.println(euro+"€="+peseta+"Pts");
        sc.close();
    }     
}
