/*
Crea una clase en Java donde declares una variable de tipo array de Strings que contenga los doce meses del año, en minúsculas. 
A continuación, declara una variable mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9].  OK
El programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto.  
Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package Entidades;

import java.util.Random;
import java.util.Scanner;

public class AdivinarMesSecreto {

    //private final String meses[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    //private final String mesSectreto = meses[9]; //Octubre
    Random r = new Random();
    private String meses[] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "outubro", "novembro", "dezembro"};
    private String mesSecreto = meses[r.nextInt(11)];

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Random getR() {
        return r;
    }

    public void setR(Random r) {
        this.r = r;
    }

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public void adivinarMes() {

    }

    public AdivinarMesSecreto() {
        int cont = 0;
        System.out.println("Adivine el mes secreto:");

        do {
            String resp = read.next().toLowerCase();
            
            if (resp.equals(mesSecreto)) {
                System.out.println("Acertaste el mes capiño!, you are a genius");
                break;
            } else {
                System.out.println("Erraste, intente nuevamente manito!");
                cont++;
            }

        } while (cont < 3);
        
        System.out.println("Game Over, mostri");
        if (cont == 3) {
            System.out.println("Se terminaron las chances manito.");
            System.out.println(mesSecreto);
        }

    }

}
