import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
            int num1=(int)(Math.random()*99+1);
            int num2=(int)(Math.random()*99+1);
            int op=(int)(Math.random()*3);
            String operación;
            int res;
            switch (op){
                case 0:
                    operación="+";
                    res=num1+num2;
                    break;
                case 1:
                    operación="-";
                    res=num1-num2;
                    break;
                case 2:
                    operación="*";
                    res=num1*num2;
                    break;
                default:
                    operación="error";
                    res=-1000;
            }
            Scanner sc=new Scanner(System.in);
            System.out.print(num1+operación+num2+"=");
            int resultado=sc.nextInt();
            sc.close();
            if (resultado==res) {
                System.out.println("Right");
            } else {
                System.out.println("Wrong");
            }
    }
}
