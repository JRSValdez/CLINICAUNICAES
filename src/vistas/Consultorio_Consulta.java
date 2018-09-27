/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Classes.ConexionDB;
import Classes.Consulta;
import Classes.Paciente;
import Classes.Receta;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JRSVALDEZ
 */
public class Consultorio_Consulta extends javax.swing.JFrame {

    int xx, xy,xs, ys, sbx,sby;
    int conA = 0, conD = 0;
    ConexionDB conn = new ConexionDB();
    Consulta consulta;
    Paciente paciente;
    Receta receta;
    
    String[] idCatsAntecedentes;
    String[] idCatsDiagnosticos;
    
    String[] idEnfsAntecedentes;
    String[] idEnfsDiagnosticos;
    
    int[] idCatsMedicamentos;

    public Consultorio_Consulta() throws SQLException {
        initComponents();
        this.cmbAntecedentessEnfCat.setModel(this.llenarComboBoxsCIE10cats("FIEBRE", "A"));
        this.cmbDiagnosticoCats.setModel(this.llenarComboBoxsCIE10cats("FIEBRE", "D"));
        this.llenarCatsMedicamento();
    }
    
    public Consultorio_Consulta(Consulta _consulta, Paciente _paciente) throws SQLException{
        initComponents();
        this.cmbAntecedentessEnfCat.setModel(this.llenarComboBoxsCIE10cats("FIEBRE", "A"));
        this.cmbDiagnosticoCats.setModel(this.llenarComboBoxsCIE10cats("FIEBRE", "D"));
        this.consulta = _consulta;
        this.paciente = _paciente;
        this.receta = new Receta();
        this.llenarCampos();
    }
    
