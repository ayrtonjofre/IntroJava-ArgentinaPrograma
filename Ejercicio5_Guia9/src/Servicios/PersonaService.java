/*
Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado. OK
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.OK
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario. OK
Método mostrarPersona que muestra la información de la persona deseada.
 */
package Servicios;

import Entidades.Personas;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {
    //Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
    public Personas crearPersona(){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Indique seu nome:");
        String nombre = read.next();
        System.out.println("Indique seu dia de nascimento: ");
        int dia = read.nextInt();
        System.out.println("Indique seu mes seu nascimento: ");
        int mes = read.nextInt();
        System.out.println("Indique o ano do seu nascimento: ");
        int ano = read.nextInt();
        Date fecha = new Date(ano - 1900, mes -1, dia);
        System.out.println("Su nombre es: " + nombre + " Y su fecha de nacimiento es: " + fecha);
        return new Personas(nombre, fecha);
    } 
    
    //Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
    
    public int CalcularEdad(Personas p1){
        Date actual = new Date();
        return actual.getYear() - p1.getNacimiento().getYear();
    }
    
    //Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.
    //la edad pasada por parametro la utilizaré para comparar si la edad de la persona es mayor o menor a lo que indique.
    public boolean menorQue(Personas p1, int edad){
        return CalcularEdad(p1) < edad;
    }
    
    //Método mostrarPersona que muestra la información de la persona deseada.
    
    public void mostrarPersona(Personas p1){
        System.out.println(p1.toString());
    }
    
    
    
}
