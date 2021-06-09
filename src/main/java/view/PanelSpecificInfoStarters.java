package view;

import model.ICallBack;
import javax.swing.JPanel;
import model.Globals;

public class PanelSpecificInfoStarters extends JPanel {

    private JPanel panelCaller;
    private ICallBack IPanelCaller;
    private String nombreStarter;

    public PanelSpecificInfoStarters() {
        initComponents();
    }

    public void showPanel(ICallBack IPanelCaller, String starterName) {
        this.IPanelCaller = IPanelCaller;
        this.nombreStarter = starterName;
        panelCaller = Globals.panelCaller;

        startersSpecificInfo(starterName);

        this.setVisible(true);
        this.requestFocusInWindow();
    }

    private void startersSpecificInfo(String starterName) {
        switch (starterName) {
            case "teemo":
                teemoInfo();
                break;
            case "poppy":
                poppyInfo();
                break;
            case "yuumi":
                yuumiInfo();
                break;
            case "gnarMini":
                gnarMini();
                break;
            case "gnarMega":
                gnarMegaInfo();
                break;
        }
    }

    private void teemoInfo() {
        labTitle.setText("Teemo");
        labMainAttack.setText(Globals.teemo.getNameOfMainAttack());
        txtMainAttack.setText("It inflicts 150% of Teemo's attack damage.\n"
                + "Teemo has a slight chance of being camou-\n"
                + "flaged, this chance is scaled by poison\n"
                + "damage.");
        labSecondaryAttack.setText(Globals.teemo.getNameOfSecondaryAttack());
        txtAtaqueSecundario.setText("It inflicts 100% Teemo's attack damage. The\n"
                + "dart's hit has a chance to blind, poison or\n"
                + "both, the chance to do both is scaled by\n"
                + "poison damage. Poison damage also\n"
                + "increases Teemo's passive life steal.");
        labItem.setText("Poisonous potion ->");
        butItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoPoison.png"))); // NOI18N
        labImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/specificInfo/teemoSpecific.png"))); // NOI18N
        txtDescription.setText("Undeterred by even the most\n"
                + "threatening obstacles, Teemo\n"
                + "explores the world with his blowpipe.");
    }

    private void poppyInfo() {
        labTitle.setText("Poppy");
        labMainAttack.setText(Globals.poppy.getNameOfMainAttack());
        txtMainAttack.setText("It inflicts 100% of Poppy's attack damage.\n"
                + "There is a chance that Poppy will put on a\n"
                + "shield, which grants her extra protection for\n"
                + "one turn. This chance scales with the shield \n"
                + "toughness.");
        labSecondaryAttack.setText(Globals.poppy.getNameOfSecondaryAttack());
        txtAtaqueSecundario.setText("It inflicts 50% of Poppy's attack damage. It\n"
                + "also grants a chance to confuse the enemy,\n"
                + "this chance is 33% at the beginning and\n"
                + "scales based on the shield toughness.");
        labItem.setText("Shield ->");
        butItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoShield.png"))); // NOI18N
        labImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/specificInfo/poppySpecific.png"))); // NOI18N
        txtDescription.setText("This stubborn yordle carries Orlon's\n"
                + "legendary hammer, which is twice\n"
                + "her size, and with which she knocks\n"
                + "back the kingdom's enemies with\n"
                + "every swinging blow.");
    }

    private void yuumiInfo() {
        labTitle.setText("Yuumi");
        labMainAttack.setText(Globals.yuumi.getNameOfMainAttack());
        txtMainAttack.setText("She heals herself 100% of her healing power.\n"
                + "Also she inflicts 100% of Yuumi's attack\n"
                + "damage as MAGICAL damage (final damage\n"
                + "varies depending on the enemy's magic\n"
                + "resistance).");
        labSecondaryAttack.setText(Globals.yuumi.getNameOfSecondaryAttack());
        txtAtaqueSecundario.setText("Yuumi heals herself 25%. She may blind, this\n"
                + "chance scales with its healing power. Also\n"
                + "she inflicts 150% of Yuumi's attack damage\n"
                + "as MAGICAL damage (final damage varies\n"
                + "depending on the enemy).");
        labItem.setText("Relieve potion ->");
        butItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoRelievePotion.png"))); // NOI18N
        labImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/specificInfo/yuumiSpecific.png"))); // NOI18N
        txtDescription.setText("Yuumi, a magical cat from Bandle\n"
                + "City, was the companion of a yordle\n"
                + "sorceress, Norra. Since the myste-\n"
                + "rious disappearance of her owner,\n"
                + "Yuumi has been searching for her.");
    }

    private void gnarMini() {
        labTitle.setText("Gnar");
        labMainAttack.setText(Globals.gnar.getNameOfMainAttack());
        txtMainAttack.setText("It inflicts 100% of Gnar's attack damage.\n"
                + "There is a chance that the boomerang will\n"
                + "hit back again.");
        labSecondaryAttack.setText((Globals.gnar.getNameOfSecondaryAttack()));
        txtAtaqueSecundario.setText("It inflicts 100% of Gnar's attack damage.\n"
                + "There is a chance to dodge next enemy's\n"
                + "attack with a jump.");
        labItem.setText("Resistance ->");
        butItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoArmor.png"))); // NOI18N
        labImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/specificInfo/gnarMiniSpecific.png"))); // NOI18N
        txtDescription.setText("Gnar is a primitive yordle whose\n"
                + "playful buffooneries may explode\n"
                + "into the wrath of a small child in an\n"
                + "instant, transforming him into a\n"
                + "massive beast of destruction.");
    }

