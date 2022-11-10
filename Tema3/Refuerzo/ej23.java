import java.util.Scanner;

public class ej23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce la base imponible: ");
        float base=sc.nextFloat();
        System.out.print("Introduce el tipo de IVA(general,reducido,superreducido): ");
        String iva=sc.nextLine();
        iva=sc.nextLine();
        float ivaAplicado;
        switch (iva) {
            case "general":
                ivaAplicado=21;
                break;
            case "reducido":
                ivaAplicado=10;
                break;
            case "superreducido":
                ivaAplicado=4;
                break;
            default:
                ivaAplicado=21;
                System.out.println("Error, se contará como IVA general.");
                break;
        }
        System.out.print("Introduce el codigo promocional(nopro,mitad,meno5,5porc): ");
        String cod=sc.nextLine();
        sc.close();
        float codAplicado;
        switch (cod) {
            case "nopro":
                codAplicado=0;
                break;
            case "reducido":
                codAplicado=base/2;
                break;
            case "meno5":
                codAplicado=base-5;
                break;
            case "5porc":
                codAplicado=base*5/100;
                break;
            default:
                codAplicado=0;
                System.out.println("Error, se contará como nopro.");
                break;
        }
        System.out.println("Base imponible: "+base);
        System.out.println("IVA: "+ivaAplicado);
        System.out.println("Precio con IVA: "+(base-ivaAplicado));
        System.out.println("Cód. promo.: "+codAplicado);
        System.out.println("TOTAL: "+(base-ivaAplicado-codAplicado));
    }
}
