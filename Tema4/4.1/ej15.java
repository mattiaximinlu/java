
public class ej15 {
    private static boolean esPrimo(int num) {
        for (int i = 2; i < num; i++) {
            if (num%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }
    }
    
}
