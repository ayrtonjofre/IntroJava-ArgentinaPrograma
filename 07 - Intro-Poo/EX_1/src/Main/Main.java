package Main;

import Entidades.Cancion;

public class Main {

    /**
     * @param args the command line arguments Desarrollar una clase Cancion con
     * los siguientes atributos: título y autor. Se deberá definir además dos
     * constructores: uno vacío que inicializa el título y el autor a cadenas
     * vacías y otro que reciba como parámetros el título y el autor de la
     * canción. Se deberán además definir los métodos getters y setters
     * correspondientes.
     */
    public static void main(String[] args) {
        Cancion c1 = new Cancion();
        c1.recibir("SEÑOR DE LOS ANILLOS", "J.R TOLKIEN");
        System.out.println((c1.getTitulo()));
        System.out.println(c1.getAutor());
        System.out.println(c1.toString());
    }

}
