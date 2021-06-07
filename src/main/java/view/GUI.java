package view;

import model.Teemo;
import model.Poppy;
import model.Gnar;
import model.Yuumi;
import model.Pikachu;
import model.Electrode;
import model.HitMonLee;
import model.Gyarados;
import model.Rayquaza;
import model.Arceus;
import model.Globals;
import model.MathRandomizer;
import javax.swing.JMenuBar;

public class GUI extends javax.swing.JFrame {

    public static enum StarterSelectionType {
        NORMAL, ESPECIAL
    };

    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JMenuBar();
        menuFight = new javax.swing.JMenu();
        menuFight_pikachu = new javax.swing.JMenuItem();
        menuFight_electrode = new javax.swing.JMenuItem();
        menuFight_hitMonLee = new javax.swing.JMenuItem();
        menuFight_gyarados = new javax.swing.JMenuItem();
        menuFight_rayquaza = new javax.swing.JMenuItem();
        menuFight_arceus = new javax.swing.JMenuItem();
        menuManagement = new javax.swing.JMenu();
        menuManagement_shop = new javax.swing.JMenuItem();
        menuManagement_information = new javax.swing.JMenuItem();
        menuManagement_selection = new javax.swing.JMenuItem();
        menuPVP = new javax.swing.JMenu();
        menuPVP_PVP = new javax.swing.JMenuItem();
        menuProfile = new javax.swing.JMenu();
        menuProfile_profile = new javax.swing.JMenuItem();
        menuProfile_settings = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        menuBar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        menuFight.setText("Fight");
        menuFight.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        menuFight_pikachu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuFight_pikachu.setText("Pikachu");
        menuFight_pikachu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCombate_ActionPerformed(evt);
            }
        });
        menuFight.add(menuFight_pikachu);

        menuFight_electrode.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuFight_electrode.setText("Electrode");
        menuFight_electrode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCombate_ActionPerformed(evt);
            }
        });
        menuFight.add(menuFight_electrode);

        menuFight_hitMonLee.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuFight_hitMonLee.setText("HitMonLee");
        menuFight_hitMonLee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCombate_ActionPerformed(evt);
            }
        });
        menuFight.add(menuFight_hitMonLee);

        menuFight_gyarados.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuFight_gyarados.setText("Gyarados");
        menuFight_gyarados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCombate_ActionPerformed(evt);
            }
        });
        menuFight.add(menuFight_gyarados);

        menuFight_rayquaza.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuFight_rayquaza.setText("Rayquaza");
        menuFight_rayquaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCombate_ActionPerformed(evt);
            }
        });
        menuFight.add(menuFight_rayquaza);

        menuFight_arceus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuFight_arceus.setText("Arceus");
        menuFight_arceus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCombate_ActionPerformed(evt);
            }
        });
        menuFight.add(menuFight_arceus);

        menuBar.add(menuFight);

        menuManagement.setText("Management");
        menuManagement.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        menuManagement_shop.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuManagement_shop.setText("Shop");
        menuManagement_shop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTienda_ActionPerformed(evt);
            }
        });
        menuManagement.add(menuManagement_shop);

        menuManagement_information.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuManagement_information.setText("Information");
        menuManagement_information.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTienda_ActionPerformed(evt);
            }
        });
        menuManagement.add(menuManagement_information);

        menuManagement_selection.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuManagement_selection.setText("Selection");
        menuManagement_selection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTienda_ActionPerformed(evt);
            }
        });
        menuManagement.add(menuManagement_selection);

        menuBar.add(menuManagement);

        menuPVP.setText("PVP");
        menuPVP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        menuPVP_PVP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuPVP_PVP.setText("PVP");
        menuPVP_PVP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPVP_ActionPerformed(evt);
            }
        });
        menuPVP.add(menuPVP_PVP);

        menuBar.add(menuPVP);

        menuProfile.setText("Profile");
        menuProfile.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        menuProfile_profile.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuProfile_profile.setText("Profile");
        menuProfile_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCuenta_ActionPerformed(evt);
            }
        });
        menuProfile.add(menuProfile_profile);

        menuProfile_settings.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuProfile_settings.setText("Settings");
        menuProfile_settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCuenta_ActionPerformed(evt);
            }
        });
        menuProfile.add(menuProfile_settings);

        menuBar.add(menuProfile);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCombate_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCombate_ActionPerformed
        this.getContentPane().removeAll();

        if (evt.getSource() == menuFight_pikachu) {
            Pikachu.definePikachu();
        } else if (evt.getSource() == menuFight_electrode) {
            Electrode.defineElectrode();
        } else if (evt.getSource() == menuFight_hitMonLee) {
            HitMonLee.defineHitMonLee();
        } else if (evt.getSource() == menuFight_gyarados) {
            Gyarados.defineGyarados();
        } else if (evt.getSource() == menuFight_rayquaza) {
            Rayquaza.defineRayquaza();
        } else if (evt.getSource() == menuFight_arceus) {
            Arceus.defineArceus();
        }

        PanelEnemyFight panelCE = new PanelEnemyFight();
        panelCE.setSize(800, 560);
        panelCE.setVisible(false);
        this.add(panelCE);
        panelCE.showPanel(this);
    }//GEN-LAST:event_menuCombate_ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        hideAdvancedMenuItems();
        initializeGlobals();
        clickEspecialSelectionPanel();
    }//GEN-LAST:event_formWindowOpened

    private void hideAdvancedMenuItems() {
        menuManagement_selection.setVisible(false);
        menuFight_gyarados.setVisible(false);
        menuFight_rayquaza.setVisible(false);
        menuFight_arceus.setVisible(false);
    }

    private void initializeGlobals() {
        Globals.teemo = new Teemo(new MathRandomizer());
        Globals.gnar = new Gnar();
        Globals.poppy = new Poppy();
        Globals.yuumi = new Yuumi();
        Globals.letterMainAttackStarter = "A";
        Globals.letterSecondaryAttackStarter = "S";
        Globals.letterEscape = "H";
        
        Globals.teemo2 = new Teemo(new MathRandomizer());
        Globals.gnar2 = new Gnar();
        Globals.poppy2 = new Poppy();
        Globals.yuumi2 = new Yuumi();
        Globals.letterMainAttackStarter2 = "O";
        Globals.letterSecondaryAttackStarter2 = "P";

        Globals.starter = Globals.teemo; //Default
        Globals.starter2 = Globals.teemo2; //Default
        Globals.globalFile = "allFiles.txt";
    }

    private void menuTienda_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTienda_ActionPerformed
        this.getContentPane().removeAll();

        if (evt.getSource() == menuManagement_shop) {
            PanelShop panelS = new PanelShop();
            panelS.setSize(800, 560);
            panelS.setVisible(false);
            this.add(panelS);
            panelS.showPanel();
        } else if (evt.getSource() == menuManagement_information) {
            PanelGeneralInformation panelI = new PanelGeneralInformation();
            panelI.setSize(800, 560);
            panelI.setVisible(false);
            this.add(panelI);
            panelI.showPanel();
        } else if (evt.getSource() == menuManagement_selection) {
            PanelSelectionStarter panelSS = new PanelSelectionStarter();
            panelSS.setSize(800, 560);
            panelSS.setVisible(false);
            this.add(panelSS);
            panelSS.showPanel(StarterSelectionType.NORMAL, this);
        }
    }//GEN-LAST:event_menuTienda_ActionPerformed

    private void menuCuenta_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCuenta_ActionPerformed
        this.getContentPane().removeAll();
        
        if (evt.getSource() == menuProfile_profile) {
            PanelSaveChargeFiles panelGCP = new PanelSaveChargeFiles();
            panelGCP.setSize(800, 560);
            panelGCP.setVisible(false);
            this.add(panelGCP);
            panelGCP.showPanel(this);
        } else if (evt.getSource() == menuProfile_settings) {
            PanelSettings panelC = new PanelSettings();
            panelC.setSize(800, 560);
            panelC.setVisible(false);
            this.add(panelC);
            panelC.showPanel();
        }
    }//GEN-LAST:event_menuCuenta_ActionPerformed

    private void menuPVP_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPVP_ActionPerformed
        this.getContentPane().removeAll();
        
        PanelPVPSelection panelCSP = new PanelPVPSelection();
        panelCSP.setSize(800, 560);
        panelCSP.setVisible(false);
        this.add(panelCSP);
        panelCSP.showPanel(this);
    }//GEN-LAST:event_menuPVP_ActionPerformed

    public JMenuBar obtainMenuBar() {
        return menuBar;
    }

    public void clickEspecialSelectionPanel() {
        PanelSelectionStarter panelSS = new PanelSelectionStarter();
        panelSS.setSize(800, 560);
        panelSS.setVisible(false);
        this.add(panelSS);
        panelSS.showPanel(StarterSelectionType.ESPECIAL, this);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuFight;
    private javax.swing.JMenuItem menuFight_arceus;
    private javax.swing.JMenuItem menuFight_electrode;
    private javax.swing.JMenuItem menuFight_gyarados;
    private javax.swing.JMenuItem menuFight_hitMonLee;
    private javax.swing.JMenuItem menuFight_pikachu;
    private javax.swing.JMenuItem menuFight_rayquaza;
    private javax.swing.JMenu menuManagement;
    private javax.swing.JMenuItem menuManagement_information;
    private javax.swing.JMenuItem menuManagement_selection;
    private javax.swing.JMenuItem menuManagement_shop;
    private javax.swing.JMenu menuPVP;
    private javax.swing.JMenuItem menuPVP_PVP;
    private javax.swing.JMenu menuProfile;
    private javax.swing.JMenuItem menuProfile_profile;
    private javax.swing.JMenuItem menuProfile_settings;
    // End of variables declaration//GEN-END:variables
}
