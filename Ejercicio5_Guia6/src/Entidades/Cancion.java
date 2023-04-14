/*
Desarrollar una clase Cancion OK con los siguientes atributos: título y autor. OK Se deberá definir además dos constructores: uno vacío que 
inicializa el título y el autor a cadenas vacías y otro que reciba 
como parámetros el título y el autor de la canción. OK Se deberán además definir los métodos getters y setters correspondientes.
 */
package Entidades;

import java.util.Scanner;

public class Cancion {

    //Atributos
    private String titulo;
    private String autor;

    //Constructor Vacio
    public Cancion() {
    }

    //Constructor con atributos
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    //Getters and setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void pideCancion() {
        Scanner read = new Scanner(System.in);
        System.out.println("Defina el titulo del tema:");
        titulo = read.next();
        System.out.println("Defina el autor del tema:");
        autor = read.next();
    }

    public void devuelveCancion() {
        System.out.println("El tema es: " + titulo + " De " + autor);
    }

}
