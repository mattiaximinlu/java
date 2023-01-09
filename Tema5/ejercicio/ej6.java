import java.util.Arrays;

public class ej6 {
    public static void desplazarDerecha(int[] array) {
        int[] copy=Arrays.copyOf(array,array.length);
        for (int i = 0; i < array.length-1; i++) {
            array[i+1]=copy[i];
        }
        array[0]=copy[copy.length-1];
    }
    public static void main(String[] args) {
        int[] array=new int[15];
        int vez=1;
        for (int i = 0; i < array.length; i++) {
            array[i]=(int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < vez; i++) {
            desplazarDerecha(array);    
        }
        System.out.println(Arrays.toString(array));

    }
}
