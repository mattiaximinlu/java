public class string {
    public static void main(String[] args) {
        String cadena1="Quiero durmir.";
        String cadena2="Quiero durmir.";
        String cadena3="QUIERO DURMIR.";
//leer longitud de la cadena
        int l=cadena1.length();
        int p=1;
        while (l>p){
//numeresimo caracter(empieza por 0) de la cadena x
            System.out.print(cadena1.charAt(p-1));
            p=p+1;
        }
        System.out.println();
//Compare
        //si es igual devuelve 0, si no devuelve la diferencia entre los primeros disuguales en la tabla ascii.
        System.out.println("\""+cadena1+"\""+ " y "+"\""+cadena2+"\""+" son "+(cadena1.compareTo("Quiero durmir.")==0? "IGUALES":"DIFERENTES"));
        System.out.println("\""+cadena1+"\""+ " y "+"\""+cadena2+"\""+" son "+((cadena1=="Quiero durmir.")? "IGUALES":"DIFERENTES"));
        System.out.println("\""+cadena1+"\""+ " y "+"\""+cadena2+"\""+" son "+(cadena1.compareTo(cadena2)==0? "IGUALES":"DIFERENTES"));
        System.out.println("La diferencia entre \""+cadena3+"\""+ " y "+"\""+cadena1+"\""+" son "+(cadena1.compareTo(cadena3)));
        //ignora mayuscula minuscula
        System.out.println("Ignore case: \""+cadena3+"\""+ " y "+"\""+cadena1+"\""+" son "+(cadena3.compareToIgnoreCase(cadena1)==0?"IGUALES":"DIFERENTES"));


//indexOf, cerca tutte le lettere o parole in una frase.
        int pos=0;
        final String busca="r";
        String res="la letra \""+busca+"\" está en la posicion(empieza por 0): ";
        //cerca what, da which posizione(difetto 0), se non lo trova, devuelve un -1.
        pos=cadena1.indexOf(busca,pos);
        while (pos!=-1){
            res=res+pos+" ";
            pos=cadena1.indexOf(busca,pos+1);
        }
        System.out.println(res);
//may min
        System.out.println("\""+cadena1+"\""+"en mayuscula: "+cadena1.toUpperCase());
        System.out.println("\""+cadena1+"\""+"en minuscula: "+cadena1.toLowerCase());
//replace, se puede poner los numeros ascii, replaceall puede ser usada combinando con \\ que tiene otras funciones, \\d todos los numero,\\s espacio en blanco etc. mientras replace no puede.
        System.out.println(cadena1.replace("r","a"));
        System.out.println(cadena1.replaceAll("r","a"));
        System.out.println(cadena1.replaceFirst("r","a"));
//trim, elimina espacio delante y detras.
        System.out.println(cadena1.trim());
//split, cortar una cadena, numero para decir en cuantas partes.(0, o nada=todos)
        String[] split=cadena1.split("r");
        System.out.println("Split o trozo 0: "+split[0]+", 1: "+split[1]+", 2: "+split[2]); 
//substring, corta desde x a y.
        System.out.println(cadena1.substring(3));
        System.out.println(cadena1.substring(2,10));
//concat, unir cadenas.
        System.out.println(cadena1.concat(cadena3));
//valueof, convertir en cadena
        float pi=3.1415926f;
        String P=String.valueOf(pi);
        System.out.println(P);
//stringbuffer
        StringBuffer buffer= new StringBuffer(cadena1);
        //modificar una letra, solo letra, de una cadena.
        buffer.setCharAt(0, 'T');
        System.out.println(buffer);
        //inserta en una posicion una cadena.
        buffer.insert(0, "No");
        System.out.println(buffer);
//character
        //comprueba si es un numero
        boolean esDigito=Character.isDigit('1');
        //comprueba si es un espacio
        Character.isSpaceChar(' ');
        System.out.println(esDigito);
        //comprueba si es un mayuscula
        Character.isUpperCase('A');
        

    }
}
