/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entidad.Humano;
import entidad.Animal;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Chuky
 */
public class ServicioCrearHP {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Humano crearHumano() {
        Humano h = new Humano();
        System.out.println("Ingrese el nombre de la persona");
        h.setNombre(sc.next());
        System.out.println("Ingrese el apellido de la persona");
        h.setApellido(sc.next());
        System.out.println("Ingrese el dni");
        h.setDocumento(Integer.parseInt(sc.next()));
        System.out.println("Ingrese la edad");
        h.setEdad(Integer.parseInt(sc.next()));
        return h;
    }

    public Animal crearAnimal() {
        Animal p = new Animal();
        System.out.println("Ingrese el nombre del animal");
        p.setNombre(sc.next());
        System.out.println("Ingrese el tipo de mascota");
        p.setTipo(sc.next());
        System.out.println("Ingrese la edad de: " + p.getNombre());
        p.setEdad(Integer.parseInt(sc.next()));
        System.out.println("Ingrese la raza de: " + p.getNombre());
        p.setRaza(sc.next());
        System.out.println("Ingrese el tamaño de: " + p.getNombre());
        p.setTamanio(sc.next());

        return p;
    }

    public void cargarList(ArrayList<Humano> h, ArrayList<Animal> p){
        
        for (int i = 0; i < 2; i++) {
            h.add(crearHumano());
        }
        for (int i = 0; i < 2; i++) {
            p.add(crearAnimal());
        }
        
    }
    
    public void muestra(ArrayList<Humano> h, ArrayList<Animal> p){
        
        System.out.println("La lista de Personas y Animales es\n-----------------------------Animal-------------------------------");
        for (Animal animal : p) {
            System.out.println(animal);
        }
        System.out.println("-----------------------------Personas-----------------------------");
        for (Humano humano : h){
            System.out.println(humano);            
        }
        
    }
}
