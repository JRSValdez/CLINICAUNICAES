package vistas;

import Classes.ConexionDB;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Historial_Solicitudes extends javax.swing.JFrame {

    int xx,xy;
    int xs, ys, sbx,sby;
   
    ConexionDB conn;
    
    String[] idCatsAntecedentes;
    String[] idEnfsAntecedentes;
    
    public Historial_Solicitudes() throws SQLException {
        initComponents();
        this.conn = new ConexionDB();
        this.jtSolicitudes.setModel(this.conn.getSolicitudes(jtSolicitudes, "todos", ""));
    }
    
    public Historial_Solicitudes(int _today) throws SQLException {
        this.setIconImage(new ImageIcon(getClass().getResource("clinica_unicaes.png")).getImage());
        initComponents();
        this.conn = new ConexionDB();
        
        Date date = new Date();
        String today= new SimpleDateFormat("dd-MM-YYYY").format(date);
        this.jtSolicitudes.setModel(this.conn.getSolicitudes(jtSolicitudes, "fecha", today));
        
        this.txtFecha.setText(today);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pUpBuscarMedicamento = new javax.swing.JPopupMenu();
        itemNombre = new javax.swing.JMenuItem();
        itemFecha = new javax.swing.JMenuItem();
        itemMedicamento = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        lblHistPaciente = new javax.swing.JLabel();
        Barra_Superior2 = new javax.swing.JPanel();
        btnHome4 = new javax.swing.JButton();
        lblHeader4 = new javax.swing.JLabel();
        btn_close2 = new javax.swing.JLabel();
        lblHeader5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtSolicitudes = new javax.swing.JTable();
        btnBuscarAntecedente = new javax.swing.JLabel();
        lblHeader52 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JFormattedTextField();
        txtPaciente = new javax.swing.JTextField();
        lblHeader53 = new javax.swing.JLabel();
        lblHeader54 = new javax.swing.JLabel();
        lblHeader55 = new javax.swing.JLabel();
        txtMedicamento = new javax.swing.JTextField();

        itemNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/popUp_apellidos.png"))); // NOI18N
        itemNombre.setText("por Nombre Paciente");
        itemNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNombreActionPerformed(evt);
            }
        });
        pUpBuscarMedicamento.add(itemNombre);

        itemFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/popUp_fecha.png"))); // NOI18N
        itemFecha.setText("por Fecha");
        itemFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFechaActionPerformed(evt);
            }
        });
        pUpBuscarMedicamento.add(itemFecha);

        itemMedicamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nombre_medicamento.png"))); // NOI18N
        itemMedicamento.setText("por Medicamento");
        itemMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMedicamentoActionPerformed(evt);
            }
        });
        pUpBuscarMedicamento.add(itemMedicamento);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        lblHistPaciente.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblHistPaciente.setForeground(new java.awt.Color(255, 255, 255));
        lblHistPaciente.setText("SOLICITUDES DE MEDICAMENTO");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
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

        jtSolicitudes.setBackground(new java.awt.Color(204, 204, 204));
        jtSolicitudes.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jtSolicitudes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Carnet/Documento", "Nombre", "Fecha", "Medicamento", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtSolicitudes.setGridColor(new java.awt.Color(255, 255, 153));
        jtSolicitudes.setRowHeight(25);
        jtSolicitudes.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jtSolicitudes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtSolicitudes.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtSolicitudes);
        if (jtSolicitudes.getColumnModel().getColumnCount() > 0) {
            jtSolicitudes.getColumnModel().getColumn(0).setPreferredWidth(140);
            jtSolicitudes.getColumnModel().getColumn(0).setMaxWidth(40);
            jtSolicitudes.getColumnModel().getColumn(1).setPreferredWidth(140);
            jtSolicitudes.getColumnModel().getColumn(1).setMaxWidth(140);
            jtSolicitudes.getColumnModel().getColumn(5).setMaxWidth(60);
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

        lblHeader52.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader52.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader52.setText("BUSQUEDA DE SOLICITUDES");

        txtFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));
        try {
            txtFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFecha.setToolTipText("dd-mm-yyyy");

        txtPaciente.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtPaciente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader53.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader53.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader53.setText("PACIENTE:");

        lblHeader54.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader54.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader54.setText("FECHA SOLICITUD:");

        lblHeader55.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader55.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader55.setText("MEDICAMENTO:");

        txtMedicamento.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtMedicamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(431, 431, 431)
                                .addComponent(lblHeader52))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblHeader54, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                    .addComponent(lblHeader53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPaciente)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblHeader55, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)))
                        .addGap(29, 29, 29)
                        .addComponent(btnBuscarAntecedente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader52)
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHeader54)
                            .addComponent(lblHeader55)
                            .addComponent(txtMedicamento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader53)
                            .addComponent(txtPaciente)))
                    .addComponent(btnBuscarAntecedente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Barra_Superior2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
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

    private void btnBuscarAntecedenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarAntecedenteMouseClicked
        this.pUpBuscarMedicamento.show(evt.getComponent(), evt.getX(), evt.getY());
    }//GEN-LAST:event_btnBuscarAntecedenteMouseClicked

    private void itemNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNombreActionPerformed
        // Buscar solicitudes por nombre
        try {
            String nombre = this.txtPaciente.getText();
            if(validar(nombre)) this.jtSolicitudes.setModel(this.conn.getSolicitudes(jtSolicitudes,"nombre", nombre));
        } catch (SQLException ex) {
            Logger.getLogger(Home_Recepcion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemNombreActionPerformed

    private void itemFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFechaActionPerformed
        // Buscar solicitudes por fecha
        try {
            String fecha = this.txtFecha.getText();
            if(validar(fecha)) this.jtSolicitudes.setModel(this.conn.getSolicitudes(jtSolicitudes,"fecha", fecha));
        } catch (SQLException ex) {
            Logger.getLogger(Home_Recepcion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemFechaActionPerformed

    private void itemMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMedicamentoActionPerformed
        // Buscar solicitudes por medicamento
        try {
            String nombre = this.txtMedicamento.getText();
            if(validar(nombre)) this.jtSolicitudes.setModel(this.conn.getSolicitudes(jtSolicitudes,"medicamento", nombre));
        } catch (SQLException ex) {
            Logger.getLogger(Home_Recepcion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemMedicamentoActionPerformed

    public boolean validar(String _busqueda){
        if(_busqueda.length()>3){
            return true;
        }
        return false;
    }
    
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

        DefaultTableModel modelo = (DefaultTableModel) this.jtSolicitudes.getModel();
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
            java.util.logging.Logger.getLogger(Historial_Solicitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Historial_Solicitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Historial_Solicitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Historial_Solicitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                    new Historial_Solicitudes().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Historial_Solicitudes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra_Superior2;
    private javax.swing.JLabel btnBuscarAntecedente;
    private javax.swing.JButton btnHome4;
    private javax.swing.JLabel btn_close2;
    private javax.swing.JMenuItem itemFecha;
    private javax.swing.JMenuItem itemMedicamento;
    private javax.swing.JMenuItem itemNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtSolicitudes;
    private javax.swing.JLabel lblHeader4;
    private javax.swing.JLabel lblHeader5;
    private javax.swing.JLabel lblHeader52;
    private javax.swing.JLabel lblHeader53;
    private javax.swing.JLabel lblHeader54;
    private javax.swing.JLabel lblHeader55;
    private javax.swing.JLabel lblHistPaciente;
    private javax.swing.JPopupMenu pUpBuscarMedicamento;
    private javax.swing.JFormattedTextField txtFecha;
    private javax.swing.JTextField txtMedicamento;
    private javax.swing.JTextField txtPaciente;
    // End of variables declaration//GEN-END:variables
}
