import java.util.Scanner;

public class Tande_de_Penalti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cual es tu nombre? ");
        String nombre = sc.nextLine();
        // resultado
        String jugador = "-----";
        String cpu = "-----";
        // numGol
        int golJugador = 0;
        int golCpu = 0;
        // ronda
        int penalti = 1;
        System.out.println("\nEMPEZA LA TANDA DE PENALTIS\n");
        do {
            //turno jugador
            if (penalti % 2 == 1) {
                int tiradaJugador;
                int paradaCpu = (int) (Math.random() * 3 + 1);
                do {
                    System.out.println(nombre + " tira (1 (izquierda), 2 (derecha) o 3 (centro))");
                    tiradaJugador = sc.nextInt();
                } while (tiradaJugador < 1 || tiradaJugador > 3);

                //fallo
                int fallo = (int) (Math.random() * 10);
                if (fallo < 2) {
                    System.out.println(nombre + " ha tirado fuera");
                    jugador = jugador.replaceFirst("-", "O");
                }else{
                    if (tiradaJugador == paradaCpu) {
                        jugador = jugador.replaceFirst("-", "O");
                        System.out.println("-PARADA-");
                    } else {
                        jugador = jugador.replaceFirst("-", "X");
                        System.out.println("-GOl-");
                        golJugador++;
                    }
                }
            //turno CPU
            } else {
                int paradaJugador;
                int tiradaCpu = (int) (Math.random() * 3 + 1);
                do {
                    System.out.println(nombre + " intenta parar (1 (izquierda), 2 (derecha) o 3 (centro))");
                    paradaJugador = sc.nextInt();
                } while (paradaJugador < 1 || paradaJugador > 3);
                if (paradaJugador == tiradaCpu) {
                    cpu = cpu.replaceFirst("-", "O");
                    System.out.println("-PARADA-");
                } else {
                    cpu = cpu.replaceFirst("-", "X");
                    System.out.println("-GOl-");
                    golCpu++;
                }
            }
            System.out.println(nombre + "\t" + jugador);
            System.out.println("CPU" + "\t" + cpu);
            // despues de las cincos rondas y que cpu haya tirado ya, añade los guiones, si
            // no hubiera un empate sale directamente, y se añaden despues de que se
            // muestren los resultados.
            if (penalti >= 10 && penalti % 2 == 0) {
                jugador += "-";
                cpu += "-";
            }
            penalti++;
            // se repite cuando hay un empate, cuando no ha cumpletado las 5 penaltis cada
            // uno y cuando tire el jugador, osea que cpu no ha tirado todavia
        } while (golJugador == golCpu || penalti % 2 == 0 || penalti < 10 );
        sc.close();
    }
}
