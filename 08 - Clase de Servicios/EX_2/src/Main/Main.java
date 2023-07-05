package Main;

import Servicios.NIFServicies;

public class Main {
    /**
     * @param args the command line 
     * 
     */
    public static void main(String[] args) {
        NIFServicies ns = new NIFServicies();
        ns.crearNif();
        ns.mostrar();
    }
    
}
