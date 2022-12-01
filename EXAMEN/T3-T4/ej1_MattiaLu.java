import java.util.Scanner;

public class ej1_MattiaLu {
    public static void main(String[] args) {
        // precio
        final double PLATO1 = 5;
        final double PLATO2 = 4;
        final double PLATO3 = 4.5;
        final double PLATO4 = 6;
        final double PLATO5 = 8;
        final double PLATO6 = 9;
        final double PLATO7 = 5;
        final double PLATO8 = 1.5;
        final double PLATO9 = 1.25;
        final double PLATO10 = 2;
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        double precio = 0, totalAPagar = 0;
        String plato = "", resultadoPrimerPlato = "", resultadoSegundoPlato = "", resultadoPostre = "";
        do {
            boolean seguir = true;
            // repetir si la opcion es negativa
            do {
                // menu
                seguir = true;
                System.out.println(" *** RESTAURANTE IES VEGA DE MIJAS ****");
                System.out.println(" ----------------------------------");
                System.out.println("Primeros platos");
                System.out.println(" 1. Salmorejo (5€)");
                System.out.println(" 2. Sopa picadillo (4€)");
                System.out.println(" 3. Ensalada de atún (4.5€)");
                System.out.println("Segundos platos");
                System.out.println(" 4. Paella (6€)");
                System.out.println(" 5. Salmón (8€)");
                System.out.println(" 6. Codillo al horno (9€)");
                System.out.println(" 7. Lentejas (5€)");
                System.out.println("Postres");
                System.out.println(" 8. Fruta (1.5€)");
                System.out.println(" 9. Café (1.25€)");
                System.out.println("10. Helado (2€)");
                System.out.println();
                System.out.println();
                System.out.println("0. SALIR (Imprimir Ticket + FIN) ");
                System.out.println("Selecciona la opción deseada por el cliente...");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        plato = "Salmonejo";
                        precio = PLATO1;
                        break;
                    case 2:
                        plato = "Sopa picadillo";
                        precio = PLATO2;
                        break;
                    case 3:
                        plato = "Ensalada de atún";
                        precio = PLATO3;
                        break;
                    case 4:
                        plato = "Paella";
                        precio = PLATO4;
                        break;
                    case 5:
                        plato = "Salmón";
                        precio = PLATO5;
                        break;
                    case 6:
                        plato = "Codillo al horno";
                        precio = PLATO6;
                        break;
                    case 7:
                        plato = "Lentejas";
                        precio = PLATO7;
                        break;
                    case 8:
                        plato = "Fruta";
                        precio = PLATO8;
                        break;
                    case 9:
                        plato = "Café";
                        precio = PLATO9;
                        break;
                    case 10:
                        plato = "Helado";
                        precio = PLATO10;
                        break;
                    case 0:
                        break;
                    // vuelve a entrar
                    default:
                        seguir = false;
                        break;
                }
            } while (!seguir);

            // si fuera 0 no lo pide la cantidad etc.
            if (opcion != 0) {

                // pide la cantidad
                int cantidad = 0;
                do {
                    System.out.println("Cuantas quieres?(0 si te has equivocado)");
                    cantidad = sc.nextInt();
                } while (cantidad < 0);

                // 0 como si se hubiera equivocado y lo anula.
                if (cantidad != 0) {
                    // estructurar el resultado
                    if (opcion >= 1 && opcion <= 3) {
                        resultadoPrimerPlato += plato + " x " + cantidad + "\n";
                    } else if (opcion >= 4 && opcion <= 7) {
                        resultadoSegundoPlato += plato + " x " + cantidad + "\n";
                        // rebaja de 1 euro a cada plato para los segundos plato si piden mas de dos
                        // platos
                        if (cantidad > 2) {
                            precio--;
                        }
                    } else {
                        resultadoPostre += plato + " x " + cantidad + "\n";
                    }

                    totalAPagar += precio * cantidad;

                }
            }

        } while (opcion != 0);
        sc.close();

        // descuentos
        if (totalAPagar > 50) {
            totalAPagar -= 5;
        } else if (totalAPagar > 30) {
            totalAPagar -= 3;
        } else if (totalAPagar >= 20) {
            totalAPagar -= 2;
        }

        // imprimir los resultado que no son vacíos
        System.out.println("------------------------------");
        if (!(resultadoPrimerPlato.equals(""))) {
            System.out.println("** Primeros platos");
            System.out.println(resultadoPrimerPlato);
        }
        if (!(resultadoSegundoPlato.equals(""))) {
            System.out.println("** Segundos platos");
            System.out.println(resultadoSegundoPlato);
        }
        if (!(resultadoPostre.equals(""))) {
            System.out.println("** Postres");
            System.out.println(resultadoPostre);
        }
        System.out.println("TOTAL A PAGAR: " + totalAPagar);
        System.out.println("------------------------------");
    }
}