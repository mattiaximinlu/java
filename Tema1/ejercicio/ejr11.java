/*Ejercicio 11
Realiza un conversor de Kb a Mb. */
import java.util.Scanner;
 public class ejr11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("conversor de Kb a Mb.");
        System.out.print("Kb: ");
        float Kb=sc.nextFloat();

        float Mb=Kb/1000;
        System.out.println(Kb+"Kb="+Mb+"Mb");
        sc.close();
    }     
}
