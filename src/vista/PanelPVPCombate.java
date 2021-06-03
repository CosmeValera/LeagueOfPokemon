package vista;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.Global;
import modelo.Gnar;
import modelo.Poppy;
import modelo.Starter;
import modelo.Teemo;
import modelo.Yuumi;

public class PanelPVPCombate extends javax.swing.JPanel {

    private Starter starterUno;
    private Starter starterDos;

    private JPanel panelCallback;
    private String nombreJugador1;
    private String nombreJugador2;

    private int contadorBotonesBloqueados;

    public PanelPVPCombate() {
        initComponents();
    }

    public void mostrar(JPanel panelCallBack, String nombreJugador1, String nombreJugador2) {
        starterUno = Global.starter;
        starterDos = Global.starter2;

        this.panelCallback = panelCallBack;
        this.nombreJugador1 = nombreJugador1;
        this.nombreJugador2 = nombreJugador2;

        butStarter1AtaquePrincipal.setText(starterUno.getNombreAtaquePrincipal());
        butStarter1AtaqueSecundario.setText(starterUno.getNombreAtaqueSecundario());
        labVidaStarter1.setText(String.valueOf((int) starterUno.getVida()));
        labCantidadDano1.setText(String.valueOf((int) starterUno.getDano()));
        if (starterUno instanceof Teemo teemo) {
            labFijoValorVariable1.setText("Daño Veneno:");
            labCantidadValorVariable1.setText(String.valueOf((int) teemo.getDanoVeneno()));
            labStarter1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/teemo.png")));
        } else if (starterUno instanceof Gnar gnar) {
            labFijoValorVariable1.setText("Resistencia:");
            labCantidadValorVariable1.setText(String.valueOf((int) gnar.getResistencia()));
            labStarter1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/gnarMini.png")));
            labFijoCegado2.setText("Aturdido:"); //No ciega a enemigos, aturde
        } else if (starterUno instanceof Poppy poppy) {
            labFijoValorVariable1.setText("Escudo:");
            labCantidadValorVariable1.setText((poppy.isLlevaEscudo()) ? "Sí" : "No");
            labStarter1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/Poppy.png")));
        } else if (starterUno instanceof Yuumi yuumi) {
            labFijoValorVariable1.setText("Sanación:");
            labCantidadValorVariable1.setText(String.valueOf((int) yuumi.getCura()));
            labStarter1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/yuumi.png")));
        }

        butStarter2AtaquePrincipal.setText(starterDos.getNombreAtaquePrincipal());
        butStarter2AtaqueSecundario.setText(starterDos.getNombreAtaqueSecundario());
        labVidaStarter2.setText(String.valueOf((int) starterDos.getVida()));
        labCantidadDano2.setText(String.valueOf((int) starterDos.getDano()));
        if (starterDos instanceof Teemo teemo) {
            labFijoValorVariable2.setText("Daño Veneno:");
            labCantidadValorVariable2.setText(String.valueOf((int) teemo.getDanoVeneno()));
            labStarter2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/teemo.png")));
        } else if (starterDos instanceof Gnar gnar) {
            labFijoValorVariable2.setText("Resistencia:");
            labCantidadValorVariable2.setText(String.valueOf((int) gnar.getResistencia()));
            labStarter2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/gnarMini.png")));
            labFijoCegado1.setText("Aturdido:"); //No ciega a enemigos, aturde
        } else if (starterDos instanceof Poppy poppy) {
            labFijoValorVariable2.setText("Escudo:");
            labCantidadValorVariable2.setText((poppy.isLlevaEscudo()) ? "Sí" : "No");
            labStarter2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/Poppy.png")));
        } else if (starterDos instanceof Yuumi yuumi) {
            labFijoValorVariable2.setText("Sanación:");
            labCantidadValorVariable2.setText(String.valueOf((int) yuumi.getCura()));
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
        System.out.println(contadorBotonesBloqueados);

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

        if (keyCode.equals(Global.letterMainAttackStarter)) {
            if (butStarter1AtaquePrincipal.isEnabled()
                    && butStarter1AtaqueSecundario.isEnabled()) {
                butStarter1AtaqueSecundario.setEnabled(false);
                contadorBotonesBloqueados++;
            }
        } else if (keyCode.equals(Global.letterSecondaryAttackStarter)) {
            if (butStarter1AtaquePrincipal.isEnabled()
                    && butStarter1AtaqueSecundario.isEnabled()) {
                butStarter1AtaquePrincipal.setEnabled(false);
                contadorBotonesBloqueados++;
            }
        } else if (keyCode.equals(Global.letterMainAttackStarter2)) {
            if (butStarter2AtaquePrincipal.isEnabled()
                    && butStarter2AtaqueSecundario.isEnabled()) {
                butStarter2AtaqueSecundario.setEnabled(false);
                contadorBotonesBloqueados++;
            }
        } else if (keyCode.equals(Global.letterSecondaryAttackStarter2)) {
            if (butStarter2AtaquePrincipal.isEnabled()
                    && butStarter2AtaqueSecundario.isEnabled()) {
                butStarter2AtaquePrincipal.setEnabled(false);
                contadorBotonesBloqueados++;
            }
        }
        System.out.println(contadorBotonesBloqueados);

        if (contadorBotonesBloqueados == 2) {
            System.out.println("Ahora se pegan");
            empezarUnCombate();
            resetearBotones();
        }
    }//GEN-LAST:event_formKeyPressed

    private void empezarUnCombate() {

        double danoDeStarterUno = obtenerDanoBrutoStarterUno();
        double danoDeStarterDos = obtenerDanoBrutoStarterDos();

        //Daño bruto - Resistencias = Daño neto
        danoDeStarterUno = starterDos.ajustarDanoAResistencias(danoDeStarterUno);
        danoDeStarterDos = starterUno.ajustarDanoAResistencias(danoDeStarterDos);

        turnoGolpear(danoDeStarterUno, starterUno, starterDos);
        turnoGolpear(danoDeStarterDos, starterDos, starterUno);
        refrescarLabelVida();

        eliminarEfectosYAplicarVeneno(starterUno, starterDos);
        eliminarEfectosYAplicarVeneno(starterDos, starterUno);
        refrescarLabelVida();

        ponerEfectos(starterUno, starterDos);
        ponerEfectos(starterDos, starterUno);

        if (starterUno.getVida() <= 0 || starterDos.getVida() <= 0) {
            mensajefinPartida();
            eliminarBufosTemporales();
            curarStarters();
            this.setVisible(false);
            this.getRootPane().getContentPane().remove(this);
            panelCallback.setVisible(true);
        }
    }

    private void ponerEfectos(Starter starter, Starter starterEnemigo) {
        if (butStarter1AtaquePrincipal.isEnabled()) {
            efectosAtaquePrincipal(starter, starterEnemigo);
        } else if (butStarter1AtaqueSecundario.isEnabled()) {
            efectosAtaqueSecundario(starter, starterEnemigo);
        }
    }

    private void efectosAtaquePrincipal(Starter starter, Starter starterEnemigo) {
        if (starter instanceof Teemo) {
            int num = ((int) (Math.random() * 100 + 1)) + ((Teemo) starter).getDanoVeneno() / 2;
            if (num > 70) { //Camuflarse
                starterEnemigo.setVisionTorpeSiPosible(true);
                cambiarLabelEsCegado(starterEnemigo, "Sí");
            }
        }
    }

    private void efectosAtaqueSecundario(Starter starter, Starter starterEnemigo) {
        if (starter instanceof Teemo) {
            int num = ((int) (Math.random() * 100 + 1)) + ((Teemo) starter).getDanoVeneno();
            if (num > 45 && num < 73) { //Envenenado
                starterEnemigo.setEnvenenadoSiPosible(true);
                cambiarLabelEsEnvenenado(starterEnemigo, "Sí");
            } else if (num >= 73 && num < 90) { //Cegado
                starterEnemigo.setCegadoSiPosible(true);
                cambiarLabelEsCegado(starterEnemigo, "Sí");
            } else if (num >= 90) { //Envenenado y cegado
                starterEnemigo.setEnvenenadoSiPosible(true);
                cambiarLabelEsEnvenenado(starterEnemigo, "Sí");
                starterEnemigo.setCegadoSiPosible(true);
                cambiarLabelEsCegado(starterEnemigo, "Sí");
            }
        }
        if (starter instanceof Poppy poppy) {
            int num = (int) (Math.random() * 100 + 1 + poppy.getProteccionEscudo());
            if (num > 62) {
                starterEnemigo.setConfundidoSiPosible(true);
                cambiarLabelEsConfundido(starterEnemigo, "Sí");
            }
        }
        if (starter instanceof Yuumi yuumi) {
            int num = (int) (Math.random() * 100 + 1 + yuumi.getCura() / 2);
            if (num > 50) { //Ciega
                starterEnemigo.setCegadoSiPosible(true);
                cambiarLabelEsCegado(starterEnemigo, "Sí");
            }
        }
        if (starterEnemigo.isSeraCegado()) {
            starterEnemigo.setSeraCegado(false);
            starterEnemigo.setCegadoSiPosible(true);
            cambiarLabelEsCegado(starterEnemigo, "Sí");
        }
    }

    private void eliminarEfectosYAplicarVeneno(Starter starter, Starter starterEnemigo) {

        posibleTransformacionGnar(starter, starterEnemigo);
        gnarPierdeUnTurnoComoMega(starter);

        cambiarLabelEsCegado(starter, "No");
        starter.setCegadoSiPosible(false);
        starter.setVisionTorpeSiPosible(false);

        cambiarLabelEsConfundido(starter, "No");
        starter.setConfundidoSiPosible(false);

        if (starter instanceof Poppy poppy && poppy.isLlevaEscudo()) {
            cambiarLabelValorVariable(starter, "No");
            poppy.setLlevaEscudo(false);
        }

        if (!esEnvenenadoTrasAplicarVenenoUnaVez(starter, starterEnemigo)) {
            cambiarLabelEsEnvenenado(starter, "No");
            starter.setEnvenenadoSiPosible(false);
        }
    }

    private boolean esEnvenenadoTrasAplicarVenenoUnaVez(Starter starter, Starter starterEnemigo) {
        if (starter.isEnvenenado()) {
            starter.setVida(starter.getVida() - ((Teemo) starterEnemigo).getDanoVeneno());
            starter.setTurnosEnvenenado(starter.getTurnosEnvenenado() - 1);
            if (starter.getTurnosEnvenenado() <= 0) {
                return false;
            }
        }
        return true;
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
        if (starter.isEnvenenado() && starter.isCegado()) {
            cambiarLabelEsEnvenenado(starter, "Sí");
            cambiarLabelEsCegado(starter, "Sí");
            JOptionPane.showMessageDialog(
                    this,
                    starter.getNombre() + " está "
                    + ((starter.getTurnosEnvenenado() == 3)
                    ? "envenenado y " : "") + "cegado",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
        return false;
    }

    private boolean turnoStarterVisionTorpeYEnvenenado(double dano, Starter starter, Starter starterEnemigo) {
        if (starter.isEnvenenado() && starter.isVisionTorpe()) {
            cambiarLabelEsEnvenenado(starter, "Sí");
            cambiarLabelEsCegado(starter, "Sí");
            JOptionPane.showMessageDialog(
                    this,
                    starter.getNombre()
                    + ((starter.getTurnosEnvenenado() == 3) ? " está envenenado y" : "") + " no verá a "
                    + starterEnemigo.getNombre() + " porque se camufló",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
        return false;
    }

    private boolean turnoStarterCegado(double dano, Starter starter, Starter starterEnemigo) {
        if (starter.isVisionTorpe()) {
            cambiarLabelEsCegado(starterEnemigo, "Sí");
            JOptionPane.showMessageDialog(
                    this,
                    starter.getNombre() + ((starterEnemigo instanceof Teemo || starterEnemigo instanceof Yuumi)
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
        if (starter.isVisionTorpe()) {
            cambiarLabelEsCegado(starterEnemigo, "Sí");
            JOptionPane.showMessageDialog(
                    this,
                    starterEnemigo.getNombre() + " se camufló y " + starter.getNombre() + " no le encontró",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
        return false;
    }

    private boolean turnoStarterConfundido(double dano, Starter starter, Starter starterEnemigo) {
        if (starter.isConfundido()) {
            cambiarLabelEsConfundido(starter, "Sí");
            JOptionPane.showMessageDialog(
                    this,
                    starter.getNombre() + " está confundido y se inflingió: " + ((int) dano + 1) + " daño.",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            starter.setVida(starter.getVida() - dano);
            return true;
        }
        return false;
    }

    private boolean turnoStarterEnvenenado(double dano, Starter starter, Starter starterEnemigo) {
        if (starter.isEnvenenado()) {
            cambiarLabelEsEnvenenado(starter, "Sí");
            if (starter.getTurnosEnvenenado() == 3) {
                JOptionPane.showMessageDialog(
                        this,
                        starter.getNombre() + " está envenenado",
                        this.getName(),
                        JOptionPane.INFORMATION_MESSAGE);
            }
            turnoStarterSinEfectos(dano, starter, starterEnemigo);
            return true;
        }
        return false;
    }

    private void turnoStarterSinEfectos(double dano, Starter starter, Starter starterEnemigo) {
        JOptionPane.showMessageDialog(
                this,
                starter.getNombre() + " inflingió: " + (int) (dano + 0.9) + " daño.",
                this.getName(),
                JOptionPane.INFORMATION_MESSAGE);
        starterEnemigo.setVida(starterEnemigo.getVida() - dano);
    }

    private double obtenerDanoBrutoStarterUno() {
        if (butStarter1AtaquePrincipal.isEnabled()) {
            return obtenerDanoAtaquePrincipal(starterUno);
        } else if (butStarter1AtaqueSecundario.isEnabled()) {
            return obtenerDanoAtaqueSecundario(starterUno, starterDos);
        }
        return 0;
    }

    private double obtenerDanoBrutoStarterDos() {
        if (butStarter2AtaquePrincipal.isEnabled()) {
            return obtenerDanoAtaquePrincipal(starterDos);
        } else if (butStarter2AtaqueSecundario.isEnabled()) {
            return obtenerDanoAtaqueSecundario(starterDos, starterUno);
        }
        return 0;
    }

    private double obtenerDanoAtaquePrincipal(Starter starter) {
        double danoDeStarter = starter.getDanoAtaquePrincipal();
        if (starter.isAtacaDosVeces()) {
            JOptionPane.showMessageDialog(
                    this,
                    starter.getNombreAtaquePrincipal() + " golpeó dos veces",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            danoDeStarter = danoDeStarter * 2;
        }
        if (starter.isPonerseEscudo()) {
            ((Poppy) starter).setLlevaEscudo(true);
            JOptionPane.showMessageDialog(
                    this,
                    starter.getNombre() + " cogió un escudo tras golpear. +"
                    + ((Poppy) starter).getProteccionEscudo() + " escudo",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            cambiarLabelValorVariable(starter, "Sí");
        }
        return danoDeStarter;
    }

    private double obtenerDanoAtaqueSecundario(Starter starter, Starter starterEnemigo) {
        double danoDeStarter = 0;
        if (starter.isFallaElAtaque()) {
            JOptionPane.showMessageDialog(
                    this,
                    starter.getNombre() + " falló la roca",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            danoDeStarter = starter.getDanoAtaqueSecundario();
            if (starter instanceof Gnar gnar && gnar.isMonstruo()) {
                JOptionPane.showMessageDialog(
                        this,
                        starter.getNombre() + " golpeó con la roca" + (starterEnemigo.isInmuneACegado()
                        ? " a "
                        : " y aturdió a ") + starterEnemigo.getNombre(),
                        this.getName(),
                        JOptionPane.INFORMATION_MESSAGE);
                starterEnemigo.setSeraCegado(true);
            }
        }

        if (starter.isPuedeEsquivar() && !starterEnemigo.isInmuneACegado()) {
            JOptionPane.showMessageDialog(
                    this,
                    starter.getNombre() + " esquivará el ataque de " + starterEnemigo.getNombre() + " con su salto",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            starterEnemigo.setSeraCegado(true);
        }
        return danoDeStarter;
    }

    private void mensajefinPartida() {
        if (starterUno.getVida() <= 0 && starterDos.getVida() <= 0) {
            JOptionPane.showMessageDialog(
                    this,
                    "Ambos murieron a la vez. \n"
                    + "Empate!",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (starterUno.getVida() <= 0) {
            JOptionPane.showMessageDialog(
                    this,
                    "Ganador: " + starterDos.getNombre() + " de " + nombreJugador2 + "!!",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (starterDos.getVida() <= 0) {
            JOptionPane.showMessageDialog(
                    this,
                    "Ganador: " + starterUno.getNombre() + " de " + nombreJugador1 + "!!",
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
        starterUno.setVida(starterUno.getVidaMaxima());
        starterDos.setVida(starterDos.getVidaMaxima());
    }

    private void eliminarBufosTemporales() {
        if (starterUno instanceof Gnar gnar) {
            gnar.setEsMonstruo(false);
            gnar.setContadorMonstruo(0);
        } else if (starterUno instanceof Poppy poppy) {
            poppy.setLlevaEscudo(false);
        }
        starterUno.setCegadoSiPosible(false);
        starterUno.setVisionTorpeSiPosible(false);
        starterUno.setEnvenenadoSiPosible(false);
        starterUno.setTurnosEnvenenado(0);
        starterUno.setConfundidoSiPosible(false);
        
        if (starterDos instanceof Gnar gnar) {
            gnar.setEsMonstruo(false);
            gnar.setContadorMonstruo(0);
        } else if (starterDos instanceof Poppy poppy) {
            poppy.setLlevaEscudo(false);
        }
        starterDos.setCegadoSiPosible(false);
        starterDos.setVisionTorpeSiPosible(false);
        starterDos.setEnvenenadoSiPosible(false);
        starterDos.setTurnosEnvenenado(0);
        starterDos.setConfundidoSiPosible(false);
    }

    private void posibleTransformacionGnar(Starter starter, Starter starterEnemigo) {
        if (starter instanceof Gnar gnar && !gnar.isMonstruo()
                && !starterEnemigo.isCegado() && !starterEnemigo.isVisionTorpe()
                && !starterEnemigo.isConfundido()) {
            double num = (Math.random() * 100 + gnar.getResistencia() / 10); //23+3%(26) al principio 23+7%(30%) con la resistencia al max
            if (num >= 77) {
                gnar.setEsMonstruo(true);
                gnar.setContadorMonstruo(4);

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
            gnar.setContadorMonstruo(gnar.getContadorMonstruo() - 1);
            if (gnar.getContadorMonstruo() <= 0) {
                gnar.setEsMonstruo(false);
                JOptionPane.showMessageDialog(
                        this,
                        "MegaGnar volvió a su forma de gnar",
                        this.getName(),
                        JOptionPane.INFORMATION_MESSAGE);

                refrescarIconoYBotonesAtaque(starter);
            }
        }
    }

    public void refrescarIconoYBotonesAtaque(Starter starter) {
        if (starter.equals(starterUno)) {
            butStarter1AtaquePrincipal.setText(starter.getNombreAtaquePrincipal());
            butStarter1AtaqueSecundario.setText(starter.getNombreAtaqueSecundario());
            if (!((Gnar) starter).isMonstruo()) {
                labStarter1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/gnarMini.png")));
            } else if (((Gnar) starter).isMonstruo()) {
                labStarter1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/gnarMega.png")));
            }
        } else if (starter.equals(starterDos)) {
            butStarter2AtaquePrincipal.setText(starter.getNombreAtaquePrincipal());
            butStarter2AtaqueSecundario.setText(starter.getNombreAtaqueSecundario());
            if (!((Gnar) starter).isMonstruo()) {
                labStarter2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/gnarMini.png")));
            } else if (((Gnar) starter).isMonstruo()) {
                labStarter2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/gnarMega.png")));
            }
        }
    }

    private void refrescarLabelVida() {
        labVidaStarter1.setText(String.valueOf((int) starterUno.getVida()));
        labVidaStarter2.setText(String.valueOf((int) starterDos.getVida()));
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
