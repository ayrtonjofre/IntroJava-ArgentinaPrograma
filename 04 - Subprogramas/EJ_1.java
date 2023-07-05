/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_4;

import java.util.Scanner;

public class EJ_1 {

    /**
     * @param args the command line arguments
     * Crea una aplicación que le pida dos números al usuario y este pueda elegir 
     * entre sumar, restar, multiplicar y dividir. La aplicación debe tener una
     * función para cada operación matemática y deben devolver sus resultados para
     * imprimirlos en el main
     */
    public static void main(String[] args) {
        Scanner vlad = new Scanner(System.in);
        System.out.println("INGRESE DOS NUMEROS");
        int n1 = vlad.nextInt();
        int n2 = vlad.nextInt();
        int c = 2;
    do {
        System.out.println("ELIJA UNA OPCION");
        System.out.println("1.SUMAR");
        System.out.println("2.RESTAR");
        System.out.println("3.MULTIPLICAR");
        System.out.println("4.DIVIDIR");
        int respuesta = vlad.nextInt();
        switch (respuesta) {
            case 1: 
                System.out.println("EL RESULTADO " + SUMAR(n1,n2));
                break;    
      
            case 2:
                System.out.println("EL RESULTADO " + RESTAR(n1,n2));
                break;
                
            case 3:
                System.out.println("EL RESULTADO " + MULTIPLICAR(n1,n2));
                break;
            case 4:
                System.out.println("EL RESULTADO " + DIVIDIR(n1,n2));
                break;
            default:
                c=2;
                break;
        }
    }while(c==0);
 }
    public static int SUMAR(int n1, int n2){
        int suma = n1 + n2;
        return suma;
    }
    public static int RESTAR(int n1, int n2){
        int resta = n1 - n2;
        return resta;
    }
    public static double DIVIDIR(int n1, int n2){
        double dividir;
        dividir = (double) n1 / n2;
        return dividir;
    }
    public static double MULTIPLICAR(int n1, int n2){
        double multiplicar = n1 * n2;
        return multiplicar;
    }
}
