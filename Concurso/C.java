import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int prueba=sc.nextInt();
        for (int k = 0; k < prueba; k++) {
            int nPuntuaciones=sc.nextInt();
            List<String> frase=new ArrayList<>();
            boolean error=false;
            while (!(nPuntuaciones>=1 &&nPuntuaciones<=20)){
                System.out.println("Error, try again(1-20).");
                nPuntuaciones=sc.nextInt();
            }
            sc.nextLine();
            for (int i = 0; i < nPuntuaciones; i++) {
                String puntuaciones=sc.nextLine();
                if (puntuaciones.length()!=3) {
                    error=true;
                }
                else{
                    for (int j = 0; j < puntuaciones.length(); j++) {
                        int pos=j+i+(i*j);
                        frase.add(pos,puntuaciones.charAt(j)+"");
                    }
                }
            }
            if (error==true) {
            } else {
                for (String letra : frase) {
                    System.out.print(letra);
                }
                System.out.println();
            }    
        }
        sc.close();
    }
}
