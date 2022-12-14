
/*Buscar las apariciones de un texto que el usuario debe introducir sobre el texto de la variable str.
 */
import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = 0;
        final String str = "“En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor. Una olla de algo más vaca que carnero, salpicón las más noches, duelos y quebrantos los sábados, lantejas los viernes, algún palomino de añadidura los domingos, consumían las tres partes de su hacienda. El resto della concluían sayo de velarte, calzas de velludo para las fiestas, con sus pantuflos de lo mesmo, y los días de entresemana se honraba con su vellorí de lo más fino. Tenía en su casa una ama que pasaba de los cuarenta y una sobrina que no llegaba a los veinte, y un mozo de campo y plaza que así ensillaba el rocín como tomaba la podadera. Frisaba la edad de nuestro hidalgo con los cincuenta años. Era de complexión recia, seco de carnes, enjuto de rostro, gran madrugador y amigo de la caza. Quieren decir que tenía el sobrenombre de «Quijada», o «Quesada», que en esto hay alguna diferencia en los autores que deste caso escriben, aunque por conjeturas verisímiles se deja entender que se llamaba «Quijana». Pero esto importa poco a nuestro cuento: basta que en la narración dél no se salga un punto de la verdad.”)";
        System.out.println(str);
        System.out.print("Que palabra quieres buscar: ");
        final String busca = sc.nextLine();
        sc.close();
        String res = "la letra \"" + busca + "\" está en la posicion(empieza por 0): ";
        pos = str.indexOf(busca, pos);
        while (pos != -1) {
            res = res + pos + " ";
            pos = str.indexOf(busca, pos + 1);
        }
        System.out.println(res);
    }

}
