/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_4;

import java.util.Scanner;

public class EJ_4 {

    /**
     * @param args the command line arguments
     * Crea una aplicación que nos pida un número por teclado y con una función
     * se lo pasamos por parámetro para que nos indique si es o no un número primo,
     * debe devolver true si es primo, sino false.
       Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
       * Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5,
       * sin embargo, 17 si es primo.

     */
    public static void main(String[] args) {
        Scanner vlad = new Scanner(System.in);
        System.out.println("ENTER A NUMBER, PLEASE");
        int n = vlad.nextInt();
        System.out.println(Primo(n));
    }
    public static boolean Primo(int n){
        if (n==1){
            return false;
        }else{
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        return true; 
        }
    }
}
