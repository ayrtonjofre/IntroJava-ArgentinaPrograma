package Mains;

import java.util.Scanner;

public class EJ_5 {

    /**
     * Escribir un programa que lea un
     * número entero por teclado y muestre por pantalla el doble, el triple y la
     * raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("INGRESE UN VALOR");
        double n = sc.nextDouble();
        double d = n*2;
        double t = n*3;
        double r = Math.sqrt(n);
        System.out.println("EL DOBLE DE " + n + " ES " + d);
        System.out.println("EL TRIPLE DE " + n + " ES " + t);
        System.out.println("LA RAIZ DE " + n + " ES " + r);
    }

}
