import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Altura ");
        int h = sc.nextInt();
        sc.close();
        if (h>26) {
            System.out.println("No puede superar de 26");
        } else {
            for (int i = 0; i < h; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print((char)(j+65));
                }
                System.out.println();
            }   
        }
    }
}
