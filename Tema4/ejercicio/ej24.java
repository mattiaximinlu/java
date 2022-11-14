import java.util.Scanner;

public class ej24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Altura de la piramide: ");
        int h=sc.nextInt();
        sc.close();
        System.out.println("------------------------------------------------");
        for (int nFila = 0; nFila < h; nFila++) {
            for (int espacio = h-1-nFila; espacio > 0; espacio--) {
                System.out.print(" ");
            }
            for (int n = 1; n <= nFila+1; n++) {
                System.out.print(n);
            }
            for (int n = nFila; n > 0; n--) {
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
