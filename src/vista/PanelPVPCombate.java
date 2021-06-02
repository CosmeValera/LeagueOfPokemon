package vista;

import modelo.Global;

public class PanelPVPCombate extends javax.swing.JPanel {

    public PanelPVPCombate() {
        initComponents();
    }

    public void mostrar() {
        
        butStarter1AtaquePrincipal.setText(Global.starter.getNombreAtaquePrincipal());
        butStarter1AtaqueSecundario.setText(Global.starter.getNombreAtaqueSecundario());
        
        butStarter2AtaquePrincipal.setText(Global.starter2.getNombreAtaquePrincipal());
        butStarter2AtaqueSecundario.setText(Global.starter2.getNombreAtaqueSecundario());
        
        this.setVisible(true);
        this.requestFocusInWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labCabecera = new javax.swing.JLabel();
        butStarter1AtaquePrincipal = new javax.swing.JButton();
        butStarter1AtaqueSecundario = new javax.swing.JButton();
        butStarter2AtaquePrincipal = new javax.swing.JButton();
        butStarter2AtaqueSecundario = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(800, 560));
        setMinimumSize(new java.awt.Dimension(800, 560));

        labCabecera.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labCabecera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCabecera.setText("COMBATE PVP");

        butStarter1AtaquePrincipal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butStarter1AtaquePrincipal.setText("Arañazo");

        butStarter1AtaqueSecundario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butStarter1AtaqueSecundario.setText("Dardo Venenoso");

        butStarter2AtaquePrincipal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butStarter2AtaquePrincipal.setText("Placaje con escudo");

        butStarter2AtaqueSecundario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butStarter2AtaqueSecundario.setText("Martillazo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labCabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butStarter1AtaquePrincipal)
                        .addGap(18, 18, 18)
                        .addComponent(butStarter1AtaqueSecundario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                        .addComponent(butStarter2AtaquePrincipal)
                        .addGap(18, 18, 18)
                        .addComponent(butStarter2AtaqueSecundario)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 455, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butStarter1AtaquePrincipal)
                    .addComponent(butStarter1AtaqueSecundario)
                    .addComponent(butStarter2AtaqueSecundario)
                    .addComponent(butStarter2AtaquePrincipal))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butStarter1AtaquePrincipal;
    private javax.swing.JButton butStarter1AtaqueSecundario;
    private javax.swing.JButton butStarter2AtaquePrincipal;
    private javax.swing.JButton butStarter2AtaqueSecundario;
    private javax.swing.JLabel labCabecera;
    // End of variables declaration//GEN-END:variables
}
