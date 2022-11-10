/*Ejercicio 8
Amplía el programa anterior para que diga la nota del boletín (insuficiente,
suficiente, bien, notable o sobresaliente). */
import java.util.Scanner;
public class ej8 {
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
        String boletin="";
       
        if (media<5) {
            boletin="Insuficiente";
        }
        else if (media<7){
            boletin="Suficiente";
        }
        else if (media<9){
            boletin="Bien";
        }
        else if(media<10){
            boletin="Notable";
        }
        else{
            boletin="Sobresaliente";
        }
        System.out.println((nota1>=0 && nota2>=0 && nota3>=0)?"Media: "+media+" es un "+boletin:"No puedes introducir notas negativas");  
    }
}