package vista;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import modelo.*;
import javax.swing.JOptionPane;

public class PanelCombateEnemigo extends javax.swing.JPanel {

    public Starter starter;
    public Enemy enemigo;

    public GUI GUICallBack;

    public PanelCombateEnemigo() {
        initComponents();
    }

    public void mostrar(GUI gui) {
        this.starter = Globals.starter;
        this.enemigo = Globals.enemy;
        this.GUICallBack = gui;

        labVidaStarter.setText(String.valueOf((int) starter.getHealth()));
        labCantidadDano.setText(String.valueOf((int) starter.getAttackDamage()));
        labCantidadOro.setText(String.valueOf(starter.getGoldAmount()));

        butAtaquePrincipal.setText(starter.getNameOfMainAttack());
        butAtaqueSecundario.setText(starter.getNameOfSecondaryAttack());
        if (starter instanceof Teemo teemo) {
            labFijoValorVariable.setText("Daño Veneno:");
            labCantidadValorVariable.setText(String.valueOf((int) teemo.getPoisonDamage()));
            labFijoEfectoDebilitador.setText("Envenenado?");
            labEfectoDebilitador.setText("No");
            labStarter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/teemo.png")));
        } else if (starter instanceof Gnar gnar) {
            labFijoValorVariable.setText("Resistencia:");
            labCantidadValorVariable.setText(String.valueOf((int) gnar.getResistance()));
            labFijoEfectoDebilitador.setText("");
            labEfectoDebilitador.setText("");
            labStarter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/gnarMini.png")));

        } else if (starter instanceof Poppy poppy) {
            labFijoValorVariable.setText("Escudo:");
            labCantidadValorVariable.setText((poppy.isCarriesShield()) ? "Sí" : "No");
            labFijoEfectoDebilitador.setText("Confundido:");
            labEfectoDebilitador.setText("No");
            labStarter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/Poppy.png")));

        } else if (starter instanceof Yuumi yuumi) {
            labFijoValorVariable.setText("Sanación:");
            labCantidadValorVariable.setText(String.valueOf((int) yuumi.getHealing()));
            labFijoEfectoDebilitador.setText("");
            labEfectoDebilitador.setText("");
            labStarter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/yuumi.png")));
        }

        labVidaEnemigo.setText(String.valueOf((int) enemigo.getHealth()));
        labCabecera.setText("COMBATE VS " + enemigo.getName().toUpperCase());
        if (enemigo instanceof Pikachu pikachu) {
            labEnemigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/enemigosCombate/pikachu.png")));
        } else if (enemigo instanceof Electrode electrode) {
            labEnemigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/enemigosCombate/electrode.png")));
        } else if (enemigo instanceof HitMonLee hitMonLee) {
            labEnemigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/enemigosCombate/Hitmonlee.png")));
        } else if (enemigo instanceof Gyarados gyarados) {
            labEnemigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/enemigosCombate/Gyarados.png")));
        } else if (enemigo instanceof Rayquaza rayquaza) {
            labEnemigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/enemigosCombate/Rayquaza.png")));
        } else if (enemigo instanceof Arceus arceus) {
            labEnemigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/enemigosCombate/arceus.png")));
        }

        this.setVisible(true);
        butAtaquePrincipal.requestFocusInWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labCabecera = new javax.swing.JLabel();
        labFijoOro = new javax.swing.JLabel();
        labCantidadOro = new javax.swing.JLabel();
        labFijoDano = new javax.swing.JLabel();
        labCantidadDano = new javax.swing.JLabel();
        labFijoValorVariable = new javax.swing.JLabel();
        labCantidadValorVariable = new javax.swing.JLabel();
        labFijoEfectoDebilitador = new javax.swing.JLabel();
        labEfectoDebilitador = new javax.swing.JLabel();
        labStarter = new javax.swing.JLabel();
        labEnemigo = new javax.swing.JLabel();
        labVersus = new javax.swing.JLabel();
        labVidaStarter = new javax.swing.JLabel();
        labVidaEnemigo = new javax.swing.JLabel();
        butHuir = new javax.swing.JButton();
        butAtaquePrincipal = new javax.swing.JButton();
        butAtaqueSecundario = new javax.swing.JButton();

        setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        setMaximumSize(new java.awt.Dimension(800, 560));
        setMinimumSize(new java.awt.Dimension(800, 560));
        setPreferredSize(new java.awt.Dimension(800, 560));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        labCabecera.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labCabecera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCabecera.setText("COMBATE VS PIKACHU");

        labFijoOro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labFijoOro.setText("Oro:");

        labCantidadOro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labCantidadOro.setText("100");

        labFijoDano.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labFijoDano.setText("Daño:");

        labCantidadDano.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labCantidadDano.setText("10");

        labFijoValorVariable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labFijoValorVariable.setText("Daño Veneno:");

        labCantidadValorVariable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labCantidadValorVariable.setText("10");

        labFijoEfectoDebilitador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labFijoEfectoDebilitador.setText("Envenenado?");

        labEfectoDebilitador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labEfectoDebilitador.setText(" ");

        labStarter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/teemo.png"))); // NOI18N

        labEnemigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/enemigosCombate/pikachu.png"))); // NOI18N

        labVersus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labVersus.setForeground(new java.awt.Color(0, 0, 255));
        labVersus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labVersus.setText("VERSUS");

        labVidaStarter.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        labVidaStarter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labVidaStarter.setText("100");

        labVidaEnemigo.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        labVidaEnemigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labVidaEnemigo.setText("100");

        butHuir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        butHuir.setText("Huir");
        butHuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butHuirActionPerformed(evt);
            }
        });
        butHuir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                but_KeyPressed(evt);
            }
        });

        butAtaquePrincipal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        butAtaquePrincipal.setText("Arañazo");
        butAtaquePrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAtaquePrincipalActionPerformed(evt);
            }
        });
        butAtaquePrincipal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                but_KeyPressed(evt);
            }
        });

        butAtaqueSecundario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        butAtaqueSecundario.setText("Dardo venenoso");
        butAtaqueSecundario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAtaqueSecundarioActionPerformed(evt);
            }
        });
        butAtaqueSecundario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                but_KeyPressed(evt);
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(butHuir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butAtaquePrincipal)
                        .addGap(18, 18, 18)
                        .addComponent(butAtaqueSecundario))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labVidaStarter, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labStarter)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labFijoDano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labFijoValorVariable, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(labFijoOro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labCantidadValorVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labCantidadDano, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labCantidadOro))
                                .addGap(217, 217, 217)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labVersus, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labVidaEnemigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labEnemigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labFijoEfectoDebilitador)
                                .addGap(26, 26, 26)
                                .addComponent(labEfectoDebilitador)))
                        .addGap(93, 93, 93)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(labVersus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labFijoOro)
                            .addComponent(labCantidadOro))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labFijoEfectoDebilitador)
                                .addComponent(labEfectoDebilitador))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labFijoDano)
                                .addComponent(labCantidadDano)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labFijoValorVariable)
                                    .addComponent(labCantidadValorVariable))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labStarter))
                            .addComponent(labEnemigo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labVidaStarter, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labVidaEnemigo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butAtaqueSecundario)
                    .addComponent(butAtaquePrincipal)
                    .addComponent(butHuir))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void butHuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butHuirActionPerformed
        JOptionPane.showMessageDialog(
                this,
                "Huiste exitosamente",
                this.getName(),
                JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);
        this.getRootPane().getContentPane().remove(this);
    }//GEN-LAST:event_butHuirActionPerformed

    private void butAtaquePrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAtaquePrincipalActionPerformed
        starter.mainAttack(enemigo);
        if (starter.isStrikeTwice()) {
            JOptionPane.showMessageDialog(
                    this,
                    starter.getNameOfMainAttack() + " golpeó dos veces",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            starter.mainAttack(enemigo);
        }
        if (starter.isAbleToEquipAShield()) {
            ((Poppy) starter).setCarriesShield(true);
            labCantidadValorVariable.setText("Sí");
            JOptionPane.showMessageDialog(
                    this,
                    starter.getName() + " cogió un escudo tras golpear. +"
                    + ((Poppy) starter).getShieldProtection() + " escudo",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
        }

        labVidaEnemigo.setText(String.valueOf((int) enemigo.getHealth()));
        turnoEnemigo();
    }//GEN-LAST:event_butAtaquePrincipalActionPerformed

    private void butAtaqueSecundarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAtaqueSecundarioActionPerformed
        if (starter.isAbleToMissStrike()) {
            JOptionPane.showMessageDialog(
                    this,
                    starter.getName() + " falló la roca",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            starter.secondaryAttack(enemigo);
            if (starter instanceof Gnar gnar && gnar.isMonstruo()) {
                JOptionPane.showMessageDialog(
                        this,
                        starter.getName() + " golpeó con la roca" + (enemigo.isBlindedResistant() ? " a " : " y aturdió a ") + enemigo.getName(),
                        this.getName(),
                        JOptionPane.INFORMATION_MESSAGE);
                enemigo.setBlindedIfPossible(true);
            }
        }

        if (starter.isAbleToDodge() && !enemigo.isBlindedResistant()) {
            JOptionPane.showMessageDialog(
                    this,
                    starter.getName() + " esquivó el ataque de " + enemigo.getName() + " con su salto",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            enemigo.setBlindedIfPossible(true);
        }

        labVidaEnemigo.setText(String.valueOf((int) enemigo.getHealth()));
        turnoEnemigo();
    }//GEN-LAST:event_butAtaqueSecundarioActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        String keyCode = KeyEvent.getKeyText(evt.getKeyCode());

        if (keyCode.equals(Globals.letterMainAttackStarter)) {
            butAtaquePrincipalActionPerformed(new ActionEvent(starter, WIDTH, keyCode));
        } else if (keyCode.equals(Globals.letterSecondaryAttackStarter)) {
            butAtaqueSecundarioActionPerformed(new ActionEvent(starter, WIDTH, keyCode));
        } else if (keyCode.equals(Globals.letterEscape)) {
            butHuirActionPerformed(new ActionEvent(starter, WIDTH, keyCode));
        }
    }//GEN-LAST:event_formKeyPressed

    private void but_KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_but_KeyPressed
        formKeyPressed(evt); //teclado funciona aunque tengas foco en un boton
    }//GEN-LAST:event_but_KeyPressed

    private void eliminarBufosTemporalesStarters() {
        if (starter instanceof Teemo teemo) {
            //Vacío
        } else if (starter instanceof Gnar gnar) {
            gnar.setIsMonster(false);
            gnar.setMonsterCounter(0);
        } else if (starter instanceof Poppy poppy) {
            poppy.setCarriesShield(false);
        } else if (starter instanceof Yuumi yuumi) {
            //Vacío
        }
    }

    private void turnoEnemigo() {
        labVidaStarter.setText(String.valueOf((int) starter.getHealth()));

        if (estaEnemigoMuerto()) {
            return;
        }

        if (turnoEnemigoCegadoYEnvenenado()) {
            return;
        }
        if (turnoEnemigoVisionTorpeYEnvenenado()) {
            return;
        }
        if (turnoEnemigoCegado()) {
            return;
        }
        if (turnoEnemigoVisionTorpe()) {
            return;
        }
        if (turnoEnemigoConfundido()) {
            return;
        }
        if (turnoEnemigoEnvenenado()) {
            return;
        }

        turnoEnemigoSinEfectos();
    }

    private void isStarterMuerto() {
        if (starter.getHealth() <= 0) { //Al morir se pierde todo el oro
            starter.setGoldAmount(starter.getGoldAmount() / 2);
            starter.setHealth(starter.getMaximumHealth() / 2);
            if (starter instanceof Gnar gnar) {
                gnar.setIsMonster(false);
                gnar.setMonsterCounter(0);
            }
            JOptionPane.showMessageDialog(
                    GUICallBack,
                    starter.getName() + " ha muerto. Perdió la mitad de oro",
                    this.getName(),
                    JOptionPane.WARNING_MESSAGE);
            this.setVisible(false);
            this.getRootPane().getContentPane().remove(this);
        }
    }

    private void turnoEnemigoSinEfectos() {
        double dano = obtenerDanoEnemigo();

        if (enemigo.isAbleToDestroyItself()) {
            dano = starter.adjustAttackDamageRegardingResistance(dano) * 2.5;
            JOptionPane.showMessageDialog(
                    this,
                    enemigo.getName() + " se autodestruyó. Y la explosión causo "
                    + ((double) (int) (dano * 100)) / 100 + " daño a " + starter.getName(),
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            enemigo.setHealth(0);
            labVidaEnemigo.setText(String.valueOf((int) enemigo.getHealth()));
            starter.setHealth(starter.getHealth() - dano);
            labVidaStarter.setText(String.valueOf((int) starter.getHealth()));
            estaEnemigoMuerto();
            isStarterMuerto();
            return;
        }

        if (enemigo.isStrikeTwice()) {
            JOptionPane.showMessageDialog(
                    this,
                    enemigo.getName() + " golpeó dos veces",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            dano = dano * 2;
        }

        dano = starter.adjustAttackDamageRegardingResistance(dano);
        JOptionPane.showMessageDialog(
                this,
                enemigo.getName() + " inflingió: " + (int) (dano + 0.9) + " daño.",
                this.getName(),
                JOptionPane.INFORMATION_MESSAGE);
        starter.setHealth(starter.getHealth() - dano);
        labVidaStarter.setText(String.valueOf((int) starter.getHealth()));

        posibleTransformacionGnar();
        gnarPierdeUnTurnoComoMega();
        eliminarEscudoPoppy();
        isStarterMuerto();
    }

    private boolean turnoEnemigoConfundido() {
        if (enemigo.isConfused()) {
            labEfectoDebilitador.setText("Sí");
            double dano = obtenerDanoEnemigo();
            JOptionPane.showMessageDialog(
                    this,
                    enemigo.getName() + " está confundido y se inflingió: " + ((int) dano + 1) + " daño.",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            enemigo.setHealth(enemigo.getHealth() - dano);
            labVidaEnemigo.setText(String.valueOf((int) enemigo.getHealth()));
            gnarPierdeUnTurnoComoMega();
            eliminarEscudoPoppy();
            enemigo.setConfusedIfPossible(false);
            labEfectoDebilitador.setText("No");
            estaEnemigoMuerto();
            return true;
        }
        return false;
    }

    private boolean turnoEnemigoCegado() {
        if (enemigo.isBlinded()) {
            JOptionPane.showMessageDialog(
                    this,
                    enemigo.getName() + ((starter instanceof Teemo || starter instanceof Yuumi)
                    ? " fue cegado y no atacó."
                    : ((starter instanceof Gnar)
                            ? " no atacó."
                            : "")),
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            enemigo.setBlindedIfPossible(false);
            gnarPierdeUnTurnoComoMega();
            eliminarEscudoPoppy();
            return true;
        }
        return false;
    }

    private boolean turnoEnemigoVisionTorpe() {
        if (enemigo.isPoorSight()) {
            JOptionPane.showMessageDialog(
                    this,
                    starter.getName() + " se camufló y " + enemigo.getName() + " no le encontró",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            enemigo.setPoorSightIfPossible(false);
            gnarPierdeUnTurnoComoMega();
            eliminarEscudoPoppy();
            return true;
        }
        return false;
    }

    private boolean turnoEnemigoEnvenenado() {
        if (enemigo.isPoisoned()) {
            labEfectoDebilitador.setText("Sí");
            danoVenenoYReducirDuracion();
            if (enemigo.getPoisonedTurns() == 2) {
                JOptionPane.showMessageDialog(
                        this,
                        enemigo.getName() + " fue envenenado",
                        this.getName(),
                        JOptionPane.INFORMATION_MESSAGE);
            }
            if (!estaEnemigoMuerto()) {
                turnoEnemigoSinEfectos();
            }
            isStarterMuerto();
            return true;
        }
        return false;
    }

    private boolean turnoEnemigoCegadoYEnvenenado() {
        if (enemigo.isPoisoned() && enemigo.isBlinded()) {
            labEfectoDebilitador.setText("Sí");
            JOptionPane.showMessageDialog(
                    this,
                    enemigo.getName() + " fue "
                    + ((enemigo.getPoisonedTurns() == 3)
                    ? "envenenado y " : "") + "cegado",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            danoVenenoYReducirDuracion();
            enemigo.setBlindedIfPossible(false);
            estaEnemigoMuerto();
            gnarPierdeUnTurnoComoMega();
            eliminarEscudoPoppy();
            return true;
        }
        return false;
    }

    private boolean turnoEnemigoVisionTorpeYEnvenenado() {
        if (enemigo.isPoisoned() && enemigo.isPoorSight()) {
            labEfectoDebilitador.setText("Sí");
            danoVenenoYReducirDuracion();
            JOptionPane.showMessageDialog(
                    this,
                    enemigo.getName()
                    + ((enemigo.getPoisonedTurns() == 2) ? " fue envenenado y" : "") + " no ve a "
                    + starter.getName() + " porque se camufló",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            enemigo.setPoorSightIfPossible(false);
            estaEnemigoMuerto();
            gnarPierdeUnTurnoComoMega();
            eliminarEscudoPoppy();
            return true;
        }
        return false;
    }

    private void danoVenenoYReducirDuracion() {
        if (enemigo.isPoisoned()) {
            enemigo.setHealth(enemigo.getHealth() - ((Teemo) starter).getPoisonDamage());
            labVidaEnemigo.setText(String.valueOf((int) enemigo.getHealth()));
            enemigo.setPoisonedTurns(enemigo.getPoisonedTurns() - 1);
            if (enemigo.getPoisonedTurns() <= 0) {
                enemigo.setPoisonedIfPossible(false);
                labEfectoDebilitador.setText("No");
            }
        }
    }

    private void posibleTransformacionGnar() {
        if (starter instanceof Gnar gnar && !gnar.isMonstruo()) {
            double num = (Math.random() * 100 + gnar.getResistance() / 10); //23+3%(26) al principio 23+7%(30%) con la resistencia al max
            if (num >= 77) {
                gnar.setIsMonster(true);
                gnar.setMonsterCounter(4);

                JOptionPane.showMessageDialog(
                        this,
                        "Gnar se transformó en MegaGnar",
                        this.getName(),
                        JOptionPane.INFORMATION_MESSAGE);
                labStarter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/gnarMega.png")));
                refrescarBotonesAtaque();
            }
        }
    }

    private void gnarPierdeUnTurnoComoMega() {
        if (starter instanceof Gnar gnar && gnar.isMonstruo()) {
            gnar.setMonsterCounter(gnar.getMonsterCounter() - 1);
            if (gnar.getMonsterCounter() <= 0) {
                gnar.setIsMonster(false);
                JOptionPane.showMessageDialog(
                        this,
                        "MegaGnar volvió a su forma de gnar",
                        this.getName(),
                        JOptionPane.INFORMATION_MESSAGE);
                labStarter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/gnarMini.png")));
                refrescarBotonesAtaque();
            }
        }
    }

    public void refrescarBotonesAtaque() {
        butAtaquePrincipal.setText(starter.getNameOfMainAttack());
        butAtaqueSecundario.setText(starter.getNameOfSecondaryAttack());
    }

    private void eliminarEscudoPoppy() {
        if (starter instanceof Poppy poppy && poppy.isCarriesShield()) {
            poppy.setCarriesShield(false);
            labCantidadValorVariable.setText("No");
        }
    }

    private boolean estaEnemigoMuerto() {
        if (enemigo.getHealth() <= 0) {
            starter.setGoldAmount(starter.getGoldAmount() + (int) enemigo.getPrize());
            eliminarBufosTemporalesStarters();
            JOptionPane.showMessageDialog(this,
                    "Has vencido a " + enemigo.getName() + " y obtuviste: " + enemigo.getPrize(),
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            this.getRootPane().getContentPane().remove(this);
            desbloquearRecompensas();
            mensajePorPasarseElJuego();
            return true;
        }
        return false;
    }

    private void mensajePorPasarseElJuego() throws HeadlessException {
        if (enemigo instanceof Arceus) {
            JOptionPane.showMessageDialog(GUICallBack,
                    "Enhorabuena! Espero que hayas disfrutado del juego.\n"
                    + "\n"
                    + "Para ver otros proyectos que he hecho:\n"
                    + "GitHub: https://github.com/CosmeValera",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE,
                    new javax.swing.ImageIcon(getClass().getResource("/icons/enemigosCombate/huggingFace.png")));
        }
    }

    private void desbloquearRecompensas() {
        starter.setDefeatedEnemies(Starter.getDefeatedEnemies() + 1);

        if (Starter.getDefeatedEnemies() == Starter.getVictoriesForFirstPrize()) {
            desbloquearSegundoStarter();
        } else if (Starter.getDefeatedEnemies() == Starter.getVictoriesForSecondPrize()) {
            desbloquearTercerStarter();
        } else if (Starter.getDefeatedEnemies() == Starter.getVictoriesForThirdPrize()) {
            desbloquearCuartoStarter();
        }

    }

    private void desbloquearSegundoStarter() throws HeadlessException {
        GUICallBack.getJMenuBar().getMenu(1).getItem(2).setVisible(true); //Visible panelCambiar
        GUICallBack.clickCambiarEspecial();
        JOptionPane.showMessageDialog(GUICallBack,
                "Has avanzado tanto que te mereces poder"
                + "\ndisponer de otro campeón. Enhorabuena!!"
                + "\nEnemigos vencidos: " + Starter.getDefeatedEnemies(),
                this.getName(),
                JOptionPane.INFORMATION_MESSAGE);
        GUICallBack.getJMenuBar().getMenu(0).getItem(3).setVisible(true); //Visible Gyarados
    }

    private void desbloquearTercerStarter() throws HeadlessException {
        GUICallBack.clickCambiarEspecial();
        JOptionPane.showMessageDialog(GUICallBack,
                "Has avanzado tanto que te mereces poder"
                + "\ndisponer de otro campeón. Enhorabuena!!"
                + "\nEnemigos vencidos: " + Starter.getDefeatedEnemies(),
                this.getName(),
                JOptionPane.INFORMATION_MESSAGE);
        GUICallBack.getJMenuBar().getMenu(0).getItem(4).setVisible(true); //Visible RayQuaza
    }

    private void desbloquearCuartoStarter() throws HeadlessException {
        GUICallBack.clickCambiarEspecial();
        JOptionPane.showMessageDialog(GUICallBack,
                "Has avanzado tanto que te mereces poder"
                + "\ndisponer de otro campeón. Enhorabuena!!"
                + "\nTambién puedes enfrentarte al dios Arceus."
                + "\nEnemigos vencidos: " + Starter.getDefeatedEnemies(),
                this.getName(),
                JOptionPane.INFORMATION_MESSAGE);
        GUICallBack.getJMenuBar().getMenu(0).getItem(5).setVisible(true); //Visible Arceus
    }

    private double obtenerDanoEnemigo() {
        double dano = enemigo.getAttackDamage();
        int num = (int) (Math.random() * 5 + 1);
        switch (num) {
            case 1:
                dano = enemigo.getAttackDamage() * .7;
                break;
            case 2:
                dano = enemigo.getAttackDamage() * .85;
                break;
            case 3:
                dano = enemigo.getAttackDamage();
                break;
            case 4:
                dano = enemigo.getAttackDamage() * 1.15;
                break;
            case 5:
                dano = enemigo.getAttackDamage() * 1.3;
                break;
        }
        return dano;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAtaquePrincipal;
    private javax.swing.JButton butAtaqueSecundario;
    private javax.swing.JButton butHuir;
    private javax.swing.JLabel labCabecera;
    private javax.swing.JLabel labCantidadDano;
    private javax.swing.JLabel labCantidadOro;
    private javax.swing.JLabel labCantidadValorVariable;
    private javax.swing.JLabel labEfectoDebilitador;
    private javax.swing.JLabel labEnemigo;
    private javax.swing.JLabel labFijoDano;
    private javax.swing.JLabel labFijoEfectoDebilitador;
    private javax.swing.JLabel labFijoOro;
    private javax.swing.JLabel labFijoValorVariable;
    private javax.swing.JLabel labStarter;
    private javax.swing.JLabel labVersus;
    private javax.swing.JLabel labVidaEnemigo;
    private javax.swing.JLabel labVidaStarter;
    // End of variables declaration//GEN-END:variables

}
