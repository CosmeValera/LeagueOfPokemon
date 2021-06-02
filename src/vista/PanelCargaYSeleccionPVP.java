package vista;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Ficheros;
import modelo.Global;

public class PanelCargaYSeleccionPVP extends javax.swing.JPanel {

    private GUI GUICallBack;

    public PanelCargaYSeleccionPVP() {
        initComponents();
    }

    void mostrar(GUI GUICallBack) {
        this.GUICallBack = GUICallBack;

        DefaultTableModel tableModel;
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new String[]{
            "Nombre partida"
        });
        tableFicheros1.setModel(tableModel);
        tableFicheros1.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 16));
        tableFicheros2.setModel(tableModel);
        tableFicheros2.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 16));
        tableModel.setRowCount(0);

        List<String> ficherosNombres = new ArrayList<>();
        try {
            Ficheros.listadoPartidas(ficherosNombres);
            for (String p : ficherosNombres) {
                String[] fila = {
                    p.toString()
                };
                tableModel.addRow(fila);
            }
        } catch (Exception e) {
            System.out.println("Error!!\n" + e.getMessage());
            JOptionPane.showMessageDialog(
                    this,
                    "Error!!\n" + e.getMessage(),
                    this.getName(),
                    JOptionPane.ERROR_MESSAGE);
        }

        this.setVisible(true);
        this.requestFocusInWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labCabecera = new javax.swing.JLabel();
        labJugador1 = new javax.swing.JLabel();
        scrollFicheros1 = new javax.swing.JScrollPane();
        tableFicheros1 = new javax.swing.JTable();
        butTeemo1 = new javax.swing.JButton();
        butPoppy1 = new javax.swing.JButton();
        butYuumi1 = new javax.swing.JButton();
        butGnar1 = new javax.swing.JButton();
        labJugador2 = new javax.swing.JLabel();
        scrollFicheros2 = new javax.swing.JScrollPane();
        tableFicheros2 = new javax.swing.JTable();
        butTeemo2 = new javax.swing.JButton();
        butPoppy2 = new javax.swing.JButton();
        butYuumi2 = new javax.swing.JButton();
        butGnar2 = new javax.swing.JButton();
        butCancelar = new javax.swing.JButton();
        butAceptar = new javax.swing.JButton();

        setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        setMaximumSize(new java.awt.Dimension(800, 560));
        setMinimumSize(new java.awt.Dimension(800, 560));

        labCabecera.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labCabecera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCabecera.setText("SELECCIÓN PVP");

        labJugador1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labJugador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labJugador1.setText("Jugador 1");

        tableFicheros1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableFicheros1.setRowHeight(30);
        tableFicheros1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableFicheros1MouseClicked(evt);
            }
        });
        scrollFicheros1.setViewportView(tableFicheros1);

        butTeemo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoGeneral/infoTeemo.png"))); // NOI18N
        butTeemo1.setEnabled(false);
        butTeemo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butStarter1_ActionPerformed(evt);
            }
        });

        butPoppy1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoGeneral/infoPoppy.png"))); // NOI18N
        butPoppy1.setEnabled(false);
        butPoppy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butStarter1_ActionPerformed(evt);
            }
        });

        butYuumi1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoGeneral/infoYuumi.png"))); // NOI18N
        butYuumi1.setEnabled(false);
        butYuumi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butStarter1_ActionPerformed(evt);
            }
        });

        butGnar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoGeneral/infoGnarMini.png"))); // NOI18N
        butGnar1.setEnabled(false);
        butGnar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butStarter1_ActionPerformed(evt);
            }
        });

        labJugador2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labJugador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labJugador2.setText("Jugador 2");

        tableFicheros2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableFicheros2.setRowHeight(30);
        tableFicheros2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableFicheros2MouseClicked(evt);
            }
        });
        scrollFicheros2.setViewportView(tableFicheros2);

        butTeemo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoGeneral/infoTeemo.png"))); // NOI18N
        butTeemo2.setEnabled(false);
        butTeemo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butStarter2_ActionPerformed(evt);
            }
        });

        butPoppy2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoGeneral/infoPoppy.png"))); // NOI18N
        butPoppy2.setEnabled(false);
        butPoppy2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butStarter2_ActionPerformed(evt);
            }
        });

        butYuumi2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoGeneral/infoYuumi.png"))); // NOI18N
        butYuumi2.setEnabled(false);
        butYuumi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butStarter2_ActionPerformed(evt);
            }
        });

        butGnar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoGeneral/infoGnarMini.png"))); // NOI18N
        butGnar2.setEnabled(false);
        butGnar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butStarter2_ActionPerformed(evt);
            }
        });

        butCancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butCancelar.setText("Cancelar");
        butCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCancelarActionPerformed(evt);
            }
        });

        butAceptar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butAceptar.setText("Aceptar");
        butAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labCabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(butCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(butAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butTeemo1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(butPoppy1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(butYuumi1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(butGnar1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(scrollFicheros1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                                .addComponent(labJugador1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labJugador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(scrollFicheros2, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(butTeemo2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(butPoppy2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(butYuumi2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(butGnar2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labJugador1)
                            .addComponent(labJugador2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scrollFicheros2, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(scrollFicheros1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(butGnar1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(butTeemo1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addComponent(butGnar2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(butPoppy2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(butYuumi2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addComponent(butTeemo2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(butPoppy1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(butYuumi1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(77, Short.MAX_VALUE))))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableFicheros1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableFicheros1MouseClicked
        if (!tableFicheros1.isEnabled()) {
            return;
        }
        int num1 = tableFicheros1.getSelectedRow();
        String nombreFichero = String.valueOf(tableFicheros1.getValueAt(num1, 0));
        System.out.println(nombreFichero);
        labJugador1.setText(nombreFichero.substring(0, nombreFichero.length() - 4));

        try {
            Ficheros.cargarDataDatos(nombreFichero, GUICallBack);
            enableStarters1Buttons();
            System.out.println("Se han cargado los ficheros 1");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Error al cargar los ficheros en jugador1",
                    this.getName(),
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_tableFicheros1MouseClicked

    private void tableFicheros2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableFicheros2MouseClicked
        if (!tableFicheros2.isEnabled()) {
            return;
        }
        int num2 = tableFicheros2.getSelectedRow();
        String nombreFichero = String.valueOf(tableFicheros2.getValueAt(num2, 0));
        System.out.println(nombreFichero);
        labJugador2.setText(nombreFichero.substring(0, nombreFichero.length() - 4));

        try {
            Ficheros.cargarDataDatos2(nombreFichero, GUICallBack);
            enableStarters2Buttons();
            System.out.println("Se han cargado los ficheros 2");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Error al cargar los ficheros en jugador2",
                    this.getName(),
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_tableFicheros2MouseClicked

    private void butStarter1_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butStarter1_ActionPerformed
        tableFicheros1.setEnabled(false);
        if (evt.getSource() == butTeemo1) {
            Global.starter = Global.teemo;
            System.out.println("Global.starter = Global.teemo;");
        } else if (evt.getSource() == butPoppy1) {
            Global.starter = Global.poppy;
            System.out.println("Global.starter = Global.poppy;");
        } else if (evt.getSource() == butYuumi1) {
            Global.starter = Global.yuumi;
            System.out.println("Global.starter = Global.yuumi;");
        } else if (evt.getSource() == butGnar1) {
            Global.starter = Global.gnar;
            System.out.println("Global.starter = Global.gnar;");
        }
    }//GEN-LAST:event_butStarter1_ActionPerformed

    private void butStarter2_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butStarter2_ActionPerformed
        tableFicheros2.setEnabled(false);
        if (evt.getSource() == butTeemo2) {
            Global.starter2 = Global.teemo2;
            System.out.println("Global.starter2 = Global.teemo2;");
        } else if (evt.getSource() == butPoppy2) {
            Global.starter2 = Global.poppy2;
            System.out.println("Global.starter2 = Global.poppy2;");
        } else if (evt.getSource() == butYuumi2) {
            Global.starter2 = Global.yuumi2;
            System.out.println("Global.starter2 = Global.yuumi2;");
        } else if (evt.getSource() == butGnar2) {
            Global.starter2 = Global.gnar2;
            System.out.println("Global.starter2 = Global.gnar2;");
        }
    }//GEN-LAST:event_butStarter2_ActionPerformed

    private void butCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelarActionPerformed
        this.setVisible(false);
        this.getRootPane().getContentPane().remove(this);
    }//GEN-LAST:event_butCancelarActionPerformed

    private void butAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAceptarActionPerformed
        this.setVisible(false);
        this.getRootPane().getContentPane().remove(this);
        
        PanelPVPCombate panelPVPC = new PanelPVPCombate();
        panelPVPC.setSize(800,560);
        panelPVPC.setVisible(false);
        GUICallBack.add(panelPVPC);
        panelPVPC.mostrar();
    }//GEN-LAST:event_butAceptarActionPerformed

    public void enableStarters1Buttons() {
        if (Global.starter.isTeemoDisponible()) {
            butTeemo1.setEnabled(true);
        } else {
            butTeemo1.setEnabled(false);
        }
        if (Global.starter.isPoppyDisponible()) {
            butPoppy1.setEnabled(true);
        } else {
            butPoppy1.setEnabled(false);
        }
        if (Global.starter.isGnarDisponible()) {
            butGnar1.setEnabled(true);
        } else {
            butGnar1.setEnabled(false);
        }
        if (Global.starter.isYuumiDisponible()) {
            butYuumi1.setEnabled(true);
        } else {
            butYuumi1.setEnabled(false);
        }
    }

    public void enableStarters2Buttons() {
        if (Global.starter2.isTeemoDisponible()) {
            butTeemo2.setEnabled(true);
        } else {
            butTeemo2.setEnabled(false);
        }
        if (Global.starter2.isPoppyDisponible()) {
            butPoppy2.setEnabled(true);
        } else {
            butPoppy2.setEnabled(false);
        }
        if (Global.starter2.isGnarDisponible()) {
            butGnar2.setEnabled(true);
        } else {
            butGnar2.setEnabled(false);
        }
        if (Global.starter2.isYuumiDisponible()) {
            butYuumi2.setEnabled(true);
        } else {
            butYuumi2.setEnabled(false);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAceptar;
    private javax.swing.JButton butCancelar;
    private javax.swing.JButton butGnar1;
    private javax.swing.JButton butGnar2;
    private javax.swing.JButton butPoppy1;
    private javax.swing.JButton butPoppy2;
    private javax.swing.JButton butTeemo1;
    private javax.swing.JButton butTeemo2;
    private javax.swing.JButton butYuumi1;
    private javax.swing.JButton butYuumi2;
    private javax.swing.JLabel labCabecera;
    private javax.swing.JLabel labJugador1;
    private javax.swing.JLabel labJugador2;
    private javax.swing.JScrollPane scrollFicheros1;
    private javax.swing.JScrollPane scrollFicheros2;
    private javax.swing.JTable tableFicheros1;
    private javax.swing.JTable tableFicheros2;
    // End of variables declaration//GEN-END:variables

}
