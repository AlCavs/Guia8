
package service;

import entidad.Humano;
import entidad.Animal;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Chuky
 */
public class ServicioAdoptar {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void adoptar(ArrayList<Humano> h, ArrayList<Animal> p) {

        for (Humano human : h) {
            System.out.println("Para: " + human.getNombre() + "\nTiene los siguientes animalitos para adoptar");
            for (Animal animal : p) {
                System.out.println("La mascota: " + animal.getNombre() + ", Es un: "+animal.getTipo() + " De raza: " + animal.getRaza());
            }
            System.out.println("Ingrese el nombre de la mascota que quiere adoptar");
            var adopta = sc.next();
            var control = 0;
            for (int i = 0; i < p.size(); i++) {
                if (adopta.equalsIgnoreCase(p.get(i).getNombre())) {
                    human.setPerro(p.get(i));
                    System.out.println("La masota: " + p.get(i).getNombre() + " fue adoptada");
                    p.remove(i);
                    control++;
                }
            }
                if (control == 0) {
                System.out.println("El nombre de la mascota no es valido");
            }
        }

    }
    
    public void mostrar(ArrayList<Humano> h){
        for (Humano hum : h) {
            if (hum.getPerro()== null) {
                System.out.println(hum.getNombre() + " No adopto ningun Animal");
            }else{
                System.out.println(hum.getNombre() + " adopto a: " + hum.getPerro());
            }
        }
    }

}
