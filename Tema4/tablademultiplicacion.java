
public class tablademultiplicacion {
    public static void main(String[] args) {
        for (int num = 1; num <= 5; num++) {
            System.out.println("Table de " + num);
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + "*" + num + "=" + i * num);
            }
            System.out.println("-------------------------");
        }
    }
}
