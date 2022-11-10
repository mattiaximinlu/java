import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        final int PASSWORD=1234;
        int intento=0;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.print("Introduce una combinacion de 4 cifras: ");
            int combinacion=sc.nextInt();
            if (combinacion==PASSWORD) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                break;
            } else {
                System.out.println("Lo siento, esa no es la combinación");
            }
            intento++;
        } while (intento<4);
        sc.close();
    }
}
