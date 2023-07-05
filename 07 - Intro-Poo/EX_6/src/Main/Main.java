/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.Rectangulo;

/**
 *
 * @author tomyv
 */
public class Main {

    /**
     * @param args the command line arguments * Crea una clase "Rectángulo" que
     * tenga atributos "lado1" y "lado2" y un método "calcular_area" que calcule
     * y devuelva el área del rectángulo. Luego crea un objeto "rectangulo1" de
     * la clase "Rectángulo" con lados de 4 y 6 y imprime el área del
     * rectángulo.
     */
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo();
        System.out.println("EL AREA ES " + rectangulo1.calcular_area(4, 6));
    }

}
