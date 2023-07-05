/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3_Extra;

import java.util.Scanner;


public class EJ_13_ESCALERA {

    /**
     * @param args the command line arguments
     * Crear un programa que dibuje una escalera de números, donde cada línea de números comience en uno y termine en el número 
     * de la línea. Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
        1 
        12
        123
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner vlad = new Scanner(System.in);
        System.out.println("INGRESE EL TAMAÑO DE LA ESCALERA");
        int altura = vlad.nextInt();
        for (int i=1;i<=altura;i++){
            for(int x=1;x<=i;x++){
                System.out.print(x);
            }
            System.out.println(" ");
        }
    }
    
}
