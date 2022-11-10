import java.util.Scanner;

public class ej18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce un número:");
        int num1=sc.nextInt();
        System.out.print("Introduce un número:");
        int num2=sc.nextInt();
        sc.close();
        if (num1<num2) {
        for (int i = num1; i < num2; i=i+7) {
            System.out.print(i+" ");
        }
        } else {
        for (int i = num2; i < num1; i=i+7) {
            System.out.print(i+" ");
        }
        }
        System.out.println();
    }
    
}
