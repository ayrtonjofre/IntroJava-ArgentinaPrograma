/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Services;

import java.util.HashMap;
import java.util.Scanner;

public class ProductoServicios {

    HashMap<String, Double> productos = new HashMap();
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void introducirElemento() {
        System.out.println("Ingrese el nombre del producto:");
        String nombre = read.next();
        System.out.println("Ingrese el precio del producto:");
        Double precio = read.nextDouble();

        productos.put(nombre, precio);
        System.out.println("Producto agregado con exito.");

    }

    public void modificarPrecio() {
        System.out.print("Ingrese el nombre del producto a modificar: ");
        String nombre = read.next();

        if (productos.containsKey(nombre)) {
            System.out.print("Ingrese el nuevo precio del producto: ");
            double precio = read.nextDouble();

            productos.put(nombre, precio);
            System.out.println("Precio del producto modificado con éxito.");
        } else {
            System.out.println("El producto no existe.");
        }
    }

    public void eliminarProducto() {
        System.out.print("Ingrese el nombre del producto a eliminar: ");    
        String nombre = read.next();

        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.out.println("Producto eliminado con éxito.");
        } else {
            System.out.println("El producto no existe.");
        }
    }

public void mostrarProductos() {
        System.out.println("=== PRODUCTOS ===");

        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            for (HashMap.Entry<String, Double> entry : productos.entrySet()) {
                System.out.println("Producto: " + entry.getKey() + " - Precio: $" + entry.getValue());
            }
        }
    }
}

