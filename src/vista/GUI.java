package vista;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import modelo.*;

public class GUI extends javax.swing.JFrame {

    public static enum SeleccionStarter {
        NORMAL, ESPECIAL
    };

    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraMenu = new javax.swing.JMenuBar();
        menuCombate = new javax.swing.JMenu();
        menuCombate_pikachu = new javax.swing.JMenuItem();
        menuCombate_electrode = new javax.swing.JMenuItem();
        menuCombate_hitMonLee = new javax.swing.JMenuItem();
        menuCombate_gyarados = new javax.swing.JMenuItem();
        menuCombate_rayquaza = new javax.swing.JMenuItem();
        menuCombate_arceus = new javax.swing.JMenuItem();
        menuGestion = new javax.swing.JMenu();
        menuGestion_Tienda = new javax.swing.JMenuItem();
        menuGestion_Informacion = new javax.swing.JMenuItem();
        menuGestion_Seleccionar = new javax.swing.JMenuItem();
        menuPVP = new javax.swing.JMenu();
        menuPVP_PVP = new javax.swing.JMenuItem();
        menuCuenta = new javax.swing.JMenu();
        menuCuenta_Cuenta = new javax.swing.JMenuItem();
        menuCuenta_Configuracion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        barraMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        menuCombate.setText("Combate");
        menuCombate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        menuCombate_pikachu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuCombate_pikachu.setText("Pikachu");
        menuCombate_pikachu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCombate_ActionPerformed(evt);
            }
        });
        menuCombate.add(menuCombate_pikachu);

        menuCombate_electrode.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuCombate_electrode.setText("Electrode");
        menuCombate_electrode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCombate_ActionPerformed(evt);
            }
        });
        menuCombate.add(menuCombate_electrode);

        menuCombate_hitMonLee.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuCombate_hitMonLee.setText("HitMonLee");
        menuCombate_hitMonLee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCombate_ActionPerformed(evt);
            }
        });
        menuCombate.add(menuCombate_hitMonLee);

        menuCombate_gyarados.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuCombate_gyarados.setText("Gyarados");
        menuCombate_gyarados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCombate_ActionPerformed(evt);
            }
        });
        menuCombate.add(menuCombate_gyarados);

        menuCombate_rayquaza.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuCombate_rayquaza.setText("Rayquaza");
        menuCombate_rayquaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCombate_ActionPerformed(evt);
            }
        });
        menuCombate.add(menuCombate_rayquaza);

        menuCombate_arceus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuCombate_arceus.setText("Arceus");
        menuCombate_arceus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCombate_ActionPerformed(evt);
            }
        });
        menuCombate.add(menuCombate_arceus);

        barraMenu.add(menuCombate);

        menuGestion.setText("Gestión");
        menuGestion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        menuGestion_Tienda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuGestion_Tienda.setText("Tienda");
        menuGestion_Tienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTienda_ActionPerformed(evt);
            }
        });
        menuGestion.add(menuGestion_Tienda);

        menuGestion_Informacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuGestion_Informacion.setText("Información");
        menuGestion_Informacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTienda_ActionPerformed(evt);
            }
        });
        menuGestion.add(menuGestion_Informacion);

        menuGestion_Seleccionar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuGestion_Seleccionar.setText("Seleccionar");
        menuGestion_Seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTienda_ActionPerformed(evt);
            }
        });
        menuGestion.add(menuGestion_Seleccionar);

        barraMenu.add(menuGestion);

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

        barraMenu.add(menuPVP);

        menuCuenta.setText("Cuenta");
        menuCuenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        menuCuenta_Cuenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuCuenta_Cuenta.setText("Cuenta");
        menuCuenta_Cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCuenta_ActionPerformed(evt);
            }
        });
        menuCuenta.add(menuCuenta_Cuenta);

        menuCuenta_Configuracion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuCuenta_Configuracion.setText("Configuración");
        menuCuenta_Configuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCuenta_ActionPerformed(evt);
            }
        });
        menuCuenta.add(menuCuenta_Configuracion);

        barraMenu.add(menuCuenta);

        setJMenuBar(barraMenu);

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

        if (evt.getSource() == menuCombate_pikachu) {
            Pikachu.definePikachu();
        } else if (evt.getSource() == menuCombate_electrode) {
            Electrode.defineElectrode();
        } else if (evt.getSource() == menuCombate_hitMonLee) {
            HitMonLee.defineHitMonLee();
        } else if (evt.getSource() == menuCombate_gyarados) {
            Gyarados.defineGyarados();
        } else if (evt.getSource() == menuCombate_rayquaza) {
            Rayquaza.defineRayquaza();
        } else if (evt.getSource() == menuCombate_arceus) {
            Arceus.defineArceus();
        }

        PanelCombateEnemigo panelCE = new PanelCombateEnemigo();
        panelCE.setSize(800, 560);
        panelCE.setVisible(false);
        this.add(panelCE);
        panelCE.mostrar(this);
    }//GEN-LAST:event_menuCombate_ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ocultarMenuItemsAvanzados();
        inicializarGlobales();
        clickCambiarEspecial();
        
    }//GEN-LAST:event_formWindowOpened

    private void ocultarMenuItemsAvanzados() {
        menuGestion_Seleccionar.setVisible(false);
        menuCombate_gyarados.setVisible(false);
        menuCombate_rayquaza.setVisible(false);
        menuCombate_arceus.setVisible(false);
    }

    private void inicializarGlobales() {
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

        Globals.starter = Globals.teemo; //Por defecto
        Globals.starter2 = Globals.teemo2; //Por defecto
        Globals.globalFile = "todosLosFicheros.txt";
    }

    private void menuTienda_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTienda_ActionPerformed
        this.getContentPane().removeAll();

        if (evt.getSource() == menuGestion_Tienda) {
            PanelTienda panelT = new PanelTienda();
            panelT.setSize(800, 560);
            panelT.setVisible(false);
            this.add(panelT);
            panelT.mostrar();
        } else if (evt.getSource() == menuGestion_Informacion) {
            PanelInformacion panelI = new PanelInformacion();
            panelI.setSize(800, 560);
            panelI.setVisible(false);
            this.add(panelI);
            panelI.mostrar();
        } else if (evt.getSource() == menuGestion_Seleccionar) {
            PanelSeleccionStarter panelSS = new PanelSeleccionStarter();
            panelSS.setSize(800, 560);
            panelSS.setVisible(false);
            this.add(panelSS);
            panelSS.mostrar(SeleccionStarter.NORMAL, this);
        }
    }//GEN-LAST:event_menuTienda_ActionPerformed

    private void menuCuenta_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCuenta_ActionPerformed
        this.getContentPane().removeAll();
        
        if (evt.getSource() == menuCuenta_Cuenta) {
            PanelGuardarYCargarPartidas panelGCP = new PanelGuardarYCargarPartidas();
            panelGCP.setSize(800, 560);
            panelGCP.setVisible(false);
            this.add(panelGCP);
            panelGCP.mostrar(this);
        } else if (evt.getSource() == menuCuenta_Configuracion) {
            PanelConfiguracion panelC = new PanelConfiguracion();
            panelC.setSize(800, 560);
            panelC.setVisible(false);
            this.add(panelC);
            panelC.mostrar();
        }
    }//GEN-LAST:event_menuCuenta_ActionPerformed

    private void menuPVP_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPVP_ActionPerformed
        this.getContentPane().removeAll();
        
        PanelCargaYSeleccionPVP panelCSP = new PanelCargaYSeleccionPVP();
        panelCSP.setSize(800, 560);
        panelCSP.setVisible(false);
        this.add(panelCSP);
        panelCSP.mostrar(this);
    }//GEN-LAST:event_menuPVP_ActionPerformed

    public JMenuItem obtenerMenuGestionCambiar() {
        return menuGestion_Seleccionar;
    }

    public JMenuBar obtenerBarraMenu() {
        return barraMenu;
    }

    public void clickCambiarEspecial() {
        PanelSeleccionStarter panelSS = new PanelSeleccionStarter();
        panelSS.setSize(800, 560);
        panelSS.setVisible(false);
        this.add(panelSS);
        panelSS.mostrar(SeleccionStarter.ESPECIAL, this);
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
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenu menuCombate;
    private javax.swing.JMenuItem menuCombate_arceus;
    private javax.swing.JMenuItem menuCombate_electrode;
    private javax.swing.JMenuItem menuCombate_gyarados;
    private javax.swing.JMenuItem menuCombate_hitMonLee;
    private javax.swing.JMenuItem menuCombate_pikachu;
    private javax.swing.JMenuItem menuCombate_rayquaza;
    private javax.swing.JMenu menuCuenta;
    private javax.swing.JMenuItem menuCuenta_Configuracion;
    private javax.swing.JMenuItem menuCuenta_Cuenta;
    private javax.swing.JMenu menuGestion;
    private javax.swing.JMenuItem menuGestion_Informacion;
    private javax.swing.JMenuItem menuGestion_Seleccionar;
    private javax.swing.JMenuItem menuGestion_Tienda;
    private javax.swing.JMenu menuPVP;
    private javax.swing.JMenuItem menuPVP_PVP;
    // End of variables declaration//GEN-END:variables
}
