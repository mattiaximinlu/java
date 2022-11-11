import java.util.Scanner;

public class San_Fermines {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            String[] num=sc.nextLine().split(" ");
            int pos=0;
            int max=0;
            for (String string : num) {
                int integer=Integer.valueOf(string);
                if (pos==0) {
                    pos=pos+1;
                } else if (integer>max && integer<1000000000 && integer>0){
                    max=integer;
                }
            }
            System.out.println(max);    
        }
        sc.close();
    }
}
