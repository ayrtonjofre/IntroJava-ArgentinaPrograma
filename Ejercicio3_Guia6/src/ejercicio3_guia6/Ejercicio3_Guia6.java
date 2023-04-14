/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se deben crear los siguientes métodos:
Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
Métodos get y set.
Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, el 
método devuelve 0 y se le informa al usuario 
el error. Si no, se hace la multiplicación y se devuelve el resultado al main
Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, 
el método devuelve 0 y se le informa al usuario 
el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.

 */
package ejercicio3_guia6;

import Entidades.Operacion;

public class Ejercicio3_Guia6 {

    public static void main(String[] args) {
        
        //Creo el objeto Operacion para poder obtener los datos de los atributos de los metodos
        Operacion op1 = new Operacion();
        
        //Creo la operacion solicitando los numeros al user
        op1.crearOperacion();
        
        //Llamo el metodo suma
        op1.sumar();
        
        //Llamo el metodo resta
        op1.restar();
        
        //Llamo el metodo multiplicar
        op1.multiplicar();
        
        //Llamo el metodo dividir
        op1.dividir();
        
    }
    
}
