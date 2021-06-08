package view;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Files4Saving;
import model.Globals;

public class PanelPVPSelection extends javax.swing.JPanel {

    private GUI GUICallBack;
    private String nameFirstPlayer;
    private String nameSecondPlayer;

    public PanelPVPSelection() {
        initComponents();
    }

    public void showPanel(GUI GUICallBack) {
        this.GUICallBack = GUICallBack;

        DefaultTableModel tableModel;
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new String[]{
            "Game's name:"
        });
        tableFiles1.setModel(tableModel);
        tableFiles1.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 16));
        tableFiles2.setModel(tableModel);
        tableFiles2.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 16));
        tableModel.setRowCount(0);

        List<String> filenames = new ArrayList<>();
        try {
            Files4Saving.getFiles(filenames);
            for (String row : filenames) {
                String[] fila = {
                    row
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

        labTitle = new javax.swing.JLabel();
        labPlayer1 = new javax.swing.JLabel();
        scrollFiles1 = new javax.swing.JScrollPane();
        tableFiles1 = new javax.swing.JTable();
        butTeemo1 = new javax.swing.JButton();
        butPoppy1 = new javax.swing.JButton();
        butYuumi1 = new javax.swing.JButton();
        butGnar1 = new javax.swing.JButton();
        labPlayer2 = new javax.swing.JLabel();
        scrollFiles2 = new javax.swing.JScrollPane();
        tableFiles2 = new javax.swing.JTable();
        butTeemo2 = new javax.swing.JButton();
        butPoppy2 = new javax.swing.JButton();
        butYuumi2 = new javax.swing.JButton();
        butGnar2 = new javax.swing.JButton();
        butCancel = new javax.swing.JButton();
        butAccept = new javax.swing.JButton();

        setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        setMaximumSize(new java.awt.Dimension(800, 560));
        setMinimumSize(new java.awt.Dimension(800, 560));

        labTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitle.setText("PVP SELECTION");

        labPlayer1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labPlayer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labPlayer1.setText("Player 1");

        tableFiles1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableFiles1.setRowHeight(30);
        tableFiles1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableFiles1MouseClicked(evt);
            }
        });
        scrollFiles1.setViewportView(tableFiles1);

        butTeemo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoTeemo.png"))); // NOI18N
        butTeemo1.setEnabled(false);
        butTeemo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butStarter1_ActionPerformed(evt);
            }
        });

        butPoppy1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoPoppy.png"))); // NOI18N
        butPoppy1.setEnabled(false);
        butPoppy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butStarter1_ActionPerformed(evt);
            }
        });

        butYuumi1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoYuumi.png"))); // NOI18N
        butYuumi1.setEnabled(false);
        butYuumi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butStarter1_ActionPerformed(evt);
            }
        });

        butGnar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoGnarMini.png"))); // NOI18N
        butGnar1.setEnabled(false);
        butGnar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butStarter1_ActionPerformed(evt);
            }
        });

        labPlayer2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labPlayer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labPlayer2.setText("Player 2");

        tableFiles2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableFiles2.setRowHeight(30);
        tableFiles2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableFiles2MouseClicked(evt);
            }
        });
        scrollFiles2.setViewportView(tableFiles2);

        butTeemo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoTeemo.png"))); // NOI18N
        butTeemo2.setEnabled(false);
        butTeemo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butStarter2_ActionPerformed(evt);
            }
        });

        butPoppy2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoPoppy.png"))); // NOI18N
        butPoppy2.setEnabled(false);
        butPoppy2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butStarter2_ActionPerformed(evt);
            }
        });

        butYuumi2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoYuumi.png"))); // NOI18N
        butYuumi2.setEnabled(false);
        butYuumi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butStarter2_ActionPerformed(evt);
            }
        });

        butGnar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalInfo/infoGnarMini.png"))); // NOI18N
        butGnar2.setEnabled(false);
        butGnar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butStarter2_ActionPerformed(evt);
            }
        });

        butCancel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butCancel.setText("Cancel");
        butCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCancelActionPerformed(evt);
            }
        });

        butAccept.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butAccept.setText("Accept");
        butAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAcceptActionPerformed(evt);
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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(butCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(butAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(scrollFiles1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                                .addComponent(labPlayer1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labPlayer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(scrollFiles2, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
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
                            .addComponent(butAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labPlayer1)
                            .addComponent(labPlayer2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scrollFiles2, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(scrollFiles1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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

    private void tableFiles1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableFiles1MouseClicked
        if (!tableFiles1.isEnabled()) {
            return;
        }
        int num1 = tableFiles1.getSelectedRow();
        String filename = String.valueOf(tableFiles1.getValueAt(num1, 0));
        System.out.println(filename);
        nameFirstPlayer = filename.substring(0, filename.length() - 4);
        labPlayer1.setText(nameFirstPlayer);
        try {
            Files4Saving.chargeData(filename, GUICallBack);
            enableStarters1Buttons();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Error charging files for player1",
                    this.getName(),
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_tableFiles1MouseClicked

    private void tableFiles2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableFiles2MouseClicked
        if (!tableFiles2.isEnabled()) {
            return;
        }
        int num2 = tableFiles2.getSelectedRow();
        String filename = String.valueOf(tableFiles2.getValueAt(num2, 0));
        System.out.println(filename);
        nameSecondPlayer = filename.substring(0, filename.length() - 4);
        labPlayer2.setText(nameSecondPlayer);
        try {
            Files4Saving.chargeData2(filename, GUICallBack);
            enableStarters2Buttons();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Error charging files for player2",
                    this.getName(),
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_tableFiles2MouseClicked

    private void butStarter1_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butStarter1_ActionPerformed
        tableFiles1.setEnabled(false);
        if (evt.getSource() == butTeemo1) {
            Globals.starter = Globals.teemo;
        } else if (evt.getSource() == butPoppy1) {
            Globals.starter = Globals.poppy;
        } else if (evt.getSource() == butYuumi1) {
            Globals.starter = Globals.yuumi;
        } else if (evt.getSource() == butGnar1) {
            Globals.starter = Globals.gnar;
        }
    }//GEN-LAST:event_butStarter1_ActionPerformed

    private void butStarter2_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butStarter2_ActionPerformed
        tableFiles2.setEnabled(false);
        if (evt.getSource() == butTeemo2) {
            Globals.starter2 = Globals.teemo2;
        } else if (evt.getSource() == butPoppy2) {
            Globals.starter2 = Globals.poppy2;
        } else if (evt.getSource() == butYuumi2) {
            Globals.starter2 = Globals.yuumi2;
        } else if (evt.getSource() == butGnar2) {
            Globals.starter2 = Globals.gnar2;
        }
    }//GEN-LAST:event_butStarter2_ActionPerformed

    private void butCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelActionPerformed
        this.setVisible(false);
        this.getRootPane().getContentPane().remove(this);
    }//GEN-LAST:event_butCancelActionPerformed

    private void butAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAcceptActionPerformed
        this.setVisible(false);

        PanelPVPFight panelPVPF = new PanelPVPFight();
        panelPVPF.setSize(800, 560);
        panelPVPF.setVisible(false);
        GUICallBack.add(panelPVPF);
        panelPVPF.mostrar(this, nameFirstPlayer, nameSecondPlayer);
    }//GEN-LAST:event_butAcceptActionPerformed

    private void enableStarters1Buttons() {
        butTeemo1.setEnabled(false);
        butPoppy1.setEnabled(false);
        butGnar1.setEnabled(false);
        butYuumi1.setEnabled(false);
        if (Globals.starter.isTeemoAvailable()) {
            butTeemo1.setEnabled(true);
        }
        if (Globals.starter.isPoppyAvailable()) {
            butPoppy1.setEnabled(true);
        }
        if (Globals.starter.isGnarAvailable()) {
            butGnar1.setEnabled(true);
        }
        if (Globals.starter.isYuumiAvailable()) {
            butYuumi1.setEnabled(true);
        }
    }

    private void enableStarters2Buttons() {
        butTeemo2.setEnabled(false);
        butPoppy2.setEnabled(false);
        butGnar2.setEnabled(false);
        butYuumi2.setEnabled(false);
        if (Globals.starter2.isTeemoAvailable()) {
            butTeemo2.setEnabled(true);
        }
        if (Globals.starter2.isPoppyAvailable()) {
            butPoppy2.setEnabled(true);
        }
        if (Globals.starter2.isGnarAvailable()) {
            butGnar2.setEnabled(true);
        }
        if (Globals.starter2.isYuumiAvailable()) {
            butYuumi2.setEnabled(true);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAccept;
    private javax.swing.JButton butCancel;
    private javax.swing.JButton butGnar1;
    private javax.swing.JButton butGnar2;
    private javax.swing.JButton butPoppy1;
    private javax.swing.JButton butPoppy2;
    private javax.swing.JButton butTeemo1;
    private javax.swing.JButton butTeemo2;
    private javax.swing.JButton butYuumi1;
    private javax.swing.JButton butYuumi2;
    private javax.swing.JLabel labPlayer1;
    private javax.swing.JLabel labPlayer2;
    private javax.swing.JLabel labTitle;
    private javax.swing.JScrollPane scrollFiles1;
    private javax.swing.JScrollPane scrollFiles2;
    private javax.swing.JTable tableFiles1;
    private javax.swing.JTable tableFiles2;
    // End of variables declaration//GEN-END:variables

}
