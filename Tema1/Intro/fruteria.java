import java.util.Scanner;
public class fruteria {
    public static void main(String[] args) {
//introducir datos
        final float manzanas€AlKilo=(float)2.35;
        final float peras€AlKilo=(float)1.77;
        final float gasolina€AlKilo=(float)0.60;
        Scanner sc=new Scanner(System.in);
        System.out.print("Kilos manzanas vendidos: ");
        float kManzanas=sc.nextFloat();
        System.out.print("Kilos peras vendidos: ");
        float kPeras=sc.nextFloat();
        System.out.print("Luz mensual gastado: ");
        float luz=sc.nextFloat();
        sc.close();
//calculo totales
        float totManzana=manzanas€AlKilo*kManzanas;
        float totPera=peras€AlKilo*kPeras;
        float totGasolina=gasolina€AlKilo*(kManzanas+kPeras);
        float totIngreso=totManzana+totPera;
        float totGastos=luz+totGasolina;
        float beneficio=totIngreso-totGastos;

//resultado
        System.out.println("-------------------------------------");
        System.out.println("Total ingresos: "+ totIngreso+"€");
        System.out.println("Total gastos: "+ totGastos+"€");
        System.out.println("beneficio: "+ beneficio+"€");
    }
}
