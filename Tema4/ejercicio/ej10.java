import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int vez=0;
        double num;
        double tot=0;
        do {
            System.out.print("Introduce un número: ");
            num=sc.nextDouble();
            if (num<0) {
                break;
            } else {
                vez=vez+1;
                tot=num+tot;   
            }
        } while (true);
        sc.close();
        System.out.println("La media es: "+tot/vez);
    }
}
