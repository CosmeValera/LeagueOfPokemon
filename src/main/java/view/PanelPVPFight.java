package view;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Globals;
import model.starters.Gnar;
import model.starters.Poppy;
import model.starters.Starter;
import model.starters.Teemo;
import model.starters.Yuumi;

public class PanelPVPFight extends javax.swing.JPanel {

    private Starter starterOne;
    private Starter starterTwo;

    private JPanel panelCallback;
    private String nameOfPlayer1;
    private String nameOfPlayer2;

    private int lockedButtonsCounter;

    public PanelPVPFight() {
        initComponents();
    }

    public void mostrar(JPanel panelCallBack, String nameOfPlayer1, String nameOfPlayer2) {
        starterOne = Globals.starter;
        starterTwo = Globals.starter2;

        this.panelCallback = panelCallBack;
        this.nameOfPlayer1 = nameOfPlayer1;
        this.nameOfPlayer2 = nameOfPlayer2;

        butStarter1MainAttack.setText(starterOne.getNameOfMainAttack());
        butStarter1SecondaryAttack.setText(starterOne.getNameOfSecondaryAttack());
        labHealthStarter1.setText(String.valueOf((int) starterOne.getHealth()));
        labADAmount1.setText(String.valueOf((int) starterOne.getAttackDamage()));
        if (starterOne instanceof Teemo teemo) {
            labFixedVariableValue1.setText("Poison Damage:");
            labVariableValueAmount1.setText(String.valueOf((int) teemo.getPoisonDamage()));
            labStarter1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/teemo.png")));
        } else if (starterOne instanceof Gnar gnar) {
            labFixedVariableValue1.setText("Resistance:");
            labVariableValueAmount1.setText(String.valueOf((int) gnar.getResistance()));
            labStarter1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/gnarMini.png")));
            labFixedBlinded2.setText("Stunned:"); //Doesn't blind, it stuns. It's the same though
        } else if (starterOne instanceof Poppy poppy) {
            labFixedVariableValue1.setText("Shield:");
            labVariableValueAmount1.setText((poppy.isCarryingShield()) ? "Yes" : "No");
            labStarter1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/Poppy.png")));
        } else if (starterOne instanceof Yuumi yuumi) {
            labFixedVariableValue1.setText("Healing:");
            labVariableValueAmount1.setText(String.valueOf((int) yuumi.getHealing()));
            labStarter1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/yuumi.png")));
        }

        butStarter2MainAttack.setText(starterTwo.getNameOfMainAttack());
        butStarter2SecondaryAttack.setText(starterTwo.getNameOfSecondaryAttack());
        labHealthStarter2.setText(String.valueOf((int) starterTwo.getHealth()));
        labADAmount2.setText(String.valueOf((int) starterTwo.getAttackDamage()));
        if (starterTwo instanceof Teemo teemo) {
            labFixedVariableValue2.setText("Poison Damage:");
            labVariableValueAmount2.setText(String.valueOf((int) teemo.getPoisonDamage()));
            labStarter2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/teemo.png")));
        } else if (starterTwo instanceof Gnar gnar) {
            labFixedVariableValue2.setText("Resistance:");
            labVariableValueAmount2.setText(String.valueOf((int) gnar.getResistance()));
            labStarter2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/gnarMini.png")));
            labFixedBlinded1.setText("Stunned:"); //Doesn't blind, it stuns. It's the same though
        } else if (starterTwo instanceof Poppy poppy) {
            labFixedVariableValue2.setText("Shield:");
            labVariableValueAmount2.setText((poppy.isCarryingShield()) ? "Yes" : "No");
            labStarter2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/Poppy.png")));
        } else if (starterTwo instanceof Yuumi yuumi) {
            labFixedVariableValue2.setText("Healing:");
            labVariableValueAmount2.setText(String.valueOf((int) yuumi.getHealing()));
            labStarter2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/yuumi.png")));
        }

        this.setVisible(true);
        this.requestFocusInWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labTitle = new javax.swing.JLabel();
        labFixedAD1 = new javax.swing.JLabel();
        labADAmount1 = new javax.swing.JLabel();
        labFixedVariableValue1 = new javax.swing.JLabel();
        labVariableValueAmount1 = new javax.swing.JLabel();
        labFixedPoisoned1 = new javax.swing.JLabel();
        labIsPoisoned1 = new javax.swing.JLabel();
        labFixedConfused1 = new javax.swing.JLabel();
        labIsConfused1 = new javax.swing.JLabel();
        labFixedBlinded1 = new javax.swing.JLabel();
        labIsBlinded1 = new javax.swing.JLabel();
        labFixedAD2 = new javax.swing.JLabel();
        labADAmount2 = new javax.swing.JLabel();
        labFixedVariableValue2 = new javax.swing.JLabel();
        labVariableValueAmount2 = new javax.swing.JLabel();
        labFixedPoisoned2 = new javax.swing.JLabel();
        labIsPoisoned2 = new javax.swing.JLabel();
        labFixedConfused2 = new javax.swing.JLabel();
        labIsConfused2 = new javax.swing.JLabel();
        labFixedBlinded2 = new javax.swing.JLabel();
        labIsBlinded2 = new javax.swing.JLabel();
        labStarter1 = new javax.swing.JLabel();
        labHealthStarter1 = new javax.swing.JLabel();
        labVersus = new javax.swing.JLabel();
        labStarter2 = new javax.swing.JLabel();
        labHealthStarter2 = new javax.swing.JLabel();
        butStarter1MainAttack = new javax.swing.JButton();
        butStarter1SecondaryAttack = new javax.swing.JButton();
        butStarter2MainAttack = new javax.swing.JButton();
        butStarter2SecondaryAttack = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(800, 560));
        setMinimumSize(new java.awt.Dimension(800, 560));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        labTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitle.setText("PVP FIGHT");

