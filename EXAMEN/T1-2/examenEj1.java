import java.util.Scanner;

public class examenEj1 {
    public static void main(String[] args) {
        final String TEXTO = "El Viajero a través del Tiempo (pues convendrá llamarle así al hablar de él) nos exponía una misteriosa cuestión. Sus ojos grises brillaban lanzando centellas, y su rostro, habitualmente pálido, mostrábase "
                +
                "encendido y animado. El fuego ardía fulgurante y el suave resplandor de las lámparas incandescentes, en forma de lirios de plata, se prendía en las burbujas que destellaban y subían dentro de nuestras copas. "
                +
                "Nuestros sillones, construidos según sus diseños, nos abrazaban y acariciaban en lugar de someterse a que nos sentásemos sobre ellos; y había allí esa sibarítica atmósfera de sobremesa, cuando los pensamientos vuelan gráciles, libres de las trabas de la exactitud.(La maquina del tiempo, H.G.Wells)";
        // a) Encontrar el carácter que se encuentra en una posición aleatoria. Si es un
        // espacio mostrar espacio.
        int longitud = TEXTO.length();
        int pos = (int) (Math.random() * (longitud - 1));
        System.out.println((Character.isSpaceChar(TEXTO.charAt(pos)))?"En la posición " + pos + " hay un ESPACIO":"En la posición " + pos + " hay un \"" + TEXTO.charAt(pos) + "\"");
        // b) Leer un carácter y reemplazar todas las apariciones de 'e' por este nuevo
        // carácter.
        Scanner sc = new Scanner(System.in);
        System.out.print("En que caracter se cambiarán todas las \"e\"? ");
        char carácter = sc.nextLine().charAt(0);
        String textoCopia = TEXTO;
        textoCopia = textoCopia.replace(carácter, 'e');
        System.out.println(textoCopia);
        // c) Indica al usuario que indique una palabra y busca dicha palabra en el
        // texto. El programa debe indicar si está o no dicha palabra en el texto. Debe
        // de no distinguir entre mayúsculas y minúsculas
        System.out.print("Que palabra quieres buscar: ");
        String palabra=sc.nextLine();
        sc.close();
        textoCopia=TEXTO.toLowerCase();
        palabra=palabra.toLowerCase();
        System.out.println((textoCopia.indexOf(palabra)>=0)?"Hay esta palabra":"No hay esta palabra");
    }
}
