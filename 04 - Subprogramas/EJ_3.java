package Guia_4;
import java.util.Scanner;

public class EJ_3 {
    /**
     * @param args the command line arguments
     * Crea una aplicación que a través de una función nos convierta una cantidad
     * de euros introducida por teclado a otra moneda, estas pueden ser a dólares,
     * yenes o libras. La función tendrá como parámetros, la cantidad de euros y
     * la moneda a convertir que será una cadena, este no devolverá ningún valor 
     * y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
     */
    public static void main(String[] args) {
        Scanner vlad = new Scanner(System.in);
        int option;
        String moneda;
        int s=0;
        System.out.println("ENTER EUROS");
        double euros = vlad.nextDouble();
    do {
        System.out.println("DO YOU WANT?:");
        System.out.println("DOLARS");
        System.out.println("YEN");
        System.out.println("POUNDS");
        moneda = vlad.next();
        moneda = moneda.toUpperCase();
        switch (moneda){
            case "DOLARS":
                s=1;
            Convertir(euros,s);
            break;
            case "YEN":
                s=2;
                Convertir(euros,s);
                break;
            case "POUNDS" :
                s=3;
                Convertir(euros,s);
                break;
        }
        System.out.println("EXIT (Y/N)?");
        String ans = vlad.next();
        ans = ans.toLowerCase();
        if (ans.equals("y")){
            break;
        }
    }while (true);
 }
    //NANANANANANNA BATMAN NANANANANAN BATMAN NSASNHBUGUH
    public static void Convertir(double eur,int ch){
        switch (ch) {
            case 1:
                double dolar = (double) eur * 1.28611;
                System.out.println("siuu" + eur + " = USD$" + dolar );
                break;
            case 2:
                double yenes = (double) eur * 129.852;
                System.out.println("€" + eur + " = ¥" + yenes);
                break;
            case 3:
                double libras = (double) eur * 0.86;
                System.out.println("€" + eur + " = £" + libras );
            break;
        }
    }
}