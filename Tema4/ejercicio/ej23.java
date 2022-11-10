import java.util.Scanner;

public class ej23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int vez=0;
        double num;
        double tot=0;
        do {
            System.out.print("Introduce un número: ");
            num=sc.nextDouble();
            vez=vez+1;
            tot=num+tot;
        } while (tot<10000);
        sc.close();
        System.out.println("Total acumulado: "+tot);
        System.out.println("Contador de número: "+vez);
        System.out.println("Media: "+tot/vez);
    }
}
