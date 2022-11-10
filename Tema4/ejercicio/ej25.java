import java.util.Scanner;

public class ej25 {
    /*Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés. */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num=sc.nextInt();
        sc.close();
        while (num!=0){
            int resta=num%10;
            System.out.print(resta);
            num=(num-resta)/10;
        }
        System.out.println();
    }
}
