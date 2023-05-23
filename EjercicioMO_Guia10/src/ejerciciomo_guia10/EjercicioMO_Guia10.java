/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomo_guia10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class EjercicioMO_Guia10 {

    public static void main(String[] args) {
        /*
        ArrayList<Integer> listado = new ArrayList();
        for (int i = 0; i < 5; i++) { //En list se genera una copia del dato ingresado en cada indice.
            listado.add(i);
            System.out.println(listado.size());
        }
            listado.remove(2);
            System.out.println("Listado: " + listado);
        //System.out.println("Listado: " + listado.toString());
        System.out.println("---------------");

        HashSet<String> arbolista = new HashSet();
        for (int i = 0; i < 5; i++) {
            arbolista.add("Ayrton");
            System.out.println(arbolista.size()); //Si son iguales los datos pasados, no se agrega un nuevo dato al indice.
        }
        arbolista.remove("Ayrton"); //Remueve todos los datos ya que pase a los indices el mismo ("Ayrton")
        System.out.println(arbolista);

        System.out.println("---------------");

        HashMap<Long, String> personas = new HashMap();
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el identificador (DNI) luego el (Nombre)");
        for (int i = 0; i < 1; i++) {
            personas.put(read.nextLong(), read.next());
        }
        System.out.println("Defina un DNI a remover");
        personas.remove(read.nextLong());
        System.out.println(personas.toString()); */

        // MANOS A LA OBRA – DETECCIÓN DE ERRORES HashMap
        HashMap<Integer, String> personas = new HashMap();
        int n1 = 1;
        String n2 = "Severus";
        personas.put(n1, n2);
        // Detección de errores:

        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it = bebidas.iterator();
        while(it.hasNext()) {
            if (it.next().equals("café")) {
                it.remove();
            }

        }
    }
}