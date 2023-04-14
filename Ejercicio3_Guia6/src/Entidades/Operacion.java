/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se deben crear los siguientes métodos: OK
Método constructor con todos los atributos pasados por parámetro. OK
Método constructor sin los atributos pasados por parámetro. OK
Métodos get y set. OK
Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto. OK
Método sumar(): calcular la suma de los números y devolver el resultado al main. OK
Método restar(): calcular la resta de los números y devolver el resultado al main OK
Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, el 
método devuelve 0 y se le informa al usuario 
el error. Si no, se hace la multiplicación y se devuelve el resultado al main OK
Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, 
el método devuelve 0 y se le informa al usuario 
el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package Entidades;

import java.util.Scanner;

public class Operacion {

    private int numero1;
    private int numero2;

    //Metodo constructor con los atributos
    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //Metodo constructor sin los atributos
    public Operacion() {
    }
    
    

    //Metodos Getters and Setters
    public int getNumero1() {
        
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    //Metodo Crear Operacion
    public void crearOperacion() {
        Scanner read = new Scanner(System.in);
        System.out.println("Por favor ingrese el numero 1");
        numero1 = read.nextInt();
        System.out.println("Por favor ingrese el numero 2");
        numero2 = read.nextInt();
    }

    //Metodo sumar
    public void sumar() {
        int numero3 = numero1 + numero2;
        System.out.println("La suma de los numeros es = " + numero3);
    }

    //Metodo restar
    public void restar() {
        int numero3 = numero1 - numero2;
        System.out.println("La resta de los numeros es = " + numero3);
    }

    //Metodo multiplicar
    public void multiplicar() {
        if (numero2 == 0) {
            System.out.println("No se permite multiplicar por 0");
        } else {
            int numero3 = numero1 * numero2;
            System.out.println("El resultado de la multiplicación es = " + numero3);
        }
    }

    //Metodo dividir
    public void dividir() {
        if (numero2 == 0) {
            System.out.println("No se permite dividir por 0");
        } else {
            double numero3 = numero1 / numero2;
            System.out.println("El resultado de la división es = " + numero3);
        }
    }
}
