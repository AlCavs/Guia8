
package ejercicio02;

import entidades.Juego;
import entidades.Revolver;

public class Ejercicio02 {

    public static void main(String[] args) {
        
        Revolver revolver = new Revolver();
        
        revolver.llenarRevolver();
        
        Juego juego1 = new Juego(revolver);
        
        juego1.llenarJuego();
        
        juego1.ronda();
        
        
    }
    
}
