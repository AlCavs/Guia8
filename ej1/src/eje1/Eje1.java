package eje1;

import entidad.Humano;
import entidad.Animal;
import java.util.ArrayList;
import service.ServicioAdoptar;
import service.ServicioCrearHP;

/**
 *
 * @author Chuky
 */
public class Eje1 {

    public static void main(String[] args) {
        ArrayList<Humano> personas = new ArrayList();
        ArrayList<Animal> animal = new ArrayList();
        ServicioCrearHP chp = new ServicioCrearHP();
        ServicioAdoptar adp = new ServicioAdoptar();
        
        chp.cargarList(personas, animal);
        System.out.println("---------------------------------------------------------------------------");
        chp.muestra(personas, animal);
        System.out.println("---------------------------------------------------------------------------");
        adp.adoptar(personas, animal);
        System.out.println("---------------------------------------------------------------------------");
        adp.mostrar(personas);
        System.out.println("---------------------------------------------------------------------------");
        
        
    }
    
}
