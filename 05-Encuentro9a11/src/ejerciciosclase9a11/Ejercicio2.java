/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a 
buscar en el vector. El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */
package ejerciciosclase9a11;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        int vector[] = new int[10];
        Scanner read = new Scanner(System.in);

        // el 20 equivale al max num random y el 1 es para que no arranque los random en "0".
        for (int i = 0; i < 10; i++) {
            vector[i] = (int) (Math.random() * 20 + 1);
        }

        System.out.println("Por favor ingrese un numero a buscar.");
        int num = read.nextInt();

        int x = 0;
        for (int i = 0; i < 10; i++) {
            if (vector[i] == num) {
                x++;
                System.out.println("El numero encontrado esta en la posición: " + i);
            }

        }

        System.out.println("El numero: " + num + " Se encontró: " + x + " veces");

    }
}
