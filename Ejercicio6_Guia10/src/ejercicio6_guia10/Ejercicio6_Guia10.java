/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package ejercicio6_guia10;

import Services.ProductoServicios;
import java.util.Scanner;

public class Ejercicio6_Guia10 {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        int opcion;
        ProductoServicios ps1 = new ProductoServicios();
        
        do {
            System.out.println("MENU");
            System.out.println("1. Introducir elemento");
            System.out.println("2. Modificar precio");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar producto");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = read.nextInt();

            switch (opcion) {
                case 1:
                    ps1.introducirElemento();
                    break;
                case 2:
                    ps1.modificarPrecio();
                    break;
                case 3:
                    ps1.eliminarProducto();
                    break;
                case 4:
                    ps1.mostrarProductos();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
                    break;
            }
        } while (opcion != 5);

        System.out.println("Fin del programa.");
    }

}

