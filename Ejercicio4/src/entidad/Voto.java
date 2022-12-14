package entidad;

import java.util.HashSet;

/**
 *
 * @author Chuky
 */
public class Voto {
    private Alumno alumnito;
    private HashSet<String> votos = new HashSet();

    public Voto() {
    }

    public Voto(Alumno alumnito) {
        this.alumnito = alumnito;
    }

    public Alumno getAlumnito() {
        return alumnito;
    }

    public void setAlumnito(Alumno alumnito) {
        this.alumnito = alumnito;
    }

    public HashSet<String> getVotos() {
        return votos;
    }

    public void setVotos(HashSet<String> votos) {
        this.votos = votos;
    }

    @Override
    public String toString() {
        return "Voto{" + "alumnito=" + alumnito + ", votos=" + votos + '}';
    }

   
}