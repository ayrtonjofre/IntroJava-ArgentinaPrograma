/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea un método "retirar_dinero" que permita retirar 
una cantidad de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
 */
package ejercicio8_guia8;

import Entidades.Cuenta;

public class Ejercicio8_Guia8 {

    public static void main(String[] args) {
        Cuenta c1 = new Cuenta();
        
        c1.ingresoSistema();
        
        c1.retirarDinero();
    }
    
}
