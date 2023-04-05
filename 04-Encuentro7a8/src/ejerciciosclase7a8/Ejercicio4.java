/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosclase7a8;

import java.util.Scanner;

/**
 * Crea una aplicación que nos pida un número por teclado y con una función se
 * lo pasamos por parámetro para que nos indique si es o no un número primo,
 * debe devolver true si es primo, sino false. Un número primo es aquel que solo
 * puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es
 * divisible entre 5, sin embargo, 17 si es primo.
 *
 * @author Pablo
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese número: \n");
        int num = input.nextInt();

        System.out.println(primo(num));

    }

    public static boolean primo(int num) {
        int j = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                j++;
            }
        }
        if (j != 2) {
            return false;
        } else {
            return true;
        }

    }

}
