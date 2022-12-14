
import java.util.Scanner;

public class recursivas {
    
    public static int suma(int num,int res) {
        if (num>0) {
            res=num+suma(num-1,res);
        }
        return res;
    }
    public static int fact(int num,int res) {
        if (num>1) {
            res=num*fact(num-1,res);
        }
        return res;
    }
    public static void triangulo(int h) {
        if (h>0) {
            fila(h);
            System.out.println();
            triangulo(h-1);
        }
    }
    public static void fila(int l) {
        if (l>0) {
            System.out.print("*");   
            fila(l-1);
        }
    }
    public static String split(String[] split) {
        int longitud=split.length-1;
        String frase=split[longitud];
        frase=split(split, longitud-1)+frase;   
        return frase;
    }
    public static String split(String[] split, int longitud) {
        String frase="";
        if (longitud>=0) {
            frase+=split[longitud]+" "+split(split, longitud-1);
        }
        return frase;
    }
    public static void main(String[] args) {
        int suma=0;
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Numero: ");
        int num=sc.nextInt();
        sc.close();
        String cadena="buenas dias hola adios";
        String[] split=cadena.split(" ");
        suma=suma(num,suma);
        fact=fact(num,fact);
        System.out.println(suma);
        System.out.println(fact);
        triangulo(num);
        System.out.println(split(split));
    }
}
