/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase13a18_poo;

import Entidad.Persona;

/**
 *
 * @author ADMIN
 */
public class Clase13a18_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona pers1 = new Persona();
        Persona pers2 = new Persona("Ayrton");
        //System.out.println("mi nombre es: " + pers2.nombre);
        
        Persona pers3 = new Persona("Ayrton", "Jofre");
        //System.out.println("Mi nombre es: " + pers3.nombre + " " + pers3.apellido);
        
        Persona pers4 = new Persona();
        pers4.setEdad(26);
        
        System.out.println("Mi edad es: " + pers4.getEdad());
        

    }
    
}
