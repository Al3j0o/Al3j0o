/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;


import BACO.*;

/**
 *
 * @author Al3jo
 */
public class SeleccionSesión extends javax.swing.JFrame {

    public SeleccionSesión() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Boton_admin = new javax.swing.JButton();
        Boton_proveedor = new javax.swing.JButton();
        Boton_cliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 0, 36)); // NOI18N
        jLabel1.setText("Bienvenido a sandwiches BACO");

        jLabel2.setFont(new java.awt.Font("SimSun-ExtB", 0, 14)); // NOI18N
        jLabel2.setText("Seleccione su perfil");

        Boton_admin.setFont(new java.awt.Font("SimSun-ExtB", 0, 14)); // NOI18N
        Boton_admin.setText("Administrador");
        Boton_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_adminMouseClicked(evt);
            }
        });
        Boton_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_adminActionPerformed(evt);
            }
        });

        Boton_proveedor.setFont(new java.awt.Font("SimSun-ExtB", 0, 14)); // NOI18N
        Boton_proveedor.setText("Proveedor");
        Boton_proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_proveedorMouseClicked(evt);
            }
        });
        Boton_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_proveedorActionPerformed(evt);
            }
        });

        Boton_cliente.setFont(new java.awt.Font("SimSun-ExtB", 0, 14)); // NOI18N
        Boton_cliente.setText("Cliente");
        Boton_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_clienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Boton_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Boton_admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Boton_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addComponent(Boton_admin)
                .addGap(32, 32, 32)
                .addComponent(Boton_proveedor)
                .addGap(30, 30, 30)
                .addComponent(Boton_cliente)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_adminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton_adminActionPerformed

    private void Boton_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_proveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton_proveedorActionPerformed

    private void Boton_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_adminMouseClicked
        // TODO add your handling code here:
        SesionAdmin sesion=new SesionAdmin();
        sesion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Boton_adminMouseClicked

    private void Boton_proveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_proveedorMouseClicked
        // TODO add your handling code here:
        SesionProv sesion=new SesionProv();
        sesion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Boton_proveedorMouseClicked

    private void Boton_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_clienteMouseClicked
        // TODO add your handling code here:
        SesionCli sesion=new SesionCli();
        sesion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Boton_clienteMouseClicked

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
            java.util.logging.Logger.getLogger(SeleccionSesión.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeleccionSesión.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeleccionSesión.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeleccionSesión.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeleccionSesión().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_admin;
    private javax.swing.JButton Boton_cliente;
    private javax.swing.JButton Boton_proveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
