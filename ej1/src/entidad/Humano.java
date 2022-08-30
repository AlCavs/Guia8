
package entidad;

/**
 *
 * @author Chuky
 */
public class Humano {

    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer documento;
    private Animal animal;

    public Humano() {
    }

    public Humano(String nombre, String apellido, Integer edad, Integer documento, Animal animal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.animal = animal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public Animal getPerro() {
        return animal;
    }

    public void setPerro(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "La Persona: " + nombre + " " + apellido + ", con dni " + documento + ", de edad: "+ edad;
    }

}
