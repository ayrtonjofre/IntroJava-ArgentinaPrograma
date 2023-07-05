package Guia3_Extra;

import java.util.Scanner;

public class EJ_14_FAMILIA {

    /**
     * @param args the command line arguments
     * Se dispone de un conjunto de N familias, cada una de las cuales tiene una
     * M cantidad de hijos. Escriba un programa que pida la cantidad de familias
     * y para cada familia la cantidad de hijos para averiguar la media de edad 
     * de los hijos de todas las familias. 
     */
    public static void main(String[] args) {
        Scanner vlad = new Scanner(System.in);
        int suma=0;
        int cont=0;
        int cont2=0;
        System.out.println("INGRESE LA CANTIDAD DE FAMILIAS");
        int familias = vlad.nextInt();
        for (int i=1;i<=familias;i++) {
                System.out.println("INGRESE LA CANTIDAD DE HIJOS DE LA FAMILIA " + i );
                int hijos = vlad.nextInt();
                for (int x=1;x<=hijos;x++){ 
                    if (cont2 == 0){
                       System.out.println("INGRESE SUS EDADES"); 
                    }
                    int edades = vlad.nextInt();
                    suma = suma + edades;
                    cont = cont + 1;
                    cont2=cont2+1;
                } 
                cont2=0;
        }
        int media = suma / cont;
        System.out.println("LA EDAD MEDIA DE TODOS LOS HIJOS ES " + media );
    }   
}