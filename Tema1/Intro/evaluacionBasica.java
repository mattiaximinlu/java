
/*Ejercicio Evaluación básica
Debes implementar un programa que indique el sueldo mensual total de un empleado que trabaja en la empresa PCFactory S.A.
Para calcular el sueldo hay una serie de factores que se deben de tener en cuenta.
La primera es el sueldo BASE que es 950€ para todo los empleados de la empresa, por cada año de antigüedad en la empresa percibe 150€ más.
Además existe una bonificación de 10€ por hijo/mes
También hay que tener en cuenta las horas extras realizadas que se pagan a 21,4€/hora.
Del sueldo total calculado hay que restar 5% que se queda la empresa para formación.

La salida debe tenes este formato:
El empleado recibirá en su nómina mensual “xxxx.xx” €
De los cuales:
   - xxx.xx € son del sueldo BASE + antigüedad+ bonificación por hijo
   - xxx.xx € son de horas extras realizadas (“xxx” horas realizadas)
   -”-xxx.xx” € para formación

Debes entregar el Archivo.java con el que has implementado la solución
Cuida el nombre de las variables,, que los nombres sigan la nomenclatura que hemos visto en clase,  que los tipos de las diferentes variables que utilices sean el correcto,  la limpieza del código que escribas y realiza comentarios si lo veas oportuno. */
import java.util.Scanner;

public class evaluacionBasica {
    public static void main(String[] args) {
        // finals
        Scanner sc = new Scanner(System.in);
        final int BASE = 950;
        final int ANT = 150;
        final int HIJO = 10;
        final float EXTRA = 21.4f;
        final int FOR = 5;
        // scanners
        System.out.print("Antigüedad: ");
        int nAnt = sc.nextInt();
        System.out.print("Nº hijo: ");
        int nHijos = sc.nextInt();
        System.out.print("Horas extras: ");
        int hEx = sc.nextInt();
        sc.close();
        // calculos
        int totBase = BASE + nAnt * ANT + nHijos * HIJO;
        float totEx = EXTRA * hEx;
        float totFor = (totBase + totEx) * FOR / 100;
        float tot = totBase + totEx - totFor;
        // resultado
        System.out.println("El empleado recibirá en su nómina mensual \"" + tot + "\"€");
        System.out.println("De los cuales:");
        System.out.println("- " + totBase + "€ son del sueldo BASE + antigüedad+ bonificación por hijo");
        System.out.println("- " + totEx + "€ son de horas extras realizadas (\"" + hEx + "\" horas realizadas)");
        System.out.println("-\"-" + totFor + "\"€ para formación");
    }
}