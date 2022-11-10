import java.util.Scanner;
public class ej10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("En que mes naciste: ");
        String mes= sc.nextLine().toLowerCase();
        System.out.print("En que dia naciste: ");
        int dia= sc.nextInt();
        sc.close();
        if (dia>0){
            switch (mes) {
                case "enero":
                    if (dia>=20 && dia<=31) {
                        System.out.println("Eres Acuario");
                    } else if(dia<20){
                        System.out.println("Eres Capricornio");
                    }else{
                        System.out.println("Dia invalido");
                    }
                    break;
                case "febrero":
                    if (dia>=19 && dia<=29) {
                        System.out.println("Eres Piscis"); 
                    } else if (dia<19){
                        System.out.println("Eres Acuario");
                    }else{
                        System.out.println("Dia invalido");
                    }
                    break;
                case "marzo":
                    if (dia>=21 && dia<=31) {
                        System.out.println("Eres Aries");
                    } else if(dia<21) {
                        System.out.println("Eres Piscis"); 
                    }else{
                        System.out.println("Dia invalido");
                    }
                    break;
                case "abril":
                    if (dia>=20 && dia<=30) {
                        System.out.println("Eres Tauro");
                    } else if (dia<20){
                        System.out.println("Eres Aries");
                    }else{
                        System.out.println("Dia invalido");
                    }
                    break;
                case "mayo":
                    if (dia>=21 && dia<=31) {
                        System.out.println("Eres Gemini");
                    } else if (dia<21){
                        System.out.println("Eres Tauro");
                    }else{
                        System.out.println("Dia invalido");
                    }
                    break;
                case "junio":
                    if (dia>=21 && dia<=30) {
                        System.out.println("Eres Cáncer");
                    } else if(dia<21){
                        System.out.println("Eres Gemini");
                    }else{
                        System.out.println("Dia invalido");
                    }
                    break;
                case "julio":
                    if (dia>=23 && dia<=31) {
                        System.out.println("Eres Leo");
                    } else if(dia<23){
                        System.out.println("Eres Cáncer");
                    }else{
                        System.out.println("Dia invalido");
                    }
                    break;
                case "agosto":
                    if (dia>=23 && dia<=31) {
                        System.out.println("Eres Virgo");
                    } else if(dia<23){
                        System.out.println("Eres Leo");
                    }else{
                        System.out.println("Dia invalido");
                    }
                    break;
                case "septiembre":
                    if (dia>=23 && dia<=30) {
                        System.out.println("Eres Libra");
                    } else if(dia<23) {
                        System.out.println("Eres Virgo");
                    }else{
                        System.out.println("Dia invalido");
                    }
                    break;
                case "octubre":
                    if (dia>=23 && dia<=31) {
                        System.out.println("Eres Escorpio");
                    } else if(dia<23){
                        System.out.println("Eres Libra");
                    }else{
                        System.out.println("Dia invalido");
                    }
                    break;
                case "noviembre":
                    if (dia>=22 && dia<=30) {
                        System.out.println("Eres Sagitario");
                    } else if(dia<22){
                        System.out.println("Eres Escorpio");
                    }else{
                        System.out.println("Dia invalido");
                    }
                    break;
                case "diciembre":
                    if (dia>=22 && dia<=31) {
                        System.out.println("Eres Capricornio");
                    } else if(dia<22){
                        System.out.println("Eres Sagitario");
                    }else{
                        System.out.println("Dia invalido");
                    }
                    break;
                default:
                    System.out.println("No es un mes.");
            }
        }
        else{
            System.out.println("No puedes ser nacido en un dia negativo");
        }
    }
}
