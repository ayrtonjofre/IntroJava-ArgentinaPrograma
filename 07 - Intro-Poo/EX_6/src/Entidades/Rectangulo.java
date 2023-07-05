package Entidades;


/**
 *
 * @author tomyv
 */
public class Rectangulo {
    private int lado1;
    private int lado2;

    public Rectangulo() {
    }
    
    public double calcular_area(int lado1 , int lado2){
        int area = lado1*lado2;
        return area;
    }
}
