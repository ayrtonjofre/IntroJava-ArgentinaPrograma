/*
Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), constructor vacío, 
constructor parametrizado, get y set. Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.
 */
package ejercicio05_guia9;

import Entidades.Personas;
import Servicios.PersonaService;

public class Ejercicio5_Guia9 {

    public static void main(String[] args) {
        
        PersonaService ps1 = new PersonaService();
        Personas p1 = ps1.crearPersona();
        
        if(ps1.menorQue(p1,18)){
            System.out.println( p1.getNombre().toUpperCase() + " IS OLDER THAN 18 YEARS OLD");
        }else{
            System.out.println( p1.getNombre().toUpperCase() + " IS YOUNGER THAN 18 YEARS OLD");
        }
        
        ps1.mostrarPersona(p1);
        
        
    }
    
}
