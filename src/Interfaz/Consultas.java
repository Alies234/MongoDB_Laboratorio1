/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Logica.MongoConnection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

/**
 *
 * @author Daniel
 */
public class Consultas extends javax.swing.JFrame {

    /**
     * Creates new form Consultas
     */
    public Consultas() {
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

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField_franquicia = new javax.swing.JTextField();
        jTextField_minutos = new javax.swing.JTextField();
        jLabel_companíaProductora = new javax.swing.JLabel();
        jLabel_nombrePelicula = new javax.swing.JLabel();
        jTextField_anio = new javax.swing.JTextField();
        jTextField_companíaProductora = new javax.swing.JTextField();
        jLabel_franquicia = new javax.swing.JLabel();
        jTextField_nombrePelicula = new javax.swing.JTextField();
        jLabel_minutos = new javax.swing.JLabel();
        jLabel_anio = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton_consultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre pelicula", "Nombre director", "Genero", "Pais", "Franquicia", "Compañia productora", "Año", "Minutos", "Actores"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
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
            jTable2.getColumnModel().getColumn(3).setMinWidth(120);
            jTable2.getColumnModel().getColumn(4).setMinWidth(120);
            jTable2.getColumnModel().getColumn(5).setMinWidth(120);
            jTable2.getColumnModel().getColumn(6).setMinWidth(120);
            jTable2.getColumnModel().getColumn(7).setMinWidth(120);
            jTable2.getColumnModel().getColumn(8).setMinWidth(1000);
        }

        jTextField_franquicia.setEditable(false);

        jTextField_minutos.setEditable(false);

        jLabel_companíaProductora.setText("Compañia productora:");

        jLabel_nombrePelicula.setText("Nombre de la pelicula:");

        jTextField_anio.setEditable(false);

        jTextField_companíaProductora.setEditable(false);

        jLabel_franquicia.setText("Franquicia:");

        jLabel_minutos.setText("Hasta el año:");

        jLabel_anio.setText("Del año:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consulta A", "Consulta B", "Consulta C", "Consulta D", "Consulta E" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton_consultar.setText("Consultar");
        jButton_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_consultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_companíaProductora)
                            .addComponent(jLabel_anio))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField_anio, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel_minutos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_minutos))
                            .addComponent(jTextField_companíaProductora)))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_franquicia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_franquicia, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_nombrePelicula)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_nombrePelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(376, 376, 376)
                .addComponent(jButton_consultar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_nombrePelicula)
                            .addComponent(jTextField_nombrePelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel_franquicia)
                                    .addComponent(jTextField_franquicia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_companíaProductora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_companíaProductora))))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_anio)
                            .addComponent(jTextField_anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_minutos)
                            .addComponent(jTextField_minutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jButton_consultar)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedItem().toString().equals("Consulta A")) {

            jTextField_nombrePelicula.setEditable(true);
            jTextField_franquicia.setEditable(false);
            jTextField_companíaProductora.setEditable(false);
            jTextField_anio.setEditable(false);
            jTextField_minutos.setEditable(false);

        } else if (jComboBox1.getSelectedItem().toString().equals("Consulta B")) {

            jTextField_nombrePelicula.setEditable(false);
            jTextField_franquicia.setEditable(true);
            jTextField_companíaProductora.setEditable(false);
            jTextField_anio.setEditable(false);
            jTextField_minutos.setEditable(false);

        } else if (jComboBox1.getSelectedItem().toString().equals("Consulta C")) {

            jTextField_nombrePelicula.setEditable(false);
            jTextField_franquicia.setEditable(false);
            jTextField_companíaProductora.setEditable(false);
            jTextField_anio.setEditable(true);
            jTextField_minutos.setEditable(true);

        }else if (jComboBox1.getSelectedItem().toString().equals("Consulta D")) {

            jTextField_nombrePelicula.setEditable(false);
            jTextField_franquicia.setEditable(false);
            jTextField_companíaProductora.setEditable(true);
            jTextField_anio.setEditable(false);
            jTextField_minutos.setEditable(false);

        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_consultarActionPerformed

        Document d = new Document();
        List<Document> resultado = new ArrayList<>();
        MongoConnection MC = new MongoConnection();
        if (jComboBox1.getSelectedItem().toString().equals("Consulta A")) {

            d.append("nombrePelicula", jTextField_nombrePelicula.getText());
            resultado = MC.leerPelicula(d);
            jTextField_nombrePelicula.setText("");

        } else if (jComboBox1.getSelectedItem().toString().equals("Consulta B")) {

            d.append("franquicia", jTextField_franquicia.getText());
            resultado = MC.leerPelicula(d);
            jTextField_franquicia.setText("");

        } else if (jComboBox1.getSelectedItem().toString().equals("Consulta C")) {

            Document Fechas = new Document();

            Fechas.append("$gt", Integer.parseInt(jTextField_anio.getText()));
            Fechas.append("$lt", Integer.parseInt(jTextField_minutos.getText()));

            d.append("año", Fechas);
            resultado = MC.leerPelicula(d);
            jTextField_minutos.setText("");
            jTextField_anio.setText("");

        } 

        DefaultTableModel dfm = (DefaultTableModel) jTable2.getModel();

        int filas = dfm.getRowCount();
        for (int i = 1; i <= filas; i++) {
            dfm.removeRow(0);
        }

        for (Document docs : resultado) {
            dfm.addRow(new Object[]{docs.getString("nombrePelicula"), docs.getString("nombreDirector"), docs.getString("genero"),
                docs.getString("paisDeProduccion"), docs.getString("franquicia"), docs.getString("companíaProductora"),
                docs.getInteger("año"), docs.getInteger("minutos"), docs.get("actores").toString()});
        }
    }//GEN-LAST:event_jButton_consultarActionPerformed

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
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_consultar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel_anio;
    private javax.swing.JLabel jLabel_companíaProductora;
    private javax.swing.JLabel jLabel_franquicia;
    private javax.swing.JLabel jLabel_minutos;
    private javax.swing.JLabel jLabel_nombrePelicula;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField_anio;
    private javax.swing.JTextField jTextField_companíaProductora;
    private javax.swing.JTextField jTextField_franquicia;
    private javax.swing.JTextField jTextField_minutos;
    private javax.swing.JTextField jTextField_nombrePelicula;
    // End of variables declaration//GEN-END:variables
}