import java.util.Scanner;

public class ej1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String frase, inversa, bien;
        do {
            System.out.print("Introduce una frase(salir con \"SALIR\"): ");
            frase=sc.nextLine();
            bien="";
            inversa="";
            if (!(frase.equals("SALIR"))) {
                //no distinguir mayuscula minuscula pero se puede salir solo con salir en mayuscula
                frase=frase.toLowerCase();
                for (int i = 0; i < frase.length(); i++) {
                    if (!(Character.isSpaceChar(frase.charAt(i)))) {
                        bien+=frase.charAt(i);    
                    }
                }
                for (int i = 0; i < frase.length(); i++) {
                    //obtener el ultimo caracter
                    if (!(Character.isSpaceChar(frase.charAt(frase.length()-i-1)))) {
                        inversa+=frase.charAt(frase.length()-i-1);    
                    }
                }
                System.out.print(bien.equals(inversa)?"Es":"No es");
                System.out.println(" palindroma");
            }
        } while (frase.equals("SALIR"));
        sc.close();
    }
    
}