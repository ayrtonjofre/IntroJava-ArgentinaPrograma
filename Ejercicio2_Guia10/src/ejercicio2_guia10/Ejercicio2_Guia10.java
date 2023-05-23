/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package ejercicio2_guia10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio2_Guia10 {

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

        System.out.println("Por favor ingrese un perro a buscar");
        Iterator<String> iterador = lista.iterator();
        String resp = read.next();
        while (iterador.hasNext()) {
            if (iterador.next().equals(resp)) {
                iterador.remove();
            }
        }
        
        for (String aux2 : lista) {
            System.out.println(aux2);
        }
        
    }
}
