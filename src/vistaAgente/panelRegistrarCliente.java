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
public class panelRegistrarCliente extends javax.swing.JPanel {

    
    private Vista vista;
   public panelRegistrarCliente(Vista vista) {
    initComponents();
    this.vista = vista;
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JbDNI = new javax.swing.JLabel();
        JbNombres = new javax.swing.JLabel();
        JbSaldoInicial = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();
        txtDNI = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtSaldoInicial = new javax.swing.JTextField();

        JbDNI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JbDNI.setText("DNI");

        JbNombres.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JbNombres.setText("Nombres");

        JbSaldoInicial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JbSaldoInicial.setText("Saldo inicial");

        btnRegistro.setText("Registrar");
        btnRegistro.addActionListener(this::btnRegistroActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JbDNI)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JbNombres))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JbSaldoInicial)
                            .addComponent(txtSaldoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbDNI)
                    .addComponent(JbNombres)
                    .addComponent(JbSaldoInicial))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSaldoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addComponent(btnRegistro)
                .addGap(138, 138, 138))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        try {

    String dni = txtDNI.getText();
    String nombres = txtNombres.getText();

    double saldo =
            Double.parseDouble(txtSaldoInicial.getText());

    if (dni.isEmpty()
            || nombres.isEmpty()
            || txtSaldoInicial.getText().isEmpty()) {

        JOptionPane.showMessageDialog(this,
                "Complete todos los campos");

        return;
    }

    boolean registrado =
            vista.getControlador()
                    .registrarCliente(dni, nombres, saldo);

    if (registrado) {

        JOptionPane.showMessageDialog(this,
                "Cliente registrado correctamente");

        txtDNI.setText("");
        txtNombres.setText("");
        txtSaldoInicial.setText("");

    } else {

        JOptionPane.showMessageDialog(this,
                "Ese DNI ya existe");

    }

} catch (NumberFormatException e) {

    JOptionPane.showMessageDialog(this,
            "Ingrese un saldo válido");

}
    }//GEN-LAST:event_btnRegistroActionPerformed

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JbDNI;
    private javax.swing.JLabel JbNombres;
    private javax.swing.JLabel JbSaldoInicial;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtSaldoInicial;
    // End of variables declaration//GEN-END:variables
}
