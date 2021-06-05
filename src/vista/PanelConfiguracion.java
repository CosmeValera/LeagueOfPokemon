package vista;

import javax.swing.JOptionPane;
import modelo.Globals;

public class PanelConfiguracion extends javax.swing.JPanel {

    public PanelConfiguracion() {
        initComponents();
    }

    void mostrar() {
        labAtaquePrincipal1.setText("Ataque Principal: " + Globals.letterMainAttackStarter);
        labAtaqueSecundario1.setText("Ataque Secundario: " + Globals.letterSecondaryAttackStarter);
        labHuir.setText("Huir: " + Globals.letterEscape);
        labAtaquePrincipal2.setText("Ataque Principal: " + Globals.letterMainAttackStarter2);
        labAtaqueSecundario2.setText("Ataque Secundario: " + Globals.letterSecondaryAttackStarter2);

        this.setVisible(true);
        this.requestFocusInWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labCabecera = new javax.swing.JLabel();
        labJugador1 = new javax.swing.JLabel();
        labAtaquePrincipal1 = new javax.swing.JLabel();
        butAtaquePrincipal1 = new javax.swing.JButton();
        labAtaqueSecundario1 = new javax.swing.JLabel();
        butAtaqueSecundario1 = new javax.swing.JButton();
        labHuir = new javax.swing.JLabel();
        butHuir = new javax.swing.JButton();
        labJugador2 = new javax.swing.JLabel();
        labAtaquePrincipal2 = new javax.swing.JLabel();
        butAtaquePrincipal2 = new javax.swing.JButton();
        labAtaqueSecundario2 = new javax.swing.JLabel();
        butAtaqueSecundario2 = new javax.swing.JButton();

        setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        setMaximumSize(new java.awt.Dimension(800, 560));
        setMinimumSize(new java.awt.Dimension(800, 560));

        labCabecera.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labCabecera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCabecera.setText("CONFIGURACIÓN");

        labJugador1.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        labJugador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labJugador1.setText("Jugador 1");

        labAtaquePrincipal1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labAtaquePrincipal1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labAtaquePrincipal1.setText("Ataque Principal: A");

        butAtaquePrincipal1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butAtaquePrincipal1.setText("Cambiar");
        butAtaquePrincipal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butJugador1_ActionPerformed(evt);
            }
        });

        labAtaqueSecundario1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labAtaqueSecundario1.setText("Ataque Secundario: S");

        butAtaqueSecundario1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butAtaqueSecundario1.setText("Cambiar");
        butAtaqueSecundario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butJugador1_ActionPerformed(evt);
            }
        });

        labHuir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labHuir.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labHuir.setText("Huir: H");

        butHuir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butHuir.setText("Cambiar");
        butHuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butJugador1_ActionPerformed(evt);
            }
        });

        labJugador2.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        labJugador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labJugador2.setText("Jugador 2");

        labAtaquePrincipal2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labAtaquePrincipal2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labAtaquePrincipal2.setText("Ataque Principal: O");

        butAtaquePrincipal2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butAtaquePrincipal2.setText("Cambiar");
        butAtaquePrincipal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butJugador2_ActionPerformed(evt);
            }
        });

        labAtaqueSecundario2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labAtaqueSecundario2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labAtaqueSecundario2.setText("Ataque Secundario: P");

        butAtaqueSecundario2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butAtaqueSecundario2.setText("Cambiar");
        butAtaqueSecundario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butJugador2_ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(labHuir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labAtaquePrincipal1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labAtaqueSecundario1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(butAtaquePrincipal1)
                                    .addComponent(butAtaqueSecundario1)
                                    .addComponent(butHuir))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(labAtaquePrincipal2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labAtaqueSecundario2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(butAtaquePrincipal2)
                                    .addComponent(butAtaqueSecundario2))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labJugador1)
                    .addComponent(labJugador2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labAtaquePrincipal1)
                    .addComponent(labAtaquePrincipal2)
                    .addComponent(butAtaquePrincipal1)
                    .addComponent(butAtaquePrincipal2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labAtaqueSecundario1)
                    .addComponent(labAtaqueSecundario2)
                    .addComponent(butAtaqueSecundario1)
                    .addComponent(butAtaqueSecundario2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labHuir)
                    .addComponent(butHuir))
                .addContainerGap(294, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void butJugador1_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butJugador1_ActionPerformed
        String letra = pedirLetra();
        if (evt.getSource() == butAtaquePrincipal1) {
            Globals.letterMainAttackStarter = letra;
            labAtaquePrincipal1.setText(labAtaquePrincipal1.getText().substring(0, labAtaquePrincipal1.getText().length() - 1) + letra);
        } else if (evt.getSource() == butAtaqueSecundario1) {
            Globals.letterSecondaryAttackStarter = letra;
            labAtaqueSecundario1.setText(labAtaqueSecundario1.getText().substring(0, labAtaqueSecundario1.getText().length() - 1) + letra);
        } else if (evt.getSource() == butHuir) {
            Globals.letterEscape = letra;
            labHuir.setText(labHuir.getText().substring(0, labHuir.getText().length() - 1) + letra);
        }
    }//GEN-LAST:event_butJugador1_ActionPerformed

    private void butJugador2_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butJugador2_ActionPerformed
        String letra = pedirLetra();
        if (evt.getSource() == butAtaquePrincipal2) {
            Globals.letterMainAttackStarter2 = letra;
            labAtaquePrincipal2.setText(labAtaquePrincipal2.getText().substring(0, labAtaquePrincipal2.getText().length() - 1) + letra);
        } else if (evt.getSource() == butAtaqueSecundario2) {
            Globals.letterSecondaryAttackStarter2 = letra;
            labAtaqueSecundario2.setText(labAtaqueSecundario2.getText().substring(0, labAtaqueSecundario2.getText().length() - 1) + letra);
        }
    }//GEN-LAST:event_butJugador2_ActionPerformed

    public String pedirLetra() {
        String letra = String.valueOf((JOptionPane.showInputDialog(
                this,
                "Introduce la letra:")).toUpperCase().charAt(0));
        return letra;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAtaquePrincipal1;
    private javax.swing.JButton butAtaquePrincipal2;
    private javax.swing.JButton butAtaqueSecundario1;
    private javax.swing.JButton butAtaqueSecundario2;
    private javax.swing.JButton butHuir;
    private javax.swing.JLabel labAtaquePrincipal1;
    private javax.swing.JLabel labAtaquePrincipal2;
    private javax.swing.JLabel labAtaqueSecundario1;
    private javax.swing.JLabel labAtaqueSecundario2;
    private javax.swing.JLabel labCabecera;
    private javax.swing.JLabel labHuir;
    private javax.swing.JLabel labJugador1;
    private javax.swing.JLabel labJugador2;
    // End of variables declaration//GEN-END:variables
}
