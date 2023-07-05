package Guia3_Extra;

import java.util.Scanner;

public class EJ_2_INTERCAMBIAR {

    /**
     * @param args the command line arguments
     * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una.
     * A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A,
     * A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales y los valores finales de cada variable.
     * Utilizar sólo una variable auxiliar.
     */
    public static void main(String[] args) {
        Scanner vlad = new Scanner(System.in);
        int a=1;
        int b=2;
        int c=3;
        int d=4;
        int aux = b;
        System.out.println("A" + a + " B" + b + " C" + c + " D" + d );
        b=c;
        c=a;
        a=d;
        d=aux;
        System.out.println("A" + a + " B" + b + " C" + c + " D" + d );
    }    
}
