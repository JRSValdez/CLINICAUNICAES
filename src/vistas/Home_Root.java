
package vistas;

import Classes.ConexionDB;
import Classes.Medicamento;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author JRSVALDEZ
 */
public class Home_Root extends javax.swing.JFrame {

    int xx, xy;
    int xs, ys, sbx,sby;
    
    ConexionDB conn = new ConexionDB();
    
    int[] idPresentacion;
    int[] idCatsMed;
    int[] idUnidadesMed;
    
    int[] idBusquedaPresMed;
    int[] idBusquedaCatsMed;
    
    public Home_Root() throws SQLException {
        initComponents();
        
        //FECHA DEL SISTEMA
        Date sistFecha=new Date();
        SimpleDateFormat formato=new SimpleDateFormat("dd/MMMMM/YYYY");
        lblFecha.setText(formato.format(sistFecha)); 
        
        this.jTFarmacia.setSelectionForeground(Color.white);
        xs = this.Contenedor.getWidth();
        ys = this.Contenedor.getHeight();
        sbx = this.SideBar.getWidth();
        sby = this.SideBar.getHeight();
        
        this.llenarMedicamentosFarmacia();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        pUpBuscarMedicamento = new javax.swing.JPopupMenu();
        itemNombreMed = new javax.swing.JMenuItem();
        itemFechaV = new javax.swing.JMenuItem();
        itemCatMed = new javax.swing.JMenuItem();
        itemPresMed = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        SideBar = new javax.swing.JPanel();
        Botonera = new javax.swing.JPanel();
        btn_users = new javax.swing.JButton();
        btn_farmacia = new javax.swing.JButton();
        btn_home = new javax.swing.JButton();
        btn_docs = new javax.swing.JButton();
        btn_reports = new javax.swing.JButton();
        btn_config = new javax.swing.JButton();
        Contenedor = new javax.swing.JTabbedPane();
        Tab_home = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        lblMedxVencer = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        lblDoctores = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        lblPacientes = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        lblConsultas = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        lblMedicamentos = new javax.swing.JLabel();
        Tab_Doctores = new javax.swing.JPanel();
        jPanelEstNuevo = new javax.swing.JPanel();
        lblHeader21 = new javax.swing.JLabel();
        lblHeader26 = new javax.swing.JLabel();
        lblHeader31 = new javax.swing.JLabel();
        lblHeader37 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jTextField18 = new javax.swing.JTextField();
        lblHeader39 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        lblHeader40 = new javax.swing.JLabel();
        lblHeader43 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox<>();
        lblHeader44 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        lblHeader58 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTFarmacia2 = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        Tab_Farmacia = new javax.swing.JPanel();
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
        lblHeader63 = new javax.swing.JLabel();
        txtFechaV = new javax.swing.JFormattedTextField();
        txtCantMedicamento = new javax.swing.JFormattedTextField();
        jPanel8 = new javax.swing.JPanel();
        lblHeader56 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTFarmacia = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        btnEditMedicamento = new javax.swing.JLabel();
        lblHeader68 = new javax.swing.JLabel();
        txtBuscarNombreMed = new javax.swing.JTextField();
        lblHeader69 = new javax.swing.JLabel();
        cboBuscarCatMed = new javax.swing.JComboBox<>();
        btnBuscarMed = new javax.swing.JLabel();
        txtBuscarFechaV = new javax.swing.JTextField();
        lblHeader70 = new javax.swing.JLabel();
        lblHeader71 = new javax.swing.JLabel();
        cboBuscarPresentacionMed = new javax.swing.JComboBox<>();
        Tab_Usuarios = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        lblHeader15 = new javax.swing.JLabel();
        lblHeader16 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        lblHeader36 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        lblHeader18 = new javax.swing.JLabel();
        lblHeader14 = new javax.swing.JLabel();
        lblHeader38 = new javax.swing.JLabel();
        jComboBox14 = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        lblHeader57 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTFarmacia1 = new javax.swing.JTable();
        Tab_reports = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanelEstNuevo4 = new javax.swing.JPanel();
        lblHeader32 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        lblHeader33 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        lblHeader34 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jCheckBox4 = new javax.swing.JCheckBox();
        lblHeader35 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox<>();
        jCheckBox5 = new javax.swing.JCheckBox();
        lblHeader41 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox<>();
        lblHeader42 = new javax.swing.JLabel();
        jCheckBox6 = new javax.swing.JCheckBox();
        jTextField21 = new javax.swing.JTextField();
        jCheckBox7 = new javax.swing.JCheckBox();
        lblHeader49 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        lblHeader54 = new javax.swing.JLabel();
        jCheckBox9 = new javax.swing.JCheckBox();
        jComboBox16 = new javax.swing.JComboBox<>();
        lblHeader59 = new javax.swing.JLabel();
        jCheckBox10 = new javax.swing.JCheckBox();
        jComboBox17 = new javax.swing.JComboBox<>();
        jPanelEstNuevo5 = new javax.swing.JPanel();
        lblHeader50 = new javax.swing.JLabel();
        lblHeader52 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        lblHeader53 = new javax.swing.JLabel();
        jComboBox15 = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanelEstNuevo6 = new javax.swing.JPanel();
        lblHeader51 = new javax.swing.JLabel();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        lblHeader60 = new javax.swing.JLabel();
        jCheckBox12 = new javax.swing.JCheckBox();
        lblHeader61 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jCheckBox13 = new javax.swing.JCheckBox();
        lblHeader62 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jPanelEstNuevo7 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTbusqueda2 = new javax.swing.JTable();
        Tab_Config = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTcategorias = new javax.swing.JTable();
        lblHeader2 = new javax.swing.JLabel();
        lblHeader3 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTfacultades = new javax.swing.JTable();
        lblHeader4 = new javax.swing.JLabel();
        lblHeader5 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTcarreras = new javax.swing.JTable();
        lblHeader6 = new javax.swing.JLabel();
        lblHeader7 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lblHeader8 = new javax.swing.JLabel();
        jComboBox12 = new javax.swing.JComboBox<>();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTactividades = new javax.swing.JTable();
        lblHeader9 = new javax.swing.JLabel();
        lblHeader10 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTunidades = new javax.swing.JTable();
        lblHeader11 = new javax.swing.JLabel();
        lblHeader12 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTactividades1 = new javax.swing.JTable();
        lblHeader13 = new javax.swing.JLabel();
        lblHeader17 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        Barra_Superior = new javax.swing.JPanel();
        btnHome2 = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();
        btn_close = new javax.swing.JLabel();
        lblHeader1 = new javax.swing.JLabel();
        btn_maximize = new javax.swing.JLabel();
        btn_minimize = new javax.swing.JLabel();

        itemNombreMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pill.png"))); // NOI18N
        itemNombreMed.setText("por Nombre");
        itemNombreMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNombreMedActionPerformed(evt);
            }
        });
        pUpBuscarMedicamento.add(itemNombreMed);

        itemFechaV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/popUp_fecha.png"))); // NOI18N
        itemFechaV.setText("por Fecha Vencimiento");
        itemFechaV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFechaVActionPerformed(evt);
            }
        });
        pUpBuscarMedicamento.add(itemFechaV);

        itemCatMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/popUp_Carrera.png"))); // NOI18N
        itemCatMed.setText("por Categorá");
        itemCatMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCatMedActionPerformed(evt);
            }
        });
        pUpBuscarMedicamento.add(itemCatMed);

        itemPresMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lista.png"))); // NOI18N
        itemPresMed.setText("por Presentación");
        itemPresMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPresMedActionPerformed(evt);
            }
        });
        pUpBuscarMedicamento.add(itemPresMed);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        setMinimumSize(new java.awt.Dimension(1280, 700));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setMaximumSize(null);
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 700));

        SideBar.setBackground(new java.awt.Color(255, 250, 118));
        SideBar.setMinimumSize(new java.awt.Dimension(270, 328));
        SideBar.setPreferredSize(new java.awt.Dimension(270, 328));
        SideBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                SideBarMouseDragged(evt);
            }
        });
        SideBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SideBarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SideBarMouseReleased(evt);
            }
        });

        Botonera.setBackground(new java.awt.Color(255, 250, 118));
        Botonera.setMinimumSize(new java.awt.Dimension(265, 306));
        Botonera.setPreferredSize(new java.awt.Dimension(265, 306));

        btn_users.setBackground(new java.awt.Color(0, 0, 0));
        btn_users.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btn_users.setForeground(new java.awt.Color(255, 255, 255));
        btn_users.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pacientes.png"))); // NOI18N
        btn_users.setText("USUARIOS");
        btn_users.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_users.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usersActionPerformed(evt);
            }
        });

        btn_farmacia.setBackground(new java.awt.Color(0, 0, 0));
        btn_farmacia.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btn_farmacia.setForeground(new java.awt.Color(255, 255, 255));
        btn_farmacia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pill.png"))); // NOI18N
        btn_farmacia.setText("FARMACIA");
        btn_farmacia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_farmacia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_farmacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_farmaciaActionPerformed(evt);
            }
        });

        btn_home.setBackground(new java.awt.Color(102, 0, 0));
        btn_home.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btn_home.setForeground(new java.awt.Color(255, 255, 255));
        btn_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_btn.png"))); // NOI18N
        btn_home.setText("HOME");
        btn_home.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_home.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });

        btn_docs.setBackground(new java.awt.Color(0, 0, 0));
        btn_docs.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btn_docs.setForeground(new java.awt.Color(255, 255, 255));
        btn_docs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doctor.png"))); // NOI18N
        btn_docs.setText("DOCTORES");
        btn_docs.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_docs.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_docs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_docsActionPerformed(evt);
            }
        });

        btn_reports.setBackground(new java.awt.Color(0, 0, 0));
        btn_reports.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btn_reports.setForeground(new java.awt.Color(255, 255, 255));
        btn_reports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reportes.png"))); // NOI18N
        btn_reports.setText("REPORTES");
        btn_reports.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_reports.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_reports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportsActionPerformed(evt);
            }
        });

        btn_config.setBackground(new java.awt.Color(0, 0, 0));
        btn_config.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btn_config.setForeground(new java.awt.Color(255, 255, 255));
        btn_config.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/config.png"))); // NOI18N
        btn_config.setText("CONFIGURACIONES");
        btn_config.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_config.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_config.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_configActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BotoneraLayout = new javax.swing.GroupLayout(Botonera);
        Botonera.setLayout(BotoneraLayout);
        BotoneraLayout.setHorizontalGroup(
            BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoneraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_users, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(btn_farmacia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_docs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_reports, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(btn_config, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
                .addContainerGap())
        );
        BotoneraLayout.setVerticalGroup(
            BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotoneraLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_docs, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_farmacia, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_users, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_reports, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_config, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout SideBarLayout = new javax.swing.GroupLayout(SideBar);
        SideBar.setLayout(SideBarLayout);
        SideBarLayout.setHorizontalGroup(
            SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Botonera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(5, Short.MAX_VALUE))
        );
        SideBarLayout.setVerticalGroup(
            SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Botonera, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        Contenedor.setBackground(new java.awt.Color(102, 0, 0));
        Contenedor.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        Contenedor.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        Contenedor.setToolTipText("");
        Contenedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Contenedor.setMaximumSize(null);
        Contenedor.setMinimumSize(new java.awt.Dimension(1000, 700));
        Contenedor.setPreferredSize(new java.awt.Dimension(1000, 705));

        Tab_home.setBackground(new java.awt.Color(102, 0, 0));
        Tab_home.setForeground(new java.awt.Color(255, 255, 255));
        Tab_home.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Tab_home.setMinimumSize(new java.awt.Dimension(990, 660));

        header.setBackground(new java.awt.Color(102, 0, 0));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo U blanco.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("UNIVERSIDAD CATOLICA DE EL SALVADOR");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CLINICA UNIVERSITARIA");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cruz.png"))); // NOI18N

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lblFecha.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("jLabel2");

        jPanel31.setBackground(new java.awt.Color(102, 0, 0));
        jPanel31.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        lblMedxVencer.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblMedxVencer.setForeground(new java.awt.Color(255, 255, 255));
        lblMedxVencer.setText("Medicamentos proximo a vencerse");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblMedxVencer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblMedxVencer)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(102, 0, 0));
        jPanel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        jPanel32.setBackground(new java.awt.Color(102, 0, 0));
        jPanel32.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        jPanel32.setPreferredSize(new java.awt.Dimension(210, 250));

        lblDoctores.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblDoctores.setForeground(new java.awt.Color(255, 255, 255));
        lblDoctores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDoctores.setText("4");

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img1.png"))); // NOI18N

        jLabel50.setFont(new java.awt.Font("Comic Sans MS", 1, 17)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Doctores");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDoctores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                        .addGap(0, 34, Short.MAX_VALUE)
                        .addComponent(jLabel49)
                        .addGap(0, 34, Short.MAX_VALUE))
                    .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50)
                .addGap(18, 18, 18)
                .addComponent(jLabel49)
                .addGap(18, 18, 18)
                .addComponent(lblDoctores)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel33.setBackground(new java.awt.Color(102, 0, 0));
        jPanel33.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        jPanel33.setPreferredSize(new java.awt.Dimension(210, 250));

        lblPacientes.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblPacientes.setForeground(new java.awt.Color(255, 255, 255));
        lblPacientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPacientes.setText("100");

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/estudiante.png"))); // NOI18N

        jLabel53.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Pacientes");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPacientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGap(0, 34, Short.MAX_VALUE)
                        .addComponent(jLabel52)
                        .addGap(0, 34, Short.MAX_VALUE))
                    .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel53)
                .addGap(18, 18, 18)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPacientes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(102, 0, 0));
        jPanel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        jPanel14.setPreferredSize(new java.awt.Dimension(210, 250));

        jLabel54.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Consultas");

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/estetoscopio.png"))); // NOI18N

        lblConsultas.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblConsultas.setForeground(new java.awt.Color(255, 255, 255));
        lblConsultas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConsultas.setText("100");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                        .addContainerGap(42, Short.MAX_VALUE)
                        .addComponent(jLabel55)
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblConsultas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel34.setBackground(new java.awt.Color(102, 0, 0));
        jPanel34.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        jPanel34.setPreferredSize(new java.awt.Dimension(210, 250));

        jLabel57.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Medicamentos");

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/estetoscopio.png"))); // NOI18N

        lblMedicamentos.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblMedicamentos.setForeground(new java.awt.Color(255, 255, 255));
        lblMedicamentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMedicamentos.setText("25");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMedicamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel34Layout.createSequentialGroup()
                        .addContainerGap(40, Short.MAX_VALUE)
                        .addComponent(jLabel58)
                        .addGap(0, 34, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMedicamentos)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 47, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout Tab_homeLayout = new javax.swing.GroupLayout(Tab_home);
        Tab_home.setLayout(Tab_homeLayout);
        Tab_homeLayout.setHorizontalGroup(
            Tab_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab_homeLayout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(lblFecha)
                .addGap(56, 56, 56))
            .addGroup(Tab_homeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(Tab_homeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Tab_homeLayout.setVerticalGroup(
            Tab_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab_homeLayout.createSequentialGroup()
                .addGroup(Tab_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Tab_homeLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblFecha)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        Contenedor.addTab("HOME", null, Tab_home, "");

        Tab_Doctores.setBackground(new java.awt.Color(102, 0, 0));
        Tab_Doctores.setForeground(new java.awt.Color(255, 255, 255));
        Tab_Doctores.setMinimumSize(new java.awt.Dimension(990, 660));
        Tab_Doctores.setPreferredSize(new java.awt.Dimension(990, 660));

        jPanelEstNuevo.setBackground(new java.awt.Color(102, 0, 0));
        jPanelEstNuevo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 2, true));

        lblHeader21.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader21.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader21.setText("NOMBRES:");

        lblHeader26.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader26.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader26.setText("APELLIDOS:");

        lblHeader31.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader31.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader31.setText("SEXO:");

        lblHeader37.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader37.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader37.setText("J.V.P.M");

        jTextField10.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField10.setText("XXXXXXXX");
        jTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jTextField16.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField16.setText("NOMBRE NOMBRE");
        jTextField16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jTextField17.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField17.setText("APELLIDO APELLIDO");
        jTextField17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jRadioButton6.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setSelected(true);
        jRadioButton6.setText("Masculino");

        jRadioButton7.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jRadioButton7.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton7.setText("Femenino");

        jTextField18.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField18.setText("XXXX - XXXX");
        jTextField18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader39.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader39.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader39.setText("FECHA NACIMIENTO:");

        jTextField19.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField19.setText("XXXX - XXXX");
        jTextField19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader40.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader40.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader40.setText("TELÉFONO:");

        lblHeader43.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader43.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader43.setText("ESPECIALIDAD:");

        jComboBox11.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Pedíatra" }));
        jComboBox11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader44.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader44.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader44.setText("DOCTOR NUEVO");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cruz.png"))); // NOI18N
        jLabel9.setText("Agregar Doctor");
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel9.setFocusable(false);
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanelEstNuevoLayout = new javax.swing.GroupLayout(jPanelEstNuevo);
        jPanelEstNuevo.setLayout(jPanelEstNuevoLayout);
        jPanelEstNuevoLayout.setHorizontalGroup(
            jPanelEstNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstNuevoLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanelEstNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblHeader37, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHeader21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHeader31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHeader26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEstNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addGroup(jPanelEstNuevoLayout.createSequentialGroup()
                        .addComponent(jRadioButton6)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanelEstNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEstNuevoLayout.createSequentialGroup()
                        .addGroup(jPanelEstNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblHeader39, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(lblHeader43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeader40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelEstNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField19, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(jTextField18, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(jComboBox11, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(jPanelEstNuevoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHeader44)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelEstNuevoLayout.setVerticalGroup(
            jPanelEstNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstNuevoLayout.createSequentialGroup()
                .addComponent(lblHeader44)
                .addGap(17, 17, 17)
                .addGroup(jPanelEstNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader37)
                    .addComponent(jTextField10)
                    .addComponent(lblHeader39)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanelEstNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader21)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeader43)
                    .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanelEstNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader26)
                    .addComponent(jTextField17)
                    .addComponent(lblHeader40)
                    .addComponent(jTextField18))
                .addGroup(jPanelEstNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEstNuevoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanelEstNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader31)
                            .addComponent(jRadioButton6)
                            .addComponent(jRadioButton7)))
                    .addGroup(jPanelEstNuevoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        jPanel16.setBackground(new java.awt.Color(102, 0, 0));
        jPanel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        lblHeader58.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader58.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader58.setText("LISTA DE DOCTORES");

        jTFarmacia2.setBackground(new java.awt.Color(204, 204, 204));
        jTFarmacia2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTFarmacia2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"2015", "General", "Nombre Apellido", "M", "XXX-XXXX", "33"}
            },
            new String [] {
                "ID", "Especialidad", "Nombre", "Sexo", "Teléfono", "Edad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTFarmacia2.setColumnSelectionAllowed(true);
        jTFarmacia2.setGridColor(new java.awt.Color(255, 255, 153));
        jTFarmacia2.setRowHeight(25);
        jTFarmacia2.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTFarmacia2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTFarmacia2.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(jTFarmacia2);
        jTFarmacia2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(0, 365, Short.MAX_VALUE)
                        .addComponent(lblHeader58)
                        .addGap(0, 389, Short.MAX_VALUE))
                    .addComponent(jScrollPane6))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(lblHeader58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel18.setBackground(new java.awt.Color(102, 0, 0));
        jPanel18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        jLabel27.setText("EDITAR");
        jLabel27.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel27.setFocusable(false);
        jLabel27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel27.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jLabel29.setText("ELIMINAR");
        jLabel29.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel29.setFocusable(false);
        jLabel29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel29.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap(427, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addContainerGap(428, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Tab_DoctoresLayout = new javax.swing.GroupLayout(Tab_Doctores);
        Tab_Doctores.setLayout(Tab_DoctoresLayout);
        Tab_DoctoresLayout.setHorizontalGroup(
            Tab_DoctoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab_DoctoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Tab_DoctoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelEstNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Tab_DoctoresLayout.setVerticalGroup(
            Tab_DoctoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab_DoctoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelEstNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        Contenedor.addTab("DOCTORES", Tab_Doctores);

        Tab_Farmacia.setBackground(new java.awt.Color(102, 0, 0));
        Tab_Farmacia.setMinimumSize(new java.awt.Dimension(990, 660));

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
        btnAggMedicamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cruz.png"))); // NOI18N
        btnAggMedicamento.setText("Agregar Medicamento");
        btnAggMedicamento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        btnAggMedicamento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAggMedicamento.setFocusable(false);
        btnAggMedicamento.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAggMedicamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAggMedicamentoMouseClicked(evt);
            }
        });

        cboCategoriaMed.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cboCategoriaMed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader63.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader63.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader63.setText("CATEGORÍA:");

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
                .addGap(83, 83, 83)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lblHeader45)
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addComponent(lblHeader48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreMedicmento)
                    .addComponent(btnAggMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboPresentacionMed, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(89, 89, 89)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHeader46, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(lblHeader47, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(lblHeader63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboCategoriaMed, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtCantMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(cboUnidadesMed, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtFechaV))
                .addGap(88, 88, 88))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHeader55)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lblHeader55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader48)
                            .addComponent(txtNombreMedicmento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboPresentacionMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHeader45)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboCategoriaMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHeader63))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader46)
                            .addComponent(cboUnidadesMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAggMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeader47)
                    .addComponent(txtFechaV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jPanel8.setBackground(new java.awt.Color(102, 0, 0));
        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        lblHeader56.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader56.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader56.setText("LISTA DE MEDICAMENTOS");

        jTFarmacia.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTFarmacia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Categoría", "Medicamento", "Presentación", "Cantidad", "Fecha de vencimiento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTFarmacia.setRowHeight(20);
        jTFarmacia.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTFarmacia.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane12.setViewportView(jTFarmacia);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(0, 363, Short.MAX_VALUE)
                        .addComponent(lblHeader56)
                        .addGap(0, 363, Short.MAX_VALUE))
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(lblHeader56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel15.setBackground(new java.awt.Color(102, 0, 0));
        jPanel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        btnEditMedicamento.setForeground(new java.awt.Color(255, 255, 255));
        btnEditMedicamento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnEditMedicamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btnEditMedicamento.setText("EDITAR");
        btnEditMedicamento.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEditMedicamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditMedicamento.setFocusable(false);
        btnEditMedicamento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditMedicamento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditMedicamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMedicamentoMouseClicked(evt);
            }
        });

        lblHeader68.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader68.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader68.setText("NOMBRE:");

        txtBuscarNombreMed.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtBuscarNombreMed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader69.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader69.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader69.setText("CATEGORÍA:");

        cboBuscarCatMed.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cboBuscarCatMed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        btnBuscarMed.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarMed.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnBuscarMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnBuscarMed.setText("BUSCAR");
        btnBuscarMed.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnBuscarMed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarMed.setFocusable(false);
        btnBuscarMed.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarMed.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscarMed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMedMouseClicked(evt);
            }
        });

        txtBuscarFechaV.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtBuscarFechaV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader70.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader70.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader70.setText("FECHA V.:");

        lblHeader71.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader71.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader71.setText("PRESENTACIÓN:");

        cboBuscarPresentacionMed.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cboBuscarPresentacionMed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cboBuscarPresentacionMed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHeader68, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(lblHeader69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBuscarNombreMed, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(cboBuscarCatMed, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHeader71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHeader70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscarFechaV)
                    .addComponent(cboBuscarPresentacionMed, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnBuscarMed)
                .addGap(102, 102, 102)
                .addComponent(btnEditMedicamento)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(btnEditMedicamento)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBuscarMed, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblHeader68)
                                    .addComponent(txtBuscarNombreMed)
                                    .addComponent(lblHeader70)
                                    .addComponent(txtBuscarFechaV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblHeader69)
                                    .addComponent(cboBuscarCatMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboBuscarPresentacionMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblHeader71))))
                        .addGap(28, 28, 28))))
        );

        javax.swing.GroupLayout Tab_FarmaciaLayout = new javax.swing.GroupLayout(Tab_Farmacia);
        Tab_Farmacia.setLayout(Tab_FarmaciaLayout);
        Tab_FarmaciaLayout.setHorizontalGroup(
            Tab_FarmaciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab_FarmaciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Tab_FarmaciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Tab_FarmaciaLayout.setVerticalGroup(
            Tab_FarmaciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab_FarmaciaLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Contenedor.addTab("FARMACIA", Tab_Farmacia);

        Tab_Usuarios.setBackground(new java.awt.Color(102, 0, 0));
        Tab_Usuarios.setMinimumSize(new java.awt.Dimension(990, 660));
        Tab_Usuarios.setPreferredSize(new java.awt.Dimension(990, 660));

        jPanel9.setBackground(new java.awt.Color(102, 0, 0));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        lblHeader15.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader15.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader15.setText("USUARIO:");

        lblHeader16.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader16.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader16.setText("CONTRASEÑA:");

        jTextField7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField7.setText("NOMBRE NOMBRE");
        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jTextField8.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader36.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader36.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader36.setText("TIPO:");

        jComboBox10.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recepción", "Doctor" }));
        jComboBox10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cruz.png"))); // NOI18N
        jLabel10.setText("Agregar Usuario");
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel10.setFocusable(false);
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jTextField23.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader18.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader18.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader18.setText("CONTRASEÑA:");

        lblHeader14.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader14.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader14.setText("DATOS USUARIO");

        lblHeader38.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader38.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader38.setText("EMPLEADO:");

        jComboBox14.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado 1", "Empleado 2", "Empleado 3", " " }));
        jComboBox14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHeader18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHeader15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHeader16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(lblHeader36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(lblHeader38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHeader14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(lblHeader14)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader15)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHeader36)
                            .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblHeader38)
                                .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblHeader16)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader18)
                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(102, 0, 0));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        jLabel11.setText("EDITAR");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel11.setFocusable(false);
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jLabel12.setText("DESACTIVAR");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel12.setFocusable(false);
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(40, 40, 40)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addContainerGap())
        );

        jPanel13.setBackground(new java.awt.Color(102, 0, 0));
        jPanel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        lblHeader57.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader57.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader57.setText("LISTA DE USUARIOS");

        jTFarmacia1.setBackground(new java.awt.Color(204, 204, 204));
        jTFarmacia1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTFarmacia1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"123", "Doctor", "José Ricardo Sifontes Valdez", "Activo"}
            },
            new String [] {
                "ID", "Tipo", "Empleado", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTFarmacia1.setColumnSelectionAllowed(true);
        jTFarmacia1.setGridColor(new java.awt.Color(255, 255, 153));
        jTFarmacia1.setRowHeight(25);
        jTFarmacia1.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTFarmacia1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTFarmacia1.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(jTFarmacia1);
        jTFarmacia1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblHeader57)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(lblHeader57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout Tab_UsuariosLayout = new javax.swing.GroupLayout(Tab_Usuarios);
        Tab_Usuarios.setLayout(Tab_UsuariosLayout);
        Tab_UsuariosLayout.setHorizontalGroup(
            Tab_UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab_UsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Tab_UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Tab_UsuariosLayout.setVerticalGroup(
            Tab_UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab_UsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        Contenedor.addTab("USUARIOS", Tab_Usuarios);

        Tab_reports.setBackground(new java.awt.Color(102, 0, 0));
        Tab_reports.setForeground(new java.awt.Color(255, 255, 255));
        Tab_reports.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Tab_reports.setMinimumSize(new java.awt.Dimension(990, 660));
        Tab_reports.setPreferredSize(new java.awt.Dimension(990, 660));

        jPanel35.setBackground(new java.awt.Color(102, 0, 0));
        jPanel35.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        jLabel22.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Consultas");
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanelEstNuevo4.setBackground(new java.awt.Color(102, 0, 0));
        jPanelEstNuevo4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 2, true));
        jPanelEstNuevo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelEstNuevo4MouseClicked(evt);
            }
        });

        lblHeader32.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader32.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader32.setText("FACULTAD:");

        jComboBox5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ING y ARQ", "CC HH", "CC SALUD" }));
        jComboBox5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader33.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader33.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader33.setText("CARRERA:");

        jComboBox6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingemiería en Sistemas" }));
        jComboBox6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jCheckBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jCheckBox3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblHeader34.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader34.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader34.setText("DOCTOR:");

        jComboBox7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DOCTOR 1", "DOCTOR 2", "DOCTOR 3" }));
        jComboBox7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jCheckBox4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblHeader35.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader35.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader35.setText("SEXO:");

        jComboBox8.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        jComboBox8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jCheckBox5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblHeader41.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader41.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader41.setText("ACTIVIDAD:");

        jComboBox9.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Actividad 1", "Actividad 2", "Actividad 3", " " }));
        jComboBox9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader42.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader42.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader42.setText("MOTIVO:");

        jCheckBox6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextField21.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField21.setText("MOTIVO");
        jTextField21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jCheckBox7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblHeader49.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader49.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader49.setText("DIAGNÓSTICO:");

        jTextField25.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField25.setText("DIAGNOSTICO");
        jTextField25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jLabel41.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("FILTROS");
        jLabel41.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblHeader54.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader54.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader54.setText("DEPARTAMENTO:");

        jCheckBox9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jComboBox16.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Santa Ana", "Sonsonate", "Ahuachapan", "San Salvador" }));
        jComboBox16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader59.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader59.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader59.setText("UBICACIÓN:");

        jCheckBox10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jComboBox17.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jComboBox17.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Urbano", "Rural" }));
        jComboBox17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        javax.swing.GroupLayout jPanelEstNuevo4Layout = new javax.swing.GroupLayout(jPanelEstNuevo4);
        jPanelEstNuevo4.setLayout(jPanelEstNuevo4Layout);
        jPanelEstNuevo4Layout.setHorizontalGroup(
            jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstNuevo4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEstNuevo4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel41)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelEstNuevo4Layout.createSequentialGroup()
                        .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEstNuevo4Layout.createSequentialGroup()
                                .addComponent(jCheckBox10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblHeader59, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEstNuevo4Layout.createSequentialGroup()
                                .addComponent(jCheckBox3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblHeader34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEstNuevo4Layout.createSequentialGroup()
                                .addComponent(jCheckBox4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblHeader35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEstNuevo4Layout.createSequentialGroup()
                                .addComponent(jCheckBox5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblHeader41))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEstNuevo4Layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblHeader32, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEstNuevo4Layout.createSequentialGroup()
                                .addComponent(jCheckBox2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblHeader33, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEstNuevo4Layout.createSequentialGroup()
                                .addComponent(jCheckBox9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblHeader54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox16, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox9, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox8, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox6, 0, 312, Short.MAX_VALUE)
                            .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox17, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEstNuevo4Layout.createSequentialGroup()
                        .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEstNuevo4Layout.createSequentialGroup()
                                .addComponent(jCheckBox6)
                                .addGap(6, 6, 6)
                                .addComponent(lblHeader42, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelEstNuevo4Layout.createSequentialGroup()
                                .addComponent(jCheckBox7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblHeader49, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField21)
                            .addComponent(jTextField25))))
                .addContainerGap())
        );
        jPanelEstNuevo4Layout.setVerticalGroup(
            jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEstNuevo4Layout.createSequentialGroup()
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox3)
                    .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHeader34)
                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox4)
                    .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHeader35)
                        .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox5)
                    .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHeader41)
                        .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHeader32)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHeader33)
                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHeader54)
                        .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHeader59)
                        .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblHeader42)
                        .addComponent(jCheckBox6))
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHeader49)
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox7))
                .addContainerGap())
        );

        jPanelEstNuevo5.setBackground(new java.awt.Color(102, 0, 0));
        jPanelEstNuevo5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 2, true));
        jPanelEstNuevo5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelEstNuevo5MouseClicked(evt);
            }
        });

        lblHeader50.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader50.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader50.setText("FECHA INICIO:");

        lblHeader52.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader52.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader52.setText("FECHA FINAL:");

        jTextField26.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField26.setText("XX-XX-XXXX");
        jTextField26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jTextField27.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField27.setText("XX-XX-XXXX");
        jTextField27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader53.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader53.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader53.setText("PERIODO:");

        jComboBox15.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DIÁRIO", "MENSUAL", "ANUAL" }));
        jComboBox15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jLabel42.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("FECHA");
        jLabel42.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accept.png"))); // NOI18N
        jLabel8.setText("GENERAR REPORTE");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel8.setFocusable(false);
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanelEstNuevo5Layout = new javax.swing.GroupLayout(jPanelEstNuevo5);
        jPanelEstNuevo5.setLayout(jPanelEstNuevo5Layout);
        jPanelEstNuevo5Layout.setHorizontalGroup(
            jPanelEstNuevo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstNuevo5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEstNuevo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEstNuevo5Layout.createSequentialGroup()
                        .addGroup(jPanelEstNuevo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblHeader53, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeader50, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeader52, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelEstNuevo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField27, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox15, javax.swing.GroupLayout.Alignment.LEADING, 0, 250, Short.MAX_VALUE)
                            .addComponent(jTextField26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addContainerGap())
                    .addGroup(jPanelEstNuevo5Layout.createSequentialGroup()
                        .addGap(0, 218, Short.MAX_VALUE)
                        .addComponent(jLabel42)
                        .addContainerGap(219, Short.MAX_VALUE))))
        );
        jPanelEstNuevo5Layout.setVerticalGroup(
            jPanelEstNuevo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEstNuevo5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel42)
                .addGroup(jPanelEstNuevo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEstNuevo5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelEstNuevo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader50)
                            .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelEstNuevo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader52)
                            .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelEstNuevo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader53)
                            .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelEstNuevo5Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel8)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel22)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanelEstNuevo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelEstNuevo5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelEstNuevo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanelEstNuevo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel42.setBackground(new java.awt.Color(102, 0, 0));
        jPanel42.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        jLabel28.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Expedientes");
        jLabel28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanelEstNuevo6.setBackground(new java.awt.Color(102, 0, 0));
        jPanelEstNuevo6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 2, true));
        jPanelEstNuevo6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelEstNuevo6MouseClicked(evt);
            }
        });

        lblHeader51.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader51.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader51.setText("APELLIDOS:");

        jCheckBox8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jCheckBox11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblHeader60.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader60.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader60.setText("ID PACIENTE:");

        jCheckBox12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblHeader61.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader61.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader61.setText("NOMBRES:");

        jTextField28.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField28.setText("NOMBRE NOMBRE");
        jTextField28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jTextField30.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField30.setText("APELLIDO APELLIDO");
        jTextField30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jLabel43.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("FILTROS");
        jLabel43.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTextField31.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField31.setText("ID");
        jTextField31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        jLabel13.setText("BUSCAR EXPEDIENTE");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel13.setFocusable(false);
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblHeader62.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader62.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader62.setText("CARNET:");

        jTextField32.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField32.setText("XXXXXXX");
        jTextField32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        javax.swing.GroupLayout jPanelEstNuevo6Layout = new javax.swing.GroupLayout(jPanelEstNuevo6);
        jPanelEstNuevo6.setLayout(jPanelEstNuevo6Layout);
        jPanelEstNuevo6Layout.setHorizontalGroup(
            jPanelEstNuevo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstNuevo6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEstNuevo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEstNuevo6Layout.createSequentialGroup()
                        .addGroup(jPanelEstNuevo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelEstNuevo6Layout.createSequentialGroup()
                                .addComponent(jCheckBox11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblHeader60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelEstNuevo6Layout.createSequentialGroup()
                                .addComponent(jCheckBox8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblHeader51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelEstNuevo6Layout.createSequentialGroup()
                                .addComponent(jCheckBox12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblHeader61, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelEstNuevo6Layout.createSequentialGroup()
                                .addComponent(jCheckBox13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblHeader62, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelEstNuevo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField28)
                            .addComponent(jTextField30, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(jTextField31)
                            .addComponent(jTextField32, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanelEstNuevo6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelEstNuevo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43)
                            .addComponent(jLabel13))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelEstNuevo6Layout.setVerticalGroup(
            jPanelEstNuevo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEstNuevo6Layout.createSequentialGroup()
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEstNuevo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelEstNuevo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHeader60)
                        .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEstNuevo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelEstNuevo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHeader62)
                        .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEstNuevo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelEstNuevo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHeader61)
                        .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEstNuevo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelEstNuevo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHeader51)
                        .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelEstNuevo7.setBackground(new java.awt.Color(102, 0, 0));
        jPanelEstNuevo7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 2, true));
        jPanelEstNuevo7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelEstNuevo7MouseClicked(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("RESULTADOS BUSQUEDA");
        jLabel46.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accept.png"))); // NOI18N
        jLabel15.setText("GENERAR REPORTE");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel15.setFocusable(false);
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jTbusqueda2.setBackground(new java.awt.Color(204, 204, 204));
        jTbusqueda2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTbusqueda2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"12", " 2015SV601", "José Ricardo Sifontes Valdez", "20"}
            },
            new String [] {
                "ID", "Carnet", "Nombre", "Edad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
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
        jScrollPane14.setViewportView(jTbusqueda2);

        javax.swing.GroupLayout jPanelEstNuevo7Layout = new javax.swing.GroupLayout(jPanelEstNuevo7);
        jPanelEstNuevo7.setLayout(jPanelEstNuevo7Layout);
        jPanelEstNuevo7Layout.setHorizontalGroup(
            jPanelEstNuevo7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstNuevo7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel46)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelEstNuevo7Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEstNuevo7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelEstNuevo7Layout.setVerticalGroup(
            jPanelEstNuevo7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEstNuevo7Layout.createSequentialGroup()
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createSequentialGroup()
                        .addComponent(jPanelEstNuevo6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanelEstNuevo7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelEstNuevo6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanelEstNuevo7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout Tab_reportsLayout = new javax.swing.GroupLayout(Tab_reports);
        Tab_reports.setLayout(Tab_reportsLayout);
        Tab_reportsLayout.setHorizontalGroup(
            Tab_reportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab_reportsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );
        Tab_reportsLayout.setVerticalGroup(
            Tab_reportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab_reportsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Tab_reportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        Contenedor.addTab("REPORTES", null, Tab_reports, "");

        Tab_Config.setBackground(new java.awt.Color(102, 0, 0));

        jScrollPane1.setBackground(new java.awt.Color(102, 0, 0));
        jScrollPane1.setBorder(null);

        jPanel2.setBackground(new java.awt.Color(102, 0, 0));

        jPanel3.setBackground(new java.awt.Color(102, 0, 0));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        jPanel4.setBackground(new java.awt.Color(102, 0, 0));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));

        jTcategorias.setBackground(new java.awt.Color(204, 204, 204));
        jTcategorias.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTcategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"23", "Antigripal"}
            },
            new String [] {
                "ID", "Categoría"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTcategorias.setGridColor(new java.awt.Color(255, 255, 153));
        jTcategorias.setRowHeight(25);
        jTcategorias.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTcategorias.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTcategorias.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTcategorias);
        jTcategorias.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        lblHeader2.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        lblHeader2.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader2.setText("CATEGORÍAS DE FARMACIA");

        lblHeader3.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        lblHeader3.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader3.setText("CATEGORÍA:");

        jTextField11.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField11.setText("Categoría");
        jTextField11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cruz.png"))); // NOI18N
        jLabel17.setText("Agregar Categoría");
        jLabel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel17.setFocusable(false);
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jPanel7.setBackground(new java.awt.Color(102, 0, 0));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 2, true));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        jLabel18.setText("EDITAR");
        jLabel18.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel18.setFocusable(false);
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel18.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jLabel19.setText("ELIMINAR");
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel19.setFocusable(false);
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel19.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(40, 40, 40)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblHeader3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblHeader2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(lblHeader2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField11)
                            .addComponent(lblHeader3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        jPanel10.setBackground(new java.awt.Color(102, 0, 0));
        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        jPanel11.setBackground(new java.awt.Color(102, 0, 0));
        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));

        jTfacultades.setBackground(new java.awt.Color(204, 204, 204));
        jTfacultades.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTfacultades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"23", "CC HH"}
            },
            new String [] {
                "ID", "Facultad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTfacultades.setGridColor(new java.awt.Color(255, 255, 153));
        jTfacultades.setRowHeight(25);
        jTfacultades.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTfacultades.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTfacultades.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jTfacultades);
        jTfacultades.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        lblHeader4.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        lblHeader4.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader4.setText("FACULTADES");

        lblHeader5.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        lblHeader5.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader5.setText("FACULTAD:");

        jTextField12.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField12.setText("Facultad");
        jTextField12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cruz.png"))); // NOI18N
        jLabel20.setText("Agregar Facultad");
        jLabel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel20.setFocusable(false);
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jPanel12.setBackground(new java.awt.Color(102, 0, 0));
        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 2, true));

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        jLabel24.setText("EDITAR");
        jLabel24.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel24.setFocusable(false);
        jLabel24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel24.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jLabel25.setText("ELIMINAR");
        jLabel25.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel25.setFocusable(false);
        jLabel25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel25.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(40, 40, 40)
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel24))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(lblHeader5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                    .addComponent(jTextField12))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblHeader4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addComponent(lblHeader4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField12)
                            .addComponent(lblHeader5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        jPanel19.setBackground(new java.awt.Color(102, 0, 0));
        jPanel19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        jPanel20.setBackground(new java.awt.Color(102, 0, 0));
        jPanel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));

        jTcarreras.setBackground(new java.awt.Color(204, 204, 204));
        jTcarreras.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTcarreras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"23", "Carrera", "CC HH"}
            },
            new String [] {
                "ID", "Carrera", "Facultad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTcarreras.setGridColor(new java.awt.Color(255, 255, 153));
        jTcarreras.setRowHeight(25);
        jTcarreras.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTcarreras.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTcarreras.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(jTcarreras);
        jTcarreras.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel20Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 195, Short.MAX_VALUE)
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel20Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        lblHeader6.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        lblHeader6.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader6.setText("CARRERAS");

        lblHeader7.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        lblHeader7.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader7.setText("CARRERAS:");

        jTextField13.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField13.setText("Carrera");
        jTextField13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jLabel26.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cruz.png"))); // NOI18N
        jLabel26.setText("Agregar Carrera");
        jLabel26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel26.setFocusable(false);
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jPanel21.setBackground(new java.awt.Color(102, 0, 0));
        jPanel21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 2, true));

        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        jLabel30.setText("EDITAR");
        jLabel30.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel30.setFocusable(false);
        jLabel30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel30.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jLabel31.setText("ELIMINAR");
        jLabel31.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel31.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel31.setFocusable(false);
        jLabel31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel31.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addGap(40, 40, 40)
                .addComponent(jLabel31)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jLabel30))
                .addContainerGap())
        );

        lblHeader8.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        lblHeader8.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader8.setText("FACULTAD:");

        jComboBox12.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC HH" }));
        jComboBox12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHeader7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblHeader8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                    .addComponent(jTextField13)
                                    .addComponent(jComboBox12, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblHeader6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addComponent(lblHeader6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHeader8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField13)
                            .addComponent(lblHeader7))
                        .addGap(2, 2, 2)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel22.setBackground(new java.awt.Color(102, 0, 0));
        jPanel22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        jPanel23.setBackground(new java.awt.Color(102, 0, 0));
        jPanel23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));

        jTactividades.setBackground(new java.awt.Color(204, 204, 204));
        jTactividades.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTactividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"23", "General"}
            },
            new String [] {
                "ID", "Especialidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTactividades.setColumnSelectionAllowed(true);
        jTactividades.setGridColor(new java.awt.Color(255, 255, 153));
        jTactividades.setRowHeight(25);
        jTactividades.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTactividades.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTactividades.getTableHeader().setReorderingAllowed(false);
        jScrollPane9.setViewportView(jTactividades);
        jTactividades.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        lblHeader9.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        lblHeader9.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader9.setText("ESPECIALIDADES DOCTORES");

        lblHeader10.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        lblHeader10.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader10.setText("ESPECIALIDAD:");

        jTextField14.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField14.setText("Especialidad");
        jTextField14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jLabel32.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cruz.png"))); // NOI18N
        jLabel32.setText("Agregar Especialidad");
        jLabel32.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        jLabel32.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel32.setFocusable(false);
        jLabel32.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jPanel24.setBackground(new java.awt.Color(102, 0, 0));
        jPanel24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 2, true));

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        jLabel33.setText("EDITAR");
        jLabel33.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel33.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel33.setFocusable(false);
        jLabel33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel33.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jLabel34.setText("ELIMINAR");
        jLabel34.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel34.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel34.setFocusable(false);
        jLabel34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel34.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel33)
                .addGap(40, 40, 40)
                .addComponent(jLabel34)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(jLabel33))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(lblHeader10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                    .addComponent(jTextField14))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblHeader9)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addComponent(lblHeader9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField14)
                            .addComponent(lblHeader10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        jPanel25.setBackground(new java.awt.Color(102, 0, 0));
        jPanel25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        jPanel26.setBackground(new java.awt.Color(102, 0, 0));
        jPanel26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));

        jTunidades.setBackground(new java.awt.Color(204, 204, 204));
        jTunidades.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTunidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"23", "CC HH"}
            },
            new String [] {
                "ID", "Unidad de medida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTunidades.setGridColor(new java.awt.Color(255, 255, 153));
        jTunidades.setRowHeight(25);
        jTunidades.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTunidades.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTunidades.getTableHeader().setReorderingAllowed(false);
        jScrollPane10.setViewportView(jTunidades);
        jTunidades.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel26Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel26Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        lblHeader11.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        lblHeader11.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader11.setText("UNIDADES DE MEDIDA");

        lblHeader12.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        lblHeader12.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader12.setText("UNIDAD:");

        jTextField15.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField15.setText("Unidad de medida");
        jTextField15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jLabel35.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cruz.png"))); // NOI18N
        jLabel35.setText("Agregar Unidad");
        jLabel35.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        jLabel35.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel35.setFocusable(false);
        jLabel35.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jPanel27.setBackground(new java.awt.Color(102, 0, 0));
        jPanel27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 2, true));

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        jLabel36.setText("EDITAR");
        jLabel36.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel36.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel36.setFocusable(false);
        jLabel36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel36.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jLabel37.setText("ELIMINAR");
        jLabel37.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel37.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel37.setFocusable(false);
        jLabel37.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel37.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addGap(40, 40, 40)
                .addComponent(jLabel37)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(jLabel36))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(lblHeader12, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                    .addComponent(jTextField15))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblHeader11)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addComponent(lblHeader11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField15)
                            .addComponent(lblHeader12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        jPanel28.setBackground(new java.awt.Color(102, 0, 0));
        jPanel28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        jPanel29.setBackground(new java.awt.Color(102, 0, 0));
        jPanel29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));

        jTactividades1.setBackground(new java.awt.Color(204, 204, 204));
        jTactividades1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTactividades1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"23", "CC HH"}
            },
            new String [] {
                "ID", "Actividad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTactividades1.setGridColor(new java.awt.Color(255, 255, 153));
        jTactividades1.setRowHeight(25);
        jTactividades1.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTactividades1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTactividades1.getTableHeader().setReorderingAllowed(false);
        jScrollPane11.setViewportView(jTactividades1);
        jTactividades1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 582, Short.MAX_VALUE)
            .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel29Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
            .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel29Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        lblHeader13.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        lblHeader13.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader13.setText("ACTIVIDADES");

        lblHeader17.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        lblHeader17.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader17.setText("ACTIVIDAD:");

        jTextField20.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField20.setText("Actividad");
        jTextField20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jLabel38.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cruz.png"))); // NOI18N
        jLabel38.setText("Agregar Actividad");
        jLabel38.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        jLabel38.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel38.setFocusable(false);
        jLabel38.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jPanel30.setBackground(new java.awt.Color(102, 0, 0));
        jPanel30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 2, true));

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        jLabel39.setText("EDITAR");
        jLabel39.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel39.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel39.setFocusable(false);
        jLabel39.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel39.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jLabel40.setText("ELIMINAR");
        jLabel40.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel40.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel40.setFocusable(false);
        jLabel40.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel40.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel39)
                .addGap(40, 40, 40)
                .addComponent(jLabel40)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addComponent(jLabel39))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addComponent(lblHeader17, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                    .addComponent(jTextField20))
                                .addGap(0, 7, Short.MAX_VALUE))
                            .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblHeader13)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addComponent(lblHeader13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField20)
                            .addComponent(lblHeader17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(1193, Short.MAX_VALUE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(31, 31, 31)))
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout Tab_ConfigLayout = new javax.swing.GroupLayout(Tab_Config);
        Tab_Config.setLayout(Tab_ConfigLayout);
        Tab_ConfigLayout.setHorizontalGroup(
            Tab_ConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab_ConfigLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)
                .addContainerGap())
        );
        Tab_ConfigLayout.setVerticalGroup(
            Tab_ConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab_ConfigLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        Contenedor.addTab("CONFIGURACIONES", Tab_Config);

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

        lblHeader.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader.setText("HOME");

        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btn_close.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
        });

        lblHeader1.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        lblHeader1.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader1.setText("CLÍNICA UNIVERSITARIA - ADMINISTRADOR");

        btn_maximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/maximize.png"))); // NOI18N
        btn_maximize.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_maximize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_maximizeMouseClicked(evt);
            }
        });

        btn_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minimize.png"))); // NOI18N
        btn_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_minimizeMouseClicked(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 307, Short.MAX_VALUE)
                .addComponent(lblHeader)
                .addGap(328, 328, 328)
                .addComponent(btn_minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_maximize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_close)
                .addGap(22, 22, 22))
        );
        Barra_SuperiorLayout.setVerticalGroup(
            Barra_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnHome2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(Barra_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(btn_minimize)
                .addComponent(btn_maximize)
                .addComponent(btn_close)
                .addGroup(Barra_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader)
                    .addComponent(lblHeader1)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Barra_Superior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(SideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Barra_Superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SideBar, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                        .addGap(45, 45, 45))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void llenarMedicamentosFarmacia() throws SQLException{
        this.jTFarmacia.setSelectionForeground(Color.white);
        this.jTFarmacia.setModel(this.conn.getMedicamentos(jTFarmacia));
        
        //llenar presentaciones de medicamentos
        Object[] arrays = this.conn.llenarPresentacionesMed(this.cboPresentacionMed);
        this.idPresentacion = (int[]) arrays[1];
        this.cboPresentacionMed.setModel((DefaultComboBoxModel) arrays[0]);
        
        this.idBusquedaPresMed = (int[]) arrays[1];
        this.cboBuscarPresentacionMed.setModel((DefaultComboBoxModel) arrays[0]);
        
        //llenar tipos de medicamentos
        Object[] arrays2 = this.conn.llenarCatsMedicamentos(this.cboCategoriaMed);
        this.idCatsMed = (int[]) arrays2[1];
        this.cboCategoriaMed.setModel((DefaultComboBoxModel) arrays2[0]);
        
        this.idBusquedaCatsMed = (int[]) arrays2[1];
        this.cboBuscarCatMed.setModel((DefaultComboBoxModel) arrays2[0]);
        
        //llenar unidades de medicamentos
        Object[] arrays3 = this.conn.llenarUnidadesMed(this.cboUnidadesMed);
        this.idUnidadesMed = (int[]) arrays3[1];
        this.cboUnidadesMed.setModel((DefaultComboBoxModel) arrays3[0]);
    }
    
    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
       Object [] opciones ={"Aceptar","Cancelar"};
      int eleccion = JOptionPane.showOptionDialog(rootPane,"¿Esta seguro de cerrar la sesión?","Advertencia",
      JOptionPane.YES_NO_OPTION,
      JOptionPane.QUESTION_MESSAGE,null,opciones,"Aceptar");
      if (eleccion == JOptionPane.YES_OPTION)
      {
       System.exit(0);
       
      }else{
     }
    }//GEN-LAST:event_btn_closeMouseClicked

    private void SideBarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SideBarMouseReleased
        //this.setOpacity((float)1.0);
    }//GEN-LAST:event_SideBarMouseReleased

    private void SideBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SideBarMousePressed
        //this.setOpacity((float)0.8);
        //xx=evt.getX();
        //xy = evt.getY();
    }//GEN-LAST:event_SideBarMousePressed

    private void SideBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SideBarMouseDragged
        //int x = evt.getXOnScreen();
        //int y = evt.getYOnScreen();
        //this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_SideBarMouseDragged

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        this.Contenedor.setSelectedIndex(0);
        this.lblHeader.setText("HOME");
        
        this.btn_home.setBackground(Color.decode("#660000"));
        this.btn_farmacia.setBackground(Color.black);
        this.btn_docs.setBackground(Color.black);
        this.btn_users.setBackground(Color.black);
        this.btn_config.setBackground(Color.black);
        this.btn_reports.setBackground(Color.black);
    }//GEN-LAST:event_btn_homeActionPerformed

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

    private void btn_docsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_docsActionPerformed
        this.Contenedor.setSelectedIndex(1);
        this.lblHeader.setText("DOCTORES");
        
        this.btn_docs.setBackground(Color.decode("#660000"));
        this.btn_home.setBackground(Color.black);
        this.btn_farmacia.setBackground(Color.black);
        this.btn_users.setBackground(Color.black);
        this.btn_reports.setBackground(Color.black);
        this.btn_config.setBackground(Color.black);
    }//GEN-LAST:event_btn_docsActionPerformed

    private void btn_farmaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_farmaciaActionPerformed
        this.Contenedor.setSelectedIndex(2);
        this.lblHeader.setText("FARMACIA");
        
        this.btn_farmacia.setBackground(Color.decode("#660000"));
        this.btn_docs.setBackground(Color.black);
        this.btn_users.setBackground(Color.black);
        this.btn_reports.setBackground(Color.black);
        this.btn_config.setBackground(Color.black);
    }//GEN-LAST:event_btn_farmaciaActionPerformed

    private void btnHome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome2ActionPerformed
        this.Contenedor.setSelectedIndex(0);
        this.lblHeader.setText("HOME");
        
        this.btn_home.setBackground(Color.decode("#660000"));
        this.btn_farmacia.setBackground(Color.black);
        this.btn_docs.setBackground(Color.black);
        this.btn_users.setBackground(Color.black);
        this.btn_reports.setBackground(Color.black);
        this.btn_config.setBackground(Color.black);
    }//GEN-LAST:event_btnHome2ActionPerformed

    private void btn_usersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usersActionPerformed
        this.Contenedor.setSelectedIndex(3);
        this.lblHeader.setText("USUARIOS");

        this.btn_users.setBackground(Color.decode("#660000"));
        this.btn_farmacia.setBackground(Color.black);
        this.btn_docs.setBackground(Color.black);
        this.btn_home.setBackground(Color.black);
        this.btn_reports.setBackground(Color.black);
        this.btn_config.setBackground(Color.black);
    }//GEN-LAST:event_btn_usersActionPerformed

    private void btn_reportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportsActionPerformed
        this.Contenedor.setSelectedIndex(4);
        this.lblHeader.setText("REPORTES");

        this.btn_reports.setBackground(Color.decode("#660000"));
        this.btn_farmacia.setBackground(Color.black);
        this.btn_docs.setBackground(Color.black);
        this.btn_home.setBackground(Color.black);
        this.btn_users.setBackground(Color.black);
        this.btn_config.setBackground(Color.black);
    }//GEN-LAST:event_btn_reportsActionPerformed

    private void btn_maximizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_maximizeMouseClicked
        this.setExtendedState(6);
        int l = this.getHeight();
        int a = this.getWidth() - this.SideBar.getWidth();
        this.Contenedor.setMinimumSize(new Dimension(a, this.Contenedor.getWidth()));
        //this.SideBar.setPreferredSize(new Dimension(sbx,sby));
    }//GEN-LAST:event_btn_maximizeMouseClicked

    private void btn_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizeMouseClicked
        this.setExtendedState(0);
        this.Contenedor.setMinimumSize(new Dimension(xs, ys));
    }//GEN-LAST:event_btn_minimizeMouseClicked

    private void btn_configActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_configActionPerformed
        this.Contenedor.setSelectedIndex(5);
        this.lblHeader.setText("CONFIGURACIONES");

        this.btn_config.setBackground(Color.decode("#660000"));
        this.btn_farmacia.setBackground(Color.black);
        this.btn_docs.setBackground(Color.black);
        this.btn_home.setBackground(Color.black);
        this.btn_users.setBackground(Color.black);
        this.btn_reports.setBackground(Color.black);
    }//GEN-LAST:event_btn_configActionPerformed

    private void jPanelEstNuevo4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEstNuevo4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelEstNuevo4MouseClicked

    private void jPanelEstNuevo5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEstNuevo5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelEstNuevo5MouseClicked

    private void jPanelEstNuevo6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEstNuevo6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelEstNuevo6MouseClicked

    private void jPanelEstNuevo7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEstNuevo7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelEstNuevo7MouseClicked

    private void btnAggMedicamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggMedicamentoMouseClicked
        //Agregar un nuevo medicamento
        try {
            Medicamento med = new Medicamento();
            med.medicamento = this.txtNombreMedicmento.getText();
            med.cantidad = Integer.parseInt(this.txtCantMedicamento.getText());
            med.idPresentacion = this.idPresentacion[this.cboPresentacionMed.getSelectedIndex()];
            med.idUnidad = this.idUnidadesMed[this.cboUnidadesMed.getSelectedIndex()];
            med.idTipoMed = this.idCatsMed[this.cboCategoriaMed.getSelectedIndex()];
            med.fechaV = this.txtFechaV.getText();

            String validacion = med.validarMedicamento();
            if(validacion.equals("")){

                String mensaje = this.conn.aggMedicamento(med);
                JOptionPane.showMessageDialog(rootPane, mensaje);
                this.llenarMedicamentosFarmacia();
            } else {
                //error de validación
                JOptionPane.showMessageDialog(rootPane, validacion);
                System.out.println(validacion);
            }
        } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.toString());
            Logger.getLogger(Home_Recepcion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAggMedicamentoMouseClicked

    private void btnEditMedicamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMedicamentoMouseClicked
        //Editar el medicamento seleccinoado del JTABLE
        if (this.jTFarmacia.getSelectedRows().length == 1)
        {
            try {
                int idMed = Integer.parseInt(this.jTFarmacia.getModel().getValueAt(this.jTFarmacia.getSelectedRow(), 0).toString());
                Medicamento med = this.conn.getMedicamentobyID(idMed);
                Editar_Medicamento form = new Editar_Medicamento(this,med);
                form.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Home_Root.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnEditMedicamentoMouseClicked

    private void btnBuscarMedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMedMouseClicked
        //Buscar medicamento pestaña farmacia
        this.pUpBuscarMedicamento.show(evt.getComponent(), evt.getX(), evt.getY());
    }//GEN-LAST:event_btnBuscarMedMouseClicked

    private void itemNombreMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNombreMedActionPerformed
        // Buscar medicamento por nombre
        try {
            String nombre = this.txtBuscarNombreMed.getText();
            this.jTFarmacia.setModel(this.conn.getMedicamentobyNombre(jTFarmacia, nombre));
        } catch (SQLException ex) {
            Logger.getLogger(Home_Recepcion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemNombreMedActionPerformed

    private void itemFechaVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFechaVActionPerformed
        // Buscar medicamento po fecha de vencimiento
        try {
            String fecha = this.txtBuscarFechaV.getText();
            this.jTFarmacia.setModel(this.conn.getMedicamentosbyFechaV(jTFarmacia, fecha));
        } catch (SQLException ex) {
            Logger.getLogger(Home_Recepcion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemFechaVActionPerformed

    private void itemCatMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCatMedActionPerformed
        // Buscar medicamento por categoría
        try {
            int idCat = this.idBusquedaCatsMed[this.cboBuscarCatMed.getSelectedIndex()];
            this.jTFarmacia.setModel(this.conn.getMedicamentosbyCat(jTFarmacia, idCat));
        } catch (SQLException ex) {
            Logger.getLogger(Home_Recepcion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemCatMedActionPerformed

    private void itemPresMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPresMedActionPerformed
        // Buscar medicamento por presentación
        try {
            int idPres = this.idBusquedaPresMed[this.cboBuscarPresentacionMed.getSelectedIndex()];
            this.jTFarmacia.setModel(this.conn.getMedicamentosbyCat(jTFarmacia, idPres));
        } catch (SQLException ex) {
            Logger.getLogger(Home_Recepcion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemPresMedActionPerformed
    
    public void setPanelEnabled(JPanel panel, Boolean isEnabled) {
    panel.setEnabled(isEnabled);

    Component[] components = panel.getComponents();

    for(int i = 0; i < components.length; i++) {
        if(components[i].getClass().getName().equals("javax.swing.JPanel")) {
            setPanelEnabled((JPanel) components[i], isEnabled);
        }

        components[i].setEnabled(isEnabled);
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
            java.util.logging.Logger.getLogger(Home_Root.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Root.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Root.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Root.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                    new Home_Root().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Home_Root.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra_Superior;
    private javax.swing.JPanel Botonera;
    private javax.swing.JTabbedPane Contenedor;
    private javax.swing.JPanel SideBar;
    private javax.swing.JPanel Tab_Config;
    private javax.swing.JPanel Tab_Doctores;
    private javax.swing.JPanel Tab_Farmacia;
    private javax.swing.JPanel Tab_Usuarios;
    private javax.swing.JPanel Tab_home;
    private javax.swing.JPanel Tab_reports;
    private javax.swing.JLabel btnAggMedicamento;
    private javax.swing.JLabel btnBuscarMed;
    private javax.swing.JLabel btnEditMedicamento;
    private javax.swing.JButton btnHome2;
    private javax.swing.JLabel btn_close;
    private javax.swing.JButton btn_config;
    private javax.swing.JButton btn_docs;
    private javax.swing.JButton btn_farmacia;
    private javax.swing.JButton btn_home;
    private javax.swing.JLabel btn_maximize;
    private javax.swing.JLabel btn_minimize;
    private javax.swing.JButton btn_reports;
    private javax.swing.JButton btn_users;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cboBuscarCatMed;
    private javax.swing.JComboBox<String> cboBuscarPresentacionMed;
    private javax.swing.JComboBox<String> cboCategoriaMed;
    private javax.swing.JComboBox<String> cboPresentacionMed;
    private javax.swing.JComboBox<String> cboUnidadesMed;
    private javax.swing.JPanel header;
    private javax.swing.JMenuItem itemCatMed;
    private javax.swing.JMenuItem itemFechaV;
    private javax.swing.JMenuItem itemNombreMed;
    private javax.swing.JMenuItem itemPresMed;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox16;
    private javax.swing.JComboBox<String> jComboBox17;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelEstNuevo;
    private javax.swing.JPanel jPanelEstNuevo4;
    private javax.swing.JPanel jPanelEstNuevo5;
    private javax.swing.JPanel jPanelEstNuevo6;
    private javax.swing.JPanel jPanelEstNuevo7;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTFarmacia;
    private javax.swing.JTable jTFarmacia1;
    private javax.swing.JTable jTFarmacia2;
    private javax.swing.JTable jTactividades;
    private javax.swing.JTable jTactividades1;
    private javax.swing.JTable jTbusqueda2;
    private javax.swing.JTable jTcarreras;
    private javax.swing.JTable jTcategorias;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTable jTfacultades;
    private javax.swing.JTable jTunidades;
    private javax.swing.JLabel lblConsultas;
    private javax.swing.JLabel lblDoctores;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblHeader1;
    private javax.swing.JLabel lblHeader10;
    private javax.swing.JLabel lblHeader11;
    private javax.swing.JLabel lblHeader12;
    private javax.swing.JLabel lblHeader13;
    private javax.swing.JLabel lblHeader14;
    private javax.swing.JLabel lblHeader15;
    private javax.swing.JLabel lblHeader16;
    private javax.swing.JLabel lblHeader17;
    private javax.swing.JLabel lblHeader18;
    private javax.swing.JLabel lblHeader2;
    private javax.swing.JLabel lblHeader21;
    private javax.swing.JLabel lblHeader26;
    private javax.swing.JLabel lblHeader3;
    private javax.swing.JLabel lblHeader31;
    private javax.swing.JLabel lblHeader32;
    private javax.swing.JLabel lblHeader33;
    private javax.swing.JLabel lblHeader34;
    private javax.swing.JLabel lblHeader35;
    private javax.swing.JLabel lblHeader36;
    private javax.swing.JLabel lblHeader37;
    private javax.swing.JLabel lblHeader38;
    private javax.swing.JLabel lblHeader39;
    private javax.swing.JLabel lblHeader4;
    private javax.swing.JLabel lblHeader40;
    private javax.swing.JLabel lblHeader41;
    private javax.swing.JLabel lblHeader42;
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
    private javax.swing.JLabel lblHeader55;
    private javax.swing.JLabel lblHeader56;
    private javax.swing.JLabel lblHeader57;
    private javax.swing.JLabel lblHeader58;
    private javax.swing.JLabel lblHeader59;
    private javax.swing.JLabel lblHeader6;
    private javax.swing.JLabel lblHeader60;
    private javax.swing.JLabel lblHeader61;
    private javax.swing.JLabel lblHeader62;
    private javax.swing.JLabel lblHeader63;
    private javax.swing.JLabel lblHeader68;
    private javax.swing.JLabel lblHeader69;
    private javax.swing.JLabel lblHeader7;
    private javax.swing.JLabel lblHeader70;
    private javax.swing.JLabel lblHeader71;
    private javax.swing.JLabel lblHeader8;
    private javax.swing.JLabel lblHeader9;
    private javax.swing.JLabel lblMedicamentos;
    private javax.swing.JLabel lblMedxVencer;
    private javax.swing.JLabel lblPacientes;
    private javax.swing.JPopupMenu pUpBuscarMedicamento;
    private javax.swing.JTextField txtBuscarFechaV;
    private javax.swing.JTextField txtBuscarNombreMed;
    private javax.swing.JFormattedTextField txtCantMedicamento;
    private javax.swing.JFormattedTextField txtFechaV;
    private javax.swing.JTextField txtNombreMedicmento;
    // End of variables declaration//GEN-END:variables
}
