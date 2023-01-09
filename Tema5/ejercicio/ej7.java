import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        //creacion de la lista
        int[] lista=new int[100];
        for (int i = 0; i < lista.length; i++) {
            lista[i]=(int)(Math.random()*21);
            System.out.print(lista[i]+" ");
        }

        //pedir valores
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.print("Que numero quieres cambiar? ");
        int antes=sc.nextInt();
        System.out.print("Por que quieres cambiar? ");
        int despues=sc.nextInt();
        sc.close();

        //imprimir la lista sustituyendo los valores
        for (int i = 0; i < lista.length; i++) {
            //cambiar los valores

            /* if (lista[i]==antes) {
                lista[i]=despues;
                System.out.print("\""+lista[i]+"\" ");
            } else {
                System.out.print(lista[i]+" ");
            } */


            //imprimir el nuevo valor sin cambiarlo
            System.out.print(lista[i]==antes?"\""+despues+"\" ":lista[i]+" ");
        }
        System.out.println();
    }
}
