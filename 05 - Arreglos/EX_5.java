package GUIA_5;


public class EJ_EXTRA5 {

    /**
     * @param args the command line arguments Realizar un programa que llene una
     * matriz de tamaño NxM con valores aleatorios y muestre la suma de sus
     * elementos.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int[5][10];
        Rellenar(matriz, 5, 10);
        Imprimir(matriz, 5, 10);
    }

    public static void Rellenar(int[][] mat, int x, int z) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < z; j++) {
                mat[i][j] = (int) (Math.random() * 10 - 4);
            }
        }
    }

    public static void Imprimir(int[][] mat, int x, int z) {
        int suma = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < z; j++) {
                System.out.print("[" + mat[i][j] + "]");
                suma = suma + mat[i][j];
            }
            System.out.println("");
        }
        System.out.println("LA SUMA DE LOS VALORES EN LA MATRIZ " + suma);
    }
}
