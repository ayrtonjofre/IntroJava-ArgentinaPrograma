package Guia_4;
import java.util.Scanner;

public class EJ_C1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner vlad = new Scanner(System.in);
        System.out.println("INGRESE DOS NUMEROS");
        int numero1 = vlad.nextInt();
        int numero2 = vlad.nextInt();
        Checkear(numero1,numero2);
        
    }
    public static void Checkear(int n1 , int n2){
        if (n1 % n2 == 0){
            System.out.println(n1 + " ES MULTIPLO DE " + n2 );
        }else{
            System.out.println(n1 + " NO ES MULTIPLO DE " + n2 );
        }
    }
            
            
}
