
//Quieres lograr un tesoro, y para ese invocas un servant, y cada una de ellos tienen pasivas diferentes, de las cuales:
//saber es un espadachín tiene un 10% de hacer otro ataque y esas dos ataque se suman.
//archer es un arqueros tiene un 10% de hacer un golpe critico de la cual hará el doble de daño.
//Lancer es un lanzador tiene un 10% de paralizar el enemigo, asi 100% seguira atancando.
//Rider es un hinete una vez que falla un ataque es posible que hará otro ataque intentando de herir el zombi, obtendra otro attaque probando a pasar la defensa que tenía el zombie(osea que cambia el ataque de conan pero no la defensa de zombie)
//Caster es un mago, durante la pelea estará mucho más lejo y eso hace que los zombi tienen que acercarse para golpearlo, y eso tarda dos ronda.
//Berserker es un guerrero sin miedo, atacará aunque esté defendiendo.

//cada servant tendra un attaque o defensa minima, y para lograr ese he hecho un max entre el resultado que se saca con el random y el minimo.

//queria añadir health point, en vez de vida se quita directamente la diferencia y se muere cuando llega a 0.

//tambien queria añadir mas plantas(numero de zombie y habra un boss cada 5 o 10).

//tambien queria que se evolucionan, cada planta pueden elegir otra pasiva o mejorar una pasiva, y cada cuantas planta se obtiene puntos para subir el ataque o defensa.
import java.util.Scanner;

