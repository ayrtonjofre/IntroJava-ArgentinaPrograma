/*
Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales con los cuales se realizarán diferentes operaciones matemáticas. La clase debe tener un constructor vacío, getters y setters.  
En el constructor vacío se usará el Math.random para generar los dos números. 
Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar los siguientes métodos:
Método mostrarValores que muestra cuáles son los dos números guardados. OK
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor OK
Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores. OK
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

 */
package Servicios;

import Entidades.ParDeNumeros;

public class ParDeNumeroService {

    ParDeNumeros p1 = new ParDeNumeros();

    //Método mostrarValores que muestra cuáles son los dos números guardados.
    public void mostrarValores() {
        System.out.println("Los numeros son:" + p1.getNum1() + " y " + p1.getNum2());
    }

    //Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
    public void devolvermayor() {
        System.out.println("El numero mayor es " + Math.max(p1.getNum1(), p1.getNum2()));
    }

    //Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. 
    //Previamente se deben redondear ambos valores.
    public void calcularPotencia() {
        //Math.round para redondear los doubles.
        long roundN1 = Math.round(p1.getNum1());
        long roundN2 = Math.round(p1.getNum2());

        long max = Math.max(roundN1, roundN2);
        long min = Math.min(roundN1, roundN2);

        System.out.println("Resultado de la potencia es: " + Math.pow(max, min));
    }
    
    //Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
    //Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    
    public void calculaRaiz(){
        // Usamos el Math.abs para obtener el valor absoluto y luego el como parametro pasamos Math.min para validar cual es el menor
        //Entre los atributos num1 y num2
        double abs = Math.abs(Math.min(p1.getNum1(), p1.getNum2()));
        
        System.out.println("La raiz quadrada del minNumero es: " + Math.sqrt(abs));    
    }
    
}
