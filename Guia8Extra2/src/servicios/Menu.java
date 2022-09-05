/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;
//
//import entidades.Pelicula;
//import java.util.ArrayList;
import entidades.Pelicula;
import entidades.Persona;
import java.util.Scanner;
import java.util.TreeMap;



/**
 *
 * @author NiLe
 */
public class Menu {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public Menu() {
        ServicioPelicula sp = new ServicioPelicula();
        sp.crearPeliculas();
 
        System.out.println("Bienvenido/a/x/e al cine");
        System.out.println("Seleccione una pelicula: ");
        sp.mostrarCartelera();
        int op = sc.nextInt();
        Pelicula p = sp.cartelera.get(op-1);        
        ServicioPersona serP = new ServicioPersona();        
         TreeMap<String, Persona> p1 = serP.crearPersonas();
         ServicioCine serCi = new ServicioCine();
         serCi.crearCine(p1, p); 
         serCi.mostrarSala();
         
        
        
        
    }
}
