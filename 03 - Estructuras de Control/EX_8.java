package Guia3_Extra;
import java.util.Scanner;

public class EJ_8_5BREAK {
    /**
     * @param args the command line arguments
     * Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener la lectura y mostrar
     * la cantidad de números leídos, la cantidad de números pares y la cantidad de números impares.
     * Al igual que en el ejercicio anterior los números negativos no deben sumarse.
     * Nota: recordar el uso de la sentencia break.
     */
    public static void main(String[] args) {
        Scanner vlad = new Scanner(System.in);
        boolean check = true;
        int cn=0;
        int cp=0;
        int ci=0;
        int n=0;
        
        System.out.println("INGRESE NUMEROS");
        while(check=true){
            n = vlad.nextInt();
            if (n>=0){
                cn++;
                if (n%5==0){
                    if (n%2==0){
                        cp++;
                    }else{
                        ci++;
                    }
                    break;
                }else if (n%2==0){
                    cp++;
                }else{
                    ci++;
                }
            }
        }  
        System.out.println("HEMOS ENCONTRADO QUE " + n + " ES UN NUMEROS MULTIPLO DE 5");
        System.out.println("SE HAN LEIDOS " + cn + " NUMEROS " );
        System.out.println( cp + " SON PARES");
        System.out.println( ci + " SON IMPARES");
    }
    
}
