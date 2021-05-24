package leagueofpokimon;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class PanelTienda extends javax.swing.JPanel {

    public PanelTienda() {
        initComponents();
    }

    public void mostrar() {
        refrescarOro();
        refrescarDano();
        refrescarVida();
        refrescarValorVariable();
        if (Personajes.starter instanceof Teemo) {
            labFijoValorVariable.setText("Daño Veneno:");
            labAportacionItemVariable.setText("+1 Daño Veneno");
            butItemVariable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/posinos.png")));
        } else if (Personajes.starter instanceof Gnar) {
            labFijoValorVariable.setText("Resistencia:");
            labAportacionItemVariable.setText("+2 Resistencia");
            butItemVariable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/armor.png")));
        } else if (Personajes.starter instanceof Poppy) {
            labFijoValorVariable.setText("Escudo:");
            labAportacionItemVariable.setText("+1 Dureza Escudo");
            butItemVariable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shield.png")));
        }

        refrescarPrecioEspada();
        refrescarPrecioValorVariable();
        this.setVisible(true);
        butPocion.requestFocusInWindow();
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
        labFijoVida = new javax.swing.JLabel();
        labCantidadVida = new javax.swing.JLabel();
        butPocion = new javax.swing.JButton();
        labPrecioPocion = new javax.swing.JLabel();
        labMonedaPocion = new javax.swing.JLabel();
        labVidaPocion = new javax.swing.JLabel();
        butItemVariable = new javax.swing.JButton();
        labPrecioItemVariable = new javax.swing.JLabel();
        labMonedaItemVariable = new javax.swing.JLabel();
        labAportacionItemVariable = new javax.swing.JLabel();
        butEspada = new javax.swing.JButton();
        labPrecioEspada = new javax.swing.JLabel();
        labMonedaEspada = new javax.swing.JLabel();
        labDanoEspada = new javax.swing.JLabel();

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

        butPocion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pocion.png"))); // NOI18N
        butPocion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        butPocion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPocionActionPerformed(evt);
            }
        });

        labPrecioPocion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labPrecioPocion.setText("30");

        labMonedaPocion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/coin.png"))); // NOI18N
        labMonedaPocion.setText(" ");

        labVidaPocion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labVidaPocion.setText("+50 Vida");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labPrecioEspada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labMonedaEspada, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labDanoEspada))
                    .addComponent(butEspada, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labCabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labFijoValorVariable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labFijoVida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labFijoDano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labFijoOro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labCantidadOro)
                    .addComponent(labCantidadDano)
                    .addComponent(labCantidadValorVariable)
                    .addComponent(labCantidadVida))
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labPrecioPocion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labMonedaPocion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(labVidaPocion))
                    .addComponent(butPocion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labFijoOro)
                            .addComponent(labCantidadOro))
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
                            .addComponent(labFijoVida)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(butPocion)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labPrecioPocion)
                            .addComponent(labVidaPocion)
                            .addComponent(labMonedaPocion))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(butEspada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labPrecioEspada)
                            .addComponent(labDanoEspada)
                            .addComponent(labMonedaEspada)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(butItemVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labPrecioItemVariable)
                            .addComponent(labAportacionItemVariable)
                            .addComponent(labMonedaItemVariable))))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void butPocionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPocionActionPerformed
        if (Personajes.starter.getCantidadOro() < Integer.parseInt(labPrecioPocion.getText())) {
            JOptionPane.showMessageDialog(
                    this,
                    "No tienes dinero para comprar este objeto!",
                    this.getName(),
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (Personajes.starter.getVida() >= Personajes.starter.getVidaMaxima()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Tienes la vida al maximo",
                    this.getName(),
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        Personajes.starter.setCantidadOro(Personajes.starter.getCantidadOro() - Integer.parseInt(labPrecioPocion.getText()));
        Personajes.starter.setVida(Personajes.starter.getVida() + 50);
        if (Personajes.starter.getVida() > Personajes.starter.getVidaMaxima()) {
            Personajes.starter.setVida(Personajes.starter.getVidaMaxima());
        }
        refrescarOro();
        refrescarVida();
        JOptionPane.showMessageDialog(
                this,
                "Compraste una pocion (+50 de vida)",
                this.getName(),
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butPocionActionPerformed

    private void butItemVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butItemVariableActionPerformed
        //CASO TEEMO
        if (Personajes.starter instanceof Teemo teemo) {
            butItemVariableTeemo(teemo);
        } else if (Personajes.starter instanceof Gnar gnar) {
            butItemVariableGnar(gnar);
        } else if (Personajes.starter instanceof Poppy poppy) {
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
        if (teemo.getDanoVeneno() >= 20) {
            JOptionPane.showMessageDialog(
                    this,
                    "20 es el maximo de daño por veneno",
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
        refrescarPrecioValorVariable();
        return false;
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
        if (gnar.getResistencia() >= 70) {
            JOptionPane.showMessageDialog(
                    this,
                    "70 es el maximo de resistencia",
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
        refrescarPrecioValorVariable();
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
        if (poppy.getProteccionEscudo() >= 20) {
            JOptionPane.showMessageDialog(
                    this,
                    "20 es el maximo de dureza de escudo",
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
        refrescarPrecioValorVariable();
        return false;
    }

    private void butEspadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butEspadaActionPerformed
        if (Personajes.starter.getCantidadOro() < Integer.parseInt(labPrecioEspada.getText())) {
            JOptionPane.showMessageDialog(
                    this,
                    "No tienes dinero para comprar este objeto!",
                    this.getName(),
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (Personajes.starter.getDano() >= Personajes.starter.getDanoMaximo()) {
            JOptionPane.showMessageDialog(
                    this,
                    Personajes.starter.getDanoMaximo() + " es el maximo de daño por golpe",
                    this.getName(),
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        Personajes.starter.setCantidadOro(Personajes.starter.getCantidadOro() - Integer.parseInt(labPrecioEspada.getText()));
        Personajes.starter.setDano(Personajes.starter.getDano() + 2);
        refrescarOro();
        refrescarDano();
        JOptionPane.showMessageDialog(
                this,
                "Compraste una espada (+2 de daño)",
                this.getName(),
                JOptionPane.INFORMATION_MESSAGE);
        refrescarPrecioEspada();
    }//GEN-LAST:event_butEspadaActionPerformed

    private void refrescarVida() {
        labCantidadVida.setText(String.valueOf(((double) ((int) Personajes.starter.getVida() * 10)) / 10));
    }

    private void refrescarValorVariable() {
        if (Personajes.starter instanceof Teemo teemo) {
            labCantidadValorVariable.setText(String.valueOf(((double) (teemo.getDanoVeneno()) * 10) / 10));
        } else if (Personajes.starter instanceof Gnar gnar) {
            labCantidadValorVariable.setText(String.valueOf(((double) (gnar.getResistencia()) * 10) / 10));
        } else if (Personajes.starter instanceof Poppy poppy) {
            labCantidadValorVariable.setText(String.valueOf(((double) (poppy.getProteccionEscudo()) * 10) / 10));
        }
    }

    private void refrescarDano() {
        labCantidadDano.setText(String.valueOf(((double) (Personajes.starter.getDano() * 10)) / 10));
    }

    private void refrescarOro() {
        labCantidadOro.setText(String.valueOf(Personajes.starter.getCantidadOro()));
    }

    private void refrescarPrecioValorVariable() throws NumberFormatException {
        if (Personajes.starter instanceof Teemo) {
            labPrecioItemVariable.setText(String.valueOf((int) (Double.parseDouble(labCantidadValorVariable.getText()) * 30)));
        } else if (Personajes.starter instanceof Gnar) {
            labPrecioItemVariable.setText(String.valueOf((int) (Double.parseDouble(labCantidadValorVariable.getText()) * 2.2)));
        } else if (Personajes.starter instanceof Poppy) {
            labPrecioItemVariable.setText(String.valueOf((int) (Double.parseDouble(labCantidadValorVariable.getText()) * 14)));
        }
    }

    private void refrescarPrecioEspada() throws NumberFormatException {
        labPrecioEspada.setText(String.valueOf((int) (Double.parseDouble(labCantidadDano.getText()) * 20 - 50)));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butEspada;
    private javax.swing.JButton butItemVariable;
    private javax.swing.JButton butPocion;
    private javax.swing.JLabel labAportacionItemVariable;
    private javax.swing.JLabel labCabecera;
    private javax.swing.JLabel labCantidadDano;
    private javax.swing.JLabel labCantidadOro;
    private javax.swing.JLabel labCantidadValorVariable;
    private javax.swing.JLabel labCantidadVida;
    private javax.swing.JLabel labDanoEspada;
    private javax.swing.JLabel labFijoDano;
    private javax.swing.JLabel labFijoOro;
    private javax.swing.JLabel labFijoValorVariable;
    private javax.swing.JLabel labFijoVida;
    private javax.swing.JLabel labMonedaEspada;
    private javax.swing.JLabel labMonedaItemVariable;
    private javax.swing.JLabel labMonedaPocion;
    private javax.swing.JLabel labPrecioEspada;
    private javax.swing.JLabel labPrecioItemVariable;
    private javax.swing.JLabel labPrecioPocion;
    private javax.swing.JLabel labVidaPocion;
    // End of variables declaration//GEN-END:variables
}
