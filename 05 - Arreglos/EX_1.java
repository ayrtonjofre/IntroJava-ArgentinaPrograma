package GUIA_5;
import java.util.Scanner;

public class EJ_EXTRA1 {
    /**
     * @param args the command line arguments
     * Realizar un algoritmo que calcule la suma de todos los elementos de un
     * vector de tamaño N, con los valores ingresados por el usuario.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matrix [][] = new int [4][4]; 
        int suma=0;
        Rellenar(matrix);
        Imprimir(matrix);
        System.out.println("LA SUMA ES " + Suma(matrix,suma) );
    }
    
    public static void Rellenar(int [][]matrix){
        Scanner vlad = new Scanner(System.in);
        System.out.println("ENTER NUMBER IN A MATRIX OF IS 4*4 : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = vlad.nextInt();
            }
        }
        
    }
    
    public static int Suma(int [][]matrix,int s){ 
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                s = s + matrix[i][j];
            }
        }
        return s;
    }
    
    public static void Imprimir(int[][] mat) {
        System.out.println("MATRIX");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print("[" + mat[j][i] + "]");
            }
            System.out.println("");
        }
    }
    
}
