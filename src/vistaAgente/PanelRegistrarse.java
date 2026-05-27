/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistaAgente;

import javax.swing.JPanel;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class PanelRegistrarse extends javax.swing.JPanel {

    private Vista vista;
    
    public PanelRegistrarse(Vista vista) {
    initComponents();
    this.vista = vista;
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        PanelRegistrarse = new javax.swing.JPanel();
        JbTituloRegistro = new javax.swing.JLabel();
        JbNombres = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        JblDNI = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        JbCorreo = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        JbContraseña = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        JbFechaNacimiento = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JTextField();
        JbTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        JbRUC = new javax.swing.JLabel();
        txtRUC = new javax.swing.JTextField();
        JbConfirmarContraseña = new javax.swing.JLabel();
        txtConfirContraseña = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        setPreferredSize(new java.awt.Dimension(740, 670));

        PanelRegistrarse.setPreferredSize(new java.awt.Dimension(740, 670));

        JbTituloRegistro.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        JbTituloRegistro.setText("Registro de agente");

        JbNombres.setText("Nombres");

        JblDNI.setText("DNI");

        JbCorreo.setText("Correo");

        JbContraseña.setText("Contraseña");

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(this::btnRegistrarActionPerformed);

        btnBack.setText("BACK");
        btnBack.addActionListener(this::btnBackActionPerformed);

        JbFechaNacimiento.setText("Fecha de nacimiento");

        JbTelefono.setText("Teleono");

        JbRUC.setText("RUC");

        JbConfirmarContraseña.setText("Confirmar contraseña");

        javax.swing.GroupLayout PanelRegistrarseLayout = new javax.swing.GroupLayout(PanelRegistrarse);
        PanelRegistrarse.setLayout(PanelRegistrarseLayout);
        PanelRegistrarseLayout.setHorizontalGroup(
            PanelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegistrarseLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(315, 315, 315))
            .addGroup(PanelRegistrarseLayout.createSequentialGroup()
                .addGroup(PanelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRegistrarseLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(JbNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JblDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JbTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelRegistrarseLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(JbTituloRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelRegistrarseLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(PanelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelRegistrarseLayout.createSequentialGroup()
                                .addComponent(JbCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(JbFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JbRUC, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelRegistrarseLayout.createSequentialGroup()
                                .addComponent(JbContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JbConfirmarContraseña)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtConfirContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        PanelRegistrarseLayout.setVerticalGroup(
            PanelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegistrarseLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(JbTituloRegistro)
                .addGroup(PanelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRegistrarseLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(PanelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JbNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelRegistrarseLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(PanelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JblDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JbTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addGroup(PanelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbRUC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(PanelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbContraseña)
                    .addComponent(txtContraseña)
                    .addComponent(JbConfirmarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConfirContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addGap(90, 90, 90)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        vista.mostrarPanelInicio(new PanelInicio(vista));
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        boolean registrado = vista.getControlador().registrarAgente(
        jTextField1.getText(),
        jTextField3.getText(),
        txtTelefono.getText(),
        jTextField2.getText(),
        txtFechaNacimiento.getText(),
        txtRUC.getText(),
        txtContraseña.getText(),
        txtConfirContraseña.getText()
);

if (registrado) {
    JOptionPane.showMessageDialog(this, "Agente registrado correctamente");
    vista.mostrarPanelInicio(new PanelIniciarSesion(vista));
} else {
    JOptionPane.showMessageDialog(this, "Datos incorrectos o campos vacíos");
}
    }//GEN-LAST:event_btnRegistrarActionPerformed

    
    
    
    
    
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JbConfirmarContraseña;
    private javax.swing.JLabel JbContraseña;
    private javax.swing.JLabel JbCorreo;
    private javax.swing.JLabel JbFechaNacimiento;
    private javax.swing.JLabel JbNombres;
    private javax.swing.JLabel JbRUC;
    private javax.swing.JLabel JbTelefono;
    private javax.swing.JLabel JbTituloRegistro;
    private javax.swing.JLabel JblDNI;
    private javax.swing.JPanel PanelRegistrarse;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField txtConfirContraseña;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtRUC;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
