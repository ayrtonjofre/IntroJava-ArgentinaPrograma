package Guia3_Extra;

import java.util.Scanner;

public class EJ_6_ALTURA {
    /**
     * @param args the command line arguments
     * Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts.
     * y el promedio de estaturas en general.
     */
    public static void main(String[] args) {
        Scanner vlad = new Scanner(System.in);
        double promedio1=0;
        double promedio2=0;
        int contador = 1;
        int c1=0;
        int c2=0;
        System.out.println("Ingrese la altura de 10 personas ");    
        while(contador<=10) {
        double altura = vlad.nextDouble();
        if (altura<1.60){
            promedio1 = promedio1 + altura;
            c1=c1+1;
        }else{
            promedio2 = promedio2 + altura;
            c2=c2+1;
        }
        contador=contador+1;
        }
        System.out.println("EL PROMEDIO DE ALTURA DE LOS MENORES A 1.60 " + promedio1/c1 + " mts");
        System.out.println("EL PROMEDIO DE ALTURA DEL RESTO ES " + promedio2/c2 + " mts");
        
    }
}
