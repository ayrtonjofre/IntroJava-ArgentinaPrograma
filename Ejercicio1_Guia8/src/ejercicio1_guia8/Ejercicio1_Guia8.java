/*
Realizar una clase llamada CuentaBancaria en el paquete Entidades con
los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
saldoActual. Agregar constructor vacío, con parámetros, getters y
setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que
contenga:
a) Método para crear cuenta pidiéndole los datos al usuario.
b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
se le sumará al saldo actual.
c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
retirar se retirará el máximo posible hasta dejar la cuenta en 0.
d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20%.
e) Método consultarSaldo: permitirá consultar el saldo disponible en la
cuenta.
f) Método consultarDatos: permitirá mostrar todos los datos de la
cuenta.

 */
package ejercicio1_guia8;

import Services.CuentaBancariaServicio;
import java.util.Scanner;

public class Ejercicio1_Guia8 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CuentaBancariaServicio cbs=new CuentaBancariaServicio();
        String resp;
        do {
            switch (menu()){
                case "a":
                    cbs.creaCuenta();
                    break;
                case "b":
                    System.out.print("Ingrese el valor a ingresar: ");
                    cbs.ingresar(sc.nextDouble());
                    break;
                case "c":
                    System.out.print("Ingrese la cantidad a retirar: ");
                    cbs.retirar(sc.nextDouble());
                    break;
                case "d":
                    System.out.println("Ingrese un valor a retirar (Extraccion rápida): ");
                    cbs.extraccionRapida(sc.nextDouble());
                    break;
                case "e":
                    cbs.consultarSaldo();
                    break;
                case "f":
                    cbs.consultarDatos();
                    break;
                default:
                    System.out.println("Opcion Incorrecta.");
            }
            System.out.println("Desea Salir? S/N");
            resp=sc.next();
        }while (resp.equalsIgnoreCase("n"));
    }
    private static String menu(){
        Scanner sc=new Scanner(System.in);
        String resp="";
        System.out.println("a. Crea Cuenta.");
        System.out.println("b. Ingresar Dinero.");
        System.out.println("c. Retirar Dinero.");
        System.out.println("d. Extraccion rápida.");
        System.out.println("e. Consultar saldo.");
        System.out.println("f. Consultar datos.");
        System.out.println("Ingrese una opción----> ");
        resp=sc.next();
        return resp;
    }
}


