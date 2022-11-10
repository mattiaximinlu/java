
/*Ejercicio 11

Realiza un programa que lea un dígito del 0 al 9 y muestre por pantalla el carácter  que ocupa dicha posición en una cadena interna.

Debes comprobar que se ha introducido un dígito, que no estamos buscando en una posición más grande que la longitud de la cadena y si estoy mostrando un espacio entonces mostrar la cadena “ESPACIO”
 */
import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        final String str="Hola Daniel!";
        int longitud=str.length()-1;
        if (longitud>9){
            longitud=9;
        }
        char num=' ';
        Scanner sc = new Scanner(System.in);
        while (!(Character.isDigit(num)) || (num-48>longitud)){
                System.out.print("Introduce número entre 0 y "+longitud+": ");
                num=sc.nextLine().charAt(0);
        }
        sc.close();
        if (Character.isSpaceChar(str.charAt(num-48))){
            System.out.println("ESPACIO");
        }
        else{
            System.out.println(str.charAt(num-48));
        }
    }
}
