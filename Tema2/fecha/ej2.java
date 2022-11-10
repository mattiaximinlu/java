import java.util.Scanner;

/*
Vamos a simular un 1 contra 1 en baloncesto para ello necesitamos saber:

    Nombre del jugador atacante y del jugador defensor
    El % de acierto de 2  y de 3 del jugador atacante.
    El numero de veces que el jugador defensor logra hacer que su atacante falle (número de 0 a 10)
    Y si el jugador atacante decide tirar de 2 o de 3.
    

Para saber si mete canasta utilizaremos esta fórmula:

(numeroAlAzarAtaque * %AciertoTipoSeleccionado) > (numeroAlAzarDefensa * EficaciaDefensa * 10)

    Debes mostrar al finalizar el siguiente mensaje según

Ejemplo de salida:

El jugador "XXXXXXX" ha encestado de 2 sobre el jugador "YYYYYY" (xxx > yyyy)

El jugardor "XXXXXX" NO ha encestado contra el jugador "YYYYY" (xxxx< yyyyy) */
public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del atacante: ");
        String attack = sc.nextLine();
        System.out.print("Nombre del defensor: ");
        String defense = sc.nextLine();
        System.out.print("El atacante va a tirar de 2 o de 3: ");
        int tiro = sc.nextInt();
        System.out.print("% de acierto de " + tiro + " del jugador atancante: ");
        int acierto = sc.nextInt();
        System.out.print("El numero de veces que el jugador defensor logra hacer que su atacante falle (número de 0 a 10): ");
        int fallo = sc.nextInt();
        sc.close();

        double probAtt = Math.random() * acierto;
        double probDef = Math.random() * fallo * 10;
        System.out.println((probAtt > probDef)
                ? "El jugador \"" + attack + "\" ha encestado de " + tiro + " sobre el jugador \"" + defense + "\"" +
                        "(" + (probAtt) + ">" + (probDef) + ")"
                : "El jugardor \"" + attack + "\" NO ha encestado contra el jugador \"" + defense + "\"" +
                        "(" + (probAtt) + "<" + (probDef) + ")");
    }
}