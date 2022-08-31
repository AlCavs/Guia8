/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Baraja;
import java.util.Scanner;

/**
 *
 * @author NiLe
 */
public class Menu {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public void crearMenu(){
         BarajaService bs = new BarajaService(); 
    Baraja b1 = bs.crearBaraja();
        boolean si = true;
        
        while(si){
            System.out.println("-------------------");
        System.out.println("INGRESE LA OPCION DESEADA:\n1 -Mostrar siguiente carta\n2 - Mezclar\n3 - Pedir Cartas\n4 - Ver cartas ya repartidas\n5 - Ver cantidad de cartas que quedan en el mazo\n6 - Salir ");    
        String op = sc.next();
            System.out.println("------------------");
        switch (op) {
            case "1":
                bs.siguienteCarta(b1.getNaipes());
                break;
                case "2":
                    bs.barajar(b1.getNaipes());
                break;
                case "3":
                    bs.darCartas(b1.getNaipes());
                break;
                case "4":
                    bs.cartasMonton();
                break;
                case "5":
                    bs.mostrarBaraja(b1.getNaipes());
                
                break;
                case "6":
                    System.out.println("Juego terminado");
                    si = false;
                break;
            default:
                System.out.println("Ingreso una opcion incorrecta, intente nuevamente");
                
        }
        }
    }
}
