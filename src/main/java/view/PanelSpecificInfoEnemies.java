package view;

import javax.swing.JPanel;
import model.Globals;

public class PanelSpecificInfoEnemies extends JPanel {

    JPanel panelCaller;

    public PanelSpecificInfoEnemies() {
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
                txtDescripcion.setText("Pikachu es uno de los Pokémon que tiene la\n"
                        + "apariencia de un pequeño ratón, su pelaje es\n"
                        + "de un color amarillo, tiene dos marcas de\n"
                        + "color marrón que cubren su espalda y en una\n"
                        + "pequeña parte de su cola.");
                labImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/specificInfo/pikachuSpecific.png"))); // NOI18N
                txtHabilidad.setText("Pikachu destaca en su capacidad de controlar\n"
                        + "su mente para enfocarse en la pelea y dar\n"
                        + "todo de si para intentar ganar el combate,\n"
                        + "gracias a esto es inmune a todo tipo de\n"
                        + "venenos. Debil contra magia.");
                break;
            case "electrode": //electroede
                labCabecera.setText("Electrode");
                txtDescripcion.setText("Electrode es un Pokémon de tipo eléctrico.\n"
                        + "Es considerado un Pokémon muy peligroso,\n"
                        + "además de ser rápido, es capaz de debilitar\n"
                        + "a un Pokémon con \"Autodestrucción\".");
                labImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/specificInfo/electrodeSpecific.png"))); // NOI18N
                txtHabilidad.setText("Tiene la habilidad de \"Autodestrucción\" con\n"
                        + "la cual puede debilitar fuertemente a su\n"
                        + "contrincante de un solo golpe, aunque este\n"
                        + "ataque le requiere tanto esfuerzo que le\n"
                        + "cuesta la vida. Fuerte contra magia.");
                break;
            case "hitMonLee": //hitMonLee
                labCabecera.setText("HitMonLee");
                txtDescripcion.setText("Hitmonlee es un Pokémon de tipo lucha.\n"
                        + "Es un experto en usar sus pies como armas,\n"
                        + "dando un numeroso tipo de patadas. Su\n"
                        + "nombre occidental es una especie de\n"
                        + "homenaje a Bruce Lee.");
                labImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/specificInfo/hitMonLeeSpecific.png"))); // NOI18N
                txtHabilidad.setText("Gracias a sus dotes en Muay Thai es capaz de\n"
                        + "conectar dos golpes seguidos en el mismo\n"
                        + "turno. Esta experencia en combate también le\n"
                        + "ha dotado de resistencia contra cegados y\n"
                        + "aturdimientos. Ligeramente debil contra\n"
                        + "magia.");
                break;
            case "gyarados": //gyarados
                labCabecera.setText("Gyarados");
                txtDescripcion.setText("Gyarados es un Pokémon de tipo agua y\n"
                        + "volador, uno de los más temibles y pode-\n"
                        + "rosos, ya que es capaz de crear cascadas\n"
                        + "de la nada así como retumbar la tierra con\n"
                        + "terremotos.");
                labImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/specificInfo/gyaradosSpecific.png"))); // NOI18N
                txtHabilidad.setText("Gyarados además de controlar el mar y la\n"
                        + "tierra, fue dotado por el dios Arceus con\n"
                        + "una excelente visión que le permite ver a\n"
                        + "cualquiera por mucho que se camufle, además\n"
                        + "no puede ser confundido. Ligeramente fuerte\n"
                        + "contra magia.");
                break;
            case "rayquaza": //Rayquaza
                labCabecera.setText("Rayquaza");
                txtDescripcion.setText("Rayquaza es un Pokémon legendario de la\n"
                        + "región de Hoenn que representa los cielos\n"
                        + "y equilibra los poderes del mar y de la tierra.\n"
                        + "Este dragón celestial de color verde es inmune\n"
                        + "a casi todos los hechizos.");
                labImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/specificInfo/rayquazaSpecific.png"))); // NOI18N
                txtHabilidad.setText("Rayquaza controla los cielos y se mueve tan\n"
                        + "rápido que puede golpear dos veces en el\n"
                        + "mismo turno, tiene una visión prodigiosa que\n"
                        + "le permite ver a cualquier enemigo, es inmu-\n"
                        + "ne al veneno, y  no puede ser confundido.\n"
                        + "Fuerte contra magia.");
                break;
            case "arceus": //arceus
                labCabecera.setText("Arceus");
                txtDescripcion.setText("Arceus es un Pokémon singular. De acuerdo\n"
                        + "con las mitologías de las regiones del mundo\n"
                        + "Pokémon y lo conocido hasta el momento se\n"
                        + "cree que es el primer Pokémon existente,\n"
                        + "creador del mundo Pokémon y por lo tanto,\n"
                        + "el dios Pokémon.");
                labImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/specificInfo/arceusSpecific.png"))); // NOI18N
                txtHabilidad.setText("Arceus posee las habilidades de todos los\n"
                        + "Pokémon ya que el fue quien los creo, por ello\n"
                        + "es el rival más duro a batir. Debil contra\n"
                        + "magia.");
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

        labImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/specificInfo/teemoSpecific.png"))); // NOI18N

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
        panelCaller.requestFocusInWindow();
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
