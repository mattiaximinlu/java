import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opcion;
        String cifrado="";
        int factor=0;
        do {
            System.out.println("(1)cifrar");
            System.out.println("(2)decifrar");
            System.out.println("(3)salir");
            System.out.print("opcion: ");
            opcion=sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:           
                        System.out.print("frase: ");
                        String frase=sc.nextLine();
                        cifrado="";
                        for (int i = 0; i < frase.length(); i++) {
                            char letraPos=frase.charAt(i);
                            factor=(int)(Math.random()*26);
                            char letra=(char)(letraPos+factor);
                            //comprobar que la letra esté entre A y Z y si una vez sumado supera la Z resta de 26, lo mismo con las minusculas
                            if ((letraPos>='A' && letraPos<='Z' &&letra>'Z')||(letraPos>='a' && letraPos<='z' &&letra>='z')) {
                                letra-=26;
                            }
                            cifrado+=factor+""+letra;
                        }
                        System.out.println(cifrado);
                    break;
                case 2:
                    factor=0;
                    String decifrado="";
                    for (int i = 0; i < cifrado.length(); i++) {
                        char letraPos=cifrado.charAt(i);
                        if (Character.isDigit(letraPos)) {
                            factor=factor*10+Character.getNumericValue(letraPos);
                        } else {
                            char letra=(char)(letraPos-factor);
                            //comprobar que la letra esté entre A y Z y si una vez restado es menor que A suma de 26, lo mismo con las minusculas
                            if ((letraPos>='A' && letraPos<='Z' &&letra<'A')||(letraPos>='a' && letraPos<='z' &&letra<'a')) {
                                letra+=26;
                            }
                            decifrado+=letra;
                            factor=0;
                        }
                    }
                    System.out.println(decifrado);
                    break;
            
                default:
                    break;
            }
        } while (opcion!=3);
        sc.close();        
    }

}
