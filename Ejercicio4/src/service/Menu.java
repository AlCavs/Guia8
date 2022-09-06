package service;

import entidad.Alumno;
import entidad.Simulador;
import entidad.Voto;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Chuky
 */
public class Menu {

    private final Scanner sc = new Scanner(System.in).useDelimiter("\n");
    final ArrayList<String> listaNomb = new ArrayList();
    final ArrayList<Integer> listaDni = new ArrayList();
    final ArrayList<Alumno> listadoAlumno = new ArrayList();
    final HashSet<Voto> listavotos = new HashSet();
    private final Simulador simu = new Simulador();
    
    
    public void menu() {

        simu.crearDni(listaDni);
        simu.crearNombres(listaNomb);
        System.out.println("-------------------------M E N U-------------------------");
        System.out.println("1-Ingrese la cantidad de alumnos a cargar\n2-Mostrar lista de alumnos\n3-Votar\n4-Mostrar Alumnos canidad de votos y a quien voto\n5-Recuento de votos\n6-Mostrar los Facilitadores y los suplentes\n7-Salir");
        System.out.print("--------->");

        var opc = Integer.parseInt(sc.next());

        switch (opc) {
            case 1 -> {
                simu.armarPersona(listaNomb, listaDni, listadoAlumno);
                menu();
            }
            case 2 -> {
                listadoAlumno.sort(Alumno.orden);
                simu.mostrar(listadoAlumno);
                menu();
            }
            case 3 -> {
                simu.votacion(listadoAlumno, listavotos);
                menu();
            }
            case 4 -> {
                simu.mostrarVotos(listavotos);
                menu();
            }
            case 5 -> {
                simu.recuentoVotos(listadoAlumno);
                menu();
            }

            case 6 -> {
                listadoAlumno.sort(Alumno.orden);
                simu.primeros(listadoAlumno);
                menu();
            }
            case 7 ->
                System.out.println("Fin de la simulacion");

            default -> {
                System.out.println("opcion incorrecta");
                menu();
            }
        }

    }

}
