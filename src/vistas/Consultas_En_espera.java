package vistas;
import Classes.ConexionDB;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Consultas_En_espera extends javax.swing.JFrame {

    int xx,xy,xs,ys;
    ConexionDB conn = new ConexionDB();
    
    public Consultas_En_espera() throws SQLException {
        this.setIconImage(new ImageIcon(getClass().getResource("clinica_unicaes.png")).getImage());
        initComponents();
        this.tbConsultasEspera.setSelectionForeground(Color.white);
        this.llenarConsultasEnEspera();
    }
    
    private void llenarConsultasEnEspera(){
        try {
            this.tbConsultasEspera.setModel(conn.getConsultasEnEspera(this.tbConsultasEspera));
        } catch (SQLException ex) {
            Logger.getLogger(Consultas_En_espera.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnNoQuiso = new javax.swing.JLabel();
        btnSeRetiro = new javax.swing.JLabel();
        Barra_Superior = new javax.swing.JPanel();
        btnHome2 = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();
        lblHeader1 = new javax.swing.JLabel();
        btn_close = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbConsultasEspera = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jPanel3.setBackground(new java.awt.Color(102, 0, 0));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        btnNoQuiso.setForeground(new java.awt.Color(255, 255, 255));
        btnNoQuiso.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnNoQuiso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clock.png"))); // NOI18N
        btnNoQuiso.setText("NO QUISO ESPERAR");
        btnNoQuiso.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnNoQuiso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNoQuiso.setFocusable(false);
        btnNoQuiso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNoQuiso.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNoQuiso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNoQuisoMouseClicked(evt);
            }
        });

        btnSeRetiro.setForeground(new java.awt.Color(255, 255, 255));
        btnSeRetiro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnSeRetiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnSeRetiro.setText("SE RETIRÓ SIN MOTIVOS");
        btnSeRetiro.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnSeRetiro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSeRetiro.setFocusable(false);
        btnSeRetiro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSeRetiro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSeRetiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSeRetiroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(419, Short.MAX_VALUE)
                .addComponent(btnNoQuiso)
                .addGap(28, 28, 28)
                .addComponent(btnSeRetiro)
                .addContainerGap(418, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSeRetiro)
                    .addComponent(btnNoQuiso))
                .addGap(15, 15, 15))
        );

        Barra_Superior.setBackground(new java.awt.Color(102, 0, 0));
        Barra_Superior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Barra_SuperiorMouseDragged(evt);
            }
        });
        Barra_Superior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Barra_SuperiorMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Barra_SuperiorMouseReleased(evt);
            }
        });

        btnHome2.setBackground(new java.awt.Color(102, 0, 0));
        btnHome2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lista.png"))); // NOI18N
        btnHome2.setBorder(null);
        btnHome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome2ActionPerformed(evt);
            }
        });

        lblHeader.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(255, 255, 255));

        lblHeader1.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        lblHeader1.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader1.setText("CLÍNICA UNIVERSITARIA - RECEPCIÓN");

        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Barra_SuperiorLayout = new javax.swing.GroupLayout(Barra_Superior);
        Barra_Superior.setLayout(Barra_SuperiorLayout);
        Barra_SuperiorLayout.setHorizontalGroup(
            Barra_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Barra_SuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHeader1)
                .addGap(44, 44, 44)
                .addComponent(lblHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_close))
        );
        Barra_SuperiorLayout.setVerticalGroup(
            Barra_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Barra_SuperiorLayout.createSequentialGroup()
                .addGroup(Barra_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Barra_SuperiorLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblHeader)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(Barra_SuperiorLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(Barra_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Barra_SuperiorLayout.createSequentialGroup()
                        .addComponent(btn_close)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(102, 0, 0));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Consultas en Espera");

        tbConsultasEspera.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        tbConsultasEspera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo Paciente", "Paciente", "Edad", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbConsultasEspera.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tbConsultasEspera.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tbConsultasEspera);
        if (tbConsultasEspera.getColumnModel().getColumnCount() > 0) {
            tbConsultasEspera.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 470, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(0, 364, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1066, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Barra_Superior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Barra_Superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome2ActionPerformed

    }//GEN-LAST:event_btnHome2ActionPerformed

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        this.dispose();
    }//GEN-LAST:event_btn_closeMouseClicked

    private void Barra_SuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Barra_SuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_Barra_SuperiorMouseDragged

    private void Barra_SuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Barra_SuperiorMousePressed
        this.setOpacity((float)0.8);
        xx=evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_Barra_SuperiorMousePressed

    private void Barra_SuperiorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Barra_SuperiorMouseReleased
        this.setOpacity((float)1.0);
    }//GEN-LAST:event_Barra_SuperiorMouseReleased

    private void btnNoQuisoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNoQuisoMouseClicked
        //cambiar estao de consulta a 2 (el paciente se retiró xq no quiso esperar)
        if (this.tbConsultasEspera.getSelectedRows().length == 1)
        {
             Object [] opciones ={"Aceptar","Cancelar"};
            int eleccion = JOptionPane.showOptionDialog(rootPane,"¿Desea quitar esta consulta?","Advertencia",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,null,opciones,"Aceptar");
            if (eleccion == JOptionPane.YES_OPTION)
            {
                 try {
                    int idConsulta = Integer.parseInt(this.tbConsultasEspera.getModel().getValueAt(this.tbConsultasEspera.getSelectedRow(), 0).toString());
                    String res = this.conn.setEstadoConsulta(2, idConsulta);
                    JOptionPane.showMessageDialog(rootPane, res);
                    this.llenarConsultasEnEspera();
                 } catch (SQLException ex) {
                     Logger.getLogger(Consultas_En_espera.class.getName()).log(Level.SEVERE, null, ex);
                 }
            }
        }
        
    }//GEN-LAST:event_btnNoQuisoMouseClicked

    private void btnSeRetiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSeRetiroMouseClicked
        //cambiar estao de consulta a 3 (el paciente se retiró xq sin motivos)
        if (this.tbConsultasEspera.getSelectedRows().length == 1)
        {
             Object [] opciones ={"Aceptar","Cancelar"};
            int eleccion = JOptionPane.showOptionDialog(rootPane,"¿Desea quitar esta consulta?","Advertencia",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,null,opciones,"Aceptar");
            if (eleccion == JOptionPane.YES_OPTION)
            {
                 try {
                    int idConsulta = Integer.parseInt(this.tbConsultasEspera.getModel().getValueAt(this.tbConsultasEspera.getSelectedRow(), 0).toString());
                    String res = this.conn.setEstadoConsulta(3, idConsulta);
                    JOptionPane.showMessageDialog(rootPane, res);
                    this.llenarConsultasEnEspera();
                 } catch (SQLException ex) {
                     Logger.getLogger(Consultas_En_espera.class.getName()).log(Level.SEVERE, null, ex);
                 }
            }
        }
    }//GEN-LAST:event_btnSeRetiroMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Consultas_En_espera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultas_En_espera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultas_En_espera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultas_En_espera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Consultas_En_espera().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Consultas_En_espera.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra_Superior;
    private javax.swing.JButton btnHome2;
    private javax.swing.JLabel btnNoQuiso;
    private javax.swing.JLabel btnSeRetiro;
    private javax.swing.JLabel btn_close;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblHeader1;
    private javax.swing.JTable tbConsultasEspera;
    // End of variables declaration//GEN-END:variables
}
