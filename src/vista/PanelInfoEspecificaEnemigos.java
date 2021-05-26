package vista;

import javax.swing.JPanel;

public class PanelInfoEspecificaEnemigos extends JPanel {

    JPanel panelCaller;

    public PanelInfoEspecificaEnemigos() {
        initComponents();
    }

    void mostrar(JPanel panelInformacion, String nombreStarter) {
        panelCaller = panelInformacion;

        infoEspecificaEnemigos(nombreStarter);

        this.setVisible(true);
        this.requestFocusInWindow();
    }

    private void infoEspecificaEnemigos(String nombreStarter) {
        switch (nombreStarter) {
            case "pikachu": //PIKACHU
                labCabecera.setText("Pikachu");
                txtDescripcion.setText("Inflinge 150% daño de ataque de Teemo.\n"
                        + "Tiene una ligera probabilidad de que Teemo\n"
                        + "se camufle, esta probabilidad escala por\n"
                        + "daño veneno.");
                labImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoEspecifica/pikachuEspecifico.png"))); // NOI18N
                txtDescripcion.setText("Sin inmutarse siquiera por los obstá-\n"
                        + "culos más amenazantes, Teemo\n"
                        + "explora el mundo con su cerbatana.");
                break;
            case "electrode": //electroede
                labCabecera.setText("Electrode");
                txtDescripcion.setText("Inflinge 150% daño de ataque de Teemo.\n"
                        + "Tiene una ligera probabilidad de que Teemo\n"
                        + "se camufle, esta probabilidad escala por\n"
                        + "daño veneno.");
                labImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoEspecifica/electrodeEspecifico.png"))); // NOI18N
                txtDescripcion.setText("Sin inmutarse siquiera por los obstá-\n"
                        + "culos más amenazantes, Teemo\n"
                        + "explora el mundo con su cerbatana.");
                break;
            case "hitMonLee": //hitMonLee
                labCabecera.setText("HitMonLee");
                txtDescripcion.setText("Inflinge 150% daño de ataque de Teemo.\n"
                        + "Tiene una ligera probabilidad de que Teemo\n"
                        + "se camufle, esta probabilidad escala por\n"
                        + "daño veneno.");
                labImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoEspecifica/hitMonLeeEspecifico.png"))); // NOI18N
                txtDescripcion.setText("Sin inmutarse siquiera por los obstá-\n"
                        + "culos más amenazantes, Teemo\n"
                        + "explora el mundo con su cerbatana.");
                break;
            case "gyarados": //gyarados
                labCabecera.setText("Gyarados");
                txtDescripcion.setText("Inflinge 150% daño de ataque de Teemo.\n"
                        + "Tiene una ligera probabilidad de que Teemo\n"
                        + "se camufle, esta probabilidad escala por\n"
                        + "daño veneno.");
                labImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoEspecifica/gyaradosEspecifico.png"))); // NOI18N
                txtDescripcion.setText("Sin inmutarse siquiera por los obstá-\n"
                        + "culos más amenazantes, Teemo\n"
                        + "explora el mundo con su cerbatana.");
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labCabecera = new javax.swing.JLabel();
        labDescripcion = new javax.swing.JLabel();
        scrollDescripcion = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        labHabilidad = new javax.swing.JLabel();
        scrollHabilidad = new javax.swing.JScrollPane();
        txtHabilidad = new javax.swing.JTextArea();
        labImagen = new javax.swing.JLabel();
        butVolver = new javax.swing.JButton();

        setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        setMaximumSize(new java.awt.Dimension(800, 560));
        setMinimumSize(new java.awt.Dimension(800, 560));
        setPreferredSize(new java.awt.Dimension(800, 560));

        labCabecera.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labCabecera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCabecera.setText("ELECTRODE");

        labDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labDescripcion.setText("Descripción");

        txtDescripcion.setEditable(false);
        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDescripcion.setRows(5);
        txtDescripcion.setText("Un pokemon electrico etc lo que sea :)\n");
        scrollDescripcion.setViewportView(txtDescripcion);

        labHabilidad.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labHabilidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labHabilidad.setText("Habilidad");

        txtHabilidad.setEditable(false);
        txtHabilidad.setColumns(20);
        txtHabilidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtHabilidad.setRows(5);
        txtHabilidad.setText("Este pokemon puede autodestruirse en\ncualquier momento originando un daño\ndemoledor a su contendiente.");
        scrollHabilidad.setViewportView(txtHabilidad);

        labImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoEspecifica/teemoEspecifico.png"))); // NOI18N

        butVolver.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        butVolver.setText("Volver");
        butVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butVolverActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(scrollDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                                .addComponent(labDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(scrollHabilidad)
                                .addComponent(labHabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(labImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labDescripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(labHabilidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollHabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(butVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void butVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butVolverActionPerformed
        this.setVisible(false);
        this.getRootPane().getContentPane().remove(this);
        panelCaller.setVisible(true);
    }//GEN-LAST:event_butVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butVolver;
    private javax.swing.JLabel labCabecera;
    private javax.swing.JLabel labDescripcion;
    private javax.swing.JLabel labHabilidad;
    private javax.swing.JLabel labImagen;
    private javax.swing.JScrollPane scrollDescripcion;
    private javax.swing.JScrollPane scrollHabilidad;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextArea txtHabilidad;
    // End of variables declaration//GEN-END:variables

}
