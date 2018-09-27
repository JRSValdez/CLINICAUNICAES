
package vistas;

import Classes.ConexionDB;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author JRSVALDEZ
 */
public class Home_Recepcion extends javax.swing.JFrame {

    int xx, xy;
    int xs, ys, sbx,sby;
    
    ConexionDB conn = new ConexionDB();
    
    int[] idFacult;
    
    public Home_Recepcion() throws SQLException {
        initComponents();
        
        //FECHA DEL SISTEMA
        Date sistFecha=new Date();
        SimpleDateFormat formato=new SimpleDateFormat("dd/MMMMM/YYYY");
        lblFecha.setText(formato.format(sistFecha)); 
        
        this.llenarFacultad();
        this.cboDepartamento.setModel(conn.Obt_Depart());
        this.cboParentezco.setModel(conn.Obt_Parentesco());
        
        
        this.jTbusqueda.setSelectionForeground(Color.white);
        this.jTFarmacia.setSelectionForeground(Color.white);
        
        xs = this.Contenedor.getWidth();
        ys = this.Contenedor.getHeight();
        sbx = this.SideBar.getWidth();
        sby = this.SideBar.getHeight();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        SideBar = new javax.swing.JPanel();
        Botonera = new javax.swing.JPanel();
        btn_sols = new javax.swing.JButton();
        btn_cons = new javax.swing.JButton();
        btn_farmacia = new javax.swing.JButton();
        btn_home = new javax.swing.JButton();
        btn_pac = new javax.swing.JButton();
        Contenedor = new javax.swing.JTabbedPane();
        Tab_home = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblSol_medicamento = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        lblPac_espera = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblConsult_espera = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        lblMedxVencer = new javax.swing.JLabel();
        Tab_Cons = new javax.swing.JPanel();
        jPanelEstNuevo = new javax.swing.JPanel();
        lblHeader44 = new javax.swing.JLabel();
        btnAggConPacNuevo = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        lblHeader37 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        lblHeader21 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        lblHeader26 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        lblHeader31 = new javax.swing.JLabel();
        rdbMasculino = new javax.swing.JRadioButton();
        rdbFemenino = new javax.swing.JRadioButton();
        lblHeader40 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        lblHeader52 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        lblHeader39 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jPanel34 = new javax.swing.JPanel();
        lblHeader38 = new javax.swing.JLabel();
        jTextArea3 = new javax.swing.JTextArea();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        lblHeader41 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        lblHeader42 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        lblHeader43 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox<>();
        lblHeader54 = new javax.swing.JLabel();
        jComboBox16 = new javax.swing.JComboBox<>();
        lblHeader53 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox<>();
        lblHeader57 = new javax.swing.JLabel();
        jComboBox12 = new javax.swing.JComboBox<>();
        jPanelExistente = new javax.swing.JPanel();
        lblHeader3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbusqueda = new javax.swing.JTable();
        btnAggConsPacExistente = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnConsultasEspera = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblHeader2 = new javax.swing.JLabel();
        Tab_Pac = new javax.swing.JPanel();
        lblHeader14 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        lblHeader58 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        lblHeader23 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblHeader28 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblHeader59 = new javax.swing.JLabel();
        rdbMasculino1 = new javax.swing.JRadioButton();
        rdbFemenino1 = new javax.swing.JRadioButton();
        lblHeader60 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblHeader61 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        lblHeader62 = new javax.swing.JLabel();
        txtFechaNac = new javax.swing.JTextField();
        jPanel36 = new javax.swing.JPanel();
        lblHeader63 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextArea();
        rbzonaUrb = new javax.swing.JRadioButton();
        rbzonaRur = new javax.swing.JRadioButton();
        lblHeader64 = new javax.swing.JLabel();
        txtEmergencia = new javax.swing.JTextField();
        lblHeader65 = new javax.swing.JLabel();
        txtTelefonoEmerg = new javax.swing.JTextField();
        lblHeader66 = new javax.swing.JLabel();
        cboParentezco = new javax.swing.JComboBox<>();
        lblHeader67 = new javax.swing.JLabel();
        cboDepartamento = new javax.swing.JComboBox<>();
        jPanelEstNuevo2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        lblHeader22 = new javax.swing.JLabel();
        lblHeader25 = new javax.swing.JLabel();
        cboFacultadAcadem = new javax.swing.JComboBox<>();
        cboActAcademico = new javax.swing.JComboBox<>();
        rbAcademico = new javax.swing.JRadioButton();
        jPanelEstNuevo4 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        lblHeader32 = new javax.swing.JLabel();
        lblHeader33 = new javax.swing.JLabel();
        lblHeader34 = new javax.swing.JLabel();
        txtCarnet = new javax.swing.JTextField();
        cboFacultadEstud = new javax.swing.JComboBox<>();
        cboCarreraEstud = new javax.swing.JComboBox<>();
        tbEstudiante = new javax.swing.JRadioButton();
        jPanelEstNuevo3 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        lblHeader27 = new javax.swing.JLabel();
        lblHeader29 = new javax.swing.JLabel();
        txtnombreEmp = new javax.swing.JTextField();
        cboActEmpleado = new javax.swing.JComboBox<>();
        rbProyeccionSocial = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btnAgregarPaciente = new javax.swing.JLabel();
        Tab_Sols = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        lblHeader5 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        lblHeader6 = new javax.swing.JLabel();
        lblHeader7 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTbusquedaMed = new javax.swing.JTable();
        jLabel32 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jPanelExistente1 = new javax.swing.JPanel();
        lblHeader4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTbusquedaPaciente = new javax.swing.JTable();
        jPanelExistente2 = new javax.swing.JPanel();
        lblHeader8 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        lblHeader18 = new javax.swing.JLabel();
        lblHeader49 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        lblHeader50 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        Tab_Farmacia = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lblHeader48 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        lblHeader45 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox<>();
        lblHeader46 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jComboBox14 = new javax.swing.JComboBox<>();
        lblHeader47 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        lblHeader55 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBox18 = new javax.swing.JComboBox<>();
        lblHeader51 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lblHeader56 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTFarmacia = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        lblHeader68 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        lblHeader69 = new javax.swing.JLabel();
        jComboBox19 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        Barra_Superior = new javax.swing.JPanel();
        btnHome2 = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();
        btn_close = new javax.swing.JLabel();
        lblHeader1 = new javax.swing.JLabel();
        btn_minimize = new javax.swing.JLabel();
        btn_maximize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 700));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
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

        btn_sols.setBackground(new java.awt.Color(0, 0, 0));
        btn_sols.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btn_sols.setForeground(new java.awt.Color(255, 255, 255));
        btn_sols.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pacientes.png"))); // NOI18N
        btn_sols.setText("SOLICITUD DE MED.");
        btn_sols.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_sols.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_sols.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_solsActionPerformed(evt);
            }
        });

        btn_cons.setBackground(new java.awt.Color(0, 0, 0));
        btn_cons.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btn_cons.setForeground(new java.awt.Color(255, 255, 255));
        btn_cons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lista.png"))); // NOI18N
        btn_cons.setText("CONSULTAS");
        btn_cons.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_cons.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_cons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consActionPerformed(evt);
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
        btn_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pacientes.png"))); // NOI18N
        btn_home.setText("HOME");
        btn_home.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_home.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });

        btn_pac.setBackground(new java.awt.Color(0, 0, 0));
        btn_pac.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btn_pac.setForeground(new java.awt.Color(255, 255, 255));
        btn_pac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pacientes.png"))); // NOI18N
        btn_pac.setText("PACIENTES");
        btn_pac.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_pac.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_pac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pacActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BotoneraLayout = new javax.swing.GroupLayout(Botonera);
        Botonera.setLayout(BotoneraLayout);
        BotoneraLayout.setHorizontalGroup(
            BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoneraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_sols, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(btn_cons, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_farmacia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_pac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        BotoneraLayout.setVerticalGroup(
            BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotoneraLayout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cons, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_pac, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btn_sols, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_farmacia, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout SideBarLayout = new javax.swing.GroupLayout(SideBar);
        SideBar.setLayout(SideBarLayout);
        SideBarLayout.setHorizontalGroup(
            SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Botonera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        SideBarLayout.setVerticalGroup(
            SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Botonera, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                .addContainerGap())
        );

        Contenedor.setBackground(new java.awt.Color(102, 0, 0));
        Contenedor.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        Contenedor.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        Contenedor.setToolTipText("");
        Contenedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Contenedor.setMinimumSize(new java.awt.Dimension(1000, 700));
        Contenedor.setPreferredSize(new java.awt.Dimension(1000, 700));

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

        jPanel2.setBackground(new java.awt.Color(102, 0, 0));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        jPanel4.setBackground(new java.awt.Color(102, 0, 0));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        jPanel4.setPreferredSize(new java.awt.Dimension(250, 250));

        lblSol_medicamento.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblSol_medicamento.setForeground(new java.awt.Color(255, 255, 255));
        lblSol_medicamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSol_medicamento.setText("4");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img1.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 17)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Solicitudes de medicamento");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSol_medicamento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(lblSol_medicamento)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(102, 0, 0));
        jPanel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        jPanel13.setPreferredSize(new java.awt.Dimension(250, 250));

        lblPac_espera.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblPac_espera.setForeground(new java.awt.Color(255, 255, 255));
        lblPac_espera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPac_espera.setText("100");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/estudiante.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Pacientes Atendidos");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPac_espera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPac_espera)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(102, 0, 0));
        jPanel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        jPanel14.setPreferredSize(new java.awt.Dimension(250, 250));

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Consultas en espera");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/estetoscopio.png"))); // NOI18N

        lblConsult_espera.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblConsult_espera.setForeground(new java.awt.Color(255, 255, 255));
        lblConsult_espera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConsult_espera.setText("25");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblConsult_espera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblConsult_espera)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        lblFecha.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("jLabel2");

        jPanel16.setBackground(new java.awt.Color(102, 0, 0));
        jPanel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        lblMedxVencer.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblMedxVencer.setForeground(new java.awt.Color(255, 255, 255));
        lblMedxVencer.setText("Medicamentos proximo a vencerse");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblMedxVencer)
                .addContainerGap(669, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblMedxVencer)
                .addContainerGap(77, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tab_homeLayout.createSequentialGroup()
                .addGroup(Tab_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        Contenedor.addTab("HOME", null, Tab_home, "");

        Tab_Cons.setBackground(new java.awt.Color(102, 0, 0));
        Tab_Cons.setForeground(new java.awt.Color(255, 255, 255));
        Tab_Cons.setMinimumSize(new java.awt.Dimension(990, 660));
        Tab_Cons.setPreferredSize(new java.awt.Dimension(990, 660));

        jPanelEstNuevo.setBackground(new java.awt.Color(102, 0, 0));
        jPanelEstNuevo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        lblHeader44.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader44.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader44.setText("ESTUDIANTE NUEVO");

        btnAggConPacNuevo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnAggConPacNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnAggConPacNuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAggConPacNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cruz.png"))); // NOI18N
        btnAggConPacNuevo.setText("Agregar Estudiante y Consulta");
        btnAggConPacNuevo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        btnAggConPacNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAggConPacNuevo.setFocusable(false);
        btnAggConPacNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAggConPacNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAggConPacNuevoMouseClicked(evt);
            }
        });

        jPanel33.setBackground(new java.awt.Color(102, 0, 0));
        jPanel33.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        jPanel33.setPreferredSize(new java.awt.Dimension(210, 250));

        lblHeader37.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader37.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader37.setText("CARNET:");

        jTextField10.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField10.setText("CARNET");
        jTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader21.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader21.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader21.setText("NOMBRES:");

        jTextField16.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField16.setText("NOMBRE NOMBRE");
        jTextField16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader26.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader26.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader26.setText("APELLIDOS:");

        jTextField17.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField17.setText("APELLIDO APELLIDO");
        jTextField17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader31.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader31.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader31.setText("SEXO:");

        rdbMasculino.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup1.add(rdbMasculino);
        rdbMasculino.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        rdbMasculino.setForeground(new java.awt.Color(255, 255, 255));
        rdbMasculino.setText("Masculino");

        rdbFemenino.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup1.add(rdbFemenino);
        rdbFemenino.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        rdbFemenino.setForeground(new java.awt.Color(255, 255, 255));
        rdbFemenino.setText("Femenino");

        lblHeader40.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader40.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader40.setText("TELÉFONO:");

        jTextField18.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField18.setText("XXXX - XXXX");
        jTextField18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader52.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader52.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader52.setText("CELULAR:");

        jTextField31.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField31.setText("XXXX - XXXX");
        jTextField31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader39.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader39.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader39.setText("FECHA NACIMIENTO:");

        jTextField19.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField19.setText("XX/XX/XXXX");
        jTextField19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeader21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHeader37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblHeader40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeader52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeader31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeader26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeader39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField19)
                        .addComponent(jTextField18)
                        .addGroup(jPanel33Layout.createSequentialGroup()
                            .addComponent(rdbMasculino)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rdbFemenino))
                        .addComponent(jTextField17)
                        .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader37)
                    .addComponent(jTextField10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader21)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader26)
                    .addComponent(jTextField17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader31)
                    .addComponent(rdbMasculino)
                    .addComponent(rdbFemenino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeader39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeader40)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader52)
                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel34.setBackground(new java.awt.Color(102, 0, 0));
        jPanel34.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        jPanel34.setPreferredSize(new java.awt.Dimension(210, 250));

        lblHeader38.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader38.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader38.setText("DIRECCIÓN:");

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextArea3.setRows(2);
        jTextArea3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jRadioButton1.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup3.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Urbano");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup3.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Rural");

        lblHeader41.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader41.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader41.setText("CASO EMERGENCIA:");

        jTextField20.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField20.setText("NOMBRES APELLIDOS");
        jTextField20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader42.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader42.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader42.setText("TELÉFONO:");

        jTextField21.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField21.setText("XXXX - XXXX");
        jTextField21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader43.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader43.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader43.setText("PARENTEZCO:");

        jComboBox11.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Padre", "Madre", "Abuelo/a", "Hermano/a", "Tío/a", "Encargado/a" }));
        jComboBox11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader54.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader54.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader54.setText("DEPARTAMENTO:");

        jComboBox16.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Santa Ana", "Sonsonate", "Ahuachapan", "San Salvador" }));
        jComboBox16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader53.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader53.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader53.setText("FACULTAD:");

        jComboBox9.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ING y ARQ", "CC HH", "CC SALUD" }));
        jComboBox9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader57.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader57.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader57.setText("CARRERA:");

        jComboBox12.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingemiería en Sistemas" }));
        jComboBox12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel34Layout.createSequentialGroup()
                                .addComponent(lblHeader41, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel34Layout.createSequentialGroup()
                                .addComponent(lblHeader43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel34Layout.createSequentialGroup()
                            .addComponent(lblHeader42, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblHeader38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeader54, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel34Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(79, 79, 79)
                                .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jComboBox16, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextArea3, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHeader53)
                            .addComponent(lblHeader57, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel34Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader54)
                    .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader38)
                    .addComponent(jTextArea3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader53)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeader57))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader41)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader42)
                    .addComponent(jTextField21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeader43))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelEstNuevoLayout = new javax.swing.GroupLayout(jPanelEstNuevo);
        jPanelEstNuevo.setLayout(jPanelEstNuevoLayout);
        jPanelEstNuevoLayout.setHorizontalGroup(
            jPanelEstNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstNuevoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHeader44)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelEstNuevoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEstNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAggConPacNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelEstNuevoLayout.setVerticalGroup(
            jPanelEstNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstNuevoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblHeader44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEstNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEstNuevoLayout.createSequentialGroup()
                        .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAggConPacNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelExistente.setBackground(new java.awt.Color(102, 0, 0));
        jPanelExistente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        lblHeader3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader3.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader3.setText("PACIENTE EXISTENTE");

        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField1.setText("2015SV601");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTbusqueda.setBackground(new java.awt.Color(204, 204, 204));
        jTbusqueda.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTbusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"2015SV601", "Estudiante", "José Ricardo Sifontes Valdez", "ING Y ARQ", "Ing. Sistemas", "07-10-1997"}
            },
            new String [] {
                "Carnet", "Actividad", "Nombre", "Facultad", "Carrera", "Fecha Nacimiento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTbusqueda.setGridColor(new java.awt.Color(255, 255, 153));
        jTbusqueda.setRowHeight(25);
        jTbusqueda.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTbusqueda.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTbusqueda.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTbusqueda);
        jTbusqueda.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        btnAggConsPacExistente.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnAggConsPacExistente.setForeground(new java.awt.Color(255, 255, 255));
        btnAggConsPacExistente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAggConsPacExistente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cruz.png"))); // NOI18N
        btnAggConsPacExistente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        btnAggConsPacExistente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAggConsPacExistente.setFocusable(false);
        btnAggConsPacExistente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAggConsPacExistente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAggConsPacExistenteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelExistenteLayout = new javax.swing.GroupLayout(jPanelExistente);
        jPanelExistente.setLayout(jPanelExistenteLayout);
        jPanelExistenteLayout.setHorizontalGroup(
            jPanelExistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExistenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelExistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelExistenteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblHeader3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelExistenteLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAggConsPacExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelExistenteLayout.setVerticalGroup(
            jPanelExistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExistenteLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanelExistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelExistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblHeader3)))
                .addGap(4, 4, 4)
                .addGroup(jPanelExistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAggConsPacExistente, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(102, 0, 0));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        btnConsultasEspera.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultasEspera.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnConsultasEspera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clock.png"))); // NOI18N
        btnConsultasEspera.setText("EN ESPERA");
        btnConsultasEspera.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnConsultasEspera.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnConsultasEspera.setFocusable(false);
        btnConsultasEspera.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultasEspera.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConsultasEspera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultasEsperaMouseClicked(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/today.png"))); // NOI18N
        jLabel7.setText("ATENDIDAS HOY");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel7.setFocusable(false);
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/history.png"))); // NOI18N
        jLabel8.setText("HISTORIAL");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel8.setFocusable(false);
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConsultasEspera)
                .addGap(40, 40, 40)
                .addComponent(jLabel7)
                .addGap(40, 40, 40)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(btnConsultasEspera))
                .addContainerGap())
        );

        lblHeader2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader2.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader2.setText("CONSULTA NUEVA");

        javax.swing.GroupLayout Tab_ConsLayout = new javax.swing.GroupLayout(Tab_Cons);
        Tab_Cons.setLayout(Tab_ConsLayout);
        Tab_ConsLayout.setHorizontalGroup(
            Tab_ConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tab_ConsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Tab_ConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelExistente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelEstNuevo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(Tab_ConsLayout.createSequentialGroup()
                .addGap(413, 413, 413)
                .addComponent(lblHeader2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Tab_ConsLayout.setVerticalGroup(
            Tab_ConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab_ConsLayout.createSequentialGroup()
                .addComponent(lblHeader2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelExistente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelEstNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        Contenedor.addTab("CONSULTAS", Tab_Cons);

        Tab_Pac.setBackground(new java.awt.Color(102, 0, 0));
        Tab_Pac.setMinimumSize(new java.awt.Dimension(990, 660));
        Tab_Pac.setPreferredSize(new java.awt.Dimension(990, 660));
        Tab_Pac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tab_PacMouseClicked(evt);
            }
        });

        lblHeader14.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader14.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader14.setText("DATOS PERSONALES");

        jPanel9.setBackground(new java.awt.Color(102, 0, 0));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        jPanel35.setBackground(new java.awt.Color(102, 0, 0));
        jPanel35.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        jPanel35.setPreferredSize(new java.awt.Dimension(210, 250));

        lblHeader58.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader58.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader58.setText("DOCUMENTO:");

        txtDocumento.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtDocumento.setText("XXXXXXXXXXXXX");
        txtDocumento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader23.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader23.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader23.setText("NOMBRES:");

        txtNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtNombre.setText("NOMBRE NOMBRE");
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader28.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader28.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader28.setText("APELLIDOS:");

        txtApellido.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtApellido.setText("APELLIDO APELLIDO");
        txtApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader59.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader59.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader59.setText("SEXO:");

        rdbMasculino1.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup1.add(rdbMasculino1);
        rdbMasculino1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        rdbMasculino1.setForeground(new java.awt.Color(255, 255, 255));
        rdbMasculino1.setSelected(true);
        rdbMasculino1.setText("Masculino");

        rdbFemenino1.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup1.add(rdbFemenino1);
        rdbFemenino1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        rdbFemenino1.setForeground(new java.awt.Color(255, 255, 255));
        rdbFemenino1.setText("Femenino");

        lblHeader60.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader60.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader60.setText("TELÉFONO:");

        txtTelefono.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtTelefono.setText("XXXX - XXXX");
        txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader61.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader61.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader61.setText("CELULAR:");

        txtCelular.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtCelular.setText("XXXX - XXXX");
        txtCelular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader62.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader62.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader62.setText("FECHA NACIMIENTO:");

        txtFechaNac.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtFechaNac.setText("XX/XX/XXXX");
        txtFechaNac.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeader23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHeader58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblHeader60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeader61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeader59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeader28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeader62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtFechaNac)
                        .addComponent(txtTelefono)
                        .addGroup(jPanel35Layout.createSequentialGroup()
                            .addComponent(rdbMasculino1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rdbFemenino1))
                        .addComponent(txtApellido)
                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader58)
                    .addComponent(txtDocumento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader23)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader28)
                    .addComponent(txtApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader59)
                    .addComponent(rdbMasculino1)
                    .addComponent(rdbFemenino1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeader62))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeader60)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader61)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel36.setBackground(new java.awt.Color(102, 0, 0));
        jPanel36.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        jPanel36.setPreferredSize(new java.awt.Dimension(210, 250));

        lblHeader63.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader63.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader63.setText("DIRECCIÓN:");

        txtDireccion.setColumns(20);
        txtDireccion.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtDireccion.setRows(2);
        txtDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        rbzonaUrb.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup3.add(rbzonaUrb);
        rbzonaUrb.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        rbzonaUrb.setForeground(new java.awt.Color(255, 255, 255));
        rbzonaUrb.setSelected(true);
        rbzonaUrb.setText("Urbano");
        rbzonaUrb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbzonaUrbActionPerformed(evt);
            }
        });

        rbzonaRur.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup3.add(rbzonaRur);
        rbzonaRur.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        rbzonaRur.setForeground(new java.awt.Color(255, 255, 255));
        rbzonaRur.setText("Rural");

        lblHeader64.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader64.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader64.setText("CASO EMERGENCIA:");

        txtEmergencia.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtEmergencia.setText("NOMBRES APELLIDOS");
        txtEmergencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader65.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader65.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader65.setText("TELÉFONO:");

        txtTelefonoEmerg.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtTelefonoEmerg.setText("XXXX - XXXX");
        txtTelefonoEmerg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader66.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader66.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader66.setText("PARENTEZCO:");

        cboParentezco.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cboParentezco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Padre", "Madre", "Abuelo/a", "Hermano/a", "Tío/a", "Encargado/a" }));
        cboParentezco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader67.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader67.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader67.setText("DEPARTAMENTO:");

        cboDepartamento.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cboDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Santa Ana", "Sonsonate", "Ahuachapan", "San Salvador" }));
        cboDepartamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel36Layout.createSequentialGroup()
                                .addComponent(lblHeader64, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(txtEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel36Layout.createSequentialGroup()
                                .addComponent(lblHeader66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(cboParentezco, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel36Layout.createSequentialGroup()
                            .addComponent(lblHeader65, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtTelefonoEmerg, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblHeader63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeader67, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel36Layout.createSequentialGroup()
                                .addComponent(rbzonaUrb)
                                .addGap(79, 79, 79)
                                .addComponent(rbzonaRur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(cboDepartamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader67)
                    .addComponent(cboDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader63)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbzonaRur)
                    .addComponent(rbzonaUrb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader64)
                    .addComponent(txtEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader65)
                    .addComponent(txtTelefonoEmerg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboParentezco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeader66))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelEstNuevo2.setBackground(new java.awt.Color(102, 0, 0));
        jPanelEstNuevo2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));
        jPanelEstNuevo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelEstNuevo2MouseClicked(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(102, 0, 0));

        lblHeader22.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader22.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader22.setText("FACULTAD:");

        lblHeader25.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader25.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader25.setText("ACTIVIDAD:");

        cboFacultadAcadem.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cboFacultadAcadem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ING y ARQ", "CC HH", "CC SALUD" }));
        cboFacultadAcadem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        cboActAcademico.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cboActAcademico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hora clase", "tiempo completo", "Administrativo", "Ordenanza" }));
        cboActAcademico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHeader25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHeader22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboFacultadAcadem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboActAcademico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader25)
                    .addComponent(cboActAcademico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader22)
                    .addComponent(cboFacultadAcadem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        rbAcademico.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup2.add(rbAcademico);
        rbAcademico.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        rbAcademico.setForeground(new java.awt.Color(255, 255, 255));
        rbAcademico.setText("PERSONAL ACADEMICO/ADMINISTRATIVO");
        rbAcademico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAcademicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEstNuevo2Layout = new javax.swing.GroupLayout(jPanelEstNuevo2);
        jPanelEstNuevo2.setLayout(jPanelEstNuevo2Layout);
        jPanelEstNuevo2Layout.setHorizontalGroup(
            jPanelEstNuevo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstNuevo2Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEstNuevo2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rbAcademico)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelEstNuevo2Layout.setVerticalGroup(
            jPanelEstNuevo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstNuevo2Layout.createSequentialGroup()
                .addComponent(rbAcademico, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelEstNuevo4.setBackground(new java.awt.Color(102, 0, 0));
        jPanelEstNuevo4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));
        jPanelEstNuevo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelEstNuevo4MouseClicked(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(102, 0, 0));

        lblHeader32.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader32.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader32.setText("FACULTAD:");

        lblHeader33.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader33.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader33.setText("CARRERA:");

        lblHeader34.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader34.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader34.setText("CARNET:");

        txtCarnet.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtCarnet.setText("CARNET");
        txtCarnet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        cboFacultadEstud.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cboFacultadEstud.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ING y ARQ", "CC HH", "CC SALUD" }));
        cboFacultadEstud.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        cboCarreraEstud.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cboCarreraEstud.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingemiería en Sistemas" }));
        cboCarreraEstud.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHeader34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHeader33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHeader32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboFacultadEstud, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboCarreraEstud, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCarnet))
                .addGap(0, 0, 0))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader34)
                    .addComponent(txtCarnet))
                .addGap(15, 15, 15)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader32)
                    .addComponent(cboFacultadEstud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader33)
                    .addComponent(cboCarreraEstud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tbEstudiante.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup2.add(tbEstudiante);
        tbEstudiante.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        tbEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        tbEstudiante.setSelected(true);
        tbEstudiante.setText("ESTUDIANTE");

        javax.swing.GroupLayout jPanelEstNuevo4Layout = new javax.swing.GroupLayout(jPanelEstNuevo4);
        jPanelEstNuevo4.setLayout(jPanelEstNuevo4Layout);
        jPanelEstNuevo4Layout.setHorizontalGroup(
            jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstNuevo4Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelEstNuevo4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tbEstudiante)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelEstNuevo4Layout.setVerticalGroup(
            jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstNuevo4Layout.createSequentialGroup()
                .addComponent(tbEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelEstNuevo3.setBackground(new java.awt.Color(102, 0, 0));
        jPanelEstNuevo3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));
        jPanelEstNuevo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelEstNuevo3MouseClicked(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(102, 0, 0));

        lblHeader27.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader27.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader27.setText("ÁREA");

        lblHeader29.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader29.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader29.setText("EMPLEADO:");

        txtnombreEmp.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtnombreEmp.setText("Nombre Apellido");
        txtnombreEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        cboActEmpleado.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cboActEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hora clase", "tiempo completo", "Administrativo", "Ordenanza" }));
        cboActEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHeader29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHeader27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtnombreEmp)
                    .addComponent(cboActEmpleado, 0, 187, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader29)
                    .addComponent(txtnombreEmp))
                .addGap(15, 15, 15)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader27)
                    .addComponent(cboActEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        rbProyeccionSocial.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup2.add(rbProyeccionSocial);
        rbProyeccionSocial.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        rbProyeccionSocial.setForeground(new java.awt.Color(255, 255, 255));
        rbProyeccionSocial.setText("PROYECCIÓN SOCIAL");

        javax.swing.GroupLayout jPanelEstNuevo3Layout = new javax.swing.GroupLayout(jPanelEstNuevo3);
        jPanelEstNuevo3.setLayout(jPanelEstNuevo3Layout);
        jPanelEstNuevo3Layout.setHorizontalGroup(
            jPanelEstNuevo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstNuevo3Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelEstNuevo3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(rbProyeccionSocial)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanelEstNuevo3Layout.setVerticalGroup(
            jPanelEstNuevo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstNuevo3Layout.createSequentialGroup()
                .addComponent(rbProyeccionSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(102, 0, 0));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/history.png"))); // NOI18N
        jLabel13.setText("Historial");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel13.setFocusable(false);
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnAgregarPaciente.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnAgregarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarPaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAgregarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cruz.png"))); // NOI18N
        btnAgregarPaciente.setText("Agregar Paciente");
        btnAgregarPaciente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        btnAgregarPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregarPaciente.setFocusable(false);
        btnAgregarPaciente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAgregarPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarPacienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addGap(334, 334, 334))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarPaciente)
                    .addComponent(jLabel13))
                .addContainerGap())
        );

        javax.swing.GroupLayout Tab_PacLayout = new javax.swing.GroupLayout(Tab_Pac);
        Tab_Pac.setLayout(Tab_PacLayout);
        Tab_PacLayout.setHorizontalGroup(
            Tab_PacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab_PacLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Tab_PacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Tab_PacLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblHeader14)
                        .addGap(0, 797, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tab_PacLayout.createSequentialGroup()
                        .addGroup(Tab_PacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tab_PacLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelEstNuevo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jPanelEstNuevo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelEstNuevo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Tab_PacLayout.setVerticalGroup(
            Tab_PacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab_PacLayout.createSequentialGroup()
                .addComponent(lblHeader14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Tab_PacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelEstNuevo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelEstNuevo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelEstNuevo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        Contenedor.addTab("PACIENTES", Tab_Pac);

        Tab_Sols.setBackground(new java.awt.Color(102, 0, 0));
        Tab_Sols.setForeground(new java.awt.Color(255, 255, 255));
        Tab_Sols.setMinimumSize(new java.awt.Dimension(990, 660));

        jLabel26.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Solicitud de Medicamento");

        jPanel18.setBackground(new java.awt.Color(102, 0, 0));
        jPanel18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        jLabel30.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Busqueda de Medicamento");

        lblHeader5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader5.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader5.setText("MEDICAMENTO:");

        jTextField6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField6.setText("ACETAMINOFEN 500 ML");

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        jLabel31.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblHeader6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader6.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader6.setText("Fecha de Solicitud:");

        lblHeader7.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader7.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader7.setText("Cantidad:");

        jTbusquedaMed.setBackground(new java.awt.Color(204, 204, 204));
        jTbusquedaMed.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTbusquedaMed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"2015SV601", "Estudiante", "ACETAMINOFEN", "ML",  new Integer(3), "07-10-1997", "7-10-"}
            },
            new String [] {
                "CARNET", "NOMBRE", "MEDICAMENTO", "PRESENTACION", "CANTIDAD", "FECHA SOLICITUD", "VENCIMIENTO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTbusquedaMed.setColumnSelectionAllowed(true);
        jTbusquedaMed.setGridColor(new java.awt.Color(255, 255, 153));
        jTbusquedaMed.setRowHeight(25);
        jTbusquedaMed.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTbusquedaMed.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTbusquedaMed.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(jTbusquedaMed);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accept.png"))); // NOI18N
        jLabel32.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextField27.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField27.setText("XXX");

        jTextField28.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField28.setText("XX-XX-XXXX");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel32)))
                .addContainerGap())
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(0, 202, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(lblHeader5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel31))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(lblHeader7)
                        .addGap(8, 8, 8)
                        .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblHeader6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(203, Short.MAX_VALUE))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHeader5)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader6)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeader7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel32)
                .addContainerGap())
        );

        jPanelExistente1.setBackground(new java.awt.Color(102, 0, 0));
        jPanelExistente1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        lblHeader4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader4.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader4.setText("PACIENTE EXISTENTE");

        jTextField5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField5.setText("2015SV601");

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel19.setBackground(new java.awt.Color(102, 0, 0));

        jTbusquedaPaciente.setBackground(new java.awt.Color(204, 204, 204));
        jTbusquedaPaciente.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTbusquedaPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"2015SV601", "Estudiante", "José Ricardo Sifontes Valdez", "Ing. Sistemas"}
            },
            new String [] {
                "Carnet", "Actividad", "Nombre", "Carrera"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTbusquedaPaciente.setGridColor(new java.awt.Color(255, 255, 153));
        jTbusquedaPaciente.setRowHeight(25);
        jTbusquedaPaciente.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTbusquedaPaciente.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTbusquedaPaciente.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(jTbusquedaPaciente);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelExistente1Layout = new javax.swing.GroupLayout(jPanelExistente1);
        jPanelExistente1.setLayout(jPanelExistente1Layout);
        jPanelExistente1Layout.setHorizontalGroup(
            jPanelExistente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExistente1Layout.createSequentialGroup()
                .addGroup(jPanelExistente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelExistente1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblHeader4)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel29))
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelExistente1Layout.setVerticalGroup(
            jPanelExistente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExistente1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelExistente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelExistente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblHeader4))
                    .addComponent(jLabel29))
                .addGap(15, 15, 15)
                .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelExistente2.setBackground(new java.awt.Color(102, 0, 0));
        jPanelExistente2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        lblHeader8.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader8.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader8.setText("PACIENTE NUEVO");

        jTextField23.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField23.setText("2015SV601");

        lblHeader18.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader18.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader18.setText("CARNET:");

        lblHeader49.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader49.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader49.setText("NOMBRES:");

        jTextField25.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField25.setText("NOMBRE NOMBRE");

        lblHeader50.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader50.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader50.setText("APELLIDOS:");

        jTextField26.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField26.setText("APELLIDO APELLIDO");

        javax.swing.GroupLayout jPanelExistente2Layout = new javax.swing.GroupLayout(jPanelExistente2);
        jPanelExistente2.setLayout(jPanelExistente2Layout);
        jPanelExistente2Layout.setHorizontalGroup(
            jPanelExistente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExistente2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelExistente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelExistente2Layout.createSequentialGroup()
                        .addComponent(lblHeader8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelExistente2Layout.createSequentialGroup()
                        .addGroup(jPanelExistente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelExistente2Layout.createSequentialGroup()
                                .addGroup(jPanelExistente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblHeader18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblHeader49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18))
                            .addGroup(jPanelExistente2Layout.createSequentialGroup()
                                .addComponent(lblHeader50)
                                .addGap(20, 20, 20)))
                        .addGroup(jPanelExistente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField26, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(jTextField23, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField25, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(22, 22, 22))))
        );
        jPanelExistente2Layout.setVerticalGroup(
            jPanelExistente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExistente2Layout.createSequentialGroup()
                .addComponent(lblHeader8)
                .addGap(8, 8, 8)
                .addGroup(jPanelExistente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeader18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelExistente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader49)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelExistente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader50)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout Tab_SolsLayout = new javax.swing.GroupLayout(Tab_Sols);
        Tab_Sols.setLayout(Tab_SolsLayout);
        Tab_SolsLayout.setHorizontalGroup(
            Tab_SolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab_SolsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Tab_SolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Tab_SolsLayout.createSequentialGroup()
                        .addComponent(jPanelExistente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelExistente2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tab_SolsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel26)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Tab_SolsLayout.setVerticalGroup(
            Tab_SolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab_SolsLayout.createSequentialGroup()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Tab_SolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelExistente2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelExistente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        Contenedor.addTab("SOL. MEDICAMENTO", Tab_Sols);

        Tab_Farmacia.setBackground(new java.awt.Color(102, 0, 0));
        Tab_Farmacia.setMinimumSize(new java.awt.Dimension(990, 660));
        Tab_Farmacia.setPreferredSize(new java.awt.Dimension(990, 660));

        jPanel6.setBackground(new java.awt.Color(102, 0, 0));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        lblHeader48.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader48.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader48.setText("NOMBRE:");

        jTextField22.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField22.setText("MEDICAMENTO");
        jTextField22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader45.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader45.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader45.setText("PRESENTACIÓN:");

        jComboBox13.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRESENTACION 1", "PRESENTACON 2" }));
        jComboBox13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader46.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader46.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader46.setText("CANTIDAD:");

        jTextField24.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField24.setText("00000");
        jTextField24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jComboBox14.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UNIDADES", "TABLETAS", " " }));
        jComboBox14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader47.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader47.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader47.setText("FECHA V. :");

        jTextField29.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField29.setText("XXXX - XXXX");
        jTextField29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader55.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader55.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader55.setText("MEDICAMENTO NUEVO");

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cruz.png"))); // NOI18N
        jLabel14.setText("Agregar Medicamento");
        jLabel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel14.setFocusable(false);
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jComboBox18.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jComboBox18.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CATEGORIA 1", "CATEGORIA 2" }));
        jComboBox18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader51.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader51.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader51.setText("CATEGORÍA:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeader55)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(lblHeader48, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(lblHeader45)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox13, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHeader46, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(lblHeader47, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(lblHeader51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox18, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField29))
                .addGap(88, 88, 88))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(lblHeader55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHeader51)
                        .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHeader48)
                        .addComponent(jTextField22)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader45)
                            .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader46)
                            .addComponent(jTextField24)
                            .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHeader47))
                        .addContainerGap())))
        );

        jPanel8.setBackground(new java.awt.Color(102, 0, 0));
        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        lblHeader56.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader56.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader56.setText("LISTA DE MEDICAMENTOS");

        jTFarmacia.setBackground(new java.awt.Color(204, 204, 204));
        jTFarmacia.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTFarmacia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"223", "Medicamento", "Presentación", "12", "Xx-XX-XXXX"}
            },
            new String [] {
                "ID", "Medicamento", "Presentacion", "Cantidad", "Vence"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTFarmacia.setColumnSelectionAllowed(true);
        jTFarmacia.setGridColor(new java.awt.Color(255, 255, 153));
        jTFarmacia.setRowHeight(25);
        jTFarmacia.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTFarmacia.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTFarmacia.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTFarmacia);
        jTFarmacia.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(0, 352, Short.MAX_VALUE)
                        .addComponent(lblHeader56)
                        .addGap(0, 353, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 949, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(lblHeader56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        jPanel15.setBackground(new java.awt.Color(102, 0, 0));
        jPanel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        jLabel21.setText("EDITAR");
        jLabel21.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel21.setFocusable(false);
        jLabel21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel21.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblHeader68.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader68.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader68.setText("NOMBRE:");

        jTextField30.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField30.setText("MEDICAMENTO");
        jTextField30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader69.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader69.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader69.setText("CATEGORÍA:");

        jComboBox19.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jComboBox19.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CATEGORIA 1", "CATEGORIA 2" }));
        jComboBox19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        jLabel22.setText("BUSCAR");
        jLabel22.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel22.setFocusable(false);
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel22.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

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
                    .addComponent(jTextField30, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(jComboBox19, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader68)
                            .addComponent(jTextField30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader69)
                            .addComponent(jComboBox19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Contenedor.addTab("FARMACIA", Tab_Farmacia);

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
        lblHeader.setText("FARMACIA");

        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btn_close.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
        });

        lblHeader1.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        lblHeader1.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader1.setText("CLÍNICA UNIVERSITARIA - RECEPCIÓN ");

        btn_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minimize.png"))); // NOI18N
        btn_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_minimizeMouseClicked(evt);
            }
        });

        btn_maximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/maximize.png"))); // NOI18N
        btn_maximize.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_maximize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_maximizeMouseClicked(evt);
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
                .addGap(291, 291, 291)
                .addComponent(lblHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_maximize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_close)
                .addGap(15, 15, 15))
        );
        Barra_SuperiorLayout.setVerticalGroup(
            Barra_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Barra_SuperiorLayout.createSequentialGroup()
                .addGroup(Barra_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Barra_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_maximize)
                        .addComponent(btn_close)
                        .addGroup(Barra_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader)
                            .addComponent(lblHeader1))
                        .addComponent(btn_minimize)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(SideBar, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        this.btn_cons.setBackground(Color.black);
        this.btn_farmacia.setBackground(Color.black);
        this.btn_pac.setBackground(Color.black);
        this.btn_sols.setBackground(Color.black);
        
        
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_solsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_solsActionPerformed
        this.Contenedor.setSelectedIndex(3);
        this.lblHeader.setText("SOLICITUDES MED.");
        
        this.btn_sols.setBackground(Color.decode("#660000"));
        this.btn_cons.setBackground(Color.black);
        this.btn_farmacia.setBackground(Color.black);
        this.btn_pac.setBackground(Color.black);
        this.btn_home.setBackground(Color.black);
        
    }//GEN-LAST:event_btn_solsActionPerformed

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

    private void btn_pacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pacActionPerformed
        this.Contenedor.setSelectedIndex(2);
        this.lblHeader.setText("PACIENTES");
        
        this.btn_pac.setBackground(Color.decode("#660000"));
        this.btn_cons.setBackground(Color.black);
        this.btn_home.setBackground(Color.black);
        this.btn_farmacia.setBackground(Color.black);
        this.btn_sols.setBackground(Color.black);
        
        
        
        
        
    }//GEN-LAST:event_btn_pacActionPerformed

    private void btn_consActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consActionPerformed
        this.Contenedor.setSelectedIndex(1);
        this.lblHeader.setText("CONSULTAS");
        
        this.btn_cons.setBackground(Color.decode("#660000"));
        this.btn_farmacia.setBackground(Color.black);
        this.btn_home.setBackground(Color.black);
        this.btn_pac.setBackground(Color.black);
        this.btn_sols.setBackground(Color.black);
    }//GEN-LAST:event_btn_consActionPerformed

    private void btn_farmaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_farmaciaActionPerformed
        this.Contenedor.setSelectedIndex(4);
        this.lblHeader.setText("FARMACIA");
        
        this.btn_farmacia.setBackground(Color.decode("#660000"));
        this.btn_cons.setBackground(Color.black);
        this.btn_home.setBackground(Color.black);
        this.btn_pac.setBackground(Color.black);
        this.btn_sols.setBackground(Color.black);
    }//GEN-LAST:event_btn_farmaciaActionPerformed

    private void btnHome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome2ActionPerformed
        this.Contenedor.setSelectedIndex(0);
        this.lblHeader.setText("HOME");
        
        this.btn_home.setBackground(Color.decode("#660000"));
        this.btn_cons.setBackground(Color.black);
        this.btn_farmacia.setBackground(Color.black);
        this.btn_pac.setBackground(Color.black);
        this.btn_sols.setBackground(Color.black);
    }//GEN-LAST:event_btnHome2ActionPerformed

    private void Tab_PacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_PacMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Tab_PacMouseClicked

    private void jPanelEstNuevo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEstNuevo2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelEstNuevo2MouseClicked

    private void jPanelEstNuevo4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEstNuevo4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelEstNuevo4MouseClicked

    private void jPanelEstNuevo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEstNuevo3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelEstNuevo3MouseClicked

    private void rbAcademicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAcademicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAcademicoActionPerformed

    private void btn_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizeMouseClicked
        this.setExtendedState(0);
        this.Contenedor.setMinimumSize(new Dimension(xs, ys));
    }//GEN-LAST:event_btn_minimizeMouseClicked

    private void btn_maximizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_maximizeMouseClicked
        this.setExtendedState(6);
        int l = this.getHeight();
        int a = this.getWidth() - this.SideBar.getWidth();
        this.Contenedor.setMinimumSize(new Dimension(a, this.Contenedor.getWidth()));
    }//GEN-LAST:event_btn_maximizeMouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void rbzonaUrbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbzonaUrbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbzonaUrbActionPerformed

    public void llenarFacultad() throws SQLException {
        // llenar el combobox de facultad
        Object[] array = this.conn.llenarFacultad((JComboBox) cboFacultadEstud);

        this.idFacult = (int[]) array[1];
        this.cboFacultadEstud.setModel((DefaultComboBoxModel) array[0]);
    }
        
    private void btnAggConsPacExistenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggConsPacExistenteMouseClicked
        try {
            Consultorio_Consulta consulta;
            consulta = new Consultorio_Consulta();
            consulta.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Home_Recepcion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAggConsPacExistenteMouseClicked

    private void btnAggConPacNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggConPacNuevoMouseClicked
        try {
            Consultorio_Consulta consulta;
            consulta = new Consultorio_Consulta();
            consulta.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Home_Recepcion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAggConPacNuevoMouseClicked

    private void btnConsultasEsperaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultasEsperaMouseClicked
        try {
            Consultas_En_espera consulta;
            consulta = new Consultas_En_espera();
            consulta.show();
        } catch (SQLException ex) {
            Logger.getLogger(Home_Recepcion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnConsultasEsperaMouseClicked

    private void btnAgregarPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarPacienteMouseClicked

        





        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarPacienteMouseClicked
    
    
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
            java.util.logging.Logger.getLogger(Home_Recepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Recepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Recepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Recepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                    new Home_Recepcion().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Home_Recepcion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra_Superior;
    private javax.swing.JPanel Botonera;
    private javax.swing.JTabbedPane Contenedor;
    private javax.swing.JPanel SideBar;
    private javax.swing.JPanel Tab_Cons;
    private javax.swing.JPanel Tab_Farmacia;
    private javax.swing.JPanel Tab_Pac;
    private javax.swing.JPanel Tab_Sols;
    private javax.swing.JPanel Tab_home;
    private javax.swing.JLabel btnAggConPacNuevo;
    private javax.swing.JLabel btnAggConsPacExistente;
    private javax.swing.JLabel btnAgregarPaciente;
    private javax.swing.JLabel btnConsultasEspera;
    private javax.swing.JButton btnHome2;
    private javax.swing.JLabel btn_close;
    private javax.swing.JButton btn_cons;
    private javax.swing.JButton btn_farmacia;
    private javax.swing.JButton btn_home;
    private javax.swing.JLabel btn_maximize;
    private javax.swing.JLabel btn_minimize;
    private javax.swing.JButton btn_pac;
    private javax.swing.JButton btn_sols;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cboActAcademico;
    private javax.swing.JComboBox<String> cboActEmpleado;
    private javax.swing.JComboBox<String> cboCarreraEstud;
    private javax.swing.JComboBox<String> cboDepartamento;
    private javax.swing.JComboBox<String> cboFacultadAcadem;
    private javax.swing.JComboBox<String> cboFacultadEstud;
    private javax.swing.JComboBox<String> cboParentezco;
    private javax.swing.JPanel header;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox16;
    private javax.swing.JComboBox<String> jComboBox18;
    private javax.swing.JComboBox<String> jComboBox19;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelEstNuevo;
    private javax.swing.JPanel jPanelEstNuevo2;
    private javax.swing.JPanel jPanelEstNuevo3;
    private javax.swing.JPanel jPanelEstNuevo4;
    private javax.swing.JPanel jPanelExistente;
    private javax.swing.JPanel jPanelExistente1;
    private javax.swing.JPanel jPanelExistente2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTFarmacia;
    private javax.swing.JTable jTbusqueda;
    private javax.swing.JTable jTbusquedaMed;
    private javax.swing.JTable jTbusquedaPaciente;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lblConsult_espera;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblHeader1;
    private javax.swing.JLabel lblHeader14;
    private javax.swing.JLabel lblHeader18;
    private javax.swing.JLabel lblHeader2;
    private javax.swing.JLabel lblHeader21;
    private javax.swing.JLabel lblHeader22;
    private javax.swing.JLabel lblHeader23;
    private javax.swing.JLabel lblHeader25;
    private javax.swing.JLabel lblHeader26;
    private javax.swing.JLabel lblHeader27;
    private javax.swing.JLabel lblHeader28;
    private javax.swing.JLabel lblHeader29;
    private javax.swing.JLabel lblHeader3;
    private javax.swing.JLabel lblHeader31;
    private javax.swing.JLabel lblHeader32;
    private javax.swing.JLabel lblHeader33;
    private javax.swing.JLabel lblHeader34;
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
    private javax.swing.JLabel lblHeader64;
    private javax.swing.JLabel lblHeader65;
    private javax.swing.JLabel lblHeader66;
    private javax.swing.JLabel lblHeader67;
    private javax.swing.JLabel lblHeader68;
    private javax.swing.JLabel lblHeader69;
    private javax.swing.JLabel lblHeader7;
    private javax.swing.JLabel lblHeader8;
    private javax.swing.JLabel lblMedxVencer;
    private javax.swing.JLabel lblPac_espera;
    private javax.swing.JLabel lblSol_medicamento;
    private javax.swing.JRadioButton rbAcademico;
    private javax.swing.JRadioButton rbProyeccionSocial;
    private javax.swing.JRadioButton rbzonaRur;
    private javax.swing.JRadioButton rbzonaUrb;
    private javax.swing.JRadioButton rdbFemenino;
    private javax.swing.JRadioButton rdbFemenino1;
    private javax.swing.JRadioButton rdbMasculino;
    private javax.swing.JRadioButton rdbMasculino1;
    private javax.swing.JRadioButton tbEstudiante;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCarnet;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextArea txtDireccion;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtEmergencia;
    private javax.swing.JTextField txtFechaNac;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoEmerg;
    private javax.swing.JTextField txtnombreEmp;
    // End of variables declaration//GEN-END:variables
}
