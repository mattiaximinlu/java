import java.util.Scanner;

public class ej2_MattiaLu {
    public static void main(String[] args) {

        // pedir atributos
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuanto lo quieres alto: ");
        int h = sc.nextInt();
        sc.nextLine();
        System.out.println("Que quieres escribir: ");
        String cadena = sc.nextLine();
        sc.close();

        // preparar las cadenas
        String A = "", H = "";
        for (int vez = 0; vez < cadena.length() + 4; vez++) {
            A += "A";
            H += "H";
        }

        // realizar la figura
        for (int linea = 1; linea <= h * 2 + 1; linea++) {
            // linea en medio
            if (linea == h + 1) {
                System.out.println("XX" + cadena + "XX");
            } else {
                // segun si es par o impar escribe si es fila de A o de H
                System.out.println(linea % 2 == 1 ? A : H);
            }
        }
    }
}
