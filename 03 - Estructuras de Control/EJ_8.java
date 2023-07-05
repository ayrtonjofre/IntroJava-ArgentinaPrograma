package Guia_3;

import java.util.Scanner;

public class EJ_8_CUADRADO {
    /**
     * @param args the command line arguments
     * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
     * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
        * * * *
        *     *
        *     *
        * * * *
     */
    public static void main(String[] args) {
        Scanner vlad = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO");
        int n = vlad.nextInt();
        for (int i=0; i<n ; i++ ){
            for (int x=0; x<n ; x++ ){
                if ( i==0 || i==n-1 || x==0 || x==n-1 ) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
}