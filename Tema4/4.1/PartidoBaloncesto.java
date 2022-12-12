
public class PartidoBaloncesto {

    // Variables de los equipos
    final static int E1_ACIERTO_2 = 70;
    final static int E2_ACIERTO_2 = 75;

    final static int E1_ACIERTO_3 = 45;
    final static int E2_ACIERTO_3 = 35;

    final static int E1_JUEGA_DE_2 = 60;
    final static int E2_JUEGA_DE_2 = 70;

    final static int E1_REBOTE_DEF = 60;
    final static int E1_REBOTE_ATA = 30;
    final static int E2_REBOTE_DEF = 70;
    final static int E2_REBOTE_ATA = 40;

    public static void main(String[] args) {

        int puntosE1 = 0;
        int puntosE2 = 0;

        System.out.println("Empieza la simulación del partido de baloncesto");

        // salto Inicial
        String turno = salto();
        System.out.println("Ataca el equipo: " + turno);

        // Un partido de baloncesto hay unas 150 posesiones de media.
        for (int posesion = 0; posesion < 150; posesion++) {

            int valorAtaque = canasta(turno);

            // Si hay canasta entonces el turno es del equipo que estaba defendiendo
            if (valorAtaque > 0) {
                if (turno.equals("E1")) {
                    puntosE1 = actualizarPuntos(puntosE1, valorAtaque);
                } else {
                    puntosE2 = actualizarPuntos(puntosE2, valorAtaque);
                }
                System.out.println("Canasta de " + turno + " - de " + valorAtaque + " puntos");
                imprimirResultado(puntosE1, puntosE2);
                turno = siguienteTurno(turno);
                System.out.println("Ataca el equipo: " + turno);
            } else {
                // no hay canasta, se produce un rebote
                turno = rebote(turno);
                System.out.println("Rebote del equipo: " + turno);
            }

            // si hay empate doy 40 posesiones mas
            if (posesion == 149 && puntosE1 == puntosE2) {
                System.out.println("EMPATE --- Hay Prorroga");
                posesion = 109;
            }
        }
        System.out.println("-------------------------");
        System.out.println("FIN de partido");
        imprimirResultado(puntosE1, puntosE2);
        System.out.println(" **** GANA EL EQUIPO: " + (puntosE1 > puntosE2 ? "E1" : "E2"));

    }

    // Funciones que necesito programar
    /*
     * salto() --> devuelve E1 si el salto lo gana E1 y E2 si el salto lo gana E2
     * canasta(turno) --> devuelve el valor de la canasta realizada (0, 2 o 3)
     * actualizarPuntos(turno, valor)
     * canasta(turno, tipoTiro) ---> dado un turno y el tipo de tiro devuelve true
     * si hay canasta y false si no
     * canasta(porcentaje) ---> indica si hay canasta según el porcentaje;
     * tipoTiro(turno) --> devuelve el tipo de tiro que va a realizar el equipo que
     * tiene el turno(tiro2 o tiro3)
     * tipoTiro(int porcentaje2) -> devuelve el tipo de tiro que se produce según el
     * porcentaje indicado (se genera un numero entre 0 y 100 y según el valor de
     * X_JUEGA_DE_2 elegir que tipo de tiro hace)
     * rebote(String equipoAtaque) ---> devuelve E1 si el rebote lo gana E1 y E2 si
     * el rebote lo gana E2
     * rebote(int reboteAtaque, int reboteDefensa) ---> indica true si el rebote es
     * de ataque y false si el rebote es de defensa
     * El rebote del equipo atacante es de 0 a maximo y el rebote del equipo que
     * defiende es de 30 al maximo. El que saque más será el ganador del rebote
     * aleatorio(maximo)--> devuelve un numero aleatorio entre 0 y maximo
     * aleatorio(minimo, maximo) ---> devuelve un número entre mínimo y máximo
     * imprimirResultado(int valor1, int valor2) ---> imprime el resultado actual
     * del partido.
     */

    /**
     * Devuelve 0,2 o 3 dependiendo si el equipo que ataca consigue canasta o no y
     * según el tipo
     * 
     * @param equipoAtaca
     * @return
     */
    static int canasta(String equipoAtaca) {
        int resultado = 0;
        int tiro = tipoTiro(equipoAtaca);
        boolean acierta = canasta(equipoAtaca, tiro);
        if (acierta) {
            resultado = tiro;
        }
        return resultado;
    }

