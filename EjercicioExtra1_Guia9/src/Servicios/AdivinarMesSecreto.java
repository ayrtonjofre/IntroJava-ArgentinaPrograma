/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Scanner;
    
public class AdivinarMesSecreto {
    String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = meses[9]; // octubre

        Scanner read = new Scanner(System.in);
        String mesAdivinado;

        do {
            System.out.print("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: ");
            mesAdivinado = read.nextLine();

            if (mesAdivinado.equals(mesSecreto)) {
                System.out.println("¡Ha acertado!");
                break;
            } else {
                System.out.print("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
            }
        } while (true);

}
