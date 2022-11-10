import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num=sc.nextInt();
        sc.close();
        long num1=0;
        long num2=1;
        long res;
        for (int i = 0; i < num; i++) {
            System.out.print(num1+" ");
            res=num1+num2;
            num1=num2;
            num2=res;
        }
        System.out.println();
    }
}
