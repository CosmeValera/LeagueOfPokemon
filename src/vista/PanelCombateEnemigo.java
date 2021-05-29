package vista;

import java.awt.HeadlessException;
import modelo.*;
import javax.swing.JOptionPane;

public class PanelCombateEnemigo extends javax.swing.JPanel {

    public Starter starter;
    public Enemigo enemigo;

    public GUI GUICallBack;

    public PanelCombateEnemigo() {
        initComponents();
    }

    public void mostrar(GUI gui) {
        this.starter = Global.starter;
        this.enemigo = Global.enemigo;
        this.GUICallBack = gui;

        labVidaStarter.setText(String.valueOf((int) starter.getVida()));
        labCantidadDano.setText(String.valueOf((int) starter.getDano()));
        labCantidadOro.setText(String.valueOf(starter.getCantidadOro()));

        if (starter instanceof Teemo teemo) {
            labFijoValorVariable.setText("Daño Veneno:");
            labCantidadValorVariable.setText(String.valueOf((int) teemo.getDanoVeneno()));
            labFijoEfectoDebilitador.setText("Envenenado?");
            labEfectoDebilitador.setText("No");
            labStarter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/teemo.png")));
            butAtaquePrincipal.setText("Arañazo");
            butAtaqueSecundario.setText("Dardo venenoso");
        } else if (starter instanceof Gnar gnar) {
            labFijoValorVariable.setText("Resistencia:");
            labCantidadValorVariable.setText(String.valueOf((int) gnar.getResistencia()));
            labFijoEfectoDebilitador.setText("");
            labEfectoDebilitador.setText("");
            labStarter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/gnarMini.png")));
            butAtaquePrincipal.setText("Boomerang");
            butAtaqueSecundario.setText("Salto");
        } else if (starter instanceof Poppy poppy) {
            labFijoValorVariable.setText("Escudo:");
            labCantidadValorVariable.setText((poppy.isLlevaEscudo()) ? "Sí" : "No");
            labFijoEfectoDebilitador.setText("Confundido:");
            labEfectoDebilitador.setText("No");
            labStarter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/Poppy.png")));
            butAtaquePrincipal.setText("Placaje con escudo");
            butAtaqueSecundario.setText("Martillazo");
        }

        if (enemigo instanceof Pikachu pikachu) {
            labCabecera.setText("COMBATE VS PIKACHU");
            labEnemigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/enemigosCombate/pikachu.png")));
        } else if (enemigo instanceof Electrode electrode) {
            labCabecera.setText("COMBATE VS ELECTRODE");
            labEnemigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/enemigosCombate/electrode.png")));
        } else if (enemigo instanceof HitMonLee hitMonLee) {
            labCabecera.setText("COMBATE VS HITMONLEE");
            labEnemigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/enemigosCombate/Hitmonlee.png")));
        } else if (enemigo instanceof Gyarados gyarados) {
            labCabecera.setText("COMBATE VS GYARADOS");
            labEnemigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/enemigosCombate/Gyarados.png")));
        } else if (enemigo instanceof Rayquaza rayquaza) {
            labCabecera.setText("COMBATE VS RAYQUAZA");
            labEnemigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/enemigosCombate/Rayquaza.png")));
        } else if (enemigo instanceof Arceus arceus) {
            labCabecera.setText("COMBATE VS ARCEUS");
            labEnemigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/enemigosCombate/arceus.png")));
        }

        labVidaEnemigo.setText(String.valueOf((int) enemigo.getVida()));

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

        butAtaquePrincipal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        butAtaquePrincipal.setText("Arañazo");
        butAtaquePrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAtaquePrincipalActionPerformed(evt);
            }
        });

        butAtaqueSecundario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        butAtaqueSecundario.setText("Dardo venenoso");
        butAtaqueSecundario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAtaqueSecundarioActionPerformed(evt);
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
                            .addComponent(labVidaStarter, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(labFijoOro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labFijoDano, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(79, 79, 79))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(labFijoValorVariable)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labCantidadValorVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labCantidadDano, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labCantidadOro))
                                .addGap(217, 217, 217))
                            .addComponent(labStarter))
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
                        .addGap(0, 93, Short.MAX_VALUE)))
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
        starter.ataquePrincipal(enemigo);
        if (starter.isAtacaDosVeces()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Boomerang golpeó dos veces",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            starter.ataquePrincipal(enemigo);
        }
        if (starter.isPonerseEscudo()) {
            ((Poppy) starter).setLlevaEscudo(true);
            labCantidadValorVariable.setText("Sí");
            JOptionPane.showMessageDialog(
                    this,
                    "Poppy cogió un escudo tras golpear. +"
                    + ((Poppy) starter).getProteccionEscudo() + " escudo",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
        }

        labVidaEnemigo.setText(String.valueOf((int) enemigo.getVida()));
        turnoEnemigo();
    }//GEN-LAST:event_butAtaquePrincipalActionPerformed

    private void butAtaqueSecundarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAtaqueSecundarioActionPerformed
        if (starter.isFallaElAtaque()) {
            JOptionPane.showMessageDialog(
                    this,
                    starter.getNombre() + " falló la roca",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            starter.ataqueSecundario(enemigo);
            if (starter instanceof Gnar gnar && gnar.isMonstruo()) {
                JOptionPane.showMessageDialog(
                        this,
                        starter.getNombre() + " golpeó con la roca" + (enemigo.isInmuneACegado() ? " a " : " y aturdió a ") + enemigo.getNombreEnemigo(),
                        this.getName(),
                        JOptionPane.INFORMATION_MESSAGE);
                enemigo.setCegadoSiPosible(true);
            }
        }

        if (starter.isPuedeEsquivar() && !enemigo.isInmuneACegado()) {
            JOptionPane.showMessageDialog(
                    this,
                    starter.getNombre() + " esquivó el ataque de " + enemigo.getNombreEnemigo() + " con su salto",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            enemigo.setCegadoSiPosible(true);
        }

        labVidaEnemigo.setText(String.valueOf((int) enemigo.getVida()));
        turnoEnemigo();
    }//GEN-LAST:event_butAtaqueSecundarioActionPerformed

    private void eliminarBufosTemporalesStarters() {
        if (starter instanceof Teemo teemo) {
            //Vacio
        } else if (starter instanceof Gnar gnar) {
            gnar.setEsMonstruo(false);
            gnar.setContadorMonstruo(0);
        } else if (starter instanceof Poppy poppy) {
            poppy.setLlevaEscudo(false);
        }
    }

    private void turnoEnemigo() {
        labVidaStarter.setText(String.valueOf((int) starter.getVida()));

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
        if (starter.getVida() <= 0) { //Al morir se pierde todo el oro
            starter.setCantidadOro(starter.getCantidadOro() / 2);
            starter.setVida(starter.getVidaMaxima() / 2);
            if (starter instanceof Gnar gnar) {
                gnar.setEsMonstruo(false);
                gnar.setContadorMonstruo(0);
            }
            JOptionPane.showMessageDialog(
                    GUICallBack,
                    starter.getNombre() + " ha muerto. Perdió la mitad de oro",
                    this.getName(),
                    JOptionPane.WARNING_MESSAGE);
            this.setVisible(false);
            this.getRootPane().getContentPane().remove(this);
        }
    }

    private void turnoEnemigoSinEfectos() {
        double dano = obtenerDanoEnemigo();

        if (enemigo.isPuedeAutodestruirse()) {
            dano = starter.ajustarDanoAResistencias(dano) * 2.5;
            JOptionPane.showMessageDialog(
                    this,
                    enemigo.getNombreEnemigo() + " se autodestruyó. Y la explosión causo "
                    + ((double) (int) (dano * 100)) / 100 + " daño a " + starter.getNombre(),
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            enemigo.setVida(0);
            labVidaEnemigo.setText(String.valueOf((int) enemigo.getVida()));
            starter.setVida(starter.getVida() - dano);
            labVidaStarter.setText(String.valueOf((int) starter.getVida()));
            estaEnemigoMuerto();
            isStarterMuerto();
            return;
        }

        if (enemigo.isAtacaDosVeces()) {
            JOptionPane.showMessageDialog(
                    this,
                    enemigo.getNombreEnemigo() + " golpeó dos veces",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            System.out.println(dano);
            dano = dano * 2;
            System.out.println(dano);
        }

        dano = starter.ajustarDanoAResistencias(dano);
        JOptionPane.showMessageDialog(
                this,
                enemigo.getNombreEnemigo() + " inflingió: " + (int) (dano + 0.9) + " daño.",
                this.getName(),
                JOptionPane.INFORMATION_MESSAGE);
        starter.setVida(starter.getVida() - dano);
        labVidaStarter.setText(String.valueOf((int) starter.getVida()));

        posibleTransformacionGnar();
        gnarPierdeUnTurnoComoMega();
        eliminarEscudoPoppy();
        isStarterMuerto();
    }

    private boolean turnoEnemigoConfundido() {
        if (enemigo.isConfundido()) {
            labEfectoDebilitador.setText("Sí");
            double dano = obtenerDanoEnemigo();
            JOptionPane.showMessageDialog(
                    this,
                    enemigo.getNombreEnemigo() + " está confundido y se inflingió: " + ((int) dano + 1) + " daño.",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            enemigo.setVida(enemigo.getVida() - dano);
            labVidaEnemigo.setText(String.valueOf((int) enemigo.getVida()));
            posibleTransformacionGnar();
            gnarPierdeUnTurnoComoMega();
            eliminarEscudoPoppy();
            enemigo.setConfundidoSiPosible(false);
            labEfectoDebilitador.setText("No");
            estaEnemigoMuerto();
            return true;
        }
        return false;
    }

    private boolean turnoEnemigoCegado() {
        if (enemigo.isCegado()) {
            JOptionPane.showMessageDialog(
                    this,
                    enemigo.getNombreEnemigo()
                    + ((starter instanceof Teemo) ? " fue cegado y no atacó."
                            : ((starter instanceof Gnar) ? " no atacó." : "")),
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            enemigo.setCegadoSiPosible(false);
            posibleTransformacionGnar();
            gnarPierdeUnTurnoComoMega();
            eliminarEscudoPoppy();
            return true;
        }
        return false;
    }

    private boolean turnoEnemigoVisionTorpe() {
        if (enemigo.isVisionTorpe()) {
            JOptionPane.showMessageDialog(
                    this,
                    starter.getNombre() + " se camufló y " + enemigo.getNombreEnemigo() + " no le encontró",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            enemigo.setVisionTorpeSiPosible(false);
            posibleTransformacionGnar();
            gnarPierdeUnTurnoComoMega();
            eliminarEscudoPoppy();
            return true;
        }
        return false;
    }

    private boolean turnoEnemigoEnvenenado() {
        if (enemigo.isEnvenenado()) {
            labEfectoDebilitador.setText("Sí");
            danoVenenoYReducirDuracion();
            if (enemigo.getTurnosEnvenenado() == 2) {
                JOptionPane.showMessageDialog(
                        this,
                        enemigo.getNombreEnemigo() + " fue envenenado",
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
        if (enemigo.isEnvenenado() && enemigo.isCegado()) {
            labEfectoDebilitador.setText("Sí");
            JOptionPane.showMessageDialog(
                    this,
                    enemigo.getNombreEnemigo() + " fue "
                    + ((enemigo.getTurnosEnvenenado() == 3)
                    ? "envenenado y " : "") + "cegado",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            danoVenenoYReducirDuracion();
            enemigo.setCegadoSiPosible(false);
            estaEnemigoMuerto();
            posibleTransformacionGnar();
            gnarPierdeUnTurnoComoMega();
            eliminarEscudoPoppy();
            return true;
        }
        return false;
    }

    private boolean turnoEnemigoVisionTorpeYEnvenenado() {
        if (enemigo.isEnvenenado() && enemigo.isVisionTorpe()) {
            labEfectoDebilitador.setText("Sí");
            danoVenenoYReducirDuracion();
            JOptionPane.showMessageDialog(
                    this,
                    enemigo.getNombreEnemigo()
                    + ((enemigo.getTurnosEnvenenado() == 2) ? " fue envenenado y" : "") + " no ve a "
                    + starter.getNombre() + " porque se camufló",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            enemigo.setVisionTorpeSiPosible(false);
            estaEnemigoMuerto();
            posibleTransformacionGnar();
            gnarPierdeUnTurnoComoMega();
            eliminarEscudoPoppy();
            return true;
        }
        return false;
    }

    private void danoVenenoYReducirDuracion() {
        if (enemigo.isEnvenenado()) {
            enemigo.setVida(enemigo.getVida() - ((Teemo) starter).getDanoVeneno());
            labVidaEnemigo.setText(String.valueOf((int) enemigo.getVida()));
            enemigo.setTurnosEnvenenado(enemigo.getTurnosEnvenenado() - 1);
            if (enemigo.getTurnosEnvenenado() <= 0) {
                enemigo.setEnvenenadoSiPosible(false);
                labEfectoDebilitador.setText("No");
            }
        }
    }

    private void posibleTransformacionGnar() {
        if (starter instanceof Gnar gnar && !gnar.isMonstruo()) {
            double num = (Math.random() * 100 + gnar.getResistencia() / 10); //23+3%(26) al principio 23+7%(30%) con la resistencia al max
            System.out.println(num);
            if (num >= 77) {
                gnar.setEsMonstruo(true);
                gnar.setContadorMonstruo(4);

                JOptionPane.showMessageDialog(
                        this,
                        "Gnar se transformó en MegaGnar",
                        this.getName(),
                        JOptionPane.INFORMATION_MESSAGE);
                labStarter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/gnarMega.png")));
                butAtaquePrincipal.setText("Golpe");
                butAtaqueSecundario.setText("Lanzar Roca");
            }
        }
    }

    private void gnarPierdeUnTurnoComoMega() {
        if (starter instanceof Gnar gnar && gnar.isMonstruo()) {
            gnar.setContadorMonstruo(gnar.getContadorMonstruo() - 1);
            if (gnar.getContadorMonstruo() <= 0) {
                gnar.setEsMonstruo(false);
                JOptionPane.showMessageDialog(
                        this,
                        "MegaGnar volvió a su forma de gnar",
                        this.getName(),
                        JOptionPane.INFORMATION_MESSAGE);
                labStarter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/gnarMini.png")));
                butAtaquePrincipal.setText("Boomerang");
                butAtaqueSecundario.setText("Salto");
            }
        }
    }

    private void eliminarEscudoPoppy() {
        if (starter instanceof Poppy poppy && poppy.isLlevaEscudo()) {
            poppy.setLlevaEscudo(false);
            labCantidadValorVariable.setText("No");
        }
    }

    private boolean estaEnemigoMuerto() {
        if (enemigo.getVida() <= 0) {
            starter.setCantidadOro(starter.getCantidadOro() + (int) enemigo.getRecompensa());
            eliminarBufosTemporalesStarters();
            JOptionPane.showMessageDialog(this,
                    "Has vencido a " + enemigo.getNombreEnemigo() + " y obtuviste: " + enemigo.getRecompensa(),
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
        starter.setEnemigosVencidos(Starter.getEnemigosVencidos() + 1);

        if (Starter.getEnemigosVencidos() == Starter.getVictoriesForFirstPrize()) {
            desbloquearSegundoStarter();
        } else if (Starter.getEnemigosVencidos() == Starter.getVictoriesForSecondPrize()) {
            desbloquearTercerStarter();
        } else if (Starter.getEnemigosVencidos() == Starter.getVictoriesForThirdPrize()) {
            desbloquearArceus();
        }

    }

    private void desbloquearArceus() throws HeadlessException {
        JOptionPane.showMessageDialog(GUICallBack,
                "Has avanzado tanto que ya te puedes"
                + "\nenfrentar al dios Arceus. Enhorabuena!!"
                + "\nEnemigos vencidos: " + Starter.getEnemigosVencidos(),
                this.getName(),
                JOptionPane.INFORMATION_MESSAGE);
        GUICallBack.getJMenuBar().getMenu(0).getItem(5).setVisible(true); //Visible Arceus
    }

    private void desbloquearTercerStarter() throws HeadlessException {
        GUICallBack.clickCambiarEspecial();
        JOptionPane.showMessageDialog(GUICallBack,
                "Has avanzado tanto que te mereces poder"
                + "\ndisponer de otro campeón. Enhorabuena!!"
                + "\nEnemigos vencidos: " + Starter.getEnemigosVencidos(),
                this.getName(),
                JOptionPane.INFORMATION_MESSAGE);
        GUICallBack.getJMenuBar().getMenu(0).getItem(4).setVisible(true); //Visible RayQuaza
    }

    private void desbloquearSegundoStarter() throws HeadlessException {
        GUICallBack.getJMenuBar().getMenu(1).getItem(2).setVisible(true); //Visible panelCambiar
        GUICallBack.clickCambiarEspecial();
        JOptionPane.showMessageDialog(GUICallBack,
                "Has avanzado tanto que te mereces poder"
                + "\ndisponer de otro campeón. Enhorabuena!!"
                + "\nEnemigos vencidos: " + Starter.getEnemigosVencidos(),
                this.getName(),
                JOptionPane.INFORMATION_MESSAGE);
        GUICallBack.getJMenuBar().getMenu(0).getItem(3).setVisible(true); //Visible Gyarados
    }

    private double obtenerDanoEnemigo() {
        double dano = enemigo.getDano();
        int num = (int) (Math.random() * 5 + 1);
        switch (num) {
            case 1:
                dano = enemigo.getDano() * .7;
                break;
            case 2:
                dano = enemigo.getDano() * .85;
                break;
            case 3:
                dano = enemigo.getDano();
                break;
            case 4:
                dano = enemigo.getDano() * 1.15;
                break;
            case 5:
                dano = enemigo.getDano() * 1.3;
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
