/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistaAgente;
import javax.swing.JOptionPane;


public class panelDeposito extends javax.swing.JPanel {

    private Vista vista;
    
    public panelDeposito(Vista vista) {
    initComponents();
    this.vista = vista;
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JbDNI = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        JbMonto = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        btnDepositar = new javax.swing.JButton();

        JbDNI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JbDNI.setText("DNI");

        JbMonto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JbMonto.setText("Monto");

        btnDepositar.setText("DEPOSITAR");
        btnDepositar.addActionListener(this::btnDepositarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(btnDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JbMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMonto))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JbDNI)
                                .addGap(27, 27, 27)
                                .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbDNI)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbMonto)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                .addComponent(btnDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
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

        boolean deposito = vista.getControlador().depositar(dni, monto);

        if (deposito) {
            JOptionPane.showMessageDialog(this, "Depósito realizado correctamente");
            txtDNI.setText("");
            txtMonto.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Cliente no encontrado");
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Ingrese un monto válido");
    }
    }//GEN-LAST:event_btnDepositarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JbDNI;
    private javax.swing.JLabel JbMonto;
    private javax.swing.JButton btnDepositar;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
