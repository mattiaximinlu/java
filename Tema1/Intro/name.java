import java.util.Scanner;

public class name {
         public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.print("Introduce tu nombre: ");
            String name=sc.nextLine();
            System.out.print("Introduce tu edad: ");
            int edad=sc.nextInt();
            System.out.print("Cuantos mides: ");
            float metros=sc.nextFloat();
            sc.close();
            int seg=edad*365*24*60*60;
//escribir la frase entera antes de imprimirlo por pantalla
/*          
\" <--para escribir comilla 
\n <-- salto de linea 
\t <-- tabulador 
*/
            String frase="Te llamas \""+name+"\"\nTienes "+edad+" años\t has vivido "+seg+" segundos y mides "+metros;
            System.out.println(frase);
         }
}