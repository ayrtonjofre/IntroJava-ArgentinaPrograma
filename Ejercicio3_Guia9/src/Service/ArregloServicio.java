/*
Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales. 
Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.

 */
package Service;

import java.util.Arrays;

//Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
public class ArregloServicio {

    //Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
    public void inicializarA(double[] a) {

        for (int i = 0; i < a.length; i++) {

            a[i] = Math.random() * 100 + 1;

        }

    }

    //Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
    public void mostrar(double[] a) {

        System.out.println(Arrays.toString(a));

    }

    //Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
    public void ordenar(double[] a) {

        Arrays.sort(a);

        for (int i = 0; i < a.length / 2; i++) {
            double x = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = x;

        }

        System.out.println(Arrays.toString(a));
    }

//Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B.
//Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
    public void inicializarB(double[] b, double[] a) {

        for (int i = 0; i < 10; i++) {
            b[i] = a[i];
        }

        double x = 0.5;
        Arrays.fill(b, 10, 19, x);

    }

}
