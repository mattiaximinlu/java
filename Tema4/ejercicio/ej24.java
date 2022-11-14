import java.util.Scanner;

public class ej24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Altura de la piramide: ");
        int h=sc.nextInt();
        sc.close();
        int inicio=h-1;
        int fin=h-1;
        System.out.println("------------------------------------------------");
        for (int nFila = 0; nFila < h; nFila++) {
            int num=1;
            boolean noReves=true;
            for (int nColumna = 0; nColumna < h*2-1; nColumna++) {
                if (inicio<=nColumna && nColumna<=fin) {
                    System.out.print(num);
                    if (num<=nFila && noReves) {
                        num++;    
                    } else {
                        num--;
                        noReves=false;
                    }
                } else {
                    System.out.print(" ");
                }
            }
            inicio=inicio-1;
            fin=fin+1;
            System.out.println();
        }
    }
}
