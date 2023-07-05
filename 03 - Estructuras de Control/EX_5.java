package Guia3_Extra;

import java.util.Locale;
import java.util.Scanner;

public class EJ_5_DESCUENTOS {

    /**
     * @param args the command line arguments
     * Una obra social tiene tres clases de socios:
     * Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50%
     * de descuento en todos los tipos de tratamientos.
     * Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35%
     * de descuento para los mismos tratamientos que los socios del tipo A.
     * Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
     * Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente
     * el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.
     */
    public static void main(String[] args) {
        Scanner vlad = new Scanner(System.in);
        double total;
        System.out.println("INGRESE SU CATEGORIA (A/B/C): ");
        String categoria = vlad.next();
        System.out.println("INGRESE SU MONTO:");
        int monto = vlad.nextInt();
        categoria = categoria.toUpperCase();
        if (categoria.equals("A")){
            total = (float) monto * 0.50;
        }else if (categoria.equals("B")){
            total = (float) monto * 0.35; 
        }else{
            total = (float) monto;
        }
        System.out.println( "AL SER DE CATEGORIA " + categoria +  " DEBE PAGAR $" + total);
    }
}                