package Mains;


import java.util.Scanner;

public class EJ_1 {

    /**
     * Escribir un programa que pida dos números enteros por teclado y calcule 
     * la suma de los dos. El programa deberá después mostrar el resultado de la suma
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("INGRESE EL PRIMER NUMERO");
        int n1 = sc.nextInt();
        System.out.println("INGRESE EL SEGUNDO NUMERO");
        int n2 = sc.nextInt();
        int suma = n1 + n2;
        System.out.println("LA SUMA ES " + suma );
    }
    
}
