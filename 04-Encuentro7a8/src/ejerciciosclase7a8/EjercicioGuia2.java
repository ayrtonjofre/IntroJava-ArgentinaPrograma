/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando que el 
primer número múltiplo del segundo e imprima si el primer número es múltiplo del segundo, sino informe que no lo son.

 */
package ejerciciosclase7a8;

import java.util.Scanner;

public class EjercicioGuia2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Por favor ingrese un valor: ");
        int num1 = read.nextInt();
        System.out.println("Por favor ingrese un segundo valor: ");
        int num2 = read.nextInt();
        
        EsMultiplo(num1, num2);
    }

    public static void EsMultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println("Es Multiplo");
        }
        else {
            System.out.println("No es multiplo");
        }
    }
}
