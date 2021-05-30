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
        try {
            Ficheros.cargarDataDatos("dos", GUICallBack);
            System.out.println("Fichero cargado correctamente");
        } catch (Exception e) {
            System.out.println("Error en cargarFicheros\n" + e.getMessage());
        }
    }//GEN-LAST:event_butCargarActionPerformed

    private void butGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butGuardarActionPerformed
        try {
            Ficheros.guardarDataDatos("dos");
            System.out.println("Fichero guardado correctamente");
        } catch (Exception e) {
            System.out.println("Error en guardarFicheros\n" + e.getMessage());
        }
    }//GEN-LAST:event_butGuardarActionPerformed

    private void butBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butBorrarActionPerformed
        // TODO add your handling code here:
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
