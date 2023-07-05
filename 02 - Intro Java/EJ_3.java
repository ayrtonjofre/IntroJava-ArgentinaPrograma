package Mains;

import java.util.Scanner;

public class EJ_3 {

    /**
     * Escribir un programa que pida una
     * frase y la muestre toda en mayúsculas y después toda en minúsculas. Nota:
     * investigar la función toUpperCase() y toLowerCase() en Java.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("INGRESA UNA FRASE");
        String frase = sc.next();
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
    }

}
