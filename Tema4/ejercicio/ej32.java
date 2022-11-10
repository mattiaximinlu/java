import java.util.Scanner;

public class ej32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num=sc.nextInt();
        sc.nextLine();
        sc.close();
        int nuevonum=0;
        while (num!=0){
            int resta=num%10;
            nuevonum=nuevonum*10+resta;
            num=(num-resta)/10;
        }
        int tot=0;
        System.out.print("Digitos pares: ");
        while (nuevonum!=0){
            int resta=nuevonum%10;
            if (resta%2==0) {
                System.out.print(resta+" ");
                tot=tot+resta;
            }
            nuevonum=(nuevonum-resta)/10;
        }
        System.out.println();
        System.out.println("Suma de los digitos pares: "+tot);
    }
}
