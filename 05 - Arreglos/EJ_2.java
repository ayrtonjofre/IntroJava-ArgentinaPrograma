package GUIA_5;

import static GUIA_5.EJ_1.Imprimir;
import static GUIA_5.EJ_1.Rellenar;
import java.util.Random;
import java.util.Scanner;


public class EJ_2 {

    /**
     * @param args the command line arguments Realizar un algoritmo que llene un
     * vector de tamaño N con valores aleatorios y le pida al usuario un número
     * a buscar en el vector. El programa mostrará dónde se encuentra el numero
     * y si se encuentra repetido.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner vlad = new Scanner(System.in);
        Random r = new Random();
        int vector[] = new int[20];
        Rellenar(vector, r);
        System.out.println("INGRESE UN VALOR A BUSCAR");
        int check = 0;
        int buscar = vlad.nextInt();
        Buscar(vector, check, buscar);
    }

    public static void Rellenar(int[] vec, Random r) {
        for (int i = 0; i < vec.length; i++) {
            vec[i] = r.nextInt(10);
        }
    }

    public static void Buscar(int[] vec, int ch, int bus) {
        int c =0;
        for (int i = 0; i < vec.length - 1; i++) {
            if (bus == vec[i]) {
                System.out.println(bus + " ESTA EN LA POSICION " + i);
                ch = 2;
                c++;
            }
            
        }
        if (ch == 0) {
            System.out.println(bus + " NO ESTA EN NINGUN INDICE DEL VECTOR");
        }else if (c==1){
            System.out.println("POR ENDE SE REPITIO " + c + " VEZ");
        }else{
            System.out.println("POR ENDE SE REPITIO " + c + " VECES");
        }
    }

}
