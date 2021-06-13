package view;

import model.enemies.Pikachu;
import model.enemies.Electrode;
import model.enemies.HitMonLee;
import model.enemies.Rayquaza;
import model.enemies.Arceus;
import model.Globals;
import model.starters.Gnar;
import model.starters.Starter;
import model.enemies.Gyarados;
import model.starters.Poppy;
import model.starters.Yuumi;
import model.starters.Teemo;
import model.enemies.Enemy;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class PanelEnemyFight extends javax.swing.JPanel {

    private Starter starter;
    private Enemy enemy;

    private GUI GUICallBack;

    public PanelEnemyFight() {
        initComponents();
    }

    public void showPanel(GUI gui, Enemy enemy) {
        this.starter = Globals.starter;
        this.enemy = enemy;
        this.GUICallBack = gui;

        labStarterHealth.setText(String.valueOf((int) starter.getHealth()));
        labADAmount.setText(String.valueOf((int) starter.getAttackDamage()));
        labGoldAmount.setText(String.valueOf(starter.getGoldAmount()));

        butMainAttack.setText(starter.getNameOfMainAttack());
        butSecondaryAttack.setText(starter.getNameOfSecondaryAttack());
        if (starter instanceof Teemo teemo) {
            labFixedVariableValue.setText("Poison damage:");
            labVariableValueAmount.setText(String.valueOf((int) teemo.getPoisonDamage()));
            labFixedEnemyEffect.setText("Poisoned?");
            labEnemyEffect.setText("No");
            labStarter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/teemo.png")));
        } else if (starter instanceof Gnar gnar) {
            labFixedVariableValue.setText("Resistance:");
            labVariableValueAmount.setText(String.valueOf((int) gnar.getResistance()));
            labFixedEnemyEffect.setText("");
            labEnemyEffect.setText("");
            labStarter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/gnarMini.png")));

        } else if (starter instanceof Poppy poppy) {
            labFixedVariableValue.setText("Shield:");
            labVariableValueAmount.setText((poppy.isCarryingShield()) ? "Yes" : "No");
            labFixedEnemyEffect.setText("Confused:");
            labEnemyEffect.setText("No");
            labStarter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/Poppy.png")));

        } else if (starter instanceof Yuumi yuumi) {
            labFixedVariableValue.setText("Healing:");
            labVariableValueAmount.setText(String.valueOf((int) yuumi.getHealing()));
            labFixedEnemyEffect.setText("");
            labEnemyEffect.setText("");
            labStarter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/yuumi.png")));
        }

        labEnemyHealth.setText(String.valueOf((int) enemy.getHealth()));
        labTitle.setText("FIGHT VS " + enemy.getName().toUpperCase());
        if (enemy instanceof Pikachu pikachu) {
            labEnemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/enemies/pikachu.png")));
        } else if (enemy instanceof Electrode electrode) {
            labEnemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/enemies/electrode.png")));
        } else if (enemy instanceof HitMonLee hitMonLee) {
            labEnemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/enemies/Hitmonlee.png")));
        } else if (enemy instanceof Gyarados gyarados) {
            labEnemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/enemies/Gyarados.png")));
        } else if (enemy instanceof Rayquaza rayquaza) {
            labEnemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/enemies/Rayquaza.png")));
        } else if (enemy instanceof Arceus arceus) {
            labEnemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/enemies/arceus.png")));
        }

        this.setVisible(true);
        butMainAttack.requestFocusInWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labTitle = new javax.swing.JLabel();
        labFixedGold = new javax.swing.JLabel();
        labGoldAmount = new javax.swing.JLabel();
        labFixedAD = new javax.swing.JLabel();
        labADAmount = new javax.swing.JLabel();
        labFixedVariableValue = new javax.swing.JLabel();
        labVariableValueAmount = new javax.swing.JLabel();
        labFixedEnemyEffect = new javax.swing.JLabel();
        labEnemyEffect = new javax.swing.JLabel();
        labStarter = new javax.swing.JLabel();
        labEnemy = new javax.swing.JLabel();
        labVersus = new javax.swing.JLabel();
        labStarterHealth = new javax.swing.JLabel();
        labEnemyHealth = new javax.swing.JLabel();
        butEscape = new javax.swing.JButton();
        butMainAttack = new javax.swing.JButton();
        butSecondaryAttack = new javax.swing.JButton();

        setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        setMaximumSize(new java.awt.Dimension(800, 560));
        setMinimumSize(new java.awt.Dimension(800, 560));
        setPreferredSize(new java.awt.Dimension(800, 560));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        labTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitle.setText("COMBATE VS PIKACHU");

        labFixedGold.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labFixedGold.setText("Gold:");

        labGoldAmount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labGoldAmount.setText("100");

        labFixedAD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labFixedAD.setText("Attack Damage:");

        labADAmount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labADAmount.setText("10");

        labFixedVariableValue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labFixedVariableValue.setText("Poison Damage:");

        labVariableValueAmount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labVariableValueAmount.setText("10");

        labFixedEnemyEffect.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labFixedEnemyEffect.setText("Poisoned?");

        labEnemyEffect.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labEnemyEffect.setText(" ");

        labStarter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/teemo.png"))); // NOI18N

        labEnemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/enemies/pikachu.png"))); // NOI18N

        labVersus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labVersus.setForeground(new java.awt.Color(0, 0, 255));
        labVersus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labVersus.setText("VERSUS");

        labStarterHealth.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        labStarterHealth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labStarterHealth.setText("100");

        labEnemyHealth.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        labEnemyHealth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labEnemyHealth.setText("100");

        butEscape.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        butEscape.setText("Escape");
        butEscape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butEscapeActionPerformed(evt);
            }
        });
        butEscape.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                but_KeyPressed(evt);
            }
        });

        butMainAttack.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        butMainAttack.setText("Scratch");
        butMainAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butMainAttackActionPerformed(evt);
            }
        });
        butMainAttack.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                but_KeyPressed(evt);
            }
        });

        butSecondaryAttack.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        butSecondaryAttack.setText("Poisonous Dart");
        butSecondaryAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSecondaryAttackActionPerformed(evt);
            }
        });
        butSecondaryAttack.addKeyListener(new java.awt.event.KeyAdapter() {
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(labStarterHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labStarter)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(labFixedAD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labFixedVariableValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labFixedGold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labVariableValueAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labADAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labGoldAmount))
                                        .addGap(217, 217, 217)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labVersus, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(labEnemyHealth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labEnemy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labFixedEnemyEffect)
                                        .addGap(26, 26, 26)
                                        .addComponent(labEnemyEffect)))
                                .addGap(93, 93, 93)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butEscape)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butMainAttack)
                        .addGap(18, 18, 18)
                        .addComponent(butSecondaryAttack)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(labVersus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labFixedGold)
                            .addComponent(labGoldAmount))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labFixedEnemyEffect)
                                .addComponent(labEnemyEffect))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labFixedAD)
                                .addComponent(labADAmount)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labFixedVariableValue)
                                    .addComponent(labVariableValueAmount))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labStarter))
                            .addComponent(labEnemy, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labStarterHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labEnemyHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butSecondaryAttack)
                    .addComponent(butMainAttack)
                    .addComponent(butEscape))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void butEscapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butEscapeActionPerformed
        JOptionPane.showMessageDialog(
                this,
                "You escaped succesfully",
                this.getName(),
                JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);
        this.getRootPane().getContentPane().remove(this);
    }//GEN-LAST:event_butEscapeActionPerformed

    private void butMainAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butMainAttackActionPerformed
        starter.mainAttack(enemy);
        if (starter.isAbleToStrikeTwice()) {
            JOptionPane.showMessageDialog(
                    this,
                    starter.getNameOfMainAttack() + " striked twice",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            starter.mainAttack(enemy);
        }
        if (starter.isAbleToEquipAShield()) {
            ((Poppy) starter).setCarriesShield(true);
            labVariableValueAmount.setText("Yes");
            JOptionPane.showMessageDialog(
                    this,
                    starter.getName() + " equipped her shield after tackling. +"
                    + ((Poppy) starter).getShieldProtection() + " shield defence",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
        }

        labEnemyHealth.setText(String.valueOf((int) enemy.getHealth()));
        turnOfEnemy();
    }//GEN-LAST:event_butMainAttackActionPerformed

    private void butSecondaryAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSecondaryAttackActionPerformed
        if (starter.isAbleToMissStrike()) {
            JOptionPane.showMessageDialog(
                    this,
                    starter.getName() + " missed the rock",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            starter.secondaryAttack(enemy);
            if (starter instanceof Gnar gnar && gnar.isMonstruo()) {
                JOptionPane.showMessageDialog(
                        this,
                        starter.getName() + " striked with the rock" + enemy.getName() + ".\n"
                        + (enemy.isBlindedResistant() ? "" : enemy.getName() + " was stunned."),
                        this.getName(),
                        JOptionPane.INFORMATION_MESSAGE);
                enemy.setBlindedIfPossible(true);
            }
        }

        if (starter.isAbleToDodge() && !enemy.isBlindedResistant()) {
            JOptionPane.showMessageDialog(
                    this,
                    starter.getName() + " dodged " + enemy.getName() + "'s attack with a jump",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            enemy.setBlindedIfPossible(true);
        }

        labEnemyHealth.setText(String.valueOf((int) enemy.getHealth()));
        turnOfEnemy();
    }//GEN-LAST:event_butSecondaryAttackActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        String keyCode = KeyEvent.getKeyText(evt.getKeyCode());

        if (keyCode.equals(Globals.letterMainAttackStarter)) {
            butMainAttackActionPerformed(new ActionEvent(starter, WIDTH, keyCode));
        } else if (keyCode.equals(Globals.letterSecondaryAttackStarter)) {
            butSecondaryAttackActionPerformed(new ActionEvent(starter, WIDTH, keyCode));
        } else if (keyCode.equals(Globals.letterEscape)) {
            butEscapeActionPerformed(new ActionEvent(starter, WIDTH, keyCode));
        }
    }//GEN-LAST:event_formKeyPressed

    private void but_KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_but_KeyPressed
        formKeyPressed(evt); //teclado funciona aunque tengas foco en un boton
    }//GEN-LAST:event_but_KeyPressed

    private void turnOfEnemy() {
        labStarterHealth.setText(String.valueOf((int) starter.getHealth()));

        if (isEnemyDead()) {
            return;
        }

        if (enemysTurnBlindedAndPoisoned()) {
            return;
        }
        if (enemysTurnPoorSightAndPoisoned()) {
            return;
        }
        if (enemysTurnBlinded()) {
            return;
        }
        if (enemysTurnPoorSight()) {
            return;
        }
        if (enemysTurnConfused()) {
            return;
        }
        if (enemysTurnPoisoned()) {
            return;
        }

        enemysTurnWithNoEffects();
    }

    private boolean isEnemyDead() {
        if (enemy.getHealth() <= 0) {
            starter.setGoldAmount(starter.getGoldAmount() + (int) enemy.getReward());
            removeStartersTemporalBuffs();
            JOptionPane.showMessageDialog(this,
                    "Has vencido a " + enemy.getName() + " y obtuviste: " + enemy.getReward(),
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            this.getRootPane().getContentPane().remove(this);
            unlockRewardsRegardingDefeatedEnemies();
            showMessageGameFinished();
            return true;
        }
        return false;
    }

    private void removeStartersTemporalBuffs() {
        if (starter instanceof Teemo teemo) {
            //Empty
        } else if (starter instanceof Gnar gnar) {
            gnar.setIsMonster(false);
            gnar.setMonsterCounter(0);
        } else if (starter instanceof Poppy poppy) {
            poppy.setCarriesShield(false);
        } else if (starter instanceof Yuumi yuumi) {
            //Empty
        }
    }

    private void unlockRewardsRegardingDefeatedEnemies() {
        starter.setDefeatedEnemies(Starter.getDefeatedEnemies() + 1);
        if (Starter.getDefeatedEnemies() == Starter.getVictoriesForFirstReward()) {
            unlockSecondStarter();
        } else if (Starter.getDefeatedEnemies() == Starter.getVictoriesForSecondReward()) {
            unlockThirdStarter();
        } else if (Starter.getDefeatedEnemies() == Starter.getVictoriesForThirdReward()) {
            unlockForthStarterAndArceus();
        }
    }

    private void unlockSecondStarter() {
        GUICallBack.getJMenuBar().getMenu(1).getItem(2).setVisible(true); //Visible SelectionPanel
        GUICallBack.getJMenuBar().getMenu(0).getItem(3).setVisible(true); //Visible Gyarados
        showRewardMessage();
    }

    private void unlockThirdStarter() {
        GUICallBack.getJMenuBar().getMenu(0).getItem(4).setVisible(true); //Visible RayQuaza
        showRewardMessage();
    }

    private void unlockForthStarterAndArceus() {
        GUICallBack.getJMenuBar().getMenu(0).getItem(5).setVisible(true); //Visible Arceus
        showRewardMessage();
    }

    private void showRewardMessage() {
        GUICallBack.clickEspecialSelectionPanel();
        JOptionPane.showMessageDialog(GUICallBack,
                "You unlocked a new starter. Congratulations!!"
                + (Starter.getDefeatedEnemies() == Starter.getVictoriesForThirdReward()
                ? "\nIn addition, now you may fight vs Arceus." : "")
                + "\nDefeated enemies: " + Starter.getDefeatedEnemies(),
                this.getName(),
                JOptionPane.INFORMATION_MESSAGE);
    }

    private void showMessageGameFinished() {
        if (enemy instanceof Arceus) {
            JOptionPane.showMessageDialog(GUICallBack,
                    "Congratulations! I hope you enjoyed playing this game.\n"
                    + "\n"
                    + "To see other projects of mine you can go to this link:\n"
                    + "GitHub: https://github.com/CosmeValera",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE,
                    new javax.swing.ImageIcon(getClass().getResource("/icons/enemies/huggingFace.png")));
        }
    }

    private boolean enemysTurnBlindedAndPoisoned() {
        if (enemy.isPoisoned() && enemy.isBlinded()) {
            labEnemyEffect.setText("Yes");
            JOptionPane.showMessageDialog(
                    this,
                    enemy.getName() + " was "
                    + ((enemy.getPoisonedTurns() == 3)
                    ? "poisoned and " : "") + "blinded",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            passivePoisonDamage();
            enemy.setBlindedIfPossible(false);
            isEnemyDead();
            megaGnarDurationReduced();
            removePoppyShield();
            return true;
        }
        return false;
    }

    private boolean enemysTurnPoorSightAndPoisoned() {
        if (enemy.isPoisoned() && enemy.isPoorSight()) {
            labEnemyEffect.setText("Yes");
            passivePoisonDamage();
            JOptionPane.showMessageDialog(
                    this,
                    enemy.getName()
                    + ((enemy.getPoisonedTurns() == 2) ? " was poisoned and " : "") + " cant' see "
                    + starter.getName() + ", since " + starter.getName() + " camouflaged",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            enemy.setPoorSightIfPossible(false);
            isEnemyDead();
            megaGnarDurationReduced();
            removePoppyShield();
            return true;
        }
        return false;
    }

    private boolean enemysTurnBlinded() {
        if (enemy.isBlinded()) {
            JOptionPane.showMessageDialog(
                    this,
                    enemy.getName() + ((starter instanceof Teemo || starter instanceof Yuumi)
                    ? " was blinded and didn't attack."
                    : ((starter instanceof Gnar)
                            ? " was stunned and didn't attack."
                            : "")),
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            enemy.setBlindedIfPossible(false);
            megaGnarDurationReduced();
            removePoppyShield();
            return true;
        }
        return false;
    }

    private boolean enemysTurnPoorSight() {
        if (enemy.isPoorSight()) {
            JOptionPane.showMessageDialog(
                    this,
                    starter.getName() + " was camouflaged, and thus " + enemy.getName() + " couldn't find " + starter.getName(),
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            enemy.setPoorSightIfPossible(false);
            megaGnarDurationReduced();
            removePoppyShield();
            return true;
        }
        return false;
    }

    private boolean enemysTurnConfused() {
        if (enemy.isConfused()) {
            labEnemyEffect.setText("Yes");
            double damage = changeSlightlyEnemysDamage();
            JOptionPane.showMessageDialog(
                    this,
                    enemy.getName() + " is confused and inflicted himself: " + ((int) damage + 1) + " damage.",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            enemy.setHealth(enemy.getHealth() - damage);
            labEnemyHealth.setText(String.valueOf((int) enemy.getHealth()));
            megaGnarDurationReduced();
            removePoppyShield();
            enemy.setConfusedIfPossible(false);
            labEnemyEffect.setText("No");
            isEnemyDead();
            return true;
        }
        return false;
    }

    private boolean enemysTurnPoisoned() {
        if (enemy.isPoisoned()) {
            labEnemyEffect.setText("Yes");
            passivePoisonDamage();
            if (enemy.getPoisonedTurns() == 2) {
                JOptionPane.showMessageDialog(
                        this,
                        enemy.getName() + " was poisoned",
                        this.getName(),
                        JOptionPane.INFORMATION_MESSAGE);
            }
            if (!isEnemyDead()) {
                enemysTurnWithNoEffects();
            }
            isStarterDead();
            return true;
        }
        return false;
    }

    private void passivePoisonDamage() {
        if (enemy.isPoisoned()) {
            enemy.setHealth(enemy.getHealth() - ((Teemo) starter).getPoisonDamage());
            labEnemyHealth.setText(String.valueOf((int) enemy.getHealth()));
            enemy.setPoisonedTurns(enemy.getPoisonedTurns() - 1);
            if (enemy.getPoisonedTurns() <= 0) {
                enemy.setPoisonedIfPossible(false);
                labEnemyEffect.setText("No");
            }
        }
    }

    private void enemysTurnWithNoEffects() {
        double damage = changeSlightlyEnemysDamage();
        if (enemyDestroysItself(damage)) {
            return;
        }
        damage = enemyStrikesTwice(damage);
        enemyAttacksStarter(damage);

        possibleGnarTransformation();
        megaGnarDurationReduced();
        removePoppyShield();
        isStarterDead();
    }

    private double changeSlightlyEnemysDamage() {
        int num = (int) (Math.random() * 5 + 1);
        switch (num) {
            case 1:
                return enemy.getAttackDamage() * .7;
            case 2:
                return enemy.getAttackDamage() * .85;
            case 3:
                return enemy.getAttackDamage() * 1.15;
            case 4:
                return enemy.getAttackDamage() * 1.3;
            default:
                return enemy.getAttackDamage();
        }
    }

    private boolean enemyDestroysItself(double damage) throws HeadlessException {
        if (enemy.isAbleToDestroyItself()) {
            damage = starter.adjustAttackDamageRegardingResistance(damage) * 2.5;
            JOptionPane.showMessageDialog(
                    this,
                    enemy.getName() + " destroyed itself. And the explosion inflicted "
                    + ((double) (int) (damage * 100)) / 100 + " of damage to " + starter.getName(),
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            enemy.setHealth(0);
            labEnemyHealth.setText(String.valueOf((int) enemy.getHealth()));
            starter.setHealth(starter.getHealth() - damage);
            labStarterHealth.setText(String.valueOf((int) starter.getHealth()));
            isEnemyDead();
            isStarterDead();
            return true;
        }
        return false;
    }

    private double enemyStrikesTwice(double damage) throws HeadlessException {
        if (enemy.isAbleToStrikeTwice()) {
            JOptionPane.showMessageDialog(
                    this,
                    enemy.getName() + " striked twice",
                    this.getName(),
                    JOptionPane.INFORMATION_MESSAGE);
            damage = damage * 2;
        }
        return damage;
    }

    private void enemyAttacksStarter(double damage) throws HeadlessException {
        damage = starter.adjustAttackDamageRegardingResistance(damage);
        JOptionPane.showMessageDialog(
                this,
                enemy.getName() + " inflicted: " + (int) (damage + 0.9) + " damage.",
                this.getName(),
                JOptionPane.INFORMATION_MESSAGE);
        starter.setHealth(starter.getHealth() - damage);
        labStarterHealth.setText(String.valueOf((int) starter.getHealth()));
    }

    private void isStarterDead() {
        if (starter.getHealth() <= 0) {
            starter.setGoldAmount(starter.getGoldAmount() / 2);
            starter.setHealth(starter.getMaximumHealth() / 2);
            if (starter instanceof Gnar gnar) {
                gnar.setIsMonster(false);
                gnar.setMonsterCounter(0);
            }
            JOptionPane.showMessageDialog(
                    GUICallBack,
                    starter.getName() + " died. You lost " + starter.getGoldAmount() + " gold!",
                    this.getName(),
                    JOptionPane.WARNING_MESSAGE);
            this.setVisible(false);
            this.getRootPane().getContentPane().remove(this);
        }
    }

    private void possibleGnarTransformation() {
        if (starter instanceof Gnar gnar && !gnar.isMonstruo()) {
            double num = (Math.random() * 100 + gnar.getResistance() / 10); //From 25.5%(23+2.5) to 30%(23+7)
            if (num >= 77) {
                gnar.setIsMonster(true);
                gnar.setMonsterCounter(4);

                JOptionPane.showMessageDialog(
                        this,
                        "Gnar transforms into MegaGnar",
                        this.getName(),
                        JOptionPane.INFORMATION_MESSAGE);
                labStarter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/gnarMega.png")));
                refreshAttackButtons();
            }
        }
    }

    private void megaGnarDurationReduced() {
        if (starter instanceof Gnar gnar && gnar.isMonstruo()) {
            gnar.setMonsterCounter(gnar.getMonsterCounter() - 1);
            if (gnar.getMonsterCounter() <= 0) {
                gnar.setIsMonster(false);
                JOptionPane.showMessageDialog(
                        this,
                        "MegaGnar turned back to miniGnar",
                        this.getName(),
                        JOptionPane.INFORMATION_MESSAGE);
                labStarter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/starters/gnarMini.png")));
                refreshAttackButtons();
            }
        }
    }

    private void removePoppyShield() {
        if (starter instanceof Poppy poppy && poppy.isCarryingShield()) {
            poppy.setCarriesShield(false);
            labVariableValueAmount.setText("No");
        }
    }

    private void refreshAttackButtons() {
        butMainAttack.setText(starter.getNameOfMainAttack());
        butSecondaryAttack.setText(starter.getNameOfSecondaryAttack());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butEscape;
    private javax.swing.JButton butMainAttack;
    private javax.swing.JButton butSecondaryAttack;
    private javax.swing.JLabel labADAmount;
    private javax.swing.JLabel labEnemy;
    private javax.swing.JLabel labEnemyEffect;
    private javax.swing.JLabel labEnemyHealth;
    private javax.swing.JLabel labFixedAD;
    private javax.swing.JLabel labFixedEnemyEffect;
    private javax.swing.JLabel labFixedGold;
    private javax.swing.JLabel labFixedVariableValue;
    private javax.swing.JLabel labGoldAmount;
    private javax.swing.JLabel labStarter;
    private javax.swing.JLabel labStarterHealth;
    private javax.swing.JLabel labTitle;
    private javax.swing.JLabel labVariableValueAmount;
    private javax.swing.JLabel labVersus;
    // End of variables declaration//GEN-END:variables

}
