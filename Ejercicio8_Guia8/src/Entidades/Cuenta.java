/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea un método "retirar_dinero" que permita retirar 
una cantidad de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
 */
package Entidades;

import java.util.Scanner;

public class Cuenta {

    private double saldo;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public boolean ingresoSistema() {
        titular = "ayrton";
        saldo = 10000;
        int x = 0;
        for (int i = 0; i < 3; i++) {

            Scanner read = new Scanner(System.in);
            System.out.println("Ingrese el nombre del titular");
            String intento = read.next();
            if (!titular.equals(intento)) {
                System.out.println("Usuario incorrecto o inexistente, intente nuevamente");
                x++;
            } else {
                System.out.println("Bienvenido " + titular + " !" + " \n Su saldo es de: " + saldo + "$");
                return true;

            }

            if (x == 3) {
                System.out.println("Cuenta bloqueada");
                return false;
            }

        }
        return false;

    }

    public void retirarDinero() {
        double retiro;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el valor a retirar");
        retiro = read.nextDouble();

        do {
            if (retiro > saldo) {
                System.out.println("El valor ingresado es superior al monto");
                retiro = read.nextDouble();
            } else {
                saldo = saldo - retiro;
                System.out.println("Se retiró el money, su monto actual es de: " + saldo);
            }
        } while (retiro < saldo);
    }

}
