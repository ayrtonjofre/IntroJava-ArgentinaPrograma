package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

public class CadenaService {

    /* Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada. */
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    int cont = 0;
    Cadena c1 = new Cadena();

    public void mostrarVocales() {
        System.out.println("Por favor ingrese una frase");
        c1.setFrase(read.next().toUpperCase());
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (c1.getFrase().substring(i, i + 1).equalsIgnoreCase("A")
                    || c1.getFrase().substring(i, i + 1).equals("E")
                    || c1.getFrase().substring(i, i + 1).equals("I")
                    || c1.getFrase().substring(i, i + 1).equals("O")
                    || c1.getFrase().substring(i, i + 1).equals("U")) {
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println(c1.getFrase() + " NO TIENE VOCALES");
        } else if (cont == 1) {
            System.out.println(c1.getFrase() + " TIENE UNA VOCAL");
        } else if (cont > 1) {
            System.out.println(c1.getFrase() + " TIENE " + cont + " VOCALES");
        }

    }

    /* Método invertirFrase(), deberá invertir la frase 
       ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac". */
    public void invertirFrase() {
        for (int i = c1.getLongitud(); i > 0; i--) {
            System.out.print(c1.getFrase().substring(i - 1, i));
        }
        System.out.println("");
    }

    /* Método vecesRepetido(String letra), recibirá un carácter ingresado 
        por el usuario y contabilizar cuántas veces se 
    repite el carácter en la frase, por ejemplo: Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces. */
    public void vecesRepetido(String letra) {
        cont = 0;

        for (int i = 0; i < c1.getLongitud(); i++) {
            if (c1.getFrase().substring(i, i + 1).equals(letra)) {
                cont++;
            }
        }

        if (cont == 0) {
            System.out.println(c1.getFrase() + " NO TIENE LA " + letra + " BUSCADA");
        } else if (cont == 1) {
            System.out.println(c1.getFrase() + " TIENE UNA " + letra);
        } else if (cont > 1) {
            System.out.println(c1.getFrase() + " TIENE " + cont + " " + " ' " + letra + " ' ");
        }

    }

    /* Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone 
la clase con otra nueva frase ingresada por el usuario. */
    public int compararLongitud(String frase) {
        Integer i1 = new Integer(frase.length());
        Integer i2 = new Integer(c1.getLongitud());
        return i1.compareTo(i2);
    }

    /* Método unirFrases(String frase), deberá unir la frase contenida en la clase 
Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante. */
    public void unirFrases(String frase) {
        System.out.println("LAS FRASES CONCATENADAS ES : " + c1.getFrase().concat(" " + frase.toUpperCase()));
    }

    /* Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren
    en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante. */
    public void reemplazar(String letra) {
        String remp = "";
        System.out.print("LA NUEVA FRASE ES: ");
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (c1.getFrase().substring(i, i + 1).equals("A")) {
                remp = c1.getFrase().replace("A",letra);
            }
        }
        System.out.println( remp ); 
    }

    /* Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve
    verdadero si la contiene y falso si no. */
    public void contiene(String word) {
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (c1.getFrase().contains(word)) {
                System.out.println("La frase contiene la letra " + word);
            } else {
                System.out.println("La frase no contiene la letra " + word);
            }
        }
    }
}
    