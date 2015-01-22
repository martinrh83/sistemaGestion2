/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca1;

/**
 *
 * @author mariano
 */
public class Cliente {

    private String nombre;
    private String apellido;
    private int dni;

    public Cliente() {

    }

    public Cliente(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + "apellido=" + apellido + "dni=" + dni + '}';
    }




}
