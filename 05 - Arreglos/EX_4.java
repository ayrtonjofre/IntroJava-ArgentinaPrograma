package GUIA_5;

import java.util.Scanner;

public class EJ_EXTRA4 {

    /**
     * @param args the command line arguments Los profesores del curso de
     * programación de Egg necesitan llevar un registro de las notas adquiridas
     * por sus 10 alumnos para luego obtener una cantidad de aprobados y
     * desaprobados. Durante el período de cursado cada alumno obtiene 4 notas,
     * 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones
     * de cada nota son: Primer trabajo práctico evaluativo 10% Segundo trabajo
     * práctico evaluativo 15% Primer Integrador 25% Segundo integrador 50% Una
     * vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
     * Al final del programa los profesores necesitan obtener por pantalla la
     * cantidad de aprobados y desaprobados, teniendo en cuenta que solo
     * aprueban los alumnos con promedio mayor o igual al 7 de sus notas del
     * curso.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner vlad = new Scanner(System.in);
        double[] vector = new double[10];
        String name;
        int note;
        double promedio = 0;
        int tp1 = 0;
        int tp2 = 0;
        int in1 = 0;
        int in2 = 0;
        for (int i = 0; i < vector.length - 1; i++) {
            System.out.println("INGRESE LAS NOTAS DEL ALUMNO " + (i + 1));
            for (int j = 1; j < 5; j++) {
                switch (j) {
                    case 1:
                        System.out.println("NOTA 1: ");
                        note = vlad.nextInt();
                        tp1 = note;
                        break;
                    case 2:
                        System.out.println("NOTA 2: ");
                        note = vlad.nextInt();
                        tp2 = note;
                        break;
                    case 3:
                        System.out.println("NOTA 3: ");
                        note = vlad.nextInt();
                        in1 = note;
                        break;
                    case 4:
                        System.out.println("NOTA 4: ");
                        note = vlad.nextInt();
                        in2 = note;
                        break;
                }

            }
            promedio = ((tp1 * 0.10) + (tp2 * 0.15) + (in1 * 0.25) + (in2 * 0.5));
            System.out.println("EL PROMEDIO ES " + promedio);
            vector[i] = promedio;
        }
        Imprimir(vector);
        AprobadosyDesaprobados(vector);
    }

    public static void Imprimir(double[] vec) {
        for (int i = 0; i < vec.length - 1; i++) {
            System.out.print("[" + vec[i] + "]");
        }
        System.out.println("");
    }

    public static void AprobadosyDesaprobados(double[] vector) {
        int ca = 0;
        int cd = 0;
        for (int i = 0; i < vector.length - 1; i++) {
            if (vector[i] >= 7) {
                ca++;
            } else {
                cd++;
            }
        }

        if (ca == 0) {
            System.out.println("NO HAY NINGUN APROBADO");
        } else {
            System.out.println("HAY EN TOTAL " + ca + " APROBADOS");
        }

        if (cd == 0) {
            System.out.println("NO HAY NINGUN DESAPROBADO");
        } else {
            System.out.println("HAY EN TOTAL " + cd + " DESAPROBADOS");
        }
    }

}
