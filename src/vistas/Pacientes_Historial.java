package vistas;

import Classes.ConexionDB;
import Classes.Paciente;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
public class Pacientes_Historial extends javax.swing.JFrame {

     int xx,xy;
   int xs, ys, sbx,sby;
   ConexionDB conn;
    public Pacientes_Historial() {
        this.setIconImage(new ImageIcon(getClass().getResource("clinica_unicaes.png")).getImage());
        initComponents();
        conn = new ConexionDB();
        
         try {
             this.tbPacientes.setModel(conn.getHistorialPaciente(tbPacientes,"no"));
         } catch (SQLException ex) {
             Logger.getLogger(Pacientes_Historial.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblHeader48 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblHeader49 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblHeader50 = new javax.swing.JLabel();
        txtCarnet = new javax.swing.JTextField();
        lblHeader17 = new javax.swing.JLabel();
        rbProyec_social = new javax.swing.JRadioButton();
        rbFemenino = new javax.swing.JRadioButton();
        lblHeader52 = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbEstudiante = new javax.swing.JRadioButton();
        rbAcademico = new javax.swing.JRadioButton();
        btnBuscar = new javax.swing.JLabel();
        Barra_Superior2 = new javax.swing.JPanel();
        btnHome4 = new javax.swing.JButton();
        lblHeader4 = new javax.swing.JLabel();
        btn_close2 = new javax.swing.JLabel();
        lblHeader5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPacientes = new javax.swing.JTable();
        btnAtras = new javax.swing.JLabel();
        btnEditarPaciente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Historial de Pacientes");

        jPanel2.setBackground(new java.awt.Color(102, 0, 0));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Búsqueda Personalizada");

        jPanel3.setBackground(new java.awt.Color(102, 0, 0));

        lblHeader48.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader48.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader48.setText("NOMBRES:");

        txtNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader49.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader49.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader49.setText("APELLIDOS:");

        txtApellido.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader50.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader50.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader50.setText("CARNET:");

        txtCarnet.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtCarnet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblHeader48, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHeader49, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHeader50, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 56, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader48)
                    .addComponent(txtNombre))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader49)
                    .addComponent(txtApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCarnet)
                    .addComponent(lblHeader50))
                .addGap(27, 27, 27))
        );

        lblHeader17.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader17.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader17.setText("SEXO:");

        rbProyec_social.setBackground(new java.awt.Color(102, 0, 0));
        rbProyec_social.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        rbProyec_social.setForeground(new java.awt.Color(255, 255, 255));
        rbProyec_social.setText("Proyección social");
        rbProyec_social.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbProyec_socialMouseClicked(evt);
            }
        });

        rbFemenino.setBackground(new java.awt.Color(102, 0, 0));
        rbFemenino.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        rbFemenino.setForeground(new java.awt.Color(255, 255, 255));
        rbFemenino.setText("Femenino");
        rbFemenino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbFemeninoMouseClicked(evt);
            }
        });

        lblHeader52.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader52.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader52.setText("TIPO PACIENTE:");

        rbMasculino.setBackground(new java.awt.Color(102, 0, 0));
        rbMasculino.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        rbMasculino.setForeground(new java.awt.Color(255, 255, 255));
        rbMasculino.setText("Masculino");
        rbMasculino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbMasculinoMouseClicked(evt);
            }
        });

        rbEstudiante.setBackground(new java.awt.Color(102, 0, 0));
        rbEstudiante.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        rbEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        rbEstudiante.setText("Estudiante");
        rbEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbEstudianteMouseClicked(evt);
            }
        });

        rbAcademico.setBackground(new java.awt.Color(102, 0, 0));
        rbAcademico.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        rbAcademico.setForeground(new java.awt.Color(255, 255, 255));
        rbAcademico.setText("Personal academico");
        rbAcademico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbAcademicoMouseClicked(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(lblHeader17, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbMasculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbFemenino))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblHeader52)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbEstudiante)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbAcademico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbProyec_social)))
                        .addGap(70, 70, 70))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader17)
                            .addComponent(rbFemenino)
                            .addComponent(rbMasculino))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader52)
                            .addComponent(rbEstudiante)
                            .addComponent(rbAcademico)
                            .addComponent(rbProyec_social))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        tbPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CARNET", "DOCUMENTO", "NOMBRE", "TIPO_PACIENTE", "CARRERA", "DEPARTAMENTO", "ZONA", "CELULAR", "SEXO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbPacientes);

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
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/go-back-left-arrow.png"))); // NOI18N
        btnAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtrasMouseClicked(evt);
            }
        });

        btnEditarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btnEditarPaciente.setText("Editar");
        btnEditarPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarPacienteMouseClicked(evt);
            }
        });

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
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnEditarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtras)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Barra_Superior2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAtras)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(btnEditarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        String nombre=this.txtNombre.getText();
        String apellido=this.txtApellido.getText();
        String carnet=this.txtCarnet.getText();
        int tipo=0;
        String sexo="";
        String query="Select idpaciente, pac_carne,pacientes.pac_documento, CONCAT(pac_nombre,' ',pac_apellido) nombre,tipopac,carrera.carrera,departamento.departamento," +
            "CASE PAC_ZONA WHEN '1' THEN 'Urbana' " +
            "ELSE 'Rural' END zona,pac_celular,CASE PAC_SEXO " +
            "WHEN 'M' THEN 'Masculino' " +
            "ELSE 'Femenino' END sexo from pacientes" +
            " inner join tipo_paciente on pacientes.idtipopac=tipo_paciente.idtipopac " +
            " left outer join carrera on carrera.idcarrera=pacientes.idcarrera" +
            " left outer join Facultad on facultad.idfacultad=Carrera.idfacultad" +
            " inner join departamento on departamento.iddepartamento=pacientes.iddepartamento";
        
    if (nombre.trim().length()>0){
    query=query+" where pac_nombre='"+nombre+"'";
    }else{
    query=query+" where pac_nombre like '%%'";
    }
    
    if (apellido.trim().length()>0){
    query=query+" and pac_apellido='"+apellido+"'";
    }
    
    if (carnet.trim().length()>0){
    query=query+" and pac_carne='"+carnet+"'";
    }
    
    if(this.rbMasculino.isSelected()){
    sexo="M";
    }else if(this.rbFemenino.isSelected()){
        sexo="F";
    }
    
    if (sexo.trim().length()>0){
    query=query+" and pac_sexo='"+sexo+"'";
    }
    
    if(this.rbAcademico.isSelected()){
    tipo=2;
    query=query+" and pacientes.idtipopac="+tipo;
}else if(this.rbProyec_social.isSelected()){
    tipo=3;
    query=query+" and pacientes.idtipopac="+tipo;
}else if(this.rbEstudiante.isSelected()){
    tipo=1;
    query=query+" and pacientes.idtipopac="+tipo;
}else{
}
        
         try {
             this.tbPacientes.setModel(conn.getHistorialPaciente(tbPacientes,query));
         } catch (SQLException ex) {
             Logger.getLogger(Pacientes_Historial.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void rbEstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbEstudianteMouseClicked
        if(this.rbEstudiante.isSelected()){
            this.rbAcademico.setSelected(false);
             this.rbProyec_social.setSelected(false);
        }
    }//GEN-LAST:event_rbEstudianteMouseClicked

    private void rbAcademicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbAcademicoMouseClicked
        if(this.rbAcademico.isSelected()){
            this.rbEstudiante.setSelected(false);
             this.rbProyec_social.setSelected(false);
        }
    }//GEN-LAST:event_rbAcademicoMouseClicked

    private void rbProyec_socialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbProyec_socialMouseClicked
        if(this.rbProyec_social.isSelected()){
            this.rbEstudiante.setSelected(false);
             this.rbAcademico.setSelected(false);
        }
    }//GEN-LAST:event_rbProyec_socialMouseClicked

    private void rbMasculinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbMasculinoMouseClicked
         if(this.rbMasculino.isSelected()){
            this.rbFemenino.setSelected(false);
         }
    }//GEN-LAST:event_rbMasculinoMouseClicked

    private void rbFemeninoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbFemeninoMouseClicked
        if(this.rbFemenino.isSelected()){
            this.rbMasculino.setSelected(false);
         }
    }//GEN-LAST:event_rbFemeninoMouseClicked

    private void btnEditarPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarPacienteMouseClicked
