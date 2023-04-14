/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
package ejercicio2_guia6;

import Entidades.Circunferencia;


public class Ejercicio2_Guia6 {

    public static void main(String[] args) {
        //Creo el objeto
        Circunferencia c1 = new Circunferencia();
        
        //Genero las intancias para traer los resultados en los constructores generados.
        c1.crearCircunferencia();
        c1.area();
        c1.perimetro();
    }

}
