import java.util.Scanner;

public class Conan_El_Bárbaro {
    //peleas
    private static String pelea(String atacante,String defensor,int attMax,int defMax,String JUGADOR) {
        String ganador;
    
        int att=(int)(Math.random()*(attMax+1));
        System.out.println(atacante+"-Ataca-"+att);
        //comprobacion de si se autolesiona o no
        if (atacante.equals(JUGADOR)&&att<=5) {
            System.out.println("Conan se autolesiona");
            ganador="LESIONA";
        } else {
            int def=(int)(Math.random()*(defMax+1));
            System.out.println(defensor+"-defiende-"+def);
            if (att>def) {
                ganador=atacante;
            } else {
                ganador=defensor;
            }   
        }
        return ganador;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String seguir="s";
        do {
            int attConanMax=0, defConanMax,arma=0;
            final int ATTZOMBIEMAX=50, DEFZOMBIEMAX=70;
            final int NUMZOMBIETOT=(int)Math.random()*6+5;
            final String JUGADOR="conan", ENEMY="zombie";
            //arma
            do {
                System.out.println("Opción: ");
                System.out.println("\t(1)Espada a 2 Manos: Ataque 60 y Defensa 40");
                System.out.println("\t(2)Hacha: Ataque 70 y Defensa 30");
                System.out.println("\t(3)Espada Corta y  escudo: Ataque 30 y Defensa 70");
                System.out.print("Que arma quieres usar: ");
                try {
                    arma=sc.nextInt();  
                } catch (Exception e) {
                    //sin este y si pongo una letra repite el bucle sin poder elegir
                    sc.nextLine();
                }
                switch (arma) {
                    case 1:
                        attConanMax=60;
                        defConanMax=40;
                        break;
                    case 2:
                        attConanMax=70;
                        defConanMax=30;
                        break;
                    case 3:
                        attConanMax=30;
                        defConanMax=70;
                        break;
                    default:
                        attConanMax=0;
                        defConanMax=0;
                        System.out.println("Elige una opción correcta");
                        break;
                }
            } while (attConanMax==0);
            sc.nextLine();

            //empieza la pelea
            int conanVida=4;
            int numZombie=1;
            do {
                //para que empieze siempre primero
                String rol=JUGADOR;
                //nuevo zombie;
                int zombieVida=1;
                //pelea con cada zombie
                System.out.println("Zombie"+numZombie+":");
                do {
                    if (rol.equals(JUGADOR)) {
                        rol=pelea(JUGADOR,ENEMY+numZombie,attConanMax,DEFZOMBIEMAX,JUGADOR);
                        //atacante jugador ganador jugador, zombie pierde vida y muere.
                        if (rol.equals(JUGADOR)) {
                            zombieVida--;
                            System.out.println(ENEMY+numZombie+" ha muerto");
                        
                        //lesiona
                        }else if(rol.equals("LESIONA")){   
                            conanVida--;
                            System.out.print(JUGADOR+" pierde una de vida...le quedan "+conanVida);
                            System.out.println(conanVida<=1?"vida":" vidas");
                            rol=ENEMY;
                        }
                    } else {
                        rol=pelea(ENEMY+numZombie,JUGADOR,ATTZOMBIEMAX,defConanMax,JUGADOR);
                        //atacante zombie, ganador zombie, jugador pierde vida, y distingue si es singular o plural.
                        if (!(rol.equals(JUGADOR))) {
                            conanVida--;
                            System.out.print(JUGADOR+" pierde una de vida...le quedan "+conanVida);
                            System.out.println(conanVida<=1?" vida":" vidas");
                        }
                    }
                    System.out.print("-------------------ENTER PA CONTINUAR-------------------");
                    sc.nextLine();
                } while (zombieVida!=0 && conanVida!=0);
                numZombie++;
            } while (numZombie!=NUMZOMBIETOT && conanVida!=0);
                System.out.print("-------------------");
                System.out.print(conanVida==0?"GAME OVER":"ENHORABUENA");
                System.out.print("-------------------");
            //seguir?
            seguir="";
            do {
                System.out.print("Quieres jugar otra vez?(s/n)");
                seguir=sc.nextLine();
            } while (!(seguir.equals("n") || seguir.equals("s")));
        } while (seguir.equals("s"));
        sc.close();
    }
}
