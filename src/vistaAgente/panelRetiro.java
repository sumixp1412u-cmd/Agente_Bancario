/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistaAgente;

import javax.swing.JOptionPane;

public class panelRetiro extends javax.swing.JPanel {

    private Vista vista;

    public panelRetiro(Vista vista) {
        initComponents();
        this.vista = vista;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        btnRetirar = new javax.swing.JButton();
        JbMonto = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(560, 530));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("DNI");

        btnRetirar.setText("Retirar");
        btnRetirar.addActionListener(this::btnRetirarActionPerformed);

        JbMonto.setText("Monto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(btnRetirar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JbMonto)
                                .addGap(18, 18, 18)
                                .addComponent(txtMonto))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(251, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbMonto)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                .addComponent(btnRetirar)
                .addGap(112, 112, 112))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        try {

    String dni = txtDNI.getText();
    double monto = Double.parseDouble(txtMonto.getText());

    if (dni.isEmpty() || txtMonto.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Complete todos los campos");
        return;
    }

    if (monto <= 0) {
        JOptionPane.showMessageDialog(this, "El monto debe ser mayor a 0");
        return;
    }

    boolean retiro = vista.getControlador().retirar(dni, monto);

    if (retiro) {

        JOptionPane.showMessageDialog(this, "Retiro realizado correctamente");

        txtDNI.setText("");
        txtMonto.setText("");

    } else {

        JOptionPane.showMessageDialog(this,
                "Saldo insuficiente o cliente no encontrado");

    }

} catch (NumberFormatException e) {

    JOptionPane.showMessageDialog(this,
            "Ingrese un monto válido");

}
    }//GEN-LAST:event_btnRetirarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JbMonto;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
