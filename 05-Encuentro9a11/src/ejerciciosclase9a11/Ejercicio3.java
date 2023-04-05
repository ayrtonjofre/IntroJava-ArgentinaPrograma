/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejerciciosclase9a11;

public class Ejercicio3 {

    public static void main(String[] args) {
        int vector[] = new int[10];

        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int c5 = 0;

        for (int i = 0; i < 10; i++) {
            vector[i] = (int) (Math.random() * 10000 + 1);
            int length = String.valueOf(vector[i]).length();
            //System.out.println("El tamaño del valor encontrado en el subindice es: " + length);

            // sw + tab para armar la estructura del switch
            switch (length) {
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
                case 3:
                    c3++;
                    break;
                case 4:
                    c4++;
                    break;
                case 5:
                    c5++;
                    break;
            }
        }
        
        System.out.println("Hay " + c1 + " de 1 digitos.");
        System.out.println("Hay " + c2 + " de 2 digitos.");
        System.out.println("Hay " + c3 + " de 3 digitos.");
        System.out.println("Hay " + c4 + " de 4 digitos.");
        System.out.println("Hay " + c5 + " de 5 digitos.");

    }
}
