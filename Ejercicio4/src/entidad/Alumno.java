package entidad;


import java.util.Comparator;



/**
 *
 * @author Chuky
 */
public class Alumno {
    private String nomApe;
    private Integer dni;
    private int voto;

    public Alumno() {
    }

    public Alumno(String nomApe, Integer dni, int votos) {
        this.nomApe = nomApe;
        this.dni = dni;
        this.voto = 0;
    }

    public String getNomApe() {
        return nomApe;
    }

    public void setNomApe(String nomApe) {
        this.nomApe = nomApe;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getVotos() {
        return voto;
    }

    public void setVotos(int votos) {
        this.voto = votos;
    }
    
   
      public static Comparator<Alumno> orden = (Alumno t, Alumno t1) -> t1.getVotos().compareTo(t.getVotos());
  

    @Override
    public String toString() {
        return nomApe + "       " + dni + "         " + voto;
    }
    
    
}