if (this.tbPacientes.getSelectedRows().length == 1)
        {        
        try {
                int idPac = Integer.parseInt(this.tbPacientes.getModel().getValueAt(this.tbPacientes.getSelectedRow(), 0).toString());
                Paciente pac = this.conn.getPacientebyID(idPac);
                Editar_Paciente form = new Editar_Paciente(pac);
                form.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Home_Root.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }//GEN-LAST:event_btnEditarPacienteMouseClicked

    private void btnAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnAtrasMouseClicked

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
            java.util.logging.Logger.getLogger(Pacientes_Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pacientes_Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pacientes_Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pacientes_Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pacientes_Historial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra_Superior2;
    private javax.swing.JLabel btnAtras;
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JLabel btnEditarPaciente;
    private javax.swing.JButton btnHome4;
    private javax.swing.JLabel btn_close2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeader17;
    private javax.swing.JLabel lblHeader4;
    private javax.swing.JLabel lblHeader48;
    private javax.swing.JLabel lblHeader49;
    private javax.swing.JLabel lblHeader5;
    private javax.swing.JLabel lblHeader50;
    private javax.swing.JLabel lblHeader52;
    private javax.swing.JRadioButton rbAcademico;
    private javax.swing.JRadioButton rbEstudiante;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JRadioButton rbProyec_social;
    private javax.swing.JTable tbPacientes;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCarnet;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
