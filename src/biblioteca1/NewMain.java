/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca1;

import java.awt.Menu;
import java.util.ArrayList;

/**
 *
 * @author mariano
 */
public class NewMain {
private static ArrayList<Libro>listaa=new ArrayList<Libro>();
private static ArrayList<Libro>listaa1=new ArrayList<Libro>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereprivate ArrayList<Libro>listaa;


          Cliente cliente1= new Cliente("Mariano", "Flores", 1000);
          Cliente cliente2= new Cliente("MarianoNICOLAS", "Flores", 1000);
        Libro libro1=new Libro("RIver", "asda88", 200);
        Libro libro2=new Libro("CASA BLANCA", "asdsad22", 22000);
        Fecha fecha =new Fecha();
        

        Prestamo p1=new Prestamo(cliente1,listaa, 5444, fecha);
        Prestamo p2=new Prestamo(cliente2,listaa1, 5444, fecha);
        Biblioteca.getListaprestamo().add(p1);
        Biblioteca.getListaprestamo().add(p2);
         System.out.println(Biblioteca.getListaprestamo());



    }

}
