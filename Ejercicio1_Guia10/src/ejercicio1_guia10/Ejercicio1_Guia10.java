/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package ejercicio1_guia10;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1_Guia10 {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList();
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        do {
            System.out.println("Por favor ingrese un dog!");
            lista.add(read.next());
            System.out.println("Desea ingresar otro perro S/N ?");
        } while (read.next().equalsIgnoreCase("S"));

        for (String aux : lista) {
            System.out.println(aux);
        }

    }

}
