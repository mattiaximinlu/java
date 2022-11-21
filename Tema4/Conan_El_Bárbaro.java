import java.util.Scanner;

public class Conan_El_Bárbaro {
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
                    //atacante jugador
                    if (rol.equals(JUGADOR)) {
                        int att=(int)(Math.random()*(attConanMax+1));
                            System.out.println(JUGADOR+"-Ataca-"+att);
                            //comprobacion de si se autolesiona o no
                            if (att<=5) {
                                System.out.println("Conan se autolesiona");
                                conanVida--;
                                System.out.print(JUGADOR+" pierde una de vida...le quedan "+conanVida);
                                System.out.println(conanVida<=1?"vida":" vidas");
                                rol=ENEMY;
                            } else {
                                int def=(int)(Math.random()*(DEFZOMBIEMAX+1));
                                System.out.println(ENEMY+"-defiende-"+def);
                                //
                                if (att>def) {
                                    zombieVida--;
                                    System.out.println(ENEMY+numZombie+" ha muerto");
                                } else {
                                    rol=ENEMY;
                                }   
                            }
                    //atacante zombie
                    } else {    
                        int att=(int)(Math.random()*(ATTZOMBIEMAX+1));
                        System.out.println(ENEMY+"-Ataca-"+att);
                        int def=(int)(Math.random()*(defConanMax+1));
                        System.out.println(JUGADOR+"-defiende-"+def);
                        if (att>def) {
                            conanVida--;
                            System.out.print(JUGADOR+" pierde una de vida...le quedan "+conanVida);
                            System.out.println(conanVida<=1?"vida":" vidas");
                        } else {
                            rol=JUGADOR;
                        }
                    }
                    System.out.print("-------------------ENTER PA CONTINUAR-------------------");
                    sc.nextLine();
                } while (zombieVida!=0 && conanVida!=0);
                numZombie++;
            } while (numZombie!=NUMZOMBIETOT && conanVida!=0);
                System.out.print("-------------------");
                System.out.print(conanVida==0?"GAME OVER":"\nENHORABUENA\nHAS LOGRADO EL TESORO\n");
                System.out.println("-------------------");
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
