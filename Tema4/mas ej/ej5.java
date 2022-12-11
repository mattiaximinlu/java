import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion,factor;
        String cifrado = "";
        char letra;
        do {
            System.out.println("(1)cifrar");
            System.out.println("(2)decifrar");
            System.out.println("(3)salir");
            System.out.print("opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("frase: ");
                    String frase = sc.nextLine();
                    cifrado = "";
                    for (int i = 0; i < frase.length(); i++) {
                        char letraPos = frase.charAt(i);
                        factor = (int) (Math.random() * 26);
                        if ((letraPos >= 'A' && letraPos <= 'Z')||(letraPos >= 'a' && letraPos <= 'z')){
                            letra = (char) (letraPos + factor);
                            // comprobar que la letra esté entre A y Z y si una vez sumado supera la Z resta
                            // de 26, lo mismo con las minusculas
                            if ((letraPos >= 'A' && letraPos <= 'Z'&&letra > 'Z')||(letraPos >= 'a' && letraPos <= 'z'&&letra > 'z')){
                                letra -= 26;
                            }
                            cifrado += factor + "" + letra;
                            //dice que será un zero y al decifrarlo se quedarán iguales incluido números
                        }else{
                            cifrado +="0"+letraPos;
                        }
                    }
                    System.out.println(cifrado);
                    break;
                case 2:
                    Boolean original=false;
                    factor=0;
                    String decifrado = "";
                    for (int i = 0; i < cifrado.length(); i++) {
                        char letraPos = cifrado.charAt(i);
                        if (Character.isDigit(letraPos)&&(!(letraPos=='0'&&factor==0))&&(!(original))) {
                            factor = factor * 10 + Character.getNumericValue(letraPos);
                            // comprobar que la letra esté entre A y Z y si una vez restado esté menor que A suma
                            // de 26, lo mismo con las minusculas
                        } else if(letraPos=='0'&&original==false){
                            original=true;
                        }else if(original){
                            decifrado +=letraPos;
                            original=false;
                        }else if ((letraPos >= 'A' && letraPos <= 'Z')||(letraPos >= 'a' && letraPos <= 'z')){
                            letra = (char) (letraPos - factor);
                            if ((letraPos >= 'A' && letraPos <= 'Z' && letra < 'A')||(letraPos >= 'a' && letraPos <= 'z'&&letra < 'a')){
                                letra += 26;
                            }
                            factor = 0;
                            decifrado +=letra;
                        }
                    }
                    System.out.println(decifrado);
                    break;
            }
        } while (opcion != 3);
        sc.close();
    }

}
