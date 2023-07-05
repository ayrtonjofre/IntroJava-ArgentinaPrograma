package Main;

import Servicios.CafeteraServicios;
import java.util.Scanner;

/**
 *
 * @author tomyv
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        CafeteraServicios cs = new CafeteraServicios();
        
        cs.llenarCafetera();

        System.out.println("¿CUAL ES EL TAMAÑO DE LA TAZA?");
        int tt = sc.nextInt();
        cs.servirTaza(tt);

        System.out.println("¿QUIERE VACIAR LA CAFETERA (S/N)?");
        String res2 = sc.next();
        res2 = res2.toUpperCase();
        if (res2.equals("S")) {
            cs.vaciarCafetera();
        }
        
        System.out.println("¿QUERES AGREGAR CAFE(S/N)?");
        String cafe = sc.next();
        cafe = cafe.toUpperCase();
        if (cafe.equals("S")) {
            System.out.println("INGRESE UNA CANTIDAD");
            int can = sc.nextInt();
            cs.agregarCafe(can);
        }
        
    }
}
