
package views;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatArcIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatDarkFlatIJTheme;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author axelb
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        initStyles();
        initInicio();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        inicioBtn = new javax.swing.JButton();
        busquedaBtn = new javax.swing.JButton();
        comprasBtn = new javax.swing.JButton();
        catalogoBtn = new javax.swing.JButton();
        ventasBtn = new javax.swing.JButton();
        cinta = new javax.swing.JPanel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 768));

        background.setBackground(new java.awt.Color(255, 255, 255));

        menu.setBackground(new java.awt.Color(78, 80, 82));

        tituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLabel.setText("CRUZ");
        tituloLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        inicioBtn.setForeground(new java.awt.Color(255, 255, 255));
        inicioBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/house.png"))); // NOI18N
        inicioBtn.setText("Inicio");
        inicioBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 30, 1, 1, new java.awt.Color(0, 0, 0)));
        inicioBtn.setBorderPainted(false);
        inicioBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        inicioBtn.setIconTextGap(15);
        inicioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioBtnActionPerformed(evt);
            }
        });

        busquedaBtn.setForeground(new java.awt.Color(255, 255, 255));
        busquedaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/magnifying-glass.png"))); // NOI18N
        busquedaBtn.setText("Búsqueda");
        busquedaBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 30, 1, 1, new java.awt.Color(0, 0, 0)));
        busquedaBtn.setBorderPainted(false);
        busquedaBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        busquedaBtn.setIconTextGap(15);
        busquedaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaBtnActionPerformed(evt);
            }
        });

        comprasBtn.setForeground(new java.awt.Color(255, 255, 255));
        comprasBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/money.png"))); // NOI18N
        comprasBtn.setText("Compras");
        comprasBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 30, 1, 1, new java.awt.Color(0, 0, 0)));
        comprasBtn.setBorderPainted(false);
        comprasBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        comprasBtn.setIconTextGap(15);
        comprasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprasBtnActionPerformed(evt);
            }
        });

        catalogoBtn.setForeground(new java.awt.Color(255, 255, 255));
        catalogoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book.png"))); // NOI18N
        catalogoBtn.setText("Catálogo");
        catalogoBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 30, 1, 1, new java.awt.Color(0, 0, 0)));
        catalogoBtn.setBorderPainted(false);
        catalogoBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        catalogoBtn.setIconTextGap(15);
        catalogoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catalogoBtnActionPerformed(evt);
            }
        });

        ventasBtn.setForeground(new java.awt.Color(255, 255, 255));
        ventasBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shopping.png"))); // NOI18N
        ventasBtn.setText("Ventas");
        ventasBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 30, 1, 1, new java.awt.Color(0, 0, 0)));
        ventasBtn.setBorderPainted(false);
        ventasBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ventasBtn.setIconTextGap(15);
        ventasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventasBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(catalogoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(inicioBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(comprasBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ventasBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(busquedaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(catalogoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(inicioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comprasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(ventasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(busquedaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        cinta.setBackground(new java.awt.Color(78, 80, 82));

        javax.swing.GroupLayout cintaLayout = new javax.swing.GroupLayout(cinta);
        cinta.setLayout(cintaLayout);
        cintaLayout.setHorizontalGroup(
            cintaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        cintaLayout.setVerticalGroup(
            cintaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
        );

        content.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 915, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(cinta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(cinta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void initStyles(){
        tituloLabel.putClientProperty( "FlatLaf.styleClass", "h1" );
        inicioBtn.putClientProperty( "FlatLaf.styleClass", "h1" );
        busquedaBtn.putClientProperty( "FlatLaf.styleClass", "h1" );
        catalogoBtn.putClientProperty( "FlatLaf.styleClass", "h1" );
        ventasBtn.putClientProperty( "FlatLaf.styleClass", "h1" );
        comprasBtn.putClientProperty( "FlatLaf.styleClass", "h1" );
    }
    
    private void initInicio(){
        Inicio contentIni = new Inicio();
        formatearContent(contentIni);
        refrescarContent(contentIni);
        
    }
    
    private void refrescarContent(JPanel panel){
        content.removeAll();
        content.add(panel, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    
    private void formatearContent(JPanel panel){
        panel.setSize(915, 590);
        panel.setLocation(0,0);
    }
    
    private void catalogoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catalogoBtnActionPerformed
        Catalogo catalogoIni = new Catalogo();
        formatearContent(catalogoIni);
        refrescarContent(catalogoIni);
    }//GEN-LAST:event_catalogoBtnActionPerformed

    private void comprasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprasBtnActionPerformed
        Compras comprasContent = new Compras();
        formatearContent(comprasContent);
        refrescarContent(comprasContent);
    }//GEN-LAST:event_comprasBtnActionPerformed

    private void busquedaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaBtnActionPerformed

        Busqueda contentBusqueda = new Busqueda();
        formatearContent(contentBusqueda);
        refrescarContent(contentBusqueda);
        
    }//GEN-LAST:event_busquedaBtnActionPerformed

    private void inicioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioBtnActionPerformed

        initInicio();
    }//GEN-LAST:event_inicioBtnActionPerformed

    private void ventasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventasBtnActionPerformed
        
        Ventas ventasContent = new Ventas();
        formatearContent(ventasContent);
        refrescarContent(ventasContent);
    }//GEN-LAST:event_ventasBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatDarkFlatIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton busquedaBtn;
    private javax.swing.JButton catalogoBtn;
    private javax.swing.JPanel cinta;
    private javax.swing.JButton comprasBtn;
    private javax.swing.JPanel content;
    private javax.swing.JButton inicioBtn;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JButton ventasBtn;
    // End of variables declaration//GEN-END:variables
}
