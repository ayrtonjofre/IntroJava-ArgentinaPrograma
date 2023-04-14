/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de adivinanza de números. 
El primer jugador elige un número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un número limitado de intentos y recibe una pista 
de "más alto" o "más bajo" después de cada intento. El juego termina cuando el segundo jugador adivina el número 
o se queda sin intentos. Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.
 */
package Entidades;

import java.util.Scanner;

public class Juego {

    private int num1;
    private int num2;

    public Juego() {
    }

    public Juego(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void iniciarJuego() {
        Scanner read = new Scanner(System.in);
        System.out.println("El jugador 1 debe elegir un numero:");
        num1 = read.nextInt();

        System.out.println("---------------");
    }

    public void definirJuego() {

        System.out.println("El jugador 2 tiene 5 intentos para descubrir el numero previamente definido");

        //Defino una variable X como auxilio para que registe el valor del contador, caso el usuario llegue al limite de intentos.
        int x = 0;
        for (int i = 0; i < 5; i++) {
            Scanner read = new Scanner(System.in);
            System.out.println("Ingrese el numero: ");
            num2 = read.nextInt();

            if (num2 != num1) {
                System.out.println("El numero ingresado es incorrecto, intente nuevamente!");
                x++;
            } else {
                System.out.println("Bien ahí titi!");
                break;
            }

            if (x == 5) {
                System.out.println("Has perdido manito!");
            }

        }

    }

}
