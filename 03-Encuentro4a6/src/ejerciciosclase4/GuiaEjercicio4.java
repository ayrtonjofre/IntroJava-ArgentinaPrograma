/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del bucle y mostrar el 
mensaje "Se capturó el numero cero".  El programa deberá calcular y mostrar el resultado de la 
suma de los números leídos, pero si el número es negativo no debe sumarse. 
Nota: recordar el uso de la sentencia break.
 */
package ejerciciosclase4;

import java.util.Scanner;

public class GuiaEjercicio4 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num;
        int sum = 0;

        do {
            System.out.println("Ingrese un numero: ");
            num = read.nextByte();
            
            if (num > 0) {
                sum = sum + num;
            }
            
        } while (num != 0);
        
        System.out.println("Se detectó el numeor 0");
        System.out.println("La suma de los numeros es: " + sum);
    }
}
