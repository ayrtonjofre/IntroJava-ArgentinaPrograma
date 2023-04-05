/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el 
triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
package javaapplication3;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int doble = num1 * 2;
        int triple = num1 * 3;
        double raiz = Math.sqrt(num1);
        
        System.out.println("El numero es: " + num1);
        System.out.println("El doble del numero es: " + doble);
        System.out.println("El triple del numero es: " + triple);
        System.out.println("La raiz del numero es: " + raiz);
    }
}
