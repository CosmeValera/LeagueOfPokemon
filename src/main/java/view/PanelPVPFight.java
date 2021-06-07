package view;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Globals;
import model.Gnar;
import model.Poppy;
import model.Starter;
import model.Teemo;
import model.Yuumi;

public class PanelPVPFight extends javax.swing.JPanel {

    private Starter starterUno;
    private Starter starterDos;

    private JPanel panelCallback;
    private String nombreJugador1;
    private String nombreJugador2;

    private int contadorBotonesBloqueados;

    public PanelPVPFight() {
        initComponents();
    }

    public void mostrar(JPanel panelCallBack, String nombreJugador1, String nombreJugador2) {
        starterUno = Globals.starter;
        starterDos = Globals.starter2;

        this.panelCallback = panelCallBack;
        this.nombreJugador1 = nombreJugador1;
        this.nombreJugador2 = nombreJugador2;

        butStarter1AtaquePrincipal.setText(starterUno.getNameOfMainAttack());
        butStarter1AtaqueSecundario.setText(starterUno.getNameOfSecondaryAttack());
        labVidaStarter1.setText(String.valueOf((int) starterUno.getHealth()));
        labCantidadDano1.setText(String.valueOf((int) starterUno.getAttackDamage()));
        if (starterUno instanceof Teemo teemo) {
            labFijoValorVariable1.setText("Daño Veneno:");
            labCantidadValorVariable1.setText(String.valueOf((int) teemo.getPoisonDamage()));
            labStarter1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/teemo.png")));
        } else if (starterUno instanceof Gnar gnar) {
            labFijoValorVariable1.setText("Resistencia:");
            labCantidadValorVariable1.setText(String.valueOf((int) gnar.getResistance()));
            labStarter1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/gnarMini.png")));
            labFijoCegado2.setText("Aturdido:"); //No ciega a enemigos, aturde
        } else if (starterUno instanceof Poppy poppy) {
            labFijoValorVariable1.setText("Escudo:");
            labCantidadValorVariable1.setText((poppy.isCarriesShield()) ? "Sí" : "No");
            labStarter1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/Poppy.png")));
        } else if (starterUno instanceof Yuumi yuumi) {
            labFijoValorVariable1.setText("Sanación:");
            labCantidadValorVariable1.setText(String.valueOf((int) yuumi.getHealing()));
            labStarter1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/yuumi.png")));
        }

        butStarter2AtaquePrincipal.setText(starterDos.getNameOfMainAttack());
        butStarter2AtaqueSecundario.setText(starterDos.getNameOfSecondaryAttack());
        labVidaStarter2.setText(String.valueOf((int) starterDos.getHealth()));
        labCantidadDano2.setText(String.valueOf((int) starterDos.getAttackDamage()));
        if (starterDos instanceof Teemo teemo) {
            labFijoValorVariable2.setText("Daño Veneno:");
            labCantidadValorVariable2.setText(String.valueOf((int) teemo.getPoisonDamage()));
            labStarter2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/teemo.png")));
        } else if (starterDos instanceof Gnar gnar) {
            labFijoValorVariable2.setText("Resistencia:");
            labCantidadValorVariable2.setText(String.valueOf((int) gnar.getResistance()));
            labStarter2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/gnarMini.png")));
            labFijoCegado1.setText("Aturdido:"); //No ciega a enemigos, aturde
        } else if (starterDos instanceof Poppy poppy) {
            labFijoValorVariable2.setText("Escudo:");
            labCantidadValorVariable2.setText((poppy.isCarriesShield()) ? "Sí" : "No");
            labStarter2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/Poppy.png")));
        } else if (starterDos instanceof Yuumi yuumi) {
            labFijoValorVariable2.setText("Sanación:");
            labCantidadValorVariable2.setText(String.valueOf((int) yuumi.getHealing()));
            labStarter2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/yuumi.png")));
        }

        this.setVisible(true);
        this.requestFocusInWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labCabecera = new javax.swing.JLabel();
        labFijoDano1 = new javax.swing.JLabel();
        labCantidadDano1 = new javax.swing.JLabel();
        labFijoValorVariable1 = new javax.swing.JLabel();
        labCantidadValorVariable1 = new javax.swing.JLabel();
        labFijoEnvenenado1 = new javax.swing.JLabel();
        labEsEnvenenado1 = new javax.swing.JLabel();
        labFijoConfundido1 = new javax.swing.JLabel();
        labEsConfundido1 = new javax.swing.JLabel();
        labFijoCegado1 = new javax.swing.JLabel();
        labEsCegado1 = new javax.swing.JLabel();
        labFijoDano2 = new javax.swing.JLabel();
        labCantidadDano2 = new javax.swing.JLabel();
        labFijoValorVariable2 = new javax.swing.JLabel();
        labCantidadValorVariable2 = new javax.swing.JLabel();
        labFijoEnvenenado2 = new javax.swing.JLabel();
        labEsEnvenenado2 = new javax.swing.JLabel();
        labFijoConfundido2 = new javax.swing.JLabel();
        labEsConfundido2 = new javax.swing.JLabel();
        labFijoCegado2 = new javax.swing.JLabel();
        labEsCegado2 = new javax.swing.JLabel();
        labStarter1 = new javax.swing.JLabel();
        labVidaStarter1 = new javax.swing.JLabel();
        labVersus = new javax.swing.JLabel();
        labStarter2 = new javax.swing.JLabel();
        labVidaStarter2 = new javax.swing.JLabel();
        butStarter1AtaquePrincipal = new javax.swing.JButton();
        butStarter1AtaqueSecundario = new javax.swing.JButton();
        butStarter2AtaquePrincipal = new javax.swing.JButton();
        butStarter2AtaqueSecundario = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(800, 560));
        setMinimumSize(new java.awt.Dimension(800, 560));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        labCabecera.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labCabecera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCabecera.setText("COMBATE PVP");

