
public class ej16 {
    private static boolean esCapicua(int num) {
        String recto=num+"";
        String invertida="";
        for (int i = 0; i < recto.length(); i++) {
            invertida=recto.charAt(i)+invertida;
        }
        return invertida.equals(recto);
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 99999; i++) {
            if (esCapicua(i)) {
                System.out.println(i);
            }
        }
    }
}
