/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package Services;

import Entidades.Paises;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ServicePaises {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    HashSet<Paises> p1 = new HashSet();
    Paises p;
    public void creaPais(){
        String aux;
        do {
            System.out.println("Ingresse el nombre de un Pais: ");
            p1.add(new Paises(read.next()));
            System.out.println("Desea agregar un nuevo Pais? (S/N)");
            aux = read.next();
        } while (aux.equalsIgnoreCase("S"));
        
        System.out.println("Los paises cargados son: ");
        for (Paises paises : p1) {
            System.out.println(paises);
        }        
    }
    
    public void ordenarMayor() {
        ArrayList<Paises> lista = new ArrayList(p1);
        lista.sort(Paises.compararMayor);
        System.out.println("Los paises son: ");
        for (Paises paises : lista) {
            System.out.println(paises);
        }
    }
    
    public void eliminarPais(){
        Iterator<Paises> it = p1.iterator();
        System.out.println("Por favor ingrese un pais a eliminar");
        String aux = read.next();
        boolean validar = false;
        while(it.hasNext()) {
            if (it.next().getNombre().equalsIgnoreCase(aux)) {
                it.remove();
                validar = true;
            }
        }
        
        if (validar = true) {
            System.out.println("El país " + aux + " fue eliminado"); 
        } else {
            System.out.println("El pais no fue encontrado");
        }
        
        for (Paises paises : p1) {
            System.out.println(paises);
        }
    }
    
    
}
