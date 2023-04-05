/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee 
cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 
caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el 
final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. 
Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java 
Substring(), Length(), equals().


boolean bandera = pal.toUpperCase().substring(0,1).equals("A");

 */
package ejerciciosclase4;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
       
        int num;
        int correctas = 0;
        int incorrectas = 0;
            System.out.println("Por favor ingresar una palabra de 5 caracteres");
        do {
            String text = read.nextLine();
            num = text.length();
            text = text.toUpperCase();
            if (text.startsWith("X") && text.endsWith("O") && num <= 5) {
                correctas++;
                System.out.println("Datos correctos");
            } else if (text.equals("&&&&&")) {
                break;
            } else {
                incorrectas++;
                System.out.println("Datos incorrectos");
            }
        } while (true);
        System.out.println("Saludos Titi!");
        
        System.out.println("La cantidad de entradas correctas son: " + correctas);
        System.out.println("La cantidad de entradas icorrectas son: " + incorrectas);
    }
}
