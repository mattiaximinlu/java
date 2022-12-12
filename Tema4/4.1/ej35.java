
public class ej35 {
    public static String convierteEnPalotes(int n){
        String frase=n+"";
        String res="";
        for (int i = 0; i < frase.length(); i++) {
            for (int j = 0; j < Character.getNumericValue(frase.charAt(i)); j++) {
                res+="|";
            }
            res+="-";
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(convierteEnPalotes(470213));
    }
}
