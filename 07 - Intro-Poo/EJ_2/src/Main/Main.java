
package Main;

import Entidades.Circunferencia;

public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia();   
        c1.crearCircunferencia();
        c1.perimetro();
        c1.getRadio();
        c1.area();
    }
    
}
