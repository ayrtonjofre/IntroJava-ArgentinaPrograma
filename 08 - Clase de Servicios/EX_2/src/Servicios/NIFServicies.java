package Servicios;

import Entidades.NIF;
import java.util.Scanner;

/**
 * @param args the command line argumentsDígito Verificador. Crear una clase NIF
 * que se usará para mantener DNIs con su correspondiente letra (NIF). Los
 * atributos serán el número de DNI (entero largo) y la letra (String o char)
 * que le corresponde.  *
 * 
 *
 *
 */

public class NIFServicies {

    NIF n = new NIF();
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    //Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra
    //que le corresponderá. Una vez calculado, le asigna la letra que le corresponde según
    public void crearNif() {
        int l;
        System.out.println("INGRESE EL DNI");
        do {
            n.setDni(sc.nextLong());
            l = String.valueOf(n.getDni()).length();
            if (l != 8) {
                System.out.println("ESCRIBE UN VALOR DE 8 CIFRAS");
            }
        } while (l != 8);
        String cadena = "TRWAGMYFPDXBNJZSQVHLCKE";
        int pos = (int) n.getDni() % 23;
        n.setLetra(cadena.substring(pos,pos+1));
    }
    
    //Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la
    //letra en mayúscula; por ejemplo: 00395469-F).
    public void mostrar(){
        System.out.println( "SU NIF ES " + n.getDni() + "-" + n.getLetra());
    }
    
}
