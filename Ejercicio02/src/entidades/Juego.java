
package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Jugador> listaJugadores = new ArrayList();
    private Revolver revolver;

    public Juego(Revolver revolver) {
        this.revolver = revolver;
    }

    
    public void llenarJuego(){

        int opcion = 0;
        int cont = 1;
        
        do {
            
            Jugador nuevoJugador = new Jugador();
            
            nuevoJugador.setId(cont);
                     
            System.out.println("El ID del jugador es: " + cont);

            System.out.println("Ingrese el Nombre del jugador");
            nuevoJugador.setNombre(leer.next());
            
            listaJugadores.add(nuevoJugador);
            
            if(cont == 6){
                            
                System.out.println("Limite alcanzado");
                
            }else{
                
                System.out.println("¿Quiere ingresar otro jugador (0 o 1)?");
                opcion = leer.nextInt();
                
            }
            
            cont++;
            

        } while (cont <= 6 && opcion == 0);
      
    }
    
    public void ronda(){
        
        boolean finJuego = true;
        
        do {
            
            int cont = 0;
            
            for (Jugador aux : listaJugadores) {

                System.out.println("Ahora está jugando: " + aux.getNombre());
                
                aux.disparo(revolver);
                
                if(aux.isMojado()){
                    
                    System.out.println("El jugador que se mojó fue: " + aux.getNombre());
                    finJuego = false;
                    cont++;
                    System.out.println("Fin del juego. F por " + aux.getNombre());
                    break;
                    
                }else{
                    
                    System.out.println(aux.getNombre() + " se salvó");
                    
                }
                
                if(cont == 0){
                    
                    System.out.println("\nEnter para siguiente jugador:");
                    leer.next();
                    
                }
                
            }
            
        } while (finJuego);
      
    }
    
}
