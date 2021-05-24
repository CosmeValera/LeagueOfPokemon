package leagueofpokimon;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class PanelCombatePikachu extends javax.swing.JPanel {

    public Starter starter;
    public Enemigo enemigo;

    public PanelCombatePikachu() {
        initComponents();
    }

    public void mostrar() {
        this.starter = Personajes.starter;
        definirPikachu();
        labVidaPikachu.setText(String.valueOf((int) enemigo.getVida()));
        labEfectoDebilitador.setText("No");

        labVidaStarter.setText(String.valueOf((int) Personajes.starter.getVida()));
        labCantidadDano.setText(String.valueOf((int) Personajes.starter.getDano()));
        labCantidadOro.setText(String.valueOf(Personajes.starter.getCantidadOro()));

        if (starter instanceof Teemo teemo) {
            labFijoValorVariable.setText("Daño Veneno:");
            labCantidadValorVariable.setText(String.valueOf((int) teemo.getDanoVeneno()));
            labFijoEfectoDebilitador.setText("Envenenado?");
            labEfectoDebilitador.setText("No");
            labStarter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/teemoPequeno.png")));
            butAtaquePrincipal.setText("Arañazo");
            butAtaqueSecundario.setText("Dardo venenoso");
        } else if (Personajes.starter instanceof Gnar gnar) {
            labFijoValorVariable.setText("Resistencia:");
            labCantidadValorVariable.setText(String.valueOf((int) gnar.getResistencia()));
            labFijoEfectoDebilitador.setText("");
            labEfectoDebilitador.setText(""); //TO DO
            labStarter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/gnarPeque.png")));
            butAtaquePrincipal.setText("Boomerang");
            butAtaqueSecundario.setText("Salto");
        } else if (Personajes.starter instanceof Poppy poppy) {
            labFijoValorVariable.setText("Escudo:");
            labCantidadValorVariable.setText((poppy.isLlevaEscudo()) ? "Sí" : "No");
            labFijoEfectoDebilitador.setText("Confundido:");
            labEfectoDebilitador.setText("No");
            labStarter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Poppy.png")));
            butAtaquePrincipal.setText("Placaje con escudo");
            butAtaqueSecundario.setText("Martillazo");
        }

        this.setVisible(true);
        this.requestFocusInWindow();
    }

    private void definirPikachu() {
        int num = (int) (Math.random() * 5 + 1); //1,2,3
        switch (num) {
            case 1:
                this.enemigo = new Pikachu();
                enemigo.setDano(10);
                enemigo.setVida(50);
                enemigo.setRecompensa(100);
                System.out.println("pikachu 1");
                break;
            case 2:
                this.enemigo = new Pikachu();
                enemigo.setDano(10);
                enemigo.setVida(60);
                enemigo.setRecompensa(120);
                System.out.println("pikachu 2");
                break;
            case 3:
                this.enemigo = new Pikachu();
                enemigo.setDano(8);
                enemigo.setVida(75);
                enemigo.setRecompensa(110);
                System.out.println("pikachu 3");
                break;
            case 4:
                this.enemigo = new Pikachu();
                enemigo.setDano(12);
                enemigo.setVida(40);
                enemigo.setRecompensa(115);
                System.out.println("pikachu 4");
                break;
            case 5:
                this.enemigo = new Pikachu();
                enemigo.setDano(10);
                enemigo.setVida(90);
                enemigo.setRecompensa(160);
                System.out.println("pikachu 5");
                break;
        }
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
        labPikachu = new javax.swing.JLabel();
        labVersus = new javax.swing.JLabel();
        labVidaStarter = new javax.swing.JLabel();
        labVidaPikachu = new javax.swing.JLabel();
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

        labStarter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/teemoPequeno.png"))); // NOI18N

        labPikachu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pikachu.png"))); // NOI18N

        labVersus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labVersus.setForeground(new java.awt.Color(0, 0, 255));
        labVersus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labVersus.setText("VERSUS");

        labVidaStarter.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        labVidaStarter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labVidaStarter.setText("100");

        labVidaPikachu.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        labVidaPikachu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labVidaPikachu.setText("100");

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
                                    .addComponent(labVidaPikachu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labPikachu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labFijoValorVariable)
                            .addComponent(labCantidadValorVariable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labStarter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labPikachu, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labVidaStarter, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labVidaPikachu, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            Personajes.starter.ataquePrincipal(enemigo);
        }
        if (starter.isPonerseEscudo()) {
            ((Poppy) Personajes.starter).setLlevaEscudo(true);
            labCantidadValorVariable.setText("Sí");
            JOptionPane.showMessageDialog(
                    this,
                    "Poppy cogió un escudo tras golpear. +"
                    + ((Poppy) Personajes.starter).getProteccionEscudo() + " escudo",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
        }

        labVidaPikachu.setText(String.valueOf((int) enemigo.getVida()));
        turnoEnemigo();
    }//GEN-LAST:event_butAtaquePrincipalActionPerformed

    private void butAtaqueSecundarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAtaqueSecundarioActionPerformed
        if (starter.isFallaElAtaque()) {
            JOptionPane.showMessageDialog(
                    this,
                    "MegaGnar falló la roca",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            starter.ataqueSecundario(enemigo);
            if (starter instanceof Gnar gnar && gnar.isMonstruo()) {
                JOptionPane.showMessageDialog(
                        this,
                        "MegaGnar golpeó con la roca y aturdió a " + enemigo.getNombreEnemigo(),
                        this.getName(),
                        JOptionPane.INFORMATION_MESSAGE);
                enemigo.setCegado(true);
            }
        }

        if (starter.isPuedeEsquivar()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Gnar esquivó el ataque de " + enemigo.getNombreEnemigo() + " con su salto",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            enemigo.setCegado(true);
        }

        labVidaPikachu.setText(String.valueOf((int) enemigo.getVida()));
        turnoEnemigo();
    }//GEN-LAST:event_butAtaqueSecundarioActionPerformed

    private void eliminarBufosTemporalesStarters() {
        if (Personajes.starter instanceof Teemo teemo) {
            //Vacio
        } else if (Personajes.starter instanceof Gnar gnar) {
            gnar.setEsMonstruo(false);
            gnar.setContadorMonstruo(0);
        } else if (Personajes.starter instanceof Poppy poppy) {
            poppy.setLlevaEscudo(false);
        }
    }

    private void turnoEnemigo() {
        if (estaEnemigoMuerto()) {
            return;
        }

        if (turnoEnemigoCegadoYEnvenenado()) {
            return;
        }
        if (turnoEnemigoCegado()) {
            return;
        }
        if (turnoEnemigoConfundido()) {
            return;
        }
        if (turnoEnemigoEnvenenado()) {
            return;
        }

        turnoEnemigoSinEfectos();

        isStarterMuerto();
    }

    private void isStarterMuerto() throws HeadlessException {
        if (Personajes.starter.getVida() <= 0) { //Al morir se pierde todo el oro
            Personajes.starter.setCantidadOro(0);
            Personajes.starter.setVida(Personajes.starter.getVidaMaxima() / 2);
            if (Personajes.starter instanceof Gnar gnar) {
                gnar.setEsMonstruo(false);
                gnar.setContadorMonstruo(0);
            }
            JOptionPane.showMessageDialog(
                    this,
                    "Has muerto!! Perdiste tu oro",
                    this.getName(),
                    JOptionPane.WARNING_MESSAGE);
            this.setVisible(false);
            this.getRootPane().getContentPane().remove(this);
        }
    }

    private void turnoEnemigoSinEfectos() throws HeadlessException {
        double dano = obtenerDanoEnemigo();
        dano = ajustarDanoAResistencias(dano);
        JOptionPane.showMessageDialog(
                this,
                enemigo.getNombreEnemigo() + " inflingió: " + ((dano != 0) ? ((int) dano + 1) : 0) + " daño.",
                this.getName(),
                JOptionPane.INFORMATION_MESSAGE);
        Personajes.starter.setVida(Personajes.starter.getVida() - dano);
        labVidaStarter.setText(String.valueOf((int) Personajes.starter.getVida()));

        gnarPierdeUnTurnoComoMega();
        posibleTransformacionGnar();
        eliminarEscudoPoppy();
    }

    private boolean turnoEnemigoConfundido() throws HeadlessException {
        if (enemigo.isConfundido()) {
            labEfectoDebilitador.setText("Sí");
            double dano = obtenerDanoEnemigo();
            JOptionPane.showMessageDialog(
                    this,
                    enemigo.getNombreEnemigo() + "  esta confundido y se inflingió: " + ((int) dano + 1) + " daño.",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            enemigo.setVida(enemigo.getVida() - dano);
            labVidaPikachu.setText(String.valueOf((int) enemigo.getVida()));
            gnarPierdeUnTurnoComoMega();
            posibleTransformacionGnar();
            eliminarEscudoPoppy();
            enemigo.setConfundido(false);
            labEfectoDebilitador.setText("No");
            estaEnemigoMuerto();
            return true;
        }
        return false;
    }

    private boolean turnoEnemigoCegado() throws HeadlessException {
        if (enemigo.isCegado()) {
            JOptionPane.showMessageDialog(
                    this,
                    enemigo.getNombreEnemigo()
                    + ((starter instanceof Teemo) ? " fue cegado y no atacó."
                            : ((starter instanceof Gnar) ? " no atacó." : "")),
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            enemigo.setCegado(false);
            return true;
        }
        return false;
    }

    private boolean turnoEnemigoEnvenenado() throws HeadlessException {
        if (enemigo.isEnvenenado()) {
            labEfectoDebilitador.setText("Sí");
            danoVenenoYReducirDuracion();
            if (estaEnemigoMuerto()) {
                return true;
            }
            if (enemigo.getTurnosEnvenenado() == 2) {
                JOptionPane.showMessageDialog(
                        this,
                        enemigo.getNombreEnemigo() + " fue envenenado",
                        this.getName(),
                        JOptionPane.INFORMATION_MESSAGE);
            }
            turnoEnemigoSinEfectos();
            return true;
        }
        return false;
    }

    private boolean turnoEnemigoCegadoYEnvenenado() throws HeadlessException {
        if (enemigo.isEnvenenado() && enemigo.isCegado()) {
            danoVenenoYReducirDuracion();
            labEfectoDebilitador.setText("Sí");
            estaEnemigoMuerto();
            JOptionPane.showMessageDialog(
                    this,
                    enemigo.getNombreEnemigo() + " fue envenenado y cegado",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            enemigo.setCegado(false);
            return true;
        }
        return false;
    }

    private void danoVenenoYReducirDuracion() {
        if (enemigo.isEnvenenado()) {
            enemigo.setVida(enemigo.getVida() - ((Teemo) Personajes.starter).getDanoVeneno());
            labVidaPikachu.setText(String.valueOf((int) enemigo.getVida()));
            enemigo.setTurnosEnvenenado(enemigo.getTurnosEnvenenado() - 1);
            if (enemigo.getTurnosEnvenenado() == 0) {
                enemigo.setEnvenenado(false);
                labEfectoDebilitador.setText("No");
            }
        }
    }

    private double ajustarDanoAResistencias(double dano) {
        if (Personajes.starter instanceof Teemo) {
            return dano;
        } else if (Personajes.starter instanceof Gnar gnar) {
            if (!gnar.isMonstruo()) {
                return dano - dano * gnar.getResistencia() / 100 / 2;
            }
            return dano - dano * gnar.getResistencia() / 100;
        } else if (Personajes.starter instanceof Poppy poppy) {
            if (!poppy.isLlevaEscudo()) {
                return dano;
            } else if (poppy.isLlevaEscudo()) {
                if (dano <= poppy.getProteccionEscudo()) {
                    System.out.println("El escudo bloquea todo");
                    return 0; //El escudo bolquea todo el dano
                } else {
                    System.out.println(dano + "-" + poppy.getProteccionEscudo() + "=" + (dano - poppy.getProteccionEscudo()));
                    return dano - poppy.getProteccionEscudo();
                }
            }
        }
        return 0;
    }

    private void posibleTransformacionGnar() {
        if (Personajes.starter instanceof Gnar gnar && !gnar.isMonstruo()) {
            double num = (Math.random() * 100 + gnar.getResistencia() / 10); //23+3%(26) al principio 23+7%(30%) con la resistencia al max
            if (num >= 77) {
                gnar.setEsMonstruo(true);
                gnar.setContadorMonstruo(3);

                JOptionPane.showMessageDialog(
                        this,
                        "Gnar se transformó en MegaGnar",
                        this.getName(),
                        JOptionPane.INFORMATION_MESSAGE);
                labStarter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/gnarGrande.png")));
                butAtaquePrincipal.setText("Golpe");
                butAtaqueSecundario.setText("Lanzar Roca");
            }
        }
    }

    private void gnarPierdeUnTurnoComoMega() {
        if (Personajes.starter instanceof Gnar gnar && gnar.isMonstruo()) {
            gnar.setContadorMonstruo(gnar.getContadorMonstruo() - 1);
            if (gnar.getContadorMonstruo() <= 0) {
                gnar.setEsMonstruo(false);
                JOptionPane.showMessageDialog(
                        this,
                        "MegaGnar volvió a su forma de gnar",
                        this.getName(),
                        JOptionPane.INFORMATION_MESSAGE);
                labStarter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/gnarPeque.png")));
                butAtaquePrincipal.setText("Boomerang");
                butAtaqueSecundario.setText("Salto");
            }
        }
    }

    private void eliminarEscudoPoppy() {
        if (Personajes.starter instanceof Poppy poppy && poppy.isLlevaEscudo()) {
            poppy.setLlevaEscudo(false);
            labCantidadValorVariable.setText("No");
        }
    }

    private boolean estaEnemigoMuerto() throws HeadlessException {
        if (enemigo.getVida() <= 0) {
            Personajes.starter.setCantidadOro(Personajes.starter.getCantidadOro() + (int) enemigo.getRecompensa());
            eliminarBufosTemporalesStarters();
            JOptionPane.showMessageDialog(this,
                    "Has vencido a " + enemigo.getNombreEnemigo() + " y obtuviste: " + enemigo.getRecompensa(),
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            this.getRootPane().getContentPane().remove(this);
            return true;
        }
        return false;
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
    private javax.swing.JLabel labFijoDano;
    private javax.swing.JLabel labFijoEfectoDebilitador;
    private javax.swing.JLabel labFijoOro;
    private javax.swing.JLabel labFijoValorVariable;
    private javax.swing.JLabel labPikachu;
    private javax.swing.JLabel labStarter;
    private javax.swing.JLabel labVersus;
    private javax.swing.JLabel labVidaPikachu;
    private javax.swing.JLabel labVidaStarter;
    // End of variables declaration//GEN-END:variables

}
