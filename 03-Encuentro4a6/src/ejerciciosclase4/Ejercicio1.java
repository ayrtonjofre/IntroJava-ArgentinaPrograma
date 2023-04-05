/*
Crear un programa que dado un número determine si es par o impar.
 */
package ejerciciosclase4;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese un numero para validar si es par o impar:");
        int num = read.nextByte();
        
        if (num%2 == 0){
            System.out.println("El numero es par");
        }
        else {
            System.out.println("El numero es impar");
        }
    }
}
