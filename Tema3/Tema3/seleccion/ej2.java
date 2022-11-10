import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Numero animales: ");
        int numAnimal=sc.nextInt();
        System.out.print("kilos por animal: ");
        float kilosPorAnimal=sc.nextFloat();
        System.out.print("kilo de alimento comprado: ");
        float kilosAlimentoComprado=sc.nextInt();
        sc.close();
        float alimentoNecesario=kilosPorAnimal*numAnimal;
        if (alimentoNecesario<=kilosAlimentoComprado) {
            System.out.println("Dispones de alimento sufiente.");
        } else {
            System.out.println("No disponemos de alimento suficiente.");
            System.out.println("A cada animal le hace falta "+(kilosPorAnimal-kilosAlimentoComprado/numAnimal)+"kilos");
            System.out.println("Hay que comprar "+(alimentoNecesario-kilosAlimentoComprado)+"kilos más");
        }
    }
}
