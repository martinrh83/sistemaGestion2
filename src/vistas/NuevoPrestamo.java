/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NuevoPrestamo.java
 *
 * Created on 28/09/2013, 01:18:34
 */

package vistas;

import biblioteca1.Biblioteca;
import biblioteca1.Cliente;
import biblioteca1.Fecha;
import biblioteca1.Libro;
import biblioteca1.Prestamo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mariano
 */
public class NuevoPrestamo extends javax.swing.JDialog {
int i=0;
private Cliente prestamocliente=new Cliente();
private ArrayList<Libro>prestamolibro=new ArrayList<Libro>();
private Prestamo prestamo;
int posi_libro;
int posi_cliente;


    /** Creates new form NuevoPrestamo */
    public NuevoPrestamo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        txtfecha.setText(new Fecha().toString());
        txtfecha.setEnabled(false);
        btnGuardar.setEnabled(false);
        limpiar();
        bloquear();
        visualizar();
  
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        btnbuscarc = new javax.swing.JButton();
        btnok = new javax.swing.JButton();
        btnAceptarC = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcodigolibro = new javax.swing.JTextField();
        txtnombrelibro = new javax.swing.JTextField();
        txtisbn = new javax.swing.JTextField();
        btnbuscarl = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPrestamo = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Fecha");

        txtfecha.setText("jTextField1");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        jLabel3.setText("DNI");

        jLabel4.setText("Nombre");

        jLabel5.setText("Apellido");

        txtdni.setText("jTextField1");
        txtdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdniActionPerformed(evt);
            }
        });

        txtnombre.setText("jTextField1");

        txtapellido.setText("jTextField1");

        btnbuscarc.setText("Buscar");
        btnbuscarc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarcActionPerformed(evt);
            }
        });

        btnok.setText("Limpiar");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        btnAceptarC.setText("Aceptar");
        btnAceptarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtapellido, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(txtdni, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addComponent(btnbuscarc)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btnAceptarC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(btnok)
                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscarc))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnok)
                    .addComponent(btnAceptarC)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Libro"));

        jLabel6.setText("Codigo");

        jLabel7.setText("Nombre");

        jLabel8.setText("ISBN");

        txtcodigolibro.setText("jTextField1");

        txtnombrelibro.setText("jTextField1");

        txtisbn.setText("jTextField1");

        btnbuscarl.setText("Buscar");
        btnbuscarl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarlActionPerformed(evt);
            }
        });

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        jButton2.setText("Aceptar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtisbn, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addComponent(txtnombrelibro, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtcodigolibro, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)))
                .addGap(23, 23, 23)
                .addComponent(btnbuscarl)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnagregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(71, 71, 71))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtcodigolibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscarl))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtnombrelibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtisbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregar)
                    .addComponent(jButton2))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

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

        jButton4.setText("Volver");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(btnGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdniActionPerformed

    private void btnbuscarcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarcActionPerformed


        try {
            int codigo=Integer.parseInt(txtdni.getText());
             posi_cliente=Biblioteca.buscarCliente(codigo);
            if(posi_cliente==-1)
            {
            JOptionPane.showMessageDialog(this, "Cliente no registrado");}
 else
            {


    txtnombre.setText(Biblioteca.getListacliente().get(posi_cliente).getNombre());
                txtapellido.setText(Biblioteca.getListacliente().get(posi_cliente).getApellido());
                habilitar();
         
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }



    }//GEN-LAST:event_btnbuscarcActionPerformed

    private void btnbuscarlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarlActionPerformed

        try {
            int codigo=Integer.parseInt(txtcodigolibro.getText());
             posi_libro=Biblioteca.buscarlibro(codigo);
            if(posi_libro==-1)
            {
            JOptionPane.showMessageDialog(this, "Libro no registrado");}
 else
            {

                txtnombrelibro.setText(Biblioteca.getListalibro().get(posi_libro).getNombre());
                txtisbn.setText(Biblioteca.getListalibro().get(posi_libro).getIsbn());

                habilitarlibro();
            }
        }
        catch (Exception h){}

   // TODO add your handling code here:
    }//GEN-LAST:event_btnbuscarlActionPerformed

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
limpiar();
    }//GEN-LAST:event_btnokActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed

agregarlibro(Biblioteca.getListalibro().get(posi_libro));
JOptionPane.showMessageDialog(this, "Libro agregado a prestamo");
bloquear();


    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnAceptarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarCActionPerformed
                prestamocliente=Biblioteca.getListacliente().get(posi_cliente);
                prestamo= new Prestamo(prestamocliente,null,i++,new Fecha());
                JOptionPane.showMessageDialog(this, "Cliente Agregado");
               // System.out.println(prestamo);
    }//GEN-LAST:event_btnAceptarCActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
prestamo.setLibros(prestamolibro);
JOptionPane.showMessageDialog(this, "Libros Agregados");
btnGuardar.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
     Biblioteca.getListaprestamo().add(prestamo);
     JOptionPane.showMessageDialog(this, "Prestamo Registrado");
     System.out.println(prestamo);
     prestamolibro =new ArrayList<Libro>();
     visualizar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NuevoPrestamo dialog = new NuevoPrestamo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAceptarC;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnbuscarc;
    private javax.swing.JButton btnbuscarl;
    private javax.swing.JButton btnok;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPrestamo;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcodigolibro;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtisbn;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnombrelibro;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        txtapellido.setText("");
        txtnombre.setText("");
        txtcodigolibro.setText("");
        txtdni.setText("");
        txtisbn.setText("");
        txtnombrelibro.setText("");
    }

    private void bloquear() {
       txtnombre.setEnabled(false);
       txtapellido.setEnabled(false);
       btnok.setEnabled(false);
       txtnombrelibro.setEnabled(false);
       txtisbn.setEnabled(false);
       btnagregar.setEnabled(false);


    }

  private void habilitar(){
       txtnombre.setEnabled(true);
       txtapellido.setEnabled(true);
       btnok.setEnabled(true);
  }

    private void habilitarlibro() {
        txtnombrelibro.setEnabled(true);
        txtisbn.setEnabled(true);
        btnagregar.setEnabled(true);
    }

  private void visualizar() {
        DefaultTableModel datos=new DefaultTableModel();
        datos.addColumn("Fecha");
        datos.addColumn("Cliente");
        datos.addColumn("CodigoP");
        datos.addColumn("Libros");

      for(int i=0;i<Biblioteca.getListaprestamo().size();i++)
        { String libros="";
          for(int k=0;k<Biblioteca.getListaprestamo().get(i).getLibros().size();k++){

          libros= libros+Biblioteca.getListaprestamo().get(i).getLibros().get(k).getNombre()+",";
            }

          Object[] fila = new Object[]{
        Biblioteca.getListaprestamo().get(i).getFecha().toString(),
        Biblioteca.getListaprestamo().get(i).getCliente().getApellido(),
        Biblioteca.getListaprestamo().get(i).getCodigo(),
        libros



        };
        datos.addRow(fila);



        }
        tblPrestamo.setModel(datos);

    }
    

    private void agregarlibro(Libro libro) {
     
        prestamolibro.add(libro);
      

    }


}
