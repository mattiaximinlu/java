import java.util.Scanner;

public class MenuFrase_MattiaLu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String frase="";
        char opcion;
        do {
            System.out.println("* Opción a - Añadir a la frase (añadiendo al final de la frase ya existente)\n"+
            "* Opción b - Indicar la ultima frase introducida (el programa escribirá la frase que el usuario está creando y analizando, si la frase está vacía indicarlo)\n"+
            "* Opción c - Indicar el número de palabras que tiene la frase\n"+
            "* Opción d - Indicar cuantas veces a aparece un carácter en la frase (deberá preguntar por el carácter a buscar, mostrar el número de veces que se repite dicho carácter y sus posiciones en la frase, da igual si está escrito en mayúscula o minúscula)\n"+
            "* Opción e - Limpiar frase\n"+
            "* Opción s - Salir");
            System.out.print("Opcion: ");
            opcion=sc.nextLine().charAt(0);
            boolean error=!(opcion=='a' || opcion=='b' || opcion=='c' || opcion=='e' || opcion=='d' || opcion=='s');
            if (error) {
                System.out.println("Ha habido un error, elige una opcion correcta");
            } else {
                switch (opcion) {
                    case 'a':
                        System.out.print("Introduce una frase: ");
                        String fraseUsuario=sc.nextLine();
                        frase+=fraseUsuario;
                        break;
                    case 'b':
                        if (frase.equals("")) {
                            System.out.println("La frase está vacía");
                        } else {
                            System.out.println(frase);    
                        }
                        break;
                    case 'c':
                        String[] palabra=frase.split(" ");
                        int vez=0;
                        for (String i : palabra) {
                            vez++;
                        }
                        System.out.println("Hay "+vez+" palabras.");
                        break;
                    case 'd':
                        System.out.print("Introduce un caracter: ");
                        char caracter=sc.nextLine().charAt(0);
                        int aparece=0;
                        for (int i = 0; i < frase.length(); i++) {
                            if (frase.charAt(i)==caracter) {
                                aparece++;
                            }
                        }
                        System.out.println("Aparece "+aparece+" veces.");
                        break;
                    case 'e':
                        frase="";
                        break;
                    case 's':
                        break;
                    default:
                    System.out.println("error");
                        break;
                }
                if (opcion!='s'){
                    System.out.print("Pulse ENTER para continuar.");
                    sc.nextLine();
                }
            }
        } while (opcion!='s');
        sc.close();
    }
}
