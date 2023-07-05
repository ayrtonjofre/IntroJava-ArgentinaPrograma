package Entidades;

import java.util.Scanner;

/**
 *
 * @author tomyv
 * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario".
     * Luego, crea un método "calcular_aumento" que calcule el aumento salarial
     * de un empleado en función de su edad y salario actual.
     * El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
*/
public class Empleado {
    
    private String nombre;
    private double edad;
    private double salario;
    
    public Empleado() {
    }
    
    public void calcular_aumento(){
        Scanner sc = new Scanner (System.in);
        double aumento;
        System.out.println("INGRESE SU NOMBRE");
        nombre = sc.nextLine();
        nombre = nombre.toUpperCase();
        System.out.println("¿CUAL ES TU SALARIO " + nombre + "?");
        salario = sc.nextDouble();
        System.out.println("¿Y TU EDAD?");
        edad = sc.nextDouble();
        if(edad>30){
            aumento = salario * 0.10;
            System.out.println( nombre + ", TU NUEVO SUELDO ES " + aumento);
        }else{
            aumento = salario * 0.05;
            System.out.println(nombre + ", TU NUEVO SALARIO ES " + aumento);
        }
    }
}