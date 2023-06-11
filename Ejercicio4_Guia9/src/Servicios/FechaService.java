/*
Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 
Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. 
Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
 */
package Servicios;

import java.util.Date;
import java.util.Scanner;

public class FechaService {

    // Método para solicitar la fecha de nacimiento del usuario
    public Date fechaNacimiento() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el día de nacimiento (1-31): ");
        int dia = sc.nextInt();
        System.out.print("Introduce el mes de nacimiento (1-12): ");
        int mes = sc.nextInt();
        System.out.print("Introduce el año de nacimiento: ");
        int anio = sc.nextInt();
        Date fechaNacimiento = new Date(anio - 1900, mes - 1, dia);
        System.out.println("Tu fecha de nacimiento es: " + fechaNacimiento);
        return fechaNacimiento;
    }

    // Método para obtener la fecha actual
    public Date fechaActual() {
        Date fechaActual = new Date();
        System.out.println("La fecha actual es: " + fechaActual);
        return fechaActual;
    }

    // Método para calcular la diferencia de años entre dos fechas
    public void diferencia(Date fechaInicio, Date fechaFin) {
        int anios = fechaFin.getYear() - fechaInicio.getYear();
        if (fechaFin.getMonth() < fechaInicio.getMonth()) {
            anios--;
        } else if (fechaFin.getMonth() == fechaInicio.getMonth()
                && fechaFin.getDate() < fechaInicio.getDate()) {
            anios--;
        }
        System.out.println("La diferencia de años entre las dos fechas es: " + anios);
    }
}
