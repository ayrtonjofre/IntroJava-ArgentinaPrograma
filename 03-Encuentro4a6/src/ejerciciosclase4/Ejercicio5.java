//Escriba un programa en el cual se ingrese un valor límite positivo, 
//y a continuación solicite números al usuario hasta que la suma de los
//números introducidos supere el límite inicial.

package ejerciciosclase4;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("por favor ingrese limite de la suma");
       int limite = input.nextInt();
       int sum = 0;
       
      while( sum<=limite){
          System.out.println(" ingre un numero a sumar");
          int n= input.nextInt();
        sum += n;
        
      }System.out.println(" lleggo al limite " + sum);
    
    }
}