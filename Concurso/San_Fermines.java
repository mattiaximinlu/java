import java.util.Scanner;

public class San_Fermines {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do {
            int nToros=sc.nextInt();
            if (nToros==0){
                break;
            }else{
                int max=0;
                for (int i = 0; i < nToros; i++) {
                    int velocidad=sc.nextInt();
                    System.out.println(i);
                    max=velocidad>max?velocidad:max;
                }
                System.out.println(max);
            }
                
        } while (true);
        sc.close();
    }
}
