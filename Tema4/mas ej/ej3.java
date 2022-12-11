
public class ej3 {
    public static void main(String[] args) {
        float paga=0.05f;
        float recibido=0f;
        int semana=0;
        do {
            recibido+=paga;
            paga*=2;
            semana++;
        } while (recibido<2000);
        System.out.println("Tarda "+semana+" semanas");
    }
}
