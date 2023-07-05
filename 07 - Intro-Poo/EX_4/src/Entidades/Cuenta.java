package Entidades;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author tomyv Crea una clase "Cuenta" que tenga atributos como "saldo" y
 * "titular". Luego, crea un método "retirar_dinero" que permita retirar una
 * cantidad de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca
 * sea negativo después de realizar una transacción de retiro.
 */
public class Cuenta {

    private double saldo;
    private String titular;

    public Cuenta() {
    }

    public void retirar_dinero() {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        double retirar;
        System.out.println("INGRESE SU NOMBRE");
        titular = sc.nextLine();
        titular = titular.toUpperCase();
        saldo = r.nextInt(3000);
        if (saldo > 0) {
            System.out.println(titular + " TU SALDO ES $" + saldo);
            System.out.println("¿CUANTO QUERES RETIRAR?");
            do {
                retirar = sc.nextDouble();
                if (retirar <= saldo) {
                    double total = saldo - retirar;
                    System.out.println("PERFECTO , SU SALDO ACTUAL ES $" + total);
                } else {
                    System.out.println("ERROR");
                    System.out.println("INGRESE UNA CANTIDAD MENOR A SU SALDO");
                }
            } while (retirar > saldo);
        }
    }
}
