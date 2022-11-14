import java.util.Scanner;

public class ej23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int vez=0;
        float num;
        float tot=0;
        boolean seguir=true;
        while (seguir) {
            System.out.print("Introduce un número: ");
            num=sc.nextFloat();
            if (num+tot<10000) {
                vez=vez+1;
                tot=num+tot;
            } else {
                seguir=false;
            }
        }
        sc.close();
        System.out.println("-----------------------------");
        System.out.println("Total acumulado: "+tot);
        System.out.println("Contador de número: "+vez);
        System.out.println("Media: "+tot/vez);
    }
}
