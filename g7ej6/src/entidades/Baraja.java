/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author agos.tutto
 */
public class Baraja {
    private ArrayList<Carta> naipes = new ArrayList();

    public Baraja() {
    }

    public ArrayList<Carta> getNaipes() {
        return naipes;
    }

    public void setNaipes(ArrayList<Carta> naipes) {
        this.naipes = naipes;
    }

    @Override
    public String toString() {
        return "Baraja{" + "naipes=" + naipes + '}';
    }
    
}
