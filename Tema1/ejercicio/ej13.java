/*Ejercicio 13
Diseñar algoritmo que indique el tipo de usuario (normal o vip) que eres de una discoteca, según una serie de premisas. Para ser vip debes de ser socio y haber pagado las cuotas. también puedes ser vip si estás recomendado por otro usuario vip y además estás dentro del periodo de prueba.
El programa debe preguntar si el usuario es usuario vip, si tiene las cuotas al día, si está recomendado por alguien vip y si está dentro del periodo de prueba.  Indicando si por pantalla si el usuario es vip o no.
 */
import java.util.Scanner;
 public class ej13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Eres Very Important People? ");
        String vip=sc.nextLine();
        if (vip.equals("si")){
            System.out.print("Eres socio? ");
            String socio=sc.nextLine();
            System.out.print("Has pagado las cuotas? ");
            String cuota=sc.nextLine();
            if (socio.equals("si") && cuota.equals("si")){
                System.out.println("Bienvenido, Very Important people.");
            } else {
                System.out.print("Mmmmmmmm......pues, estas recomendado por un VIP? ");
                String recomendado=sc.nextLine();
                System.out.print("Estas en el periodo de prueba? ");
                String prueba=sc.nextLine();
                System.out.println(recomendado.equals("si") && prueba.equals("si")?"Bienvenido, Very Important people.":"NO ERES VIP");    
            }
        }else{
            System.out.println("Bienvenido, normal user.");
        }
        sc.close();
    }     
}