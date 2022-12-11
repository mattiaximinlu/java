import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("frase: ");
        String frase = sc.nextLine();
        sc.close();
        String cifrado = "";
        for (int i = 0; i < frase.length(); i++) {
            char letraPos = frase.charAt(i);
            int factor = (int) (Math.random() * 26+1);
            if ((letraPos >= 'A' && letraPos <= 'Z')||(letraPos >= 'a' && letraPos <= 'z')){
                char letra = (char) (letraPos + factor);
                // comprobar que la letra esté entre A y Z y si una vez sumado supera la Z resta
                // de 26, lo mismo con las minusculas
                if ((letraPos >= 'A' && letraPos <= 'Z'&&letra > 'Z')||(letraPos >= 'a' && letraPos <= 'z'&&letra > 'z')){
                    letra -= 26;
                }
                cifrado += factor + "" + letra;
                //0para decir que se queda igual.
            }else{
                cifrado+="0"+letraPos;
            }
        }
        System.out.println(cifrado);
    }
}
