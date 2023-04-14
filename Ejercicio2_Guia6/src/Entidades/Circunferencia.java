/*
Circunferencia

Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, 
se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
 */
package Entidades;

import java.util.Scanner;

public class Circunferencia {
    
    //Utilizar al generar los constructores la opcion Getter And Setters.
    
    
    private double radio;

    public Circunferencia() {
    }
    
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el valor del Radio");
        radio = read.nextDouble();
    }

    public void area() {
        double area = Math.PI * (radio * radio);
        System.out.println("Es el resultado del area es: " + area);
    }

    public void perimetro() {
        double perimetro = Math.PI * 2 * radio;
        System.out.println("El resultado del perimetro es: " + perimetro);
    }
    
}
