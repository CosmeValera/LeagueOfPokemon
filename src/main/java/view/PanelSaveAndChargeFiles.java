package view;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Files4Saving;
import model.Globals;
import model.starters.Starter;

public class PanelSaveAndChargeFiles extends javax.swing.JPanel {

    public static GUI GUICallBack;

    public PanelSaveAndChargeFiles() {
        initComponents();
    }

    void showPanel(GUI gui) {
        GUICallBack = gui;

        DefaultTableModel tableModel;
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new String[]{
            "Game's name"
        });
        tableFiles.setModel(tableModel);
        tableFiles.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 16));
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
        scrollFiles = new javax.swing.JScrollPane();
        tableFiles = new javax.swing.JTable();
        butCharge = new javax.swing.JButton();
        butSave = new javax.swing.JButton();
        butRemove = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(800, 560));
        setMinimumSize(new java.awt.Dimension(800, 560));
        setPreferredSize(new java.awt.Dimension(800, 560));

        labTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitle.setText("Account");

        tableFiles.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableFiles.setRowHeight(30);
        tableFiles.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableFiles.setShowGrid(false);
        scrollFiles.setViewportView(tableFiles);

        butCharge.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butCharge.setText("Charge");
        butCharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butChargeActionPerformed(evt);
            }
        });

        butSave.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butSave.setText("Save");
        butSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSaveActionPerformed(evt);
            }
        });

        butRemove.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butRemove.setText("Remove");
        butRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butRemoveActionPerformed(evt);
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
                        .addComponent(scrollFiles, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(butCharge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butRemove, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollFiles, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butCharge, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(butSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void butChargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butChargeActionPerformed
        String nombreFichero;
        try {
            nombreFichero = (String) tableFiles.getValueAt(tableFiles.getSelectedRow(), tableFiles.getSelectedColumn());
            Files4Saving.chargeData(nombreFichero, GUICallBack);
            decidirMenuItemsMostrar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Choose a file to charge!!",
                    this.getName(),
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_butChargeActionPerformed

    private void decidirMenuItemsMostrar() {
        //Hide all menuItems
        GUICallBack.getJMenuBar().getMenu(1).getItem(2).setVisible(false);
        GUICallBack.getJMenuBar().getMenu(0).getItem(3).setVisible(false);
        GUICallBack.getJMenuBar().getMenu(0).getItem(4).setVisible(false);
        GUICallBack.getJMenuBar().getMenu(0).getItem(5).setVisible(false);

        //Regarding defeatedEnemies show panelSelection, gyarados, rayquaza and Arceus
        if (Globals.starter.getDefeatedEnemies() >= Starter.getVictoriesForFirstReward()) {
            GUICallBack.getJMenuBar().getMenu(1).getItem(2).setVisible(true); //Visible panelSelection
            GUICallBack.getJMenuBar().getMenu(0).getItem(3).setVisible(true); //Visible Gyarados
            if (Globals.starter.getDefeatedEnemies() >= Starter.getVictoriesForSecondReward()) {
                GUICallBack.getJMenuBar().getMenu(0).getItem(4).setVisible(true); //Visible RayQuaza
                if (Globals.starter.getDefeatedEnemies() >= Starter.getVictoriesForThirdReward()) {
                    GUICallBack.getJMenuBar().getMenu(0).getItem(5).setVisible(true); //Visible Arceus
                }
            }
            GUICallBack.getJMenuBar().getMenu(1).getItem(2).doClick(); //Click panelSelection if 2 or +2 starters
        }
    }

    private void butSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSaveActionPerformed
        String filename;
        boolean ok = false;

        try { //Override
            filename = (String) tableFiles.getValueAt(tableFiles.getSelectedRow(), tableFiles.getSelectedColumn());
            int answer = JOptionPane.showConfirmDialog(
                    this,
                    "You are going to overwrite the information in " + filename + ". Are you sure?",
                    this.getName(),
                    JOptionPane.YES_NO_OPTION);
            if (answer == JOptionPane.YES_OPTION) {
                ok = true;
            }
        } catch (ArrayIndexOutOfBoundsException e) { //Create new file
            filename = JOptionPane.showInputDialog(
                    this,
                    "Insert filename: ",
                    this.getName(),
                    JOptionPane.QUESTION_MESSAGE);
            filename += ".txt";
            if (!filename.equals(".txt") && !filename.equals("null.txt")) {
                ok = true;
            }
        }

        try {
            if (ok) {
                Files4Saving.saveData(filename);
            }
        } catch (Exception e) {
            System.out.println("Error in Files4Saving.saveData\n" + e.getMessage());
        }

        this.setVisible(false);
        this.getRootPane().getContentPane().remove(this);

        GUICallBack.getJMenuBar().getMenu(3).getItem(0).doClick();
    }//GEN-LAST:event_butSaveActionPerformed

    private void butRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butRemoveActionPerformed
        String filename;
        try {
            filename = (String) tableFiles.getValueAt(tableFiles.getSelectedRow(), tableFiles.getSelectedColumn());
            int answer = JOptionPane.showConfirmDialog(
                    this,
                    "You are going to remove " + filename + ". Are you sure?",
                    this.getName(),
                    JOptionPane.YES_NO_OPTION);
            if (answer == JOptionPane.YES_OPTION) {
                Files4Saving.removeFilename(filename);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Choose a file to remove",
                    this.getName(),
                    JOptionPane.QUESTION_MESSAGE);
        } catch (Exception e) {
        }

        GUICallBack.getJMenuBar().getMenu(3).getItem(0).doClick();
    }//GEN-LAST:event_butRemoveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butCharge;
    private javax.swing.JButton butRemove;
    private javax.swing.JButton butSave;
    private javax.swing.JLabel labTitle;
    private javax.swing.JScrollPane scrollFiles;
    private javax.swing.JTable tableFiles;
    // End of variables declaration//GEN-END:variables

}
