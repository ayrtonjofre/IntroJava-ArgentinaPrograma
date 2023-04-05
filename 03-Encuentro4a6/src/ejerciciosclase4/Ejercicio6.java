/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente 
menú:El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al 
menú. El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, 
si el usuario selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar 
el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? Si el usuario 
selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
package ejerciciosclase4;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        System.out.println("Por favor ingrese 2 numeros para operar:");
        
        int num1 = read.nextInt();
        int num2 = read.nextInt();
        boolean x = true;
        String respuesta = "N";
        
        do {
         
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");
        System.out.println("5-Salir");
        
            System.out.println("Por favor ingrese una opcion de menu: ");
            int opcion = read.nextInt();
        
        switch(opcion) {
            case 1:
                double res = num1 + num2; 
                System.out.println("La suma de ambos numeros es: " + res);
            break;
            
            case 2:
                res = num1 - num2; 
                System.out.println("La resta de ambos numeros es: " + res);
            break;
            
            case 3:
                res = num1 * num2; 
                System.out.println("La multiplicación de ambos numeros es: " + res);
            break;
            
            case 4:
                //divnum = (float)  n1 / n
                res = num1 / num2; 
                System.out.println("La división de ambos numeros es: " + res);
            break;
            
            case 5:
                 System.out.println("Estas seguro que deseas salir? Y/N");
                 respuesta = read.next();
                 respuesta = respuesta.toUpperCase();
                 /*if(respuesta.equals("Y")){
                 x = false;
                 }*/
                 break;
                 
            default:
                System.out.println("Deja de flashear y poné una opcion bien");
        }
        
        } while(!"Y".equalsIgnoreCase(respuesta));
    }    
}
