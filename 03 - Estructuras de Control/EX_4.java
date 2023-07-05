package Guia3_Extra;
import java.util.Scanner;

public class EJ_4_ROMANO {

    /**
     * @param args the command line arguments
     * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
     */
    public static void main(String[] args) {
        Scanner vlad = new Scanner(System.in);
        int n; 
        int c=0;
        System.out.println("INGRESE UN NUMERO ENTRE 1 Y 10");
        n = vlad.nextInt();
        switch (n) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
            default:
                c=1;
                System.out.println("Opcion no valida");
                break;
        }
    }
}