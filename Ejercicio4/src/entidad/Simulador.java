package entidad;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Chuky
 */
public class Simulador {

    private final Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void crearNombres(ArrayList<String> x) {

        String[] nombres = {"Pedro", "Luz", "Chuky", "Andrea", "David", "Baldomero", "Balduino", "Baldwin", "Baltasar", "Barry", "Bartolo", "Bartolomé", "Baruc", "Baruj", "Candelaria", "Cándida", "Canela", "Caridad", "Carina", "Carisa", "Caritina", "Carlota", "Baltazar"};
        String[] apellido = {"Gomez", "Guerrero", "Cardenas", "Cardiel", "Cardona", "Cardoso", "Cariaga", "Carillo", "Carion", "Castiyo", "Castorena", "Castro", "Grande", "Grangenal", "Grano", "Grasia", "Griego", "Grigalva"};

        for (int i = 0; i < 500; i++) {

            x.add(nombres[(int) (Math.random() * (nombres.length - 1))] + " " + apellido[(int) (Math.random() * (apellido.length - 1))]);

        }
    }

    public void crearDni(ArrayList<Integer> x) {
        for (int i = 0; i < 500; i++) {
            x.add(ThreadLocalRandom.current().nextInt(20000000, 45000000));
        }

    }

    public void armarPersona(ArrayList<String> nom, ArrayList<Integer> dn, ArrayList<Alumno> x) {
        Random alea = new Random();
        System.out.println("Ingrese la cantidad de alumnos que desea cargar a la lista");
        var cant = Integer.parseInt(sc.next());
        for (int i = 0; i < cant; i++) {
            Alumno a1 = new Alumno();
            a1.setNomApe(nom.get(alea.nextInt(nom.size())));
            var ind = alea.nextInt(dn.size());
            a1.setDni(dn.get(ind));
            dn.remove(dn.get(ind));
            x.add(a1);
        }
    }

    public void mostrar(ArrayList<Alumno> x) {
        if (x.isEmpty()) {
            System.out.println("La lista de alumnos esta vacia");
        } else {
            System.out.println("----------------------Alumnos----------------------");
            System.out.print("Nombres");
            System.out.println("              DNI           Votos");
            for (Alumno alumno : x) {
                System.out.println(alumno);
            }
            System.out.println("---------------------------------------------------");
        }

    }

    public void votacion(ArrayList<Alumno> x, HashSet<Voto> v) {
        if (x.isEmpty()) {
            System.out.println("La lista de alumnos esta vacia");
        } else {
            v.clear();
            for (Alumno aux : x) {
                Voto nv = new Voto();
                HashSet<String> votado = new HashSet();
                nv.setAlumnito(aux);

                while (votado.size() < 3) {
                    var a = x.get((int) (Math.random() * x.size())).getNomApe();
                    var b = (x.get((int) (Math.random() * x.size())).getNomApe());

                    if (a.equalsIgnoreCase(aux.getNomApe()) && a.equalsIgnoreCase(nv.getAlumnito().getNomApe())) {
                        votado.add(b);
                    } else {
                        votado.add(a);
                    }

                    nv.setVotos(votado);
                    v.add(nv);
                }
            }
        }
        cantidadVotos(v, x);
    }

    public void cantidadVotos(HashSet<Voto> v, ArrayList<Alumno> a) {
        for (Voto aux : v) {
            for (String aulu : aux.getVotos()) {
                for (Alumno alumno : a) {
                    if (aulu.equalsIgnoreCase(alumno.getNomApe())) {
                        alumno.setVotos(alumno.getVotos() + 1);
                    }
                }
            }
        }
    }

    public void mostrarVotos(HashSet<Voto> v) {
        for (Voto voto : v) {
            System.out.println("El alumno: " + voto.getAlumnito().getNomApe() + " Recibio: " + voto.getAlumnito().getVotos() + " Votos y sus votos fueron para:");
            if (!voto.getVotos().isEmpty()) {
                for (String votados : voto.getVotos()) {
                    System.out.print(votados + " - ");
                }
                System.out.println("\n");
            } else {
                System.out.println("El alumno no voto a nadie");
            }

        }
    }

    public void recuentoVotos(ArrayList<Alumno> a) {
        var cont = 0;
        for (Alumno alumno : a) {
            cont += alumno.getVotos();
        }

        System.out.println("El recuento de votos es: " + cont);
    }

    public void primeros(ArrayList<Alumno> x) {
        System.out.println("Los primeros 5 más votados son:");

        for (int i = 0; i < 5; i++) {
            System.out.println(x.get(i).getNomApe() + " Con " + x.get(i).getVotos() + " Votos");
        }

        System.out.println("Los suplentes son: ");
        if (x.size() > 10) {
            for (int i = 5; i < 10; i++) {
                System.out.println(x.get(i).getNomApe() + " Con " + x.get(i).getVotos() + " Votos");
            }
        } else {
            for (int i = 5; i < x.size(); i++) {
                System.out.println(x.get(i).getNomApe() + " Con " + x.get(i).getVotos() + " Votos");
            }
        }

    }
}
