package GUIA_5;
import java.util.Random;

public class EJ_4 {
    /**
     * @param args the command line arguments Realizar un programa que rellene
     * un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la
     * matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
     * cambiando sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random ran = new Random();
        int matriz[][] = new int[4][4];
        Rellenar(matriz,ran);
        Imprimir(matriz,4,4);
    }

    public static void Rellenar(int[][] mat, Random r) {
        for (int i = 0; i < mat.length ; i++) {
            for (int j = 0; j < mat.length ; j++) {
                mat[i][j] = r.nextInt(10);
            }
        }
    }

    public static void Imprimir(int[][] mat, int i, int j) {
        System.out.println("MATRIZ");
        for (j = 0; j < mat.length ; j++) {
            for (i = 0; i < mat.length ; i++) {
                System.out.print("[" + mat[j][i] + "]");
            }
            System.out.println("");
        }
        System.out.println("TRANSPUESTA");
        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat.length ; j++) {
                System.out.print("[" + mat[j][i] + "]");
            }
            System.out.println("");
        }
        
    }
}