
package Guia_3;
import java.util.Scanner;

public class EJ_3_8CAR {
    /**
     * Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
     * Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
     * en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
     */
    public static void main(String[] args) {
        Scanner vlad = new Scanner(System.in);
        String phrase;
        System.out.println("Ingrese 8 caracteres");
        do { 
            phrase = vlad.nextLine();
            if (phrase.length()!=8) {
                System.out.println("Incorrecto");
            }else{
                System.out.println("Correcto");
            }  
        } while(phrase.length()!=8);
    }
}