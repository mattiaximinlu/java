
public class ej18 {
    private static int decimalBinario(int num) {
        String res="";
        do {
            res+=num%2;
            num=(num-num%2)/2;
        } while (num!=0);
        return Integer.parseInt(res);
    }
    public static void main(String[] args) {
        System.out.println(decimalBinario((int)15));
    }     
}