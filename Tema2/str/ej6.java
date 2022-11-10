
/*Dado el texto “En la casa de Juan estaban Pedro, Luis y Mario, todos jugando al Formite”
Debes de crear un programa que pregunte ¿Quién estaba en casa de Juan? y según la respuesta del usuario indique si esa persona estaba o no. 
Cuidado: el usuario al introducir el nombre de la persona puede hacerlo con minúsculas o mayúsculas pero el resultado no debe alterarse.
 */
import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String pedro = "Pedro";
        final String luis = "Mario";
        final String mario = "Mario";
        final String str = "“En la casa de Juan estaban" + pedro + ", " + luis + "y " + mario
                + ", todos jugando al Formite”";
        System.out.println(str);
        System.out.print("¿Quién estaba en casa de Juan? ");
        String busca = sc.nextLine();
        sc.close();
        if (busca.compareToIgnoreCase(pedro) == 0 || busca.compareToIgnoreCase(luis) == 0
                || busca.compareToIgnoreCase(mario) == 0) {
            System.out.println("Si, " + busca + " estaba en la casa de Juan");
        } else {
            System.out.println("No, " + busca + " no estaba en la casa de Juan");
        }

    }

}
