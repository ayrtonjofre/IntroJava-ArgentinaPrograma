/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

22

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Services;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaServices {

    ArrayList<Pelicula> lista = new ArrayList();
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public ArrayList crearPelicula() {
        String aux;
        do {
            System.out.println("Ingrese el titulo");
            String titulo = read.next();
            System.out.println("Ingrese el director:");
            String director = read.next();
            System.out.println("Ingrese la duración:");
            double duraccion = read.nextDouble();
            Pelicula peli = new Pelicula(titulo, director, duraccion);
            lista.add(peli);
            System.out.println("Desea ingresar una nueva pelicula? (S/N)");
            aux = read.next();
        } while (aux.equalsIgnoreCase("S"));
        //System.out.println(lista);
        return lista;
    }

    public void mostrarPelicula() {
        System.out.println("Las peliculas guardadas son: ");
        for (Pelicula pelicula : lista) {
            System.out.println(pelicula);
        }
    }

    public void mayores1hora() {
        System.out.println("Las peliculas con duración mayor a una hora son: ");
        for (Pelicula pelicula : lista) {
            if (pelicula.getDuracion() > 1) {
                System.out.println("Nombre: " + pelicula.getTitulo() + " " + "Duración" + pelicula.getDuracion());
            }
        }

    }

    public void ordenarDuracion() {
        System.out.println("Las peliculas ordenadas por duración son: ");
        Collections.sort(lista, Pelicula.compararMayor);
        mostrarPelicula();

    }

    public void ordenarMenor() {
        System.out.println("Las peliculas ordenadas por menor duración son: ");
        Collections.sort(lista, Pelicula.compararMenor);
        mostrarPelicula();

    }

    public void ordenarTitulo() {
        System.out.println("Las peliculas ordenadas por titulo son: ");
        Collections.sort(lista, Pelicula.compararTitulo);
        mostrarPelicula();

    }

    public void ordenarDirector() {
        System.out.println("Las peliculas ordenadas por director son: ");
        Collections.sort(lista, Pelicula.compararDirector);
        mostrarPelicula();

    }

}
