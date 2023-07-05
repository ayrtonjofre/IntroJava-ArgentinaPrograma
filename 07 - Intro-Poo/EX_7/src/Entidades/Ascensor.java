package Entidades;

import java.util.Scanner;

/**
 *
 * @author tomyv
 */
//Crea una clase "Ascensor" con las propiedades "pisoActual" y "maximoPisos".
public class Ascensor {

    private int pisoActual;
    private int maximoPisos;
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    //Crea un constructor para inicializar los valores de las propiedades.
    public void datear() {
        System.out.println("INGRESE EL PISO ACTUAL");
        pisoActual = sc.nextInt();
        System.out.println("INGRESE A DONDE QUIERE IR");
        maximoPisos = sc.nextInt();
        irA(maximoPisos,pisoActual);
    }
    
    //Crea un método "subir" que aumente en uno el valor de la propiedad "pisoActual" si aún no se ha alcanzado el "maximoPisos".
    public void subir() {
        System.out.println("SUBIENDOOOO");
        for (int i = pisoActual; i <= maximoPisos; i++) {
            pisoActual = i;
            System.out.println("(PISO " + pisoActual + ")");
        }
        check();
    }

    //Crea un método "bajar" que disminuya en uno el valor de la propiedad "pisoActual" si no se ha alcanzado el piso "0".
    public void bajar() {
        System.out.println("BAJANDOO");
        for (int i = pisoActual; i >= maximoPisos; i--) {
            pisoActual = i;
            System.out.println("(PISO " + pisoActual + ")");
        }
        check();
    }
    
    public void check(){
        System.out.println("¿QUERES SEGUIR EN EL ASCENSOR(S/N)?");
        String ans;
        do {
            ans = sc.next().toUpperCase();
        } while (!ans.equals("S") && !ans.equals("N"));
        if (ans.equals("S")) {
            where();
        } 
    }
    
    public void where(){
        System.out.println("¿A QUE PISO QUERES IR?");
        do{
            maximoPisos = sc.nextInt();
            if(maximoPisos==pisoActual){
                System.out.println("ES PISO DONDE ESTAMOS");
            }
        }while(maximoPisos==pisoActual);
        irA(maximoPisos,pisoActual);
    }
    
    //Crea un método "irA" que reciba como parámetro el número de piso al que se desea ir y que modifique la propiedad
    //"pisoActual" para que tenga ese valor.
    public void irA(int go,int be) {
        if (go>be) {
            subir();
        } else {
            bajar();
        }
    }

}
