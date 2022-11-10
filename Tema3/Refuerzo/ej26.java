
import java.util.Scanner;

public class ej26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        float base=8f;
        float total;

        System.out.print("Número de entrada: ");
        int entrada=sc.nextInt();
        System.out.print("Día de la semana(1-7): ");
        int semana=sc.nextInt();
        System.out.print("¿Tienes tarjeta CineCampa?(s/n): ");
        sc.nextLine();
        char cine=sc.nextLine().charAt(0);
        sc.close();
        

        int descuento;
        if (cine=='s'){
            descuento=10;
        }else if(cine=='n'){
            descuento=0;
        }else{
            System.out.println("Error, se contará por 'n'");
            descuento=0;
        }
        
        System.out.println("Aqui tienes sus entradas. Gracias por su compra.");
        switch (semana) {
            case 4:
                if (entrada%2==1) {
                    System.out.println("Entrada pareja:\t\t\t"+ (entrada-1)/2);
                    System.out.println("Precio entrada por pareja:\t"+11+"€");
                    System.out.println("Entrada individuales:\t\t"+1);
                    System.out.println("Precio por individual:\t\t"+base+"€");
                    total=(entrada-1)/2*11+8;
                } else {
                    System.out.println("Entrada pareja: \t\t"+ entrada/2);
                    System.out.println("Precio entrada por pareja:\t"+11+"€");
                    total=entrada/2*11;
                }
                break;
            case 3:
                base=5;
            default:
                System.out.println("Entrada individuales\t\t"+entrada);
                System.out.println("Precio por individual\t\t"+base+"€");
                total=entrada*base;
                break;
        }


        System.out.println("Total: \t\t\t\t"+total+"€");
        System.out.println("Descuento: \t\t\t"+total*descuento/100+"€");
        System.out.println("A pagar: \t\t\t"+total*(100-descuento)/100+"€");
    }
}
