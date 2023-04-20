/*
Programa Nespresso. 
Desarrolle una clase Cafetera en el paquete Entidades con los atributos capacidadMáxima 
(la cantidad máxima de café que puede contener la cafetera) 
y cantidadActual (la cantidad actual de café que hay en la cafetera). Agregar constructor 
vacío y con parámetros así como setters y getters. Crear clase CafeteraServicio 
en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 

Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la 
acción de servir la taza con la capacidad indicada. Si la cantidad 
actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El método le informará al usuario 
si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.

Método vaciarCafetera(): pone la cantidad de café actual en cero.

Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.

 */
package ejercicio2_guia8;

import Entidades.Cafetera;
import Services.CafeteraServicio;
import java.util.Scanner;

public class Ejercicio2_Guia8 {
    

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        CafeteraServicio cs1 = new CafeteraServicio();
        Cafetera c1 = new Cafetera();
        cs1.llenarCafetera(c1);
        String resp;
        
        do {
            switch (menu()) {
                case 1:
                    System.out.println("Cual es el tamaño de su café?");
                    int cafe = read.nextInt();
                    cs1.servirTaza(c1, cafe);
                    break;
                case 2:
                    cs1.vaciarCafetera(c1);
                    break;
                case 3:
                    cs1.agregarCafe(c1);
                    break;
                default:
                    System.out.println("Opcion Incorrecta.");
            }
            System.out.println("Desea Salir? S/N");
            resp=read.next().toLowerCase();
        } while (resp.equalsIgnoreCase("n"));

    }
    
    
    private static int menu(){
        Scanner read=new Scanner(System.in);
        int resp=0;
        System.out.println("1. Servir Taza.");
        System.out.println("2. Vaciar Cafetera.");
        System.out.println("3. Agregar Cafe.");
        System.out.println("Ingrese una opción----> ");
        resp=read.nextInt();
        return resp;
    }
    
    
    
}
