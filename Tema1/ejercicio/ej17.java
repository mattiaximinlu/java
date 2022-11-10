/*Ejercicio 17
Escribe un programa que calcule el volumen de un cono según la fórmula 
V =⅓ πr2h 
El usuario debe introducir el valor de r y h
 */
import java.util.Scanner;
 public class ej17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Radio del cono(cm):  ");
        int r=sc.nextInt();
        System.out.print("Altura del cono(cm):  ");
        int h=sc.nextInt();

        float V=3.1415926f*r*r*h/3;
        System.out.println("El volume del cono es: "+V+"cm\u00B3");
        sc.close();
    }     
}