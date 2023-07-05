package Guia_3;
import java.util.Scanner;

public class EJ_6_MENU {
    /**
     * @param args the command line arguments
     * Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:
     * El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú.
     * El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5,
     * en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
     * ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, 
     * caso contrario se vuelve a mostrar el menú.
     */
    
    public static void main(String[] args) {
        Scanner vlad = new Scanner(System.in);
        int resultado = 0;
        int n1 = 0;
        int n2 = 0;
        boolean check = true;
        
        System.out.println("Ingrese el primer numero: ");
        while(check = true){
            n1 = vlad.nextInt();
            if(n1 > 0){
                break;   
            }
        }  
        
        System.out.println("Ingrese el segundo numero: ");
        while(check = true){
            n2 = vlad.nextInt();
            if(n2 > 0){
                break;   
            }
        }
        
        int cont = 0;
        while(cont < 2){
            System.out.println("MENU");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Division");
            System.out.println("5.Salir");
            int option = vlad.nextInt();
            switch (option) {
                case 1:
                    resultado = n1 + n2; 
                    System.out.println( n1 + " + " + n2 + " = " + resultado);
                    break;
                case 2:
                    resultado = n1 - n2;
                    System.out.println ( n1 + " - " + n2 + " = " + resultado);
                    break;
                case 3:
                    resultado = n1 * n2;
                    System.out.println( n1 + " * " + n2 + " = " + resultado);
                    break;
                case 4:
                    double divnum;
                    divnum = (float)  n1 / n2;
                    System.out.println ( n1 + " / " + n2 + " = " + divnum);
                    break;
                case 5:
                    System.out.println("¿Estas seguro de salir (S/N)?");
                    String answer = vlad.next();
                    answer = answer.toLowerCase();
                    if (answer.equals("s")){
                        cont = 9;
                    }     
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }        
}