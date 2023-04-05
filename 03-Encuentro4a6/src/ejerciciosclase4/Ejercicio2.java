/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de 
Correcto, sino mostrará un mensaje 
de Incorrecto. Nota: investigar la función equals() en Java.
 */
package ejerciciosclase4;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Por favor ingrese una palabra o frase: ");
        String palabra = "eureka";
        String frase = read.nextLine();
        
        //Convierte el valor de la variable a minuscula.
        frase = frase.toLowerCase();
        
        // frase.equalsIgnoreCase("eureka"); Esto ignora la grafia (Mays o Minus)
                
        if (palabra.equals(frase)) {
            System.out.println("CORRECTO!");
        }
        else {
            System.out.println("INCORRECTO!");
        }
    }
}
