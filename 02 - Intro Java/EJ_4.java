package Mains;

import java.util.Scanner;

public class EJ_4 {

    /**
     * Dada una cantidad de grados centígrados se debe mostrar su equivalente
     * en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("INGRESE LA TEMPERATURA ACTUAL EN CENTIGRADOS");
        double c = sc.nextDouble();
        double f =  32 + (9 * c / 5);
        System.out.println(c + "ºC SON " + f + "ºF");
    }
    
}
