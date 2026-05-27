/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistaAgente;
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class panelTransferencia extends javax.swing.JPanel {

   
    private Vista vista;

public panelTransferencia(Vista vista) {
    initComponents();
    this.vista = vista;
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JbDNIorigen = new javax.swing.JLabel();
        JbDNIdestino = new javax.swing.JLabel();
        JbMonto = new javax.swing.JLabel();
        txtDniOrigen = new javax.swing.JTextField();
        txtDniDestino = new javax.swing.JTextField();
        txtMonto = new javax.swing.JTextField();
        btnTransferir = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(560, 530));

        JbDNIorigen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JbDNIorigen.setText("DNI origen");

        JbDNIdestino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JbDNIdestino.setText("DNI destino");

        JbMonto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JbMonto.setText("Monto");

        btnTransferir.setText("Transferir");
        btnTransferir.addActionListener(this::btnTransferirActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(JbDNIorigen)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtDniOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JbDNIdestino)
                            .addComponent(txtDniDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JbMonto)
                            .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbDNIdestino)
                    .addComponent(JbDNIorigen)
                    .addComponent(JbMonto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDniOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDniDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(btnTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirActionPerformed
       try {
    String origen = txtDniOrigen.getText();
    String destino = txtDniDestino.getText();
    double monto = Double.parseDouble(txtMonto.getText());

    if (origen.isEmpty() || destino.isEmpty() || txtMonto.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Complete todos los campos");
        return;
    }

    boolean ok = vista.getControlador().transferir(origen, destino, monto);

    if (ok) {
        JOptionPane.showMessageDialog(this, "Transferencia realizada correctamente");
        txtDniOrigen.setText("");
        txtDniDestino.setText("");
        txtMonto.setText("");
    } else {
        JOptionPane.showMessageDialog(this, "Cliente no encontrado o saldo insuficiente");
    }

} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Ingrese un monto válido");
}
    }//GEN-LAST:event_btnTransferirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JbDNIdestino;
    private javax.swing.JLabel JbDNIorigen;
    private javax.swing.JLabel JbMonto;
    private javax.swing.JButton btnTransferir;
    private javax.swing.JTextField txtDniDestino;
    private javax.swing.JTextField txtDniOrigen;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
