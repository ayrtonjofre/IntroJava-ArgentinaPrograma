package Guia3_Extra;

import java.util.Scanner;


public class EJ_11_DIGITOS {

    /**
     * @param args the command line arguments
     * Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número.
     * Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5.
     * Calcular la cantidad de dígitos matemáticamente utilizando el operador de división.
     * Nota: recordar que las variables de tipo entero truncan los números o resultados.
     */
    public static void main(String[] args) {
        Scanner vlad = new Scanner(System.in);
        int aux;
        int contador=0;
        System.out.println("INGRESE UN NUMERO ENTERO");
        int n = vlad.nextInt();
        while (n!=0) {
            n = n / 10;
            contador++;
        }
    System.out.println("El número tiene " + contador + " dígitos.");
    }
    
}
