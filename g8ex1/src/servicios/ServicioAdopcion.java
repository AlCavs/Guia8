/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package servicios;

import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author agos.tutto
 */
public class ServicioAdopcion {

    ArrayList<Perro> chocos = new ArrayList();
    ArrayList<Persona> personas = new ArrayList();
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void crearPerros() {
        boolean salir = false;
        do {
            Perro p1 = new Perro();
            System.out.println("ingrese nombre del perro");
            /*nombre,edad,raza y tamanio*/
            p1.setNombre(sc.next());
            System.out.println("ingrese la edad del perro");
            p1.setEdad(sc.nextInt());
            System.out.println("ingrese la raza del perro");
            p1.setRaza(sc.next());
            System.out.println("ingrese el tamanio del perro");
            p1.setTamanio(sc.next());
            chocos.add(p1);
            System.out.println("desea ingresar otro perro? 1-SI 2-NO");
            if (sc.nextInt() == 2) {
                salir = true;
            }
        } while (!salir);
    }

    public void crearPersonas() {
        boolean salir = false;
        do {
            Persona pp = new Persona();
            System.out.println("ingrese nombre de la persona");
            /*nombre,edad,raza y tamanio*/
            pp.setNombre(sc.next());
            System.out.println("ingrese el apellido de la persona");
            pp.setApellido(sc.next());
            System.out.println("ingrese la edad de la persona");
            pp.setEdad(sc.nextInt());
            System.out.println("ingrese el dni de la persona");
            pp.setDni(sc.nextLong());
            personas.add(pp);
            System.out.println("desea ingresar otra persona? 1-SI 2-NO");
            if (sc.nextInt() == 2) {
                salir = true;
            }
        } while (!salir);
    }

    public Persona validarPers() {
        System.out.println("Como te llamas?");
        String nomAdoptante = sc.next();
        Persona p1 = new Persona();
        for (Persona aux : personas) {
            if (aux.getNombre().equals(nomAdoptante)) {
                p1 = aux;
            }
        }
        return p1;
    }

    public void Adoptar() {
        boolean si = true;
        Persona p1 = validarPers();
        boolean esta = false;

        if (p1 == null) {
            System.out.println("la persona no existe");
        } else {
            while (si) {
                System.out.println("Ingrese el nombre del perro que desea adoptar");
                String adoptNom = sc.next();
                for (Perro aux : this.chocos) {
                    esta = false;
                    if (aux.getNombre().equals(adoptNom)) {
                        if (!aux.isAdoptado()) {

                            p1.addMascota(aux);
                            aux.setAdoptado(true);
                            esta = true;
                        }
                    }
                }
                if (!esta) {
                    System.out.println("este perro no esta disponible");
                }
                System.out.println("Desea adoptar otro perro? 1 - Si 2 - No");
                if (sc.nextInt() != 1) {
                    si = false;
                }

            }
        }
    }
    public void mostrarPersonas(){
        for (Persona choco : personas) {
            System.out.println(choco);
        }
    }
    public void mostrarPerros(){
        for (Perro choco : chocos) {
        if (!choco.isAdoptado())
            System.out.println(choco);
        }
    }
}
