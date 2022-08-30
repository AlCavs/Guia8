
package entidades;

public class Revolver {
    
    private int posActual;
    private int posAgua;

    public Revolver() {

    }
    
    public void llenarRevolver(){
        
        posActual = ((int) (Math.random() * (7 - 1) + 1));
        posAgua = ((int) (Math.random() * (7 - 1) + 1));
        
    }
    
    public boolean mojar(){
        
        return posActual == posAgua;
        
    }

    public void siguienteChorro(){
        
        if(posActual == 6){
            
            posActual = 1;
            
        }else{
            
            posActual++;
        }

    }

    @Override
    public String toString() {
        return "Revolver{" + "posActual=" + posActual + ", posAgua=" + posAgua + '}';
    }

}
