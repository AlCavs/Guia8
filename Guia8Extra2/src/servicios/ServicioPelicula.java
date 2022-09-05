/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Pelicula;
import java.util.ArrayList;

/**
 *
 * @author NiLe
 */
public class ServicioPelicula {
    
    public ArrayList<Pelicula> cartelera = new ArrayList();
    public ArrayList<Pelicula> crearPeliculas(){
    Pelicula p = new Pelicula("Egg, la rebelion de los couch", 2, 13, "Maxi Martin");
    Pelicula p2 = new Pelicula("Egg xxx, prendidos fuego", 1.5, 18, "Kate");
    
     cartelera.add(p);
     cartelera.add(p2);
     
     
    return cartelera;
}
    public void mostrarCartelera(){
        int op = 1;
        for (Pelicula pelicula : cartelera) {
            System.out.println("Pelicula " +op +": "+ pelicula.getTitulo());
            op++;
        }
    }
    
}
