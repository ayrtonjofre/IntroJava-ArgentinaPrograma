package GUIA_5;

public class EJ_EXTRA3 {
    /**
     * @param args the command line arguments
     * Crear una función rellene un vector con números aleatorios, pasándole un
     * arreglo por parámetro. Después haremos otra función o procedimiento que
     * imprima el vector.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vector[] = new int [10];
        Rellenar(vector);
        Imprimir(vector);
    }
    public static void Rellenar (int[] vec){
        for (int i = 0; i < vec.length-1 ; i++) {
            vec[i]=(int)(Math.random()*10-4);
        }
    }
    public static void Imprimir (int[] vec){
        for (int i = 0; i < vec.length-1 ; i++) {
            System.out.print("[" + vec[i] + "]");
        }
        System.out.println("");
    }
}
