import java.util.Scanner;
public class factura {
    public static void main(String[] args) {
//final delante para decir que la variable iva es definitiva y no se puede cambiar mas.
        final int iva= 21;
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce la base: ");
        float base=sc.nextFloat();
        sc.close();
        float total=base+(base/100)*iva;
        System.out.println(total);
    }   
}