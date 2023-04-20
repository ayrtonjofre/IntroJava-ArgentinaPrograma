/*
Programa Nespresso. 
Desarrolle una clase Cafetera en el paquete Entidades con los atributos capacidadMáxima 
(la cantidad máxima de café que puede contener la cafetera) 
y cantidadActual (la cantidad actual de café que hay en la cafetera). Agregar constructor 
vacío y con parámetros así como setters y getters. OK
Crear clase CafeteraServicio 
en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. OK

Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la 
acción de servir la taza con la capacidad indicada. Si la cantidad 
actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El método le informará al usuario 
si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza. OK

Método vaciarCafetera(): pone la cantidad de café actual en cero.OK

Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada. OK
 */
package Services;

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    public int llenarCafetera(Cafetera c1) {
        c1.setCapacidadMaxima(3000);
        c1.setCantidadActual(c1.getCapacidadMaxima());
        System.out.println("La cafetera esta llena, tiene: " + c1.getCantidadActual() + "ml");
        return c1.getCantidadActual();
    }
    
    public int servirTaza(Cafetera c1, int taza) {
        if (taza <= c1.getCantidadActual()) {
            c1.setCantidadActual(c1.getCantidadActual() - taza);
            System.out.println("Se llenó su taza");
            System.out.println("Cantidad de cafe actual es: " + c1.getCantidadActual());
        } else {
            taza = c1.getCantidadActual();
            c1.setCantidadActual(0);
            System.out.println("La taza se llenó con lo que había: " + taza + "ml");
            
        }
        return c1.getCantidadActual();
    }
    
    public int vaciarCafetera(Cafetera c1){
        c1.setCantidadActual(0);
        System.out.println("La cafetera se vació por completo");
        return c1.getCantidadActual();
    }
    
    public void agregarCafe(Cafetera c1){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Cafe");
        int aux = read.nextInt();
        c1.setCantidadActual(aux + c1.getCantidadActual());
        if ((aux + c1.getCantidadActual()) > c1.getCapacidadMaxima()) {
            int aux2 = c1.getCapacidadMaxima() - c1.getCantidadActual();
            System.out.println("Se lleno la cafetera y sobró: " + aux2);    
        } else {
            System.out.println("Quedó: " + c1.getCantidadActual() + "ml"); 
        }
        
    }
    
    
}
