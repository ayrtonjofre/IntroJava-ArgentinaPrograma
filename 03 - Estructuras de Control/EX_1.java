package Guia3_Extra;
import java.util.Scanner;

public class EJ_1_MINUT {
    /**
     * @param args the command line arguments
     * Dado un tiempo en minutos, calcular su equivalente en días y horas. 
     * Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
     */
    public static void main(String[] args) {
        Scanner vlad = new Scanner(System.in);
        System.out.println("INGRESE LOS MINUTOS: ");
        int minutos = vlad.nextInt();
        int dias = minutos / (24*60);
        int horas = (minutos % (24 * 60)) / 60;
        System.out.println(minutos + " minutos equivalen a " + dias + " días y " + horas + " horas.");
    }
}