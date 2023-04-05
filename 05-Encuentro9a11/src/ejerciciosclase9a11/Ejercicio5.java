/*
Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice que una matriz 
A es antisimétrica cuando ésta es igual a 
su propia traspuesta, pero cambiada 
de signo. Es decir, A es antisimétrica si A = -AT. 
La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

INCOMPLETO.


 */
package ejerciciosclase9a11;

public class Ejercicio5 {
    public static void main(String[] args) {
        int matriz[][] = new int [3][3];
        int matriz2[][] = new int [3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int)(Math.random() * 10 - 7);
            }
        }
        
        System.out.println("Matriz normal: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        
        System.out.println("Matriz transpuesta");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz2[j][i] = matriz[i][j] * (-1);
                System.out.print("[" + matriz[j][i] + "]");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != matriz2[j][i]) {
                    System.out.println("La matriz no es antisimetrica");
                }
                else {
                    System.out.println("La matriz es Antisimetrica");
                }    
            }
        }
        
        
    }
}
