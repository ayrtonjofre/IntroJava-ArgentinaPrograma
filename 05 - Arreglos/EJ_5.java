package GUIA_5;

public class EJ_5 {

    /**
     * @param args the command line arguments
     *
     * Realice un programa que compruebe si una matriz dada es antisimétrica. Se
     * dice que una matriz A es antisimétrica cuando ésta es igual a su propia
     * traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A =
     * -AT. La matriz traspuesta de una matriz A se denota por AT y se obtiene
     * cambiando sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matriz[][] = new int[3][3];
        int matriz2[][] = new int[3][3];
        Rellenar(matriz);
        Rellenar(matriz2);
        Imprimir(matriz);
        Imprimir(matriz2);
        Checkear(matriz, matriz2);
        
    }

    public static void Rellenar(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = (int) (Math.random() * 10 - 4);
            }
        }
    }

    public static void Checkear(int[][] mat, int[][] mat2) {
        int c = 0;
        for (int i = 0; i < mat.length - 1; i++) {
            for (int j = 0; j < mat.length - 1; j++) {
                if (mat[i][j] != mat2[i][j]) {
                    c++;
                }
            }
        }
        if (c == 0) {
            System.out.println("ES SIMETRICA");
        } else {
            System.out.println("ES ANTISIMETRICA");
        }
    }

    public static void Imprimir(int[][] mat) {
        for (int j = 0; j < mat.length; j++) {
            for (int i = 0; i < mat.length; i++) {
                System.out.print("[" + mat[j][i] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
