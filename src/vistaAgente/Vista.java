/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistaAgente;

import javax.swing.JPanel;
import controladorAgente.Controlador;

/**
 *
 * @author USER
 */
public class Vista extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Vista.class.getName());

    private Controlador controlador = new Controlador();
    
    
    public Vista() {
        initComponents();
        mostrarPanelInicio(new PanelInicio(this));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelContenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout PanelContenidoLayout = new javax.swing.GroupLayout(PanelContenido);
        PanelContenido.setLayout(PanelContenidoLayout);
        PanelContenidoLayout.setHorizontalGroup(
            PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        PanelContenidoLayout.setVerticalGroup(
            PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        getContentPane().add(PanelContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void mostrarPanelInicio(JPanel panel) {

       panel.setSize(PanelContenido.getWidth(), PanelContenido.getHeight());

        PanelContenido.removeAll();
        PanelContenido.add(panel);
        PanelContenido.revalidate();
        PanelContenido.repaint();
    }

    
    
    public Controlador getControlador() {
    return controlador;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelContenido;
    // End of variables declaration//GEN-END:variables
}
