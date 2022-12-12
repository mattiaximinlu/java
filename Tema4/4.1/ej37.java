
public class ej37 {
    public static String convierteEnMorse(int n){
        String frase=n+"";
        String res="";
        for (int i = 0; i < frase.length(); i++) {
            switch (Character.getNumericValue(frase.charAt(i))) {
                case 1:
                    res+=" . _ _ _ _";
                    break;
                case 2:
                    res+=" . . _ _ _";
                    break;
                case 3:
                    res+=" . . . _ _";
                    break;
                case 4:
                    res+=" . . . . _";
                    break;
                case 5:
                    res+=" . . . . .";
                    break;
                case 6:
                    res+=" _ . . . .";
                    break;
                case 7:
                    res+=" _ _ . . .";
                    break;
                case 8:
                    res+=" _ _ _ . .";
                    break;
                case 9:
                    res+=" _ _ _ _ .";
                    break;
                case 0:
                    res+=" _ _ _ _ _";
                    break;
                default:
                    break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(convierteEnMorse(470213));
    }
}
