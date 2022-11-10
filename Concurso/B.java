public class B{
    public static void main(String[] args) {
        int vez=1;
        while (vez!=0){
            vez=(int)(Math.random()*10);
            System.out.print(vez+ " ");
            String sentido="derecha";
            int derecha=0;
            int izquierda=0;
            String sonido;
            if (vez==0) {
                
            } else {
                for (int i = 0; i < vez; i++) {
                    int sonidoAleatorio=(int)(Math.random()*3);
                    if (i==vez-1) {
                        sonido="PONG!";
                    } else {
                        switch (sonidoAleatorio){
                            case 0:
                                sonido="POC";
                                break;
                            case 1:
                                sonido="POC";
                                break;
                            case 2:
                                sonido="PONG!";
                                break;
                            default:
                                sonido="error";
                        }
                    }
                    System.out.print(sonido +" ");
                    
                    if(sonido.equals("PIC")){
                        if (sentido.equals("derecha")){
                            sentido="izquierda";
                        }
                        else{
                            sentido="derecha";
                        }
                    }
                    if(sonido.equals("PONG!")){
                        if (sentido.equals("izquierda")){
                            derecha++;
                        } else {
                            izquierda++;
                        }
                    }
                }
                System.out.println( izquierda+" "+derecha);
            }
        }
        System.out.println();
    }
}