    /**
     * Devuelve si gana la canasta segun el atacante y tipo de tiro
     * 
     * @param turno
     * @param tipoTiro
     * @return
     */
    static boolean canasta(String turno, int tipoTiro) {
        boolean acierto;
        if (turno.equals("E1")) {
            if (tipoTiro == 2) {
                acierto = canasta(E1_ACIERTO_2);
            } else {
                acierto = canasta(E1_ACIERTO_3);
            }
        } else {
            if (tipoTiro == 2) {
                acierto = canasta(E2_ACIERTO_2);
            } else {
                acierto = canasta(E2_ACIERTO_3);
            }
        }
        return acierto;
    }

    /**
     * Devuelve true si hay canasta y false en caso contrario
     * 
     * @param porcentajeAcierto
     * @return
     */
    static boolean canasta(int porcentajeAcierto) {
        int random = (int) (Math.random() * 100);
        boolean canasta = false;
        if (porcentajeAcierto > random) {
            canasta = true;
        }
        return canasta;
    }

    /**
     * tipo de tiro del atacante
     * 
     * @param turno
     * @return
     */
    static int tipoTiro(String turno) {
        int tiro = tipoTiro(turno.equals("E1") ? E1_JUEGA_DE_2 : E2_JUEGA_DE_2);
        return tiro;
    }

    /**
     * Devuelve 2 si intenta tirar de 2 y 3 si intenta tirar de 3
     * Se genera un numero aleatorio de 0 a 100 y si es mayor al porcentajeTiro2
     * entonces el tiro es de 3
     * 
     * @param porcentajeTiro2
     * @return
     */
    static int tipoTiro(int porcentajeTiro2) {
        int random = aleatorio(100);
        int tiro = random > porcentajeTiro2 ? 3 : 2;
        System.out.println("    Tira de " + tiro);
        return tiro;
    }

    /**
     * Devuelve el equipo que gana el sato inicial
     * Utiliza la funcion rebote
     * 
     * @return
     */
    static String salto() {
        String resultado = "E1";
        boolean gana = rebote(E2_REBOTE_ATA, E1_REBOTE_ATA);
        if (gana) {
            resultado = "E2";
        }
        return resultado;
    }

    /**
     * Devuelve un mumero entero aleatorio entre 0 y maximo
     * 
     * @param maximo
     * @return
     */
    static int aleatorio(int maximo) {
        int random = (int) (Math.random() * maximo);
        return random;
    }

    /**
     * Devuelve un numero entero aleatorio entre minimo y maximo
     * 
     * @param maximo
     * @param minimo
     * @return
     */
    static int aleatorio(int minimo, int maximo) {
        int random = (int) (Math.random() * (maximo - minimo) + minimo);
        return random;
    }

    /**
     * Devuelve el equipo que consigue obtener el rebote de un tiro.
     * 
     * @param equipoAtaca
     * @return
     */
    static String rebote(String equipoAtaca) {
        boolean gana;
        String rebotePara;
        if (equipoAtaca.equals("E1")) {
            gana = rebote(E1_REBOTE_ATA, E2_REBOTE_DEF);
        } else {
            gana = rebote(E1_REBOTE_DEF, E2_REBOTE_ATA);
        }
        rebotePara = gana ? "E1" : "E2";
        return rebotePara;
    }

    /**
     * Devuelve true si el rebote se lo lleva el equipo atacante y false si se lo
     * lleva el equipo defensor
     * El rebote del equipo atacante es de 0 a maximo y el rebote del equipo que
     * defiende es de 30 al maximo.
     * El que saque más será el ganador del rebote
     * 
     * @param porcentajeAtaque
     * @param porcentajeDefensa
     * @return
     */
    static boolean rebote(int porcentajeAtaque, int porcentajeDefensa) {
        int probAtaque = aleatorio(porcentajeAtaque);
        int probDefensa = aleatorio(30, porcentajeDefensa);
        boolean gana = probAtaque > probDefensa;
        return gana;
    }

    /**
     * Devuelve el equipo contrario al que se le pasa por parametros
     * 
     * @param equipo
     * @return
     */
    static String siguienteTurno(String equipo) {
        String resultado = equipo.equals("E1") ? "E2" : "E1";
        return resultado;
    }

    static int actualizarPuntos(int punto, int valor) {
        return punto + valor;
    }

    static void imprimirResultado(int punto1, int punto2) {
        System.out.println("E1: " + punto1 + " - E2: " + punto2);
    }
}