package pro1p1_diegomaradiaga;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BotonMusica = new javax.swing.JButton();
        BotonRecursion = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();

        jLabel2.setText("Salva se la come");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel2)
                .addContainerGap(185, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel2)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(78, 71, 115));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(35, 29, 44));

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Proyecto - Laboratorio P1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BotonMusica.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        BotonMusica.setForeground(new java.awt.Color(255, 255, 255));
        BotonMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/musica.png"))); // NOI18N
        BotonMusica.setText("Música");
        BotonMusica.setBorder(null);
        BotonMusica.setContentAreaFilled(false);
        BotonMusica.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonMusica.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/musica (1).png"))); // NOI18N
        BotonMusica.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/musica.png"))); // NOI18N
        BotonMusica.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BotonMusica.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonMusica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonMusicaMouseClicked(evt);
            }
        });
        BotonMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMusicaActionPerformed(evt);
            }
        });

        BotonRecursion.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        BotonRecursion.setForeground(new java.awt.Color(255, 255, 255));
        BotonRecursion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/filtrar (1).png"))); // NOI18N
        BotonRecursion.setText("Recursion");
        BotonRecursion.setToolTipText("");
        BotonRecursion.setBorder(null);
        BotonRecursion.setContentAreaFilled(false);
        BotonRecursion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonRecursion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/filtrar.png"))); // NOI18N
        BotonRecursion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/filtrar (1).png"))); // NOI18N
        BotonRecursion.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BotonRecursion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonRecursion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRecursionActionPerformed(evt);
            }
        });

        BotonSalir.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(255, 255, 255));
        BotonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/salida-de-emergencia.png"))); // NOI18N
        BotonSalir.setText("Salir");
        BotonSalir.setBorder(null);
        BotonSalir.setContentAreaFilled(false);
        BotonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/salida-de-emergencia (1).png"))); // NOI18N
        BotonSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/salida-de-emergencia.png"))); // NOI18N
        BotonSalir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BotonSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(BotonMusica)
                .addGap(43, 43, 43)
                .addComponent(BotonRecursion)
                .addGap(48, 48, 48)
                .addComponent(BotonSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonMusica)
                    .addComponent(BotonRecursion)
                    .addComponent(BotonSalir))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMusicaActionPerformed
        OpcionCancion C = new OpcionCancion();
        C.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonMusicaActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonRecursionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRecursionActionPerformed
        OpcionRecursion R = new OpcionRecursion();
        R.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonRecursionActionPerformed

    private void BotonMusicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMusicaMouseClicked
        
        
    }//GEN-LAST:event_BotonMusicaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonMusica;
    private javax.swing.JButton BotonRecursion;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}


