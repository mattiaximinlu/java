import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        int vez=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        long num=sc.nextLong();
        sc.close();
        while (num>=1) {
            num=num/10;
            vez=vez+1;
        }
        System.out.println("El número introducido tiene "+vez+" digito");
    }
}
