package view;

import model.Globals;
import model.ICallBack;
import model.starters.Starter;

public class PanelGeneralInformation extends javax.swing.JPanel implements ICallBack {

    public PanelGeneralInformation() {
        initComponents();
    }

    public void showPanel() {
        this.setVisible(true);
        this.requestFocusInWindow();

        if (!Globals.starter.isTeemoAvailable()) {
            butTeemo.setVisible(false);
            butPoison.setVisible(false);
        }
        if (!Globals.starter.isPoppyAvailable()) {
            butPoppy.setVisible(false);
            butShield.setVisible(false);
        }
        if (!Globals.starter.isGnarAvailable()) {
            butGnarMini.setVisible(false);
            butGnarMega.setVisible(false);
            butArmor.setVisible(false);
        }
        if (!Globals.starter.isYuumiAvailable()) {
            butYuumi.setVisible(false);
            butRelievePotion.setVisible(false);
        }

        if (Starter.getDefeatedEnemies() < Starter.getVictoriesForFirstReward()) {
            butGyarados.setVisible(false);
        }
        if (Starter.getDefeatedEnemies() < Starter.getVictoriesForSecondReward()) {
            butRayquaza.setVisible(false);
        }
        if (Starter.getDefeatedEnemies() < Starter.getVictoriesForThirdReward()) {
            butArceus.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labTitle = new javax.swing.JLabel();
        labStarters = new javax.swing.JLabel();
        butTeemo = new javax.swing.JButton();
        butPoppy = new javax.swing.JButton();
        butGnarMini = new javax.swing.JButton();
        butGnarMega = new javax.swing.JButton();
        butYuumi = new javax.swing.JButton();
        labEnemies = new javax.swing.JLabel();
        butPikachu = new javax.swing.JButton();
        butElectrode = new javax.swing.JButton();
        butHitMonLee = new javax.swing.JButton();
        butGyarados = new javax.swing.JButton();
        butRayquaza = new javax.swing.JButton();
        butArceus = new javax.swing.JButton();
        labItem = new javax.swing.JLabel();
        butHealthPotion = new javax.swing.JButton();
        butSword = new javax.swing.JButton();
        butPoison = new javax.swing.JButton();
        butShield = new javax.swing.JButton();
        butArmor = new javax.swing.JButton();
        butRelievePotion = new javax.swing.JButton();

        setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        setMaximumSize(new java.awt.Dimension(800, 560));
        setMinimumSize(new java.awt.Dimension(800, 560));
        setPreferredSize(new java.awt.Dimension(800, 560));

        labTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitle.setText("INFORMATION");

        labStarters.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labStarters.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labStarters.setText("Starters");

        butTeemo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoTeemo.png"))); // NOI18N
        butTeemo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butStarter_ActionPerformed(evt);
            }
        });

        butPoppy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoPoppy.png"))); // NOI18N
        butPoppy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butStarter_ActionPerformed(evt);
            }
        });

        butGnarMini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoGnarMini.png"))); // NOI18N
        butGnarMini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butStarter_ActionPerformed(evt);
            }
        });

        butGnarMega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoGnarMega.png"))); // NOI18N
        butGnarMega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butStarter_ActionPerformed(evt);
            }
        });

        butYuumi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoYuumi.png"))); // NOI18N
        butYuumi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butStarter_ActionPerformed(evt);
            }
        });

        labEnemies.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labEnemies.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labEnemies.setText("Enemies");

        butPikachu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoPikachu.png"))); // NOI18N
        butPikachu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butEnemigo_ActionPerformed(evt);
            }
        });

        butElectrode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoElectrode.png"))); // NOI18N
        butElectrode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butEnemigo_ActionPerformed(evt);
            }
        });

        butHitMonLee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoHitmonlee.png"))); // NOI18N
        butHitMonLee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butEnemigo_ActionPerformed(evt);
            }
        });

        butGyarados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoGyarados.png"))); // NOI18N
        butGyarados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butEnemigo_ActionPerformed(evt);
            }
        });

        butRayquaza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoRayquaza.png"))); // NOI18N
        butRayquaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butEnemigo_ActionPerformed(evt);
            }
        });

        butArceus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoArceus.png"))); // NOI18N
        butArceus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butEnemigo_ActionPerformed(evt);
            }
        });

        labItem.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labItem.setText("Items");

        butHealthPotion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoPotion.png"))); // NOI18N
        butHealthPotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butItem_ActionPerformed(evt);
            }
        });

        butSword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoSword.png"))); // NOI18N
        butSword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butItem_ActionPerformed(evt);
            }
        });

        butPoison.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoPoison.png"))); // NOI18N
        butPoison.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butItem_ActionPerformed(evt);
            }
        });

        butShield.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoShield.png"))); // NOI18N
        butShield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butItem_ActionPerformed(evt);
            }
        });

        butArmor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoArmor.png"))); // NOI18N
        butArmor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butItem_ActionPerformed(evt);
            }
        });

        butRelievePotion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoRelievePotion.png"))); // NOI18N
        butRelievePotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butItem_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                    .addComponent(labStarters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labEnemies, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butTeemo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butPoppy, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butYuumi, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butGnarMini, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butGnarMega, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butHealthPotion, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butSword, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butPoison, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butShield, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butRelievePotion, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butArmor, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butPikachu, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butElectrode, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butHitMonLee, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butGyarados, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butRayquaza, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butArceus, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(labStarters)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butPoppy, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butTeemo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butGnarMini, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butGnarMega, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butYuumi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labEnemies)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(butElectrode, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butPikachu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butHitMonLee, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butGyarados, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butArceus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(labItem))
                    .addComponent(butRayquaza, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butSword, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butPoison, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butShield, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butHealthPotion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butRelievePotion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butArmor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void butStarter_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butStarter_ActionPerformed
        this.setVisible(false);
        PanelSpecificInfoStarters panelIES = new PanelSpecificInfoStarters();
        panelIES.setSize(800, 560);
        panelIES.setVisible(false);
        this.getRootPane().getContentPane().add(panelIES);

        if (evt.getSource() == butTeemo) {
            panelIES.showPanel(this, "teemo");
        } else if (evt.getSource() == butPoppy) {
            panelIES.showPanel(this, "poppy");
        } else if (evt.getSource() == butGnarMini) {
            panelIES.showPanel(this, "gnarMini");
        } else if (evt.getSource() == butGnarMega) {
            panelIES.showPanel(this, "gnarMega");
        } else if (evt.getSource() == butYuumi) {
            panelIES.showPanel(this, "yuumi");
        }

    }//GEN-LAST:event_butStarter_ActionPerformed

    private void butEnemigo_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butEnemigo_ActionPerformed
        this.setVisible(false);
        PanelSpecificInfoEnemies panelIEE = new PanelSpecificInfoEnemies();
        panelIEE.setSize(800, 560);
        panelIEE.setVisible(false);
        this.getRootPane().getContentPane().add(panelIEE);

        if (evt.getSource() == butPikachu) {
            panelIEE.showPanel(this, "pikachu");
        } else if (evt.getSource() == butElectrode) {
            panelIEE.showPanel(this, "electrode");
        } else if (evt.getSource() == butHitMonLee) {
            panelIEE.showPanel(this, "hitMonLee");
        } else if (evt.getSource() == butGyarados) {
            panelIEE.showPanel(this, "gyarados");
        } else if (evt.getSource() == butRayquaza) {
            panelIEE.showPanel(this, "rayquaza");
        } else if (evt.getSource() == butArceus) {
            panelIEE.showPanel(this, "arceus");
        }
    }//GEN-LAST:event_butEnemigo_ActionPerformed

    private void butItem_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butItem_ActionPerformed
        this.setVisible(false);
        PanelSpecificInfoItems panelIEI = new PanelSpecificInfoItems();
        panelIEI.setSize(800, 560);
        panelIEI.setVisible(false);
        this.getRootPane().getContentPane().add(panelIEI);

        if (evt.getSource() == butHealthPotion) {
            panelIEI.showPanel(this, "healthPotion");
        } else if (evt.getSource() == butSword) {
            panelIEI.showPanel(this, "sword");
        } else if (evt.getSource() == butPoison) {
            panelIEI.showPanel(this, "poison");
        } else if (evt.getSource() == butShield) {
            panelIEI.showPanel(this, "shield");
        } else if (evt.getSource() == butArmor) {
            panelIEI.showPanel(this, "armor");
        } else if (evt.getSource() == butRelievePotion) {
            panelIEI.showPanel(this, "relievePotion");
        }
    }//GEN-LAST:event_butItem_ActionPerformed
    @Override
    public void clickHealthPotion() {
        butHealthPotion.doClick();
    }

    @Override
    public void clickSword() {
        butSword.doClick();
    }

    @Override
    public void clickPoison() {
        butPoison.doClick();
    }

    @Override
    public void clickShield() {
        butShield.doClick();
    }

    @Override
    public void clickArmor() {
        butArmor.doClick();
    }

    @Override
    public void clickRelievePotion() {
        butRelievePotion.doClick();
    }

    @Override
    public void makeVisible(boolean bool) {
        this.setVisible(bool);
    }

    @Override
    public void clickTeemo() {
        butTeemo.doClick();
    }

    @Override
    public void clickPoppy() {
        butPoppy.doClick();
    }

    @Override
    public void clickGnarMini() {
        butGnarMini.doClick();
    }

    @Override
    public void clickGnarMega() {
        butGnarMega.doClick();
    }
    
    @Override
    public void clickYuumi() {
        butYuumi.doClick();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butArceus;
    private javax.swing.JButton butArmor;
    private javax.swing.JButton butElectrode;
    private javax.swing.JButton butGnarMega;
    private javax.swing.JButton butGnarMini;
    private javax.swing.JButton butGyarados;
    private javax.swing.JButton butHealthPotion;
    private javax.swing.JButton butHitMonLee;
    private javax.swing.JButton butPikachu;
    private javax.swing.JButton butPoison;
    private javax.swing.JButton butPoppy;
    private javax.swing.JButton butRayquaza;
    private javax.swing.JButton butRelievePotion;
    private javax.swing.JButton butShield;
    private javax.swing.JButton butSword;
    private javax.swing.JButton butTeemo;
    private javax.swing.JButton butYuumi;
    private javax.swing.JLabel labEnemies;
    private javax.swing.JLabel labItem;
    private javax.swing.JLabel labStarters;
    private javax.swing.JLabel labTitle;
    // End of variables declaration//GEN-END:variables
}
