
import java.util.Arrays;
import java.util.Scanner;

public class ArrayNum {
    static Scanner sc=new Scanner(System.in);
    static int[] lista=new int[10];

    /*imprime el menu y comprueba la opcion */
    private static void menu() {
        int opcion=0;
        System.out.println("Menu:");
        System.out.println("-1 limpiar");
        System.out.println("-2 Insertar");
        System.out.println("-3 Ver posición");
        System.out.println("-4 llenar");
        System.out.println("-5 Mostrar");
        System.out.println("-6 llenarAleatorio");
        System.out.println("-7 ordenar");
        System.out.println("-8 Buscar");
        System.out.println("-9 Buscar Ordenado");
        System.out.println("-10 Desordenar");
        System.out.println("-0 salir");
        System.out.print("Opcion: ");
        try {
            opcion=sc.nextInt();
            if (opcion<0 || opcion>11) {
                System.out.println("Elige una opcion correcta");
                menu();
            }else{
                opcion(opcion);
            }
        } catch (Exception e) {
            System.out.println("Elige una opcion correcta");
            sc.nextLine();
            menu();
        }
    }
    /**
     * segun las opciones llama a diferente funciones y si fuera 0 no llama de nuevo al menu
     * @param opcion
     */
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
                aleatorio();
                break;
            case 7:
                ordenar();
                break;
            case 8:
                System.out.println(buscar(opcion));
                break;
            case 9:
                int num=sc.nextInt();
                int[] copy=Arrays.copyOf(lista, lista.length);
                Arrays.sort(copy);
                System.out.println(buscarOrdenado(copy,num));
                break;
                case 10:
                desordenar();
                break;
            case 0:
                seguir=false;
                break;
        }
        if (seguir) {
            menu();
        }
    }
    /*todo a null */
    private static void limpiar() {
        for (int i = 0; i < lista.length; i++) {
            lista[i]=0;
        }
        System.out.println("Se ha limpiado");
    }
    /*insertar en una posicion especifica */
    private static void insertar() {
        System.out.print("Elige una posición(0-"+(lista.length-1)+"): ");
        int pos=0;
        try {
            pos=sc.nextInt();
            if (pos<0 || pos>lista.length-1) {
                System.out.println("Elige una opción correcta");
                insertar();
            } else {
                System.out.print("Que quieres insertar: ");
                int insertar=sc.nextInt();
                lista[pos]=insertar;
            }
        } catch (Exception e) {
            System.out.println("Elige una opción correcta");
            sc.nextLine();
            insertar();
        }
    }
    /*ver una posicion */
    private static void ver() {
        System.out.print("Elige una posición(0-"+(lista.length-1)+"): ");
        int pos=0;
        try {
            pos=sc.nextInt();    
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
    /*llenar la lista */
    private static void llenar() {
        try {
            for (int i = 0; i < lista.length; i++) {
                System.out.print("Que quieres insertar(posición "+i+"): ");
                int insertar=sc.nextInt();
                lista[i]=insertar;
            }    
        } catch (Exception e) {
            System.out.println("Solo numeros");
            sc.nextLine();
            llenar();
        }
        
    }
    /*mostrar toda la lista */
    private static void mostrar() {
        for (int palabra : lista) {
            System.out.print(palabra+" ");
        }
        System.out.println();
    }
    private static void aleatorio() {
        for (int i = 0; i < lista.length; i++) {
            int aleatorio=(int)(Math.random()*10000);
            lista[i]=aleatorio;
        }
        System.out.println("Se ha llenado");
    }
    private static void ordenar() {
        int var1=0;
        int var2=0;
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length-i; j++) {
                var1=lista[j];
                if (var2>var1) {
                    lista[j]=var2;
                    lista[j-1]=var1;
                } else {
                    var2=var1;   
                }
            }
            var2=0;
        }
        //ordenar
        //Arrays.sort(lista);
    }
    private static int buscar(int elemento) {
        int pos=-1;
        /*for (int i = 0; i < lista.length; i++) {
            if (lista[i]==elemento) {
                pos=i;
            }
        }*/
        int indice=0;
        while (pos==-1 && indice<lista.length) {
            if (lista[indice]==elemento) {
                pos=indice;
            }else{
                indice++;
            }
        }
        return pos;
    }
    private static boolean buscarOrdenado(int[] copy, int elemento) {
        boolean res;
        //obtener la mitad sin decimales
        int indice=(int)Math.floor(copy.length/2);
        if (copy.length==1) {
            res=copy[0]==elemento;
        } else {
            if (copy[indice]>elemento) {
                copy=Arrays.copyOf(copy, indice);
            } else {
                copy=Arrays.copyOfRange(copy,indice,copy.length);
            }
            res=buscarOrdenado(copy,elemento);
        }
        return res;
    }
    public static void desordenar() {
        //alta probabilidad de que se quede en la misma posicion
        int[] copy =Arrays.copyOf(lista, lista.length);
        for (int i = 0; i < copy.length; i++) {
            int random=(int)(Math.random()*copy.length);
            if (copy[random]!=-1){
                lista[i]=copy[random];
                copy[random]=-1;
            }else{
                i--;
            }
        }
        //mas que aleatorio parece cambiar la posicion
        for (int i = 0; i < lista.length; i++) {
                int random=(int)(Math.random()*lista.length);
                int almacen=lista[i];
                lista[i]=lista[random];
                lista[random]=almacen;
        }
    }
    public static void main(String[] args) {
        menu();
    }
}
