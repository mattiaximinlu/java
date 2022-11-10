import java.util.Scanner;

public class ej28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
        String jug1 = sc.nextLine().toLowerCase();
        if (jug1.equals("piedra") || jug1.equals("papel") || jug1.equals("tijera")) {
            int num=(int)(Math.random()*3);
            String bot;
            switch (num){
                case 0:
                    bot="piedra";
                    break;
                case 1:
                    bot="tijera";
                    break;
                case 2:
                    bot="papel";
                    break;
                default:
                    bot="error";
            }
            System.out.println("El bot ha sacado: "+bot);
            if (jug1.equals(bot)) {
                System.out.println("Empate");
            } else if ((jug1.equals("piedra") && bot.equals("tijera"))
                    || (jug1.equals("papel") && bot.equals("piedra"))
                    || (jug1.equals("tijera") && bot.equals("papel"))) {
                System.out.println("Gana el jugador");
            } else {
                System.out.println("Gana el bot");
            }
        } else {
            System.out.println("Error");
        }
        sc.close();
    }
}
