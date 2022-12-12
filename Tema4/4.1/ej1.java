import java.util.Scanner;

public class ej1{
    private static boolean esCapicua(int num) {
        String recto=num+"";
        String invertida="";
        for (int i = 0; i < recto.length(); i++) {
            invertida=recto.charAt(i)+invertida;
        }
        return invertida.equals(recto);
    }
    private static boolean esPrimo(int num) {
        for (int i = 2; i < num; i++) {
            if (num%i==0) {
                return false;
            }
        }
        return true;
    }
    private static int siguientePrimo(int num) {
        for (int i = num+1; ; i++) {
            boolean primo=true;
            for (int j = 2; j < i; j++) {
                if (i%j==0) {
                    primo=false;
                }
            }
            if (primo) {
                return i;
            }
        }
    }
    private static double potencia(int num, int pot) {
        return Math.pow(num, pot);
    }
    private static int digitos(int num) {
        String frase=num+"";
        return frase.length();
    }
    private static String voltea(int num) {
        String recto=num+"";
        String invertida="";
        for (int i = 0; i < recto.length(); i++) {
            invertida=recto.charAt(i)+invertida;
        }
        return invertida;
    }
    private static int digitoN(int num, int p) {
        String recto=num+"";
        return Character.getNumericValue(recto.charAt(p));
    }
    private static int posicionDeDigito(int num, int p) {
        String recto=num+"";
        String busca=p+"";
        return recto.indexOf(busca);
    }
    private static String quitoPorDetras(int num, int p) {
        String recto=num+"";
        String res="";
        for (int i = 0; i < recto.length()-p; i++) {
            res+=recto.charAt(i);
        }
        return res;
    }
    private static int quitoPorDelante(int num, int p) {
        String recto=num+"";
        String res="";
        for (int i = p; i < recto.length(); i++) {
            res+=recto.charAt(i);
        }
        return Integer.valueOf(res);
    }
    private static int pegoPorDetras(int num, int p) {
        String recto=num+"";
        String res="";
        for (int i = 0; i < recto.length(); i++) {
            res+=recto.charAt(i);
        }
        return Integer.valueOf(res+p);
    }
    private static int pegoPorDelante(int num, int p) {
        String recto=num+"";
        String res="";
        for (int i = 0; i < recto.length(); i++) {
            res+=recto.charAt(i);
        }
        return Integer.valueOf(p+res);
    }
    private static int trozoDeNumero(int num, int inicio, int fin) {
        String recto=num+"";
        String res="";
        for (int i = inicio; i <= fin; i++) {
            res+=recto.charAt(i);
        }
        return Integer.valueOf(res);
    }
      private static int juntaNumero(int num, int p) {
        String recto=num+"";
        String res="";
        for (int i = 0; i < recto.length(); i++) {
            res+=recto.charAt(i);
        }
        return Integer.valueOf(res+p);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Numero");
        int num=sc.nextInt();
        sc.close();
        System.out.println(esCapicua(num));
        System.out.println(esPrimo(num));
        System.out.println(siguientePrimo(num));
        System.out.println(potencia(num,2));
        System.out.println(digitos(num));
        System.out.println(voltea(num));
        System.out.println(digitoN(num,0));
        System.out.println(posicionDeDigito(num,0));
        System.out.println(quitoPorDetras(num,1));
        System.out.println(quitoPorDelante(num, 1));
        System.out.println(pegoPorDetras(num,1));
        System.out.println(pegoPorDelante(num,1));
        System.out.println(trozoDeNumero(num,1,3));
        System.out.println(juntaNumero(num,123));
    }
}