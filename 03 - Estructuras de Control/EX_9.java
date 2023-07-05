package Guia3_Extra;

import java.util.Scanner;


public class EJ_9_COC_RES {

    /**
     * @param args the command line arguments
     * Simular la división usando solamente restas. Dados dos números enteros mayores que uno,
     * realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
     * Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
     * este resultado es el residuo, y el número de restas realizadas es el cociente.
       Por ejemplo: 50 / 13:
       50 – 13 = 37     una resta realizada
       37 – 13 = 24     dos restas realizadas
       24 – 13 = 11     tres restas realizadas
       dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
       ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
     * 
     */
    public static void main(String[] args) {
        Scanner vlad = new Scanner(System.in);
        int cociente=1;
        int residuo;
        int aux;
        System.out.println("INGRESE LOS NUMEROS A DIVIDIR");
        int n1 = vlad.nextInt();
        int n2 = vlad.nextInt();
        residuo = n1 - n2;
        while (residuo > n2){
            if (cociente<1){
            residuo = n1 - n2;
            }
            residuo = residuo-n2;
            cociente=cociente+1;
        }
        System.out.println("EL RESIDUO ES " + residuo );
        System.out.println("EL COCIENTE ES " + cociente );
    }
}