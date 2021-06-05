package vista;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Files4Saving;
import modelo.Globals;
import modelo.Starter;

public class PanelGuardarYCargarPartidas extends javax.swing.JPanel {

    public static GUI GUICallBack;

    public PanelGuardarYCargarPartidas() {
        initComponents();
    }

    void mostrar(GUI gui) {
        GUICallBack = gui;

        DefaultTableModel tableModel;
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new String[]{
            "Nombre partida"
        });
        tablePartidas.setModel(tableModel);
        tablePartidas.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 16));
        tableModel.setRowCount(0);

        List<String> ficherosNombres = new ArrayList<>();
        try {
            Files4Saving.getFiles(ficherosNombres);
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
        scrollPartidas = new javax.swing.JScrollPane();
        tablePartidas = new javax.swing.JTable();
        butCargar = new javax.swing.JButton();
        butGuardar = new javax.swing.JButton();
        butBorrar = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(800, 560));
        setMinimumSize(new java.awt.Dimension(800, 560));
        setPreferredSize(new java.awt.Dimension(800, 560));

        labCabecera.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labCabecera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCabecera.setText("CUENTA");

        tablePartidas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tablePartidas.setRowHeight(30);
        tablePartidas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablePartidas.setShowGrid(false);
        scrollPartidas.setViewportView(tablePartidas);

        butCargar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butCargar.setText("Cargar");
        butCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCargarActionPerformed(evt);
            }
        });

        butGuardar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butGuardar.setText("Guardar");
        butGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butGuardarActionPerformed(evt);
            }
        });

        butBorrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butBorrar.setText("Borrar");
        butBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butBorrarActionPerformed(evt);
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrollPartidas, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(butCargar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butBorrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPartidas, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(butGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void butCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCargarActionPerformed
        String nombreFichero;
        try {
            nombreFichero = (String) tablePartidas.getValueAt(tablePartidas.getSelectedRow(), tablePartidas.getSelectedColumn());
            Files4Saving.chargeData(nombreFichero, GUICallBack);

            decidirMenuItemsMostrar();
            System.out.println("Fichero cargado correctamente");
        } catch (Exception e) {
            System.out.println("Error en cargarFicheros\n" + e.getMessage());
            JOptionPane.showMessageDialog(
                    this,
                    "Selecciona algún fichero para cargar",
                    this.getName(),
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_butCargarActionPerformed

    private void decidirMenuItemsMostrar() {
        //Esconder todos los menus primero
        GUICallBack.getJMenuBar().getMenu(1).getItem(2).setVisible(false);
        GUICallBack.getJMenuBar().getMenu(0).getItem(3).setVisible(false);
        GUICallBack.getJMenuBar().getMenu(0).getItem(4).setVisible(false);
        GUICallBack.getJMenuBar().getMenu(0).getItem(5).setVisible(false);

        //En funcion de los enemigosVencidos, mostrar unas cosas u otras
        if (Globals.starter.getDefeatedEnemies() >= Starter.getVictoriesForFirstPrize()) {
            GUICallBack.getJMenuBar().getMenu(1).getItem(2).setVisible(true); //Visible panelCambiar
            GUICallBack.getJMenuBar().getMenu(0).getItem(3).setVisible(true); //Visible Gyarados
            if (Globals.starter.getDefeatedEnemies() >= Starter.getVictoriesForSecondPrize()) {
                GUICallBack.getJMenuBar().getMenu(0).getItem(4).setVisible(true); //Visible RayQuaza
                if (Globals.starter.getDefeatedEnemies() >= Starter.getVictoriesForThirdPrize()) {
                    GUICallBack.getJMenuBar().getMenu(0).getItem(5).setVisible(true); //Visible Arceus
                }
            }
            GUICallBack.getJMenuBar().getMenu(1).getItem(2).doClick(); //Mostrar panel si hay + de 1 starter
        }
    }

    private void butGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butGuardarActionPerformed
        String nombreFichero;
        boolean ok = false;

        try { //Sobreescribir
            nombreFichero = (String) tablePartidas.getValueAt(tablePartidas.getSelectedRow(), tablePartidas.getSelectedColumn());
            int respuesta = JOptionPane.showConfirmDialog(
                    this,
                    "Vas a sobreescribir el fichero " + nombreFichero,
                    this.getName(),
                    JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                ok = true;
            }
        } catch (ArrayIndexOutOfBoundsException e) { //Crear nuevo fichero
            nombreFichero = JOptionPane.showInputDialog(
                    this,
                    "Introduce el nombre del fichero",
                    this.getName(),
                    JOptionPane.QUESTION_MESSAGE);
            nombreFichero += ".txt";
            if (!nombreFichero.equals(".txt") && !nombreFichero.equals("null.txt")) {
                ok = true;
            }
        }

        try {
            if (ok) {
                Files4Saving.saveData(nombreFichero);
                System.out.println("Fichero guardado correctamente");
            }
        } catch (Exception e) {
            System.out.println("Error en guardarFicheros\n" + e.getMessage());
        }

        this.setVisible(false);
        this.getRootPane().getContentPane().remove(this);

        GUICallBack.getJMenuBar().getMenu(3).getItem(0).doClick();
    }//GEN-LAST:event_butGuardarActionPerformed

    private void butBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butBorrarActionPerformed
        String nombreFichero;
        try {
            nombreFichero = (String) tablePartidas.getValueAt(tablePartidas.getSelectedRow(), tablePartidas.getSelectedColumn());
            int respuesta = JOptionPane.showConfirmDialog(
                    this,
                    "Vas a borrar el fichero " + nombreFichero + ". Estás seguro?",
                    this.getName(),
                    JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                Files4Saving.removeFilename(nombreFichero);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Selecciona algún fichero para borrar",
                    this.getName(),
                    JOptionPane.QUESTION_MESSAGE);
        } catch (Exception e) {
            System.out.println("Error en butBorrarActionPerformed\n" + e.getMessage());
        }

        GUICallBack.getJMenuBar().getMenu(3).getItem(0).doClick();
    }//GEN-LAST:event_butBorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butBorrar;
    private javax.swing.JButton butCargar;
    private javax.swing.JButton butGuardar;
    private javax.swing.JLabel labCabecera;
    private javax.swing.JScrollPane scrollPartidas;
    private javax.swing.JTable tablePartidas;
    // End of variables declaration//GEN-END:variables

}
