import java.util.Scanner;
public class scanner{

    public static void main(String[]args)
    {
        Scanner prueba = new Scanner (System.in);
        System.out.println("introduce tu nombre: ");
        String nombre=prueba.nextLine();   
        System.out.println("introduce tu edad: "); 
        //hay que poner el int despues del string, no se sabe porque.
        int edad=prueba.nextInt();
        System.out.println("--------------------"); 
        System.out.println(nombre);
        System.out.println(edad);
        prueba.close();
    }
}