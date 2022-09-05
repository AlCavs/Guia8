/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Persona;
import java.util.ArrayList;
import java.util.List;



import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author NiLe
 */
public class ServicioPersona {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

        TreeMap<String, Persona> cine = new TreeMap();
        
    public TreeMap<String, Persona> crearPersonas() {


        System.out.println("Ingrese el numero de personas en el cine");
        int per = sc.nextInt();

        String[] columnas = {"A", "B", "C", "D", "E", "F"};
        int cont = 0;
            List<String> keyList = new ArrayList();

        while (cont < per) {

            int aux = (int) (Math.random() * (9 - 1) + 1);
            String llave = (aux + columnas[(int) (Math.random() * columnas.length)]);            
            
            
               Persona p = new Persona();
            asignarDatos(llave,p);
           
               if (!keyList.contains(llave)){
                   keyList.add(llave);              
                    cine.put(llave, p);
                    cont++;             
                }
               
            }
            System.out.println("Cantidad de personas: "+cont);
        
//        for (Map.Entry<String, Persona> aux : cine.entrySet()) {
//            Object key = aux.getKey();
//            Object val = aux.getValue();
//            
//            System.out.println(key + " " + val);
//        }

        return cine;
    }
    public void asignarDatos(String llave, Persona p){
     
        String[] nombres = {"Mario", "Ana", "Adolf", "Juan Pablo II", "Maria Esther", "Benito"};
                    int edad = ThreadLocalRandom.current().nextInt(10, 60);
                    double money = ThreadLocalRandom.current().nextDouble(1, 600);

                    p.setNombre(nombres[(int) (Math.random() * nombres.length)]);
                    p.setEdad(edad);
                    p.setDinero(Math.round(money * 100.0) / 100.0);

                    
    }
}
