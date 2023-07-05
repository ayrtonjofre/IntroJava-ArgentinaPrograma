/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author tomyv
 * Programa Nespresso. Desarrolle una clase Cafetera en el paquete
Entidades con los atributos capacidadMáxima (la cantidad máxima de
café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Agregar constructor vacío y con
parámetros así como setters y getters.
 */
public class Cafetera {
    private int cantidadActual;
    private int capacidadMáxima;

    public Cafetera() {
    }

    public Cafetera(int cantidadActual, int capacidadMáxima) {
        this.cantidadActual = cantidadActual;
        this.capacidadMáxima = capacidadMáxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void setCapacidadMáxima(int capacidadMáxima) {
        this.capacidadMáxima = capacidadMáxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public int getCapacidadMáxima() {
        return capacidadMáxima;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "cantidadActual=" + cantidadActual + ", capacidadM\u00e1xima=" + capacidadMáxima + '}';
    }
    
}
