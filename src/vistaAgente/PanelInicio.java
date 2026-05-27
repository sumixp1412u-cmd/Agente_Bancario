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
public class PanelInicio extends javax.swing.JPanel {

   private Vista vista;

    public PanelInicio(Vista vista) {
        initComponents();
        this.vista = vista;
    }
    


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JbAgenteBancario = new javax.swing.JLabel();
        IniciarSesion = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();

        setForeground(new java.awt.Color(153, 153, 255));

        JbAgenteBancario.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        JbAgenteBancario.setText("Agente Bancario");

        IniciarSesion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        IniciarSesion.setText("Iniciar sesion");
        IniciarSesion.addActionListener(this::IniciarSesionActionPerformed);

        btnRegistrarse.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.addActionListener(this::btnRegistrarseActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(JbAgenteBancario, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(IniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addComponent(btnRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(JbAgenteBancario)
                .addGap(168, 168, 168)
                .addComponent(IniciarSesion)
                .addGap(31, 31, 31)
                .addComponent(btnRegistrarse)
                .addContainerGap(274, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSesionActionPerformed
       vista.mostrarPanelInicio(new PanelIniciarSesion(vista));
    }//GEN-LAST:event_IniciarSesionActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        vista.mostrarPanelInicio(new PanelRegistrarse(vista));
    }//GEN-LAST:event_btnRegistrarseActionPerformed

     
    
     
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IniciarSesion;
    private javax.swing.JLabel JbAgenteBancario;
    private javax.swing.JButton btnRegistrarse;
    // End of variables declaration//GEN-END:variables
}
