package Mains;

import java.util.Scanner;

public class EJ_2 {

    /**
     * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("¿CUAL ES TU NOMBRE?");
        String name = sc.next();
        System.out.println("TU NOMBRE ES " + name);
    }
    
}
