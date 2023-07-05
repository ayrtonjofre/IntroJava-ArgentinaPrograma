package Main;

import Entidades.Operacion;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacion op = new Operacion();
        op.crearOperacion();
        System.out.println("Su suma es: " + op.sumar());
        System.out.println("Su division es: " + op.dividir());
        System.out.println("Su resta es: " + op.restar());
        System.out.println("Su multiplicacion es: " + op.multiplicar());
    }

}
