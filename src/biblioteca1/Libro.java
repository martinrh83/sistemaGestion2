/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca1;

/**
 *
 * @author mariano
 */
public class Libro {

    private String nombre;
    private String isbn;
    private int codigo;

    public Libro() {
    }

    public Libro(String nombre, String isbn, int codigo) {
        this.nombre = nombre;
        this.isbn = isbn;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + "isbn=" + isbn + "codigo=" + codigo + '}';
    }
    

}
