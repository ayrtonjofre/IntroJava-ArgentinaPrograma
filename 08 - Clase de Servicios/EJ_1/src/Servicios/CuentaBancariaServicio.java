package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author tomyv Realizar una clase llamada CuentaBancaria en el paquete
 * Entidades con los siguientes atributos: numeroCuenta(entero),
 * dniCliente(entero largo), saldoActual. Agregar constructor vacío, con
 * parámetros, getters y setters. Agregar la clase CuentaBancariaServicio en el
 * paquete Servicios que contenga:
 *
 */
public class CuentaBancariaServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    //a) Método para crear cuenta pidiéndole los datos al usuario.
    public CuentaBancaria datear() {
        System.out.println("INGRESE EL NUMERO DE CUENTA");
        int numc = sc.nextInt();
        System.out.println("INGRESE EL DNI");
        long dni = sc.nextLong();
        System.out.println("INGRESE SU SALDO ACTUAL");
        double saldinho = sc.nextDouble();
        return new CuentaBancaria(numc, dni, saldinho);
    }

    //b) Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
    public double ingresar(double in, CuentaBancaria cb) {
        cb.setSaldoActual(cb.getSaldoActual() - in);
        return cb.getSaldoActual();
    }

    //c) Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual.
    //Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
    public double retirar(double ret, CuentaBancaria cb) {
        if (cb.getSaldoActual() < 0) {
            cb.setSaldoActual(0);
            System.out.println("NO EXISTE ESA CANTIDAD DE DINERO DISPONIBLE EN SU CUENTA");
            System.out.println("PERO LE RETIRAREMOS LO MAXIMO POSIBLE ");
        } else {
            System.out.println("RETIRADO");
        }
        return cb.getSaldoActual();
    }

    //d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%. 
    public void extraccionRapida(CuentaBancaria cb) {
        double sac = 0;
        cb.setSaldoActual(cb.getSaldoActual() * 0.20);
        System.out.println("¿QUIERE HACER UNA EXTRACCION RAPIDA?(S/N)");
        System.out.println("SOLO PUEDE $" + cb.getSaldoActual());
        String y = sc.next().toUpperCase();
        if (y.equals("S")) {
            do {
                sac = sc.nextDouble();
                if (sac > cb.getSaldoActual()) {
                    System.out.printf(sac + " ES MAYOR AL 20% DE $" + cb.getSaldoActual());
                    System.out.println("POR FAVOR INGRESE NUEVAMENTE UN VALOR ");
                }
            } while (sac > cb.getSaldoActual());
        }
        cb.setSaldoActual(cb.getSaldoActual() - sac);
    }

    //e) Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
    public void consultarSaldo(CuentaBancaria cb) {
        System.out.println("¿QUIERES SABER TU SALDO DISPONILBLE?(S/N)");
        String r = sc.next();
        r = r.toUpperCase();
        if (r.equals("S")) {
            System.out.println("TU SALDO DISPOBINLE ES $" + cb.getSaldoActual());
        }
    }

    //f) Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
    public void consultarDatos(CuentaBancaria cb) {
        System.out.println("¿QUIERES SABER TUS DATOS?(S/N)");
        String x = sc.next().toUpperCase();
        if (x.equals("S")) {
            System.out.println("EL DNI ES " + cb.getDniCliente());
            System.out.println("SU NUMERO DE CUENTA ES " + cb.getNumeroCuenta());
        }
    }

}
