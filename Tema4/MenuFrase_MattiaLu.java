import java.util.Scanner;

public class MenuFrase_MattiaLu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String frase="";
        String opcion="";
        do {
            System.out.println("------------------------------------------------------------------");
            System.out.println("* Opción a - Añadir a la frase\n"+
            "* Opción b - Indicar la ultima frase introducida\n"+
            "* Opción c - Indicar el número de palabras que tiene la frase\n"+
            "* Opción d - Indicar cuantas veces a aparece un carácter en la frase\n"+
            "* Opción e - Limpiar frase\n"+
            "* Opción s - Salir");
            System.out.print("Opcion: ");
            //evitar opcion vacia.
            opcion=sc.nextLine();
            switch (opcion) {
                case "a":
                    System.out.print("Introduce una frase: ");
                    String fraseUsuario=sc.nextLine();
                    frase+=fraseUsuario;
                    break;
                case "b":
                    System.out.println(frase.equals("")?"La frase está vacía":"La frase actual es: \""+frase+"\"");
                    break;
                case "c":
                    String[] palabra=frase.split(" ");
                    int vez=!frase.equals("")?palabra.length:0;
                    System.out.println("Hay "+vez+" palabras.");
                    break;
                case "d":
                    String usuario="";
                    do {
                        System.out.print("Introduce un caracter: ");
                        usuario=sc.nextLine();
                        if (usuario.length()==1) {
                            int aparece=0;
                            for (int i = 0; i < frase.length(); i++) {
                                if (usuario.compareToIgnoreCase(frase.charAt(i)+"")==0) {
                                    aparece++;
                                }
                            }
                            System.out.println("Aparece "+aparece+" veces.");
                        }else{
                            System.out.print("Ha habido un error. ");
                        }
                    } while (usuario.length()!=1);
                    break;
                case "e":
                    frase="";
                    System.out.println("Se ha limpiado la frase");
                    break;
                case "s":
                    break;
                default:
                    System.out.println("Esta frase no debería aparecer.");
                    break;
            }
            if (!(opcion.equals("s"))){
                System.out.println("------------------------------------------------------------------");
                System.out.print("Pulse ENTER para continuar.");
                sc.nextLine();
            }
        } while (!(opcion.equals("s")));
        sc.close();
    }
}
