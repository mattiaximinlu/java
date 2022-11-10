import java.util.Scanner;
public class mayoredad {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Introduce un \"1\" si tienes carnet: ");
        int carnet=sc.nextInt();
        System.out.print("Introduce tu edad: ");
        int edad=sc.nextInt();
        sc.close();
        boolean puede=(edad>=18 && carnet==1);
        if (puede){
            System.out.println("Puedes conducir");
        } else {
            System.out.println("No puedes conducir");
        }
    }
}