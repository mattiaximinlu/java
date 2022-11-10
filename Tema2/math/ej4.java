/*Ejercicio 4

Muestra las diferencias entre el Round, ceil y el floor
 */
public class ej4 {
    public static void main(String[] args) {
        final float num1=0.1f;
        final float num2=0.9f;
        System.out.println(num1+"(round:"+Math.round(num1)+", ceil:"+(int)Math.ceil(num1)+", floor:"+(int)Math.floor(num1)+")");
        System.out.println(num2+"(round:"+Math.round(num2)+", ceil:"+(int)Math.ceil(num2)+", floor:"+(int)Math.floor(num2)+")");
        System.out.println("Conclusion= roun: normal, ceil: pa arriba, floor: pa abajo.");
    }    
}
