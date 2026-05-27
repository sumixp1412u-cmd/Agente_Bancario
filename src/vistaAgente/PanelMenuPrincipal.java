/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistaAgente;
import javax.swing.JPanel;
/**
 *
 * @author USER
 */
public class PanelMenuPrincipal extends javax.swing.JPanel {

    private Vista vista;
    
    public PanelMenuPrincipal(Vista vista) {
    initComponents();
    this.vista = vista;
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        btnDeposito = new javax.swing.JButton();
        btnRetiro = new javax.swing.JButton();
        btnTransferencia = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        PanelCentro = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 153));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 136, 740, 10));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("AGENTE BANCARIO");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 56, 217, -1));

        btnDeposito.setText("Deposito");
        btnDeposito.addActionListener(this::btnDepositoActionPerformed);
        add(btnDeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 228, -1, -1));

        btnRetiro.setText("Retiro");
        btnRetiro.addActionListener(this::btnRetiroActionPerformed);
        add(btnRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 269, -1, -1));

        btnTransferencia.setText("Transferencia");
        btnTransferencia.addActionListener(this::btnTransferenciaActionPerformed);
        add(btnTransferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        btnConsultar.setText("Consultar saldo");
        btnConsultar.addActionListener(this::btnConsultarActionPerformed);
        add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 351, -1, -1));

        btnCerrarSesion.setText("Cerrar sesion");
        btnCerrarSesion.addActionListener(this::btnCerrarSesionActionPerformed);
        add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, -1, -1));

        PanelCentro.setForeground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout PanelCentroLayout = new javax.swing.GroupLayout(PanelCentro);
        PanelCentro.setLayout(PanelCentroLayout);
        PanelCentroLayout.setHorizontalGroup(
            PanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        PanelCentroLayout.setVerticalGroup(
            PanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        add(PanelCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 560, 530));

        jButton1.setText("Registrar cliente");
        jButton1.addActionListener(this::jButton1ActionPerformed);
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositoActionPerformed
        mostrarPanelCentro(new panelDeposito(vista));
    }//GEN-LAST:event_btnDepositoActionPerformed

    private void btnRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiroActionPerformed
        mostrarPanelCentro(new panelRetiro(vista));
    }//GEN-LAST:event_btnRetiroActionPerformed

    private void btnTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferenciaActionPerformed
      mostrarPanelCentro(new panelTransferencia(vista));
    }//GEN-LAST:event_btnTransferenciaActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        mostrarPanelCentro(new panelConsultarSaldo(vista));
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
       vista.mostrarPanelInicio(new PanelInicio(vista));
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mostrarPanelCentro(new panelRegistrarCliente(vista));
    }//GEN-LAST:event_jButton1ActionPerformed
     
    
    public void mostrarPanelCentro(JPanel panel) {
    panel.setSize(PanelCentro.getWidth(), PanelCentro.getHeight());
    panel.setLocation(0, 0);

    PanelCentro.removeAll();
    PanelCentro.add(panel);
    PanelCentro.revalidate();
    PanelCentro.repaint();
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCentro;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnDeposito;
    private javax.swing.JButton btnRetiro;
    private javax.swing.JButton btnTransferencia;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
