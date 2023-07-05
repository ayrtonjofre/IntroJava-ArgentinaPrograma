package Main;

import Entidades.Cuenta;

/**
 *
 * @author tomyv
 */
public class Main {

    /**
     * @param args the command line arguments
     * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
     * Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta.
     * Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
     */
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta ();
        c1.retirar_dinero();
    }
    
}
