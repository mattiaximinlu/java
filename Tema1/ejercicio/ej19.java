/*Ejercicio 19
Escribe un programa que declare 5 variables de tipo char . A continuación, crea
otra variable como cadena de caracteres y asígnale como valor la concatena-
ción de las anteriores 5 variables. Por último, muestra la cadena de caracteres
por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?
 */
public class ej19 {
    public static void main(String[] args) {
        char car1 = 'h';
        char car2 = 'o';
        char car3 = 'l';
        char car4 = 'a';
        char car5 = '!';
        String str = "" + car1 + car2 + car3 + car4 + car5;
        System.out.println(str);
    }
}
// hay que poner un str en los char, y por eso hay que crear primero el str, que
// no lo he hecho.