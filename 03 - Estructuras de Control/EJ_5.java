package Guia_3;
import java.util.Scanner;

public class EJ_5_LIMITE {
    /**
     * @param args the command line arguments
     * Escriba un programa en el cual se ingrese un valor limite positivo,
     * y a continuacion solicite numeros al usuario hasta que la suma de los numeros introducidos supere el limite inicial.
     */
    public static void main(String[] args) {
        Scanner vlad = new Scanner(System.in);
        boolean check = true;
        int suma = 0;
        int numero;
        int limite = 0;
        while (check=true){
            System.out.println("INGRESE UN LIMITE POSITIVO");
            limite = vlad.nextInt();
            if (limite > 0){
                break;    
            }
        }
        System.out.println("ENTER NUMBERS");
        while (check=true){
            numero = vlad.nextInt();   
            suma += numero;
            if (suma > limite){
                break;
            }
        }
        System.out.print("LA SUMA DE LOS NUMEROS INTRODUCIDOS ES " + suma );
        System.out.println(" QUE ES MAYOR QUE " + limite);
    }
}