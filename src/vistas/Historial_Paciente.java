package vistas;

import Classes.ConexionDB;
import Classes.Consulta;
import Classes.Paciente;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;


public class Historial_Paciente extends javax.swing.JFrame {

    int xx,xy;
    int xs, ys, sbx,sby;
   
    ConexionDB conn;
    
    public Historial_Paciente() {
        initComponents();
    }
    
    public Historial_Paciente(int _idPaciente) throws SQLException {
        initComponents();
        this.tbConsultas.setSelectionForeground(Color.WHITE);
        conn = new ConexionDB();
        
        this.tbConsultas.setModel(this.conn.getConsultasByID(tbConsultas, _idPaciente));
        
        //doble clic en una fila
        this.tbConsultas.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent mouseEvent) {
                JTable table =(JTable) mouseEvent.getSource();
                Point point = mouseEvent.getPoint();
                int row = table.rowAtPoint(point);
                if (mouseEvent.getClickCount() == 2 && table.getSelectedRow() != -1) {
                    try {
                        int idConsulta = Integer.parseInt(table.getModel().getValueAt(table.getSelectedRow(), 0).toString());
                        Consulta consulta = conn.getConsulta(idConsulta);
                        Paciente paciente = conn.getPaciente(consulta.idConsulta);
                        Expediente_Paciente expediente = new Expediente_Paciente(consulta,paciente);
                        expediente.setVisible(true);
                    } catch (SQLException ex) {
                        Logger.getLogger(Consultas_Historial.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ParseException ex) {
                        Logger.getLogger(Consultas_Historial.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Barra_Superior2 = new javax.swing.JPanel();
        btnHome4 = new javax.swing.JButton();
        lblHeader4 = new javax.swing.JLabel();
        btn_close2 = new javax.swing.JLabel();
        lblHeader5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbConsultas = new javax.swing.JTable();
        btnAtras = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 2, true));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Historial de Paciente: \"Nombre paciente\"");

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

        tbConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Carnet", "Actividad", "Nombre", "Edad", "Facultad", "Carrera", "Telefono", "Fecha Consulta", "Doctor", "Motivo Consulta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbConsultas.setRowHeight(25);
        tbConsultas.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tbConsultas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tbConsultas);
        if (tbConsultas.getColumnModel().getColumnCount() > 0) {
            tbConsultas.getColumnModel().getColumn(0).setMaxWidth(35);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/go-back-left-arrow.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Barra_Superior2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAtras)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Barra_Superior2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(Historial_Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Historial_Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Historial_Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Historial_Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Historial_Paciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra_Superior2;
    private javax.swing.JLabel btnAtras;
    private javax.swing.JButton btnHome4;
    private javax.swing.JLabel btn_close2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeader4;
    private javax.swing.JLabel lblHeader5;
    private javax.swing.JTable tbConsultas;
    // End of variables declaration//GEN-END:variables
}
