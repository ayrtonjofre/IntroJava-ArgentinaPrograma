package Entidades;

import java.util.Scanner;

/**Crear una clase llamada Libro que contenga los siguientes atributos: 
     * ISBN, Título, Autor, Número de páginas, y un constructor con todos los 
     * atributos pasados por parámetro y un constructor vacío. Crear un método 
     * para cargar un libro pidiendo los datos al usuario y luego informar
     * mediante otro método el número de ISBN, el título, el autor del libro
     * y el número de páginas.
 */
public class Libro {
   private long ISBN ;
   private String Titulo;
   private String Autor;
   private int Paginas;

    public Libro() {
    }
    
    public void Data() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese los datos del libro:");
        System.out.println("ISBN");
        ISBN = sc.nextLong();
        System.out.println("Titulo");
        Titulo = sc.next();
        System.out.println("Autor");
        Autor = sc.next();
        System.out.println("Paginas");
        Paginas = sc.nextInt();
    }
    
    public void Imprimir(){
        System.out.println(ISBN);
        System.out.println(Titulo);
        System.out.println(Autor);
        System.out.println(Paginas);
    }
    
   
}
