package leagueofpokimon;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class PanelCombatePikachu extends javax.swing.JPanel {

    public Pikachu pikachu;

    public PanelCombatePikachu() {
        initComponents();
    }

    public void mostrar() {
        definirPikachu();
        labVidaPikachu.setText(String.valueOf((int) pikachu.getVida()));
        labEfectoDebilitador.setText("No");

        labVidaStarter.setText(String.valueOf((int) Personajes.starter.getVida()));
        labCantidadDano.setText(String.valueOf((int) Personajes.starter.getDano()));
        labCantidadOro.setText(String.valueOf(Personajes.starter.getCantidadOro()));

        if (Personajes.starter instanceof Teemo teemo) {
            labFijoValorVariable.setText("Daño Veneno:");
            labCantidadValorVariable.setText(String.valueOf((int) teemo.getDanoVeneno()));
            labFijoEfectoDebilitador.setText("Envenenado?");
            labEfectoDebilitador.setText("No");
            labStarter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/teemoPequeno.png")));
        } else if (Personajes.starter instanceof Gnar gnar) {
            labFijoValorVariable.setText("Resistencia:");
            labCantidadValorVariable.setText(String.valueOf((int) gnar.getResistencia()));
            labFijoEfectoDebilitador.setText("Aturdido:");
            labEfectoDebilitador.setText("No"); //TO DO
            labStarter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/gnarPeque.png")));
            butAtaque1.setText("Boomerang");
            butAtaque2.setText("Salto");
        } else if (Personajes.starter instanceof Poppy poppy) {
            labFijoValorVariable.setText("Escudo?:");
            labCantidadValorVariable.setText((poppy.isLlevaEscudo()) ? "Sí" : "No");
            labFijoEfectoDebilitador.setText("Confundido?");
            labEfectoDebilitador.setText("No");
            labStarter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Poppy.png")));
            butAtaque1.setText("Placaje con escudo");
            butAtaque2.setText("Martillazo");
        }

        this.setVisible(true);
        this.requestFocusInWindow();
    }

    private void definirPikachu() {
        int num = (int) (Math.random() * 5 + 1); //1,2,3
        switch (num) {
            case 1:
                this.pikachu = new Pikachu();
                pikachu.setDano(10);
                pikachu.setVida(50);
                pikachu.setRecompensa(100);
                System.out.println("pikachu 1");
                break;
            case 2:
                this.pikachu = new Pikachu();
                pikachu.setDano(10);
                pikachu.setVida(60);
                pikachu.setRecompensa(120);
                System.out.println("pikachu 2");
                break;
            case 3:
                this.pikachu = new Pikachu();
                pikachu.setDano(8);
                pikachu.setVida(75);
                pikachu.setRecompensa(110);
                System.out.println("pikachu 3");
                break;
            case 4:
                this.pikachu = new Pikachu();
                pikachu.setDano(12);
                pikachu.setVida(40);
                pikachu.setRecompensa(115);
                System.out.println("pikachu 4");
                break;
            case 5:
                this.pikachu = new Pikachu();
                pikachu.setDano(10);
                pikachu.setVida(90);
                pikachu.setRecompensa(160);
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
        butAtaque1 = new javax.swing.JButton();
        butAtaque2 = new javax.swing.JButton();

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

        butAtaque1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        butAtaque1.setText("Arañazo");
        butAtaque1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAtaque1ActionPerformed(evt);
            }
        });

        butAtaque2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        butAtaque2.setText("Dardo venenoso");
        butAtaque2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAtaque2ActionPerformed(evt);
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
                        .addComponent(butAtaque1)
                        .addGap(18, 18, 18)
                        .addComponent(butAtaque2))
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
                    .addComponent(butAtaque2)
                    .addComponent(butAtaque1)
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

    private void butAtaque1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAtaque1ActionPerformed

        if (Personajes.starter instanceof Teemo) {
            aranazoTeemo();
        } else if (Personajes.starter instanceof Gnar gnar) {
            if (!gnar.isMonstruo()) {
                boomerangMiniGnar();
            } else {
                golpeMegaGnar();
            }
        } else if (Personajes.starter instanceof Poppy poppy) {
            placajeConEscudoPoppy();
        }
    }//GEN-LAST:event_butAtaque1ActionPerformed

    private void butAtaque2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAtaque2ActionPerformed
        if (Personajes.starter instanceof Teemo) {
            dardoVenenosoTeemo();
        } else if (Personajes.starter instanceof Gnar gnar) {
            if (!gnar.isMonstruo()) {
                saltoMiniGnar();
            } else {
                lanzarRocaMegaGnar();
            }
        } else if (Personajes.starter instanceof Poppy poppy) {
            martillazoPoppy();
        }
    }//GEN-LAST:event_butAtaque2ActionPerformed

    private void aranazoTeemo() throws HeadlessException {
        pikachu.setVida(pikachu.getVida() - Personajes.starter.getDano());
        labVidaPikachu.setText(String.valueOf((int) pikachu.getVida()));
        turnoPikachu();
    }

    private void boomerangMiniGnar() {
        int num = (int) (Math.random() * 2 + 1);
        if (num == 1) {
            pikachu.setVida(pikachu.getVida() - Personajes.starter.getDano());
        } else {
            pikachu.setVida(pikachu.getVida() - Personajes.starter.getDano() * 2);

            JOptionPane.showMessageDialog(
                    this,
                    "Boomerang golpeó dos veces",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
        }
        labVidaPikachu.setText(String.valueOf((int) pikachu.getVida()));
        turnoPikachu();
    }

    private void golpeMegaGnar() throws HeadlessException {

        pikachu.setVida(pikachu.getVida() - Personajes.starter.getDano() * 2);
        labVidaPikachu.setText(String.valueOf((int) pikachu.getVida()));
        turnoPikachu();
    }

    private void placajeConEscudoPoppy() {
        pikachu.setVida(pikachu.getVida() - Personajes.starter.getDano());
        labVidaPikachu.setText(String.valueOf((int) pikachu.getVida()));
        posibilidadObtenerEscudoPoppy();
        turnoPikachu();
    }

    private void saltoMiniGnar() throws HeadlessException {
        pikachu.setVida(pikachu.getVida() - Personajes.starter.getDano());
        labVidaPikachu.setText(String.valueOf((int) pikachu.getVida()));
        if (estaPikachuMuerto()) {
            return;
        }
        int num = (int) (Math.random() * 2 + 1);
        if (num == 1) {
            JOptionPane.showMessageDialog(
                    this,
                    "Gnar esquivó el ataque de pikachu con su salto",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            gnarPierdeUnTurnoComoMega();
            return;
        }
        turnoPikachu();
    }

    private void lanzarRocaMegaGnar() throws HeadlessException {
        int num = (int) (Math.random() * 4 + 1);
        if (num == 1) {
            JOptionPane.showMessageDialog(
                    this,
                    "MegaGnar falló la roca",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            turnoPikachu();
            return;
        }
        JOptionPane.showMessageDialog(
                this,
                "MegaGnar golpeó con la roca y aturdió a pikachu",
                this.getName(),
                JOptionPane.INFORMATION_MESSAGE);
        pikachu.setVida(pikachu.getVida() - Personajes.starter.getDano() * 2);
        labVidaPikachu.setText(String.valueOf((int) pikachu.getVida()));
        if (estaPikachuMuerto()) {
            return;
        }
        gnarPierdeUnTurnoComoMega();
    }

    private void martillazoPoppy() {
        pikachu.setVida(pikachu.getVida() - Personajes.starter.getDano() / 2);
        labVidaPikachu.setText(String.valueOf((int) pikachu.getVida()));
        posibilidadConfundirAlEnemigoPoppy();
        turnoPikachu();
    }

    private void dardoVenenosoTeemo() {
        int num = ((int) (Math.random() * 100 + 1)) + ((Teemo) Personajes.starter).getDanoVeneno();
        if (num > 50 && num < 75) { //Envenenado
            pikachu.setEnvenenado(true);
            pikachu.setTurnosEnvenenado(3);
            labEfectoDebilitador.setText("Sí");
            JOptionPane.showMessageDialog(
                    this,
                    "Pikachu fue envenenado",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (num >= 75 && num < 90) { //Cegado
            pikachu.setCegado(true);
            JOptionPane.showMessageDialog(
                    this,
                    "Pikachu fue cegado",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (num >= 90) { //Envenenado y cegado
            pikachu.setEnvenenado(true);
            pikachu.setTurnosEnvenenado(3);
            pikachu.setCegado(true);
            labEfectoDebilitador.setText("Sí");
            JOptionPane.showMessageDialog(
                    this,
                    "Pikachu fue envenenado y cegado",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
        }
        pikachu.setVida(pikachu.getVida() - Personajes.starter.getDano() / 2);
        labVidaPikachu.setText(String.valueOf((int) pikachu.getVida()));
        turnoPikachu();
    }

    private boolean estaPikachuMuerto() throws HeadlessException {
        if (pikachu.getVida() <= 0) {
            Personajes.starter.setCantidadOro(Personajes.starter.getCantidadOro() + (int) pikachu.getRecompensa());
            eliminarBufosTemporalesStarters();
            JOptionPane.showMessageDialog(
                    this,
                    "Has vencido y obtuviste: " + pikachu.getRecompensa(),
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            this.getRootPane().getContentPane().remove(this);
            return true;
        }
        return false;
    }

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

    private void turnoPikachu() {
        if (estaPikachuMuerto()) {
            return;
        }

        if (turnoPikachuCegadoYEnvenenado()) {
            return;
        }
        if (turnoPikachuCegado()) {
            return;
        }
        if (turnoPikachuConfundido()) {
            return;
        }
        if (turnoPikachuEnvenenado()) {
            return;
        }

        turnoPikachuSinEfectos();

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

    private void turnoPikachuSinEfectos() throws HeadlessException {
        double dano = obtenerDanoPikachu();
        dano = ajustarDanoAResistencias(dano);
        JOptionPane.showMessageDialog(
                this,
                "Pikachu inflingió: " + ((dano != 0) ? ((int) dano + 1) : 0) + " daño.",
                this.getName(),
                JOptionPane.INFORMATION_MESSAGE);
        Personajes.starter.setVida(Personajes.starter.getVida() - dano);
        labVidaStarter.setText(String.valueOf((int) Personajes.starter.getVida()));

        gnarPierdeUnTurnoComoMega();
        posibleTransformacionGnar();
        eliminarEscudoPoppy();
    }

    private boolean turnoPikachuConfundido() throws HeadlessException {
        if (pikachu.isConfundido()) {
            double dano = obtenerDanoPikachu();
            JOptionPane.showMessageDialog(
                    this,
                    "Pikachu esta confundido y se inflingió: " + ((int) dano + 1) + " daño.",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            pikachu.setVida(pikachu.getVida() - dano);
            labVidaPikachu.setText(String.valueOf((int) pikachu.getVida()));
            gnarPierdeUnTurnoComoMega();
            posibleTransformacionGnar();
            eliminarEscudoPoppy();
            pikachu.setConfundido(false);
            labEfectoDebilitador.setText("No");
            estaPikachuMuerto();
            return true;
        }
        return false;
    }

    private boolean turnoPikachuCegado() throws HeadlessException {
        if (pikachu.isCegado()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Pikachu está cegado y no atacó.",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
        return false;
    }

    private boolean turnoPikachuEnvenenado() throws HeadlessException {
        if (pikachu.isEnvenenado()) {
            danoVenenoYReducirDuracion();
            if (estaPikachuMuerto()) {
                return true;
            }
            turnoPikachuSinEfectos();
            return true;
        }
        return false;
    }

    private boolean turnoPikachuCegadoYEnvenenado() throws HeadlessException {
        if (pikachu.isEnvenenado() && pikachu.isCegado()) {
            pikachu.setCegado(false);
            danoVenenoYReducirDuracion();
            estaPikachuMuerto();
            return true;
        }
        return false;
    }

    private void danoVenenoYReducirDuracion() {
        if (pikachu.isEnvenenado()) {
            pikachu.setVida(pikachu.getVida() - ((Teemo) Personajes.starter).getDanoVeneno());
            labVidaPikachu.setText(String.valueOf((int) pikachu.getVida()));
            pikachu.setTurnosEnvenenado(pikachu.getTurnosEnvenenado() - 1);
            if (pikachu.getTurnosEnvenenado() == 0) {
                pikachu.setEnvenenado(false);
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
                butAtaque1.setText("Golpe");
                butAtaque2.setText("Lanzar Roca");
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
                butAtaque1.setText("Boomerang");
                butAtaque2.setText("Salto");
            }
        }
    }

    private void posibilidadObtenerEscudoPoppy() {
        int num = (int) (Math.random() * 2 + 1);
        if (num == 1) {
            ((Poppy) Personajes.starter).setLlevaEscudo(true);
            labCantidadValorVariable.setText("Sí");
            JOptionPane.showMessageDialog(
                    this,
                    "Poppy cogió un escudo tras golpear. +"
                    + ((Poppy) Personajes.starter).getProteccionEscudo() + " escudo",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void posibilidadConfundirAlEnemigoPoppy() {
        int num = (int) (Math.random() * 3 + 1);
        if (num == 1) {
            pikachu.setConfundido(true);
            labEfectoDebilitador.setText("Sí");
        }
    }

    private void eliminarEscudoPoppy() {
        if (Personajes.starter instanceof Poppy poppy && poppy.isLlevaEscudo()) {
            poppy.setLlevaEscudo(false);
            labCantidadValorVariable.setText("No");
        }
    }

    private double obtenerDanoPikachu() {
        double dano = pikachu.getDano();
        int num = (int) (Math.random() * 5 + 1);
        switch (num) {
            case 1:
                dano = pikachu.getDano() * .7;
                break;
            case 2:
                dano = pikachu.getDano() * .85;
                break;
            case 3:
                dano = pikachu.getDano();
                break;
            case 4:
                dano = pikachu.getDano() * 1.15;
                break;
            case 5:
                dano = pikachu.getDano() * 1.3;
                break;
        }
        return dano;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAtaque1;
    private javax.swing.JButton butAtaque2;
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