public class Conan_El_Bárbaro{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String seguir="s";
        do {
            int attConanMax=0, defConanMax,arma=0, attConanMin=0, defConanMin=0, attZombieMax=50, defZombieMax=70,  attZombieMin=0, defZombieMin=0, probabilidadEfecto=10, lazar;
            final int NUMZOMBIETOT=(int)(Math.random()*6+5);
            System.out.println(NUMZOMBIETOT);
            final String JUGADOR="conan", ENEMY="zombie";
            String effect="None";
            //arma
            do {
                System.out.println("Opción: ");
                System.out.println("\t(1)Saber: Ataque 50 y Defensa 50");
                System.out.println("\t\tPassive: DEFENSA MINIMA 20, 10% de doble ataque.(se suman)");
                System.out.println("\t(2)Archer: Ataque 70 y Defensa 30");
                System.out.println("\t\tPassive: ATAQUE MINIMA 30, 10% crit");
                System.out.println("\t(3)Lancer: Ataque 60 y Defensa 40");
                System.out.println("\t\tPassive: ATAQUE MINIMA 20, 10% de paralizar el enemigo");
                System.out.println("\t(4)Rider: Ataque 60 y Defensa 40");
                System.out.println("\t\tPassive: ATAQUE MINIMA 20, cada vez que falle un ataque puede atacar otra vez.");
                System.out.println("\t(5)Caster: Ataque 80 y Defensa 20");
                System.out.println("\t\tPassive: ATAQUE MINIMA 40, a cause de la distancia puede fallar dos ataque");
                System.out.println("\t(6)Assasin: Ataque 60 y Defensa 40");
                System.out.println("\t\tPassive: ATAQUE MINIMA 20, 10% que mate directamente");
                System.out.println("\t(7)Berserker: Ataque 70 y Defensa 30");
                System.out.println("\t\tPassive: ATAQUE MINIMA 30, puede efectuar un ataque durante la defensa directamente.");
                System.out.print("Elige un servant: ");
                try {
                    arma=sc.nextInt();  
                } catch (Exception e) {
                    //sin este y si pongo una letra repite el bucle sin poder elegir
                    sc.nextLine();
                }
                switch (arma) {
                    case 1:
                        attConanMax=50;
                        defConanMax=50;
                        attConanMin=0;
                        defConanMin=20;
                        effect="double";
                        break;
                    case 2:
                        attConanMax=70;
                        defConanMax=30;
                        attConanMin=30;
                        defConanMin=0;
                        effect="crit";
                        break;
                    case 3:
                        attConanMax=60;
                        defConanMax=40;
                        attConanMin=20;
                        defConanMin=0;
                        effect="paralize";
                        break;
                    case 4:
                        attConanMax=60;
                        defConanMax=40;
                        attConanMin=20;
                        defConanMin=0;
                        effect="consecutive";
                        break;
                    case 5:
                        attConanMax=80;
                        defConanMax=20;
                        attConanMin=40;
                        defConanMin=0;
                        effect="distancia";
                        break;
                    case 6:
                        attConanMax=60;
                        defConanMax=40;
                        attConanMin=20;
                        defConanMin=0;
                        effect="mata";
                        break;
                    case 7:
                        attConanMax=70;
                        defConanMax=30;
                        attConanMin=30;
                        defConanMin=0;
                        effect="sangrePorSangre";
                        break;
                    default:
                        attConanMax=0;
                        defConanMax=0;
                        attConanMin=0;
                        defConanMin=0;
                        System.out.println("Elige una opción correcta");
                        effect="None";
                        break;
                }
            } while (attConanMax==0);
            sc.nextLine();

            //empieza la pelea
            int conanVida=4;
            int numZombie=1;
            do {
                //efecto de caster
                int vez=2;
                //para que empieze siempre primero
                String rol=JUGADOR;
                //nuevo zombie;
                int zombieVida=1;
                //pelea con cada zombie
                System.out.println("Zombie"+numZombie+":");
                do {
                    boolean paralizado=false;
                    //10% para el efecto
                    lazar=(int)(Math.random()*(probabilidadEfecto))+1;
                    //atacante jugador
                    if (rol.equals(JUGADOR)) {
                        if (effect.equals("mata")){
                            if (lazar==10){
                                System.out.println("Se ha activado el efecto de assassin");
                                zombieVida--;
                                System.out.println(ENEMY+numZombie+" ha muerto");
                            }else{
                                System.out.println("Ha fallado el efecto de assassin");
                                int att=Math.max((int)(Math.random()*(attConanMax+1)),attConanMin);
                                System.out.println(JUGADOR+"-Ataca-"+att);
                                int def=Math.max((int)(Math.random()*(defZombieMax+1)),defZombieMin);
                                System.out.println(ENEMY+numZombie+"-defiende-"+def);
                                if (att>def) {
                                    zombieVida--;
                                    System.out.println(ENEMY+numZombie+" ha muerto");
                                } else {
                                    rol=ENEMY;    
                                }
                            }
                        }else{
                            int att=Math.max((int)(Math.random()*(attConanMax+1)),attConanMin);
                            switch (effect) {
                                case "double":
                                    if (lazar==10) {
                                        System.out.println("Se ha activado el efecto de saber");
                                        att+=Math.max((int)(Math.random()*(attConanMax+1)),attConanMin);   
                                    }else{
                                        System.out.println("Ha fallado el efecto de saber");
                                    }
                                    break;
                                case "crit":
                                    if (lazar==10){
                                        System.out.println("Se ha activado el efecto de archer");
                                        att=att*2;
                                    }else{
                                        System.out.println("Ha fallado el efecto de archer");
                                    }
                                    break;
                                case "paralize":
                                    if (lazar==10){
                                        System.out.println("Se ha activado el efecto de lancer");
                                        paralizado=true;
                                    }
                                    break;
                            }
                            System.out.println(JUGADOR+"-Ataca-"+att);
                            int def=Math.max((int)(Math.random()*(defZombieMax+1)),defZombieMin);
                            System.out.println(ENEMY+numZombie+"-defiende-"+def);
                            //
                            if (att>def) {
                                zombieVida--;
                                System.out.println(ENEMY+numZombie+" ha muerto");
                            } else {
                                switch (effect) {
                                    case "distancia":
                                        if (vez>0) {
                                            System.out.println("Se ha activado el efecto.");
                                            vez--;
                                        } else{
                                            System.out.println("Ha fallado el efecto de caster");
                                            rol=ENEMY;
                                        }
                                        break;
                                case "consecutive":
                                    System.out.println("Se ha activado el efecto, haz otro ataque.");
                                    att=Math.max((int)(Math.random()*(attConanMax+1)),attConanMin);
                                    System.out.println(JUGADOR+"-Ataca-"+att);
                                    if (att>def) {
                                        zombieVida--;
                                        System.out.println(ENEMY+numZombie+" ha muerto");
                                    }
                                    break;
                                default:
                                    if (!(paralizado)) {
                                        rol=ENEMY;    
                                    }
                                    break;
                                }
                            }
                        }
                    //atacante zombie
                    } else {    
                        int att=Math.max((int)(Math.random()*(attZombieMax+1)),attZombieMin);
                        System.out.println(ENEMY+numZombie+"-Ataca-"+att);
                        int def=Math.max((int)(Math.random()*(defConanMax+1)),defConanMin);
                        System.out.println(JUGADOR+"-defiende-"+def);
                        if (att>def) {
                            conanVida--;
                            System.out.print(JUGADOR+" pierde una de vida...le quedan "+conanVida);
                            System.out.println(conanVida<=1?"vida":" vidas");
                        } else {
                            rol=JUGADOR;
                        }
                        if (effect.equals("sangrePorSangre")&&conanVida!=0) {
                            System.out.println("Se ha activado el efecto de Berserker");
                            att=Math.max((int)(Math.random()*(attConanMax+1)),attConanMin);
                            System.out.println(JUGADOR+"-Ataca-"+att);
                            def=Math.max((int)(Math.random()*(defZombieMax+1)),defZombieMin);
                            System.out.println(ENEMY+numZombie+"-defiende-"+def);
                            if (att>def) {
                                zombieVida--;
                                System.out.println(ENEMY+numZombie+" ha muerto");
                            }
                        }
                    }
                    System.out.print("-------------------ENTER PA CONTINUAR-------------------");
                    sc.nextLine();
                } while (zombieVida!=0 && conanVida!=0);
                numZombie++;
            } while (numZombie-1!=NUMZOMBIETOT && conanVida!=0);
                System.out.print("-----------------------");
                System.out.print(conanVida==0?"GAME OVER":"\nENHORABUENA\nHAS LOGRADO EL TESORO\n");
                System.out.println("-----------------------");
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