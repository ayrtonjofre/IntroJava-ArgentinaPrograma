/*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
El programa deberá después mostrar el resultado de la suma
 */
package javaapplication3;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresar 2 numeros");
        System.out.println("Escribir el numero1: ");
        int num1 = sc.nextInt();
        System.out.println("Escribir el numero2: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        
        System.out.println("La suma de los numeros es: " + sum);

        
    }
}
