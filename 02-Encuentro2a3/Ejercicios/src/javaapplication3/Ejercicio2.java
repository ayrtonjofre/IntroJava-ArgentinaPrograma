// Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
package javaapplication3;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Por favor ingrese su nombre: ");
        String name = sc.nextLine();
        
        System.out.println("Mi nombre es: " + name);
    }
    
}
