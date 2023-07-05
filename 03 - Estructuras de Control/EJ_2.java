import java.util.Scanner;

public class EJ_2_EUREKA {

    public static void main(String[] args) {
        Scanner vlad = new Scanner(System.in);
        System.out.println("Ingrese la contraseña");
        String frase = vlad.nextLine();
        frase = frase.toLowerCase();
        if (frase.equals("eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");    
        }
    }
}
