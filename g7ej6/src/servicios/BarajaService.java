/*
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package servicios;

import entidades.Baraja;
import entidades.Carta;
import enums.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author agos.tutto
 */
public class BarajaService {
    Scanner leer = new Scanner (System.in);
    ArrayList<Carta> cartitas = new ArrayList();
    public Baraja crearBaraja (){
        Baraja b1 = new Baraja();
        for (Palo aux : Palo.values()) {
            for (int i = 1; i < 13; i++) {
                if(i!=8 && i!=9){
                Carta c1 = new Carta();
                c1.setNum(i);
                c1.setPalo(aux);
                b1.getNaipes().add(c1);
                }
            }
        }
        return b1;  
        }
    public void barajar(ArrayList<Carta> naipes){
        Collections.shuffle(naipes);
        System.out.println("Barajando....");
    }
    public void siguienteCarta(ArrayList<Carta> naipes){
        if (naipes.isEmpty()){
            System.out.println("no hay mas cartas");
        } else {
            System.out.println(naipes.get(0));
        }
    }
    public void cartasDisponibles(ArrayList<Carta> naipes){
        System.out.println("quedan " + naipes.size() + " cartas disponibles");
    }
    public void darCartas (ArrayList<Carta> naipes){
        System.out.println("ingrese la cantidad de cartas a repartir");
        int cant = leer.nextInt();
        if (cant<=naipes.size()){
            for (int i = 0; i < cant; i++) {
             cartitas.add(naipes.get(0));
             naipes.remove(0);   
            }
            System.out.println("cartas repartidas");
        } else {
            System.out.println("cartas insuficientes");
        }
    }        
    public void cartasMonton(){
          if (!cartitas.isEmpty()){
        for (Carta car : cartitas) {
            System.out.println(car);
        }
          }else{
              System.out.println("No hay cartas repartidas");
          }
    }
    public void mostrarBaraja(ArrayList<Carta> naipes){
        System.out.println("Quedan " + naipes.size() + " cartas");
        for (Carta naipe : naipes) {
            System.out.println(naipe);
        }
        
    }

    }
