package Guia3_Extra;
import java.util.Scanner;

public class EJ_10_ADIVINAR {

    /**
     * @param args the command line arguments
     * Realice un programa para que el usuario adivine el resultado de una
     * multiplicación entre dos números generados aleatoriamente entre 0 y 10.
     * El programa debe indicar al usuario si su respuesta es o no correcta.
     * En caso que la respuesta sea incorrecta se debe permitir
     * al usuario ingresar su respuesta nuevamente.
     * Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.
     * 
     */
    public static void main(String[] args) {
        Scanner vlad = new Scanner(System.in);
        int n1 = (int)(Math.random() * 10);
        int n2 = (int)(Math.random() * 10);
        int correct = n1 * n2;
        int ex=1;
        System.out.println("ADIVINA EL RESULTADO DE LA MULTIPLICACION");
        System.out.println( correct );
        while (ex<4){
            int resp = vlad.nextInt();
            if (resp==correct) {
                System.out.println("CORRECTO");
                ex=7;
            }else{
                System.out.println("INCORRECTO. TEN OTRO INTENTO");
            }
        }   
    }
}