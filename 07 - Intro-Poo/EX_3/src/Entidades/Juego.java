package Entidades;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author tomyv Crea una clase "Juego" que tenga un método "iniciar_juego" que
 * permita a dos jugadores jugar un juego de adivinanza de números. El primer
 * jugador elige un número y el segundo jugador intenta adivinarlo. El segundo
 * jugador tiene un número limitado de intentos y recibe una pista de "más alto"
 * o "más bajo" después de cada intento. El juego termina cuando el segundo
 * jugador adivina el número o se queda sin intentos. Registra el número de
 * intentos necesarios para adivinar el número y el número de veces que cada
 * jugador ha ganado.
 */
public class Juego {

    private int n;
    private int ad;

    public Juego() {
    }

    public Juego(int n) {
        this.n = n;
    }

    public void iniciarJuego() {
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE EL NUMERO A ADIVINAR");
        ad = sc.nextInt();
        System.out.println("ADIVINA EL NUMERO, TENES 5 INTENTOS");
        for (int i = 0; i < 5; i++) {
            n = sc.nextInt();
            if (n == ad) {
                System.out.println("ADIVINASTE");
                i = 4;
            } else if (i == 4) {
                System.out.println("PERDISTE MOSTRI");
                i = 4;
            } else if (ad < n) {
                System.out.println("EL NUMERO ES MENOR");
            } else if (ad > n) {
                System.out.println("EL NUMERO ES MAYOR");
            }
        }
    }

}
