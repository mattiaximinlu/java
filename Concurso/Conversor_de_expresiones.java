import java.util.Scanner;

public class Conversor_de_expresiones {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String expresion=sc.nextLine();
        sc.close();
        int num1=0, res=0,vez=1;
        for (int i = 0; i < expresion.length(); i++) {
            char letra=expresion.charAt(i);
            int x=Character.getNumericValue(letra);
            if (x==-1) {
                if (vez==1) {
                    res=Character.getNumericValue(expresion.charAt(i-1));
                    vez=0;
                }
                System.out.println(res);
                num1=Character.getNumericValue(expresion.charAt(i-2));
                switch (letra) {
                    case '-':
                        res=num1-res;        
                        break;
                    case '+':
                        res=num1+res;   
                        break; 
                    case '*':
                        res=num1*res;   
                        break; 
                    default:
                        res=num1/res;   
                    break; 
                }
                expresion.replace(num1+"", "");
            }
        }
        System.out.println(res);
    }
}
