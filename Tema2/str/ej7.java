/*
 * Lee de teclado un carácter e indica si es un dígito, si es un espacio en
 * blanco y si es un carácter en mayúscula. Realiza este ejercicio utilizando la
 * clase Character
 */
import java.util.Scanner;
public class ej7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce un carácter: ");
        char car=sc.nextLine().charAt(0);
        sc.close();
        if (Character.isDigit(car)){
            System.out.println("Es un número");
        }else{
            if (Character.isSpaceChar(car)) {
                System.out.println("Es un espacio");
            } else {
                if (Character.isUpperCase(car)) {
                    System.out.println("Es un carácter en mayuscula");
                } else {
                    System.out.println("No es ni número, ni espacio, ni un carácter en mayuscula");
                }
            }
        }
    }
    
}
