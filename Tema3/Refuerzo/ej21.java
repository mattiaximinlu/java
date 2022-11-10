import java.util.Scanner;

public class ej21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nota 1: ");
        float nota1=sc.nextFloat();
        System.out.print("Nota 2: ");
        float nota2=sc.nextFloat();
        float media=(nota1+nota2)/2;
        if (media>=5){
            System.out.println("Tu nota media es "+media);
        }
        else{
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            String apto=sc.nextLine();
            apto=sc.nextLine();
            while (!(apto.equals("apto") || apto.equals("no apto"))){
                System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
                apto=sc.nextLine();
            }
            if (apto.equals("apto")) {
                System.out.println("Tu nota media es 5");
            } else {
                System.out.println("Tu nota media es "+media);
            }
        }
        sc.close();
    }
}