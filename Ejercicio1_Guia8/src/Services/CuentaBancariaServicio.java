/*
Realizar una clase llamada CuentaBancaria en el paquete Entidades con
los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
saldoActual. Agregar constructor vacío, con parámetros, getters y
setters. OK
Agregar la clase CuentaBancariaServicio en el paquete Servicios que
contenga:
a) Método para crear cuenta pidiéndole los datos al usuario. OK
b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
se le sumará al saldo actual. OK
c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
retirar se retirará el máximo posible hasta dejar la cuenta en 0. OK
d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20%. OK
e) Método consultarSaldo: permitirá consultar el saldo disponible en la
cuenta. OK
f) Método consultarDatos: permitirá mostrar todos los datos de la
cuenta. OK
 */
package Services;

import Entidades.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {

    Scanner read = new Scanner(System.in);

    CuentaBancaria cb = new CuentaBancaria();

    public void creaCuenta() {
        System.out.println("Ingrese el numero de cuenta: ");
        cb.setNumeroCuenta(read.nextInt());

        System.out.println("Ingrese el numero de DNI: ");
        cb.setDniCliente(read.nextLong());

        System.out.println("Ingrese el saldo actual: ");
        cb.setSaldoActual(read.nextDouble());
    }

    public void ingresar(double ingreso) {
        System.out.println("Por favor ingrese un monto a ingresar");
        double saldoA = cb.getSaldoActual() + ingreso;
        cb.setSaldoActual(saldoA);
        System.out.println("Tu nuevo saldo es: " + saldoA);
    }

    public void retirar(double retiro) {
        //System.out.println("Por favor ingrese el valor a retirar: ");
        double saldoA = cb.getSaldoActual();
        if (retiro > saldoA) {
            System.out.println("No tenes fondos suficientes, se retira lo que tenga tu cuenta");
            cb.setSaldoActual(0);
            System.out.println(cb.getSaldoActual());
        } else {
            System.out.println("Se retiró el dinero indicado");
            //uso el operador -= para restar directamente
            cb.setSaldoActual(saldoA -= retiro);
        }
    }

    public void extraccionRapida(double retiroRapido) {
        System.out.println("Por favor ingrese el valor a retirar: ");
        double aux = cb.getSaldoActual() * 0.20;

        if (retiroRapido <= aux) {
            double saldoA = cb.getSaldoActual() - retiroRapido;
            cb.setSaldoActual(saldoA);
            System.out.println("Tu saldo actual quedó en: " + saldoA);
        } else {
            cb.setSaldoActual(cb.getSaldoActual() * 0.80);
            System.out.println("Su saldo actual quedó en: " + cb.getSaldoActual());
        }

    }
    
    public void consultarSaldo(){
        System.out.println("Su saldo actual es: " + cb.getSaldoActual());
    }
    

    
    public void consultarDatos(){
        System.out.println(cb.getNumeroCuenta() + "\n" + cb.getDniCliente() + "\n" + cb.getSaldoActual());
    }
    
    
}
