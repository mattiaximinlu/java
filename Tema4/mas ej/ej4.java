import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Factor: ");
        int factor=sc.nextInt();
        sc.nextLine();
        //simulacion de numeros muy muy grandes y que dé muchas vueltas
        factor=factor%26;
        System.out.print("frase: ");
        String frase=sc.nextLine();
        sc.close();
        String cifrado="";
        for (int i = 0; i < frase.length(); i++) {
            char letra=(char)(frase.charAt(i)+factor);
            //comprobar que la letra esté entre A y Z y si una vez sumado supera la Z resta de 26, lo mismo con las minusculas
            if ((frase.charAt(i)>65 && frase.charAt(i)<65+26 &&letra>65+26)||(frase.charAt(i)>97 && frase.charAt(i)<97+26 &&letra>97+26)) {
                letra-=26;
            }
            cifrado+=letra;
        }
        System.out.println(factor+cifrado);
    }
}
