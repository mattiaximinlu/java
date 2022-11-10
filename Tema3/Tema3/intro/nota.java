
import java.util.Scanner;
public class nota {

    private static float preguntar(Scanner sc) {
        System.out.print("Nota: ");
        float nota=sc.nextFloat();
        return nota;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        float nota=preguntar(sc);
        while (nota>10 || nota<0){
            nota=preguntar(sc);
        }
        sc.close();
        
        if (nota<5) {
            System.out.println("Suspenso");
        }
        else if (nota<7){
            System.out.println("Aprobado");
        }
        else if (nota<9){
            System.out.println("Notable");
        }
        else if(nota<10){
            System.out.println("Sobre");
        }
        else{
            System.out.println("Matricula");
        }
    }
}