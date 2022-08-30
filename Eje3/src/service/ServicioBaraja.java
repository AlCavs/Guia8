package service;

import entidad.Baraja;
import entidad.Carta;
import enums.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Chuky
 */
public class ServicioBaraja {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private Baraja mazoInicial = new Baraja();
    private Baraja cartasRepartidas = new Baraja();
    

    public void crearBaraja() {
        ArrayList<Carta> cart = new ArrayList();
        ArrayList<Carta> repa = new ArrayList();

        cartasRepartidas.setCartas(repa);

        for (Palo pal : Palo.values()) {
            var p = pal.getNombre();
            for (int i = 0; i < 12; i++) {
                if (i + 1 == 8 || i + 1 == 9); else {
                    Carta c = new Carta(i+1,pal);
                    cart.add(c);
                }
            }
        }
        mazoInicial.setCartas(cart);
        System.out.println("Mazo iniciado!");
    }
    
    public void mezclar(){
        Collections.shuffle(mazoInicial.getCartas());
        System.out.println("------ Baraja Mezclada! ------");
    }
    
    public Carta proximaCarta(){
        Carta car = mazoInicial.getCartas().get(0);
        System.out.println("La siguiente carta es: " + mazoInicial.getCartas().get(0).toString());
        return car;
    }
    
    public void cartDisp(){
        System.out.println("Cartas restantes: "+ mazoInicial.getCartas().size());
    }
    
    public void darCartas(){
        System.out.println("Cuantas cartas queres? ");
        var cant = Integer.parseInt(sc.next());
        
        if (cant <= mazoInicial.getCartas().size()) {
            for (int i = 0; i < cant; i++) {
                System.out.println("Se repartio "+ mazoInicial.getCartas().get(i).toString());
            }
            for (int i = 0; i < cant; i++) {
                cartasRepartidas.getCartas().add(mazoInicial.getCartas().get(0));
                mazoInicial.getCartas().remove(0);
            }
        }else{
            System.out.println("Cartas insuficientes, no se te dio ninguna carta");
            cartDisp();
        }
    }
    
    public void cartasRepartidas(){
        if (cartasRepartidas.getCartas().isEmpty()) {
            System.out.println("No se repartió ninguna carta");
        }else{
            System.out.println("Cartas repartidas");
            for (Object cartRep : cartasRepartidas.getCartas()) {
                System.out.println(cartRep.toString());
            }
        }
    }
    
    public void mostrarCartas(){
        if (mazoInicial.getCartas().isEmpty()) {
            System.out.println("El mazo esta vacio");
        }
        else{
            System.out.println("Las cartas que quedan en el mazo");
            for (Object cartMazo : mazoInicial.getCartas()) {
                System.out.println(cartMazo.toString());
            }
        }
    }
        
}
