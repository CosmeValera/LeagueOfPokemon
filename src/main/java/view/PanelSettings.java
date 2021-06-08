package view;

import javax.swing.JOptionPane;
import model.Globals;

public class PanelSettings extends javax.swing.JPanel {

    public PanelSettings() {
        initComponents();
    }

    public void showPanel() {
        labMainAttack1.setText("Main Attack: " + Globals.letterMainAttackStarter);
        labSecondaryAttack1.setText("Secondary Attack: " + Globals.letterSecondaryAttackStarter);
        labEscape.setText("Escape: " + Globals.letterEscape);
        labMainAttack2.setText("Main Attack: " + Globals.letterMainAttackStarter2);
        labSecondaryAttack2.setText("Secondary Attack: " + Globals.letterSecondaryAttackStarter2);

        this.setVisible(true);
        this.requestFocusInWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labTitle = new javax.swing.JLabel();
        labPlayer1 = new javax.swing.JLabel();
        labMainAttack1 = new javax.swing.JLabel();
        butMainAttack1 = new javax.swing.JButton();
        labSecondaryAttack1 = new javax.swing.JLabel();
        butSecondaryAttack1 = new javax.swing.JButton();
        labEscape = new javax.swing.JLabel();
        butEscape = new javax.swing.JButton();
        labPlayer2 = new javax.swing.JLabel();
        labMainAttack2 = new javax.swing.JLabel();
        butMainAttack2 = new javax.swing.JButton();
        labSecondaryAttack2 = new javax.swing.JLabel();
        butSecondaryAttack2 = new javax.swing.JButton();

        setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        setMaximumSize(new java.awt.Dimension(800, 560));
        setMinimumSize(new java.awt.Dimension(800, 560));

        labTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitle.setText("CONFIGURACIÓN");

        labPlayer1.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        labPlayer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labPlayer1.setText("Jugador 1");

        labMainAttack1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labMainAttack1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labMainAttack1.setText("Main Attack: A");

        butMainAttack1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butMainAttack1.setText("Cambiar");
        butMainAttack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butJugador1_ActionPerformed(evt);
            }
        });

        labSecondaryAttack1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labSecondaryAttack1.setText("Secondary Attack: S");

        butSecondaryAttack1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butSecondaryAttack1.setText("Cambiar");
        butSecondaryAttack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butJugador1_ActionPerformed(evt);
            }
        });

        labEscape.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labEscape.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labEscape.setText("Escape: H");

        butEscape.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butEscape.setText("Cambiar");
        butEscape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butJugador1_ActionPerformed(evt);
            }
        });

        labPlayer2.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        labPlayer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labPlayer2.setText("Jugador 2");

        labMainAttack2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labMainAttack2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labMainAttack2.setText("Main Attack: O");

        butMainAttack2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butMainAttack2.setText("Cambiar");
        butMainAttack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butJugador2_ActionPerformed(evt);
            }
        });

        labSecondaryAttack2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labSecondaryAttack2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labSecondaryAttack2.setText("Secondary Attack: P");

        butSecondaryAttack2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butSecondaryAttack2.setText("Cambiar");
        butSecondaryAttack2.addActionListener(new java.awt.event.ActionListener() {
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
                    .addComponent(labTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(labEscape, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labMainAttack1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labSecondaryAttack1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(butMainAttack1)
                                    .addComponent(butSecondaryAttack1)
                                    .addComponent(butEscape))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(labMainAttack2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labSecondaryAttack2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(butMainAttack2)
                                    .addComponent(butSecondaryAttack2))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labPlayer1)
                    .addComponent(labPlayer2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labMainAttack1)
                    .addComponent(labMainAttack2)
                    .addComponent(butMainAttack1)
                    .addComponent(butMainAttack2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labSecondaryAttack1)
                    .addComponent(labSecondaryAttack2)
                    .addComponent(butSecondaryAttack1)
                    .addComponent(butSecondaryAttack2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labEscape)
                    .addComponent(butEscape))
                .addContainerGap(294, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void butJugador1_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butJugador1_ActionPerformed
        String letter = askLetter();
        if (evt.getSource() == butMainAttack1) {
            Globals.letterMainAttackStarter = letter;
            labMainAttack1.setText(labMainAttack1.getText().substring(0, labMainAttack1.getText().length() - 1) + letter);
        } else if (evt.getSource() == butSecondaryAttack1) {
            Globals.letterSecondaryAttackStarter = letter;
            labSecondaryAttack1.setText(labSecondaryAttack1.getText().substring(0, labSecondaryAttack1.getText().length() - 1) + letter);
        } else if (evt.getSource() == butEscape) {
            Globals.letterEscape = letter;
            labEscape.setText(labEscape.getText().substring(0, labEscape.getText().length() - 1) + letter);
        }
    }//GEN-LAST:event_butJugador1_ActionPerformed

    private void butJugador2_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butJugador2_ActionPerformed
        String letter = askLetter();
        if (evt.getSource() == butMainAttack2) {
            Globals.letterMainAttackStarter2 = letter;
            labMainAttack2.setText(labMainAttack2.getText().substring(0, labMainAttack2.getText().length() - 1) + letter);
        } else if (evt.getSource() == butSecondaryAttack2) {
            Globals.letterSecondaryAttackStarter2 = letter;
            labSecondaryAttack2.setText(labSecondaryAttack2.getText().substring(0, labSecondaryAttack2.getText().length() - 1) + letter);
        }
    }//GEN-LAST:event_butJugador2_ActionPerformed

    private String askLetter() {
        String letter = String.valueOf((JOptionPane.showInputDialog(
                this,
                "Insert a letter:")).toUpperCase().charAt(0));
        return letter;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butEscape;
    private javax.swing.JButton butMainAttack1;
    private javax.swing.JButton butMainAttack2;
    private javax.swing.JButton butSecondaryAttack1;
    private javax.swing.JButton butSecondaryAttack2;
    private javax.swing.JLabel labEscape;
    private javax.swing.JLabel labMainAttack1;
    private javax.swing.JLabel labMainAttack2;
    private javax.swing.JLabel labPlayer1;
    private javax.swing.JLabel labPlayer2;
    private javax.swing.JLabel labSecondaryAttack1;
    private javax.swing.JLabel labSecondaryAttack2;
    private javax.swing.JLabel labTitle;
    // End of variables declaration//GEN-END:variables
}
