public class bool {

    public static void main(String[] args) {
        boolean verdadero=true;
        boolean verdadero1=true;
        boolean falso=false;
        boolean falso2=false;
        // "&&"=and
        boolean vyv=verdadero && verdadero1;
        boolean vyf=verdadero && falso;
        boolean fyv=falso && verdadero;
        boolean fyf=falso && falso2;
        System.out.println("Prueba de AND:");
        System.out.println("verdadero y verdadero: "+vyv+"\nverdadero y falso: "+vyf+ "\nfalso y verdadero: "+ fyv +"\nfalso y falso: "+fyf);
        // "||"=or
        boolean vov=verdadero || verdadero1;
        boolean vof=verdadero || falso;
        boolean fov=falso || verdadero;
        boolean fof=falso || falso2;
        System.out.println("--------------------------------");
        System.out.println("Prueba de OR:");
        System.out.print("verdadero o verdadero: "+vov+"\nverdadero o falso: "+vof+ "\nfalso o verdadero: "+ fov +"\nfalso o falso: "+fof);
    }
}