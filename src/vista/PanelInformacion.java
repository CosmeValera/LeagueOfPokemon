package vista;

import modelo.Teemo;

public class PanelInformacion extends javax.swing.JPanel {

    public PanelInformacion() {
        initComponents();
    }

    public void mostrar() {
        this.setVisible(true);
        this.requestFocusInWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labCabecera = new javax.swing.JLabel();
        labStarters = new javax.swing.JLabel();
        butTeemo = new javax.swing.JButton();
        butPoppy = new javax.swing.JButton();
        butGnarMini = new javax.swing.JButton();
        butGnarMega = new javax.swing.JButton();
        labEnemigos = new javax.swing.JLabel();
        butPikachu = new javax.swing.JButton();
        butElectrode = new javax.swing.JButton();
        butHitMonLee = new javax.swing.JButton();
        butGyarados = new javax.swing.JButton();
        labItem = new javax.swing.JLabel();
        butPocion = new javax.swing.JButton();
        butSword = new javax.swing.JButton();
        butPoison = new javax.swing.JButton();
        butShield = new javax.swing.JButton();
        butArmor = new javax.swing.JButton();

        setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        setMaximumSize(new java.awt.Dimension(800, 560));
        setMinimumSize(new java.awt.Dimension(800, 560));
        setPreferredSize(new java.awt.Dimension(800, 560));

        labCabecera.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labCabecera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCabecera.setText("INFORMACIÓN");

        labStarters.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labStarters.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labStarters.setText("Starters");

        butTeemo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/teemoInformacion.png"))); // NOI18N
        butTeemo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butStarter_ActionPerformed(evt);
            }
        });

        butPoppy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/info/infoPoppy.png"))); // NOI18N
        butPoppy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butStarter_ActionPerformed(evt);
            }
        });

        butGnarMini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/info/infoGnarMini.png"))); // NOI18N
        butGnarMini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butStarter_ActionPerformed(evt);
            }
        });

        butGnarMega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoGeneral/infoGnarMega.png"))); // NOI18N
        butGnarMega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butStarter_ActionPerformed(evt);
            }
        });

        labEnemigos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labEnemigos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labEnemigos.setText("Enemigos");

        butPikachu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/info/infoPikachu.png"))); // NOI18N
        butPikachu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butEnemigo_ActionPerformed(evt);
            }
        });

        butElectrode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/info/infoElectrode.png"))); // NOI18N
        butElectrode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butEnemigo_ActionPerformed(evt);
            }
        });

        butHitMonLee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/info/infoHitmonlee.png"))); // NOI18N
        butHitMonLee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butEnemigo_ActionPerformed(evt);
            }
        });

        butGyarados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/info/infoGyarados.png"))); // NOI18N
        butGyarados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butEnemigo_ActionPerformed(evt);
            }
        });

        labItem.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labItem.setText("Items");

        butPocion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/info/infoPocion.png"))); // NOI18N

        butSword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/info/infoSword.png"))); // NOI18N

        butPoison.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/info/infoPoison.png"))); // NOI18N

        butShield.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/info/infoShield.png"))); // NOI18N

        butArmor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/info/infoArmor.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labCabecera, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                    .addComponent(labStarters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labEnemigos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butTeemo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butPoppy, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butGnarMini, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butGnarMega, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butPikachu, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butElectrode, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butHitMonLee, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butGyarados, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butPocion, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butSword, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butPoison, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butShield, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butArmor, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(labStarters)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butPoppy, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butTeemo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butGnarMini, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butGnarMega, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labEnemigos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butElectrode, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butPikachu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butHitMonLee, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butGyarados, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butSword, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butPoison, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butShield, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butArmor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butPocion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void butStarter_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butStarter_ActionPerformed

        this.setVisible(false);
        PanelInfoEspecificaStarters panelIES = new PanelInfoEspecificaStarters();
        panelIES.setSize(800, 560);
        panelIES.setVisible(false);
        this.getRootPane().getContentPane().add(panelIES);

        if (evt.getSource() == butTeemo) {
            panelIES.mostrar(this, "teemo");
        } else if (evt.getSource() == butPoppy) {
            panelIES.mostrar(this, "poppy");
        } else if (evt.getSource() == butGnarMini) {
            panelIES.mostrar(this, "gnarMini");
        } else if (evt.getSource() == butGnarMega) {
            panelIES.mostrar(this, "gnarMega");
        }

    }//GEN-LAST:event_butStarter_ActionPerformed

    private void butEnemigo_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butEnemigo_ActionPerformed
        
        this.setVisible(false);
        PanelInfoEspecificaEnemigos panelIEE = new PanelInfoEspecificaEnemigos();
        panelIEE.setSize(800, 560);
        panelIEE.setVisible(false);
        this.getRootPane().getContentPane().add(panelIEE);

        if (evt.getSource() == butPikachu) {
            panelIEE.mostrar(this, "pikachu");
        } else if (evt.getSource() == butElectrode) {
            panelIEE.mostrar(this, "electrode");
        } else if (evt.getSource() == butHitMonLee) {
            panelIEE.mostrar(this, "hitMonLee");
        } else if (evt.getSource() == butGyarados) {
            panelIEE.mostrar(this, "gyarados");
        }
    }//GEN-LAST:event_butEnemigo_ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butArmor;
    private javax.swing.JButton butElectrode;
    private javax.swing.JButton butGnarMega;
    private javax.swing.JButton butGnarMini;
    private javax.swing.JButton butGyarados;
    private javax.swing.JButton butHitMonLee;
    private javax.swing.JButton butPikachu;
    private javax.swing.JButton butPocion;
    private javax.swing.JButton butPoison;
    private javax.swing.JButton butPoppy;
    private javax.swing.JButton butShield;
    private javax.swing.JButton butSword;
    private javax.swing.JButton butTeemo;
    private javax.swing.JLabel labCabecera;
    private javax.swing.JLabel labEnemigos;
    private javax.swing.JLabel labItem;
    private javax.swing.JLabel labStarters;
    // End of variables declaration//GEN-END:variables
}
