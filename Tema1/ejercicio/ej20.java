
/*
 * Y uno más…Ejercicio 20
 * Se quiere realizar un programa que calcule la nota media de un alumno según
 * la nota de cada uno de los trimestres.Además indicará si tienes derecho a
 * beca o no según esta premisa: La nota media es mayor o igual a 8 y su renta
 * es menor a 20.000o su nota es mayor o igual a 5 y su renta es menor a 4000€
 */
import java.util.Scanner;

public class ej20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota 1ºtrimestre: ");
        float nota1 = sc.nextFloat();
        System.out.print("Nota 2ºtrimestre: ");
        float nota2 = sc.nextFloat();
        System.out.print("Nota 3ºtrimestre: ");
        float nota3 = sc.nextFloat();
        System.out.print("Renta: ");
        float renta = sc.nextFloat();
        sc.close();
        float media = (nota1 + nota2 + nota3) / 3;

        System.out.println(((media >= 8) && (renta < 20000)) || (media >= 5) && (renta < 4000) ? "Puedes pedir la beca"
                : "No puedes pedir la beca");
    }
}
