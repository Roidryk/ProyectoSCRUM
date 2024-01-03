/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import DAO.DAOTrabajador;
import Entidades.Trabajador;
import Vistas.Vistas.InterfazPrincipal_1;
/**
 *
 * @author Administrador
 */
public class InterfazAñadirTrabajador extends javax.swing.JFrame {
private InterfazPrincipal_1 interfazPrincipal;

    public InterfazAñadirTrabajador(InterfazPrincipal_1 interfazPrincipal) {
        initComponents();
        this.interfazPrincipal = interfazPrincipal;
    }
    /**
     * Creates new form InterfazAñadirTrabajador
     */
    public InterfazAñadirTrabajador() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNuevoDNI = new javax.swing.JTextField();
        txtNuevoNombre = new javax.swing.JTextField();
        txtNuevoApellidos = new javax.swing.JTextField();
        txtNuevoSueldo = new javax.swing.JTextField();
        txtNuevoDia = new javax.swing.JTextField();
        txtAñadirMatricula = new javax.swing.JTextField();
        txtNuevoMes = new javax.swing.JTextField();
        txtNuevoAño = new javax.swing.JTextField();
        btnNuevoAceptar = new javax.swing.JButton();
        btnNuevoCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Añadir Nuevo Trabajador");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setText("DNI:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellidos:");

        jLabel5.setText("Sueldo:");

        jLabel6.setText("Fecha:");

        jLabel7.setText("Matrícula:");

        txtNuevoDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevoDNIActionPerformed(evt);
            }
        });

        txtNuevoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevoNombreActionPerformed(evt);
            }
        });

        txtNuevoApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevoApellidosActionPerformed(evt);
            }
        });

        txtNuevoSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevoSueldoActionPerformed(evt);
            }
        });

        txtNuevoDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevoDiaActionPerformed(evt);
            }
        });

        txtAñadirMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAñadirMatriculaActionPerformed(evt);
            }
        });

        txtNuevoMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevoMesActionPerformed(evt);
            }
        });

        txtNuevoAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevoAñoActionPerformed(evt);
            }
        });

        btnNuevoAceptar.setText("Aceptar");
        btnNuevoAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoAceptarActionPerformed(evt);
            }
        });

        btnNuevoCancelar.setText("Cancelar");
        btnNuevoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevoAceptar)
                        .addGap(58, 58, 58)
                        .addComponent(btnNuevoCancelar))
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNuevoSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNuevoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(54, 54, 54)
                            .addComponent(txtNuevoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNuevoDia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNuevoMes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNuevoAño, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtAñadirMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtNuevoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtNuevoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtNuevoSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNuevoDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNuevoMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNuevoAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(txtAñadirMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoAceptar)
                    .addComponent(btnNuevoCancelar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoAceptarActionPerformed
        // TODO add your handling code here:
          Trabajador p = new Trabajador(
            txtNuevoDNI.getText(),
            txtNuevoNombre.getText(),
            txtNuevoApellidos.getText(),
            Double.parseDouble(txtNuevoSueldo.getText()),
            Integer.parseInt(txtNuevoDia.getText()),
            Integer.parseInt(txtNuevoMes.getText()),
            Integer.parseInt(txtNuevoAño.getText()),
            txtAñadirMatricula.getText()
    );

   
        DAOTrabajador  dp = new DAOTrabajador();
    dp.add(p);

 
    txtNuevoDNI.setText(null);
    txtNuevoNombre.setText(null);
    txtNuevoApellidos.setText(null);
    txtNuevoSueldo.setText(null);
    txtNuevoDia.setText(null);
    txtNuevoMes.setText(null);
    txtNuevoAño.setText(null);
    txtAñadirMatricula.setText(null);
    interfazPrincipal.actualizartabla();
    }//GEN-LAST:event_btnNuevoAceptarActionPerformed

    private void btnNuevoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnNuevoCancelarActionPerformed

    private void txtNuevoDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevoDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevoDNIActionPerformed

    private void txtNuevoAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevoAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevoAñoActionPerformed

    private void txtNuevoMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevoMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevoMesActionPerformed

    private void txtNuevoDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevoDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevoDiaActionPerformed

    private void txtNuevoSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevoSueldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevoSueldoActionPerformed

    private void txtNuevoApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevoApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevoApellidosActionPerformed

    private void txtNuevoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevoNombreActionPerformed

    private void txtAñadirMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAñadirMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAñadirMatriculaActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazAñadirTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazAñadirTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazAñadirTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazAñadirTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazAñadirTrabajador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevoAceptar;
    private javax.swing.JButton btnNuevoCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAñadirMatricula;
    private javax.swing.JTextField txtNuevoApellidos;
    private javax.swing.JTextField txtNuevoAño;
    private javax.swing.JTextField txtNuevoDNI;
    private javax.swing.JTextField txtNuevoDia;
    private javax.swing.JTextField txtNuevoMes;
    private javax.swing.JTextField txtNuevoNombre;
    private javax.swing.JTextField txtNuevoSueldo;
    // End of variables declaration//GEN-END:variables
}
