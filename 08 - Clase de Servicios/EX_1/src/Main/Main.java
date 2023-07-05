package Main;

import Servicies.RaicesServicio;
public class Main {

    /**
     * @param args t
     */
    public static void main(String[] args) {
        RaicesServicio rs = new RaicesServicio();
        rs.datear();
        rs.getDiscriminante();
        rs.calcular();
    }

}
