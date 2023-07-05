package Main;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CuentaBancariaServicio cbs = new CuentaBancariaServicio();
        
        CuentaBancaria cb = cbs.datear();
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.println("¿CUANTA CANTIDAD DE DINERO QUIERE INGRESAR? ");
        double ing = sc.nextInt();
        System.out.println("SU NUEVO SALDO ES " + cbs.ingresar(ing,cb));

        System.out.println("¿CUANTA CANTIDAD DE DINERO QUIERE RETIRAR?");
        double ret = sc.nextDouble();
        System.out.println("SU NUEVO SALDO ES $" + cbs.retirar(ret,cb));
        
        cbs.extraccionRapida(cb);
        
        cbs.consultarSaldo(cb);
        
        cbs.consultarDatos(cb);

    }

}
