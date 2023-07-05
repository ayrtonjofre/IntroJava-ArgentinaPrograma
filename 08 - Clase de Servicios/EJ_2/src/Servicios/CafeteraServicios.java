/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cafetera;

/**
 *
 * @author tomyv Crear clase CafeteraServicio en el paquete Servicios con los
 * siguiente:
 *
 * 
 */
public class CafeteraServicios {
     Cafetera caf = new Cafetera();

    public CafeteraServicios() {

    }

    //a) Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
    public void llenarCafetera() {
        caf.setCapacidadMáxima((int)(Math.random() * 50) + 1);
        caf.setCantidadActual(caf.getCapacidadMáxima());
        System.out.println("LA CAFETERA TIENE " + caf.getCapacidadMáxima() + " GR ");
    }
    
    //b) Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y
    //simula la acción de servir la taza con la capacidad indicada.
    //Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
    //El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza. 
    public void servirTaza(int tamTaza){
        if (caf.getCantidadActual()<= tamTaza) {
            caf.setCantidadActual(caf.getCantidadActual()-tamTaza);
            System.out.println("NO SE PUDO LLENAR LA TAZA. QUEDO " + caf.getCantidadActual() + "  ML EN LA TAZA");
        } else {
           System.out.println("SE LLENO LA TAZA");
           caf.setCantidadActual(caf.getCantidadActual()-tamTaza);
        }
    }
    
    //c) Método vaciarCafetera(): pone la cantidad de café actual en cero. 
    public void vaciarCafetera(){
        caf.setCantidadActual(0);
        System.out.println("LA CANTIDAD DE CAFE ES " + caf.getCantidadActual() + " GR"); 
    }
    
    //d) Método agregarCafe(int): se le pide al usuario una cantidad de café, 
    //el método lo recibe y se añade a la cafetera la cantidad de café indicada.
    public void agregarCafe(int agrCafe){
        caf.setCantidadActual(caf.getCantidadActual() + agrCafe);
        System.out.println("HAY " + caf.getCantidadActual() + " GR EN LA CAFETERA");
    }
}
