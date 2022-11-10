public class ej7 {
    public static void main(String[] args) {
        int jugador=1;
        int mayor=1;
        int menor=6;

        while (jugador<4){
            int tirada=(int) (Math.random()*6+1);
            System.out.println("El jugador"+jugador+" ha sacado: "+tirada);
            jugador=jugador+1;
            mayor=Math.max(mayor,tirada);
            menor=Math.min(menor,tirada);
        }
        System.out.println("La tirada mayor es "+mayor);
        System.out.println("La tirada menor es "+menor);
    }
}