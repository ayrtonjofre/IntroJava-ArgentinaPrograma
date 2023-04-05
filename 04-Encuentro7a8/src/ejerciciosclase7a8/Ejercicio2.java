/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado e indique si son mayores o 
menores de edad. Después de cada persona, el programa debe 
preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */

package ejerciciosclase7a8;

import java.util.Scanner;

public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner read = new Scanner(System.in);
        
       boolean nombre = true;
      // String name;
        
        do {
            
            System.out.println("Ingrese su nombre, si no desea cargar ningun nombre ingrese no ");
            String name = read.next();
           
            if(name.equals("no")){
            nombre = false;
            break;
            }else{
            nombre = true;}
            
            System.out.println("Ingrese su edad");
            int edad = read.nextInt();

            mostrar(name, edad);
            
        } while (nombre = true);

        
    }

    public static void mostrar(String nom, int edad) {

        if (edad < 18) {

            System.out.println("Su nombre es " + nom + " y su edad es " + edad + ", lo que significa que es menor de edad");

        } else {
            System.out.println("Su nombre es " + nom + " y su edad es " + edad + ", lo que significa que es mayor de edad");
        }

    }

    }
