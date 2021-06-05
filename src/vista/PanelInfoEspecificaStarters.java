package vista;

import modelo.ICallBack;
import javax.swing.JPanel;
import modelo.Globals;

public class PanelInfoEspecificaStarters extends JPanel {

    JPanel panelCaller;
    ICallBack IPanelCaller;
    String nombreStarter;

    public PanelInfoEspecificaStarters() {
        initComponents();
    }

    void mostrar(ICallBack panelInformacion, String nombreStarter) {
        IPanelCaller = panelInformacion;
        this.nombreStarter = nombreStarter;
        panelCaller = Globals.panelCaller;

        infoEspecificaStarters(nombreStarter);

        this.setVisible(true);
        this.requestFocusInWindow();
    }

    private void infoEspecificaStarters(String nombreStarter) {
        switch (nombreStarter) {
            case "teemo":
                //TEEMO
                labCabecera.setText("Teemo");
                labAtaquePrincipal.setText("Arañazo");
                txtAtaquePrincipal.setText("Inflinge 150% daño de ataque de Teemo.\n"
                        + "Tiene una ligera probabilidad de que Teemo\n"
                        + "se camufle, esta probabilidad escala por\n"
                        + "daño veneno.");
                labAtaqueSecundario.setText("Dardo Venenoso");
                txtAtaqueSecundario.setText("Inflinge 100% daño de ataque de Teemo.\n"
                        + "Tiene probabilidad de cegar, envenenar o\n"
                        + "de provocar ambas, la probabilidad de hacer\n"
                        + "ambas escala por daño veneno. El daño vene-\n"
                        + "no también aumenta el robo de vida pasivo.");
                labItem.setText("Veneno ->");
                butItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoGeneral/infoPoison.png"))); // NOI18N
                labImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoEspecifica/teemoEspecifico.png"))); // NOI18N
                txtDescripcion.setText("Sin inmutarse siquiera por los obstá-\n"
                        + "culos más amenazantes, Teemo\n"
                        + "explora el mundo con su cerbatana.");
                break;
            case "poppy":
                //POPPY
                labCabecera.setText("Poppy");
                labAtaquePrincipal.setText("Placaje con escudo");
                txtAtaquePrincipal.setText("Inflinge 100% daño de ataque de Poppy.\n"
                        + "Hay una probabilidad de que Poppy se ponga\n"
                        + "un escudo, este le garantiza una protección\n"
                        + "extra durante un turno. Esta probabilidad\n"
                        + "escala con la dureza de escudo.");
                labAtaqueSecundario.setText("Martillazo");
                txtAtaqueSecundario.setText("Inflinge 50% daño de ataque de Poppy.\n"
                        + "Otorga además la probabilidad de confundir\n"
                        + "al enemigo, este probabilidad es de 33% al\n"
                        + "principio y escala en función de la dureza\n"
                        + "de escudo.");
                labItem.setText("Escudo ->");
                butItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoGeneral/infoShield.png"))); // NOI18N
                labImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoEspecifica/poppyEspecifico.png"))); // NOI18N
                txtDescripcion.setText("Esta yordle tan obstinada porta el\n"
                        + "legendario martillo de Orlon, que la\n"
                        + "dobla en tamaño, y con el que hace\n"
                        + "retroceder a los enemigos del reino\n"
                        + "con cada golpe giratorio.");
                break;
            case "gnarMini":
                //MINIGNAR
                labCabecera.setText("Gnar");
                labAtaquePrincipal.setText("Boomerang");
                txtAtaquePrincipal.setText("Inflinge 100% de daño de ataque de Gnar.\n"
                        + "Existe la posibilidad de que el boomerang\n"
                        + "golpeé otra vez a la vuelta.");
                labAtaqueSecundario.setText("Salto");
                txtAtaqueSecundario.setText("Inflinge 100% de daño de ataque de Gnar.\n"
                        + "Existe la posibilidad de esquivar con un salto\n"
                        + "el ataque del enemigo.");
                labItem.setText("Resistencia ->");
                butItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoGeneral/infoArmor.png"))); // NOI18N
                labImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoEspecifica/gnarMiniEspecifico.png"))); // NOI18N
                txtDescripcion.setText("Gnar es un yordle primitivo cuyas\n"
                        + "payasadas lúdicas pueden estallar\n"
                        + "en la ira de un niño pequeño en un\n"
                        + "instante, transformándolo en una\n"
                        + "bestia enorme de destrucción.");
                break;
            case "gnarMega":
                //MEGAGNAR
                labCabecera.setText("MegaGnar");
                labAtaquePrincipal.setText("Golpe");
                txtAtaquePrincipal.setText("Inflinge 200% daño de ataque de MegaGnar.");
                labAtaqueSecundario.setText("Lanzar Roca");
                txtAtaqueSecundario.setText("La roca puede ser fallada.\n"
                        + "Si no falla inflinge 200% daño de ataque\n"
                        + "de MegaGnar y aturdé al enemigo.");
                labItem.setText("Resistencia ->");
                butItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoGeneral/infoArmor.png"))); // NOI18N
                labImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoEspecifica/gnarMegaEspecifico.png"))); // NOI18N
                txtDescripcion.setText("Encantado con el peligro, con su\n"
                        + "forma de MegaGnar arroja todo lo\n"
                        + "que puede a sus enemigos, ya sea\n"
                        + "una enorme roca o un edificio\n"
                        + "cercano.");
                break;
            case "yuumi":
                //YUUMI
                labCabecera.setText("Yuumi");
                labAtaquePrincipal.setText("Sanación");
                txtAtaquePrincipal.setText("Se cura el 100% de su poder de sanación.\n"
                        + "También inflinge 100% de daño de ataque de\n"
                        + "Yuumi como daño MÁGICO (el daño final \n"
                        + "varía en función de la resistencia mágica del\n"
                        + "enemigo).");
                labAtaqueSecundario.setText("Últimas páginas");
                txtAtaqueSecundario.setText("Se cura un 25%. Puede cegar, esta\n"
                        + "probabilidad escala con su poder de sanación.\n"
                        + "También inflinge 125% de daño de ataque de\n"
                        + "Yuumi como daño MÁGICO (el daño final\n"
                        + "puede variar dependiendo del enemigo).");
                butItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoGeneral/infoRelievePotion.png"))); // NOI18N
                labImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoEspecifica/yuumiEspecifico.png"))); // NOI18N
                txtDescripcion.setText("Yuumi, una gata mágica de Ciudad\n"
                        + "de Bandle, fue la compañera\n"
                        + "de una hechicera yordle, Norra.\n"
                        + "Desde la misteriosa desaparición de\n"
                        + "su dueña, Yuumi la está buscando.");
                break;
            default:
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labCabecera = new javax.swing.JLabel();
        labAtaquePrincipal = new javax.swing.JLabel();
        scrollAtaquePrincipal = new javax.swing.JScrollPane();
        txtAtaquePrincipal = new javax.swing.JTextArea();
        labAtaqueSecundario = new javax.swing.JLabel();
        scrollAtaqueSecundario = new javax.swing.JScrollPane();
        txtAtaqueSecundario = new javax.swing.JTextArea();
        labItem = new javax.swing.JLabel();
        butItem = new javax.swing.JButton();
        labImagen = new javax.swing.JLabel();
        scrollDescripcion = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        butVolver = new javax.swing.JButton();

        setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        setMaximumSize(new java.awt.Dimension(800, 560));
        setMinimumSize(new java.awt.Dimension(800, 560));
        setPreferredSize(new java.awt.Dimension(800, 560));

        labCabecera.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labCabecera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCabecera.setText("TEEMO");

        labAtaquePrincipal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labAtaquePrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labAtaquePrincipal.setText("Arañazo");

        txtAtaquePrincipal.setEditable(false);
        txtAtaquePrincipal.setColumns(20);
        txtAtaquePrincipal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAtaquePrincipal.setRows(5);
        txtAtaquePrincipal.setText("Inflinge 150% daño de ataque de Teemo.\nTiene una ligera probabilidad de que Teemo\nse camufle, esta probabilidad escala por\ndaño veneno.");
        scrollAtaquePrincipal.setViewportView(txtAtaquePrincipal);

        labAtaqueSecundario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labAtaqueSecundario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labAtaqueSecundario.setText("Dardo Venenoso");

        txtAtaqueSecundario.setEditable(false);
        txtAtaqueSecundario.setColumns(20);
        txtAtaqueSecundario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAtaqueSecundario.setRows(5);
        txtAtaqueSecundario.setText("Inflinge 100% daño de ataque de Teemo.\nTiene probabilidad de cegar, envenenar o\nde provocar ambas, la probabilidad de hacer\nambas escala por daño veneno.");
        scrollAtaqueSecundario.setViewportView(txtAtaqueSecundario);

        labItem.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labItem.setText("Item ->");

        butItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoGeneral/infoPoison.png"))); // NOI18N
        butItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butItemActionPerformed(evt);
            }
        });

        labImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/infoEspecifica/teemoEspecifico.png"))); // NOI18N

        txtDescripcion.setEditable(false);
        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDescripcion.setRows(5);
        txtDescripcion.setText("Encantado con el peligro, con su forma\nde MegaGnar arroja todo lo que\npuede a sus enemigos, ya sea una\nenorme roca o un edificio cercano.");
        scrollDescripcion.setViewportView(txtDescripcion);

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scrollAtaquePrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                            .addComponent(labAtaquePrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labAtaqueSecundario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scrollAtaqueSecundario)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labItem)
                                .addGap(18, 18, 18)
                                .addComponent(butItem, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollDescripcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labImagen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 30, Short.MAX_VALUE)))
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
                        .addComponent(labAtaquePrincipal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollAtaquePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labAtaqueSecundario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollAtaqueSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(butVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labItem)
                                    .addComponent(butItem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void butVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butVolverActionPerformed
        this.setVisible(false);
        this.getRootPane().getContentPane().remove(this);
        panelCaller = Globals.panelCaller;
        if (IPanelCaller != null) {         //Para volver al panelInfo
            IPanelCaller.hacerVisible(true);
        }
        if (panelCaller != null) {         //Para volver al panelTienda
            panelCaller.setVisible(true);
        }
    }//GEN-LAST:event_butVolverActionPerformed

    private void butItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butItemActionPerformed
        this.setVisible(false);
        this.getRootPane().getContentPane().remove(this);
        if (nombreStarter.equals("teemo")) {
            IPanelCaller.clickPoison();
        } else if (nombreStarter.equals("poppy")) {
            IPanelCaller.clickShield();
        } else if (nombreStarter.equals("gnarMini")) {
            IPanelCaller.clickArmor();
        } else if (nombreStarter.equals("gnarMega")) {
            IPanelCaller.clickArmor();
        } else if (nombreStarter.equals("yuumi")) {
            IPanelCaller.clickRelievePotion();
        }
    }//GEN-LAST:event_butItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butItem;
    private javax.swing.JButton butVolver;
    private javax.swing.JLabel labAtaquePrincipal;
    private javax.swing.JLabel labAtaqueSecundario;
    private javax.swing.JLabel labCabecera;
    private javax.swing.JLabel labImagen;
    private javax.swing.JLabel labItem;
    private javax.swing.JScrollPane scrollAtaquePrincipal;
    private javax.swing.JScrollPane scrollAtaqueSecundario;
    private javax.swing.JScrollPane scrollDescripcion;
    private javax.swing.JTextArea txtAtaquePrincipal;
    private javax.swing.JTextArea txtAtaqueSecundario;
    private javax.swing.JTextArea txtDescripcion;
    // End of variables declaration//GEN-END:variables

}
