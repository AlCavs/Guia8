/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Cine;
import entidades.Pelicula;
import entidades.Persona;
import java.util.Map;
//import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author NiLe
 */
public class ServicioCine {
    
    public TreeMap<String,Persona> mapa = new TreeMap();
    public Cine crearCine(TreeMap<String,Persona> personas, Pelicula p){
        
        Cine c = new Cine();
        crearSala();
        c.setPeli(p);
        asignarAsientos(personas,p,c);
        c.setSala(mapa);
        return c;
    }
    public void crearSala(){
          for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 7; j++) {
        Persona p = new Persona();
                switch (j) {
                    case 1:
                        mapa.put((i+"A"), p);
                        break;
                        case 2:
                        mapa.put((i+"B"), p);
                        break;
                    case 3:
                        mapa.put((i+"C"), p);
                        break;
                    case 4:
                        mapa.put((i+"D"), p);
                        break;
                    case 5:
                        mapa.put((i+"E"), p);
                        break;
                    case 6 :
                        mapa.put((i+"F"), p);
                        break;
                    
                    default:
                        throw new AssertionError();
                }              
                
            }
          }
    }
    public void asignarAsientos(TreeMap<String,Persona> per, Pelicula p, Cine c){
        
        
        for (Map.Entry<String, Persona> aux : per.entrySet()) {
            String key = aux.getKey();
            Persona val = aux.getValue();
            
            for (Map.Entry<String, Persona> entry : mapa.entrySet()) {
                String keyM = entry.getKey();
                Persona valM = entry.getValue();
                
                
               
                    if(aux.getValue().getEdad() >= p.getEdadMin()){
                     if(aux.getValue().getDinero() >= c.getPrecio()){
                if(key.equalsIgnoreCase(keyM)){
                        // System.out.println("Adelante "+val.getNombre() +", disfrute la funcion");
                   entry.setValue(val);                   
                     }
                     }else{
                         //System.out.println("Seco");
                     
                    }
                }else{
                       // System.out.println("No cumple con la edad minima requerida para ver la pelicula");
                    
            }
            
        }
        
        
    }
}
    public void mostrarSala(){
          int cont = 0;
          
        for (Map.Entry<String, Persona> aux : mapa.entrySet()) {
            String key = aux.getKey();
            Persona val = aux.getValue();
            cont++;
                
           if(val.getNombre() == null){
            System.out.print(key + "  "); 
           }else{
               System.out.print(key + "X ");
           }
        if (cont % 6 == 0){
            System.out.println(" ");
            }
        
        }
    }
}