        labFijoDano1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labFijoDano1.setText("Daño:");

        labCantidadDano1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labCantidadDano1.setText("10");

        labFijoValorVariable1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labFijoValorVariable1.setText("Daño Veneno:");

        labCantidadValorVariable1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labCantidadValorVariable1.setText("10");

        labFijoEnvenenado1.setText("Envenenado:");

        labEsEnvenenado1.setText("No");

        labFijoConfundido1.setText("Confundido:");

        labEsConfundido1.setText("No");

        labFijoCegado1.setText("Cegado:");

        labEsCegado1.setText("No");

        labFijoDano2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labFijoDano2.setText("Daño:");

        labCantidadDano2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labCantidadDano2.setText("10");

        labFijoValorVariable2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labFijoValorVariable2.setText("Daño Veneno:");

        labCantidadValorVariable2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labCantidadValorVariable2.setText("10");

        labFijoEnvenenado2.setText("Envenenado:");

        labEsEnvenenado2.setText("No");

        labFijoConfundido2.setText("Confundido:");

        labEsConfundido2.setText("No");

        labFijoCegado2.setText("Cegado:");

        labEsCegado2.setText("No");

        labStarter1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/teemo.png"))); // NOI18N

        labVidaStarter1.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        labVidaStarter1.setText("100");

        labVersus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labVersus.setForeground(new java.awt.Color(0, 0, 255));
        labVersus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labVersus.setText("VERSUS");

        labStarter2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/teemo.png"))); // NOI18N

        labVidaStarter2.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        labVidaStarter2.setText("100");

