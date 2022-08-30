/*
    Perro, que tendrá como atributos: nombre, raza, edad y tamaño;
 */
package entidad;

/**
 *
 * @author Chuky
 */
public class Animal {

    private String nombre;
    private String raza;
    private String tipo;//tipo de mascota
    private Integer edad;
    private String tamanio;

    public Animal() {
    }

    public Animal(String nombre, String raza, String tipo, Integer edad, String tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.tipo = tipo;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

     
    @Override
    public String toString() {
        return nombre + ", es un: "+tipo+ ", de Raza: " + raza + ", tiene: " + edad + " Años y su tamaño es: " + tamanio;
    }
}
