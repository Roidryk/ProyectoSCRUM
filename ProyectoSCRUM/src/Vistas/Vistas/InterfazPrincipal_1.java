/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas.Vistas;

import Conexion.ConexionBD;
import DAO.DAOTrabajador;
import Entidades.Trabajador;
import Vistas.InterfazAñadirTrabajador;
import Vistas.interfazFiltrarTrabajador;
import Vistas.interfazModificarTrabajador;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class InterfazPrincipal_1 extends javax.swing.JFrame {

    public InterfazPrincipal_1() {
        initComponents();
        tablaTrabajadores = new JTable();
        jScrollPane1.setViewportView(tablaTrabajadores);
        llenarTabla();
        actualizarNumeroTrabajadores();
        actualizarSueldoMedio();
    }

    void actualizarNumeroTrabajadores() {
        DAOTrabajador daoTrabajador = new DAOTrabajador();
        int numeroTrabajadores = obtenerNumeroTrabajadores(daoTrabajador);
        txtNumeroTrabajadores.setText(String.valueOf(numeroTrabajadores));
    }

    private int obtenerNumeroTrabajadores(DAOTrabajador daoTrabajador) {
        int numeroTrabajadores = 0;
        ArrayList<Trabajador> trabajadores = daoTrabajador.get();

        if (trabajadores != null) {
            numeroTrabajadores = trabajadores.size();
        }

        return numeroTrabajadores;
    }

    void actualizarSueldoMedio() {
        DAOTrabajador daoTrabajador = new DAOTrabajador();
        double sueldoMedio = obtenerSueldoMedio(daoTrabajador);
        txtSueldoMedio.setText(String.format("%.2f", sueldoMedio));
    }

    private double obtenerSueldoMedio(DAOTrabajador daoTrabajador) {
        double sueldoMedio = 0;
        ArrayList<Trabajador> trabajadores = daoTrabajador.get();

        if (trabajadores != null && !trabajadores.isEmpty()) {
            double sumaSueldos = 0;

            for (Trabajador trabajador : trabajadores) {
                sumaSueldos += trabajador.getSueldo();
            }

            sueldoMedio = sumaSueldos / trabajadores.size();
        }

        return sueldoMedio;
    }

    public void actualizartabla() {
        llenarTabla();
    }

    void llenarTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("DNI");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Sueldo");
        modelo.addColumn("Fecha");
        modelo.addColumn("Matricula");

        DAOTrabajador p = new DAOTrabajador();
        ArrayList<Trabajador> listado = p.get();
        for (Trabajador trabajador : listado) {
            ArrayList fila = new ArrayList();
            fila.add(trabajador.getDNI());
            fila.add(trabajador.getNombre());
            fila.add(trabajador.getApellidos());
            fila.add(trabajador.getSueldo());
            fila.add(trabajador.getFechaDia() + "/" + trabajador.getFechaMes() + "/" + trabajador.getFechaAno());
            fila.add(trabajador.getMatricula());

            modelo.addRow(fila.toArray());
        }
        tablaTrabajadores.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTrabajadores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEliminarTrabajador = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnFiltrar = new javax.swing.JButton();
        txtNumeroTrabajadores = new javax.swing.JTextField();
        txtSueldoMedio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaTrabajadores.setAutoCreateColumnsFromModel(false);
        tablaTrabajadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "DNI", "Nombre", "Apellidos", "Sueldo", "Fecha", "Title 6"
            }
        ));
        jScrollPane1.setViewportView(tablaTrabajadores);

        jLabel1.setText("NºTrabajadores:");

        jLabel2.setText("Sueldo Medio:");

        jLabel3.setText("Acciones");

        btnEliminarTrabajador.setText("Eliminar Trabajador");
        btnEliminarTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTrabajadorActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        txtNumeroTrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroTrabajadoresActionPerformed(evt);
            }
        });

        txtSueldoMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoMedioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btnEliminarTrabajador)
                                .addGap(18, 18, 18)
                                .addComponent(btnNuevo)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFiltrar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtNumeroTrabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtSueldoMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtSueldoMedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtNumeroTrabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarTrabajador)
                    .addComponent(btnNuevo)
                    .addComponent(btnModificar)
                    .addComponent(btnFiltrar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroTrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroTrabajadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroTrabajadoresActionPerformed

    private void txtSueldoMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoMedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSueldoMedioActionPerformed

    private void btnEliminarTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTrabajadorActionPerformed
        // TODO add your handling code here:
        int filsel;
        String dni = "";
        int resp;
        try {
            filsel = tablaTrabajadores.getSelectedRow();
            if (filsel == -1) {
                JOptionPane.showMessageDialog(null, "Debes seleccionar el trabajador a borrar");
            } else {
                resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el trabajador seleccionado?",
                        "Eliminar", JOptionPane.YES_NO_OPTION);

                if (resp == JOptionPane.YES_OPTION) {
                    DefaultTableModel m = (DefaultTableModel) tablaTrabajadores.getModel();
                    dni = (String) m.getValueAt(filsel, 0);
                    Trabajador p = new Trabajador(dni);
                    DAOTrabajador dp = new DAOTrabajador();
                    dp.delete(p);
                    llenarTabla();
                    actualizarNumeroTrabajadores();
                    actualizarSueldoMedio();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el trabajador");
            llenarTabla();
        }
    }//GEN-LAST:event_btnEliminarTrabajadorActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        InterfazAñadirTrabajador nuevo = new InterfazAñadirTrabajador(this);
        nuevo.setVisible(true);
        llenarTabla();
        actualizarNumeroTrabajadores();
        actualizarSueldoMedio();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        int selectedRow = tablaTrabajadores.getSelectedRow();
        if (selectedRow != -1) {
            
            String dni = tablaTrabajadores.getValueAt(selectedRow, 0).toString();
            String nombre = tablaTrabajadores.getValueAt(selectedRow, 1).toString();
            String apellidos = tablaTrabajadores.getValueAt(selectedRow, 2).toString();
            double sueldo = Double.parseDouble(tablaTrabajadores.getValueAt(selectedRow, 3).toString());
            String fechaString = tablaTrabajadores.getValueAt(selectedRow, 4).toString();
            String matricula = tablaTrabajadores.getValueAt(selectedRow, 5).toString();

            
            String[] partesFecha = fechaString.split("/");
            if (partesFecha.length == 3) {
                int dia = Integer.parseInt(partesFecha[0]);
                int mes = Integer.parseInt(partesFecha[1]);
                int año = Integer.parseInt(partesFecha[2]);

                
                Trabajador selectedTrabajador = new Trabajador(dni, nombre, apellidos, sueldo, dia, mes, año, matricula);

              
                interfazModificarTrabajador modificarTrabajador = new interfazModificarTrabajador(this, selectedTrabajador);
                modificarTrabajador.setVisible(true);
            }
        } else {
          
            JOptionPane.showMessageDialog(this, "selecciona una fila para modificar.", "Error", JOptionPane.ERROR_MESSAGE);

            /*interfazModificarTrabajador modificar = new interfazModificarTrabajador();
        modificar.setVisible(true);*/
    }//GEN-LAST:event_btnModificarActionPerformed
    }
    
    public void actualizarTablaConConsulta(String consulta) throws SQLException {
            try {
            
       
		DAOTrabajador daoTrabajador = new DAOTrabajador();

		// Obtén los trabajadores según la consulta SQL
		List<Trabajador> trabajadoresFiltrados = daoTrabajador.filtrarTrabajadoresConConsulta(consulta);

		// Actualiza la tabla con los resultados
		DefaultTableModel model = (DefaultTableModel) tablaTrabajadores.getModel();
		model.setRowCount(0);

		for (Trabajador trabajador : trabajadoresFiltrados) {
			Object[] row = { trabajador.getDNI(), trabajador.getNombre(), trabajador.getApellidos(),
					trabajador.getSueldo(), trabajador.getFechaDia() + "/" + trabajador.getFechaMes() + "/" + trabajador.getFechaAno(), trabajador.getMatricula() };
			model.addRow(row);
		} 
            } catch (SQLException e) {
            }
	}
    
    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        // TODO add your handling code here:
        interfazFiltrarTrabajador filtrar = new interfazFiltrarTrabajador();
        filtrar.setVisible(true);
    }//GEN-LAST:event_btnFiltrarActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazPrincipal_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarTrabajador;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaTrabajadores;
    private javax.swing.JTextField txtNumeroTrabajadores;
    private javax.swing.JTextField txtSueldoMedio;
    // End of variables declaration//GEN-END:variables
}
