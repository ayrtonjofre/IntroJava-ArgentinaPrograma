/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus atributos 
serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos usando un método crearPuntos() que 
le pide al usuario los dos números y los ingresa en los atributos del objeto. Después, a través de otro método calcular y devolver 
la distancia que existe entre los dos puntos que existen en la clase Puntos.
 */
package ejercicio6_guia6;

import Entidades.Punto;

public class Ejercicio6_Guia6 {

    public static void main(String[] args) {
        
        Punto p1 = new Punto();
        
        
        p1.crearPuntos();
        
        System.out.println("La distancia entre el punto X e Y es: " + p1.calcularDistancia());
        
    }
    
}
