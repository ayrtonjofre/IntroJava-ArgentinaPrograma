/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y define su 
tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 */
package ejerciciosclase9a11;

import java.util.Scanner;

public class EjercicioGuia1 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String equipo[] = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese los nombres de tu equipo: ");
            equipo[i] = read.next();
        }
        
        
        for (int i = 0; i < 5; i++){
            System.out.println(equipo[i]);
        }
        
        
        
        
        
    }
}
