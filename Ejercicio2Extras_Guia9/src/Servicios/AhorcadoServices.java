/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos, un vector con la palabra 
a buscar, la cantidad de letras encontradas y la cantidad jugadas máximas que puede realizar el usuario. 
Definir los siguientes métodos en AhorcadoService:
 */
package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

public class AhorcadoServices {

    /*
    Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
    Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
    Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra en un índice del vector. 
    Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.
     */
    Scanner read = new Scanner(System.in).useDelimiter("\n");

//    Metodo crearJuego(): le pide la palabra al usuario y cantidad de
//            jugadas máxima. Con la palabra del usuario, pone la longitud
//            de la palabra, como la longitud del vector. Después ingresa la 
//            palabra en el vector, letra por letra, quedando cada letra de la
//            palabra en un índice del vector. Y también, guarda la cantidad
//            de jugadas máximas y el valor que ingresó el usuario.
//    
    Ahorcado a = new Ahorcado();

    public void crearJuego() {

        System.out.println("Ingrese la palabra a descubrir");
        String pal = read.next();

        System.out.println("Cuantos intentos fallidos quiere permitir");
        a.setIntentos(read.nextInt());

        String[] b = new String[pal.length()];
        for (int i = 0; i < pal.length(); i++) {

            b[i] = pal.substring(i, i + 1);

        }
        a.setVector(b);

    }

    //Método longitud(): muestra la longitud de la palabra que se debe encontrar.
    //Nota: buscar como se usa el vector.length.
    public void longitud() {

        System.out.println("Cantidad de palabras: " + a.getVector().length);
    }

    //Método buscar(letra):  este método recibe una letra dada por el usuario y busca
    //si la letra ingresada es parte de la palabra o no. También informará si la letra estaba
    //o no.
    public boolean buscar(String letra) {

       for (int i = 0; i < a.getVector().length; i++) {
            if (letra.equals(a.getVector()[i])) {
                return true;
            }
        }
        return false;
        
    }

    //Método encontradas(letra):  que reciba una letra ingresada por el usuario y 
    //muestre cuantas letras han sido encontradas y cuántas le faltan. Este método 
    //además deberá devolver true si la letra estaba y false si la letra no estaba, ya 
    //que, cada vez que se busque una letra que no esté, se le restará uno a sus 
    //oportunidades.
    public void encontradas(String letra) {

        int enc = 0;

        for (int i = 0; i < a.getVector().length; i++) {

            if (letra.equalsIgnoreCase(a.getVector()[i])) {
                enc++;

            }

        }
        a.setEncontradas(enc);
        System.out.println("Número de letras (encontradas, faltantes): (" + a.getEncontradas() + "," + (a.getVector().length - a.getEncontradas()) + ")");

    }

    //Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
    public void intentos() {

        System.out.println("Le quedan " + a.getIntentos() + "intentos");

    }

    //Método juego(): el método juego se encargará de llamar todos los métodos previamente 
    //mencionados e informará cuando el usuario descubra toda la palabra o se quede sin intentos. 
    //Este método se llamará en el main.
    public void juego() {

        crearJuego();
        longitud();

        int cc = a.getIntentos();
        do {
            System.out.println("Que letra desea buscar");
            String letra = read.next().toLowerCase();
            if(buscar(letra)){
                System.out.println("I found the word");
            }else{
                System.out.println("I wasn`t able to find it");
            }
            buscar(letra);
            encontradas(letra);

            cc--;

        } while (cc > 0);

    }

}
