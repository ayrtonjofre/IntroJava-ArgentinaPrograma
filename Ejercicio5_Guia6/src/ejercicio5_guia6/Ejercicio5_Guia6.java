/*
Desarrollar una clase Cancion con los siguientes atributos: título y autor. Se deberá definir además dos constructores: uno vacío que inicializa el título y 
el autor a cadenas vacías y otro que reciba 
como parámetros el título y el autor de la canción. Se deberán además definir los métodos getters y setters correspondientes.
 */
package ejercicio5_guia6;

import Entidades.Cancion;

public class Ejercicio5_Guia6 {

    public static void main(String[] args) {
        
        Cancion tema1 = new Cancion();
        
        
        tema1.pideCancion();
        tema1.devuelveCancion();
         
    }
    
}
