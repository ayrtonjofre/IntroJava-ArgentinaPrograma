package ejerciciosclase7a8;

import java.util.Scanner;

/**
 *Escribir un programa que procese una secuencia de caracteres ingresada por teclado y
 * terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera:
 * cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres 
 * (incluyendo a las vocales acentuadas) se mantienen sin cambios.
aeiou
@#$%*

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación 
* correspondiente. Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
public class EjercicioGuia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Ingrese secuencia de caracteres: ");
        Scanner input = new Scanner(System.in);
        String phrase = input.nextLine();
        System.out.println(phrase);
        System.out.println(vocals(phrase));
    }   


public static String vocals(String word){

    String loop;
    String concatena="";
    int len = word.length();
    
    for (int i = 0; i < len; i++) {
       loop = word.substring(i,i+1);
       
       switch (loop) {
            case "a":
                loop = "@";
                break;
            case "e":
                loop = "#";
                break;
            case "i":
                loop = "$";
                break;
            case "o":
                loop = "%";
                break;
            case "u":
                loop = "*";
                break;    
            //default:
               // loop = loop;
                
               
        }
     
       concatena = concatena.concat(loop);
        
    }
          
    return concatena;

}
}