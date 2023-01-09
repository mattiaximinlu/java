
public class ej4 {
    public static void main(String[] args) {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];
        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * 100);
            cuadrado[i] = (int) (Math.pow(numero[i], 2));
            cubo[i] = (int) (Math.pow(numero[i], 3));
            
            System.out.print(numero[i] + "\t" + cuadrado[i] + "\t" + cubo[i]);
            System.out.println();
        }
    }
}
