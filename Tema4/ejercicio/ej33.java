import java.util.Scanner;

public class ej33 {
    private static String funcion(String lado,String dentro, int h,String cosa){
        String res="";
        for (int i = 1; i <= h; i++) {
            res=res+(cosa.equals("fila")?((i==h)?funcion(" ","*",h,"vasura") :funcion("*"," ",h,"vasura")+"\n"):((i==1 || i==h)?lado:dentro));
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce una altura: ");
        int h=sc.nextInt();
        sc.close();
        String res=funcion("vasura","vasura",h,"fila");
        System.out.println(res); 
    }
}
//este codigo es mucho mas legible, he probado a unir los dos for, ha funcionado, pero abajo del res del for que está arriba si imprimo res por pantalla sale muchos espacios vacio, no se porque y no quiero saberlo.
/* 
    private static String columna(String lado,String dentro, int h,String cosa){
        String res="";
        for (int i = 1; i <= h; i++) {
            res=res+(cosa.equals("fila")?((i==h)?columna(" ","*",h,"columna") :columna("*"," ",h,"columna")+"\n"):((i==1 || i==h)?lado:dentro));
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce una altura: ");
        int h=sc.nextInt();
        sc.close();
        String res=columna("vasura","vasura",h,"fila");
        System.out.println(res); 
    }
}
 */