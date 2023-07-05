package Guia3_Extra;

import java.util.Scanner;

public class EJ_3_VOCAL {
    /**
     * @param args the command line arguments
     * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
     * Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
     */
    public static void main(String[] args) {
        Scanner vlad = new Scanner(System.in);
        System.out.println("INGRESE UNA LETRA: ");
        String letra = vlad.next();
        letra = letra.toLowerCase();
        if (letra.equals("a")||letra.equals("e")||letra.equals("i")||letra.equals("o")||letra.equals("u")) {
            System.out.println("ES UNA VOCAL");
        }else{
            System.out.println("NO ES UNA VOCAL");
        }
    }
    
}