        labFixedAD1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labFixedAD1.setText("Attack Damage:");

        labADAmount1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labADAmount1.setText("10");

        labFixedVariableValue1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labFixedVariableValue1.setText("Poison Damage:");

        labVariableValueAmount1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labVariableValueAmount1.setText("10");

        labFixedPoisoned1.setText("Poisoned:");

        labIsPoisoned1.setText("No");

        labFixedConfused1.setText("Confused:");

        labIsConfused1.setText("No");

        labFixedBlinded1.setText("Blinded:");

        labIsBlinded1.setText("No");

        labFixedAD2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labFixedAD2.setText("Attack Damage:");

        labADAmount2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labADAmount2.setText("10");

        labFixedVariableValue2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labFixedVariableValue2.setText("Poison Damage:");

        labVariableValueAmount2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labVariableValueAmount2.setText("10");

        labFixedPoisoned2.setText("Poisoned:");

        labIsPoisoned2.setText("No");

        labFixedConfused2.setText("Confused:");

        labIsConfused2.setText("No");

        labFixedBlinded2.setText("Blinded:");

        labIsBlinded2.setText("No");

        labStarter1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/teemo.png"))); // NOI18N

        labHealthStarter1.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        labHealthStarter1.setText("100");

        labVersus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labVersus.setForeground(new java.awt.Color(0, 0, 255));
        labVersus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labVersus.setText("VERSUS");

        labStarter2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/teemo.png"))); // NOI18N

        labHealthStarter2.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        labHealthStarter2.setText("100");

