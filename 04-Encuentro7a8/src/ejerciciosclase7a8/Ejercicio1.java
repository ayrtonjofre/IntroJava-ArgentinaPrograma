/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. 
La aplicación debe tener una función 
para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 
 */
package ejerciciosclase7a8;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int num1 = read.nextInt();
        System.out.println("Ingrese el segun numero: ");
        int num2 = read.nextInt();

        boolean x = true;
        do {
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");

            System.out.println("Elija una opcion: ");

            int opcion = read.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Resultado de suma es: " + sumar(num1, num2));
                    break;
                case 2:
                    System.out.println("Resultado de resta es: " + restar(num1, num2));
                    break;
                case 3:
                    System.out.println("Resultado de multiplicar es: " + multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.println("Resultado de dividir es: " + dividir(num1, num2));
                    break;

                default:
                    x = false;
                    System.out.println("La opcion ingresada no es valida, intente nuevamente.");
                    break;
            }
        } while (x);

    }

    //El nombre de variable en el parametro no necesariamente debe ser igual.
    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static int restar(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static float dividir(int num1, int num2) {
        return (float) num1 / num2;
    }

}
