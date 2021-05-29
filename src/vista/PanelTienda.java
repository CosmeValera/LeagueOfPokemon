package vista;

import modelo.*;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class PanelTienda extends javax.swing.JPanel implements ICallBack {

    public Starter starter;

    public PanelTienda() {
        initComponents();
    }

    public void mostrar() {
        starter = Global.starter;
        refrescarInfoStarter();
        refrescarInfoTienda();

        this.setVisible(true);
        butPotion.requestFocusInWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labCabecera = new javax.swing.JLabel();
        labFijoOro = new javax.swing.JLabel();
        labCantidadOro = new javax.swing.JLabel();
        labMonedaPocion1 = new javax.swing.JLabel();
        labFijoDano = new javax.swing.JLabel();
        labCantidadDano = new javax.swing.JLabel();
        labFijoValorVariable = new javax.swing.JLabel();
        labCantidadValorVariable = new javax.swing.JLabel();
        labFijoVida = new javax.swing.JLabel();
        labCantidadVida = new javax.swing.JLabel();
        labVictorias = new javax.swing.JLabel();
        labCantidadVictorias = new javax.swing.JLabel();
        butPotion = new javax.swing.JButton();
        labPrecioPotion = new javax.swing.JLabel();
        labMonedaPocion = new javax.swing.JLabel();
        labVidaPotion = new javax.swing.JLabel();
        butInfoPocion = new javax.swing.JButton();
        butItemVariable = new javax.swing.JButton();
        labPrecioItemVariable = new javax.swing.JLabel();
        labMonedaItemVariable = new javax.swing.JLabel();
        labAportacionItemVariable = new javax.swing.JLabel();
        butInfoItemVariable = new javax.swing.JButton();
        butEspada = new javax.swing.JButton();
        labPrecioEspada = new javax.swing.JLabel();
        labMonedaEspada = new javax.swing.JLabel();
        labDanoEspada = new javax.swing.JLabel();
        butInfoEspada = new javax.swing.JButton();

        setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        setMaximumSize(new java.awt.Dimension(800, 560));
        setMinimumSize(new java.awt.Dimension(800, 560));
        setPreferredSize(new java.awt.Dimension(800, 560));

        labCabecera.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labCabecera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCabecera.setText("TIENDA");

        labFijoOro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labFijoOro.setText("Oro:");

        labCantidadOro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labCantidadOro.setText(" ");

        labMonedaPocion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/coin.png"))); // NOI18N
        labMonedaPocion1.setText(" ");

        labFijoDano.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labFijoDano.setText("Daño: ");

        labCantidadDano.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labCantidadDano.setText(" ");

        labFijoValorVariable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labFijoValorVariable.setText("Daño Veneno: ");

        labCantidadValorVariable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labCantidadValorVariable.setText(" ");

        labFijoVida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labFijoVida.setText("Vida: ");

        labCantidadVida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labCantidadVida.setText(" ");

        labVictorias.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labVictorias.setText("Victorias:");

        labCantidadVictorias.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labCantidadVictorias.setText(" ");

        butPotion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pocion.png"))); // NOI18N
        butPotion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        butPotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPotionActionPerformed(evt);
            }
        });

        labPrecioPotion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labPrecioPotion.setText("30");

        labMonedaPocion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/coin.png"))); // NOI18N
        labMonedaPocion.setText(" ");

        labVidaPotion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labVidaPotion.setText("+75 Vida");

        butInfoPocion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butInfoPocion.setText("Info");
        butInfoPocion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butInfoPocionActionPerformed(evt);
            }
        });

        butItemVariable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/posinos.png"))); // NOI18N
        butItemVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butItemVariableActionPerformed(evt);
            }
        });

        labPrecioItemVariable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labPrecioItemVariable.setText("120");

        labMonedaItemVariable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/coin.png"))); // NOI18N
        labMonedaItemVariable.setText(" ");

        labAportacionItemVariable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labAportacionItemVariable.setText("+1 daño veneno");

        butInfoItemVariable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butInfoItemVariable.setText("Info");
        butInfoItemVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butInfoItemVariableActionPerformed(evt);
            }
        });

        butEspada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sword.png"))); // NOI18N
        butEspada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butEspadaActionPerformed(evt);
            }
        });

        labPrecioEspada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labPrecioEspada.setText("150");

        labMonedaEspada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/coin.png"))); // NOI18N
        labMonedaEspada.setText(" ");

        labDanoEspada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labDanoEspada.setText("+2 daño");

        butInfoEspada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butInfoEspada.setText("Info");
        butInfoEspada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butInfoEspadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labFijoValorVariable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labFijoVida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labFijoDano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labFijoOro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labVictorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labCantidadDano)
                    .addComponent(labCantidadValorVariable)
                    .addComponent(labCantidadVida)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labCantidadOro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labMonedaPocion1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labCantidadVictorias))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labPrecioPotion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labMonedaPocion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(labVidaPotion))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butPotion)
                        .addGap(18, 18, 18)
                        .addComponent(butInfoPocion)))
                .addContainerGap(274, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labPrecioItemVariable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labMonedaItemVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labAportacionItemVariable))
                            .addComponent(butItemVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(butInfoItemVariable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labPrecioEspada)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labMonedaEspada, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labDanoEspada))
                            .addComponent(butEspada, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(butInfoEspada))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labCabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(butPotion)
                            .addComponent(butInfoPocion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labPrecioPotion)
                            .addComponent(labVidaPotion)
                            .addComponent(labMonedaPocion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(butItemVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(butInfoItemVariable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labPrecioItemVariable)
                                    .addComponent(labAportacionItemVariable)
                                    .addComponent(labMonedaItemVariable)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(butEspada)
                                    .addComponent(butInfoEspada, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labPrecioEspada)
                                    .addComponent(labDanoEspada)
                                    .addComponent(labMonedaEspada)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labFijoOro)
                            .addComponent(labCantidadOro)
                            .addComponent(labMonedaPocion1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labCantidadDano)
                            .addComponent(labFijoDano))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labCantidadValorVariable)
                            .addComponent(labFijoValorVariable))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labCantidadVida)
                            .addComponent(labFijoVida))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labVictorias)
                            .addComponent(labCantidadVictorias))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refrescarInfoStarter() {
        refrescarOro();
        refrescarDano();
        refrescarVida();
        refrescarVictorias();
    }

    private void refrescarInfoTienda() throws NumberFormatException {
        refrescarValorVariable();
        refrescarItemVariable();
        refrescarPrecioEspada();
    }

    private void butPotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPotionActionPerformed
        if (starter.getCantidadOro() < Integer.parseInt(labPrecioPotion.getText())) {
            JOptionPane.showMessageDialog(
                    this,
                    "No tienes dinero para comprar este objeto!",
                    this.getName(),
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (starter.getVida() >= starter.getVidaMaxima()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Tienes la vida al maximo",
                    this.getName(),
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        starter.setCantidadOro(starter.getCantidadOro() - Integer.parseInt(labPrecioPotion.getText()));
        starter.setVida(starter.getVida() + 75);
        if (starter.getVida() > starter.getVidaMaxima()) {
            starter.setVida(starter.getVidaMaxima());
        }
        refrescarOro();
        refrescarVida();
        JOptionPane.showMessageDialog(
                this,
                "Compraste una pocion (+75 de vida)",
                this.getName(),
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butPotionActionPerformed

    private void butItemVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butItemVariableActionPerformed
        //CASO TEEMO
        if (starter instanceof Teemo teemo) {
            butItemVariableTeemo(teemo);
        } else if (starter instanceof Gnar gnar) {
            butItemVariableGnar(gnar);
        } else if (starter instanceof Poppy poppy) {
            butItemVariablePoppy(poppy);
        }
    }//GEN-LAST:event_butItemVariableActionPerformed

    private boolean butItemVariableTeemo(Teemo teemo) throws HeadlessException, NumberFormatException {
        if (teemo.getCantidadOro() < Integer.parseInt(labPrecioItemVariable.getText())) {
            JOptionPane.showMessageDialog(
                    this,
                    "No tienes dinero para comprar este objeto!",
                    this.getName(),
                    JOptionPane.WARNING_MESSAGE);
            return true;
        }
        if (teemo.getDanoVeneno() >= teemo.getDanoVenenoMaximo()) {
            JOptionPane.showMessageDialog(
                    this,
                    teemo.getDanoVenenoMaximo() + " es el maximo de daño por veneno",
                    this.getName(),
                    JOptionPane.WARNING_MESSAGE);
            return true;
        }
        teemo.setCantidadOro(teemo.getCantidadOro() - Integer.parseInt(labPrecioItemVariable.getText()));
        teemo.setDanoVeneno(teemo.getDanoVeneno() + 1);
        refrescarOro();
        refrescarValorVariable();
        JOptionPane.showMessageDialog(
                this,
                "Compraste una pocion venenosa (+1 daño por veneno)",
                this.getName(),
                JOptionPane.INFORMATION_MESSAGE);
        refrescarItemVariable();
        return false;
    }

    private void refrescarItemVariable() {
        if (starter instanceof Teemo) {
            labFijoValorVariable.setText("Daño Veneno:");
            labAportacionItemVariable.setText("+1 Daño Veneno");
            butItemVariable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/posinos.png")));
            labPrecioItemVariable.setText(String.valueOf((int) (Double.parseDouble(labCantidadValorVariable.getText()) * 25)));
        } else if (starter instanceof Gnar) {
            labFijoValorVariable.setText("Resistencia:");
            labAportacionItemVariable.setText("+2 Resistencia");
            butItemVariable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/armor.png")));
            labPrecioItemVariable.setText(String.valueOf((int) (Double.parseDouble(labCantidadValorVariable.getText()) * 3.5)));
        } else if (starter instanceof Poppy) {
            labFijoValorVariable.setText("Escudo:");
            labAportacionItemVariable.setText("+1 Dureza Escudo");
            butItemVariable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shield.png")));
            labPrecioItemVariable.setText(String.valueOf((int) (Double.parseDouble(labCantidadValorVariable.getText()) * 25)));
        }
    }

    private boolean butItemVariableGnar(Gnar gnar) throws HeadlessException, NumberFormatException {
        if (gnar.getCantidadOro() < Integer.parseInt(labPrecioItemVariable.getText())) {
            JOptionPane.showMessageDialog(
                    this,
                    "No tienes dinero para comprar este objeto!",
                    this.getName(),
                    JOptionPane.WARNING_MESSAGE);
            return true;
        }
        if (gnar.getResistencia() >= gnar.getResistenciaMaxima()) {
            JOptionPane.showMessageDialog(
                    this,
                    gnar.getResistenciaMaxima() + " es el maximo de resistencia",
                    this.getName(),
                    JOptionPane.WARNING_MESSAGE);
            return true;
        }
        gnar.setCantidadOro(gnar.getCantidadOro() - Integer.parseInt(labPrecioItemVariable.getText()));
        gnar.setResistencia(gnar.getResistencia() + 2);
        refrescarOro();
        refrescarValorVariable();
        JOptionPane.showMessageDialog(
                this,
                "Compraste una armadura (+2 resistencia)",
                this.getName(),
                JOptionPane.INFORMATION_MESSAGE);
        refrescarItemVariable();
        return false;
    }

    private boolean butItemVariablePoppy(Poppy poppy) throws HeadlessException, NumberFormatException {
        if (poppy.getCantidadOro() < Integer.parseInt(labPrecioItemVariable.getText())) {
            JOptionPane.showMessageDialog(
                    this,
                    "No tienes dinero para comprar este objeto!",
                    this.getName(),
                    JOptionPane.WARNING_MESSAGE);
            return true;
        }
        if (poppy.getProteccionEscudo() >= poppy.getProteccionEscudoMaxima()) {
            JOptionPane.showMessageDialog(
                    this,
                    poppy.getProteccionEscudoMaxima() + " es el maximo de dureza de escudo",
                    this.getName(),
                    JOptionPane.WARNING_MESSAGE);
            return true;
        }
        poppy.setCantidadOro(poppy.getCantidadOro() - Integer.parseInt(labPrecioItemVariable.getText()));
        poppy.setProteccionEscudo(poppy.getProteccionEscudo() + 1);
        refrescarOro();
        refrescarValorVariable();
        JOptionPane.showMessageDialog(
                this,
                "Compraste un escudo (+1 dureza de escudo)",
                this.getName(),
                JOptionPane.INFORMATION_MESSAGE);
        refrescarItemVariable();
        return false;
    }

    private void butEspadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butEspadaActionPerformed
        if (starter.getCantidadOro() < Integer.parseInt(labPrecioEspada.getText())) {
            JOptionPane.showMessageDialog(
                    this,
                    "No tienes dinero para comprar este objeto!",
                    this.getName(),
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (starter.getDano() >= starter.getDanoMaximo()) {
            JOptionPane.showMessageDialog(
                    this,
                    starter.getDanoMaximo() + " es el maximo de daño por golpe",
                    this.getName(),
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        starter.setCantidadOro(starter.getCantidadOro() - Integer.parseInt(labPrecioEspada.getText()));
        starter.setDano(starter.getDano() + 2);
        refrescarOro();
        refrescarDano();
        JOptionPane.showMessageDialog(
                this,
                "Compraste una espada (+2 de daño)",
                this.getName(),
                JOptionPane.INFORMATION_MESSAGE);
        refrescarPrecioEspada();
    }//GEN-LAST:event_butEspadaActionPerformed

    private void butInfoPocionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butInfoPocionActionPerformed
        PanelInformacion panelI = new PanelInformacion();
        this.add(panelI);
        panelI.clickPotion();
        Global.panelCaller = this;
        this.setVisible(false); //TO DO: hacer callback en el volver que vuelva a la tienda
    }//GEN-LAST:event_butInfoPocionActionPerformed

    private void butInfoItemVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butInfoItemVariableActionPerformed
        PanelInformacion panelI = new PanelInformacion();
        this.add(panelI);
        if (starter instanceof Teemo) {
            panelI.clickPoison();
        } else if (starter instanceof Poppy) {
            panelI.clickShield();
        } else if (starter instanceof Gnar) {
            panelI.clickArmor();
        }
        Global.panelCaller = this;
        this.setVisible(false); //TO DO: hacer callback en el volver que vuelva a la tienda
    }//GEN-LAST:event_butInfoItemVariableActionPerformed

    private void butInfoEspadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butInfoEspadaActionPerformed
        PanelInformacion panelI = new PanelInformacion();
        this.add(panelI);
        panelI.clickSword();
        Global.panelCaller = this;
        this.setVisible(false); //TO DO: hacer callback en el volver que vuelva a la tienda
    }//GEN-LAST:event_butInfoEspadaActionPerformed

    private void refrescarVida() {
        labCantidadVida.setText(String.valueOf(((double) ((int) starter.getVida() * 10)) / 10));
    }

    private void refrescarVictorias() {
        labCantidadVictorias.setText(String.valueOf(((double) ((int) Starter.getEnemigosVencidos() * 10)) / 10));
    }

    private void refrescarValorVariable() {
        if (starter instanceof Teemo teemo) {
            labCantidadValorVariable.setText(String.valueOf(((double) (teemo.getDanoVeneno()) * 10) / 10));
        } else if (starter instanceof Gnar gnar) {
            labCantidadValorVariable.setText(String.valueOf(((double) (gnar.getResistencia()) * 10) / 10));
        } else if (starter instanceof Poppy poppy) {
            labCantidadValorVariable.setText(String.valueOf(((double) (poppy.getProteccionEscudo()) * 10) / 10));
        }
    }

    private void refrescarDano() {
        labCantidadDano.setText(String.valueOf(((double) (starter.getDano() * 10)) / 10));
    }

    private void refrescarOro() {
        labCantidadOro.setText(String.valueOf(starter.getCantidadOro()));
    }

    private void refrescarPrecioEspada() throws NumberFormatException {
        labPrecioEspada.setText(String.valueOf((int) (Double.parseDouble(labCantidadDano.getText()) * 20 - 50)));
    }

    @Override
    public void hacerVisible(boolean bool) {
        this.setVisible(bool);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butEspada;
    private javax.swing.JButton butInfoEspada;
    private javax.swing.JButton butInfoItemVariable;
    private javax.swing.JButton butInfoPocion;
    private javax.swing.JButton butItemVariable;
    private javax.swing.JButton butPotion;
    private javax.swing.JLabel labAportacionItemVariable;
    private javax.swing.JLabel labCabecera;
    private javax.swing.JLabel labCantidadDano;
    private javax.swing.JLabel labCantidadOro;
    private javax.swing.JLabel labCantidadValorVariable;
    private javax.swing.JLabel labCantidadVictorias;
    private javax.swing.JLabel labCantidadVida;
    private javax.swing.JLabel labDanoEspada;
    private javax.swing.JLabel labFijoDano;
    private javax.swing.JLabel labFijoOro;
    private javax.swing.JLabel labFijoValorVariable;
    private javax.swing.JLabel labFijoVida;
    private javax.swing.JLabel labMonedaEspada;
    private javax.swing.JLabel labMonedaItemVariable;
    private javax.swing.JLabel labMonedaPocion;
    private javax.swing.JLabel labMonedaPocion1;
    private javax.swing.JLabel labPrecioEspada;
    private javax.swing.JLabel labPrecioItemVariable;
    private javax.swing.JLabel labPrecioPotion;
    private javax.swing.JLabel labVictorias;
    private javax.swing.JLabel labVidaPotion;
    // End of variables declaration//GEN-END:variables
}
