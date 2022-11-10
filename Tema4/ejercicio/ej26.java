import java.util.Scanner;

public class ej26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num=sc.nextInt();
        sc.nextLine();
        System.out.print("Introduce un digito: ");
        char digito=sc.nextLine().charAt(0);
        int digitoNum=Character.getNumericValue(digito);
        sc.close();
        int nuevonum=0;
        while (num!=0){
            int resta=num%10;
            nuevonum=nuevonum*10+resta;
            num=(num-resta)/10;
        }
        int pos=0;
        System.out.print("pos: ");
        while (nuevonum!=0){
            pos++;
            int resta=nuevonum%10;
            if (resta==digitoNum) {
                System.out.print(pos+" ");
            }
            nuevonum=(nuevonum-resta)/10;
        }
        System.out.println();
    }
}
