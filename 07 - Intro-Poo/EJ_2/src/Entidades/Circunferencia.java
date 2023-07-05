// A continuación, se deben crear los siguientes métodos:
//Método constructor que inicialice el radio pasado como parámetro.
//Métodos get y set para el atributo radio de la clase Circunferencia.
//Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
//Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
//Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
package Entidades;

import java.util.Scanner;
public class Circunferencia {
    private float radio;

    public Circunferencia() {
    }
    
    public Circunferencia(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE EL RADIO:");
        radio = sc.nextFloat();
        System.out.println("EL RADIO ES: " + radio);
    }

    public void area() {
        double area =(3.14*radio)*(3.14*radio);
        System.out.println("EL AREA ES: " + area);
    }

    public void perimetro() {
        double Perimetro = 2 * 3.14 * radio;
        System.out.println("EL PERIMETRO ES: " + Perimetro);
    }
    

}