    public void llenarCampos() throws SQLException{
        this.lblDireccion.setText(this.paciente.direccion);
        this.lblNombre.setText(this.paciente.nombre);
        this.lblMedicamentoPara.setText("Medicamentos para: " +this.paciente.nombre);
        this.lblNombrePac.setText("Paciente: " +this.paciente.nombre);
        this.lblEdad.setText(this.paciente.edad);
        this.llenarCatsMedicamento();
        
        this.jtAntecedentes.setSelectionForeground(Color.white);
        this.jtDiagnosticos.setSelectionForeground(Color.white);
        this.jtMedicamentos.setSelectionForeground(Color.white);
        this.jtReceta.setSelectionForeground(Color.white);
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
        jtAntecedentes = new javax.swing.JTable();
        btnAggAntecedente = new javax.swing.JLabel();
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
        jPanel7 = new javax.swing.JPanel();
        lblHeader15 = new javax.swing.JLabel();
        lblHeader57 = new javax.swing.JLabel();
        txtBuscarDiagnostico = new javax.swing.JTextField();
        lblHeader66 = new javax.swing.JLabel();
        lblHeader67 = new javax.swing.JLabel();
        cmbDiagnosticoCats = new javax.swing.JComboBox<>();
        cmbDiagnosticoEnfs = new javax.swing.JComboBox<>();
        jScrollPane12 = new javax.swing.JScrollPane();
        jtDiagnosticos = new javax.swing.JTable();
        btnAggDiagnostico = new javax.swing.JLabel();
        btnBuscarDiagnostico = new javax.swing.JLabel();
        TAB_TRATAMIENTO = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        lblHeader11 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jtReceta = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jtMedicamentos = new javax.swing.JTable();
        btnAddReceta = new javax.swing.JLabel();
        lblHeader70 = new javax.swing.JLabel();
        txtMedicamentoCantidad = new javax.swing.JTextField();
        lblMedicamentoPara = new javax.swing.JLabel();
        lblHeader58 = new javax.swing.JLabel();
        txtMedicamentoDosis = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblHeader68 = new javax.swing.JLabel();
        txtBuscarMedicamento = new javax.swing.JTextField();
        btnBuscarMedicamento = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblHeader69 = new javax.swing.JLabel();
        cmbCatMedicamento = new javax.swing.JComboBox<>();
        btnBuscarCatMedicamento = new javax.swing.JLabel();
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
                .addComponent(lblHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(251, 251, 251)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGroup(panelDatosPacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosPacLayout.createSequentialGroup()
                        .addComponent(lblHeader52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDireccion))
                    .addGroup(panelDatosPacLayout.createSequentialGroup()
                        .addComponent(lblHeader50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        panelDatosPacLayout.setVerticalGroup(
            panelDatosPacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosPacLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDatosPacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader37)
                    .addComponent(lblNombre)
                    .addComponent(lblDireccion)
                    .addComponent(lblHeader52))
                .addGroup(panelDatosPacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosPacLayout.createSequentialGroup()
                        .addGroup(panelDatosPacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDatosPacLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelDatosPacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblHeader39)
                                    .addComponent(lblEdad)))
                            .addGroup(panelDatosPacLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lblHeader50)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDatosPacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader41)
                            .addComponent(lblActividad)))
                    .addGroup(panelDatosPacLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
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
        txtPeso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader44.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader44.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader44.setText("lbs");

        txtTalla.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtTalla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader46.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader46.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader46.setText("lbs");

        lblHeader48.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader48.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader48.setText("°");

        txtTemperatura.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtTemperatura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader49.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader49.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader49.setText("PULSO:");

        txtPulso.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtPulso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader51.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader51.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader51.setText("FRECUENCIA CARDÍACA:");

        txtFrecCardiaca.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtFrecCardiaca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader53.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader53.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader53.setText("PRESIÓN ARTERIAL:");

        txtPresionArterial.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtPresionArterial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader54.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader54.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader54.setText("mm Hg");

        javax.swing.GroupLayout panelSignosVLayout = new javax.swing.GroupLayout(panelSignosV);
        panelSignosV.setLayout(panelSignosVLayout);
        panelSignosVLayout.setHorizontalGroup(
            panelSignosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSignosVLayout.createSequentialGroup()
                .addContainerGap(265, Short.MAX_VALUE)
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
                .addGap(75, 75, 75)
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
                        .addComponent(lblHeader54)))
                .addContainerGap(265, Short.MAX_VALUE))
            .addGroup(panelSignosVLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHeader4)
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
                    .addComponent(panelSignosV, javax.swing.GroupLayout.DEFAULT_SIZE, 1018, Short.MAX_VALUE)
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
                .addContainerGap(204, Short.MAX_VALUE))
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
        cmbAntecedentessEnfCat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbAntecedentessEnfCatItemStateChanged(evt);
            }
        });

        cmbAntecedentessEnf.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cmbAntecedentessEnf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENFERMEDAD 1", "ENFERMEDAD 2", "ENFERMEDAD 3" }));
        cmbAntecedentessEnf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jtAntecedentes.setBackground(new java.awt.Color(204, 204, 204));
        jtAntecedentes.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jtAntecedentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        jtAntecedentes.setGridColor(new java.awt.Color(255, 255, 153));
        jtAntecedentes.setRowHeight(25);
        jtAntecedentes.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jtAntecedentes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtAntecedentes.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtAntecedentes);
        if (jtAntecedentes.getColumnModel().getColumnCount() > 0) {
            jtAntecedentes.getColumnModel().getColumn(0).setMaxWidth(50);
            jtAntecedentes.getColumnModel().getColumn(2).setMaxWidth(50);
        }

        btnAggAntecedente.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnAggAntecedente.setForeground(new java.awt.Color(255, 255, 255));
        btnAggAntecedente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAggAntecedente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cruz.png"))); // NOI18N
        btnAggAntecedente.setText("Agregar Antecedente");
        btnAggAntecedente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        btnAggAntecedente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAggAntecedente.setFocusable(false);
        btnAggAntecedente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAggAntecedente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAggAntecedenteMouseClicked(evt);
            }
        });

        btnBuscarAntecedente.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarAntecedente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBuscarAntecedente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchCat.png"))); // NOI18N
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
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblHeader62, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                .addComponent(lblHeader56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblHeader63))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbAntecedentessEnfCat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbAntecedentessEnf, 0, 898, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtBuscarAntecedente, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarAntecedente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblHeader5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addComponent(btnAggAntecedente, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(btnAggAntecedente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1018, Short.MAX_VALUE)
                .addContainerGap())
        );
        TAB_ANTECEDENTESLayout.setVerticalGroup(
            TAB_ANTECEDENTESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TAB_ANTECEDENTESLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
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
                        .addGap(0, 401, Short.MAX_VALUE)
                        .addComponent(lblHeader6)
                        .addGap(0, 401, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
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
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1018, Short.MAX_VALUE)
                .addContainerGap())
        );
        TAB_EXAMEN_FILayout.setVerticalGroup(
            TAB_EXAMEN_FILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TAB_EXAMEN_FILayout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
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
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 953, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(lblHeader9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(102, 0, 0));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));
        jPanel7.setPreferredSize(new java.awt.Dimension(480, 150));

        lblHeader15.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader15.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader15.setText("DIAGNÓSTICOS");

        lblHeader57.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader57.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader57.setText("Buscar Categoría:");

        txtBuscarDiagnostico.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtBuscarDiagnostico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader66.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader66.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader66.setText("Categoría:");

        lblHeader67.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader67.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader67.setText("Enfermedad:");

        cmbDiagnosticoCats.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cmbDiagnosticoCats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CATEGORIA 1", "CATEGORIA 2", "CATEGORIA 3", "CATEGORIA 4" }));
        cmbDiagnosticoCats.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));
        cmbDiagnosticoCats.setMaximumSize(new java.awt.Dimension(350, 27));
        cmbDiagnosticoCats.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDiagnosticoCatsItemStateChanged(evt);
            }
        });

        cmbDiagnosticoEnfs.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cmbDiagnosticoEnfs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENFERMEDAD 1", "ENFERMEDAD 2", "ENFERMEDAD 3" }));
        cmbDiagnosticoEnfs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jtDiagnosticos.setBackground(new java.awt.Color(204, 204, 204));
        jtDiagnosticos.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jtDiagnosticos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        jtDiagnosticos.setGridColor(new java.awt.Color(255, 255, 153));
        jtDiagnosticos.setRowHeight(25);
        jtDiagnosticos.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jtDiagnosticos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtDiagnosticos.getTableHeader().setReorderingAllowed(false);
        jScrollPane12.setViewportView(jtDiagnosticos);
        if (jtDiagnosticos.getColumnModel().getColumnCount() > 0) {
            jtDiagnosticos.getColumnModel().getColumn(0).setMaxWidth(50);
            jtDiagnosticos.getColumnModel().getColumn(2).setMaxWidth(50);
        }

        btnAggDiagnostico.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnAggDiagnostico.setForeground(new java.awt.Color(255, 255, 255));
        btnAggDiagnostico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAggDiagnostico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cruz.png"))); // NOI18N
        btnAggDiagnostico.setText("Agregar Diagnóstico");
        btnAggDiagnostico.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        btnAggDiagnostico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAggDiagnostico.setFocusable(false);
        btnAggDiagnostico.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAggDiagnostico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAggDiagnosticoMouseClicked(evt);
            }
        });

        btnBuscarDiagnostico.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarDiagnostico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBuscarDiagnostico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchCat.png"))); // NOI18N
        btnBuscarDiagnostico.setToolTipText("");
        btnBuscarDiagnostico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarDiagnostico.setFocusable(false);
        btnBuscarDiagnostico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarDiagnostico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscarDiagnostico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarDiagnosticoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblHeader57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeader67, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeader66, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbDiagnosticoCats, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbDiagnosticoEnfs, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(txtBuscarDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 41, Short.MAX_VALUE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(0, 400, Short.MAX_VALUE)
                        .addComponent(btnAggDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 332, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblHeader15)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(lblHeader15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarDiagnostico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHeader57)
                        .addComponent(txtBuscarDiagnostico)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDiagnosticoCats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeader66))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDiagnosticoEnfs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeader67))
                .addGap(28, 28, 28)
                .addComponent(btnAggDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout TAB_DIAGNOSTICOLayout = new javax.swing.GroupLayout(TAB_DIAGNOSTICO);
        TAB_DIAGNOSTICO.setLayout(TAB_DIAGNOSTICOLayout);
        TAB_DIAGNOSTICOLayout.setHorizontalGroup(
            TAB_DIAGNOSTICOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TAB_DIAGNOSTICOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TAB_DIAGNOSTICOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 1018, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1018, Short.MAX_VALUE))
                .addContainerGap())
        );
        TAB_DIAGNOSTICOLayout.setVerticalGroup(
            TAB_DIAGNOSTICOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAB_DIAGNOSTICOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        jTabbedPane1.addTab("DIAGNÓSTICO", TAB_DIAGNOSTICO);

        TAB_TRATAMIENTO.setBackground(new java.awt.Color(102, 0, 0));

        jPanel10.setBackground(new java.awt.Color(102, 0, 0));
        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));
        jPanel10.setPreferredSize(new java.awt.Dimension(480, 150));

        lblHeader11.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader11.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader11.setText("RECETA");

        jtReceta.setBackground(new java.awt.Color(204, 204, 204));
        jtReceta.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jtReceta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Medicamento", "Dosis", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtReceta.setGridColor(new java.awt.Color(255, 255, 153));
        jtReceta.setRowHeight(25);
        jtReceta.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jtReceta.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtReceta.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(jtReceta);
        if (jtReceta.getColumnModel().getColumnCount() > 0) {
            jtReceta.getColumnModel().getColumn(0).setMaxWidth(40);
            jtReceta.getColumnModel().getColumn(3).setMaxWidth(60);
        }

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
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(102, 0, 0));
        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        jtMedicamentos.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jtMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Medicamento", "Presentación", "Stock", "Fecha de vencimiento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtMedicamentos.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jtMedicamentos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane9.setViewportView(jtMedicamentos);
        if (jtMedicamentos.getColumnModel().getColumnCount() > 0) {
            jtMedicamentos.getColumnModel().getColumn(0).setMaxWidth(40);
            jtMedicamentos.getColumnModel().getColumn(3).setMaxWidth(50);
        }

        btnAddReceta.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnAddReceta.setForeground(new java.awt.Color(255, 255, 255));
        btnAddReceta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAddReceta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cruz.png"))); // NOI18N
        btnAddReceta.setText("Añadir a receta");
        btnAddReceta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        btnAddReceta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddReceta.setFocusable(false);
        btnAddReceta.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAddReceta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddRecetaMouseClicked(evt);
            }
        });

        lblHeader70.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader70.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader70.setText("CANTIDAD:");

        txtMedicamentoCantidad.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtMedicamentoCantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblMedicamentoPara.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblMedicamentoPara.setForeground(new java.awt.Color(255, 255, 255));
        lblMedicamentoPara.setText("Medicamento para \"Nombre Paciente\"");

        lblHeader58.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader58.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader58.setText("DOSIS:");

        txtMedicamentoDosis.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtMedicamentoDosis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jPanel2.setBackground(new java.awt.Color(102, 0, 0));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 153), 1, true));

        lblHeader68.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader68.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader68.setText("BUSCAR POR NOMBRE MEDICAMENTO:");

        txtBuscarMedicamento.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtBuscarMedicamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        btnBuscarMedicamento.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarMedicamento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnBuscarMedicamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnBuscarMedicamento.setText("BUSCAR");
        btnBuscarMedicamento.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnBuscarMedicamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarMedicamento.setFocusable(false);
        btnBuscarMedicamento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarMedicamento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscarMedicamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMedicamentoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblHeader68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(152, 152, 152))
                    .addComponent(txtBuscarMedicamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarMedicamento))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscarMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblHeader68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscarMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)))
                .addGap(4, 4, 4))
        );

        jPanel3.setBackground(new java.awt.Color(102, 0, 0));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 153), 1, true));

        lblHeader69.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader69.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader69.setText("BUSCAR POR CATEGORÍA:");

        cmbCatMedicamento.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cmbCatMedicamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        btnBuscarCatMedicamento.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCatMedicamento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnBuscarCatMedicamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnBuscarCatMedicamento.setText("BUSCAR");
        btnBuscarCatMedicamento.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnBuscarCatMedicamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarCatMedicamento.setFocusable(false);
        btnBuscarCatMedicamento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarCatMedicamento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscarCatMedicamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarCatMedicamentoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblHeader69)
                        .addGap(0, 232, Short.MAX_VALUE))
                    .addComponent(cmbCatMedicamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarCatMedicamento))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnBuscarCatMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblHeader69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCatMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
                            .addComponent(txtMedicamentoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMedicamentoDosis, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAddReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblMedicamentoPara)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addComponent(lblMedicamentoPara)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader70)
                            .addComponent(txtMedicamentoCantidad))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader58)
                            .addComponent(txtMedicamentoDosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnAddReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnTerminarConsulta.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnTerminarConsulta.setForeground(new java.awt.Color(255, 255, 255));
        btnTerminarConsulta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTerminarConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnTerminarConsulta.setText("Guardar Expediente y Finalizar Consulta");
        btnTerminarConsulta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        btnTerminarConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1018, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTerminarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1071, Short.MAX_VALUE)
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

    public DefaultComboBoxModel llenarComboBoxsCIE10cats(String _cat, String _tipo) throws SQLException{
        Object[] arrays = this.conn.getCIE10Cats(_cat);
        DefaultComboBoxModel model = new DefaultComboBoxModel( (Object[]) arrays[1] );
        //llenar arraysIds
        if (_tipo.equals("A")){
            this.idCatsAntecedentes = (String[]) arrays[0];
            this.cmbAntecedentessEnf.setModel(this.llenarComboBoxsCIE10enfs(this.idCatsAntecedentes[0], "A"));
        } else{
            this.idCatsDiagnosticos = (String[]) arrays[0];
            this.cmbDiagnosticoEnfs.setModel(this.llenarComboBoxsCIE10enfs(this.idCatsDiagnosticos[0], "D"));
        }
        
        return model;
    }
    
    public DefaultComboBoxModel llenarComboBoxsCIE10enfs(String _idCat, String _tipo) throws SQLException{
        Object[] arrays = this.conn.getCIE10Enfs(_idCat);
        if(_tipo.equals("A")){
            this.idEnfsAntecedentes = (String[]) arrays[0];
        } else{
            this.idEnfsDiagnosticos = (String[]) arrays[0];
        }
        DefaultComboBoxModel model = new DefaultComboBoxModel( (Object[]) arrays[2] );
        return model;
    }
    
    public void llenarCatsMedicamento() throws SQLException{
        // llenar el combobox de categorias de medicamentos
        Object[] array = this.conn.llenarCatsMedicamentos((JComboBox) cmbCatMedicamento);
        
        this.idCatsMedicamentos = (int[]) array[1];
        this.cmbCatMedicamento.setModel((DefaultComboBoxModel)array[0]);
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
        
        consulta.receta = this.receta;
        
        String validacion = consulta.validarConsulta();
        
        if(validacion.equals("")){
            try {
                //Agregar consulta con procedimiento almecenado
                String mensaje = this.conn.aggDetConsulta(consulta);
                JOptionPane.showMessageDialog(rootPane, mensaje);
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(Consultorio_Consulta.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else {
            //error de validación
            JOptionPane.showMessageDialog(rootPane, validacion);
            System.out.println(validacion);
        }
        //agregar antecedentes, diagnosticos y receta con el Id obtenido de la consulta
    }//GEN-LAST:event_btnTerminarConsultaMouseClicked

    private void btnBuscarAntecedenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarAntecedenteMouseClicked
        // buscar antecedentes
        try {
            String cat = this.txtBuscarAntecedente.getText();
            this.cmbAntecedentessEnfCat.setModel(this.llenarComboBoxsCIE10cats(cat.toUpperCase(), "A"));
        } catch (SQLException ex) {
            Logger.getLogger(Consultorio_Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarAntecedenteMouseClicked

    private void btnAggAntecedenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggAntecedenteMouseClicked
        // Agregar antecedente a la tabla
        String idC = this.idCatsAntecedentes[this.cmbAntecedentessEnfCat.getSelectedIndex()];
        String idE = this.idEnfsAntecedentes[this.cmbAntecedentessEnf.getSelectedIndex()];
        String cat = this.cmbAntecedentessEnfCat.getSelectedItem().toString();
        String enf = this.cmbAntecedentessEnf.getSelectedItem().toString();

        DefaultTableModel modelo = (DefaultTableModel) this.jtAntecedentes.getModel();
        if (this.verEnfRep(modelo, idE) == false){
            this.jtAntecedentes.setModel(this.aggEnfermedadJt(modelo, idE, idC, enf, cat));
        }
    }//GEN-LAST:event_btnAggAntecedenteMouseClicked

    private void cmbAntecedentessEnfCatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbAntecedentessEnfCatItemStateChanged
        try {
            // Llenar enfermedades segun la cat cambiada en el combobox
            String idCat = this.idCatsAntecedentes[this.cmbAntecedentessEnfCat.getSelectedIndex()];
            this.cmbAntecedentessEnf.setModel(this.llenarComboBoxsCIE10enfs(idCat, "A"));
        } catch (SQLException ex) {
            Logger.getLogger(Consultorio_Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbAntecedentessEnfCatItemStateChanged

    private void cmbDiagnosticoCatsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDiagnosticoCatsItemStateChanged
        // LLenar combo box de enfermedades según categoria seleccinada
        try {
            String idCat = this.idCatsDiagnosticos[this.cmbDiagnosticoCats.getSelectedIndex()];
            this.cmbDiagnosticoEnfs.setModel(this.llenarComboBoxsCIE10enfs(idCat, "D"));
        } catch (SQLException ex) {
            Logger.getLogger(Consultorio_Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbDiagnosticoCatsItemStateChanged

    private void btnAggDiagnosticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggDiagnosticoMouseClicked
        // Agregar diagnostico a la tabla
        String idC = this.idCatsDiagnosticos[this.cmbDiagnosticoCats.getSelectedIndex()];
        String idE = this.idEnfsDiagnosticos[this.cmbDiagnosticoEnfs.getSelectedIndex()];
        String cat = this.cmbDiagnosticoCats.getSelectedItem().toString();
        String enf = this.cmbDiagnosticoEnfs.getSelectedItem().toString();

        DefaultTableModel modelo = (DefaultTableModel) this.jtDiagnosticos.getModel();
        if (this.verEnfRep(modelo, idE) == false){
            this.jtDiagnosticos.setModel(this.aggEnfermedadJt(modelo, idE, idC, enf, cat));
        }
    }//GEN-LAST:event_btnAggDiagnosticoMouseClicked

    private void btnBuscarDiagnosticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarDiagnosticoMouseClicked
        // Buscar diagnosticos
        try {
            String cat = this.txtBuscarDiagnostico.getText();
            this.cmbDiagnosticoCats.setModel(this.llenarComboBoxsCIE10cats(cat, "D"));
        } catch (SQLException ex) {
            Logger.getLogger(Consultorio_Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarDiagnosticoMouseClicked

    private void btnBuscarCatMedicamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCatMedicamentoMouseClicked
        // LLenar el Jtable de medicamentos segun la categoria elegida en el combobox
        try {
            int idCat = this.idCatsMedicamentos[this.cmbCatMedicamento.getSelectedIndex()];
            this.jtMedicamentos.setModel(this.conn.getMedicamentos(jtMedicamentos, idCat));
        } catch (SQLException ex) {
            Logger.getLogger(Consultorio_Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnBuscarCatMedicamentoMouseClicked

    private void btnBuscarMedicamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMedicamentoMouseClicked
        // LLenar el Jtable de medicamentos segun el nombre del medicamento
        try {
            String idMed = this.txtBuscarMedicamento.getText();
            this.jtMedicamentos.setModel(this.conn.getMedicamento(jtMedicamentos, idMed));
        } catch (SQLException ex) {
            Logger.getLogger(Consultorio_Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarMedicamentoMouseClicked

    private void btnAddRecetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddRecetaMouseClicked
        //Agregar un medicamento a la jtable de receta
        try {
            float cantidad = Float.parseFloat(this.txtMedicamentoCantidad.getText());
            String dosis = this.txtMedicamentoDosis.getText();
            if (this.jtMedicamentos.getSelectedRows().length == 1 && cantidad > 0 && !"".equals(dosis))
            {
                int fila = this.jtMedicamentos.getSelectedRow();
                String idMed = this.jtMedicamentos.getValueAt(fila, 0).toString();
                String med = this.jtMedicamentos.getValueAt(fila, 1).toString();

                DefaultTableModel modelo = (DefaultTableModel) this.jtReceta.getModel();
                if (this.verRecetaRep(modelo, idMed) == false){
                    String[] newRow = new String[]{idMed, med, dosis, String.valueOf(cantidad)};
                    this.receta.aggRow(newRow);
                    this.jtReceta.setModel(this.aggRecetaJt(modelo, newRow));
                }
            }
        } catch (Exception e) {
            // mostarra validaciones en un messsageBox
            System.out.println("Ingrese correctamente" + e);
        }
    }//GEN-LAST:event_btnAddRecetaMouseClicked

    public DefaultTableModel aggEnfermedadJt(DefaultTableModel _modelo,String _idE, String _idC, String _enf, String _cat){
        String[] newRow = new String[]{_idC, _cat, _idE, _enf};
        _modelo.addRow(newRow);
        return _modelo;
    }
    
    public DefaultTableModel aggRecetaJt(DefaultTableModel _modelo,String[] _row){
        _modelo.addRow(_row);
        return _modelo;
    }
    
    public boolean verEnfRep(DefaultTableModel _modelo, String _idEnf){
        boolean repetida = false;
        int filas = _modelo.getRowCount();
        for(int i = 0; i<filas; i++){
            if(_idEnf.equals(_modelo.getValueAt(i, 2))){
                repetida = true;
            }
        }
        return repetida;
    }
    
    public boolean verRecetaRep(DefaultTableModel _modelo, String _idMed){
        boolean repetida = false;
        int filas = _modelo.getRowCount();
        for(int i = 0; i<filas; i++){
            if(_idMed.equals(_modelo.getValueAt(i, 0))){
                repetida = true;
            }
        }
        return repetida;
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
    private javax.swing.JLabel btnAddReceta;
    private javax.swing.JLabel btnAggAntecedente;
    private javax.swing.JLabel btnAggDiagnostico;
    private javax.swing.JLabel btnBuscarAntecedente;
    private javax.swing.JLabel btnBuscarCatMedicamento;
    private javax.swing.JLabel btnBuscarDiagnostico;
    private javax.swing.JLabel btnBuscarMedicamento;
    private javax.swing.JLabel btnHistorial;
    private javax.swing.JLabel btnTerminarConsulta;
    private javax.swing.JLabel btn_close;
    private javax.swing.JComboBox<String> cmbAntecedentessEnf;
    private javax.swing.JComboBox<String> cmbAntecedentessEnfCat;
    private javax.swing.JComboBox<String> cmbCatMedicamento;
    private javax.swing.JComboBox<String> cmbDiagnosticoCats;
    private javax.swing.JComboBox<String> cmbDiagnosticoEnfs;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jtAntecedentes;
    private javax.swing.JTable jtDiagnosticos;
    private javax.swing.JTable jtMedicamentos;
    private javax.swing.JTable jtReceta;
    private javax.swing.JLabel lblActividad;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblHeader1;
    private javax.swing.JLabel lblHeader10;
    private javax.swing.JLabel lblHeader11;
    private javax.swing.JLabel lblHeader12;
    private javax.swing.JLabel lblHeader13;
    private javax.swing.JLabel lblHeader14;
    private javax.swing.JLabel lblHeader15;
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
    private javax.swing.JLabel lblHeader57;
    private javax.swing.JLabel lblHeader58;
    private javax.swing.JLabel lblHeader6;
    private javax.swing.JLabel lblHeader62;
    private javax.swing.JLabel lblHeader63;
    private javax.swing.JLabel lblHeader66;
    private javax.swing.JLabel lblHeader67;
    private javax.swing.JLabel lblHeader68;
    private javax.swing.JLabel lblHeader69;
    private javax.swing.JLabel lblHeader70;
    private javax.swing.JLabel lblHeader8;
    private javax.swing.JLabel lblHeader9;
    private javax.swing.JLabel lblMedicamentoPara;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombrePac;
    private javax.swing.JPanel panelDatosPac;
    private javax.swing.JPanel panelSignosV;
    private javax.swing.JTextField txtBuscarAntecedente;
    private javax.swing.JTextField txtBuscarDiagnostico;
    private javax.swing.JTextField txtBuscarMedicamento;
    private javax.swing.JTextField txtFrecCardiaca;
    private javax.swing.JTextField txtMedicamentoCantidad;
    private javax.swing.JTextField txtMedicamentoDosis;
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