        butStarter1AtaquePrincipal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        butStarter1AtaquePrincipal.setText("Arañazo");
        butStarter1AtaquePrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_ActionPerformed(evt);
            }
        });
        butStarter1AtaquePrincipal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                but_KeyPressed(evt);
            }
        });

        butStarter1AtaqueSecundario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        butStarter1AtaqueSecundario.setText("Dardo Venenoso");
        butStarter1AtaqueSecundario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_ActionPerformed(evt);
            }
        });
        butStarter1AtaqueSecundario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                but_KeyPressed(evt);
            }
        });

        butStarter2AtaquePrincipal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        butStarter2AtaquePrincipal.setText("Placaje con escudo");
        butStarter2AtaquePrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_ActionPerformed(evt);
            }
        });
        butStarter2AtaquePrincipal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                but_KeyPressed(evt);
            }
        });

        butStarter2AtaqueSecundario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        butStarter2AtaqueSecundario.setText("Martillazo");
        butStarter2AtaqueSecundario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_ActionPerformed(evt);
            }
        });
        butStarter2AtaqueSecundario.addKeyListener(new java.awt.event.KeyAdapter() {
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butStarter1AtaquePrincipal)
                                .addGap(18, 18, 18)
                                .addComponent(butStarter1AtaqueSecundario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(butStarter2AtaquePrincipal)
                                .addGap(18, 18, 18)
                                .addComponent(butStarter2AtaqueSecundario))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labFijoDano1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labFijoValorVariable1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labCantidadValorVariable1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labCantidadDano1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labFijoDano2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(labCantidadDano2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labFijoValorVariable2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(labCantidadValorVariable2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(labFijoCegado2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labFijoConfundido2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labEsConfundido2)
                                            .addComponent(labEsCegado2)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labFijoEnvenenado2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(labEsEnvenenado2)))))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(labFijoCegado1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labFijoConfundido1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labEsConfundido1)
                                    .addComponent(labEsCegado1)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labFijoEnvenenado1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labEsEnvenenado1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(labStarter1)
                        .addGap(18, 18, 18)
                        .addComponent(labVersus, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labStarter2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(labVidaStarter1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labVidaStarter2)
                .addGap(183, 183, 183))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labFijoDano1)
                        .addComponent(labCantidadDano1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labCantidadDano2)
                        .addComponent(labFijoDano2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labFijoValorVariable1)
                        .addComponent(labCantidadValorVariable1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labCantidadValorVariable2)
                        .addComponent(labFijoValorVariable2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labFijoEnvenenado1)
                            .addComponent(labEsEnvenenado1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labFijoConfundido1)
                            .addComponent(labEsConfundido1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labFijoCegado1)
                            .addComponent(labEsCegado1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labFijoEnvenenado2)
                            .addComponent(labEsEnvenenado2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labFijoConfundido2)
                            .addComponent(labEsConfundido2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labFijoCegado2)
                            .addComponent(labEsCegado2))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(labStarter2)
                        .addComponent(labStarter1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(labVersus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labVidaStarter1)
                    .addComponent(labVidaStarter2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butStarter1AtaquePrincipal)
                    .addComponent(butStarter1AtaqueSecundario)
                    .addComponent(butStarter2AtaqueSecundario)
                    .addComponent(butStarter2AtaquePrincipal))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void but_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_ActionPerformed
        if (evt.getSource() == butStarter1AtaquePrincipal) {
            if (butStarter1AtaqueSecundario.isEnabled()) {
                butStarter1AtaqueSecundario.setEnabled(false);
                contadorBotonesBloqueados++;
            }
        } else if (evt.getSource() == butStarter1AtaqueSecundario) {
            if (butStarter1AtaquePrincipal.isEnabled()) {
                butStarter1AtaquePrincipal.setEnabled(false);
                contadorBotonesBloqueados++;
            }
        } else if (evt.getSource() == butStarter2AtaquePrincipal) {
            if (butStarter2AtaqueSecundario.isEnabled()) {
                butStarter2AtaqueSecundario.setEnabled(false);
                contadorBotonesBloqueados++;
            }
        } else if (evt.getSource() == butStarter2AtaqueSecundario) {
            if (butStarter2AtaquePrincipal.isEnabled()) {
                butStarter2AtaquePrincipal.setEnabled(false);
                contadorBotonesBloqueados++;
            }
        }
        
        if (contadorBotonesBloqueados == 2) {
            empezarUnCombate();
            resetearBotones();
        }
    }//GEN-LAST:event_but_ActionPerformed

    private void but_KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_but_KeyPressed
        formKeyPressed(evt); //teclado funciona aunque tengas foco en un boton
    }//GEN-LAST:event_but_KeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        String keyCode = KeyEvent.getKeyText(evt.getKeyCode());

        if (keyCode.equals(Globals.letterMainAttackStarter)) {
            if (butStarter1AtaquePrincipal.isEnabled()
                    && butStarter1AtaqueSecundario.isEnabled()) {
                butStarter1AtaqueSecundario.setEnabled(false);
                contadorBotonesBloqueados++;
            }
        } else if (keyCode.equals(Globals.letterSecondaryAttackStarter)) {
            if (butStarter1AtaquePrincipal.isEnabled()
                    && butStarter1AtaqueSecundario.isEnabled()) {
                butStarter1AtaquePrincipal.setEnabled(false);
                contadorBotonesBloqueados++;
            }
        } else if (keyCode.equals(Globals.letterMainAttackStarter2)) {
            if (butStarter2AtaquePrincipal.isEnabled()
                    && butStarter2AtaqueSecundario.isEnabled()) {
                butStarter2AtaqueSecundario.setEnabled(false);
                contadorBotonesBloqueados++;
            }
        } else if (keyCode.equals(Globals.letterSecondaryAttackStarter2)) {
            if (butStarter2AtaquePrincipal.isEnabled()
                    && butStarter2AtaqueSecundario.isEnabled()) {
                butStarter2AtaquePrincipal.setEnabled(false);
                contadorBotonesBloqueados++;
            }
        }
        
        if (contadorBotonesBloqueados == 2) {
            empezarUnCombate();
            resetearBotones();
        }
    }//GEN-LAST:event_formKeyPressed

    private void empezarUnCombate() {

        double danoDeStarterUno = obtenerDanoBrutoYEfectosFuturosStarterUno();
        double danoDeStarterDos = obtenerDanoBrutoYEfectosFuturosStarterDos();

        //Daño bruto - Resistencias = Daño neto
        danoDeStarterUno = obtenerDanoAjustadoAResistencia(danoDeStarterUno, starterUno, starterDos);
        danoDeStarterDos = obtenerDanoAjustadoAResistencia(danoDeStarterDos, starterDos, starterUno);

        turnoGolpear(danoDeStarterUno, starterUno, starterDos);
        turnoGolpear(danoDeStarterDos, starterDos, starterUno);
        refrescarLabelVida();

        eliminarEfectosYAplicarVeneno(starterUno, starterDos);
        eliminarEfectosYAplicarVeneno(starterDos, starterUno);
        refrescarLabelVida();

        efectuarEfectosA(starterUno);
        efectuarEfectosA(starterDos);

        esAlgunStarterMuerto();
    }

    private double obtenerDanoBrutoYEfectosFuturosStarterUno() {
        if (butStarter1AtaquePrincipal.isEnabled()) {
            return obtenerDanoAtaquePrincipal(starterUno, starterDos);
        } else if (butStarter1AtaqueSecundario.isEnabled()) {
            return obtenerDanoAtaqueSecundario(starterUno, starterDos);
        }
        return 0;
    }

    private double obtenerDanoBrutoYEfectosFuturosStarterDos() {
        if (butStarter2AtaquePrincipal.isEnabled()) {
            return obtenerDanoAtaquePrincipal(starterDos, starterUno);
        } else if (butStarter2AtaqueSecundario.isEnabled()) {
            return obtenerDanoAtaqueSecundario(starterDos, starterUno);
        }
        return 0;
    }

    private double obtenerDanoAtaquePrincipal(Starter starter, Starter starterEnemigo) {
        double danoDeStarter = starter.getAttackDamageOfMainAttack();

        danoDeStarter = gnarStrikeTwice(starter, danoDeStarter);
        poppyShield(starter);
        teemoHide(starter, starterEnemigo);
        return danoDeStarter;
    }

    private double obtenerDanoAtaqueSecundario(Starter starter, Starter starterEnemigo) {
        double danoDeStarter = starter.getAttackDamageOfSecondaryAttack();

        danoDeStarter = megaGnarMissStrikeOrThrowRock(starter, danoDeStarter, starterEnemigo);
        miniGnarDodge(starter, starterEnemigo);
        poppyAbleToConfuse(starterEnemigo, starter);
        teemoUseBlowPipe(starterEnemigo, starter);
        yuumiFinalChapter(starterEnemigo, starter);
        return danoDeStarter;
    }

    private double gnarStrikeTwice(Starter starter, double danoDeStarter) throws HeadlessException {
        if (starter.isAbleToStrikeTwice() && !starter.isBlinded()
                && !starter.isPoorSight()) {
            JOptionPane.showMessageDialog(
                    this,
                    starter.getName()
                    + (starter.isConfused() ? " se" : "") + " golpeó dos veces"
                    + (starter.isConfused() ? " a si mismo" : ""),
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            danoDeStarter = danoDeStarter * 2;
        }
        return danoDeStarter;
    }

    private void poppyShield(Starter starter) throws HeadlessException {
        if (starter.isAbleToEquipAShield()) {
            ((Poppy) starter).setCarriesShield(true);
            JOptionPane.showMessageDialog(
                    this,
                    starter.getName() + " cogió un escudo"
                    + ((!starter.isBlinded() && !starter.isPoorSight()
                    && !starter.isConfused())
                    ? " tras golpear. +" : ". +")
                    + ((Poppy) starter).getShieldProtection() + " escudo",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            cambiarLabelValorVariable(starter, "Sí");
        }
    }

    private void teemoHide(Starter starter, Starter starterEnemigo) throws HeadlessException {
        if (!starter.isBlinded() && !starter.isPoorSight() && !starter.isConfused()
                && starter.isAbleToHide(starterEnemigo)) {
            if (starterEnemigo.isWillBePoorSight()) {
                JOptionPane.showMessageDialog(
                        this,
                        starter.getName() + " se ha camuflado y " + starterEnemigo.getName() + " no lo verá",
                        this.getName(),
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private double megaGnarMissStrikeOrThrowRock(Starter starter, double danoDeStarter, Starter starterEnemigo) throws HeadlessException {
        if (starter.isAbleToMissStrike()) {
            JOptionPane.showMessageDialog(
                    this,
                    starter.getName() + " falló la roca",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            danoDeStarter = 0;
        } else {
            if (starter instanceof Gnar gnar && gnar.isMonstruo()
                    && !gnar.isBlinded() && !gnar.isConfused()
                    && !gnar.isPoorSight()) {
                JOptionPane.showMessageDialog(
                        this,
                        starter.getName() + " golpeó con la roca" + (starterEnemigo.isBlindedResistant()
                        ? " a "
                        : " y aturdió a ") + starterEnemigo.getName(),
                        this.getName(),
                        JOptionPane.INFORMATION_MESSAGE);
                starterEnemigo.setWillBeBlinded(true);
            }
        }
        return danoDeStarter;
    }

    private void miniGnarDodge(Starter starter, Starter starterEnemigo) throws HeadlessException {
        if (starter.isAbleToDodge() && !starterEnemigo.isBlindedResistant()
                && !starter.isBlinded() && !starter.isPoorSight() && !starter.isConfused()) {
            JOptionPane.showMessageDialog(
                    this,
                    starter.getName() + " esquivará el ataque de " + starterEnemigo.getName() + " con su salto",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            starterEnemigo.setWillBeBlinded(true);
        }
    }

    private void poppyAbleToConfuse(Starter starterEnemigo, Starter starter) throws HeadlessException {
        if (!starterEnemigo.isConfusionResistant() && !starter.isBlinded()
                && !starter.isPoorSight() && !starter.isConfused() && starter.isAbleToConfuse(starterEnemigo)) {
            JOptionPane.showMessageDialog(
                    this,
                    starterEnemigo.getName() + " será confundido por el martillazo de " + starter.getName(),
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            starterEnemigo.setWillBeConfused(true);
        }
    }

    private void teemoUseBlowPipe(Starter starterEnemigo, Starter starter) throws HeadlessException {
        if (!starterEnemigo.isConfusionResistant() && !starter.isBlinded() && !starter.isPoorSight()
                && !starter.isConfused() && starter.isAbleToUseBlowPipe(starterEnemigo)) {
            if (starterEnemigo.isWillBeBlinded() && starterEnemigo.isWillBePoisoned()) {
                JOptionPane.showMessageDialog(
                        this,
                        starterEnemigo.getName() + " será envenenado y cegado",
                        this.getName(),
                        JOptionPane.INFORMATION_MESSAGE);
            } else if (starterEnemigo.isWillBeBlinded()) {
                JOptionPane.showMessageDialog(
                        this,
                        starterEnemigo.getName() + " será cegado",
                        this.getName(),
                        JOptionPane.INFORMATION_MESSAGE);
            } else if (starterEnemigo.isWillBePoisoned()) {
                JOptionPane.showMessageDialog(
                        this,
                        starterEnemigo.getName() + " será envenenado",
                        this.getName(),
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private void yuumiFinalChapter(Starter starterEnemigo, Starter starter) throws HeadlessException {
        if (!starterEnemigo.isBlindedResistant() && !starter.isBlinded()
                && !starter.isPoorSight() && !starter.isConfused() && starter.isAbleToReadTheFinalChapter(starterEnemigo)) {
            if (starterEnemigo.isWillBeBlinded()) {
                JOptionPane.showMessageDialog(
                        this,
                        starterEnemigo.getName() + " será cegado tras vislumbrar the Final Chapter",
                        this.getName(),
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private double obtenerDanoAjustadoAResistencia(double danoStarter, Starter starter, Starter starterEnemigo) {
        if (!starter.isConfused()) {
            danoStarter = starterEnemigo.adjustAttackDamageRegardingResistance(danoStarter);
        } else {
            danoStarter = starter.adjustAttackDamageRegardingResistance(danoStarter);
        }
        return danoStarter;
    }

    private void turnoGolpear(double dano, Starter starter, Starter starterEnemigo) {
        refrescarLabelVida();

        if (turnoStarterCegadoYEnvenenado(dano, starter, starterEnemigo)) {
            return;
        }
        if (turnoStarterVisionTorpeYEnvenenado(dano, starter, starterEnemigo)) {
            return;
        }
        if (turnoStarterCegado(dano, starter, starterEnemigo)) {
            return;
        }
        if (turnoStarterVisionTorpe(dano, starter, starterEnemigo)) {
            return;
        }
        if (turnoStarterConfundido(dano, starter, starterEnemigo)) {
            return;
        }
        if (turnoStarterEnvenenado(dano, starter, starterEnemigo)) {
            return;
        }

        turnoStarterSinEfectos(dano, starter, starterEnemigo);
    }

    private boolean turnoStarterCegadoYEnvenenado(double dano, Starter starter, Starter starterEnemigo) {
        if (starter.isPoisoned() && starter.isBlinded()) {
            cambiarLabelEsEnvenenado(starter, "Sí");
            cambiarLabelEsCegado(starter, "Sí");
            JOptionPane.showMessageDialog(
                    this,
                    starter.getName() + " está "
                    + ((starter.getPoisonedTurns() == 3)
                    ? "envenenado y " : "") + "cegado",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
        return false;
    }

    private boolean turnoStarterVisionTorpeYEnvenenado(double dano, Starter starter, Starter starterEnemigo) {
        if (starter.isPoisoned() && starter.isPoorSight()) {
            cambiarLabelEsEnvenenado(starter, "Sí");
            cambiarLabelEsCegado(starter, "Sí");
            JOptionPane.showMessageDialog(
                    this,
                    starter.getName()
                    + ((starter.getPoisonedTurns() == 3) ? " está envenenado y" : "") + " no verá a "
                    + starterEnemigo.getName() + " porque se camufló",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
        return false;
    }

    private boolean turnoStarterCegado(double dano, Starter starter, Starter starterEnemigo) {
        if (starter.isBlinded()) {
            cambiarLabelEsCegado(starterEnemigo, "Sí");
            JOptionPane.showMessageDialog(
                    this,
                    starter.getName() + ((starterEnemigo instanceof Teemo || starterEnemigo instanceof Yuumi)
                    ? " está cegado y no atacó."
                    : ((starterEnemigo instanceof Gnar)
                            ? " no atacó."
                            : "")),
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
        return false;
    }

    private boolean turnoStarterVisionTorpe(double dano, Starter starter, Starter starterEnemigo) {
        if (starter.isPoorSight()) {
            cambiarLabelEsCegado(starterEnemigo, "Sí");
            JOptionPane.showMessageDialog(
                    this,
                    starterEnemigo.getName() + " se camufló y " + starter.getName() + " no le encontró",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
        return false;
    }

    private boolean turnoStarterConfundido(double dano, Starter starter, Starter starterEnemigo) {
        if (starter.isConfused()) {
            cambiarLabelEsConfundido(starter, "Sí");
            JOptionPane.showMessageDialog(
                    this,
                    starter.getName() + " está confundido y se inflingió: " + ((int) dano + 1) + " daño.",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            starter.setHealth(starter.getHealth() - dano);
            return true;
        }
        return false;
    }

    private boolean turnoStarterEnvenenado(double dano, Starter starter, Starter starterEnemigo) {
        if (starter.isPoisoned()) {
            cambiarLabelEsEnvenenado(starter, "Sí");
            turnoStarterSinEfectos(dano, starter, starterEnemigo);
            return true;
        }
        return false;
    }

    private void turnoStarterSinEfectos(double dano, Starter starter, Starter starterEnemigo) {
        JOptionPane.showMessageDialog(
                this,
                starter.getName() + " inflingió: " + (int) (dano + 0.9) + " daño.",
                this.getName(),
                JOptionPane.INFORMATION_MESSAGE);
        starterEnemigo.setHealth(starterEnemigo.getHealth() - dano);
    }

    private void eliminarEfectosYAplicarVeneno(Starter starter, Starter starterEnemigo) {

        posibleTransformacionGnar(starter, starterEnemigo);
        gnarPierdeUnTurnoComoMega(starter);

        cambiarLabelEsCegado(starter, "No");
        starter.setBlindedIfPossible(false);
        starter.setPoorSightIfPossible(false);

        cambiarLabelEsConfundido(starter, "No");
        starter.setConfusedIfPossible(false);

        if (starter instanceof Poppy poppy && poppy.isCarriesShield()) {
            cambiarLabelValorVariable(starter, "No");
            poppy.setCarriesShield(false);
        }

        if (!esEnvenenadoTrasAplicarVenenoUnaVez(starter, starterEnemigo)) {
            cambiarLabelEsEnvenenado(starter, "No");
            starter.setPoisonedIfPossible(false);
        }
    }

    private boolean esEnvenenadoTrasAplicarVenenoUnaVez(Starter starter, Starter starterEnemigo) {
        if (starter.isPoisoned()) {
            starter.setHealth(starter.getHealth() - ((Teemo) starterEnemigo).getPoisonDamage());
            starter.setPoisonedTurns(starter.getPoisonedTurns() - 1);
            if (starter.getPoisonedTurns() <= 0) {
                return false;
            }
        }
        return true;
    }

    private void efectuarEfectosA(Starter starter) {
        if (starter.isWillBeBlinded()) {
            starter.setWillBeBlinded(false);
            starter.setBlindedIfPossible(true);
            cambiarLabelEsCegado(starter, "Sí");
        }
        if (starter.isWillBePoorSight()) {
            starter.setWillBePoorSight(false);
            starter.setPoorSightIfPossible(true);
            cambiarLabelEsCegado(starter, "Sí");
        }
        if (starter.isWillBeConfused()) {
            starter.setWillBeConfused(false);
            starter.setConfusedIfPossible(true);
            cambiarLabelEsConfundido(starter, "Sí");
        }
        if (starter.isWillBePoisoned()) {
            starter.setWillBePoisoned(false);
            starter.setPoisonedIfPossible(true);
            starter.setPoisonedTurns(3);
            cambiarLabelEsEnvenenado(starter, "Sí");
        }
    }

    private void esAlgunStarterMuerto() {
        if (starterUno.getHealth() <= 0 || starterDos.getHealth() <= 0) {
            mensajefinPartida();
            eliminarBufosTemporales();
            curarStarters();
            this.setVisible(false);
            this.getRootPane().getContentPane().remove(this);
            panelCallback.setVisible(true);
        }
    }

    private void mensajefinPartida() {
        if (starterUno.getHealth() <= 0 && starterDos.getHealth() <= 0) {
            JOptionPane.showMessageDialog(
                    this,
                    "Ambos murieron a la vez. \n"
                    + "Empate!",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (starterUno.getHealth() <= 0) {
            JOptionPane.showMessageDialog(
                    this,
                    "Ganador: " + starterDos.getName() + " de " + nombreJugador2 + "!!",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (starterDos.getHealth() <= 0) {
            JOptionPane.showMessageDialog(
                    this,
                    "Ganador: " + starterUno.getName() + " de " + nombreJugador1 + "!!",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void resetearBotones() {
        contadorBotonesBloqueados = 0;
        butStarter1AtaquePrincipal.setEnabled(true);
        butStarter1AtaqueSecundario.setEnabled(true);
        butStarter2AtaquePrincipal.setEnabled(true);
        butStarter2AtaqueSecundario.setEnabled(true);
    }

    private void curarStarters() {
        starterUno.setHealth(starterUno.getMaximumHealth());
        starterDos.setHealth(starterDos.getMaximumHealth());
    }

    private void eliminarBufosTemporales() {
        eliminarBufosTemporalesA(starterUno);
        eliminarBufosTemporalesA(starterDos);
    }

    private void eliminarBufosTemporalesA(Starter starter) {
        if (starter instanceof Gnar gnar) {
            gnar.setIsMonster(false);
            gnar.setMonsterCounter(0);
        } else if (starter instanceof Poppy poppy) {
            poppy.setCarriesShield(false);
        }
        starter.setBlindedIfPossible(false);
        starter.setWillBeBlinded(false);
        starter.setPoorSightIfPossible(false);
        starter.setWillBePoorSight(false);
        starter.setPoisonedIfPossible(false);
        starter.setWillBePoisoned(false);
        starter.setPoisonedTurns(0);
        starter.setConfusedIfPossible(false);
        starter.setWillBeConfused(false);
    }

    private void posibleTransformacionGnar(Starter starter, Starter starterEnemigo) {
        if (starter instanceof Gnar gnar && !gnar.isMonstruo()
                && !starterEnemigo.isBlinded() && !starterEnemigo.isPoorSight()
                && !starterEnemigo.isConfused()) {
            double num = (Math.random() * 100 + gnar.getResistance() / 10); //23+3%(26) al principio 23+7%(30%) con la resistencia al max
            if (num >= 77) {
                gnar.setIsMonster(true);
                gnar.setMonsterCounter(4);

                JOptionPane.showMessageDialog(
                        this,
                        "Gnar se transformó en MegaGnar",
                        this.getName(),
                        JOptionPane.INFORMATION_MESSAGE);
                refrescarIconoYBotonesAtaque(starter);
            }
        }
    }

    private void gnarPierdeUnTurnoComoMega(Starter starter) {
        if (starter instanceof Gnar gnar && gnar.isMonstruo()) {
            gnar.setMonsterCounter(gnar.getMonsterCounter() - 1);
            if (gnar.getMonsterCounter() <= 0) {
                gnar.setIsMonster(false);
                JOptionPane.showMessageDialog(
                        this,
                        "MegaGnar volvió a su forma de gnar",
                        this.getName(),
                        JOptionPane.INFORMATION_MESSAGE);

                refrescarIconoYBotonesAtaque(starter);
            }
        }
    }

    private void refrescarIconoYBotonesAtaque(Starter starter) {
        if (starter.equals(starterUno)) {
            butStarter1AtaquePrincipal.setText(starter.getNameOfMainAttack());
            butStarter1AtaqueSecundario.setText(starter.getNameOfSecondaryAttack());
            if (!((Gnar) starter).isMonstruo()) {
                labStarter1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/gnarMini.png")));
            } else if (((Gnar) starter).isMonstruo()) {
                labStarter1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/gnarMega.png")));
            }
        } else if (starter.equals(starterDos)) {
            butStarter2AtaquePrincipal.setText(starter.getNameOfMainAttack());
            butStarter2AtaqueSecundario.setText(starter.getNameOfSecondaryAttack());
            if (!((Gnar) starter).isMonstruo()) {
                labStarter2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/gnarMini.png")));
            } else if (((Gnar) starter).isMonstruo()) {
                labStarter2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/gnarMega.png")));
            }
        }
    }

    private void refrescarLabelVida() {
        labVidaStarter1.setText(String.valueOf((int) starterUno.getHealth()));
        labVidaStarter2.setText(String.valueOf((int) starterDos.getHealth()));
    }

    private void cambiarLabelEsEnvenenado(Starter starter, String valor) {
        if (starter.equals(starterUno)) {
            labEsEnvenenado1.setText(valor);
        } else if (starter.equals(starterDos)) {
            labEsEnvenenado2.setText(valor);
        }
    }

    private void cambiarLabelEsConfundido(Starter starter, String valor) {
        if (starter.equals(starterUno)) {
            labEsConfundido1.setText(valor);
        } else if (starter.equals(starterDos)) {
            labEsConfundido2.setText(valor);
        }
    }

    private void cambiarLabelEsCegado(Starter starter, String valor) {
        if (starter.equals(starterUno)) {
            labEsCegado1.setText(valor);
        } else if (starter.equals(starterDos)) {
            labEsCegado2.setText(valor);
        }
    }

    private void cambiarLabelValorVariable(Starter starter, String valor) {
        if (starter.equals(starterUno)) {
            labCantidadValorVariable1.setText(valor);
        } else if (starter.equals(starterDos)) {
            labCantidadValorVariable2.setText(valor);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butStarter1AtaquePrincipal;
    private javax.swing.JButton butStarter1AtaqueSecundario;
    private javax.swing.JButton butStarter2AtaquePrincipal;
    private javax.swing.JButton butStarter2AtaqueSecundario;
    private javax.swing.JLabel labCabecera;
    private javax.swing.JLabel labCantidadDano1;
    private javax.swing.JLabel labCantidadDano2;
    private javax.swing.JLabel labCantidadValorVariable1;
    private javax.swing.JLabel labCantidadValorVariable2;
    private javax.swing.JLabel labEsCegado1;
    private javax.swing.JLabel labEsCegado2;
    private javax.swing.JLabel labEsConfundido1;
    private javax.swing.JLabel labEsConfundido2;
    private javax.swing.JLabel labEsEnvenenado1;
    private javax.swing.JLabel labEsEnvenenado2;
    private javax.swing.JLabel labFijoCegado1;
    private javax.swing.JLabel labFijoCegado2;
    private javax.swing.JLabel labFijoConfundido1;
    private javax.swing.JLabel labFijoConfundido2;
    private javax.swing.JLabel labFijoDano1;
    private javax.swing.JLabel labFijoDano2;
    private javax.swing.JLabel labFijoEnvenenado1;
    private javax.swing.JLabel labFijoEnvenenado2;
    private javax.swing.JLabel labFijoValorVariable1;
    private javax.swing.JLabel labFijoValorVariable2;
    private javax.swing.JLabel labStarter1;
    private javax.swing.JLabel labStarter2;
    private javax.swing.JLabel labVersus;
    private javax.swing.JLabel labVidaStarter1;
    private javax.swing.JLabel labVidaStarter2;
    // End of variables declaration//GEN-END:variables
}
