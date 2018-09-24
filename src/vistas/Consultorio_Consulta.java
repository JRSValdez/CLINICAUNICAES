/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Classes.ConexionDB;
import Classes.Consulta;
import Classes.Paciente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author JRSVALDEZ
 */
public class Consultorio_Consulta extends javax.swing.JFrame {

    int xx, xy;
    int xs, ys, sbx,sby;
    ConexionDB conn = new ConexionDB();
    Consulta consulta;
    
    public Consultorio_Consulta() throws SQLException {
        initComponents();
        this.cmbAntecedentessEnfCat.setModel(this.llenarComboBoxsCIE10("COLERA"));
    }
    
    public Consultorio_Consulta(Consulta _consulta) throws SQLException{
        initComponents();
        this.cmbAntecedentessEnfCat.setModel(this.llenarComboBoxsCIE10("categoria"));
        this.consulta = _consulta;
        this.lblNombre.setText(_consulta.ef_cabeza);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Barra_Superior = new javax.swing.JPanel();
        btn_close = new javax.swing.JLabel();
        lblHeader1 = new javax.swing.JLabel();
        lblNombrePac = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        TAB_SIGNOS = new javax.swing.JPanel();
        btnHistorial = new javax.swing.JLabel();
        panelDatosPac = new javax.swing.JPanel();
        lblHeader37 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblHeader39 = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblHeader41 = new javax.swing.JLabel();
        lblActividad = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMotivoConsulta = new javax.swing.JTextArea();
        lblHeader50 = new javax.swing.JLabel();
        lblHeader52 = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        panelSignosV = new javax.swing.JPanel();
        lblHeader4 = new javax.swing.JLabel();
        lblHeader43 = new javax.swing.JLabel();
        lblHeader45 = new javax.swing.JLabel();
        lblHeader47 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        lblHeader44 = new javax.swing.JLabel();
        txtTalla = new javax.swing.JTextField();
        lblHeader46 = new javax.swing.JLabel();
        lblHeader48 = new javax.swing.JLabel();
        txtTemperatura = new javax.swing.JTextField();
        lblHeader49 = new javax.swing.JLabel();
        txtPulso = new javax.swing.JTextField();
        lblHeader51 = new javax.swing.JLabel();
        txtFrecCardiaca = new javax.swing.JTextField();
        lblHeader53 = new javax.swing.JLabel();
        txtPresionArterial = new javax.swing.JTextField();
        lblHeader54 = new javax.swing.JLabel();
        TAB_ANTECEDENTES = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblHeader5 = new javax.swing.JLabel();
        lblHeader56 = new javax.swing.JLabel();
        txtBuscarAntecedente = new javax.swing.JTextField();
        lblHeader62 = new javax.swing.JLabel();
        lblHeader63 = new javax.swing.JLabel();
        cmbAntecedentessEnfCat = new javax.swing.JComboBox<>();
        cmbAntecedentessEnf = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTbusqueda1 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        btnBuscarAntecedente = new javax.swing.JLabel();
        TAB_EXAMEN_FI = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblHeader6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_Ef_Cabeza = new javax.swing.JTextArea();
        lblHeader8 = new javax.swing.JLabel();
        lblHeader10 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txt_Ef_Abdomen = new javax.swing.JTextArea();
        lblHeader12 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txt_Ef_Torax = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        txt_Ef_Extremidades = new javax.swing.JTextArea();
        lblHeader13 = new javax.swing.JLabel();
        lblHeader14 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        txt_Ef_Cuello = new javax.swing.JTextArea();
        TAB_DIAGNOSTICO = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lblHeader9 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txt_recomendaciones = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        lblHeader7 = new javax.swing.JLabel();
        lblHeader59 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        lblHeader64 = new javax.swing.JLabel();
        lblHeader65 = new javax.swing.JLabel();
        jComboBox18 = new javax.swing.JComboBox<>();
        jComboBox19 = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTbusqueda3 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        TAB_TRATAMIENTO = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        lblHeader11 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTbusqueda2 = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        lblHeader70 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        lblHeader68 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jComboBox20 = new javax.swing.JComboBox<>();
        lblHeader69 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblHeader58 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        btnTerminarConsulta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1010, 650));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1010, 650));

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 4, true));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 650));

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

        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btn_close.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
        });

        lblHeader1.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        lblHeader1.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader1.setText("CONSULTAS - Consulta Actual");

        lblNombrePac.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        lblNombrePac.setForeground(new java.awt.Color(255, 255, 255));
        lblNombrePac.setText("Nombre del paciente");

        javax.swing.GroupLayout Barra_SuperiorLayout = new javax.swing.GroupLayout(Barra_Superior);
        Barra_Superior.setLayout(Barra_SuperiorLayout);
        Barra_SuperiorLayout.setHorizontalGroup(
            Barra_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Barra_SuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(256, 256, 256)
                .addComponent(lblNombrePac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_close))
        );
        Barra_SuperiorLayout.setVerticalGroup(
            Barra_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Barra_SuperiorLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(Barra_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_close)
                    .addGroup(Barra_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHeader1)
                        .addComponent(lblNombrePac)))
                .addGap(4, 4, 4))
        );

        TAB_SIGNOS.setBackground(new java.awt.Color(102, 0, 0));

        btnHistorial.setForeground(new java.awt.Color(255, 255, 255));
        btnHistorial.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/history.png"))); // NOI18N
        btnHistorial.setText("HISTORIAL PACIENTE");
        btnHistorial.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnHistorial.setFocusable(false);
        btnHistorial.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHistorial.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        panelDatosPac.setBackground(new java.awt.Color(102, 0, 0));
        panelDatosPac.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        lblHeader37.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader37.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader37.setText("NOMBRE:");

        lblNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre del paciente");

        lblHeader39.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader39.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader39.setText("EDAD:");

        lblEdad.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblEdad.setForeground(new java.awt.Color(255, 255, 255));
        lblEdad.setText("Edad");

        lblHeader41.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader41.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader41.setText("ACTIVIDAD:");

        lblActividad.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblActividad.setForeground(new java.awt.Color(255, 255, 255));
        lblActividad.setText("Estudiante");

        txtMotivoConsulta.setColumns(20);
        txtMotivoConsulta.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtMotivoConsulta.setRows(2);
        txtMotivoConsulta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        jScrollPane1.setViewportView(txtMotivoConsulta);

        lblHeader50.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader50.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader50.setText("MOTIVO DE CONSULTA:");

        lblHeader52.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader52.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader52.setText("DIRECCIÓN:");

        lblDireccion.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(255, 255, 255));
        lblDireccion.setText("Dirección del paciente:");

        javax.swing.GroupLayout panelDatosPacLayout = new javax.swing.GroupLayout(panelDatosPac);
        panelDatosPac.setLayout(panelDatosPacLayout);
        panelDatosPacLayout.setHorizontalGroup(
            panelDatosPacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosPacLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosPacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosPacLayout.createSequentialGroup()
                        .addGroup(panelDatosPacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblHeader41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeader39, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeader37, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDatosPacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblActividad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(200, 200, 200)
                        .addComponent(lblHeader52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDireccion))
                    .addGroup(panelDatosPacLayout.createSequentialGroup()
                        .addComponent(lblHeader50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(265, Short.MAX_VALUE))
        );
        panelDatosPacLayout.setVerticalGroup(
            panelDatosPacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosPacLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosPacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader37)
                    .addComponent(lblNombre)
                    .addComponent(lblDireccion)
                    .addComponent(lblHeader52))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosPacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader39)
                    .addComponent(lblEdad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosPacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader41)
                    .addComponent(lblActividad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDatosPacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeader50)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        panelSignosV.setBackground(new java.awt.Color(102, 0, 0));
        panelSignosV.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));
        panelSignosV.setPreferredSize(new java.awt.Dimension(480, 130));

        lblHeader4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader4.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader4.setText("SIGNOS VITALES");

        lblHeader43.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader43.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader43.setText("PESO:");

        lblHeader45.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader45.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader45.setText("TALLA:");

        lblHeader47.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader47.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader47.setText("TEMP:");

        txtPeso.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtPeso.setText("PESO");
        txtPeso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader44.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader44.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader44.setText("lbs");

        txtTalla.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtTalla.setText("TALLA");
        txtTalla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader46.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader46.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader46.setText("lbs");

        lblHeader48.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader48.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader48.setText("°");

        txtTemperatura.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtTemperatura.setText("T");
        txtTemperatura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader49.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader49.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader49.setText("PULSO:");

        txtPulso.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtPulso.setText("P");
        txtPulso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader51.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader51.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader51.setText("FRECUENCIA CARDÍACA:");

        txtFrecCardiaca.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtFrecCardiaca.setText("FC");
        txtFrecCardiaca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader53.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader53.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader53.setText("PRESIÓN ARTERIAL:");

        txtPresionArterial.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtPresionArterial.setText("PA");
        txtPresionArterial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader54.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader54.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader54.setText("mm Hg");

        javax.swing.GroupLayout panelSignosVLayout = new javax.swing.GroupLayout(panelSignosV);
        panelSignosV.setLayout(panelSignosVLayout);
        panelSignosVLayout.setHorizontalGroup(
            panelSignosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSignosVLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelSignosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSignosVLayout.createSequentialGroup()
                        .addGroup(panelSignosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblHeader47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeader45, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeader43, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelSignosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSignosVLayout.createSequentialGroup()
                                .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblHeader44))
                            .addGroup(panelSignosVLayout.createSequentialGroup()
                                .addComponent(txtTalla, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblHeader46))
                            .addGroup(panelSignosVLayout.createSequentialGroup()
                                .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblHeader48)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelSignosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblHeader53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeader51, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeader49, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelSignosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPulso, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFrecCardiaca, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelSignosVLayout.createSequentialGroup()
                                .addComponent(txtPresionArterial, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblHeader54))))
                    .addComponent(lblHeader4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSignosVLayout.setVerticalGroup(
            panelSignosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSignosVLayout.createSequentialGroup()
                .addComponent(lblHeader4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSignosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSignosVLayout.createSequentialGroup()
                        .addGroup(panelSignosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader43)
                            .addComponent(txtPeso)
                            .addComponent(lblHeader44))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelSignosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSignosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTalla)
                                .addComponent(lblHeader46))
                            .addComponent(lblHeader45))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelSignosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSignosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTemperatura)
                                .addComponent(lblHeader48))
                            .addComponent(lblHeader47))
                        .addContainerGap())
                    .addGroup(panelSignosVLayout.createSequentialGroup()
                        .addGroup(panelSignosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader49)
                            .addComponent(txtPulso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelSignosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader51)
                            .addComponent(txtFrecCardiaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelSignosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSignosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPresionArterial)
                                .addComponent(lblHeader54))
                            .addComponent(lblHeader53)))))
        );

        javax.swing.GroupLayout TAB_SIGNOSLayout = new javax.swing.GroupLayout(TAB_SIGNOS);
        TAB_SIGNOS.setLayout(TAB_SIGNOSLayout);
        TAB_SIGNOSLayout.setHorizontalGroup(
            TAB_SIGNOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAB_SIGNOSLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnHistorial)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(TAB_SIGNOSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TAB_SIGNOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSignosV, javax.swing.GroupLayout.DEFAULT_SIZE, 968, Short.MAX_VALUE)
                    .addComponent(panelDatosPac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        TAB_SIGNOSLayout.setVerticalGroup(
            TAB_SIGNOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TAB_SIGNOSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatosPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelSignosV, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHistorial)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PACIENTE Y SIGNOS VITALES", TAB_SIGNOS);

        TAB_ANTECEDENTES.setBackground(new java.awt.Color(102, 0, 0));

        jPanel4.setBackground(new java.awt.Color(102, 0, 0));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));
        jPanel4.setPreferredSize(new java.awt.Dimension(480, 150));

        lblHeader5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader5.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader5.setText("ANTECEDENTES");

        lblHeader56.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader56.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader56.setText("Categoría:");

        txtBuscarAntecedente.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtBuscarAntecedente.setText("BUSQUEDA CATEGORÍA");
        txtBuscarAntecedente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader62.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader62.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader62.setText("Categoría:");

        lblHeader63.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader63.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader63.setText("Enfermedad:");

        cmbAntecedentessEnfCat.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cmbAntecedentessEnfCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CATEGORIA 1", "CATEGORIA 2", "CATEGORIA 3", "CATEGORIA 4" }));
        cmbAntecedentessEnfCat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));
        cmbAntecedentessEnfCat.setMaximumSize(new java.awt.Dimension(350, 27));

        cmbAntecedentessEnf.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cmbAntecedentessEnf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENFERMEDAD 1", "ENFERMEDAD 2", "ENFERMEDAD 3" }));
        cmbAntecedentessEnf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jTbusqueda1.setBackground(new java.awt.Color(204, 204, 204));
        jTbusqueda1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTbusqueda1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"A01", "CATEGORÏA", "A001", "ENFERMEDAD"}
            },
            new String [] {
                "Código", "Categoría", "Código", "Enfermedad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTbusqueda1.setGridColor(new java.awt.Color(255, 255, 153));
        jTbusqueda1.setRowHeight(25);
        jTbusqueda1.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTbusqueda1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTbusqueda1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTbusqueda1);

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cruz.png"))); // NOI18N
        jLabel13.setText("Agregar Antecedente");
        jLabel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel13.setFocusable(false);
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        btnBuscarAntecedente.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarAntecedente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBuscarAntecedente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pill.png"))); // NOI18N
        btnBuscarAntecedente.setToolTipText("");
        btnBuscarAntecedente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblHeader5)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblHeader62, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                .addComponent(lblHeader56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblHeader63))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbAntecedentessEnfCat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbAntecedentessEnf, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtBuscarAntecedente, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarAntecedente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lblHeader5)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader56)
                            .addComponent(txtBuscarAntecedente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbAntecedentessEnfCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHeader62))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbAntecedentessEnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHeader63))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnBuscarAntecedente)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout TAB_ANTECEDENTESLayout = new javax.swing.GroupLayout(TAB_ANTECEDENTES);
        TAB_ANTECEDENTES.setLayout(TAB_ANTECEDENTESLayout);
        TAB_ANTECEDENTESLayout.setHorizontalGroup(
            TAB_ANTECEDENTESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TAB_ANTECEDENTESLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 968, Short.MAX_VALUE)
                .addContainerGap())
        );
        TAB_ANTECEDENTESLayout.setVerticalGroup(
            TAB_ANTECEDENTESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TAB_ANTECEDENTESLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ANTECEDENTES", TAB_ANTECEDENTES);

        TAB_EXAMEN_FI.setBackground(new java.awt.Color(102, 0, 0));

        jPanel5.setBackground(new java.awt.Color(102, 0, 0));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));
        jPanel5.setPreferredSize(new java.awt.Dimension(480, 150));

        lblHeader6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader6.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader6.setText("EXAMEN FÍSICO");

        txt_Ef_Cabeza.setColumns(20);
        txt_Ef_Cabeza.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txt_Ef_Cabeza.setRows(2);
        txt_Ef_Cabeza.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        jScrollPane3.setViewportView(txt_Ef_Cabeza);

        lblHeader8.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader8.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader8.setText("CABEZA:");

        lblHeader10.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader10.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader10.setText("ABDOMEN:");

        txt_Ef_Abdomen.setColumns(20);
        txt_Ef_Abdomen.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txt_Ef_Abdomen.setRows(2);
        txt_Ef_Abdomen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        jScrollPane5.setViewportView(txt_Ef_Abdomen);

        lblHeader12.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader12.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader12.setText("TORAX:");

        txt_Ef_Torax.setColumns(20);
        txt_Ef_Torax.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txt_Ef_Torax.setRows(2);
        txt_Ef_Torax.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        jScrollPane7.setViewportView(txt_Ef_Torax);

        txt_Ef_Extremidades.setColumns(20);
        txt_Ef_Extremidades.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txt_Ef_Extremidades.setRows(2);
        txt_Ef_Extremidades.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        jScrollPane10.setViewportView(txt_Ef_Extremidades);

        lblHeader13.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader13.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader13.setText("EXTREMIDADES:");

        lblHeader14.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader14.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader14.setText("CUELLO:");

        txt_Ef_Cuello.setColumns(20);
        txt_Ef_Cuello.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txt_Ef_Cuello.setRows(2);
        txt_Ef_Cuello.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        jScrollPane11.setViewportView(txt_Ef_Cuello);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 385, Short.MAX_VALUE)
                        .addComponent(lblHeader6)
                        .addGap(0, 385, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lblHeader8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(308, 308, 308))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lblHeader12, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(lblHeader10, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lblHeader14, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblHeader13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(lblHeader6)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeader8)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeader10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeader14)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeader13))
                .addGap(49, 49, 49)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeader12))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout TAB_EXAMEN_FILayout = new javax.swing.GroupLayout(TAB_EXAMEN_FI);
        TAB_EXAMEN_FI.setLayout(TAB_EXAMEN_FILayout);
        TAB_EXAMEN_FILayout.setHorizontalGroup(
            TAB_EXAMEN_FILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TAB_EXAMEN_FILayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 968, Short.MAX_VALUE)
                .addContainerGap())
        );
        TAB_EXAMEN_FILayout.setVerticalGroup(
            TAB_EXAMEN_FILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TAB_EXAMEN_FILayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("EXAMEN FÍSICO", TAB_EXAMEN_FI);

        TAB_DIAGNOSTICO.setBackground(new java.awt.Color(102, 0, 0));

        jPanel8.setBackground(new java.awt.Color(102, 0, 0));
        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));
        jPanel8.setPreferredSize(new java.awt.Dimension(480, 150));

        lblHeader9.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader9.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader9.setText("RECOMENDACIONES");

        txt_recomendaciones.setColumns(20);
        txt_recomendaciones.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txt_recomendaciones.setRows(3);
        txt_recomendaciones.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        jScrollPane6.setViewportView(txt_recomendaciones);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblHeader9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(lblHeader9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(102, 0, 0));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));
        jPanel6.setPreferredSize(new java.awt.Dimension(480, 150));

        lblHeader7.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader7.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader7.setText("DIAGNÓSTICO");

        lblHeader59.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader59.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader59.setText("Categoría:");

        jTextField20.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField20.setText("BUSQUEDA CATEGORÍA");
        jTextField20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader64.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader64.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader64.setText("Categoría:");

        lblHeader65.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader65.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader65.setText("Enfermedad:");

        jComboBox18.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jComboBox18.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CATEGORIA 1", "CATEGORIA 2", "CATEGORIA 3", "CATEGORIA 4" }));
        jComboBox18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jComboBox19.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jComboBox19.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENFERMEDAD 1", "ENFERMEDAD 2", "ENFERMEDAD 3" }));
        jComboBox19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jTbusqueda3.setBackground(new java.awt.Color(204, 204, 204));
        jTbusqueda3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTbusqueda3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"A01", "CATEGORÏA", "A001", "ENFERMEDAD"}
            },
            new String [] {
                "Código", "Categoría", "Código", "Enfermedad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTbusqueda3.setGridColor(new java.awt.Color(255, 255, 153));
        jTbusqueda3.setRowHeight(25);
        jTbusqueda3.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTbusqueda3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTbusqueda3.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jTbusqueda3);

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cruz.png"))); // NOI18N
        jLabel14.setText("Agregar Diagnóstico");
        jLabel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel14.setFocusable(false);
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 123, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblHeader64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeader59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeader65, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField20)
                            .addComponent(jComboBox18, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox19, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 102, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lblHeader7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(lblHeader7)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader59)
                            .addComponent(jTextField20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader64)
                            .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblHeader65)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jComboBox19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout TAB_DIAGNOSTICOLayout = new javax.swing.GroupLayout(TAB_DIAGNOSTICO);
        TAB_DIAGNOSTICO.setLayout(TAB_DIAGNOSTICOLayout);
        TAB_DIAGNOSTICOLayout.setHorizontalGroup(
            TAB_DIAGNOSTICOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TAB_DIAGNOSTICOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TAB_DIAGNOSTICOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 968, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 968, Short.MAX_VALUE))
                .addContainerGap())
        );
        TAB_DIAGNOSTICOLayout.setVerticalGroup(
            TAB_DIAGNOSTICOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAB_DIAGNOSTICOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DIAGNÓSTICO", TAB_DIAGNOSTICO);

        TAB_TRATAMIENTO.setBackground(new java.awt.Color(102, 0, 0));

        jPanel10.setBackground(new java.awt.Color(102, 0, 0));
        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));
        jPanel10.setPreferredSize(new java.awt.Dimension(480, 150));

        lblHeader11.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader11.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader11.setText("RECETA");

        jTbusqueda2.setBackground(new java.awt.Color(204, 204, 204));
        jTbusqueda2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTbusqueda2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Acetaminofen", "2 cada 8 horas", "6"}
            },
            new String [] {
                "Medicamento", "Dosis", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTbusqueda2.setGridColor(new java.awt.Color(255, 255, 153));
        jTbusqueda2.setRowHeight(25);
        jTbusqueda2.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTbusqueda2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTbusqueda2.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(jTbusqueda2);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblHeader11)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(lblHeader11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(102, 0, 0));
        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Medicamento", "Presentación", "Stock", "Fecha de vencimiento"
            }
        ));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane9.setViewportView(jTable1);

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cruz.png"))); // NOI18N
        jLabel15.setText("Añadir a receta");
        jLabel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel15.setFocusable(false);
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lblHeader70.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader70.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader70.setText("CANTIDAD:");

        jTextField31.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField31.setText("XXX");
        jTextField31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader68.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader68.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader68.setText("NOMBRE:");

        jTextField30.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField30.setText("MEDICAMENTO");
        jTextField30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jComboBox20.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jComboBox20.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CATEGORIA 1", "CATEGORIA 2" }));
        jComboBox20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader69.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader69.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader69.setText("CATEGORÍA:");

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        jLabel22.setText("BUSCAR");
        jLabel22.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel22.setFocusable(false);
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel22.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Medicamento para \"Nombre Paciente\"");

        lblHeader58.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader58.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader58.setText("DOSIS:");

        jTextField19.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField19.setText("DOSIS");
        jTextField19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblHeader70, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(lblHeader58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHeader68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHeader69, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField30)
                    .addComponent(jComboBox20, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addGap(296, 296, 296))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(309, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap(216, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader68)
                            .addComponent(jTextField30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader69)
                            .addComponent(jComboBox20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader70)
                            .addComponent(jTextField31))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader58)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnTerminarConsulta.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnTerminarConsulta.setForeground(new java.awt.Color(255, 255, 255));
        btnTerminarConsulta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTerminarConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnTerminarConsulta.setText("Guardar Expediente y Finalizar Consulta");
        btnTerminarConsulta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        btnTerminarConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTerminarConsulta.setFocusable(false);
        btnTerminarConsulta.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnTerminarConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTerminarConsultaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout TAB_TRATAMIENTOLayout = new javax.swing.GroupLayout(TAB_TRATAMIENTO);
        TAB_TRATAMIENTO.setLayout(TAB_TRATAMIENTOLayout);
        TAB_TRATAMIENTOLayout.setHorizontalGroup(
            TAB_TRATAMIENTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TAB_TRATAMIENTOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TAB_TRATAMIENTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 968, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAB_TRATAMIENTOLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTerminarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(304, 304, 304))
        );
        TAB_TRATAMIENTOLayout.setVerticalGroup(
            TAB_TRATAMIENTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TAB_TRATAMIENTOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTerminarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("TRATAMIENTO", TAB_TRATAMIENTO);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addComponent(Barra_Superior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(Barra_Superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("PACIENTE Y SIGNOS VITALES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    public DefaultComboBoxModel llenarComboBoxsCIE10(String _cat) throws SQLException{
        Object[] arrays = this.conn.getCIE10Cats(_cat);
        DefaultComboBoxModel model = new DefaultComboBoxModel( (Object[]) arrays[1] );
        return model;
    }
    
    private void btnTerminarConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTerminarConsultaMouseClicked
        consulta.motivo = this.txtMotivoConsulta.getText();
        consulta.peso = this.txtPeso.getText();
        consulta.frec_card = this.txtFrecCardiaca.getText();
        consulta.pres_art = this.txtPresionArterial.getText();
        consulta.pulso = this.txtPulso.getText();
        consulta.talla = this.txtTalla.getText();
        consulta.ef_cabeza = this.txt_Ef_Cabeza.getText();
        consulta.ef_cuello = this.txt_Ef_Cuello.getText();
        consulta.ef_torax = this.txt_Ef_Torax.getText();
        consulta.ef_abdomen = this.txt_Ef_Abdomen.getText();
        consulta.ef_extremidades = this.txt_Ef_Extremidades.getText();
        
        int idConsulta = conn.aggConsulta(consulta);
        //agregar antecedentes, diagnosticos y receta con el Id obtenido de la consulta
    }//GEN-LAST:event_btnTerminarConsultaMouseClicked

    private void btnBuscarAntecedenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarAntecedenteMouseClicked
        try {
            String cat = this.txtBuscarAntecedente.getText();
            this.cmbAntecedentessEnfCat.setModel(this.llenarComboBoxsCIE10(cat));
        } catch (SQLException ex) {
            Logger.getLogger(Consultorio_Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarAntecedenteMouseClicked

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
            java.util.logging.Logger.getLogger(Consultorio_Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultorio_Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultorio_Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultorio_Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Consultorio_Consulta().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Consultorio_Consulta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra_Superior;
    private javax.swing.JPanel TAB_ANTECEDENTES;
    private javax.swing.JPanel TAB_DIAGNOSTICO;
    private javax.swing.JPanel TAB_EXAMEN_FI;
    private javax.swing.JPanel TAB_SIGNOS;
    private javax.swing.JPanel TAB_TRATAMIENTO;
    private javax.swing.JLabel btnBuscarAntecedente;
    private javax.swing.JLabel btnHistorial;
    private javax.swing.JLabel btnTerminarConsulta;
    private javax.swing.JLabel btn_close;
    private javax.swing.JComboBox<String> cmbAntecedentessEnf;
    private javax.swing.JComboBox<String> cmbAntecedentessEnfCat;
    private javax.swing.JComboBox<String> jComboBox18;
    private javax.swing.JComboBox<String> jComboBox19;
    private javax.swing.JComboBox<String> jComboBox20;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTbusqueda1;
    private javax.swing.JTable jTbusqueda2;
    private javax.swing.JTable jTbusqueda3;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JLabel lblActividad;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblHeader1;
    private javax.swing.JLabel lblHeader10;
    private javax.swing.JLabel lblHeader11;
    private javax.swing.JLabel lblHeader12;
    private javax.swing.JLabel lblHeader13;
    private javax.swing.JLabel lblHeader14;
    private javax.swing.JLabel lblHeader37;
    private javax.swing.JLabel lblHeader39;
    private javax.swing.JLabel lblHeader4;
    private javax.swing.JLabel lblHeader41;
    private javax.swing.JLabel lblHeader43;
    private javax.swing.JLabel lblHeader44;
    private javax.swing.JLabel lblHeader45;
    private javax.swing.JLabel lblHeader46;
    private javax.swing.JLabel lblHeader47;
    private javax.swing.JLabel lblHeader48;
    private javax.swing.JLabel lblHeader49;
    private javax.swing.JLabel lblHeader5;
    private javax.swing.JLabel lblHeader50;
    private javax.swing.JLabel lblHeader51;
    private javax.swing.JLabel lblHeader52;
    private javax.swing.JLabel lblHeader53;
    private javax.swing.JLabel lblHeader54;
    private javax.swing.JLabel lblHeader56;
    private javax.swing.JLabel lblHeader58;
    private javax.swing.JLabel lblHeader59;
    private javax.swing.JLabel lblHeader6;
    private javax.swing.JLabel lblHeader62;
    private javax.swing.JLabel lblHeader63;
    private javax.swing.JLabel lblHeader64;
    private javax.swing.JLabel lblHeader65;
    private javax.swing.JLabel lblHeader68;
    private javax.swing.JLabel lblHeader69;
    private javax.swing.JLabel lblHeader7;
    private javax.swing.JLabel lblHeader70;
    private javax.swing.JLabel lblHeader8;
    private javax.swing.JLabel lblHeader9;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombrePac;
    private javax.swing.JPanel panelDatosPac;
    private javax.swing.JPanel panelSignosV;
    private javax.swing.JTextField txtBuscarAntecedente;
    private javax.swing.JTextField txtFrecCardiaca;
    private javax.swing.JTextArea txtMotivoConsulta;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPresionArterial;
    private javax.swing.JTextField txtPulso;
    private javax.swing.JTextField txtTalla;
    private javax.swing.JTextField txtTemperatura;
    private javax.swing.JTextArea txt_Ef_Abdomen;
    private javax.swing.JTextArea txt_Ef_Cabeza;
    private javax.swing.JTextArea txt_Ef_Cuello;
    private javax.swing.JTextArea txt_Ef_Extremidades;
    private javax.swing.JTextArea txt_Ef_Torax;
    private javax.swing.JTextArea txt_recomendaciones;
    // End of variables declaration//GEN-END:variables
}
