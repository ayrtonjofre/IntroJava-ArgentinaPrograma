/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_4;

import java.util.Scanner;

public class EJ_2 {

    /**
     * @param args the command line arguments
     * Diseñe una función que pida el nombre y la edad de N personas e imprima 
     * los datos de las personas ingresadas por teclado e indique si son mayores
     * o menores de edad. Después de cada persona, el programa debe preguntarle 
     * al usuario si quiere seguir mostrando personas y frenar cuando el usuario
     * ingrese la palabra “No”.
     */
    public static void main(String[] args) {
        Scanner vlad = new Scanner(System.in);
        String name;
        String answ;
        int age;
        do {
            System.out.println("NAME");
            name = vlad.next();
            name = name.toUpperCase();
            System.out.println("AGE");
            age = vlad.nextInt();
            Mayor(name,age);
            System.out.println("DO YOU WANT TO CONTINUE (Y/N)?");
            answ = vlad.next();
            answ = answ.toUpperCase();
        } while (!answ.equals("N"));
    }
   
    public static void Mayor(String name,int age){
        if (age>=18){
                System.out.println( name + " ES MAYOR DE EDAD");
            }else{
                System.out.println( name + " ES MENOR DE EDAD");
        }
    }   
}