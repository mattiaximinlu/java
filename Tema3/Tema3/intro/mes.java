import java.util.Scanner;
public class mes {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Mes: ");
        String mes= sc.nextLine().toLowerCase();
        sc.close();
        switch (mes) {
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                System.out.println(mes+" tiene 31 dias");
                break;
            case "febrero":
            System.out.println(mes+" tiene 28 dias");
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                System.out.println(mes+" tiene 30 dias");
                break;
            default:
                System.out.println("No es un mes.");
        }
    }
}