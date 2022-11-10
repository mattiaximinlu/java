import java.util.Scanner;

/*Ejercicio 7
Realiza un programa que calcule la media de tres notas. */
public class ej7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nota1: ");
        float nota1=sc.nextFloat();
        System.out.print("Nota2: ");
        float nota2=sc.nextFloat();
        System.out.print("Nota3: ");
        float nota3=sc.nextFloat();
        sc.close();
        float media=(nota1+nota2+nota3)/3;
        System.out.println((nota1>=0 && nota2>=0 && nota3>=0)?"Media: "+media:"No puedes introducir notas negativas");
    }
}
