package vista;

import javax.swing.JPanel;
import modelo.Global;

public class PanelInfoEspecificaItems extends JPanel {

    JPanel panelCaller;
    ICallBack IPanelCaller;
    String nombreItem;

    public PanelInfoEspecificaItems() {
        initComponents();
    }

    void mostrar(ICallBack panelInformacion, String nombreItem) {
        this.nombreItem = nombreItem;
        IPanelCaller = panelInformacion;
        panelCaller = Global.panelCaller;

        infoEspecificaItems(nombreItem);

        this.setVisible(true);
        this.requestFocusInWindow();
    }

    private void infoEspecificaItems(String nombreItem) {
        switch (nombreItem) {
            case "healthPotion": //Potion
                labCabecera.setText("Poción");
                txtDescripcion.setText("Precio: 30.\n"
                        + "Restaura 75 de salud.");
                labImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoEspecifica/potionEspecifico.png"))); // NOI18N
                labStarters.setVisible(false);
                butStarterUno.setVisible(false);
                butStarterDos.setVisible(false);
                butStarterTres.setVisible(false);
                break;
            case "sword": //sword
                labCabecera.setText("Espada");
                txtDescripcion.setText("Otorga 2 de daño extra.");
                labImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoEspecifica/swordEspecifico.png"))); // NOI18N
                labStarters.setVisible(false);
                butStarterUno.setVisible(false);
                butStarterDos.setVisible(false);
                butStarterTres.setVisible(false);
                break;
            case "poison": //poison
                labCabecera.setText("Veneno");
                txtDescripcion.setText("Aumenta en 1 el daño por veneno\n"
                        + "inflingido al oponente cada turno.");
                labImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoEspecifica/poisonEspecifico.png"))); // NOI18N
                butStarterUno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoGeneral/infoTeemo.png"))); // NOI18N
                butStarterDos.setVisible(false);
                butStarterTres.setVisible(false);
                break;
            case "shield": //shield
                labCabecera.setText("Escudo");
                txtDescripcion.setText("Otorga 1 de armadura extra para resistir\n"
                        + "el golpe del oponente cada turno que\n"
                        + "lleves el escudo encima.");
                labImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoEspecifica/shieldEspecifico.png"))); // NOI18N
                butStarterUno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoGeneral/infoPoppy.png"))); // NOI18N
                butStarterDos.setVisible(false);
                butStarterTres.setVisible(false);
                break;
            case "armor": //armor
                labCabecera.setText("Armadura");
                txtDescripcion.setText("Otorga 2 de resistencia pasiva a los\n"
                        + "golpes. La resistencia es el doble de\n"
                        + "efectiva en MegaGnar que en Gnar");
                labImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoEspecifica/armorEspecifico.png"))); // NOI18N
                butStarterUno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoGeneral/infoGnarMini.png"))); // NOI18N
                butStarterDos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoGeneral/infoGnarMega.png"))); // NOI18N
                butStarterTres.setVisible(false);
                break;
            case "relievePotion": //relievePotion
                labCabecera.setText("Poción Sanadora");
                txtDescripcion.setText("Otorga 1 de curación extra en combate\n"
                        + "por ataque que tenga regeneración.");
                labImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoEspecifica/relievePotionEspecifico.png"))); // NOI18N
                butStarterUno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoGeneral/infoYuumi.png"))); // NOI18N
                butStarterDos.setVisible(false);
                butStarterTres.setVisible(false);
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labCabecera = new javax.swing.JLabel();
        labDescripcion = new javax.swing.JLabel();
        scrollDescripcion = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        labStarters = new javax.swing.JLabel();
        butStarterUno = new javax.swing.JButton();
        butStarterDos = new javax.swing.JButton();
        butStarterTres = new javax.swing.JButton();
        labImagen = new javax.swing.JLabel();
        butVolver = new javax.swing.JButton();

        setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        setMaximumSize(new java.awt.Dimension(800, 560));
        setMinimumSize(new java.awt.Dimension(800, 560));
        setPreferredSize(new java.awt.Dimension(800, 560));

        labCabecera.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labCabecera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCabecera.setText("POCIÓN");

        labDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labDescripcion.setText("Descripción");

        txtDescripcion.setEditable(false);
        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtDescripcion.setRows(5);
        txtDescripcion.setText("Precio: 30.\nRestaura 75 de salud.");
        scrollDescripcion.setViewportView(txtDescripcion);

        labStarters.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labStarters.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labStarters.setText("Campeones que compran este item:");

        butStarterUno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoGeneral/infoTeemo.png"))); // NOI18N
        butStarterUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butStarterUnoActionPerformed(evt);
            }
        });

        butStarterDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butStarterDosActionPerformed(evt);
            }
        });

        labImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoEspecifica/teemoEspecifico.png"))); // NOI18N

        butVolver.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        butVolver.setText("Volver");
        butVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labCabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(scrollDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                                        .addComponent(labDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(labStarters, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(butStarterUno, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(butStarterDos, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(butStarterTres, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(labImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(butVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labDescripcion)
                        .addGap(18, 18, 18)
                        .addComponent(scrollDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(labStarters)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butStarterDos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butStarterUno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butStarterTres, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))
                    .addComponent(labImagen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(butVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void butVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butVolverActionPerformed
        this.setVisible(false);
        this.getRootPane().getContentPane().remove(this);
        panelCaller = Global.panelCaller;
        if (IPanelCaller != null) {         //Para volver al panelInfo
            IPanelCaller.hacerVisible(true);
        }
        if (panelCaller != null) {         //Para volver al panelTienda
            panelCaller.setVisible(true);
        }
    }//GEN-LAST:event_butVolverActionPerformed

    private void butStarterUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butStarterUnoActionPerformed
        this.setVisible(false);
        this.getRootPane().getContentPane().remove(this);
        if (nombreItem.equals("poison")) {
            IPanelCaller.clickTeemo();
        } else if (nombreItem.equals("shield")) {
            IPanelCaller.clickPoppy();
        } else if (nombreItem.equals("armor")) {
            IPanelCaller.clickGnarMini();
        } else if (nombreItem.equals("relievePotion")) {
            IPanelCaller.clickYuumi();
        }
    }//GEN-LAST:event_butStarterUnoActionPerformed

    private void butStarterDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butStarterDosActionPerformed
        this.setVisible(false);
        this.getRootPane().getContentPane().remove(this);
        if (nombreItem.equals("armor")) {
            IPanelCaller.clickGnarMega();
        }
    }//GEN-LAST:event_butStarterDosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butStarterDos;
    private javax.swing.JButton butStarterTres;
    private javax.swing.JButton butStarterUno;
    private javax.swing.JButton butVolver;
    private javax.swing.JLabel labCabecera;
    private javax.swing.JLabel labDescripcion;
    private javax.swing.JLabel labImagen;
    private javax.swing.JLabel labStarters;
    private javax.swing.JScrollPane scrollDescripcion;
    private javax.swing.JTextArea txtDescripcion;
    // End of variables declaration//GEN-END:variables

}