        butStarter1MainAttack.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        butStarter1MainAttack.setText("Scratch");
        butStarter1MainAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_ActionPerformed(evt);
            }
        });
        butStarter1MainAttack.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                but_KeyPressed(evt);
            }
        });

        butStarter1SecondaryAttack.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        butStarter1SecondaryAttack.setText("Poisonous Dart");
        butStarter1SecondaryAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_ActionPerformed(evt);
            }
        });
        butStarter1SecondaryAttack.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                but_KeyPressed(evt);
            }
        });

        butStarter2MainAttack.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        butStarter2MainAttack.setText("Tackle With Shield");
        butStarter2MainAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_ActionPerformed(evt);
            }
        });
        butStarter2MainAttack.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                but_KeyPressed(evt);
            }
        });

        butStarter2SecondaryAttack.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        butStarter2SecondaryAttack.setText("Strike");
        butStarter2SecondaryAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_ActionPerformed(evt);
            }
        });
        butStarter2SecondaryAttack.addKeyListener(new java.awt.event.KeyAdapter() {
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
                    .addComponent(labTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butStarter1MainAttack)
                                .addGap(18, 18, 18)
                                .addComponent(butStarter1SecondaryAttack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                                .addComponent(butStarter2MainAttack)
                                .addGap(18, 18, 18)
                                .addComponent(butStarter2SecondaryAttack))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labFixedAD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labFixedVariableValue1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labVariableValueAmount1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labADAmount1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labFixedAD2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(labADAmount2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labFixedVariableValue2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(labVariableValueAmount2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(labFixedBlinded2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labFixedConfused2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labIsConfused2)
                                            .addComponent(labIsBlinded2)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labFixedPoisoned2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(labIsPoisoned2)))))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(labFixedBlinded1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labFixedConfused1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labIsConfused1)
                                    .addComponent(labIsBlinded1)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labFixedPoisoned1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labIsPoisoned1))))
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
                .addComponent(labHealthStarter1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labHealthStarter2)
                .addGap(183, 183, 183))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labFixedAD1)
                        .addComponent(labADAmount1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labADAmount2)
                        .addComponent(labFixedAD2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labFixedVariableValue1)
                        .addComponent(labVariableValueAmount1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labVariableValueAmount2)
                        .addComponent(labFixedVariableValue2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labFixedPoisoned1)
                            .addComponent(labIsPoisoned1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labFixedConfused1)
                            .addComponent(labIsConfused1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labFixedBlinded1)
                            .addComponent(labIsBlinded1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labFixedPoisoned2)
                            .addComponent(labIsPoisoned2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labFixedConfused2)
                            .addComponent(labIsConfused2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labFixedBlinded2)
                            .addComponent(labIsBlinded2))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(labStarter2)
                        .addComponent(labStarter1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(labVersus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labHealthStarter1)
                    .addComponent(labHealthStarter2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butStarter1MainAttack)
                    .addComponent(butStarter1SecondaryAttack)
                    .addComponent(butStarter2SecondaryAttack)
                    .addComponent(butStarter2MainAttack))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void but_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_ActionPerformed
        if (evt.getSource() == butStarter1MainAttack) {
            if (butStarter1SecondaryAttack.isEnabled()) {
                butStarter1SecondaryAttack.setEnabled(false);
                lockedButtonsCounter++;
            }
        } else if (evt.getSource() == butStarter1SecondaryAttack) {
            if (butStarter1MainAttack.isEnabled()) {
                butStarter1MainAttack.setEnabled(false);
                lockedButtonsCounter++;
            }
        } else if (evt.getSource() == butStarter2MainAttack) {
            if (butStarter2SecondaryAttack.isEnabled()) {
                butStarter2SecondaryAttack.setEnabled(false);
                lockedButtonsCounter++;
            }
        } else if (evt.getSource() == butStarter2SecondaryAttack) {
            if (butStarter2MainAttack.isEnabled()) {
                butStarter2MainAttack.setEnabled(false);
                lockedButtonsCounter++;
            }
        }

        if (lockedButtonsCounter == 2) {
            combat();
            resetButtons();
        }
    }//GEN-LAST:event_but_ActionPerformed

    private void but_KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_but_KeyPressed
        formKeyPressed(evt); //keyboard keys work even if you have the focus on a button
    }//GEN-LAST:event_but_KeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        String keyCode = KeyEvent.getKeyText(evt.getKeyCode());

        if (keyCode.equals(Globals.letterMainAttackStarter)) {
            if (butStarter1MainAttack.isEnabled()
                    && butStarter1SecondaryAttack.isEnabled()) {
                butStarter1SecondaryAttack.setEnabled(false);
                lockedButtonsCounter++;
            }
        } else if (keyCode.equals(Globals.letterSecondaryAttackStarter)) {
            if (butStarter1MainAttack.isEnabled()
                    && butStarter1SecondaryAttack.isEnabled()) {
                butStarter1MainAttack.setEnabled(false);
                lockedButtonsCounter++;
            }
        } else if (keyCode.equals(Globals.letterMainAttackStarter2)) {
            if (butStarter2MainAttack.isEnabled()
                    && butStarter2SecondaryAttack.isEnabled()) {
                butStarter2SecondaryAttack.setEnabled(false);
                lockedButtonsCounter++;
            }
        } else if (keyCode.equals(Globals.letterSecondaryAttackStarter2)) {
            if (butStarter2MainAttack.isEnabled()
                    && butStarter2SecondaryAttack.isEnabled()) {
                butStarter2MainAttack.setEnabled(false);
                lockedButtonsCounter++;
            }
        }

        if (lockedButtonsCounter == 2) {
            combat();
            resetButtons();
        }
    }//GEN-LAST:event_formKeyPressed

    private void combat() {
        double damageOfStarterOne = obtainGrossDamageAndFutureEffectsStarterOne();
        double damageOfStarterTwo = obtainGrossDamageAndFutureEffectsStarterTwo();

        //Gross damage - resistance = net damage
        damageOfStarterOne = obtainDamageAdjustedToResistance(damageOfStarterOne, starterOne, starterTwo);
        damageOfStarterTwo = obtainDamageAdjustedToResistance(damageOfStarterTwo, starterTwo, starterOne);

        strikingTurn(damageOfStarterOne, starterOne, starterTwo);
        strikingTurn(damageOfStarterTwo, starterTwo, starterOne);
        refreshLabelHealth();

        removeEffectsAndApplyPoisonDamage(starterOne, starterTwo);
        removeEffectsAndApplyPoisonDamage(starterTwo, starterOne);
        refreshLabelHealth();

        setNewEffectsTo(starterOne);
        setNewEffectsTo(starterTwo);

        isAnyStarterDead();
    }

    private double obtainGrossDamageAndFutureEffectsStarterOne() {
        if (butStarter1MainAttack.isEnabled()) {
            return obtainDamageMainAttack(starterOne, starterTwo);
        } else if (butStarter1SecondaryAttack.isEnabled()) {
            return obtainDamageSecondaryAttack(starterOne, starterTwo);
        }
        return 0;
    }

    private double obtainGrossDamageAndFutureEffectsStarterTwo() {
        if (butStarter2MainAttack.isEnabled()) {
            return obtainDamageMainAttack(starterTwo, starterOne);
        } else if (butStarter2SecondaryAttack.isEnabled()) {
            return obtainDamageSecondaryAttack(starterTwo, starterOne);
        }
        return 0;
    }

    private double obtainDamageMainAttack(Starter starter, Starter starterEnemy) {
        double starterDamage = starter.getAttackDamageOfMainAttack();

        starterDamage = gnarStrikeTwice(starter, starterDamage);
        poppyShield(starter);
        teemoHide(starter, starterEnemy);
        return starterDamage;
    }

    private double obtainDamageSecondaryAttack(Starter starter, Starter starterEnemy) {
        double starterDamage = starter.getAttackDamageOfSecondaryAttack();

        starterDamage = megaGnarMissStrikeOrThrowRock(starter, starterDamage, starterEnemy);
        miniGnarDodge(starter, starterEnemy);
        poppyAbleToConfuse(starterEnemy, starter);
        teemoUseBlowPipe(starterEnemy, starter);
        yuumiFinalChapter(starterEnemy, starter);
        return starterDamage;
    }

    private double gnarStrikeTwice(Starter starter, double starterDamage) throws HeadlessException {
        if (starter.isAbleToStrikeTwice() && !starter.isBlinded()
                && !starter.isPoorSight()) {
            JOptionPane.showMessageDialog(
                    this,
                    starter.getName() + " striked"
                    + (starter.isConfused() ? " himself" : "") + " twice",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            starterDamage = starterDamage * 2;
        }
        return starterDamage;
    }

    private void poppyShield(Starter starter) throws HeadlessException {
        if (starter.isAbleToEquipAShield()) {
            ((Poppy) starter).setCarriesShield(true);
            JOptionPane.showMessageDialog(
                    this,
                    starter.getName() + " equipped her shield"
                    + ((!starter.isBlinded() && !starter.isPoorSight()
                    && !starter.isConfused())
                    ? " after tackling. +" : ". +")
                    + ((Poppy) starter).getShieldProtection() + " shield protection",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            changeLabelVariableValue(starter, "Yes");
        }
    }

    private void teemoHide(Starter starter, Starter starterEnemy) throws HeadlessException {
        if (!starter.isBlinded() && !starter.isPoorSight() && !starter.isConfused()
                && starter.isAbleToHide(starterEnemy)) {
            if (starterEnemy.isWillBePoorSight()) {
                JOptionPane.showMessageDialog(
                        this,
                        starter.getName() + " camouflaged and "
                        + starterEnemy.getName() + " won't see him",
                        this.getName(),
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private double megaGnarMissStrikeOrThrowRock(Starter starter, double starterDamage, Starter starterEnemy) throws HeadlessException {
        if (starter.isAbleToMissStrike()) {
            JOptionPane.showMessageDialog(
                    this,
                    starter.getName() + " missed the rock",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            starterDamage = 0;
        } else {
            if (starter instanceof Gnar gnar && gnar.isMonstruo()
                    && !gnar.isBlinded() && !gnar.isConfused()
                    && !gnar.isPoorSight()) {
                JOptionPane.showMessageDialog(
                        this,
                        starter.getName() + " hit with the rock " + (starterEnemy.isBlindedResistant()
                        ? "" : "and stunned ") + starterEnemy.getName(),
                        this.getName(),
                        JOptionPane.INFORMATION_MESSAGE);
                starterEnemy.setWillBeBlinded(true);
            }
        }
        return starterDamage;
    }

    private void miniGnarDodge(Starter starter, Starter starterEnemy) throws HeadlessException {
        if (starter.isAbleToDodge() && !starterEnemy.isBlindedResistant()
                && !starter.isBlinded() && !starter.isPoorSight() && !starter.isConfused()) {
            JOptionPane.showMessageDialog(
                    this,
                    starter.getName() + " will dodge " + starterEnemy.getName() + "'s attack with a jump",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            starterEnemy.setWillBeBlinded(true);
        }
    }

    private void poppyAbleToConfuse(Starter starterEnemy, Starter starter) throws HeadlessException {
        if (!starterEnemy.isConfusionResistant() && !starter.isBlinded()
                && !starter.isPoorSight() && !starter.isConfused() && starter.isAbleToConfuse(starterEnemy)) {
            JOptionPane.showMessageDialog(
                    this,
                    starterEnemy.getName() + " will be confused because of " + starter.getName() + "'s hammer blow",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            starterEnemy.setWillBeConfused(true);
        }
    }

    private void teemoUseBlowPipe(Starter starter, Starter starterEnemy) throws HeadlessException {
        if (!starter.isBlinded() && !starter.isPoorSight()
                && !starter.isConfused() && starter.isAbleToUseBlowPipe(starterEnemy)) {
            if (starterEnemy.isWillBeBlinded() && starterEnemy.isWillBePoisoned()) {
                JOptionPane.showMessageDialog(
                        this,
                        starterEnemy.getName() + " will be poisoned and blinded",
                        this.getName(),
                        JOptionPane.INFORMATION_MESSAGE);
            } else if (starterEnemy.isWillBeBlinded()) {
                JOptionPane.showMessageDialog(
                        this,
                        starterEnemy.getName() + " will be blinded",
                        this.getName(),
                        JOptionPane.INFORMATION_MESSAGE);
            } else if (starterEnemy.isWillBePoisoned()) {
                JOptionPane.showMessageDialog(
                        this,
                        starterEnemy.getName() + " will be poisoned",
                        this.getName(),
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private void yuumiFinalChapter(Starter starterEnemy, Starter starter) throws HeadlessException {
        if (!starterEnemy.isBlindedResistant() && !starter.isBlinded()
                && !starter.isPoorSight() && !starter.isConfused() && starter.isAbleToReadTheFinalChapter(starterEnemy)) {
            if (starterEnemy.isWillBeBlinded()) {
                JOptionPane.showMessageDialog(
                        this,
                        starterEnemy.getName() + " will be blinded after catching a glimpse of the Final Chapter",
                        this.getName(),
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private double obtainDamageAdjustedToResistance(double starterDamage, Starter starter, Starter starterEnemy) {
        if (!starter.isConfused()) {
            starterDamage = starterEnemy.adjustAttackDamageRegardingResistance(starterDamage);
        } else {
            starterDamage = starter.adjustAttackDamageRegardingResistance(starterDamage);
        }
        return starterDamage;
    }

    private void strikingTurn(double starterDamage, Starter starter, Starter starterEnemy) {
        refreshLabelHealth();

        if (turnOfBlindedAndPoisonedStarter(starter, starterEnemy)) {
            return;
        }
        if (turnOfPoorSightAndPoisonedStarter(starter, starterEnemy)) {
            return;
        }
        if (turnOfBlindedStarter(starter, starterEnemy)) {
            return;
        }
        if (turnOfPoorSightStarter(starter, starterEnemy)) {
            return;
        }
        if (turnOfConfusedStarter(starterDamage, starter, starterEnemy)) {
            return;
        }
        if (turnOfPoisonedStarter(starterDamage, starter, starterEnemy)) {
            return;
        }

        turnOfHealthyStarter(starterDamage, starter, starterEnemy);
    }

    private boolean turnOfBlindedAndPoisonedStarter(Starter starter, Starter starterEnemy) {
        if (starter.isPoisoned() && starter.isBlinded()) {
            changeLabelIsPoisoned(starter, "Yes");
            changeLabelIsBlinded(starter, "Yes");
            JOptionPane.showMessageDialog(
                    this,
                    starter.getName() + " is "
                    + ((starter.getPoisonedTurns() == 3)
                    ? "poisoned and " : "") + "blinded",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
        return false;
    }

    private boolean turnOfPoorSightAndPoisonedStarter(Starter starter, Starter starterEnemy) {
        if (starter.isPoisoned() && starter.isPoorSight()) {
            changeLabelIsPoisoned(starter, "Yes");
            changeLabelIsBlinded(starter, "Yes");
            JOptionPane.showMessageDialog(
                    this,
                    starter.getName()
                    + ((starter.getPoisonedTurns() == 3) ? " is poisoned and" : "") + " won't see "
                    + starterEnemy.getName() + " because " + starterEnemy.getName() + " camouflaged",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
        return false;
    }

    private boolean turnOfBlindedStarter(Starter starter, Starter starterEnemy) {
        if (starter.isBlinded()) {
            changeLabelIsBlinded(starterEnemy, "Yes");
            JOptionPane.showMessageDialog(
                    this,
                    starter.getName() + ((starterEnemy instanceof Teemo || starterEnemy instanceof Yuumi)
                    ? " is blinded and didn't attack."
                    : ((starterEnemy instanceof Gnar)
                            ? " didn't attack."
                            : "")),
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
        return false;
    }

    private boolean turnOfPoorSightStarter(Starter starter, Starter starterEnemy) {
        if (starter.isPoorSight()) {
            changeLabelIsBlinded(starterEnemy, "Yes");
            JOptionPane.showMessageDialog(
                    this,
                    starterEnemy.getName() + " camouflaged and" + starter.getName() + " couldn't find" + starterEnemy.getName(),
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
        return false;
    }

    private boolean turnOfConfusedStarter(double starterDamage, Starter starter, Starter starterEnemy) {
        if (starter.isConfused()) {
            changeLabelIsConfused(starter, "Yes");
            JOptionPane.showMessageDialog(
                    this,
                    starter.getName() + " is confused and attacked to itself: " + ((int) starterDamage + 1) + " damage.",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            starter.setHealth(starter.getHealth() - starterDamage);
            return true;
        }
        return false;
    }

    private boolean turnOfPoisonedStarter(double starterDamage, Starter starter, Starter starterEnemy) {
        if (starter.isPoisoned()) {
            changeLabelIsPoisoned(starter, "Yes");
            turnOfHealthyStarter(starterDamage, starter, starterEnemy);
            return true;
        }
        return false;
    }

    private void turnOfHealthyStarter(double starterDamage, Starter starter, Starter starterEnemy) {
        JOptionPane.showMessageDialog(
                this,
                starter.getName() + " inflicted: " + (int) (starterDamage + 0.9) + " damage.",
                this.getName(),
                JOptionPane.INFORMATION_MESSAGE);
        starterEnemy.setHealth(starterEnemy.getHealth() - starterDamage);
    }

    private void removeEffectsAndApplyPoisonDamage(Starter starter, Starter starterEnemy) {

        possibleGnarTransformation(starter, starterEnemy);
        megaGnarDurationReduced(starter);

        changeLabelIsBlinded(starter, "No");
        starter.setBlindedIfPossible(false);
        starter.setPoorSightIfPossible(false);

        changeLabelIsConfused(starter, "No");
        starter.setConfusedIfPossible(false);

        if (starter instanceof Poppy poppy && poppy.isCarryingShield()) {
            changeLabelVariableValue(starter, "No");
            poppy.setCarriesShield(false);
        }

        if (!isPoisonedAfterApplyingPoisonDamageOnce(starter, starterEnemy)) {
            changeLabelIsPoisoned(starter, "No");
            starter.setPoisonedIfPossible(false);
        }
    }

    private boolean isPoisonedAfterApplyingPoisonDamageOnce(Starter starter, Starter starterEnemy) {
        if (starter.isPoisoned()) {
            starter.setHealth(starter.getHealth() - ((Teemo) starterEnemy).getPoisonDamage());
            starter.setPoisonedTurns(starter.getPoisonedTurns() - 1);
            if (starter.getPoisonedTurns() <= 0) {
                return false;
            }
        }
        return true;
    }

    private void setNewEffectsTo(Starter starter) {
        if (starter.isWillBeBlinded()) {
            starter.setWillBeBlinded(false);
            starter.setBlindedIfPossible(true);
            changeLabelIsBlinded(starter, "Yes");
        }
        if (starter.isWillBePoorSight()) {
            starter.setWillBePoorSight(false);
            starter.setPoorSightIfPossible(true);
            changeLabelIsBlinded(starter, "Yes");
        }
        if (starter.isWillBeConfused()) {
            starter.setWillBeConfused(false);
            starter.setConfusedIfPossible(true);
            changeLabelIsConfused(starter, "Yes");
        }
        if (starter.isWillBePoisoned()) {
            starter.setWillBePoisoned(false);
            starter.setPoisonedIfPossible(true);
            starter.setPoisonedTurns(3);
            changeLabelIsPoisoned(starter, "Yes");
        }
    }

    private void isAnyStarterDead() {
        if (starterOne.getHealth() <= 0 || starterTwo.getHealth() <= 0) {
            matchFinishedMessage();
            removeTemporalBuffs();
            healStarters();
            this.setVisible(false);
            this.getRootPane().getContentPane().remove(this);
            panelCallback.setVisible(true);
        }
    }

    private void matchFinishedMessage() {
        if (starterOne.getHealth() <= 0 && starterTwo.getHealth() <= 0) {
            JOptionPane.showMessageDialog(
                    this,
                    "Both died at the same time. \n"
                    + "Draw!",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (starterOne.getHealth() <= 0) {
            JOptionPane.showMessageDialog(
                    this,
                    "Winner: " + nameOfPlayer2 + "'s " + starterTwo.getName() + "!!",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (starterTwo.getHealth() <= 0) {
            JOptionPane.showMessageDialog(
                    this,
                    "Winner: " + nameOfPlayer1 + "'s " + starterOne.getName() + "!!",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void resetButtons() {
        lockedButtonsCounter = 0;
        butStarter1MainAttack.setEnabled(true);
        butStarter1SecondaryAttack.setEnabled(true);
        butStarter2MainAttack.setEnabled(true);
        butStarter2SecondaryAttack.setEnabled(true);
    }

    private void healStarters() {
        starterOne.setHealth(starterOne.getMaximumHealth());
        starterTwo.setHealth(starterTwo.getMaximumHealth());
    }

    private void removeTemporalBuffs() {
        removeTemporalBuffsTo(starterOne);
        removeTemporalBuffsTo(starterTwo);
    }

    private void removeTemporalBuffsTo(Starter starter) {
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

    private void possibleGnarTransformation(Starter starter, Starter starterEnemy) {
        if (starter instanceof Gnar gnar && !gnar.isMonstruo()
                && !starterEnemy.isBlinded() && !starterEnemy.isPoorSight()
                && !starterEnemy.isConfused()) {
            double num = (Math.random() * 100 + gnar.getResistance() / 10); //From 25.5%(23+2.5) to 30%(23+7)
            if (num >= 77) {
                gnar.setIsMonster(true);
                gnar.setMonsterCounter(4);

                JOptionPane.showMessageDialog(
                        this,
                        "Gnar transforms into MegaGnar",
                        this.getName(),
                        JOptionPane.INFORMATION_MESSAGE);
                refreshAttackButtons(starter);
            }
        }
    }

    private void megaGnarDurationReduced(Starter starter) {
        if (starter instanceof Gnar gnar && gnar.isMonstruo()) {
            gnar.setMonsterCounter(gnar.getMonsterCounter() - 1);
            if (gnar.getMonsterCounter() <= 0) {
                gnar.setIsMonster(false);
                JOptionPane.showMessageDialog(
                        this,
                        "MegaGnar turned back to miniGnar",
                        this.getName(),
                        JOptionPane.INFORMATION_MESSAGE);

                refreshAttackButtons(starter);
            }
        }
    }

    private void refreshAttackButtons(Starter starter) {
        if (starter.equals(starterOne)) {
            butStarter1MainAttack.setText(starter.getNameOfMainAttack());
            butStarter1SecondaryAttack.setText(starter.getNameOfSecondaryAttack());
            if (!((Gnar) starter).isMonstruo()) {
                labStarter1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/gnarMini.png")));
            } else if (((Gnar) starter).isMonstruo()) {
                labStarter1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/gnarMega.png")));
            }
        } else if (starter.equals(starterTwo)) {
            butStarter2MainAttack.setText(starter.getNameOfMainAttack());
            butStarter2SecondaryAttack.setText(starter.getNameOfSecondaryAttack());
            if (!((Gnar) starter).isMonstruo()) {
                labStarter2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/gnarMini.png")));
            } else if (((Gnar) starter).isMonstruo()) {
                labStarter2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/gnarMega.png")));
            }
        }
    }

    private void refreshLabelHealth() {
        labHealthStarter1.setText(String.valueOf((int) starterOne.getHealth()));
        labHealthStarter2.setText(String.valueOf((int) starterTwo.getHealth()));
    }

    private void changeLabelIsPoisoned(Starter starter, String value) {
        if (starter.equals(starterOne)) {
            labIsPoisoned1.setText(value);
        } else if (starter.equals(starterTwo)) {
            labIsPoisoned2.setText(value);
        }
    }

    private void changeLabelIsConfused(Starter starter, String value) {
        if (starter.equals(starterOne)) {
            labIsConfused1.setText(value);
        } else if (starter.equals(starterTwo)) {
            labIsConfused2.setText(value);
        }
    }

    private void changeLabelIsBlinded(Starter starter, String value) {
        if (starter.equals(starterOne)) {
            labIsBlinded1.setText(value);
        } else if (starter.equals(starterTwo)) {
            labIsBlinded2.setText(value);
        }
    }

    private void changeLabelVariableValue(Starter starter, String value) {
        if (starter.equals(starterOne)) {
            labVariableValueAmount1.setText(value);
        } else if (starter.equals(starterTwo)) {
            labVariableValueAmount2.setText(value);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butStarter1MainAttack;
    private javax.swing.JButton butStarter1SecondaryAttack;
    private javax.swing.JButton butStarter2MainAttack;
    private javax.swing.JButton butStarter2SecondaryAttack;
    private javax.swing.JLabel labADAmount1;
    private javax.swing.JLabel labADAmount2;
    private javax.swing.JLabel labFixedAD1;
    private javax.swing.JLabel labFixedAD2;
    private javax.swing.JLabel labFixedBlinded1;
    private javax.swing.JLabel labFixedBlinded2;
    private javax.swing.JLabel labFixedConfused1;
    private javax.swing.JLabel labFixedConfused2;
    private javax.swing.JLabel labFixedPoisoned1;
    private javax.swing.JLabel labFixedPoisoned2;
    private javax.swing.JLabel labFixedVariableValue1;
    private javax.swing.JLabel labFixedVariableValue2;
    private javax.swing.JLabel labHealthStarter1;
    private javax.swing.JLabel labHealthStarter2;
    private javax.swing.JLabel labIsBlinded1;
    private javax.swing.JLabel labIsBlinded2;
    private javax.swing.JLabel labIsConfused1;
    private javax.swing.JLabel labIsConfused2;
    private javax.swing.JLabel labIsPoisoned1;
    private javax.swing.JLabel labIsPoisoned2;
    private javax.swing.JLabel labStarter1;
    private javax.swing.JLabel labStarter2;
    private javax.swing.JLabel labTitle;
    private javax.swing.JLabel labVariableValueAmount1;
    private javax.swing.JLabel labVariableValueAmount2;
    private javax.swing.JLabel labVersus;
    // End of variables declaration//GEN-END:variables
}
