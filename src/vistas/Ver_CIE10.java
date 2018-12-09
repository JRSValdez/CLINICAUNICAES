package vistas;

import Classes.ConexionDB;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Ver_CIE10 extends javax.swing.JFrame {

    int xx,xy;
    int xs, ys, sbx,sby;
   
    ConexionDB conn;
    
    String[] idCatsAntecedentes;
    String[] idEnfsAntecedentes;
    
    public Ver_CIE10() throws SQLException {
        this.setIconImage(new ImageIcon(getClass().getResource("../images/clinica_unicaes.png")).getImage());
        initComponents();
        this.conn = new ConexionDB();
        cmbAntecedentessEnfCat.setModel(this.llenarComboBoxsCIE10cats("FIEBRE", "A"));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblHistPaciente = new javax.swing.JLabel();
        Barra_Superior2 = new javax.swing.JPanel();
        btnHome4 = new javax.swing.JButton();
        lblHeader4 = new javax.swing.JLabel();
        btn_close2 = new javax.swing.JLabel();
        lblHeader5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblHeader6 = new javax.swing.JLabel();
        lblHeader56 = new javax.swing.JLabel();
        txtBuscarAntecedente = new javax.swing.JTextField();
        lblHeader62 = new javax.swing.JLabel();
        cmbAntecedentessEnfCat = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtAntecedentes = new javax.swing.JTable();
        btnBuscarAntecedente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        lblHistPaciente.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblHistPaciente.setForeground(new java.awt.Color(255, 255, 255));
        lblHistPaciente.setText("CIE10");

        Barra_Superior2.setBackground(new java.awt.Color(102, 0, 0));
        Barra_Superior2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Barra_Superior2MouseDragged(evt);
            }
        });
        Barra_Superior2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Barra_Superior2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Barra_Superior2MouseReleased(evt);
            }
        });

        btnHome4.setBackground(new java.awt.Color(102, 0, 0));
        btnHome4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        btnHome4.setBorder(null);
        btnHome4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome4ActionPerformed(evt);
            }
        });

        lblHeader4.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblHeader4.setForeground(new java.awt.Color(255, 255, 255));

        btn_close2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btn_close2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_close2MouseClicked(evt);
            }
        });

        lblHeader5.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        lblHeader5.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader5.setText("CLÍNICA UNIVERSITARIA - RECEPCIÓN ");

        javax.swing.GroupLayout Barra_Superior2Layout = new javax.swing.GroupLayout(Barra_Superior2);
        Barra_Superior2.setLayout(Barra_Superior2Layout);
        Barra_Superior2Layout.setHorizontalGroup(
            Barra_Superior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Barra_Superior2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHeader5)
                .addGap(291, 291, 291)
                .addComponent(lblHeader4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 320, Short.MAX_VALUE)
                .addComponent(btn_close2)
                .addGap(19, 19, 19))
        );
        Barra_Superior2Layout.setVerticalGroup(
            Barra_Superior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnHome4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(Barra_Superior2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(Barra_Superior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_close2)
                    .addGroup(Barra_Superior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHeader4)
                        .addComponent(lblHeader5))))
        );

        jPanel4.setBackground(new java.awt.Color(102, 0, 0));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));
        jPanel4.setPreferredSize(new java.awt.Dimension(480, 150));

        lblHeader6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader6.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader6.setText("CIE10");

        lblHeader56.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader56.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader56.setText("Buscar Categoría:");

        txtBuscarAntecedente.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtBuscarAntecedente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader62.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader62.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader62.setText("Categoría:");

        cmbAntecedentessEnfCat.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cmbAntecedentessEnfCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CATEGORIA 1", "CATEGORIA 2", "CATEGORIA 3", "CATEGORIA 4" }));
        cmbAntecedentessEnfCat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));
        cmbAntecedentessEnfCat.setMaximumSize(new java.awt.Dimension(350, 27));
        cmbAntecedentessEnfCat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbAntecedentessEnfCatItemStateChanged(evt);
            }
        });

        jtAntecedentes.setBackground(new java.awt.Color(204, 204, 204));
        jtAntecedentes.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jtAntecedentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Categoría", "Código Enfermedad", "Enfermedad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtAntecedentes.setGridColor(new java.awt.Color(255, 255, 153));
        jtAntecedentes.setRowHeight(25);
        jtAntecedentes.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jtAntecedentes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtAntecedentes.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtAntecedentes);
        if (jtAntecedentes.getColumnModel().getColumnCount() > 0) {
            jtAntecedentes.getColumnModel().getColumn(0).setPreferredWidth(140);
            jtAntecedentes.getColumnModel().getColumn(0).setMaxWidth(140);
            jtAntecedentes.getColumnModel().getColumn(1).setPreferredWidth(140);
            jtAntecedentes.getColumnModel().getColumn(1).setMaxWidth(140);
        }

        btnBuscarAntecedente.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarAntecedente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBuscarAntecedente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchCat.png"))); // NOI18N
        btnBuscarAntecedente.setToolTipText("");
        btnBuscarAntecedente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarAntecedente.setFocusable(false);
        btnBuscarAntecedente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarAntecedente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscarAntecedente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarAntecedenteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblHeader62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeader56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtBuscarAntecedente, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarAntecedente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 63, Short.MAX_VALUE))
                            .addComponent(cmbAntecedentessEnfCat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblHeader6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lblHeader6)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarAntecedente)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader56)
                            .addComponent(txtBuscarAntecedente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbAntecedentessEnfCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHeader62))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Barra_Superior2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblHistPaciente)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Barra_Superior2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHistPaciente)
                .addGap(11, 11, 11)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHome4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome4ActionPerformed

    }//GEN-LAST:event_btnHome4ActionPerformed

    private void btn_close2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_close2MouseClicked
        this.dispose();
    }//GEN-LAST:event_btn_close2MouseClicked

    private void Barra_Superior2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Barra_Superior2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_Barra_Superior2MouseDragged

    private void Barra_Superior2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Barra_Superior2MousePressed
        this.setOpacity((float)0.8);
        xx=evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_Barra_Superior2MousePressed

    private void Barra_Superior2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Barra_Superior2MouseReleased
        this.setOpacity((float)1.0);
    }//GEN-LAST:event_Barra_Superior2MouseReleased

    private void cmbAntecedentessEnfCatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbAntecedentessEnfCatItemStateChanged
        try {
            String cat = this.txtBuscarAntecedente.getText();
            this.llenarComboBoxsCIE10enfs(this.idCatsAntecedentes[this.cmbAntecedentessEnfCat.getSelectedIndex()]);
        } catch (SQLException ex) {
            Logger.getLogger(Ver_CIE10.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbAntecedentessEnfCatItemStateChanged

    private void btnBuscarAntecedenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarAntecedenteMouseClicked
        // buscar antecedentes
        try {
            String cat = this.txtBuscarAntecedente.getText();
            cmbAntecedentessEnfCat.setModel(this.llenarComboBoxsCIE10cats(cat.toUpperCase(), "A"));
        } catch (SQLException ex) {
            Logger.getLogger(Consultorio_Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarAntecedenteMouseClicked

    public DefaultComboBoxModel llenarComboBoxsCIE10cats(String _cat, String _tipo) throws SQLException{
        try{
            Object[] arrays = this.conn.getCIE10Cats(_cat);
            DefaultComboBoxModel model = new DefaultComboBoxModel( (Object[]) arrays[1] );
            //llenar arraysIds
            this.idCatsAntecedentes = (String[]) arrays[0];
            llenarComboBoxsCIE10enfs(this.idCatsAntecedentes[0]);
        
            return model;
        } catch(NullPointerException ex){
            Logger.getLogger(Consultorio_Consulta.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane,"No se encontro ninguna categoría con ese nombre");
            return null;
        } 
        catch(SQLException ex){
            Logger.getLogger(Consultorio_Consulta.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }  
        
    }
    
    public void llenarComboBoxsCIE10enfs(String _idCat) throws SQLException{
        Object[] arrays = this.conn.getCIE10Enfs(_idCat);
        //llenar arraysIds
        String[] idEnfs = (String[]) arrays[0];
        String[] idCats = (String[]) arrays[1];
        String[] enfs = (String[]) arrays[2];

        DefaultTableModel modelo = (DefaultTableModel) this.jtAntecedentes.getModel();
        modelo.setRowCount(0);
        for(int i=0; i<idEnfs.length; i++){
            modelo.addRow(new String[]{idCats[i],idEnfs[i], enfs[i]});
        }
            
    }
    
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
            java.util.logging.Logger.getLogger(Ver_CIE10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ver_CIE10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ver_CIE10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ver_CIE10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Ver_CIE10().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Ver_CIE10.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra_Superior2;
    private javax.swing.JLabel btnBuscarAntecedente;
    private javax.swing.JButton btnHome4;
    private javax.swing.JLabel btn_close2;
    private javax.swing.JComboBox<String> cmbAntecedentessEnfCat;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtAntecedentes;
    private javax.swing.JLabel lblHeader4;
    private javax.swing.JLabel lblHeader5;
    private javax.swing.JLabel lblHeader56;
    private javax.swing.JLabel lblHeader6;
    private javax.swing.JLabel lblHeader62;
    private javax.swing.JLabel lblHistPaciente;
    private javax.swing.JTextField txtBuscarAntecedente;
    // End of variables declaration//GEN-END:variables
}
