package GUIA_5;
import java.util.Scanner;
/**
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
 * donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
 * Crear un programa que permita introducir un cuadrado por teclado y determine
 * si este cuadrado es mágico o no. El programa deberá comprobar que los números
 * introducidos son correctos, es decir, están entre el 1 y el 9.
 */
public class EJ_6 {
    public static void main(String[] args) {     
        int matriz[][] = new int[3][3];
        Rellenar(matriz);
        Imprimir(matriz);
        Checkear(matriz);
    }
    
    public static void Rellenar(int[][] mat) {
        Scanner vlad = new Scanner(System.in);
        System.out.println("INGRESE VALORES ENTRE 1 Y 9");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    mat[i][j] = vlad.nextInt();
                    if (mat[i][j] < 1 || mat[i][j] > 9) {
                        System.out.println("Error: los números deben estar entre 1 y 9.");
                    }
                } while (mat[i][j] < 1 || mat[i][j] > 9);
            }
        }
    }

    public static void Imprimir(int[][] mat) {
        System.out.println("MATRIZ");
        for (int j = 0; j <= mat.length - 1; j++) {
            for (int i = 0; i <= mat.length - 1; i++) {
                System.out.print("[" + mat[j][i] + "]");
            }
            System.out.println("");
        }
    }

    public static void Checkear(int[][] mat) {
        int s = 0;
        int check = 0;
        //Hacemos una suma de referencia para igualarla a las demas
        //SumaReferencia
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                check = check + mat[i][j];
            }
        }
        //2da fila
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                s = s + mat[i][j];
            }
        }
        if (s == check) {
            s = 0;
            //3er fila
            for (int i = 2; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    s = s + mat[i][j];
                }
            }
            if (s == check) {
                s = 0;
                //1er columna
                for (int j = 0; j < 1; j++) {
                    for (int i = 0; i < 3; i++) {
                        s = s + mat[i][j];
                    }
                }
            }
            if (s == check) {
                s = 0;
                //2da columna
                for (int j = 1; j < 2; j++) {
                    for (int i = 0; i < 3; i++) {
                        s = s + mat[i][j];
                    }
                }
            }
            if (s == check) {
                s = 0;
                //3ra columna
                for (int j = 2; j < 3; j++) {
                    for (int i = 0; i < 3; i++) {
                        s = s + mat[i][j];
                    }
                }
            }
            if (s == check) {
                s = 0;
                //Diagonal (/)
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (i == j) {
                            s = s + mat[i][j];
                        }
                    }

                }

            }

            if (s == check) {
                s = 0;
                //Diagonal final.
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (i + j == 2) {
                            //La suma de las indices de la esquina Inversa da como resultado el largo de la matriz - 1.
                            s = s + mat[i][j];
                        }
                    }

                }
            }
            if (s == check) {
                System.out.println("IT IS MAGIC");
            } else {
                System.out.println("NO MAGIC MY FRIEND");
            }

        } else {
            System.out.println("IT IS NO MAGIC MY FRIEND ");
        }
    }
}
