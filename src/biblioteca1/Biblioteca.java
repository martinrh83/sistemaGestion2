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
public class Biblioteca {


    private static  ArrayList<Libro>listalibro=new ArrayList<Libro>();
    private static ArrayList<Prestamo>listaprestamo=new ArrayList<Prestamo>();
    private static ArrayList<Cliente>listacliente=new ArrayList<Cliente>();

    public Biblioteca() {
    }

    public static ArrayList<Cliente> getListacliente() {
        return listacliente;
    }

    public static void setListacliente(ArrayList<Cliente> listacliente) {
        Biblioteca.listacliente = listacliente;
    }

    public static ArrayList<Libro> getListalibro() {
        return listalibro;
    }

    public static void setListalibro(ArrayList<Libro> listalibro) {
        Biblioteca.listalibro = listalibro;
    }

    public static ArrayList<Prestamo> getListaprestamo() {
        return listaprestamo;
    }

    public static void setListaprestamo(ArrayList<Prestamo> listaprestamo) {
        Biblioteca.listaprestamo = listaprestamo;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + '}';
    }

public static int  buscarlibro(int codigo){

    int posi=-1;
    int i=0;
    while(i<Biblioteca.listalibro.size() && posi==-1)
    {
    if(codigo==listalibro.get(i).getCodigo())
    {
        posi = i;}
    i++;
    }
    return posi;
}

public static int buscarCliente(int cod)
    {
    int i=0;
    int possocio=-1;

    while (i<listacliente.size()&&possocio==-1)
    {
        if(cod ==listacliente.get(i).getDni())
        {
            possocio=i;
        }
   i++;
    }
    return possocio;
}

}
