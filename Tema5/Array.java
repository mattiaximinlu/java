
import java.util.Scanner;

public class Array {
    static Scanner sc=new Scanner(System.in);
    static String[] lista=new String[10];

    private static void menu() {
        int opcion=0;
        System.out.println("Menu:");
        System.out.println("-1 limpiar");
        System.out.println("-2 Insertar");
        System.out.println("-3 Ver posición");
        System.out.println("-4 llenar");
        System.out.println("-5 Mostrar");
        System.out.println("-6 salir");
        System.out.print("Opcion: ");
        try {
            opcion=sc.nextInt();
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("Elige una opcion correcta");
            sc.nextLine();
            menu();
        }
        if (opcion<1 || opcion>6) {
            System.out.println("Elige una opcion correcta");
            menu();
        }
        opcion(opcion);
    }
    private static void opcion(int opcion) {
        boolean seguir=true;
        switch (opcion) {
            case 1:
                limpiar();
                break;
            case 2:
                insertar();
                break;
            case 3:
                ver();
                break;
            case 4:
                llenar();
                break;
            case 5:
                mostrar();
                break;
            case 6:
                seguir=false;
                break;   
        }
        if (seguir) {
            menu();
        }
    }
    private static void limpiar() {
        for (int i = 0; i < lista.length; i++) {
            lista[i]=null;
        }
        System.out.println("Se ha limpiado");
    }
    private static void insertar() {
        System.out.print("Elige una posición(0-"+(lista.length-1)+"): ");
        int pos=0;
        try {
            pos=sc.nextInt();
            sc.nextLine();
            if (pos<0 || pos>lista.length-1) {
                System.out.println("Elige una opción correcta");
                insertar();
            } else {
                System.out.print("Que quieres insertar: ");
                String insertar=sc.nextLine();
                lista[pos]=insertar;
            }
        } catch (Exception e) {
            System.out.println("Elige una opción correcta");
            sc.nextLine();
            insertar();
        }
    }
    private static void ver() {
        System.out.print("Elige una posición(0-"+(lista.length-1)+"): ");
        int pos=0;
        try {
            pos=sc.nextInt();    
            sc.nextLine();
            if (pos<0 || pos>lista.length-1) {
                System.out.println("Elige una opción correcta");
                ver();
            } else {
                System.out.println(lista[pos]);
            }
        } catch (Exception e) {
            System.out.println("Elige una opción correcta");
            sc.nextLine();
            ver();
        }
    }
    private static void llenar() {
        for (int i = 0; i < lista.length; i++) {
            System.out.print("Que quieres insertar(posición "+i+"): ");
            String insertar=sc.nextLine();
            lista[i]=insertar;
        }
    }
    private static void mostrar() {
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        menu();
    }
}
