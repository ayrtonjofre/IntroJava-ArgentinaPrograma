/*
Clase Libro
 */
package Entidades;

import java.util.Scanner;

public class Libro {

    public long ISBN;
    public String titulo;
    public String autor;
    public int paginas;

    public Libro() {
    }

    public Libro(long ISBN, String titulo, String autor, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void ingresaDato() {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el numero de ISBN");
        ISBN = read.nextLong();

        System.out.println("Ingrese el Titulo");
        titulo = read.next();

        System.out.println("Ingrese el nombre de autor");
        autor = read.next();

        System.out.println("Ingrese el numero de paginas");
        paginas = read.nextInt();

    }

    public String devuelveDato() {
        return  "Datos del Libro\n"
                + "ISBN: " + ISBN + "\n"
                + "Título del Libro: " + titulo + "\n"
                + "Autor del Libro : " + autor + "\n"
                + "Número de páginas del libro : " + paginas;
    }
}
