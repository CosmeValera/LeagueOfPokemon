package view;

import javax.swing.JPanel;

public class PanelSpecificInfoEnemies extends JPanel {

    JPanel panelCaller;

    public PanelSpecificInfoEnemies() {
        initComponents();
    }

    void showPanel(JPanel panelInformacion, String nombreStarter) {
        panelCaller = panelInformacion;

        infoEspecificaEnemigos(nombreStarter);

        this.setVisible(true);
        this.requestFocusInWindow();
    }

    private void infoEspecificaEnemigos(String nombreStarter) {
        switch (nombreStarter) {
            case "pikachu":
                pikachuInfo();
                break;
            case "electrode":
                electrodeInfo();
                break;
            case "hitMonLee":
                hitMonLeeInfo();
                break;
            case "gyarados":
                gyaradosInfo();
                break;
            case "rayquaza":
                rayquazaInfo();
                break;
            case "arceus":
                arceusInfo();
                break;
        }
    }

    private void pikachuInfo() {
        labTitle.setText("Pikachu");
        txtDescription.setText("Pikachu is a Pokémon that has the appea-\n"
                + "rance of a small mouse, its fur is of a yellow\n"
                + "color, it has two brown markings covering\n"
                + "its back and on a small part of its tail.");
        labImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/specificInfo/pikachuSpecific.png"))); // NOI18N
        txtHability.setText("Pikachu stands out in its ability to control its\n"
                + "mind to focus on the fight and gives its all to\n"
                + "win the fight, thanks to this it is immune to\n"
                + "all kinds of poisons. Weak against magic.");
    }

    private void electrodeInfo() {
        labTitle.setText("Electrode");
        txtDescription.setText("Electrode is an electric-type Pokémon. It is\n"
                + "considered a very dangerous Pokémon,\n"
                + "besides being fast, it is capable of weakening\n"
                + "a Pokémon with \"Self Destruction\".");
        labImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/specificInfo/electrodeSpecific.png"))); // NOI18N
        txtHability.setText("It has the ability of \"Self-destruction\" with\n"
                + "which it can weaken its opponent with a\n"
                + "single blow, although this attack requires\n"
                + "so much effort that it costs it its life. Strong\n"
                + "against magic.");
    }

    private void hitMonLeeInfo() {
        labTitle.setText("HitMonLee");
        txtDescription.setText("Hitmonlee is a fighting Pokémon. It is an\n"
                + "expert at using its feet as weapons, delivering\n"
                + "a numerous type of kicks. Its western name is\n"
                + "a sort of tribute to Bruce Lee.");
        labImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/specificInfo/hitMonLeeSpecific.png"))); // NOI18N
        txtHability.setText("Because of its Muay Thai skills it is able to\n"
                + "connect two consecutive punches in the same\n"
                + "turn. This combat experience has also\n"
                + "endowed him with resistance against blinds\n"
                + "and stuns. Slightly weak against magic.");

    }

    private void gyaradosInfo() {
        labTitle.setText("Gyarados");
        txtDescription.setText("Gyarados is a water-type and flying Pokémon,\n"
                + "one of the most fearsome and powerful, as it\n"
                + "is capable of creating waterfalls out of\n"
                + "nothing as well as rumbling the earth with\n"
                + "earthquakes.");
        labImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/specificInfo/gyaradosSpecific.png"))); // NOI18N
        txtHability.setText("Gyarados in addition to controlling the sea\n"
                + "and land, was endowed by the god Arceus\n"
                + "with excellent vision that allows him to see\n"
                + "anyone no matter how much he camouflages\n"
                + "himself, and it cannot be confused.\n"
                + "Slightly strong against magic.");
    }

    private void rayquazaInfo() {
        labTitle.setText("Rayquaza");
        txtDescription.setText("Rayquaza is a legendary Pokémon from the\n"
                + "Hoenn region that represents the heavens\n"
                + "and balances the powers of the sea and land.\n"
                + "This green-colored celestial dragon is im-\n"
                + "mune to almost all spells.");
        labImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/specificInfo/rayquazaSpecific.png"))); // NOI18N
        txtHability.setText("Rayquaza controls the skies and moves so fast\n"
                + "that it can strike twice in the same turn, it has\n"
                + "such a prodigious vision that it is able to see\n"
                + "any enemy, it is immune to poison, and can\n"
                + "not be confused. Strong against magic.");
    }

    private void arceusInfo() {
        labTitle.setText("Arceus");
        txtDescription.setText("Arceus is a unique Pokémon. According to\n"
                + "the mythologies of the regions of the\n"
                + "Pokémon world and what is known so far,\n"
                + "it is believed to be the first Pokémon in\n"
                + "existence, creator of the Pokémon world and\n"
                + "therefore, the Pokémon god.");
        labImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/specificInfo/arceusSpecific.png"))); // NOI18N
        txtHability.setText("Arceus possesses the abilities of all the\n"
                + "Pokémon since it was the one who created\n"
                + "them, that's why it is the hardest rival to beat.\n"
                + "Weak against magic.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labTitle = new javax.swing.JLabel();
        labDescription = new javax.swing.JLabel();
        scrollDescription = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        labAbility = new javax.swing.JLabel();
        scrollHability = new javax.swing.JScrollPane();
        txtHability = new javax.swing.JTextArea();
        labImage = new javax.swing.JLabel();
        butReturn = new javax.swing.JButton();

        setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        setMaximumSize(new java.awt.Dimension(800, 560));
        setMinimumSize(new java.awt.Dimension(800, 560));
        setPreferredSize(new java.awt.Dimension(800, 560));

        labTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitle.setText("PIKACHU");

        labDescription.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labDescription.setText("Description");

        txtDescription.setEditable(false);
        txtDescription.setColumns(20);
        txtDescription.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDescription.setRows(5);
        txtDescription.setText("Pikachu is a Pokémon that has the appea-\nrance of a small mouse, its fur is of a yellow\ncolor, it has two brown markings covering\nits back and on a small part of its tail.");
        scrollDescription.setViewportView(txtDescription);

        labAbility.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labAbility.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labAbility.setText("Ability");

        txtHability.setEditable(false);
        txtHability.setColumns(20);
        txtHability.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtHability.setRows(5);
        txtHability.setText("Pikachu stands out in its ability to control its\nmind to focus on the fight and gives its all to\nwin the fight, thanks to this it is immune to\nall kinds of poisons. Weak against magic.");
        scrollHability.setViewportView(txtHability);

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(scrollDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                                .addComponent(labDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(scrollHability)
                                .addComponent(labAbility, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(labImage, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 25, Short.MAX_VALUE)))
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
                        .addComponent(labDescription)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(labAbility)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollHability, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labImage, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(butReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void butReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butReturnActionPerformed
        this.setVisible(false);
        this.getRootPane().getContentPane().remove(this);
        panelCaller.setVisible(true);
        panelCaller.requestFocusInWindow();
    }//GEN-LAST:event_butReturnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butReturn;
    private javax.swing.JLabel labAbility;
    private javax.swing.JLabel labDescription;
    private javax.swing.JLabel labImage;
    private javax.swing.JLabel labTitle;
    private javax.swing.JScrollPane scrollDescription;
    private javax.swing.JScrollPane scrollHability;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextArea txtHability;
    // End of variables declaration//GEN-END:variables

}
