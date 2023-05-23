/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos, 
un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad jugadas máximas que puede realizar el usuario. 
Definir los siguientes métodos en AhorcadoService:
 */
package ejercicio2extras_guia9;


import Servicios.AhorcadoServices;
import java.util.Scanner;

public class Ejercicio2Extras_Guia9 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in).useDelimiter("\n");
        AhorcadoServices as = new AhorcadoServices();

        as.juego();

    }

}
