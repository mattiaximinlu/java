import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] lista=new int[100];
        for (int i = 0; i < lista.length; i++) {
            lista[i]=(int)(Math.random()*21);
            System.out.print(lista[i]+" ");
        }
        System.out.println();
        System.out.print("Que numero quieres cambiar? ");
        int antes=sc.nextInt();
        System.out.print("Por que quieres cambiar?");
        int despues=sc.nextInt();
        sc.close();
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]==antes) {
                lista[i]=despues;
                System.out.print("\""+lista[i]+"\" ");
            } else {
                System.out.print(lista[i]+" ");
            }
        }
        System.out.println();
    }
}
