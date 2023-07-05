package GUIA_5;

import java.util.Scanner;

public class EJ_EXTRA2 {

    /**
     * @param args the command line arguments Escriba un programa que averigüe
     * si dos vectores de N enteros son iguales (la comparación deberá detenerse
     * en cuanto se detecte alguna diferencia entre los elementos).
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vector[] = new int[5];
        int vector2[] = new int[5];
        Rellenar(vector, vector2);
        Imprimir(vector, vector2);
        Checkear(vector, vector2);
    }

    public static void Rellenar(int[] vec, int[] vec2) {
        Scanner vlad = new Scanner(System.in);  
        System.out.println("V1");
        for (int i = 0; i < vec.length - 1; i++) {    
            vec[i] = vlad.nextInt();
        }
        System.out.println("V2");
        for (int i = 0; i < vec2.length - 1; i++) {   
            vec2[i] = vlad.nextInt();
        }
    }

    public static void Imprimir(int[] vec, int[] vec2) {
        for (int i = 0; i < vec.length - 1; i++) {
            System.out.print("[" + vec[i] + "]");
        }
        System.out.println("");
        for (int i = 0; i < vec.length - 1; i++) {
            System.out.print("[" + vec2[i] + "]");
        }
        System.out.println("");
    }

    public static void Checkear(int[] vec, int[] vec2) {
        for (int i = 0; i < vec.length - 1; i++) {
            if (vec[i] != vec2[i]) {
                System.out.println("LOS VECTORES NO SON IGUALES");
                break;
            } else if (i == vec.length - 2) {
                System.out.println("LOS VECTORES SON IGUALES");
            }
        }

    }
}
