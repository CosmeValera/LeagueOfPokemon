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
        menuCuenta = new javax.swing.JMenu();
        menuCuenta_Cuenta = new javax.swing.JMenuItem();

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

        menuCombate_pikachu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuCombate_pikachu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuCombate_pikachu.setText("Pikachu");
        menuCombate_pikachu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCombate_ActionPerformed(evt);
            }
        });
        menuCombate.add(menuCombate_pikachu);

        menuCombate_electrode.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuCombate_electrode.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuCombate_electrode.setText("Electrode");
        menuCombate_electrode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCombate_ActionPerformed(evt);
            }
        });
        menuCombate.add(menuCombate_electrode);

        menuCombate_hitMonLee.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuCombate_hitMonLee.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuCombate_hitMonLee.setText("HitMonLee");
        menuCombate_hitMonLee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCombate_ActionPerformed(evt);
            }
        });
        menuCombate.add(menuCombate_hitMonLee);

        menuCombate_gyarados.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuCombate_gyarados.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuCombate_gyarados.setText("Gyarados");
        menuCombate_gyarados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCombate_ActionPerformed(evt);
            }
        });
        menuCombate.add(menuCombate_gyarados);

        menuCombate_rayquaza.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuCombate_rayquaza.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuCombate_rayquaza.setText("Rayquaza");
        menuCombate_rayquaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCombate_ActionPerformed(evt);
            }
        });
        menuCombate.add(menuCombate_rayquaza);

        menuCombate_arceus.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
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

        menuGestion_Tienda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuGestion_Tienda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuGestion_Tienda.setText("Tienda");
        menuGestion_Tienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTienda_ActionPerformed(evt);
            }
        });
        menuGestion.add(menuGestion_Tienda);

        menuGestion_Informacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuGestion_Informacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuGestion_Informacion.setText("Información");
        menuGestion_Informacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTienda_ActionPerformed(evt);
            }
        });
        menuGestion.add(menuGestion_Informacion);

        menuGestion_Seleccionar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuGestion_Seleccionar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuGestion_Seleccionar.setText("Seleccionar");
        menuGestion_Seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTienda_ActionPerformed(evt);
            }
        });
        menuGestion.add(menuGestion_Seleccionar);

        barraMenu.add(menuGestion);

        menuCuenta.setText("Cuenta");
        menuCuenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        menuCuenta_Cuenta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuCuenta_Cuenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuCuenta_Cuenta.setText("Cuenta");
        menuCuenta_Cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCuenta_ActionPerformed(evt);
            }
        });
        menuCuenta.add(menuCuenta_Cuenta);

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
            Pikachu.definirPikachuEnemigo();
        } else if (evt.getSource() == menuCombate_electrode) {
            Electrode.definirElectrodeEnemigo();
        } else if (evt.getSource() == menuCombate_hitMonLee) {
            HitMonLee.definirHitMonLeeEnemigo();
        } else if (evt.getSource() == menuCombate_gyarados) {
            Gyarados.definirGyaradosEnemigo();
        } else if (evt.getSource() == menuCombate_rayquaza) {
            Rayquaza.definirRayquazaEnemigo();
        } else if (evt.getSource() == menuCombate_arceus) {
            Arceus.definirArceusEnemigo();
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
        Global.teemo = new Teemo();
        Global.gnar = new Gnar();
        Global.poppy = new Poppy();
        Global.yuumi = new Yuumi();

        Global.starter = Global.teemo; //Por defecto
        Global.ficheroGlobal = "todosLosFicheros.txt";
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
        
        PanelGuardarYCargarPartidas panelGCP = new PanelGuardarYCargarPartidas();
        panelGCP.setSize(800, 560);
        panelGCP.setVisible(false);
        this.add(panelGCP);
        panelGCP.mostrar(this);
    }//GEN-LAST:event_menuCuenta_ActionPerformed

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
    private javax.swing.JMenuItem menuCuenta_Cuenta;
    private javax.swing.JMenu menuGestion;
    private javax.swing.JMenuItem menuGestion_Informacion;
    private javax.swing.JMenuItem menuGestion_Seleccionar;
    private javax.swing.JMenuItem menuGestion_Tienda;
    // End of variables declaration//GEN-END:variables
}
