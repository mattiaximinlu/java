import java.util.Scanner;

public class examenEj3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Tienes trabajo?(s): ");
        char trabajo=sc.nextLine().charAt(0);
        System.out.print("Tienes cuenta con nosotros?(s): ");
        char cuenta=sc.nextLine().charAt(0);
        System.out.print("Cuanto vale el piso? ");
        float piso=sc.nextFloat();
        System.out.print("Cuanto tienes ahorrado? ");
        float ahorrado=sc.nextFloat();
        boolean hipoteca=(trabajo=='s' && cuenta=='s')||(cuenta=='s'&& ahorrado/piso*100>=20) ||(ahorrado/piso*100>=50);
        System.out.println(hipoteca?"Tienes la hipoteca.":"No tienes la hipoteca");
        sc.close();
    }
}
