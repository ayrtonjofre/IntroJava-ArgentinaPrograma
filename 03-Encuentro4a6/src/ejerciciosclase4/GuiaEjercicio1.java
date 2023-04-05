/* Implementar un programa que le pida dos números enteros al usuario y 
determine si ambos o alguno de ellos es mayor a 25.
 */
package ejerciciosclase4;

import java.util.Scanner;

public class GuiaEjercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese 2 numeros enteros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > 25 && num2 > 25) {
            System.out.println("Ambos numeros son mayor a 25!");
        } else if (num1 > 25 && num2 <= 25) {
            System.out.println("Solamente el numero 1 es mayor a 25!");
        } else if (num1 <= 25 && num2 > 25) {
            System.out.println("Solamente el numero 2 es mayor a 25!");
        } else {
            System.out.println("Ambos numeros son menores o iguales a 25!");
        }
    }
}
