/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.TreeMap;

/**De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada. Luego, de las películas nos interesa saber
el título, duración, edad mínima y director. Por último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
 *
 * @author NiLe
 */
public class Cine {
    private Pelicula peli;
    private TreeMap<String,Persona> sala = new TreeMap();
    private double precio = 250;

    public Cine() {
    }

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }

    public TreeMap<String, Persona> getSala() {
        return sala;
    }

    public void setSala(TreeMap<String, Persona> sala) {
        this.sala = sala;
    }

    public double getPrecio() {
        return precio;
    }

 

    @Override
    public String toString() {
        return "Cine{" + "peli=" + peli + ", sala=" + sala + ", precio=" + precio + '}';
    }
    
    
}
