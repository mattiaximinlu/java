public class math {
    public static void main(String[] args) {
        System.out.println("PI: "+Math.PI);
//abs
        System.out.println("abs: "+Math.abs(-123.48f));
//pow
        System.out.println(Math.pow(2, 10)+" = 2 elevado a 10");
        System.out.println(Math.pow(3,1000)+" cuando la potencia sale del rango");
//sqrt
        System.out.println(Math.sqrt(16)+" = raiz cuadrada de 16");
//random
        System.out.println(Math.random()+" random between 0 and 1, not included.");
//round
        System.out.println(Math.round(Math.random()*50)*2+" redondeo matematico y numero aleatorio pares desde 0 a 100");
//round down
        System.out.println(Math.floor(0.5)+"redondear abajo matematico y numero aleatorio pares desde 0 a 100");
//round up
        System.out.println(Math.ceil(0.1)+"redondeo arriba matematico y numero aleatorio pares desde 0 a 100");
//max
        System.out.println(Math.max(2,1)+"maximo");
        System.out.println(Math.min(2,1)+"minimo");
    }
}
