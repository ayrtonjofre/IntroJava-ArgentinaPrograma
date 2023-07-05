package GUIA_5;
import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;
public class EJ_EXTRA6 {
    /**
     * @param args the command line arguments Construya un programa que lea 5
     * palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las
     * va ingresando, construya una “sopa de letras para niños” de tamaño de 20
     * x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en
     * una fila que será seleccionada de manera aleatoria. Una vez concluida la
     * ubicación de las palabras, rellene los espacios no utilizados con un
     * número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de
     * letras creada. Nota: Para resolver el ejercicio deberá investigar cómo se
     * utilizan las siguientes funciones de Java substring(), Length() y
     * Math.random().
     */
    public static void main(String[] args) {
        Scanner vlad = new Scanner(System.in);
        Random random = new Random();
        char matriz[][] = new char[20][20];
        int way = 0;
        int col = 0;
        int row = 0;
        String word;
        System.out.println("CONSTRUIREMOS UNA SOPA DE LETRAS");
        System.out.println("SE LEERAN 5 PALABRAS, ENTRE 3 Y 5 CARACTERES");
        //COLOCAMOS LAS PALABRAS DENTRO DE UN VECTOR:
        for (int i = 0; i < 5; i++) {
            word = vlad.next();
            //VALIDAMOS SI LAS PALABRAS SON MENORES A 3 CARACTERES O MAYORES A 5 DE ESTOS:
            while (word.length() < 3 || word.length() > 5) {
                System.out.println("ERROR");
                word = vlad.next();
            }
            word = word.toUpperCase();
            way = random.nextInt(3);
            switch (way) {
                case 0:
                    row = random.nextInt(20);
                    col = random.nextInt(16);
                    for (int j = 0; j < word.length(); j++) {
                        matriz[row][col + j] = word.charAt(j);
                    }   break;
                case 1:
                    row = random.nextInt(16);
                    col = random.nextInt(20);
                    for (int j = 0; j < word.length(); j++) {
                        matriz[row + j][col] = word.charAt(j);
                    }   break;
                default:
                    row = random.nextInt(16);
                    col = random.nextInt(16);
                    for (int j = 0; j < word.length(); j++) {
                        matriz[row + j][col + j] = word.charAt(j);
                    }   break;
            }

        }
        Rellenar(matriz);
        Imprimir(matriz);
    }

    public static void Rellenar(char[][] matriz) {
        for (int j = 0; j <= matriz.length - 1; j++) {
            for (int k = 0; k <= matriz.length - 1; k++) {
                if (matriz[j][k] == '\u0000') {
                    matriz[j][k] = (char) ((int) (Math.random() * 10) + '0');
                }

            }
        }
    }

    public static void Imprimir(char[][] matriz) {
        System.out.println("SOPITA");
        for (int j = 0; j <= matriz.length - 1; j++) {
            for (int k = 0; k <= matriz.length - 1; k++) {
                
                System.out.print("[" + matriz[j][k] + "]");
            }
            System.out.println("");
        }
    }
}
