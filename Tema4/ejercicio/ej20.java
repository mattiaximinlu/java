import java.util.Scanner;

public class ej20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Altura de la piramide: ");
        int h=sc.nextInt();
        sc.nextLine();
        System.out.print("Caracter: ");
        char caracter=sc.nextLine().charAt(0);
        sc.close();
        int pos1=h-1;
        int pos2=h-1;
        System.out.println("------------------------------------------------");
        for (int nFila = 0; nFila < h-1; nFila++) {
            for (int nColumna = 0; nColumna < h*2; nColumna++) {
                System.out.print(pos1==nColumna || pos2==nColumna?caracter:" ") ;
            }
            pos1=pos1-1;
            pos2=pos2+1;
            System.out.println();
        }
        for (int base = 0; base < h*2-1; base++) {
            System.out.print(caracter);
        }
        System.out.println();
    }
}
