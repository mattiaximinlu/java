import java.util.Scanner;

public class ej3_MattiaLu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        String frase = "";
        do {
            System.out.println("A) Introducir una cadena de caracteres (elimina la frase que hubiera y almacena la nueva)");
            System.out.println("B) Mostrar la cadena actual.");
            System.out.println("C) Pregunta por una cadena de caracteres y devuelve el número de apariciones de dicha cadena en la cadena principal y las posiciones que ocupa en la cadena principal.");
            System.out.println("D) Recorrer cada una de la palabras de la cadena principal en orden inverso y devolver por cada palabra: Si posición + la palabra + longitud la palabra.");
            System.out.println("E) Invertir las palabras de la cadena principal utilizando un bucle.");
            System.out.println("F) Salir");
            System.out.println("Elige una opcion: ");
            String opcion = sc.nextLine().toLowerCase();
            switch (opcion) {
                case "a":
                    System.out.print("Introduce una frase: ");
                    frase = sc.nextLine();
                    break;
                case "b":
                    System.out.println(frase.equals("") ? "\"La frase está vacía.\"" : frase);
                    break;
                case "c":
                    if (frase.equals("")) {
                        System.out.println("\"La frase está vacía.\"");
                    } else {
                        System.out.print("Que cadena de caracteres quieres buscar: ");
                        String buscar = sc.nextLine();
                        int pos = 0;
                        int vez = 0;
                        String res = "";

                        //buscar todos y almacer la posicion.
                        while (pos != -1) {
                            pos = frase.toLowerCase().indexOf(buscar.toLowerCase(), pos);
                            if (pos != -1) {
                                res += "\nAparece en la posición: " + pos;
                                pos++;
                                vez++;
                            }
                        }

                        //imprimir resultado
                        if (vez == 0) {
                            System.out.println("No se ha encontrado.");
                        } else {
                            System.out.println("La cadena: \"" + buscar + "\" aparece: " + vez + " vece" + (vez > 1 ? "s" : "")+res);// singular o plural?
                        }
                    }
                    break;
                case "d":
                    if (frase.equals("")) {
                        System.out.println("\"La frase está vacía.\"");
                    } else {
                        String[] palabra=frase.split(" ");
                        for (int i = palabra.length-1; i >=0; i--) {
                            System.out.println(i+1+"- "+palabra[i]+"("+palabra[i].length()+" letras)");
                        }
                    }
                    break;
                case "e":
                    if (frase.equals("")) {
                        System.out.println("\"La frase está vacía.\"");
                    } else {
                        String[] palabra=frase.split(" ");
                        System.out.print("La frase invertida es: ");
                        for (int i = palabra.length-1; i >=0; i--) {
                            System.out.print(" "+palabra[i]);
                        }
                    }
                    System.out.println();
                    break;
                case "f":
                    seguir=false;
                    break;
                default:
                System.out.println("Selecciona una opcion correcta. ");
                    break;
            }
        } while (seguir);
        sc.close();
    }
}
