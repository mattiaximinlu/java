import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Aforo maximo: ");
        int aforo=sc.nextInt();
        System.out.print("Precio entrada: ");
        float precio=sc.nextFloat();
        System.out.print("Número de entrada vendida: ");
        int vendido=sc.nextInt();
        sc.close();
        if ((float)vendido/aforo*100<=20) {
            System.out.println("Anulado");
        } else if((float)vendido/aforo*100<=50){
            precio=precio*3/4;
            System.out.println("Se ha recaudad "+precio*vendido+"€");
        }else{
            System.out.println("Se ha recaudad "+precio*vendido+"€");
        }
        
    }
}
