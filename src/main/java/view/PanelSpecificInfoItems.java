package view;

import model.ICallBack;
import javax.swing.JPanel;
import model.Globals;

public class PanelSpecificInfoItems extends JPanel {

    JPanel panelCaller;
    ICallBack IPanelCaller;
    String itemName;

    public PanelSpecificInfoItems() {
        initComponents();
    }

    public void showPanel(ICallBack informationPanel, String itemName) {
        this.itemName = itemName;
        IPanelCaller = informationPanel;
        panelCaller = Globals.panelCaller;

        specificItemsInfo(itemName);

        this.setVisible(true);
        this.requestFocusInWindow();
    }

    private void specificItemsInfo(String itemName) {
        switch (itemName) {
            case "healthPotion":
                healthPotionInfo();
                break;
            case "sword":
                swordInfo();
                break;
            case "poison":
                poisonInfo();
                break;
            case "shield":
                shieldInfo();
                break;
            case "relievePotion":
                relievePotionInfo();
                break;
            case "armor":
                armorInfo();
                break;
        }
    }

    private void healthPotionInfo() {
        labTitle.setText("Potion");
        txtDescription.setText("Price: 30.\n"
                + "Restores 75 HP.");
        labImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/specificInfo/potionSpecific.png"))); // NOI18N
        labStarters.setVisible(false);
        butStarterOne.setVisible(false);
        butStarterTwo.setVisible(false);
        butStarterThree.setVisible(false);
    }

    private void swordInfo() {
        labTitle.setText("Sword");
        txtDescription.setText("It grants 2 extra attack damage.");
        labImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/specificInfo/swordSpecific.png"))); // NOI18N
        labStarters.setVisible(false);
        butStarterOne.setVisible(false);
        butStarterTwo.setVisible(false);
        butStarterThree.setVisible(false);
    }

    private void poisonInfo() {
        labTitle.setText("Poison");
        txtDescription.setText("It grants 1 extra Poison Damage inflicted\n"
                + "passively to the opponent each turn.");
        labImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/specificInfo/poisonSpecific.png"))); // NOI18N
        butStarterOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoTeemo.png"))); // NOI18N
        butStarterTwo.setVisible(false);
        butStarterThree.setVisible(false);
    }

    private void shieldInfo() {
        labTitle.setText("Shield");
        txtDescription.setText("It grants 1 extra shield resistance to resist\n"
                + "the next opponent's hit.");
        labImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/specificInfo/shieldSpecific.png"))); // NOI18N
        butStarterOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoPoppy.png"))); // NOI18N
        butStarterTwo.setVisible(false);
        butStarterThree.setVisible(false);
    }

    private void relievePotionInfo() {
        labTitle.setText("Relieve potion");
        txtDescription.setText("It grants 1 extra healing power each time\n"
                + "you trigger healing on a character.");
        labImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/specificInfo/relievePotionSpecific.png"))); // NOI18N
        butStarterOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoYuumi.png"))); // NOI18N
        butStarterTwo.setVisible(false);
        butStarterThree.setVisible(false);
    }

    private void armorInfo() {
        labTitle.setText("Armor");
        txtDescription.setText("It grants 2 extra passive resistance \n"
                + "against enemies' attacks. Resistance\n"
                + "affects twice as much to MegaGnar\n"
                + "as MiniGnar.");
        labImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/specificInfo/armorSpecific.png"))); // NOI18N
        labStarters.setText("Champions that buy this item:");
        butStarterOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoGnarMini.png"))); // NOI18N
        butStarterTwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoGnarMega.png"))); // NOI18N
        butStarterThree.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labTitle = new javax.swing.JLabel();
        labDescription = new javax.swing.JLabel();
        scrollDescription = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        labStarters = new javax.swing.JLabel();
        butStarterOne = new javax.swing.JButton();
        butStarterTwo = new javax.swing.JButton();
        butStarterThree = new javax.swing.JButton();
        labImage = new javax.swing.JLabel();
        butReturn = new javax.swing.JButton();

        setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        setMaximumSize(new java.awt.Dimension(800, 560));
        setMinimumSize(new java.awt.Dimension(800, 560));
        setPreferredSize(new java.awt.Dimension(800, 560));

        labTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitle.setText("POTION");

        labDescription.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labDescription.setText("Description");

        txtDescription.setEditable(false);
        txtDescription.setColumns(20);
        txtDescription.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtDescription.setRows(5);
        txtDescription.setText("Price: 30.\nRestores 75 HP.");
        scrollDescription.setViewportView(txtDescription);

        labStarters.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labStarters.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labStarters.setText("Champion that buys this item:");

        butStarterOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoTeemo.png"))); // NOI18N
        butStarterOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butStarterOneActionPerformed(evt);
            }
        });

        butStarterTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butStarterTwoActionPerformed(evt);
            }
        });

        labImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/specificInfo/teemoSpecific.png"))); // NOI18N

        butReturn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        butReturn.setText("Return");
        butReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butReturnActionPerformed(evt);
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(scrollDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                                        .addComponent(labDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(labStarters, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(butStarterOne, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(butStarterTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(butStarterThree, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(labImage, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(butReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labDescription)
                        .addGap(18, 18, 18)
                        .addComponent(scrollDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(labStarters)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butStarterTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butStarterOne, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butStarterThree, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))
                    .addComponent(labImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(butReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void butReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butReturnActionPerformed
        this.setVisible(false);
        this.getRootPane().getContentPane().remove(this);
        panelCaller = Globals.panelCaller;
        if (IPanelCaller != null) {         //To return to panelInfo
            IPanelCaller.makeVisible(true);
        }
        if (panelCaller != null) {         //To return to panelShop
            panelCaller.setVisible(true);
        }
    }//GEN-LAST:event_butReturnActionPerformed

    private void butStarterOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butStarterOneActionPerformed
        this.setVisible(false);
        this.getRootPane().getContentPane().remove(this);
        if (itemName.equals("poison")) {
            IPanelCaller.clickTeemo();
        } else if (itemName.equals("shield")) {
            IPanelCaller.clickPoppy();
        } else if (itemName.equals("armor")) {
            IPanelCaller.clickGnarMini();
        } else if (itemName.equals("relievePotion")) {
            IPanelCaller.clickYuumi();
        }
    }//GEN-LAST:event_butStarterOneActionPerformed

    private void butStarterTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butStarterTwoActionPerformed
        this.setVisible(false);
        this.getRootPane().getContentPane().remove(this);
        if (itemName.equals("armor")) {
            IPanelCaller.clickGnarMega();
        }
    }//GEN-LAST:event_butStarterTwoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butReturn;
    private javax.swing.JButton butStarterOne;
    private javax.swing.JButton butStarterThree;
    private javax.swing.JButton butStarterTwo;
    private javax.swing.JLabel labDescription;
    private javax.swing.JLabel labImage;
    private javax.swing.JLabel labStarters;
    private javax.swing.JLabel labTitle;
    private javax.swing.JScrollPane scrollDescription;
    private javax.swing.JTextArea txtDescription;
    // End of variables declaration//GEN-END:variables

}
