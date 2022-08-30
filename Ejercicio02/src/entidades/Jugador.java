
package entidades;

public class Jugador {
    
    private int id;
    private String nombre;
    private boolean mojado = false;

    public Jugador() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
 
    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }

    public void disparo(Revolver r){
        
        if(r.mojar()){
            
            mojado = true;
            r.siguienteChorro();

        }else{
            
            r.siguienteChorro();
            
        }
        
    }
}
