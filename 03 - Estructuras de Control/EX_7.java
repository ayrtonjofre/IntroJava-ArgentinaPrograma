package Guia3_Extra;
import java.util.Scanner;

public class EJ_7_DO_WHILE {
    /**
     * @param args the command line arguments
     * Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0).
     * El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario.
     * Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.
     */
    public static void main(String[] args) {
        Scanner vlad = new Scanner(System.in);
        int c=0;
        int max=0;
        int min=0;
        int num;
        int res=0;
        System.out.println("INGRESE LA CANTIDAD DE NUMEROS");
        int n = vlad.nextInt();
    int check = 4;    
    while (check < 5 ){
       System.out.println("ELIGE ENTRE WHILE OR DO-WHILE (W/D) ");
        String respuesta = vlad.next();
        respuesta = respuesta.toUpperCase();
        switch (respuesta) {
            case "W":
                System.out.println("AHORA LOS NUMEROS");
                while (c<n) {
                    num = vlad.nextInt();
                    if (c<1) {
                        max=num;
                        min=num; 
                    }else{
                        }if (num>max) {
                        max=num;
                        }else if (num<min) {
                        min=num;
                        }
                    res=res+num;
                    c++;
                }
                check = 10;
                break;
            case "D":
                System.out.println("AHORA LOS NUMEROS");
                do{
                    num = vlad.nextInt();
                    if (c<1) {
                        max=num;
                        min=num; 
                    }else{
                        }if (num>max){
                            max=num;
                        }else if (num<min){
                            min=num;
                        }
                    c++;
                    res=res+num;
                }while(c<n);
                check = 10;
                break;
            default :
                continue;
        }
    double promedio=res/n;
        System.out.println("Entres los " + n + " valores el MAXIMO es " + max );
        System.out.println("Entres los " + n + " valores el MINIMO es " + min);
        System.out.println("Entres los " + n + " valores el el PROMEDIO es " + promedio);  
    }
        
            
    }         
}