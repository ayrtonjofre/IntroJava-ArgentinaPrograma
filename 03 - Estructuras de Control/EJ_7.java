package Guia_3;
import java.util.Scanner;

public class EJ_7_RS232 {
    /**
     * @param args the command line arguments
     * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por
     * el usuario. Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo,
     * el primer carácter tiene que ser X y el último tiene que ser una O.
       Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&”
     * marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, 
     * que no respete el formato se considera incorrecta.
       Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas.
     * Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes
     * funciones de Java Substring(), Length(), equals().
     */
    public static void main(String[] args) {
        Scanner vlad = new Scanner(System.in);
        int ver=0;
        int fal=0;
        System.out.println("ESTE ES UN PROGRAMA RS232");
        while (true){
            String mensaje = vlad.nextLine();
            mensaje = mensaje.toLowerCase();
            int largo = mensaje.length();
            if (mensaje.equals("&&&&&")) {
                System.out.println("Secuencia FDE encontrada");
                if (fal>0 && fal<2){
                    System.out.println("Se ha recibido " + fal + " secuencia INCORRECTA ");
                }else if (fal<1){
                    System.out.println("No se han recibido secuencias INCORRECTAS ");
                }else{
                   System.out.println("Se han recibido " + fal + " secuencias INCORRECTAS "); 
                }
                if (ver>0 && ver<2) {
                    System.out.println("Se ha recibido " + ver + " secuencia CORRECTA ");
                }else if (fal<1){
                    System.out.println("No se han recibido secuencias CORRECTAS ");
                }else{
                   System.out.println("Se han recibido " + ver + " secuencias CORRECTAS "); 
                }
                break;
            }else if (mensaje.length()<=5 && mensaje.startsWith("x")&& mensaje.endsWith("o")) {      
                ver=ver+1; 
            }else{
                fal=fal+1;
            }     
        }
    }
}