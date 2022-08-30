package entidad;

import java.util.Scanner;
import service.ServicioBaraja;

public class Menu {

    ServicioBaraja sb = new ServicioBaraja();
    private final Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void menu() {
        System.out.println("---------------- M E N U ----------------");
        System.out.println("           Ingrese una opción");
        System.out.println("1 - Crear Baraja\n2 - Mezclar\n3 - Mostrar siguiente carte\n4 - Pedir Cartas\n5 - Ver cartas ya repartidas\n6 - Ver cantidad de cartas que quedan\n7 - Ver cartas que quedan en el mazo\n8 - Salir");
        System.out.print("----------->  ");

        var opc = Integer.parseInt(sc.next());

        switch (opc) {
            case 1 -> {sb.crearBaraja();menu();}
            case 2 -> {sb.mezclar();menu();}
            case 3 -> {sb.proximaCarta();menu();}
            case 4 -> {sb.darCartas();menu();}
            case 5 -> {sb.cartasRepartidas();menu();}
            case 6 -> {sb.cartDisp();menu();}
            case 7 -> {sb.mostrarCartas();menu();}
            case 8 -> System.out.println("Gracias por utilizar el programa!");
            default -> {System.out.println("Opcion incorrecta");menu();}
        }
    }
}
