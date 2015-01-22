/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Mostrar.java
 *
 * Created on 28/09/2013, 01:19:23
 */

package vistas;

import biblioteca1.Biblioteca;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mariano
 */
public class Mostrar extends javax.swing.JDialog {

    /** Creates new form Mostrar */
    public Mostrar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        visualizar();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPrestamo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblPrestamo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblPrestamo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Mostrar dialog = new Mostrar(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPrestamo;
    // End of variables declaration//GEN-END:variables

     private void visualizar() {
        DefaultTableModel datos=new DefaultTableModel();
        datos.addColumn("Fecha");
        datos.addColumn("Cliente");
        datos.addColumn("CodigoP");
        datos.addColumn("Libros");

      for(int i=0;i<Biblioteca.getListaprestamo().size();i++)
        { String libros="";
          for(int k=0;k<Biblioteca.getListaprestamo().get(i).getLibros().size();k++){

          libros= libros+ Biblioteca.getListaprestamo().get(i).getLibros().get(k).getNombre()+",";
            }
      
          Object[] fila = new Object[]{
        Biblioteca.getListaprestamo().get(i).getFecha().toString(),
        Biblioteca.getListaprestamo().get(i).getCliente().getApellido()+" "+Biblioteca.getListaprestamo().get(i).getCliente().getNombre(),
        Biblioteca.getListaprestamo().get(i).getCodigo(),
        libros
        


        };
        datos.addRow(fila);



        }
        tblPrestamo.setModel(datos);

    }

    }



