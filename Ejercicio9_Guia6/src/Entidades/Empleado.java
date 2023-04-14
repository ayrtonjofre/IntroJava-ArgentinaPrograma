/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". Luego, crea un método "calcular_aumento" que calcule 
el aumento salarial de un empleado en función de su edad y salario actual. El aumento salarial debe ser del 10% si el empleado 
tiene más de 30 años o del 5% si tiene menos de 30 años.
 */
package Entidades;

//Clase con sus respectivos atribu
import java.util.Scanner;

public class Empleado {

    private String nombre;
    private int edad;
    private double salario;

    //Constructor vacio
    public Empleado() {
    }

    //Constructor con los atributos
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;

    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calcularAumento() {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        nombre = read.next();
        System.out.println("Ingrese su edad;");
        edad = read.nextInt();
        System.out.println("Ingrese su salario actual");
        salario = read.nextDouble();

        if (edad >= 30) {
            salario = salario + 0.1 * salario;
            System.out.println("Que tal " + nombre + " Su salario con un aumento de 10% será: " + salario);
        } else if (edad < 30) {
            salario = salario + 0.05 * salario;
            System.out.println("Que tal " + nombre + " Su salario con un aumento de 5% será: " + salario);
        }

    }

}
