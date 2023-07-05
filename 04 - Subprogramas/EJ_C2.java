package Guia_4;
import java.util.Scanner;

public class EJ_C2 {
    /**
    * @param args the command line arguments
    * Escribir un programa que procese una secuencia de caracteres ingresado
    * por teclado y terminada en punto, y luego codifique la palabra o frase 
    * ingresada de la siguiente manera: cada vocal se reemplaza por el carácter
    * que se indica en la tabla y el resto de los caracteres
    * (incluyendo a las vocales acentuadas) se mantienen sin cambios.
    * aeiou
    * @#$%*
    * Realice un subprograma que reciba una secuencia de caracteres
    * y retorne la codificación correspondiente.
    * Utilice la estructura “según” para la transformación. 
    * Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
    * La salida del programa debería ser:     @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
    */
    public static void main(String[] args) {
        Scanner vlad = new Scanner(System.in);
        String frase;
        do {
        System.out.println("INGRESE UNA FRASE TERMINADA EN PUNTO");            
            frase = vlad.nextLine();
        }while (!frase.endsWith("."));
        System.out.println (Codificar(frase));
    }
    
    public static String Codificar(String fr){
        fr = fr.toLowerCase();
        String con = "";
        int longitud = fr.length();
        for (int i = 0; i < longitud; i++){
            fr = fr.substring(i,i+1);
            switch (fr){
                case "a": 
                    fr = "@";
                break;
                case "e": 
                    fr="#";
                break;
                case "i": 
                    fr="$";
                break;
                case "o": 
                    fr="%";
                break;
                case "u":
                    fr="*";
                break;   
            }
            con = con.concat(fr);
        } 
       return con;
    }
}