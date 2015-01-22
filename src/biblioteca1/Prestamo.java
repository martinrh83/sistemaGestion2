/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca1;

import java.util.ArrayList;

/**
 *
 * @author mariano
 */
public class Prestamo {


        private Cliente cliente;
        private    ArrayList<Libro> libros=new ArrayList<Libro>();
        private int codigo;
        private Fecha fecha;

    public Prestamo() {


    }

    public Prestamo(Cliente cliente, ArrayList<Libro> libros, int codigo, Fecha fecha) {
        this.cliente = cliente;
        this.libros = libros;
        this.codigo = codigo;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "cliente=" + cliente + "libros=" + libros + "codigo=" + codigo + "fecha=" + fecha + '}';
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }


}
