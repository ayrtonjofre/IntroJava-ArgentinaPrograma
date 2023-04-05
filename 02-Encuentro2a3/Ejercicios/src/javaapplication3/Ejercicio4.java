/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/
package javaapplication3;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor ingrese la temperatura en CELCIUS");
        double C = sc.nextDouble();
        double F = 32 + (9 * C / 5);
        
        System.out.println("El valor de celcius en fahrenheit es: " + F);
    }
        
}

