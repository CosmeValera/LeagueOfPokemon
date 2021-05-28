package vista;

import modelo.Personajes;
import modelo.Starter;

public class PanelSeleccionStarter extends javax.swing.JPanel {

    public GUI GUICallBack;

    public PanelSeleccionStarter() {
        initComponents();
    }

    void mostrar(GUI.SeleccionStarter seleccionStarter, GUI gui) {
        this.setVisible(true);
        this.requestFocusInWindow();

        this.GUICallBack = gui;

        if (seleccionStarter == GUI.SeleccionStarter.NORMAL) {
            labCabecera.setText("TUS CAMPEONES");
            if (!Starter.isTeemoDisponible()) {
                labTeemo.setVisible(false);
                butTeemo.setVisible(false);
                labDescTeemo1.setVisible(false);
                labDescTeemo2.setVisible(false);
            }
            if (!Starter.isPoppyDisponible()) {
                labPoppy.setVisible(false);
                butPoppy.setVisible(false);
                labDescPoppy.setVisible(false);
            }
            if (!Starter.isGnarDisponible()) {
                labGnar.setVisible(false);
                butGnar.setVisible(false);
                labDescGnar1.setVisible(false);
                labDescGnar2.setVisible(false);
            }
        } else {
            GUICallBack.obtenerBarraMenu().setVisible(false);
            labCabecera.setText("ELIGE UN CAMPEÓN"
                    + (!Starter.isTeemoDisponible() && !Starter.isPoppyDisponible()
                    && !Starter.isGnarDisponible() ? " INICIAL" : ""));
            if (Starter.isTeemoDisponible()) {
                labTeemo.setVisible(false);
                butTeemo.setVisible(false);
                labDescTeemo1.setVisible(false);
                labDescTeemo2.setVisible(false);
            }
            if (Starter.isPoppyDisponible()) {
                labPoppy.setVisible(false);
                butPoppy.setVisible(false);
                labDescPoppy.setVisible(false);
            }
            if (Starter.isGnarDisponible()) {
                labGnar.setVisible(false);
                butGnar.setVisible(false);
                labDescGnar1.setVisible(false);
                labDescGnar2.setVisible(false);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labCabecera = new javax.swing.JLabel();
        labTeemo = new javax.swing.JLabel();
        butTeemo = new javax.swing.JButton();
        labDescTeemo1 = new javax.swing.JLabel();
        labDescTeemo2 = new javax.swing.JLabel();
        labGnar = new javax.swing.JLabel();
        butGnar = new javax.swing.JButton();
        labDescGnar1 = new javax.swing.JLabel();
        labDescGnar2 = new javax.swing.JLabel();
        labPoppy = new javax.swing.JLabel();
        butPoppy = new javax.swing.JButton();
        labDescPoppy = new javax.swing.JLabel();

        setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        setMaximumSize(new java.awt.Dimension(800, 560));
        setMinimumSize(new java.awt.Dimension(800, 560));
        setPreferredSize(new java.awt.Dimension(800, 560));

        labCabecera.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labCabecera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCabecera.setText("ELIGE TU CAMPEON:");

        labTeemo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labTeemo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTeemo.setText("Teemo");

        butTeemo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/teemoPequeno.png"))); // NOI18N
        butTeemo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butTeemoActionPerformed(evt);
            }
        });

        labDescTeemo1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labDescTeemo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labDescTeemo1.setText("Pequeñito pero matón, gra-");

        labDescTeemo2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labDescTeemo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labDescTeemo2.setText("cias a su cervatana venenosa.");

        labGnar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labGnar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labGnar.setText("Gnar");

        butGnar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/gnarPeque.png"))); // NOI18N
        butGnar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butGnarActionPerformed(evt);
            }
        });

        labDescGnar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labDescGnar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labDescGnar1.setText("No debes cabrear a este ser ");

        labDescGnar2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labDescGnar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labDescGnar2.setText("aparentemente inofensivo");

        labPoppy.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labPoppy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labPoppy.setText("Poppy");

        butPoppy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/poppy.png"))); // NOI18N
        butPoppy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPoppyActionPerformed(evt);
            }
        });

        labDescPoppy.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labDescPoppy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labDescPoppy.setText("Los dioses temen su martillo.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labCabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labDescTeemo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labDescTeemo2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labTeemo, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butTeemo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labPoppy, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labDescPoppy, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butPoppy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(labGnar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labDescGnar2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labDescGnar1)
                                    .addComponent(butGnar, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 7, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labTeemo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labGnar)
                        .addComponent(labPoppy, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(butGnar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butPoppy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butTeemo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labDescGnar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labDescTeemo1)
                            .addComponent(labDescPoppy))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labDescTeemo2)
                    .addComponent(labDescGnar2))
                .addContainerGap(164, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void butTeemoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butTeemoActionPerformed
        GUICallBack.obtenerBarraMenu().setVisible(true);
        Personajes.starter = Personajes.teemo;
        Starter.setTeemoDisponible(true);
        this.setVisible(false);
        this.getRootPane().getContentPane().remove(this);
    }//GEN-LAST:event_butTeemoActionPerformed

    private void butGnarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butGnarActionPerformed
        GUICallBack.obtenerBarraMenu().setVisible(true);
        Personajes.starter = Personajes.gnar;
        Starter.setGnarDisponible(true);
        this.setVisible(false);
        this.getRootPane().getContentPane().remove(this);
    }//GEN-LAST:event_butGnarActionPerformed

    private void butPoppyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPoppyActionPerformed
        GUICallBack.obtenerBarraMenu().setVisible(true);
        Personajes.starter = Personajes.poppy;
        Starter.setPoppyDisponible(true);
        this.setVisible(false);
        this.getRootPane().getContentPane().remove(this);
    }//GEN-LAST:event_butPoppyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butGnar;
    private javax.swing.JButton butPoppy;
    private javax.swing.JButton butTeemo;
    private javax.swing.JLabel labCabecera;
    private javax.swing.JLabel labDescGnar1;
    private javax.swing.JLabel labDescGnar2;
    private javax.swing.JLabel labDescPoppy;
    private javax.swing.JLabel labDescTeemo1;
    private javax.swing.JLabel labDescTeemo2;
    private javax.swing.JLabel labGnar;
    private javax.swing.JLabel labPoppy;
    private javax.swing.JLabel labTeemo;
    // End of variables declaration//GEN-END:variables

}
