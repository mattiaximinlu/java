
/*
 * Ejercicio 9
 * 
 * Dado el texto: “En la casa de Juan estaban Pedro, Luis y Mario, todos jugando
 * al Formite”
 * 
 * Realiza un programa que pregunte ¿Quién más estaba en casa de Juan? y el
 * texto que indique el usuario debe de irse añadiendo antes de “y Mario”,
 * mostrando el resultado final de la frase.
 */
import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String str = " “En la casa de Juan estaban Pedro, Luis y Mario, todos jugando al Formite”";
        System.out.println(str);
        System.out.print("¿Quién más estaba en casa de Juan? ");
        String who = sc.nextLine();
        sc.close();
        StringBuffer strB = new StringBuffer(str);
        strB.insert(str.indexOf("Mario") - 3, ", " + who);
        System.out.println(strB);
    }

}
