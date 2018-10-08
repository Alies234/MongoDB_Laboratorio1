/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Logica.MongoConnection;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

/**
 *
 * @author Daniel
 */
public class dCompania extends javax.swing.JFrame {

    /**
     * Creates new form dCompania
     */
    public dCompania() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_nombrePelicula = new javax.swing.JLabel();
        jLabel_nombreDirector = new javax.swing.JLabel();
        jLabel_genero = new javax.swing.JLabel();
        jTextField_nombreCompania = new javax.swing.JTextField();
        jTextField_anio = new javax.swing.JTextField();
        jTextField_paginaWeb = new javax.swing.JTextField();
        jButton_Buscar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton_Borrar = new javax.swing.JButton();
        jButton_Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_nombrePelicula.setText("Nombre de la compañia:");

        jLabel_nombreDirector.setText("Año de la fundación:");

        jLabel_genero.setText("Sitio web oficial:");

        jButton_Buscar.setText("Filtrar");
        jButton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscarActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre compañia", "Año", "Sitio web"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable2.setAutoscrolls(false);
        jScrollPane3.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMinWidth(120);
            jTable2.getColumnModel().getColumn(1).setMinWidth(120);
            jTable2.getColumnModel().getColumn(2).setMinWidth(120);
        }

        jButton_Borrar.setText("Borrar");
        jButton_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BorrarActionPerformed(evt);
            }
        });

        jButton_Back.setText("...");
        jButton_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_nombrePelicula)
                    .addComponent(jLabel_genero)
                    .addComponent(jLabel_nombreDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_paginaWeb, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(jTextField_anio)
                    .addComponent(jTextField_nombreCompania)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                        .addComponent(jButton_Borrar)
                        .addGap(167, 167, 167))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_nombreCompania, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_nombrePelicula))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_nombreDirector))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_paginaWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_genero))))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Buscar)
                    .addComponent(jButton_Borrar)
                    .addComponent(jButton_Back))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscarActionPerformed
        Document doc = createDBObjectCompania();
        MongoConnection MC = new MongoConnection();
        List<Document> F = null;
        if (doc == null) {
            F = MC.leerTodoCompania();
        } else {
            F = MC.leerCompania(doc);
        }

        DefaultTableModel dfm = (DefaultTableModel) jTable2.getModel();

        int filas = dfm.getRowCount();
        for (int i = 1; i <= filas; i++) {
            dfm.removeRow(0);
        }

        for (Document docs : F) {
            dfm.addRow(new Object[]{docs.getString("nombreCompania"), docs.getInteger("añoFundacion"), docs.getString("paginaOficial")});

        }
    }//GEN-LAST:event_jButton_BuscarActionPerformed

    private void jButton_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BorrarActionPerformed
        int row = jTable2.getSelectedRow();

        if (row != -1) {

            MongoConnection MC = new MongoConnection();
            if (jTable2.getValueAt(row, 2) == null) {

                Document D = createDBObjectCompania((String) jTable2.getValueAt(row, 0),
                        (int) jTable2.getValueAt(row, 1), "");

                MC.borrarCompania(D);
            } else {
                Document D = createDBObjectCompania((String) jTable2.getValueAt(row, 0),
                        (int) jTable2.getValueAt(row, 1), (String) jTable2.getValueAt(row, 2));

                MC.borrarCompania(D);
            }
            JOptionPane.showMessageDialog(rootPane, "Se elimino la pelicula");
            refrescar();

        } else {
            JOptionPane.showMessageDialog(rootPane, "Error: Selecione una fila");
        }
    }//GEN-LAST:event_jButton_BorrarActionPerformed

    private void jButton_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackActionPerformed
        CompaniaInterfaz CI = new CompaniaInterfaz();
        CI.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_BackActionPerformed

    private void refrescar() {
        MongoConnection MC = new MongoConnection();
        List<Document> F = null;

        F = MC.leerTodoCompania();

        DefaultTableModel dfm = (DefaultTableModel) jTable2.getModel();

        int filas = dfm.getRowCount();
        for (int i = 1; i <= filas; i++) {
            dfm.removeRow(0);
        }

        for (Document docs : F) {
            dfm.addRow(new Object[]{docs.getString("nombreCompania"), docs.getInteger("añoFundacion"), docs.getString("paginaOficial")});
        }
    }

    private Document createDBObjectCompania() {
        Document docBuilder = new Document();
        boolean entre = false;
        if (jTextField_nombreCompania.getText().equals("") == false) {
            docBuilder.append("nombreCompania", jTextField_nombreCompania.getText());
            entre = true;
        }
        if (jTextField_anio.getText().equals("") == false) {
            docBuilder.append("añoFundacion", Integer.parseInt(jTextField_anio.getText()));
            entre = true;
        }
        if (jTextField_paginaWeb.getText().equals("") == false) {
            docBuilder.append("paginaOficial", jTextField_paginaWeb.getText());
            entre = true;
        }

        if (entre) {
            return docBuilder;
        }
        return null;

    }//Fin del metodo leerDBObjectPelicula

    private Document createDBObjectCompania(String nombreCompania, int anio, String web) {
        Document docBuilder = new Document();

        docBuilder.append("nombreCompania", nombreCompania);
        docBuilder.append("añoFundacion", anio);

        if (web.equals("") == false) {
            docBuilder.append("paginaOficial", web);
        }

        return docBuilder;
    }//Fin del metodo leerDBObjectPelicula    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dCompania.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dCompania.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dCompania.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dCompania.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dCompania().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Back;
    private javax.swing.JButton jButton_Borrar;
    private javax.swing.JButton jButton_Buscar;
    private javax.swing.JLabel jLabel_genero;
    private javax.swing.JLabel jLabel_nombreDirector;
    private javax.swing.JLabel jLabel_nombrePelicula;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField_anio;
    private javax.swing.JTextField jTextField_nombreCompania;
    private javax.swing.JTextField jTextField_paginaWeb;
    // End of variables declaration//GEN-END:variables
}
