import java.util.Scanner;
public class cadena {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Caracter: ");
        char car=sc.next().charAt(0);
        if (car=='s') {
            System.out.print("Entero1: ");
            int ent1=sc.nextInt();
            System.out.print("Entero 2: ");
            int ent2=sc.nextInt();
            System.out.println((char)ent1+"-"+(char)ent2);    
        } else {
            System.out.println((int)car);    
        }
        sc.close();
        
    }
}
