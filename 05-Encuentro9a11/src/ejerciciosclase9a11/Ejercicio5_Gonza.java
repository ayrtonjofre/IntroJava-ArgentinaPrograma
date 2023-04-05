/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosclase9a11;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Ejercicio5_Gonza {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de su matriz");
        int size = input.nextInt();
        int[][] matriz = new int[size][size];

        System.out.println("Ingrese los elementos de su matriz");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matriz[i][j] = input.nextInt();
            }
        }
        input.close();
        checksimetry(matriz);
    }

    public static void checksimetry(int[][] matriz) {
        int size = matriz.length;
        int[][] matriztranspuesta = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matriztranspuesta[j][i] = matriz[i][j];
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matriztranspuesta[i][j] *= -1;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matriz[i][j] != matriztranspuesta[i][j]) {
                    System.out.println("La matriz no es antisimetrica");
                    
                }
            }
        }
        System.out.println("La matriz es antisimetrica");

    }
}

