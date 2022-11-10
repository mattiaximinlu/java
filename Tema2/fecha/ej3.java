import java.util.Scanner;

/*
 Utilizando el texto siguiente realiza lo siguiente:
 
 Muchos años después,
 frente al pelotón de fusilamiento, el coronel Aureliano Buendia había de
 recordar aquella tarde remota en que su padre lo llevó a conocer el
 hielo. (Cien años de soledad. G. García Márquez).
 
 Mostrar la información del libro sabiendo que aparece despues del simbolo '('
 : "Libro: Cien años de soledad. G. García Márquez"
 Busca un número random entre 0 y el número total de caracters y muestralo por
 pantalla. El caracter en la posicion X es:
 Trocea el texto en palabras y devuelve la palabra que esté en la posición que
 indique un número aleatorio entre 0 y el número de palabras. -> La palabra en
 la posición x es: XXXX
 Preguntar :¿Como se llamaba el coronel? y si responde su nombre o su apellido
 o ambos, sin tener en cuenta las mayúsculas/minúsculas) indicar que se ha
 acertado la pregunta, en caso contrario, decir que no es esa la persona
 */
public class ej3 {
  public static void main(String[] args) {
    //he puesto los espacios al final que sino en el split, le detecta como una palabra unica (ejemplo: en vez de el cielo-> elcielo).
    String texto = ("Muchos años después, " +
            "frente al pelotón de fusilamiento, el coronel Aureliano Buendia había de " +
            "recordar aquella tarde remota en que su padre lo llevó a conocer el " +
            "hielo. (Cien años de soledad. G. García Márquez).");
    System.out.println(texto);
    int parentesiA = texto.indexOf("(");
    int parentesiC = texto.indexOf(")");
    System.out.println("Libro: " + texto.substring(parentesiA + 1, parentesiC));


    int longitud = texto.length();
    int pos = (int) Math.floor(Math.random() * longitud);
    System.out.println("El caracter en la posicion " + (pos + 1) + " es: \"" + texto.charAt(pos)+"\"");
    /*
      puedes usar la siguiente bucle para comprobar que letra está en cual posicion(empieza
      por 1, y tambien es por eso que ("X" es pos+1), ya que redondeado con floor es
      desde 0 hasta longitud sin incluir longitud.)
    */
    /*
      int p=1;
      while (longitud>p){
      System.out.print(p+""+texto.charAt(p-1)+" ");
      p=p+1;
      }
    */
    String[] split=texto.split(" ");
    int longitudSplit = split.length;
    int posSplit = (int) Math.floor(Math.random() * longitudSplit);
    System.out.println("La palabra en la posicion " + (posSplit + 1) + " es: \"" + split[posSplit]+"\"");
    /*
      int p=1;
      while (longitudSplit>p){
      System.out.print(p+""+split[p-1]+" ");
      p=p+1;
      }
    */
    Scanner sc=new Scanner(System.in);
    System.out.print("¿Como se llamaba el coronel? ");
    String nombre=sc.nextLine();
    sc.close();
    String nombreCoronel=split[10];
    String apellidoCoronoel=split[11];
    String nombreCompleto=nombreCoronel+" "+apellidoCoronoel;
    System.out.println(nombre.compareToIgnoreCase(nombreCompleto)==0||nombre.compareToIgnoreCase(nombreCoronel)==0||nombre.compareToIgnoreCase(apellidoCoronoel)==0?"Has acertado la pregunta.":"No es esa persona.");
  }
}