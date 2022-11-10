import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        final float PRECIOGASOLINA=1.75f;
        final int K=550;
        final float GASTO=0.08f;
        final int BILLETEAVION=95;
        final int SUPLEMENTO=20;
        final int BILLETETREN=80;

        Scanner sc=new Scanner(System.in);
        System.out.print("Medio de transporte(coche, avion, tren): ");
        String medio=sc.nextLine();
        while (!(medio.equals("coche")||medio.equals("avion")||medio.equals("tren"))) {
            System.out.println("Error, elige una opcion correcta");
            System.out.print("Medio de transporte: ");
            medio=sc.nextLine();
        }
        System.out.print("¿Cuantas personas?(2-4) ");
        int persona=sc.nextInt();
        while (!(persona>=2 && persona<=4)) {
            System.out.println("Error, elige una opcion correcta");
            System.out.print("¿Cuantas personas?");
            persona=sc.nextInt();
        }
        float precioPersona;
        String desglose;
        switch (medio){
            case "coche":
                precioPersona=GASTO*K*PRECIOGASOLINA/persona;
                desglose="\tPrecio gasolina: "+PRECIOGASOLINA+"€\n\tDistancia: "+K+"km\n\tCoste media: "+GASTO+"l/k";
                break;
            case "avion":
                sc.nextLine();
                System.out.print("¿Teneis suplemento?(s/n): ");
                char suplemento=sc.nextLine().charAt(0);
                while (!(suplemento=='s' || suplemento=='n')) {
                    System.out.println("Error, elige una opcion correcta");
                    System.out.print("¿Teneis suplemento?(s/n)");
                    suplemento=sc.nextLine().charAt(0);
                }
                desglose="\tBillete: "+BILLETEAVION+"€";
                if (suplemento=='s') {
                    precioPersona=BILLETEAVION+SUPLEMENTO;
                    desglose=desglose+"\n\tSuplemeto: "+SUPLEMENTO+"€";
                } else {
                    precioPersona=BILLETEAVION;
                }
                break;
            case "tren":
            desglose="\tBillete: "+BILLETETREN+"€";
                switch (persona){
                    case 2:
                        precioPersona=BILLETETREN;
                        break;
                    case 3:
                        precioPersona=BILLETETREN*0.9f;
                        desglose=desglose+"\n\tDescuento: 10%";
                        break;
                    case 4:
                        precioPersona=BILLETETREN*0.75f;
                        desglose=desglose+"\n\tDescuento: 25%";
                        break;
                    default:
                        precioPersona=0; 
                    }
                    break;
             default:
                    precioPersona=0;
                    desglose="error";
        }
        sc.close();
        System.out.println("---------------------------------------------------");
        System.out.println("Salida:");
        System.out.println("Vais a viajar en "+persona+" persona.");
        System.out.println("Viajais en: "+medio);
        System.out.println("Precio por persona: "+precioPersona+"€");
        System.out.println("Deglose:");
        System.out.println(desglose);
    }
}
