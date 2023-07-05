package Entidades;

import java.util.Scanner;

/**
 * @author tomyv
 *  
 */

//Crear una clase Rectángulo que modele rectángulos.
public class Rectangulo {
    // por medio de un atributo privado base y un atributo privado altura.
    private double base;
    private double altura;

    public Rectangulo() {
    }

    
    //La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario
    public void CrearRectangulo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base");
        base = sc.nextDouble();
        System.out.println("Ingrese la altura");
        altura = sc.nextDouble();
    }
    
    //También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro
    //del rectángulo. 
    public void Superficiar(){
        double superficie = base * altura;
        System.out.println("EL SUPERFICIE ES " + superficie );
    }
    //Perimetro 
    public void Perimetrar(){
        double perimetro = (base + altura)*2;
        System.out.println("EL PERIMETRO ES " + perimetro);
    }
    
    //Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura.
    public void Dibujar(){
        System.out.println("EL RECTANGULO:");
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    //Se deberán además definir los métodos getters, setters y constructores correspondientes. 

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
