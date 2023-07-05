package GUIA_5;

public class EJ_1 {
    /**
     * @param args the command line arguments 
     * Realizar un algoritmo que llene un
     * vector con los 100 primeros números enteros y los muestre por pantalla en
     * orden descendente.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vector[] = new int[100];
        Rellenar(vector);
        Imprimir(vector);
    }

    public static void Rellenar(int[] vec) {
        for (int i = 0; i < vec.length; i++) {
            vec[i] = i;
        }
    }
    
    public static void Imprimir(int[] vec) {
        for (int i = vec.length - 1; i >= 0; i--) {
            System.out.print("[" + vec[i] + "]");
        }
        System.out.println("");
    }
}