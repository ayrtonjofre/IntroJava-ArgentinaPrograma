package GUIA_5;
public class EJ_3 {
    /**
     * @param args the command line arguments
     * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
     * cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int c1=0;
        int c2=0;
        int c3=0;
        int c4=0;
        int c5=0;
        int length;
        int vector[] = new int [10];
        for (int i = 0; i <= vector.length-1; i++) {
            vector[i] =  (int) (Math.random()*99999+1);
            length = String.valueOf(vector[i]).length();
            System.out.print("[" + vector[i] + "]");
            switch (length)  {
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
        System.out.println("");
        System.out.println("HAY " + c1 + " CON 1 UN DIGITO ");
        System.out.println("HAY " + c2 + " CON 2 UN DIGITOS ");
        System.out.println("HAY " + c3 + " CON 3 UN DIGITOS ");
        System.out.println("HAY " + c4 + " CON 4 UN DIGITOS ");
        System.out.println("HAY " + c5 + " CON 5 UN DIGITOS ");
    }
}