package Entidades;

import java.util.Scanner;

/**
 *
 * @author tomyv Definir una clase llamada Puntos que contendrá las coordenadas
 * de dos puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un
 * punto. Generar un objeto puntos usando un método crearPuntos() que le pide al
 * usuario los dos números y los ingresa en los atributos del objeto. Después, a
 * través de otro método calcular y devolver la distancia que existe entre los
 * dos puntos que existen en la clase Puntos. Para conocer como calcular la
 * distancia entre dos puntos consulte el siguiente link:
 * //http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
 */
public class Puntos {

    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Puntos() {
    }

    public void crearPuntos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE LAS COORDENADAS DE 1");
        System.out.println("X1");
        x1 = sc.nextDouble();
        System.out.println("Y1");
        y1 = sc.nextDouble();
        System.out.println("INGRESE LAS COORDENADAS DE 2");
        System.out.println("X2");
        x2 = sc.nextDouble();
        System.out.println("Y2");
        y2 = sc.nextDouble();
    }

    public double Distancia() {
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }

}
