/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el 
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package ejerciciosclase4;

import java.util.Scanner;

public class EjercicioExtra1 {
    public static void main(String[] args) {
        int dias = 1440; 
        
        System.out.println("Por favor ingrese la cantidad de minutos:");
        Scanner read = new Scanner(System.in);
        
        int minutos = read.nextInt();
        float horas = minutos / 60f;
        double cdias = Math.floor(horas/24);
        double choras = (horas/24) % cdias;
        
        System.out.println("Usted ingresó: " + minutos + " minutos. Los cuales equivalen a: " + Math.round(cdias) + " dias y a: " + Math.round(choras * 24) + " horas!");
    }
}