    private void gnarMegaInfo() {
        labTitle.setText("MegaGnar");
        labMainAttack.setText("Body slam");
        txtMainAttack.setText("It inflicts 220% MegaGnar's attack damage.");
        labSecondaryAttack.setText("Throw Rock");
        txtAtaqueSecundario.setText("The rock can be missed. If it isn't missed, it\n"
                + "inflicts 200% of MegaGnar's attack damage\n"
                + "and stuns the enemy.");
        labItem.setText("Resistance ->");
        butItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoArmor.png"))); // NOI18N
        labImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/specificInfo/gnarMegaSpecific.png"))); // NOI18N
        txtDescription.setText("Delighted with danger, with his\n"
                + "MegaGnar form he throws every-\n"
                + "thing he's able to at his enemies,\n"
                + "either a huge boulder or a nearby\n"
                + "building.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labTitle = new javax.swing.JLabel();
        labMainAttack = new javax.swing.JLabel();
        scrollMainAttack = new javax.swing.JScrollPane();
        txtMainAttack = new javax.swing.JTextArea();
        labSecondaryAttack = new javax.swing.JLabel();
        scrollSecondaryAttack = new javax.swing.JScrollPane();
        txtAtaqueSecundario = new javax.swing.JTextArea();
        labItem = new javax.swing.JLabel();
        butItem = new javax.swing.JButton();
        labImage = new javax.swing.JLabel();
        scrollDescription = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        butReturn = new javax.swing.JButton();

        setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        setMaximumSize(new java.awt.Dimension(800, 560));
        setMinimumSize(new java.awt.Dimension(800, 560));
        setPreferredSize(new java.awt.Dimension(800, 560));

        labTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitle.setText("TEEMO");

        labMainAttack.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labMainAttack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labMainAttack.setText("Scratch");

        txtMainAttack.setEditable(false);
        txtMainAttack.setColumns(20);
        txtMainAttack.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMainAttack.setRows(5);
        txtMainAttack.setText("It inflicts 150% of Teemo's attack damage.\nTeemo has a slight chance of being camou-\nflaged, this chance is scaled by poison\ndamage.");
        scrollMainAttack.setViewportView(txtMainAttack);

        labSecondaryAttack.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labSecondaryAttack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labSecondaryAttack.setText("Dardo Venenoso");

        txtAtaqueSecundario.setEditable(false);
        txtAtaqueSecundario.setColumns(20);
        txtAtaqueSecundario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAtaqueSecundario.setRows(5);
        txtAtaqueSecundario.setText("It inflicts 100% Teemo's attack damage. The\ndart's hit has a chance to blind, poison or\nboth, the chance to do both is scaled by\npoison damage. Poison damage also\nincreases Teemo's passive life steal.");
        scrollSecondaryAttack.setViewportView(txtAtaqueSecundario);

        labItem.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labItem.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labItem.setText("Item ->");

        butItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoPoison.png"))); // NOI18N
        butItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butItemActionPerformed(evt);
            }
        });

        labImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/specificInfo/teemoSpecific.png"))); // NOI18N

        txtDescription.setEditable(false);
        txtDescription.setColumns(20);
        txtDescription.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDescription.setRows(5);
        txtDescription.setText("Undeterred by even the most\nthreatening obstacles, Teemo\nexplores the world with his blowpipe.");
        scrollDescription.setViewportView(txtDescription);

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scrollMainAttack)
                            .addComponent(labMainAttack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labSecondaryAttack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scrollSecondaryAttack)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(butReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labItem, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(butItem, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollDescription, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labMainAttack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollMainAttack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labSecondaryAttack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollSecondaryAttack, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labItem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butItem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labImage, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void butReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butReturnActionPerformed
        this.setVisible(false);
        this.getRootPane().getContentPane().remove(this);
        panelCaller = Globals.panelCaller;
        if (IPanelCaller != null) {         //Return to panelInfo
            IPanelCaller.makeVisible(true);
        }
        if (panelCaller != null) {         //Return to panelShop
            panelCaller.setVisible(true);
        }
    }//GEN-LAST:event_butReturnActionPerformed

    private void butItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butItemActionPerformed
        this.setVisible(false);
        this.getRootPane().getContentPane().remove(this);
        if (nombreStarter.equals("teemo")) {
            IPanelCaller.clickPoison();
        } else if (nombreStarter.equals("poppy")) {
            IPanelCaller.clickShield();
        } else if (nombreStarter.equals("gnarMini") || nombreStarter.equals("gnarMega")) {
            IPanelCaller.clickArmor();
        } else if (nombreStarter.equals("yuumi")) {
            IPanelCaller.clickRelievePotion();
        }
    }//GEN-LAST:event_butItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butItem;
    private javax.swing.JButton butReturn;
    private javax.swing.JLabel labImage;
    private javax.swing.JLabel labItem;
    private javax.swing.JLabel labMainAttack;
    private javax.swing.JLabel labSecondaryAttack;
    private javax.swing.JLabel labTitle;
    private javax.swing.JScrollPane scrollDescription;
    private javax.swing.JScrollPane scrollMainAttack;
    private javax.swing.JScrollPane scrollSecondaryAttack;
    private javax.swing.JTextArea txtAtaqueSecundario;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextArea txtMainAttack;
    // End of variables declaration//GEN-END:variables

}
