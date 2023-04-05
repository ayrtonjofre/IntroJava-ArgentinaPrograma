/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el cuadrado tiene 4 
elementos por lado se deberá dibujar lo siguiente
 */
package ejerciciosclase4;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Please enter a value to use: ");
        
        int n = read.nextInt();
        // Para crear la estructura del for, utilizar: for+tabular.
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
                System.out.println("");
            
        }
    }
}
