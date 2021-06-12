package view;

import model.Globals;
import model.starters.Starter;
import model.starters.Poppy;
import model.starters.Teemo;
import model.starters.Yuumi;
import model.starters.Gnar;
import model.ICallBack;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class PanelShop extends javax.swing.JPanel implements ICallBack {

    private Starter starter;

    public PanelShop() {
        initComponents();
    }

    public void showPanel() {
        starter = Globals.starter;
        refreshStarterInfo();
        refreshShopInfo();

        this.setVisible(true);
        butPotion.requestFocusInWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labTitle = new javax.swing.JLabel();
        labFixedGold = new javax.swing.JLabel();
        labGoldAmount = new javax.swing.JLabel();
        labGoldCoin = new javax.swing.JLabel();
        labFixedAD = new javax.swing.JLabel();
        labAmountAD = new javax.swing.JLabel();
        labFixedVariableValue = new javax.swing.JLabel();
        labVariableValueAmount = new javax.swing.JLabel();
        labFixedHealth = new javax.swing.JLabel();
        labHealthAmount = new javax.swing.JLabel();
        labVictories = new javax.swing.JLabel();
        labVictoriesAmount = new javax.swing.JLabel();
        butPotion = new javax.swing.JButton();
        labPotionPrice = new javax.swing.JLabel();
        labPotionCoin = new javax.swing.JLabel();
        labPotionHealth = new javax.swing.JLabel();
        butInfoPotion = new javax.swing.JButton();
        butVariableItem = new javax.swing.JButton();
        labVariableItemPrice = new javax.swing.JLabel();
        labVariableItemCoin = new javax.swing.JLabel();
        labVariableItemStatsOffered = new javax.swing.JLabel();
        butVariableItemInfo = new javax.swing.JButton();
        butSword = new javax.swing.JButton();
        labSwordPrice = new javax.swing.JLabel();
        labSwordCoin = new javax.swing.JLabel();
        labDanoEspada = new javax.swing.JLabel();
        butSwordInfo = new javax.swing.JButton();

        setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        setMaximumSize(new java.awt.Dimension(800, 560));
        setMinimumSize(new java.awt.Dimension(800, 560));
        setPreferredSize(new java.awt.Dimension(800, 560));

        labTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitle.setText("SHOP");

        labFixedGold.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labFixedGold.setText("Gold:");

        labGoldAmount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labGoldAmount.setText(" ");

        labGoldCoin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labGoldCoin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shop/coin.png"))); // NOI18N
        labGoldCoin.setText(" ");

        labFixedAD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labFixedAD.setText("Attack Damage:");

        labAmountAD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labAmountAD.setText(" ");

        labFixedVariableValue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labFixedVariableValue.setText("Poison Damage:");

        labVariableValueAmount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labVariableValueAmount.setText(" ");

        labFixedHealth.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labFixedHealth.setText("Health:");

        labHealthAmount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labHealthAmount.setText(" ");

        labVictories.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labVictories.setText("Victories:");

        labVictoriesAmount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labVictoriesAmount.setText(" ");

        butPotion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shop/healthPotion.png"))); // NOI18N
        butPotion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        butPotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPotionActionPerformed(evt);
            }
        });

        labPotionPrice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labPotionPrice.setText("30");

        labPotionCoin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shop/coin.png"))); // NOI18N
        labPotionCoin.setText(" ");

        labPotionHealth.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labPotionHealth.setText("+75 Health");

        butInfoPotion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butInfoPotion.setText("Info");
        butInfoPotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butInfoPotionActionPerformed(evt);
            }
        });

        butVariableItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shop/poison.png"))); // NOI18N
        butVariableItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butVariableItemActionPerformed(evt);
            }
        });

        labVariableItemPrice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labVariableItemPrice.setText("120");

        labVariableItemCoin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shop/coin.png"))); // NOI18N
        labVariableItemCoin.setText(" ");

        labVariableItemStatsOffered.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labVariableItemStatsOffered.setText("+1 poison damage");

        butVariableItemInfo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butVariableItemInfo.setText("Info");
        butVariableItemInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butVariableItemInfoActionPerformed(evt);
            }
        });

        butSword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shop/sword.png"))); // NOI18N
        butSword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSwordActionPerformed(evt);
            }
        });

        labSwordPrice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labSwordPrice.setText("150");

        labSwordCoin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shop/coin.png"))); // NOI18N
        labSwordCoin.setText(" ");

        labDanoEspada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labDanoEspada.setText("+2 attack damage");

        butSwordInfo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butSwordInfo.setText("Info");
        butSwordInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSwordInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labFixedVariableValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labFixedHealth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labFixedAD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labFixedGold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labVictories, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labAmountAD)
                    .addComponent(labVariableValueAmount)
                    .addComponent(labHealthAmount)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labGoldAmount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labGoldCoin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labVictoriesAmount))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labPotionPrice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labPotionCoin, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(labPotionHealth))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butPotion)
                        .addGap(18, 18, 18)
                        .addComponent(butInfoPotion)))
                .addContainerGap(260, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labVariableItemPrice)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labVariableItemCoin, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labVariableItemStatsOffered))
                            .addComponent(butVariableItem, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(butVariableItemInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labSwordPrice)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labSwordCoin, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labDanoEspada))
                            .addComponent(butSword, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(butSwordInfo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(butPotion)
                            .addComponent(butInfoPotion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labPotionPrice)
                            .addComponent(labPotionHealth)
                            .addComponent(labPotionCoin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(butVariableItem, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(butVariableItemInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labVariableItemPrice)
                                    .addComponent(labVariableItemStatsOffered)
                                    .addComponent(labVariableItemCoin)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(butSword)
                                    .addComponent(butSwordInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labSwordPrice)
                                    .addComponent(labDanoEspada)
                                    .addComponent(labSwordCoin)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labFixedGold)
                            .addComponent(labGoldAmount)
                            .addComponent(labGoldCoin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labAmountAD)
                            .addComponent(labFixedAD))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labVariableValueAmount)
                            .addComponent(labFixedVariableValue))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labHealthAmount)
                            .addComponent(labFixedHealth))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labVictories)
                            .addComponent(labVictoriesAmount))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshStarterInfo() {
        refreshGold();
        refreshAttackDamage();
        refreshHealth();
        refreshVictories();
        refreshVariableValue();
    }

    private void refreshShopInfo() throws NumberFormatException {
        refreshVariableItem();
        refreshSwordPrice();
    }

    private void butPotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPotionActionPerformed
        if (starter.getGoldAmount() < Integer.parseInt(labPotionPrice.getText())) {
            JOptionPane.showMessageDialog(
                    this,
                    "You don't have enough money for this!",
                    this.getName(),
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (starter.getHealth() >= starter.getMaximumHealth()) {
            JOptionPane.showMessageDialog(
                    this,
                    "You have maximum HP!",
                    this.getName(),
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        starter.setGoldAmount(starter.getGoldAmount() - Integer.parseInt(labPotionPrice.getText()));
        starter.setHealth(starter.getHealth() + 75);
        if (starter.getHealth() > starter.getMaximumHealth()) {
            starter.setHealth(starter.getMaximumHealth());
        }
        refreshGold();
        refreshHealth();
        JOptionPane.showMessageDialog(
                this,
                "You bought a potion (+75 health)",
                this.getName(),
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butPotionActionPerformed

    private void butVariableItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butVariableItemActionPerformed
        if (starter instanceof Teemo teemo) {
            butItemVariableTeemo(teemo);
        } else if (starter instanceof Gnar gnar) {
            butItemVariableGnar(gnar);
        } else if (starter instanceof Poppy poppy) {
            butItemVariablePoppy(poppy);
        } else if (starter instanceof Yuumi yuumi) {
            butItemVariableYuumi(yuumi);
        }
    }//GEN-LAST:event_butVariableItemActionPerformed

    private void butItemVariableTeemo(Teemo teemo) throws HeadlessException, NumberFormatException {
        if (noEnoughMoneyForVariableItem()) return;
        if (teemo.getPoisonDamage() >= teemo.getDanoVenenoMaximo()) {
            JOptionPane.showMessageDialog(
                    this,
                    teemo.getDanoVenenoMaximo() + " is the maximum poison damage",
                    this.getName(),
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        teemo.setGoldAmount(teemo.getGoldAmount() - Integer.parseInt(labVariableItemPrice.getText()));
        teemo.setPoisonDamage(teemo.getPoisonDamage() + 1);
        refreshGold();
        refreshVariableValue();
        JOptionPane.showMessageDialog(
                this,
                "You bought a poisonous potion (+1 poison damage)",
                this.getName(),
                JOptionPane.INFORMATION_MESSAGE);
        refreshVariableItem();
    }

    private void butItemVariableGnar(Gnar gnar) throws HeadlessException, NumberFormatException {
        if (noEnoughMoneyForVariableItem()) return;
        if (gnar.getResistance() >= gnar.getResistenciaMaxima()) {
            JOptionPane.showMessageDialog(
                    this,
                    gnar.getResistenciaMaxima() + " is the maximum of resistance",
                    this.getName(),
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        gnar.setGoldAmount(gnar.getGoldAmount() - Integer.parseInt(labVariableItemPrice.getText()));
        gnar.setResistance(gnar.getResistance() + 2);
        refreshGold();
        refreshVariableValue();
        JOptionPane.showMessageDialog(
                this,
                "You bought an armor (+2 resistance)",
                this.getName(),
                JOptionPane.INFORMATION_MESSAGE);
        refreshVariableItem();
    }

    private void butItemVariablePoppy(Poppy poppy) throws HeadlessException, NumberFormatException {
        if (noEnoughMoneyForVariableItem()) return;
        if (poppy.getShieldProtection() >= poppy.getProteccionEscudoMaxima()) {
            JOptionPane.showMessageDialog(
                    this,
                    poppy.getProteccionEscudoMaxima() + " is the maximum shield toughness",
                    this.getName(),
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        poppy.setGoldAmount(poppy.getGoldAmount() - Integer.parseInt(labVariableItemPrice.getText()));
        poppy.setShieldProtection(poppy.getShieldProtection() + 1);
        refreshGold();
        refreshVariableValue();
        JOptionPane.showMessageDialog(
                this,
                "You bought a shield (+1 shield toughness)",
                this.getName(),
                JOptionPane.INFORMATION_MESSAGE);
        refreshVariableItem();
    }

    private void butItemVariableYuumi(Yuumi yuumi) throws HeadlessException, NumberFormatException {
        if (noEnoughMoneyForVariableItem()) return;
        if (yuumi.getHealing() >= yuumi.getMaximumHealing()) {
            JOptionPane.showMessageDialog(
                    this,
                    yuumi.getHealing() + " is the maximum healing per turn",
                    this.getName(),
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        yuumi.setGoldAmount(yuumi.getGoldAmount() - Integer.parseInt(labVariableItemPrice.getText()));
        yuumi.setHealing(yuumi.getHealing() + 1);
        refreshGold();
        refreshVariableValue();
        JOptionPane.showMessageDialog(
                this,
                "You bought a relieve potion(+1 healing)",
                this.getName(),
                JOptionPane.INFORMATION_MESSAGE);
        refreshVariableItem();
    }

    private void refreshVariableItem() {
        if (starter instanceof Teemo) {
            labFixedVariableValue.setText("Poison Damage:");
            labVariableItemStatsOffered.setText("+1 poison damage");
            butVariableItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shop/poison.png")));
            labVariableItemPrice.setText(String.valueOf((int) (Double.parseDouble(labVariableValueAmount.getText()) * 20)));
        } else if (starter instanceof Gnar) {
            labFixedVariableValue.setText("Resistance:");
            labVariableItemStatsOffered.setText("+2 Resistance");
            butVariableItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shop/armor.png")));
            labVariableItemPrice.setText(String.valueOf((int) (Double.parseDouble(labVariableValueAmount.getText()) * 7.5)));
        } else if (starter instanceof Poppy) {
            labFixedVariableValue.setText("Shield:");
            labVariableItemStatsOffered.setText("+1 Shield toughness");
            butVariableItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shop/shield.png")));
            labVariableItemPrice.setText(String.valueOf((int) (Double.parseDouble(labVariableValueAmount.getText()) * 20)));
        } else if (starter instanceof Yuumi) {
            labFixedVariableValue.setText("Healing:");
            labVariableItemStatsOffered.setText("+1 healing");
            butVariableItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shop/relievePotion.png")));
            labVariableItemPrice.setText(String.valueOf((int) (Double.parseDouble(labVariableValueAmount.getText()) * 16)));
        }
    }

    private boolean noEnoughMoneyForVariableItem() throws NumberFormatException, HeadlessException {
        if (starter.getGoldAmount() < Integer.parseInt(labVariableItemPrice.getText())) {
            JOptionPane.showMessageDialog(
                    this,
                    "You don't have enough money for this!",
                    this.getName(),
                    JOptionPane.WARNING_MESSAGE);
            return true;
        }
        return false;
    }

    private void butSwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSwordActionPerformed
        if (starter.getGoldAmount() < Integer.parseInt(labSwordPrice.getText())) {
            JOptionPane.showMessageDialog(
                    this,
                    "You don't have enough money for this!",
                    this.getName(),
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (starter.getAttackDamage() >= starter.getMaximumAttackDamage()) {
            JOptionPane.showMessageDialog(
                    this,
                    starter.getMaximumAttackDamage() + " is the maximum attack damage per hit",
                    this.getName(),
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        starter.setGoldAmount(starter.getGoldAmount() - Integer.parseInt(labSwordPrice.getText()));
        starter.setAttackDamage(starter.getAttackDamage() + 2);
        refreshGold();
        refreshAttackDamage();
        JOptionPane.showMessageDialog(
                this,
                "You bought a sword (+2 attack damage)",
                this.getName(),
                JOptionPane.INFORMATION_MESSAGE);
        refreshSwordPrice();
    }//GEN-LAST:event_butSwordActionPerformed

    private void butInfoPotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butInfoPotionActionPerformed
        PanelGeneralInformation panelI = new PanelGeneralInformation();
        this.add(panelI);
        panelI.clickHealthPotion();
        Globals.panelCaller = this;
        this.setVisible(false);
    }//GEN-LAST:event_butInfoPotionActionPerformed

    private void butVariableItemInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butVariableItemInfoActionPerformed
        PanelGeneralInformation panelI = new PanelGeneralInformation();
        this.add(panelI);
        if (starter instanceof Teemo) {
            panelI.clickPoison();
        } else if (starter instanceof Poppy) {
            panelI.clickShield();
        } else if (starter instanceof Gnar) {
            panelI.clickArmor();
        } else if (starter instanceof Yuumi) {
            panelI.clickRelievePotion();
        }
        Globals.panelCaller = this;
        this.setVisible(false);
    }//GEN-LAST:event_butVariableItemInfoActionPerformed

    private void butSwordInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSwordInfoActionPerformed
        PanelGeneralInformation panelI = new PanelGeneralInformation();
        this.add(panelI);
        panelI.clickSword();
        Globals.panelCaller = this;
        this.setVisible(false);
    }//GEN-LAST:event_butSwordInfoActionPerformed

    private void refreshGold() {
        labGoldAmount.setText(String.valueOf(starter.getGoldAmount()));
    }

    private void refreshAttackDamage() {
        labAmountAD.setText(String.valueOf(((double) (starter.getAttackDamage() * 10)) / 10));
    }

    private void refreshHealth() {
        labHealthAmount.setText(String.valueOf(((double) ((int)starter.getHealth() * 10)) / 10));
    }

    private void refreshVictories() {
        labVictoriesAmount.setText(String.valueOf(((double) ((int) Starter.getDefeatedEnemies() * 10)) / 10));
    }

    private void refreshVariableValue() {
        if (starter instanceof Teemo teemo) {
            labVariableValueAmount.setText(String.valueOf(((double) (teemo.getPoisonDamage()) * 10) / 10));
        } else if (starter instanceof Gnar gnar) {
            labVariableValueAmount.setText(String.valueOf(((double) (gnar.getResistance()) * 10) / 10));
        } else if (starter instanceof Poppy poppy) {
            labVariableValueAmount.setText(String.valueOf(((double) (poppy.getShieldProtection()) * 10) / 10));
        } else if (starter instanceof Yuumi yuumi) {
            labVariableValueAmount.setText(String.valueOf(((double) (yuumi.getHealing()) * 10) / 10));
        }
    }

    private void refreshSwordPrice() throws NumberFormatException {
        labSwordPrice.setText(String.valueOf((int) (-20 + Double.parseDouble(labAmountAD.getText())
                * ((starter instanceof Teemo)
                        ? 11
                        : ((starter instanceof Gnar)
                                ? 16
                                : (starter instanceof Poppy ? 24
                                        : (starter instanceof Yuumi ? 29.5
                                                : 0)))))
        ));
    }

    @Override
    public void makeVisible(boolean bool) {
        this.setVisible(bool);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butInfoPotion;
    private javax.swing.JButton butPotion;
    private javax.swing.JButton butSword;
    private javax.swing.JButton butSwordInfo;
    private javax.swing.JButton butVariableItem;
    private javax.swing.JButton butVariableItemInfo;
    private javax.swing.JLabel labAmountAD;
    private javax.swing.JLabel labDanoEspada;
    private javax.swing.JLabel labFixedAD;
    private javax.swing.JLabel labFixedGold;
    private javax.swing.JLabel labFixedHealth;
    private javax.swing.JLabel labFixedVariableValue;
    private javax.swing.JLabel labGoldAmount;
    private javax.swing.JLabel labGoldCoin;
    private javax.swing.JLabel labHealthAmount;
    private javax.swing.JLabel labPotionCoin;
    private javax.swing.JLabel labPotionHealth;
    private javax.swing.JLabel labPotionPrice;
    private javax.swing.JLabel labSwordCoin;
    private javax.swing.JLabel labSwordPrice;
    private javax.swing.JLabel labTitle;
    private javax.swing.JLabel labVariableItemCoin;
    private javax.swing.JLabel labVariableItemPrice;
    private javax.swing.JLabel labVariableItemStatsOffered;
    private javax.swing.JLabel labVariableValueAmount;
    private javax.swing.JLabel labVictories;
    private javax.swing.JLabel labVictoriesAmount;
    // End of variables declaration//GEN-END:variables
}
