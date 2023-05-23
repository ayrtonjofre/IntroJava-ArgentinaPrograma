/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no. OK
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package Servicios;

import Entidades.Alumnos;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicesAlumnos {

    ArrayList<Alumnos> al = new ArrayList();
    
    private Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void crearAlumnos() {
        do {
            System.out.println("Defina el nombre:");
            String nombre = read.next();
            ArrayList<Integer> auxNotas = new ArrayList();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota" + (i + 1));
                auxNotas.add(read.nextInt());
            }
            
            al.add(new Alumnos(nombre, auxNotas));
            System.out.println("Desea ingresar otro alumno S/N ?");
        } while (read.next().equalsIgnoreCase("S"));

    }
    
    public void mostrarAlumnos(){
        for (Alumnos alumnos : al) {
            System.out.println(alumnos.getNombre());
        }
    }
    
    
    public void notaFinal(){
        System.out.println("Ingrese el nombre del alumno a sacar promedio:");
        String auxNombre = read.next();
        int s = 0;
        for (Alumnos auxAlumno : al) {
            if (auxAlumno.getNombre().equals(auxNombre)) {
                for (int i = 0; i < auxAlumno.getNotas().size(); i++) {
                  s += auxAlumno.getNotas().get(i);
                }
                System.out.println("El promedio del alumno es: " + s / auxAlumno.getNotas().size());
                break;
            }
        }
        
        
    }

}
