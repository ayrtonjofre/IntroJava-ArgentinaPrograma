package Servicies;
import Entidades.Raices;
import java.util.Scanner;

/**
 * @author tomyv
 */
public class RaicesServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Raices r1 = new Raices();
    double get;
    
    public void datear(){
        System.out.println("INGRESE EL VALOR DE A");
        r1.setA(sc.nextDouble());
        System.out.println("INGRESE EL VALOR DE B");
        r1.setB(sc.nextDouble());
        System.out.println("INGRESE EL VALOR DE C");
        r1.setC(sc.nextDouble());
    }
    
    //Método getDiscriminante(): devuelve el valor del discriminante (double).
    //El discriminante tiene la siguiente fórmula: (b^2)-4*a*c.
    public double getDiscriminante() {     
        return Math.pow(r1.getB(), 2) - 4 * (r1.getA() * r1.getC());
    }

    //Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra,
    //el discriminante debe ser mayor o igual que 0.
    public boolean tieneRaices() {
        return getDiscriminante() >= 0;
    }

    //Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución,
    //para que esto ocurra, el discriminante debe ser igual que 0.
    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }

    //Método obtenerRaices(): llama a tieneRaices() y si devolvió́ true, imprime las 2 posibles soluciones.
    public void obtenerRaices() {
        if (tieneRaices()) {
            double x1 = (-r1.getB() + Math.sqrt(getDiscriminante())) / (2 * r1.getA());
            double x2 = (-r1.getB() - Math.sqrt(getDiscriminante())) / (2 * r1.getA());
            System.out.println("LAS RAICES SON: x1 = " + x1 + ", x2 = " + x2);
        } else {
            System.out.println("NO HAY SOLUCION ");
        }
    }

    //Método obtenerRaiz(): llama a tieneRaiz() y si  devolvió́ true imprime una única raíz.
    //Es en el caso en que se tenga una única solución posible.
    public void obtenerRaiz() {
        if (tieneRaiz()==true) {
            double raiz = -r1.getB() / (2 * r1.getA());
            System.out.println("LA RAIZ ES " + raiz);
        } else {
            System.out.println("NO HAY UNA UNICA SOLUCION REALEZA");
        }
    }

    //Método calcular(): esté método llamara tieneRaices() y a tieneRaiz(), y mostrará por pantalla las posibles
    //soluciones que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(),
    //según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
    //((-b±√((b^2) - (4*a*c))) / (2*a).
    public void calcular() {
        if(tieneRaices()==true){
            obtenerRaices();
        }else if (tieneRaiz()){
             obtenerRaiz();
        }else{
            System.out.println("NO TIENE RAICES");
        }
    }
    
    
}
