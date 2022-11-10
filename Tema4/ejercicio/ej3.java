public class ej3{
    public static void main(String[] args) {
        int num=0;
        do {
            if (num%5==0) {
                System.out.print(num+" ");
            }
            num++;
        } while (num<=100);
        System.out.println("");
    }
}