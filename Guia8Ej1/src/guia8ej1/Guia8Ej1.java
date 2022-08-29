/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia8ej1;

import entidades.Perro;
import entidades.Persona;

/**
 *
 * @author NiLe
 */
public class Guia8Ej1 {

    /**
     * @param args the command line arguments
     * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro p1 = new Perro("Chiquito", "Gran Danes",7, "Grande");
        Perro p2 = new Perro("Riquelme", "Pequines", 15, "pequeño");
        
        Persona persona1 = new Persona("Mario", "Balotelli", 25, 27590369, p1);
        Persona persona2= new Persona("Roberto", "Carlos", 42, 13589254, p2);
        
        System.out.println(persona1);
        System.out.println(persona2);
                
    }
    
}
