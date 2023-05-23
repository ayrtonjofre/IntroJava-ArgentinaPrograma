/*
Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un programa para organizar la información de cada curso. Para ello, crearemos una clase entidad 
llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde),  precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de 
dimensión 5 (cinco), donde se alojarán los nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
Un constructor por defecto.
Un constructor con todos los atributos como parámetro.
Métodos getters y setters de cada atributo.
Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases. Nosotros nos encargaremos de almacenar esta información en un arreglo e 
iterar con un bucle, solicitando en cada repetición que se ingrese el nombre de cada alumno. OK
Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Curso. 
En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos OK
Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por día, 
el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.
 */
package Service;

import Entidades.Curso;
import java.util.Scanner;

public class CursoService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    Curso c1 = new Curso();

    /*Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases. 
    Nosotros nos encargaremos de almacenar esta información en un arreglo e 
    iterar con un bucle, solicitando en cada repetición que se ingrese el nombre de cada alumno. */
    public void cargarAlumnos() {
        String alumnos[] = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno: " + (i + 1));
            alumnos[i] = read.next();
            c1.setAlumnos(alumnos);
        }
    }

    //Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Curso. 
    public void crearCurso() {
        System.out.println("Ingrese el nombre del curso");
        c1.setNombreCurso(read.next());
        System.out.println("Ingrese la cantidad de horas por dia: ");
        c1.setCantidadHorasPorDia(read.nextInt());
        System.out.println("Ingrese la cantidad de dias por semana: ");
        c1.setCantidadDiasPorSemana(read.nextInt());
        System.out.println("Ingrese el turno: ");
        c1.setTurno(read.next());
        System.out.println("Ingrese el precio por hora: ");
        c1.setPrecioPorHora(read.nextInt());

        cargarAlumnos();

    }

    /* Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por día, 
    el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro. */
    public double calcularGananciaSemanal() {
        return (c1.getCantidadHorasPorDia() * c1.getPrecioPorHora() * c1.getAlumnos().length * c1.getCantidadDiasPorSemana());
    }

}
