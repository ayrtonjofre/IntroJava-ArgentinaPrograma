/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número ingresado 
seguido de tantos asteriscos como indique su valor. Por ejemplo
 */
package ejerciciosclase4;

import java.util.Scanner;

public class GuiaEjercicio5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;
        int ast;
        int i;
        
        System.out.println("Ingrese el numero 1:");
        num1 = read.nextInt();
        
        System.out.println("Ingrese el numero 2:");
        num2 = read.nextInt();
        
        System.out.println("Ingrese el numero 3:");
        num3 = read.nextInt();
        
        System.out.println("Ingrese el numero 4:");
        num4= read.nextInt();
        
        
    }
}
