/*Ejercicio 10
Realiza un conversor de Mb a Kb. */
import java.util.Scanner;
 public class ejr10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("conversor de Mb a Kb.");
        System.out.print("Mb: ");
        float Mb=sc.nextFloat();

        float Kb=Mb*1000;
        System.out.println(Mb+"Mb="+Kb+"Kb");
        sc.close();
    }     
}
