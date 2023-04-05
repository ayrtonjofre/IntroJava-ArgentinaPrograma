/*
Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente.
 */
package ejerciciosclase9a11;

public class Ejercicio1 {

    public static void main(String[] args) {

        //Creo el vector
        int vector[] = new int[100];

        //Relleno el mismo con los nros enteros
        for (int i = 0; i < 100; i++) {
            vector[i] = i + 1;
        }

        // valor de i empieza en el indice 99 = nro 100 y desciende hasta que sea > o = a 0.
        for (int i = 99; i >= 0; i--) {
            // Mostramos los valores de forma descendiente
            System.out.println(vector[i]);
        }

    }
}
