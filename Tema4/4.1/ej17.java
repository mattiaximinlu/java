
public class ej17 {
    private static int binarioDecimal(int num) {
        String frase=num+"";
        int res=0;
        for (int i = 0; i < frase.length(); i++) {
            int pos=frase.length()-1-i;
            res+=Character.getNumericValue(frase.charAt(i))*Math.pow(2, pos);
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(binarioDecimal((int)1111));
    }     
}
