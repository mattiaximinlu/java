import java.util.Scanner;

/*Realiza un programa que pida la temperatura media que ha hecho en cada mes
de un determinado año y que muestre a continuación un diagrama de barras
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
de asteriscos o cualquier otro carácter. */
public class ej8 {
    final static char carácter='*';
    final static String[] mes={"Ene", "Feb", "Mar", "Abr", "May", "Jun","Jul","Ago","Sep","Oct","Nov","Dic"};
    static int[] temp= new int[mes.length];
    private static void pedirValor(Scanner sc) {
        for (int i = 0; i < temp.length; i++) {
            System.out.print("La temperatura media de "+mes[i]+": ");
            temp[i]=sc.nextInt();
        }
    }
    private static void imprimirDiagrama() {
        for (int i = 0; i < temp.length; i++) {
            System.out.print(mes[i]+": ");
            for (int j = 0; j < temp[i]; j++) {
                System.out.print(carácter);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        pedirValor(sc);
        imprimirDiagrama();
    }
}
