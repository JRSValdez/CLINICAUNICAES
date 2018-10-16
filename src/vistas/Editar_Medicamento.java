
package vistas;

import Classes.ConexionDB;
import Classes.Medicamento;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author JRSValdez
 */
public class Editar_Medicamento extends javax.swing.JFrame {

    int xx,xy;
    int xs, ys, sbx,sby;
    
    Home_Recepcion home_recepcion = null;
    Home_Root home_root = null;
    ConexionDB conn = new ConexionDB();
    Medicamento med;
    
    int[] idPresentacion;
    int[] idCatsMed;
    int[] idUnidadesMed;
    
    public Editar_Medicamento(Home_Recepcion home,Medicamento _med) {
        try {
            initComponents();
            this.med = _med;
            this.home_recepcion = home;
            this.setValues();
        } catch (SQLException ex) {
            Logger.getLogger(Editar_Medicamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public Editar_Medicamento(Home_Root home,Medicamento _med) {
        try {
            initComponents();
            this.med = _med;
            this.home_root = home;
            this.setValues();
        } catch (SQLException ex) {
            Logger.getLogger(Editar_Medicamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Editar_Medicamento() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Barra_Superior = new javax.swing.JPanel();
        btnHome2 = new javax.swing.JButton();
        btn_close = new javax.swing.JLabel();
        lblHeader1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblHeader48 = new javax.swing.JLabel();
        txtNombreMedicmento = new javax.swing.JTextField();
        lblHeader45 = new javax.swing.JLabel();
        cboPresentacionMed = new javax.swing.JComboBox<>();
        lblHeader46 = new javax.swing.JLabel();
        cboUnidadesMed = new javax.swing.JComboBox<>();
        lblHeader47 = new javax.swing.JLabel();
        lblHeader55 = new javax.swing.JLabel();
        btnAggMedicamento = new javax.swing.JLabel();
        cboCategoriaMed = new javax.swing.JComboBox<>();
        lblHeader51 = new javax.swing.JLabel();
        txtFechaV = new javax.swing.JFormattedTextField();
        txtCantMedicamento = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 2, true));

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
        btnHome2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        btnHome2.setBorder(null);
        btnHome2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnHome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome2ActionPerformed(evt);
            }
        });

        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btn_close.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
        });

        lblHeader1.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        lblHeader1.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader1.setText("CLÍNICA UNIVERSITARIA - EDITAR MEDICAMENTO");

        javax.swing.GroupLayout Barra_SuperiorLayout = new javax.swing.GroupLayout(Barra_Superior);
        Barra_Superior.setLayout(Barra_SuperiorLayout);
        Barra_SuperiorLayout.setHorizontalGroup(
            Barra_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Barra_SuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHeader1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(btn_close)
                .addContainerGap())
        );
        Barra_SuperiorLayout.setVerticalGroup(
            Barra_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Barra_SuperiorLayout.createSequentialGroup()
                .addGroup(Barra_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Barra_SuperiorLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(Barra_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_close)
                            .addComponent(lblHeader1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(102, 0, 0));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        lblHeader48.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader48.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader48.setText("NOMBRE:");

        txtNombreMedicmento.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtNombreMedicmento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader45.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader45.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader45.setText("PRESENTACIÓN:");

        cboPresentacionMed.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cboPresentacionMed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cboPresentacionMed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader46.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader46.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader46.setText("CANTIDAD:");

        cboUnidadesMed.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cboUnidadesMed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader47.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader47.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader47.setText("FECHA V. :");

        lblHeader55.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader55.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader55.setText("MEDICAMENTO NUEVO");

        btnAggMedicamento.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnAggMedicamento.setForeground(new java.awt.Color(255, 255, 255));
        btnAggMedicamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAggMedicamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btnAggMedicamento.setText("Editar Medicamento");
        btnAggMedicamento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        btnAggMedicamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAggMedicamento.setFocusable(false);
        btnAggMedicamento.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAggMedicamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAggMedicamentoMouseClicked(evt);
            }
        });

        cboCategoriaMed.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cboCategoriaMed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader51.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader51.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader51.setText("CATEGORÍA:");

        txtFechaV.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        txtFechaV.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MM-yyyy"))));
        txtFechaV.setToolTipText("");
        txtFechaV.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        txtCantMedicamento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        txtCantMedicamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtCantMedicamento.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHeader55)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeader51, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblHeader48, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblHeader45, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblHeader47, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblHeader46, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtCantMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboCategoriaMed, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cboPresentacionMed, javax.swing.GroupLayout.Alignment.LEADING, 0, 244, Short.MAX_VALUE)
                                    .addComponent(txtNombreMedicmento, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addComponent(cboUnidadesMed, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtFechaV, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(56, Short.MAX_VALUE))))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAggMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(lblHeader55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader48)
                    .addComponent(txtNombreMedicmento)
                    .addComponent(cboUnidadesMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboPresentacionMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeader45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeader51)
                    .addComponent(cboCategoriaMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader46)
                    .addComponent(txtCantMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader47)
                    .addComponent(txtFechaV, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnAggMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Barra_Superior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Barra_Superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(57, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome2ActionPerformed
        
    }//GEN-LAST:event_btnHome2ActionPerformed

    private void setValues() throws SQLException{
        this.txtNombreMedicmento.setText(this.med.medicamento);
        this.txtCantMedicamento.setText(String.valueOf(this.med.cantidad));
        this.txtFechaV.setText(this.med.fechaV);
        
        //llenar presentaciones de medicamentos
        Object[] arrays = this.conn.llenarPresentacionesMed(this.cboPresentacionMed);
        this.idPresentacion = (int[]) arrays[1];
        this.cboPresentacionMed.setModel((DefaultComboBoxModel) arrays[0]);
        this.cboPresentacionMed.setSelectedItem(this.med.presentacion);
        
        //llenar tipos de medicamentos
        Object[] arrays2 = this.conn.llenarCatsMedicamentos(this.cboCategoriaMed);
        this.idCatsMed = (int[]) arrays2[1];
        this.cboCategoriaMed.setModel((DefaultComboBoxModel) arrays2[0]);
        this.cboCategoriaMed.setSelectedItem(this.med.tipo);
        
         //llenar unidades de medicamentos
        Object[] arrays3 = this.conn.llenarUnidadesMed(this.cboUnidadesMed);
        this.idUnidadesMed = (int[]) arrays3[1];
        this.cboUnidadesMed.setModel((DefaultComboBoxModel) arrays3[0]);
        this.cboUnidadesMed.setSelectedItem(this.med.unidad_med);
    }
    
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

    private void btnAggMedicamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggMedicamentoMouseClicked
        //editar medicamento
        try {
            med.medicamento = this.txtNombreMedicmento.getText();
            med.cantidad = Integer.parseInt(this.txtCantMedicamento.getText());
            med.idPresentacion = this.idPresentacion[this.cboPresentacionMed.getSelectedIndex()];
            med.idUnidad = this.idUnidadesMed[this.cboUnidadesMed.getSelectedIndex()];
            med.idTipoMed = this.idCatsMed[this.cboCategoriaMed.getSelectedIndex()];
            med.fechaV = this.txtFechaV.getText();

            String validacion = med.validarMedicamento();
            if(validacion.equals("")){
                String mensaje = this.conn.editarMedicamento(med);
                JOptionPane.showMessageDialog(rootPane, mensaje);
                
                if(this.home_recepcion == null){
                    this.home_root.llenarMedicamentosFarmacia();
                } else this.home_recepcion.llenarMedicamentosFarmacia();
                
                this.dispose();
            } else {
                //error de validación
                JOptionPane.showMessageDialog(rootPane, validacion);
                System.out.println(validacion);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.toString());
            Logger.getLogger(Editar_Medicamento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Editar_Medicamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAggMedicamentoMouseClicked

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
            java.util.logging.Logger.getLogger(Editar_Medicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar_Medicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar_Medicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar_Medicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editar_Medicamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra_Superior;
    private javax.swing.JLabel btnAggMedicamento;
    private javax.swing.JButton btnHome2;
    private javax.swing.JLabel btn_close;
    private javax.swing.JComboBox<String> cboCategoriaMed;
    private javax.swing.JComboBox<String> cboPresentacionMed;
    private javax.swing.JComboBox<String> cboUnidadesMed;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblHeader1;
    private javax.swing.JLabel lblHeader45;
    private javax.swing.JLabel lblHeader46;
    private javax.swing.JLabel lblHeader47;
    private javax.swing.JLabel lblHeader48;
    private javax.swing.JLabel lblHeader51;
    private javax.swing.JLabel lblHeader55;
    private javax.swing.JFormattedTextField txtCantMedicamento;
    private javax.swing.JFormattedTextField txtFechaV;
    private javax.swing.JTextField txtNombreMedicmento;
    // End of variables declaration//GEN-END:variables
}
