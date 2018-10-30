/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Classes.Carrera;
import Classes.CarreraJpaController;
import Classes.ConexionDB;
import Classes.Empleado;
import Classes.Doctor;
import Classes.Especialidad;
import Classes.EspecialidadJpaController;
import Classes.Facultad;
import Classes.FacultadJpaController;
import Classes.Medicamento;
import Classes.TipoMedicamento;
import Classes.TipoMedicamentoJpaController;
import Classes.TipoPaciente;
import Classes.TipoPacienteJpaController;
import Classes.UnidadMed;
import Classes.UnidadMedJpaController;
import Classes.Usuario;
import Classes.alertas;
import Classes.entityMain;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author JRSValdez
 */
public class Home_Root extends javax.swing.JFrame {

    
int xx, xy;
    int xs, ys, sbx,sby;
    
    ConexionDB conn;
    Usuario user;
    
    int[] idPresentacion;
    int[] idCatsMed;
    int[] idUnidadesMed;
     int[] idFacult;
     
    int[] idBusquedaPresMed;
    int[] idBusquedaCatsMed;
    
    int[] idEmp;
    
    int[] idEsp;
    int[] idUsr;
    
    public Home_Root(){
        initComponents();
    }
    
    public Home_Root(Usuario _user) throws SQLException {
        initComponents();
        
        conn = new ConexionDB();
        user = _user;
        
        //FECHA DEL SISTEMA
        Date sistFecha=new Date();
        SimpleDateFormat formato=new SimpleDateFormat("dd/MMMMM/YYYY");
        lblFecha.setText(formato.format(sistFecha)); 
        
        this.jTFarmacia.setSelectionForeground(Color.white);
        this.jTespecialidades.setSelectionForeground(Color.white);
        this.jTunidades.setSelectionForeground(Color.white);
        
        conn.getFacultades(this.jTfacultades);
        conn.getCatMedicamento(this.jTcategorias);
        conn.getFacultades(this.jTfacultades);
        conn.getActividad(this.jTactividades);
        conn.getUnidMedida(this.jTunidades);
        conn.getEspecialidad(this.jTespecialidades);
        conn.getCarreras(jTcarreras);
        xs = this.Contenedor.getWidth();
        ys = this.Contenedor.getHeight();
        sbx = this.SideBar.getWidth();
        sby = this.SideBar.getHeight();
        
        this.llenarMedicamentosFarmacia();
        this.llenarFacultad();
        
        
        this.llenarEmp();
        this.tbUsuarios.setSelectionForeground(Color.WHITE);
        this.tbUsuarios.setModel(this.conn.getUsuarios(tbUsuarios));
        
        this.llenarEsp();
        this.llenarUsr();
        this.tbDoctor.setModel(this.conn.getDocs(tbDoctor));
        this.tbEmp.setModel(this.conn.getEmpleado(tbEmp));
        
        this.jTAlertas.setModel(this.conn.obt_alertas(jTAlertas,1));
        this.btnAlertaTotal.setText("Todas("+jTAlertas.getRowCount()+")");
        this.btnAlertaTotal.setFont(new Font("Arial", Font.BOLD, 12)); 
        
        this.lblDoctores.setText(Integer.toString(conn.ContarDoctores()));
        this.lblMedicamentos.setText(Integer.toString(conn.ContarMedicamentos()));
        this.lblPacientes.setText(Integer.toString(conn.ContarPacientes()));
        this.lblConsultas.setText(Integer.toString(conn.ConsultasxMes()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pUpBuscarMedicamento = new javax.swing.JPopupMenu();
        itemNombreMed = new javax.swing.JMenuItem();
        itemFechaV = new javax.swing.JMenuItem();
        itemCatMed = new javax.swing.JMenuItem();
        itemPresMed = new javax.swing.JMenuItem();
        rdbFiltros1 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        rdbFiltros2 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        SideBar = new javax.swing.JPanel();
        Botonera = new javax.swing.JPanel();
        btn_users = new javax.swing.JButton();
        btn_farmacia = new javax.swing.JButton();
        btn_home = new javax.swing.JButton();
        btn_docs = new javax.swing.JButton();
        btn_reports = new javax.swing.JButton();
        btn_config = new javax.swing.JButton();
        btn_empleado = new javax.swing.JButton();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAlertas = new javax.swing.JTable();
        btnAlertaTotal = new javax.swing.JButton();
        btnAlertaFecha = new javax.swing.JButton();
        btnAlertaCant = new javax.swing.JButton();
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
        txtDocumento = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        rbM = new javax.swing.JRadioButton();
        rbF = new javax.swing.JRadioButton();
        lblHeader39 = new javax.swing.JLabel();
        lblHeader40 = new javax.swing.JLabel();
        lblHeader43 = new javax.swing.JLabel();
        cboEspecialidad = new javax.swing.JComboBox<>();
        lblHeader44 = new javax.swing.JLabel();
        btnAggDoctor = new javax.swing.JLabel();
        txtFecha = new javax.swing.JFormattedTextField();
        txtTelefono = new javax.swing.JFormattedTextField();
        lblHeader64 = new javax.swing.JLabel();
        cboUsuario = new javax.swing.JComboBox<>();
        jPanel16 = new javax.swing.JPanel();
        lblHeader58 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbDoctor = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        btnMostrarElimDoc = new javax.swing.JLabel();
        btnElimanarDoctor = new javax.swing.JLabel();
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
        txtUsuario = new javax.swing.JTextField();
        lblHeader36 = new javax.swing.JLabel();
        cboTipoUsuario = new javax.swing.JComboBox<>();
        btnAggUsuario = new javax.swing.JLabel();
        lblHeader18 = new javax.swing.JLabel();
        lblHeader14 = new javax.swing.JLabel();
        lblHeader38 = new javax.swing.JLabel();
        cboEmpleado = new javax.swing.JComboBox<>();
        txtPassword2 = new javax.swing.JPasswordField();
        txtPassword1 = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnEliminarUsuario = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        lblHeader57 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbUsuarios = new javax.swing.JTable();
        Tab_reports = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanelEstNuevo4 = new javax.swing.JPanel();
        lblHeader32 = new javax.swing.JLabel();
        cmbFacultad = new javax.swing.JComboBox<>();
        lblHeader33 = new javax.swing.JLabel();
        cmbCarrera = new javax.swing.JComboBox<>();
        lblHeader34 = new javax.swing.JLabel();
        cmbDcotor = new javax.swing.JComboBox<>();
        lblHeader35 = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox<>();
        lblHeader41 = new javax.swing.JLabel();
        cmbActividad = new javax.swing.JComboBox<>();
        lblHeader42 = new javax.swing.JLabel();
        txtCodCat = new javax.swing.JTextField();
        lblHeader49 = new javax.swing.JLabel();
        txtCodDiag = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        lblHeader54 = new javax.swing.JLabel();
        cmbDepartamento = new javax.swing.JComboBox<>();
        lblHeader59 = new javax.swing.JLabel();
        cmbUbicacion = new javax.swing.JComboBox<>();
        rdbSexo = new javax.swing.JRadioButton();
        rdbDoctor = new javax.swing.JRadioButton();
        rdbActividad = new javax.swing.JRadioButton();
        rdbFacultad = new javax.swing.JRadioButton();
        rdbCarrera = new javax.swing.JRadioButton();
        rdbDepartamento = new javax.swing.JRadioButton();
        rdbCategoria = new javax.swing.JRadioButton();
        rdbUbicacion = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jPanelEstNuevo5 = new javax.swing.JPanel();
        lblHeader50 = new javax.swing.JLabel();
        lblHeader52 = new javax.swing.JLabel();
        txtFechaInicio = new javax.swing.JTextField();
        txtFechaFinal = new javax.swing.JTextField();
        lblHeader53 = new javax.swing.JLabel();
        cmbPeriodo = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanelEstNuevo6 = new javax.swing.JPanel();
        lblHeader51 = new javax.swing.JLabel();
        lblHeader60 = new javax.swing.JLabel();
        lblHeader61 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txtIdPac = new javax.swing.JTextField();
        btnBuscarExpediente = new javax.swing.JLabel();
        lblHeader62 = new javax.swing.JLabel();
        txtCarnetRoot = new javax.swing.JTextField();
        rdbIdPac = new javax.swing.JRadioButton();
        rdbCarnet = new javax.swing.JRadioButton();
        rdbNombres = new javax.swing.JRadioButton();
        rdbApellidos = new javax.swing.JRadioButton();
        jPanelEstNuevo7 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        btnGenReporteExpediente = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jtBuscarExpediente = new javax.swing.JTable();
        Tab_Config = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTcategorias = new javax.swing.JTable();
        lblHeader2 = new javax.swing.JLabel();
        lblHeader3 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        btnAggCategoria = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnEditCategoria = new javax.swing.JLabel();
        btnElimCategoria = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTfacultades = new javax.swing.JTable();
        lblHeader4 = new javax.swing.JLabel();
        lblHeader5 = new javax.swing.JLabel();
        txtFacultad = new javax.swing.JTextField();
        btnAggFacultad = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        btnEditFacultad = new javax.swing.JLabel();
        btnEliminarFacultad = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTcarreras = new javax.swing.JTable();
        lblHeader6 = new javax.swing.JLabel();
        lblHeader7 = new javax.swing.JLabel();
        txtCarrera = new javax.swing.JTextField();
        btnAggCarrera = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        btnEditarCarrera = new javax.swing.JLabel();
        btnEliminarCarrera = new javax.swing.JLabel();
        lblHeader8 = new javax.swing.JLabel();
        cboFacultad = new javax.swing.JComboBox<>();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTespecialidades = new javax.swing.JTable();
        lblHeader9 = new javax.swing.JLabel();
        lblHeader10 = new javax.swing.JLabel();
        txtespecialidad = new javax.swing.JTextField();
        btnAggEspecialidad = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        btnEditEspecialidad = new javax.swing.JLabel();
        btnEliminarEspec = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTunidades = new javax.swing.JTable();
        lblHeader11 = new javax.swing.JLabel();
        lblHeader12 = new javax.swing.JLabel();
        txtUnidAbrev = new javax.swing.JTextField();
        btnAggUnidMed = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        btnEditUnidMed = new javax.swing.JLabel();
        btnElimUnidMed = new javax.swing.JLabel();
        lblHeader19 = new javax.swing.JLabel();
        txtUnidMed = new javax.swing.JTextField();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTactividades = new javax.swing.JTable();
        lblHeader13 = new javax.swing.JLabel();
        lblHeader17 = new javax.swing.JLabel();
        txtActividad = new javax.swing.JTextField();
        btnAggActividad = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        btnEditActividad = new javax.swing.JLabel();
        btnElimActividad = new javax.swing.JLabel();
        Tab_Empleado2 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        lblHeader74 = new javax.swing.JLabel();
        txtNom2 = new javax.swing.JTextField();
        lblHeader75 = new javax.swing.JLabel();
        txtAp2 = new javax.swing.JTextField();
        lblHeader76 = new javax.swing.JLabel();
        txtTel2 = new javax.swing.JFormattedTextField();
        lblHeader77 = new javax.swing.JLabel();
        txtCel2 = new javax.swing.JFormattedTextField();
        lblHeader78 = new javax.swing.JLabel();
        txtFecNac2 = new javax.swing.JFormattedTextField();
        lblHeader79 = new javax.swing.JLabel();
        rbFem2 = new javax.swing.JRadioButton();
        rbMasc3 = new javax.swing.JRadioButton();
        lblHeader80 = new javax.swing.JLabel();
        txtDo2 = new javax.swing.JTextField();
        btnAggEmp2 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbEmp = new javax.swing.JTable();
        lblHeader81 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        btnEliminarEmpleado = new javax.swing.JLabel();
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
        setMinimumSize(new java.awt.Dimension(1280, 700));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setMaximumSize(null);

        SideBar.setBackground(new java.awt.Color(255, 250, 118));
        SideBar.setMinimumSize(new java.awt.Dimension(270, 328));
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

        btn_empleado.setBackground(new java.awt.Color(0, 0, 0));
        btn_empleado.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btn_empleado.setForeground(new java.awt.Color(255, 255, 255));
        btn_empleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pacientes.png"))); // NOI18N
        btn_empleado.setText("EMPLEADOS");
        btn_empleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_empleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BotoneraLayout = new javax.swing.GroupLayout(Botonera);
        Botonera.setLayout(BotoneraLayout);
        BotoneraLayout.setHorizontalGroup(
            BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoneraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_users, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(btn_farmacia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_docs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_reports, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(btn_config, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(btn_empleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(btn_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(btn_reports, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_config, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout SideBarLayout = new javax.swing.GroupLayout(SideBar);
        SideBar.setLayout(SideBarLayout);
        SideBarLayout.setHorizontalGroup(
            SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Botonera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SideBarLayout.setVerticalGroup(
            SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Botonera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jTAlertas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Medicamento", "Cantidad", "Fecha Vencimiento", "Vence (Dias)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
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
        jScrollPane2.setViewportView(jTAlertas);

        btnAlertaTotal.setText("Todas");
        btnAlertaTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlertaTotalActionPerformed(evt);
            }
        });

        btnAlertaFecha.setText("Vencimiento");
        btnAlertaFecha.setActionCommand("");
        btnAlertaFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlertaFechaActionPerformed(evt);
            }
        });

        btnAlertaCant.setText("Existencia");
        btnAlertaCant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlertaCantActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAlertaFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAlertaTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAlertaCant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lblMedxVencer))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblMedxVencer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(btnAlertaTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlertaFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlertaCant)))
                .addContainerGap(52, Short.MAX_VALUE))
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
                        .addGap(0, 30, Short.MAX_VALUE)
                        .addComponent(jLabel49)
                        .addGap(0, 30, Short.MAX_VALUE))
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
                .addContainerGap(23, Short.MAX_VALUE))
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
                        .addGap(0, 30, Short.MAX_VALUE)
                        .addComponent(jLabel52)
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
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
                        .addContainerGap(40, Short.MAX_VALUE)
                        .addComponent(jLabel55)
                        .addGap(0, 30, Short.MAX_VALUE)))
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
                    .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel34Layout.createSequentialGroup()
                        .addContainerGap(38, Short.MAX_VALUE)
                        .addComponent(jLabel58)
                        .addGap(0, 32, Short.MAX_VALUE)))
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
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 19, Short.MAX_VALUE)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Contenedor.addTab("HOME", null, Tab_home, "");

        Tab_Doctores.setBackground(new java.awt.Color(102, 0, 0));
        Tab_Doctores.setForeground(new java.awt.Color(255, 255, 255));
        Tab_Doctores.setMinimumSize(new java.awt.Dimension(990, 660));

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

        txtDocumento.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtDocumento.setText("XXXXXXXX");
        txtDocumento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        txtNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        txtApellido.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        rbM.setBackground(new java.awt.Color(102, 0, 0));
        rbM.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        rbM.setForeground(new java.awt.Color(255, 255, 255));
        rbM.setSelected(true);
        rbM.setText("Masculino");

        rbF.setBackground(new java.awt.Color(102, 0, 0));
        rbF.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        rbF.setForeground(new java.awt.Color(255, 255, 255));
        rbF.setText("Femenino");

        lblHeader39.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader39.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader39.setText("FECHA NACIMIENTO:");

        lblHeader40.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader40.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader40.setText("TELÉFONO:");

        lblHeader43.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader43.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader43.setText("ESPECIALIDAD:");

        cboEspecialidad.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cboEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Pedíatra" }));
        cboEspecialidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader44.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader44.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader44.setText("DOCTOR NUEVO");

        btnAggDoctor.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnAggDoctor.setForeground(new java.awt.Color(255, 255, 255));
        btnAggDoctor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAggDoctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cruz.png"))); // NOI18N
        btnAggDoctor.setText("Agregar Doctor");
        btnAggDoctor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        btnAggDoctor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAggDoctor.setFocusable(false);
        btnAggDoctor.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAggDoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAggDoctorMouseClicked(evt);
            }
        });

        txtFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        try {
            txtFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        try {
            txtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblHeader64.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader64.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader64.setText("USUARIO:");

        cboUsuario.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cboUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario" }));
        cboUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        javax.swing.GroupLayout jPanelEstNuevoLayout = new javax.swing.GroupLayout(jPanelEstNuevo);
        jPanelEstNuevo.setLayout(jPanelEstNuevoLayout);
        jPanelEstNuevoLayout.setHorizontalGroup(
            jPanelEstNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstNuevoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEstNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEstNuevoLayout.createSequentialGroup()
                        .addGroup(jPanelEstNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblHeader37, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeader21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeader31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeader26, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelEstNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDocumento)
                            .addComponent(txtNombre)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelEstNuevoLayout.createSequentialGroup()
                                .addComponent(rbM)
                                .addGap(18, 18, 18)
                                .addComponent(rbF)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelEstNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEstNuevoLayout.createSequentialGroup()
                                .addGroup(jPanelEstNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblHeader39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblHeader43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblHeader40, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelEstNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboEspecialidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtFecha)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelEstNuevoLayout.createSequentialGroup()
                                .addComponent(lblHeader64, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cboUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAggDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEstNuevoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblHeader44)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelEstNuevoLayout.setVerticalGroup(
            jPanelEstNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstNuevoLayout.createSequentialGroup()
                .addComponent(lblHeader44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEstNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader37)
                    .addComponent(txtDocumento)
                    .addComponent(lblHeader39)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelEstNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEstNuevoLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanelEstNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader21)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHeader43)
                            .addComponent(cboEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanelEstNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader26)
                            .addComponent(txtApellido)
                            .addComponent(lblHeader40)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4))
                    .addGroup(jPanelEstNuevoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnAggDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanelEstNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader31)
                    .addComponent(rbM)
                    .addComponent(rbF)
                    .addComponent(lblHeader64)
                    .addComponent(cboUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel16.setBackground(new java.awt.Color(102, 0, 0));
        jPanel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        lblHeader58.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader58.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader58.setText("LISTA DE DOCTORES");

        tbDoctor.setBackground(new java.awt.Color(204, 204, 204));
        tbDoctor.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        tbDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"2015", "General", "Nombre Apellido", "M", null, "XXX-XXXX", "33", null}
            },
            new String [] {
                "ID", "Nombre", "Especialidad", "Sexo", "JVPM", "Teléfono", "Edad", "Usuario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbDoctor.setGridColor(new java.awt.Color(255, 255, 153));
        tbDoctor.setRowHeight(25);
        tbDoctor.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tbDoctor.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbDoctor.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(tbDoctor);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblHeader58)
                        .addGap(0, 0, Short.MAX_VALUE))
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

        btnMostrarElimDoc.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarElimDoc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnMostrarElimDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btnMostrarElimDoc.setText("MOSTRAR DESACTIVADOS");
        btnMostrarElimDoc.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnMostrarElimDoc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMostrarElimDoc.setFocusable(false);
        btnMostrarElimDoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMostrarElimDoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMostrarElimDoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMostrarElimDocMouseClicked(evt);
            }
        });

        btnElimanarDoctor.setForeground(new java.awt.Color(255, 255, 255));
        btnElimanarDoctor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnElimanarDoctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnElimanarDoctor.setText("ELIMINAR");
        btnElimanarDoctor.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnElimanarDoctor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnElimanarDoctor.setFocusable(false);
        btnElimanarDoctor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnElimanarDoctor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnElimanarDoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnElimanarDoctorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMostrarElimDoc)
                .addGap(18, 18, 18)
                .addComponent(btnElimanarDoctor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnElimanarDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMostrarElimDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanelEstNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGap(0, 170, Short.MAX_VALUE))
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
                        .addGap(0, 503, Short.MAX_VALUE)
                        .addComponent(lblHeader56)
                        .addGap(0, 503, Short.MAX_VALUE))
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
        btnEditMedicamento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        btnBuscarMed.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        jPanel9.setBackground(new java.awt.Color(102, 0, 0));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        lblHeader15.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader15.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader15.setText("USUARIO:");

        lblHeader16.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader16.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader16.setText("CONTRASEÑA:");

        txtUsuario.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtUsuario.setText("NOMBRE NOMBRE");
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader36.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader36.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader36.setText("TIPO:");

        cboTipoUsuario.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cboTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Recepción", "Doctor" }));
        cboTipoUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        btnAggUsuario.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnAggUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnAggUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAggUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cruz.png"))); // NOI18N
        btnAggUsuario.setText("Agregar Usuario");
        btnAggUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        btnAggUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAggUsuario.setFocusable(false);
        btnAggUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAggUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAggUsuarioMouseClicked(evt);
            }
        });

        lblHeader18.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader18.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader18.setText("CONTRASEÑA:");

        lblHeader14.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader14.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader14.setText("DATOS USUARIO");

        lblHeader38.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader38.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader38.setText("EMPLEADO:");

        cboEmpleado.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cboEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado 1", "Empleado 2", "Empleado 3", " " }));
        cboEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        txtPassword2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtPassword2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));

        txtPassword1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtPassword1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHeader18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHeader15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHeader16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtPassword2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPassword1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(lblHeader36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(lblHeader38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(btnAggUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
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
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHeader36)
                            .addComponent(cboTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblHeader38)
                                .addComponent(cboEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblHeader16)
                                .addComponent(txtPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader18)
                            .addComponent(txtPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAggUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
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

        btnEliminarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnEliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnEliminarUsuario.setText("DESACTIVAR");
        btnEliminarUsuario.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEliminarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminarUsuario.setFocusable(false);
        btnEliminarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminarUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarUsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(40, 40, 40)
                .addComponent(btnEliminarUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarUsuario)
                    .addComponent(jLabel11))
                .addContainerGap())
        );

        jPanel13.setBackground(new java.awt.Color(102, 0, 0));
        jPanel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        lblHeader57.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader57.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader57.setText("LISTA DE USUARIOS");

        tbUsuarios.setBackground(new java.awt.Color(204, 204, 204));
        tbUsuarios.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        tbUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"123", "Doctor", "José Ricardo Sifontes Valdez", "Activo", null}
            },
            new String [] {
                "ID", "Usuario", "Contraseña", "Tipo_Usuario", "Empleado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbUsuarios.setGridColor(new java.awt.Color(255, 255, 153));
        tbUsuarios.setRowHeight(25);
        tbUsuarios.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tbUsuarios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbUsuarios.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tbUsuarios);

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
                .addContainerGap(79, Short.MAX_VALUE))
        );

        Contenedor.addTab("USUARIOS", Tab_Usuarios);

        Tab_reports.setBackground(new java.awt.Color(102, 0, 0));
        Tab_reports.setForeground(new java.awt.Color(255, 255, 255));
        Tab_reports.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Tab_reports.setMinimumSize(new java.awt.Dimension(990, 660));

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

        cmbFacultad.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cmbFacultad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ING y ARQ", "CC HH", "CC SALUD" }));
        cmbFacultad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader33.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader33.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader33.setText("CARRERA:");

        cmbCarrera.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cmbCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingemiería en Sistemas" }));
        cmbCarrera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader34.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader34.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader34.setText("DOCTOR:");

        cmbDcotor.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cmbDcotor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DOCTOR 1", "DOCTOR 2", "DOCTOR 3" }));
        cmbDcotor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader35.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader35.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader35.setText("SEXO:");

        cmbSexo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        cmbSexo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader41.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader41.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader41.setText("ACTIVIDAD:");

        cmbActividad.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cmbActividad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Actividad 1", "Actividad 2", "Actividad 3", " " }));
        cmbActividad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader42.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblHeader42.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader42.setText("CAT. ENFERMEDAD");

        txtCodCat.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtCodCat.setText("CODIGO CATEGORÍA");
        txtCodCat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader49.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader49.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader49.setText("DIAGNÓSTICO:");

        txtCodDiag.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtCodDiag.setText("CÓDIGO ENFERMEDAD");
        txtCodDiag.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jLabel41.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("FILTROS");
        jLabel41.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblHeader54.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader54.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader54.setText("DEPARTAMENTO:");

        cmbDepartamento.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cmbDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Santa Ana", "Sonsonate", "Ahuachapan", "San Salvador" }));
        cmbDepartamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader59.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader59.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader59.setText("UBICACIÓN:");

        cmbUbicacion.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cmbUbicacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Urbano", "Rural" }));
        cmbUbicacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        rdbFiltros1.add(rdbSexo);
        rdbSexo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        rdbFiltros1.add(rdbDoctor);
        rdbDoctor.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        rdbFiltros1.add(rdbActividad);
        rdbActividad.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        rdbFiltros1.add(rdbFacultad);
        rdbFacultad.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        rdbFiltros1.add(rdbCarrera);
        rdbCarrera.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        rdbFiltros1.add(rdbDepartamento);
        rdbDepartamento.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        rdbFiltros1.add(rdbCategoria);
        rdbCategoria.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        rdbFiltros1.add(rdbUbicacion);
        rdbUbicacion.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        rdbFiltros1.add(jRadioButton11);
        jRadioButton11.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanelEstNuevo4Layout = new javax.swing.GroupLayout(jPanelEstNuevo4);
        jPanelEstNuevo4.setLayout(jPanelEstNuevo4Layout);
        jPanelEstNuevo4Layout.setHorizontalGroup(
            jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstNuevo4Layout.createSequentialGroup()
                .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEstNuevo4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel41)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelEstNuevo4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEstNuevo4Layout.createSequentialGroup()
                                .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEstNuevo4Layout.createSequentialGroup()
                                        .addComponent(rdbUbicacion)
                                        .addGap(12, 12, 12)
                                        .addComponent(lblHeader59, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEstNuevo4Layout.createSequentialGroup()
                                        .addComponent(rdbDoctor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblHeader34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEstNuevo4Layout.createSequentialGroup()
                                        .addComponent(rdbSexo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblHeader35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEstNuevo4Layout.createSequentialGroup()
                                        .addComponent(rdbActividad)
                                        .addGap(12, 12, 12)
                                        .addComponent(lblHeader41))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEstNuevo4Layout.createSequentialGroup()
                                        .addComponent(rdbFacultad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblHeader32, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEstNuevo4Layout.createSequentialGroup()
                                        .addComponent(rdbCarrera)
                                        .addGap(12, 12, 12)
                                        .addComponent(lblHeader33, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEstNuevo4Layout.createSequentialGroup()
                                        .addComponent(rdbDepartamento)
                                        .addGap(12, 12, 12)
                                        .addComponent(lblHeader54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbDepartamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbActividad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbDcotor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbCarrera, 0, 496, Short.MAX_VALUE)
                                    .addComponent(cmbFacultad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbUbicacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEstNuevo4Layout.createSequentialGroup()
                                .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelEstNuevo4Layout.createSequentialGroup()
                                        .addComponent(rdbCategoria)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblHeader42, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelEstNuevo4Layout.createSequentialGroup()
                                        .addComponent(jRadioButton11)
                                        .addGap(12, 12, 12)
                                        .addComponent(lblHeader49, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodCat)
                                    .addComponent(txtCodDiag))))))
                .addContainerGap())
        );
        jPanelEstNuevo4Layout.setVerticalGroup(
            jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEstNuevo4Layout.createSequentialGroup()
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelEstNuevo4Layout.createSequentialGroup()
                        .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelEstNuevo4Layout.createSequentialGroup()
                                .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelEstNuevo4Layout.createSequentialGroup()
                                        .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblHeader34)
                                            .addComponent(cmbDcotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(lblHeader35)
                                                .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(rdbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(rdbDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblHeader41)
                                    .addComponent(cmbActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(rdbActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblHeader32)
                                .addComponent(cmbFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rdbFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblHeader33)
                                .addComponent(cmbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rdbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader54)
                            .addComponent(cmbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(rdbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rdbUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHeader59)
                        .addComponent(cmbUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelEstNuevo4Layout.createSequentialGroup()
                        .addComponent(rdbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEstNuevo4Layout.createSequentialGroup()
                        .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHeader42)
                            .addComponent(txtCodCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelEstNuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader49)
                            .addComponent(txtCodDiag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

        txtFechaInicio.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtFechaInicio.setText("XX-XX-XXXX");
        txtFechaInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        txtFechaFinal.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtFechaFinal.setText("XX-XX-XXXX");
        txtFechaFinal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader53.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader53.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader53.setText("PERIODO:");

        cmbPeriodo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cmbPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DIARIO", "MENSUAL", "ANUAL" }));
        cmbPeriodo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

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
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

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
                            .addComponent(txtFechaFinal, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbPeriodo, javax.swing.GroupLayout.Alignment.LEADING, 0, 250, Short.MAX_VALUE)
                            .addComponent(txtFechaInicio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addContainerGap())
                    .addGroup(jPanelEstNuevo5Layout.createSequentialGroup()
                        .addGap(0, 312, Short.MAX_VALUE)
                        .addComponent(jLabel42)
                        .addContainerGap(312, Short.MAX_VALUE))))
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
                            .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelEstNuevo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader52)
                            .addComponent(txtFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelEstNuevo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader53)
                            .addComponent(cmbPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        lblHeader60.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader60.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader60.setText("ID PACIENTE:");

        lblHeader61.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader61.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader61.setText("NOMBRES:");

        txtNombres.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtNombres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        txtApellidos.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtApellidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jLabel43.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("FILTROS");
        jLabel43.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtIdPac.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtIdPac.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        btnBuscarExpediente.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarExpediente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnBuscarExpediente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnBuscarExpediente.setText("BUSCAR EXPEDIENTE");
        btnBuscarExpediente.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnBuscarExpediente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarExpediente.setFocusable(false);
        btnBuscarExpediente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarExpediente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscarExpediente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarExpedienteMouseClicked(evt);
            }
        });

        lblHeader62.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader62.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader62.setText("CARNET/DOC:");

        txtCarnetRoot.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtCarnetRoot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        rdbFiltros2.add(rdbIdPac);
        rdbIdPac.setSelected(true);

        rdbFiltros2.add(rdbCarnet);

        rdbFiltros2.add(rdbNombres);

        rdbFiltros2.add(rdbApellidos);

        javax.swing.GroupLayout jPanelEstNuevo6Layout = new javax.swing.GroupLayout(jPanelEstNuevo6);
        jPanelEstNuevo6.setLayout(jPanelEstNuevo6Layout);
        jPanelEstNuevo6Layout.setHorizontalGroup(
            jPanelEstNuevo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstNuevo6Layout.createSequentialGroup()
                .addGroup(jPanelEstNuevo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEstNuevo6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelEstNuevo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelEstNuevo6Layout.createSequentialGroup()
                                .addComponent(rdbIdPac)
                                .addGap(12, 12, 12)
                                .addComponent(lblHeader60, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelEstNuevo6Layout.createSequentialGroup()
                                .addGroup(jPanelEstNuevo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdbCarnet)
                                    .addComponent(rdbNombres)
                                    .addComponent(rdbApellidos))
                                .addGap(12, 12, 12)
                                .addGroup(jPanelEstNuevo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHeader51, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblHeader61, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblHeader62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelEstNuevo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombres)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                            .addComponent(txtIdPac)
                            .addComponent(txtCarnetRoot, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanelEstNuevo6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelEstNuevo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43)
                            .addComponent(btnBuscarExpediente))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelEstNuevo6Layout.setVerticalGroup(
            jPanelEstNuevo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEstNuevo6Layout.createSequentialGroup()
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEstNuevo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelEstNuevo6Layout.createSequentialGroup()
                        .addGroup(jPanelEstNuevo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdbIdPac, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelEstNuevo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblHeader60)
                                .addComponent(txtIdPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelEstNuevo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader62)
                            .addComponent(txtCarnetRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(rdbCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEstNuevo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEstNuevo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHeader61)
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rdbNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEstNuevo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEstNuevo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHeader51)
                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rdbApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBuscarExpediente)
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

        btnGenReporteExpediente.setForeground(new java.awt.Color(255, 255, 255));
        btnGenReporteExpediente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnGenReporteExpediente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accept.png"))); // NOI18N
        btnGenReporteExpediente.setText("GENERAR REPORTE");
        btnGenReporteExpediente.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnGenReporteExpediente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGenReporteExpediente.setFocusable(false);
        btnGenReporteExpediente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGenReporteExpediente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGenReporteExpediente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenReporteExpedienteMouseClicked(evt);
            }
        });

        jtBuscarExpediente.setBackground(new java.awt.Color(204, 204, 204));
        jtBuscarExpediente.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jtBuscarExpediente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Carnet", "Nombre", "Fecha Cons."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtBuscarExpediente.setGridColor(new java.awt.Color(255, 255, 153));
        jtBuscarExpediente.setRowHeight(25);
        jtBuscarExpediente.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jtBuscarExpediente.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtBuscarExpediente.getTableHeader().setReorderingAllowed(false);
        jScrollPane14.setViewportView(jtBuscarExpediente);

        javax.swing.GroupLayout jPanelEstNuevo7Layout = new javax.swing.GroupLayout(jPanelEstNuevo7);
        jPanelEstNuevo7.setLayout(jPanelEstNuevo7Layout);
        jPanelEstNuevo7Layout.setHorizontalGroup(
            jPanelEstNuevo7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstNuevo7Layout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addComponent(jLabel46)
                .addContainerGap(180, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEstNuevo7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEstNuevo7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGenReporteExpediente)
                .addGap(131, 131, 131))
        );
        jPanelEstNuevo7Layout.setVerticalGroup(
            jPanelEstNuevo7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEstNuevo7Layout.createSequentialGroup()
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnGenReporteExpediente)
                .addContainerGap())
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
                .addComponent(jPanelEstNuevo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelEstNuevo7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap(60, Short.MAX_VALUE))
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
        if (jTcategorias.getColumnModel().getColumnCount() > 0) {
            jTcategorias.getColumnModel().getColumn(0).setMaxWidth(45);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 532, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
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

        txtCategoria.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtCategoria.setText("Categoría");
        txtCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        btnAggCategoria.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnAggCategoria.setForeground(new java.awt.Color(255, 255, 255));
        btnAggCategoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAggCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cruz.png"))); // NOI18N
        btnAggCategoria.setText("Agregar Categoría");
        btnAggCategoria.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        btnAggCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAggCategoria.setFocusable(false);
        btnAggCategoria.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAggCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAggCategoriaMouseClicked(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(102, 0, 0));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 2, true));

        btnEditCategoria.setForeground(new java.awt.Color(255, 255, 255));
        btnEditCategoria.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnEditCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btnEditCategoria.setText("EDITAR");
        btnEditCategoria.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEditCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEditCategoria.setFocusable(false);
        btnEditCategoria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditCategoria.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditCategoriaMouseClicked(evt);
            }
        });

        btnElimCategoria.setForeground(new java.awt.Color(255, 255, 255));
        btnElimCategoria.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnElimCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnElimCategoria.setText("ELIMINAR");
        btnElimCategoria.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnElimCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnElimCategoria.setFocusable(false);
        btnElimCategoria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnElimCategoria.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnElimCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnElimCategoriaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditCategoria)
                .addGap(40, 40, 40)
                .addComponent(btnElimCategoria)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnElimCategoria)
                    .addComponent(btnEditCategoria))
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
                                    .addComponent(btnAggCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCategoria)))
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblHeader2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(lblHeader2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCategoria)
                            .addComponent(lblHeader3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAggCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        if (jTfacultades.getColumnModel().getColumnCount() > 0) {
            jTfacultades.getColumnModel().getColumn(0).setMaxWidth(45);
        }

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
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

        txtFacultad.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtFacultad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        btnAggFacultad.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnAggFacultad.setForeground(new java.awt.Color(255, 255, 255));
        btnAggFacultad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAggFacultad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cruz.png"))); // NOI18N
        btnAggFacultad.setText("Agregar Facultad");
        btnAggFacultad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        btnAggFacultad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAggFacultad.setFocusable(false);
        btnAggFacultad.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAggFacultad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAggFacultadMouseClicked(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(102, 0, 0));
        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 2, true));

        btnEditFacultad.setForeground(new java.awt.Color(255, 255, 255));
        btnEditFacultad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnEditFacultad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btnEditFacultad.setText("EDITAR");
        btnEditFacultad.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEditFacultad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEditFacultad.setFocusable(false);
        btnEditFacultad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditFacultad.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditFacultad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditFacultadMouseClicked(evt);
            }
        });

        btnEliminarFacultad.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarFacultad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnEliminarFacultad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnEliminarFacultad.setText("ELIMINAR");
        btnEliminarFacultad.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEliminarFacultad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminarFacultad.setFocusable(false);
        btnEliminarFacultad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminarFacultad.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(btnEditFacultad)
                .addGap(40, 40, 40)
                .addComponent(btnEliminarFacultad)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarFacultad)
                    .addComponent(btnEditFacultad))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(lblHeader5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAggFacultad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFacultad)))
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(lblHeader4)
                        .addContainerGap())
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addComponent(lblHeader4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFacultad)
                            .addComponent(lblHeader5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAggFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        if (jTcarreras.getColumnModel().getColumnCount() > 0) {
            jTcarreras.getColumnModel().getColumn(0).setMaxWidth(45);
        }

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel20Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
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

        txtCarrera.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtCarrera.setText("Carrera");
        txtCarrera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));
        txtCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarreraActionPerformed(evt);
            }
        });

        btnAggCarrera.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnAggCarrera.setForeground(new java.awt.Color(255, 255, 255));
        btnAggCarrera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAggCarrera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cruz.png"))); // NOI18N
        btnAggCarrera.setText("Agregar Carrera");
        btnAggCarrera.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        btnAggCarrera.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAggCarrera.setFocusable(false);
        btnAggCarrera.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAggCarrera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAggCarreraMouseClicked(evt);
            }
        });

        jPanel21.setBackground(new java.awt.Color(102, 0, 0));
        jPanel21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 2, true));

        btnEditarCarrera.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarCarrera.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnEditarCarrera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btnEditarCarrera.setText("EDITAR");
        btnEditarCarrera.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEditarCarrera.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEditarCarrera.setFocusable(false);
        btnEditarCarrera.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditarCarrera.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditarCarrera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarCarreraMouseClicked(evt);
            }
        });

        btnEliminarCarrera.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCarrera.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnEliminarCarrera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnEliminarCarrera.setText("ELIMINAR");
        btnEliminarCarrera.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEliminarCarrera.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminarCarrera.setFocusable(false);
        btnEliminarCarrera.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminarCarrera.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditarCarrera)
                .addGap(40, 40, 40)
                .addComponent(btnEliminarCarrera)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarCarrera)
                    .addComponent(btnEditarCarrera))
                .addContainerGap())
        );

        lblHeader8.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        lblHeader8.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader8.setText("FACULTAD:");

        cboFacultad.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cboFacultad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC HH" }));
        cboFacultad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHeader7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblHeader8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAggCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboFacultad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCarrera)))
                            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblHeader6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addComponent(lblHeader6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHeader8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCarrera)
                            .addComponent(lblHeader7))
                        .addGap(2, 2, 2)
                        .addComponent(btnAggCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel22.setBackground(new java.awt.Color(102, 0, 0));
        jPanel22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        jPanel23.setBackground(new java.awt.Color(102, 0, 0));
        jPanel23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));

        jTespecialidades.setBackground(new java.awt.Color(204, 204, 204));
        jTespecialidades.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTespecialidades.setModel(new javax.swing.table.DefaultTableModel(
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
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTespecialidades.setGridColor(new java.awt.Color(255, 255, 153));
        jTespecialidades.setRowHeight(25);
        jTespecialidades.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTespecialidades.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTespecialidades.getTableHeader().setReorderingAllowed(false);
        jScrollPane9.setViewportView(jTespecialidades);
        if (jTespecialidades.getColumnModel().getColumnCount() > 0) {
            jTespecialidades.getColumnModel().getColumn(0).setMaxWidth(45);
        }

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblHeader9.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        lblHeader9.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader9.setText("ESPECIALIDADES DOCTORES");

        lblHeader10.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        lblHeader10.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader10.setText("ESPECIALIDAD:");

        txtespecialidad.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtespecialidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        btnAggEspecialidad.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnAggEspecialidad.setForeground(new java.awt.Color(255, 255, 255));
        btnAggEspecialidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAggEspecialidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cruz.png"))); // NOI18N
        btnAggEspecialidad.setText("Agregar Especialidad");
        btnAggEspecialidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        btnAggEspecialidad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAggEspecialidad.setFocusable(false);
        btnAggEspecialidad.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAggEspecialidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAggEspecialidadMouseClicked(evt);
            }
        });

        jPanel24.setBackground(new java.awt.Color(102, 0, 0));
        jPanel24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 2, true));

        btnEditEspecialidad.setForeground(new java.awt.Color(255, 255, 255));
        btnEditEspecialidad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnEditEspecialidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btnEditEspecialidad.setText("EDITAR");
        btnEditEspecialidad.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEditEspecialidad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEditEspecialidad.setFocusable(false);
        btnEditEspecialidad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditEspecialidad.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditEspecialidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditEspecialidadMouseClicked(evt);
            }
        });

        btnEliminarEspec.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarEspec.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnEliminarEspec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnEliminarEspec.setText("ELIMINAR");
        btnEliminarEspec.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEliminarEspec.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminarEspec.setFocusable(false);
        btnEliminarEspec.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminarEspec.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditEspecialidad)
                .addGap(40, 40, 40)
                .addComponent(btnEliminarEspec)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarEspec)
                    .addComponent(btnEditEspecialidad))
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
                                    .addComponent(btnAggEspecialidad, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                    .addComponent(txtespecialidad))
                                .addGap(0, 35, Short.MAX_VALUE))
                            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblHeader9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addComponent(lblHeader9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtespecialidad)
                            .addComponent(lblHeader10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAggEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                {"23", "CC HH", null}
            },
            new String [] {
                "ID", "Unidad de medida", "Abreviatura"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jTunidades.setColumnSelectionAllowed(true);
        jTunidades.setGridColor(new java.awt.Color(255, 255, 153));
        jTunidades.setRowHeight(25);
        jTunidades.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTunidades.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTunidades.getTableHeader().setReorderingAllowed(false);
        jScrollPane10.setViewportView(jTunidades);
        jTunidades.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTunidades.getColumnModel().getColumnCount() > 0) {
            jTunidades.getColumnModel().getColumn(0).setMaxWidth(45);
        }

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
        );

        lblHeader11.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        lblHeader11.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader11.setText("UNIDADES DE MEDIDA");

        lblHeader12.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        lblHeader12.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader12.setText("ABREVIATURA:");

        txtUnidAbrev.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtUnidAbrev.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        btnAggUnidMed.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnAggUnidMed.setForeground(new java.awt.Color(255, 255, 255));
        btnAggUnidMed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAggUnidMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cruz.png"))); // NOI18N
        btnAggUnidMed.setText("Agregar Unidad");
        btnAggUnidMed.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        btnAggUnidMed.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAggUnidMed.setFocusable(false);
        btnAggUnidMed.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAggUnidMed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAggUnidMedMouseClicked(evt);
            }
        });

        jPanel27.setBackground(new java.awt.Color(102, 0, 0));
        jPanel27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 2, true));

        btnEditUnidMed.setForeground(new java.awt.Color(255, 255, 255));
        btnEditUnidMed.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnEditUnidMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btnEditUnidMed.setText("EDITAR");
        btnEditUnidMed.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEditUnidMed.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEditUnidMed.setFocusable(false);
        btnEditUnidMed.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditUnidMed.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditUnidMed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditUnidMedMouseClicked(evt);
            }
        });

        btnElimUnidMed.setForeground(new java.awt.Color(255, 255, 255));
        btnElimUnidMed.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnElimUnidMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnElimUnidMed.setText("ELIMINAR");
        btnElimUnidMed.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnElimUnidMed.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnElimUnidMed.setFocusable(false);
        btnElimUnidMed.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnElimUnidMed.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditUnidMed)
                .addGap(40, 40, 40)
                .addComponent(btnElimUnidMed)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnElimUnidMed)
                    .addComponent(btnEditUnidMed))
                .addContainerGap())
        );

        lblHeader19.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        lblHeader19.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader19.setText("UNIDAD:");

        txtUnidMed.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtUnidMed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(txtUnidAbrev))
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblHeader19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblHeader12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel25Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAggUnidMed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel25Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(txtUnidMed, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblHeader11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addComponent(lblHeader11)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUnidMed)
                            .addComponent(lblHeader19))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtUnidAbrev)
                                    .addComponent(lblHeader12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAggUnidMed, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114))
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel28.setBackground(new java.awt.Color(102, 0, 0));
        jPanel28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        jPanel29.setBackground(new java.awt.Color(102, 0, 0));
        jPanel29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));

        jTactividades.setBackground(new java.awt.Color(204, 204, 204));
        jTactividades.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTactividades.setModel(new javax.swing.table.DefaultTableModel(
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
        jTactividades.setGridColor(new java.awt.Color(255, 255, 153));
        jTactividades.setRowHeight(25);
        jTactividades.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTactividades.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTactividades.getTableHeader().setReorderingAllowed(false);
        jScrollPane11.setViewportView(jTactividades);
        if (jTactividades.getColumnModel().getColumnCount() > 0) {
            jTactividades.getColumnModel().getColumn(0).setMaxWidth(45);
        }

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
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

        txtActividad.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtActividad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        btnAggActividad.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnAggActividad.setForeground(new java.awt.Color(255, 255, 255));
        btnAggActividad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAggActividad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cruz.png"))); // NOI18N
        btnAggActividad.setText("Agregar Actividad");
        btnAggActividad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        btnAggActividad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAggActividad.setFocusable(false);
        btnAggActividad.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAggActividad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAggActividadMouseClicked(evt);
            }
        });

        jPanel30.setBackground(new java.awt.Color(102, 0, 0));
        jPanel30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 2, true));

        btnEditActividad.setForeground(new java.awt.Color(255, 255, 255));
        btnEditActividad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnEditActividad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btnEditActividad.setText("EDITAR");
        btnEditActividad.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEditActividad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEditActividad.setFocusable(false);
        btnEditActividad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditActividad.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditActividad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditActividadMouseClicked(evt);
            }
        });

        btnElimActividad.setForeground(new java.awt.Color(255, 255, 255));
        btnElimActividad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnElimActividad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnElimActividad.setText("ELIMINAR");
        btnElimActividad.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnElimActividad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnElimActividad.setFocusable(false);
        btnElimActividad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnElimActividad.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(btnEditActividad)
                .addGap(40, 40, 40)
                .addComponent(btnElimActividad)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnElimActividad)
                    .addComponent(btnEditActividad))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(lblHeader17, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAggActividad, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(txtActividad)))
                    .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(lblHeader13)
                        .addContainerGap(415, Short.MAX_VALUE))
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addComponent(lblHeader13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtActividad)
                            .addComponent(lblHeader17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAggActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(281, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(1255, Short.MAX_VALUE)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1268, Short.MAX_VALUE)
                .addContainerGap())
        );
        Tab_ConfigLayout.setVerticalGroup(
            Tab_ConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab_ConfigLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        Contenedor.addTab("CONFIGURACIONES", Tab_Config);

        Tab_Empleado2.setBackground(new java.awt.Color(102, 0, 0));

        jPanel38.setBackground(new java.awt.Color(102, 0, 0));
        jPanel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51), 2));

        lblHeader74.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader74.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader74.setText("NOMBRE:");

        lblHeader75.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader75.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader75.setText("DOCUMENTO:");

        lblHeader76.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader76.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader76.setText("APELLIDO:");

        try {
            txtTel2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblHeader77.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader77.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader77.setText("TELEFONO:");

        try {
            txtCel2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblHeader78.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader78.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader78.setText("CELULAR:");

        try {
            txtFecNac2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblHeader79.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader79.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader79.setText("FECHA NACIMIENTO:");

        rbFem2.setBackground(new java.awt.Color(102, 0, 0));
        rbFem2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        rbFem2.setForeground(new java.awt.Color(255, 255, 255));
        rbFem2.setText("Femenino");

        rbMasc3.setBackground(new java.awt.Color(102, 0, 0));
        rbMasc3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        rbMasc3.setForeground(new java.awt.Color(255, 255, 255));
        rbMasc3.setText("Masculino");

        lblHeader80.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader80.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader80.setText("SEXO:");

        btnAggEmp2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnAggEmp2.setForeground(new java.awt.Color(255, 255, 255));
        btnAggEmp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAggEmp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cruz.png"))); // NOI18N
        btnAggEmp2.setText("Agregar Empleado");
        btnAggEmp2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        btnAggEmp2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAggEmp2.setFocusable(false);
        btnAggEmp2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAggEmp2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAggEmp2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHeader74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeader76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeader77, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addComponent(lblHeader78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNom2)
                    .addComponent(txtAp2)
                    .addComponent(txtTel2, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(txtCel2))
                .addGap(95, 95, 95)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel38Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblHeader80)
                                .addGap(8, 8, 8)
                                .addComponent(rbMasc3))
                            .addComponent(lblHeader75))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbFem2)
                            .addGroup(jPanel38Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(txtDo2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addComponent(btnAggEmp2)
                        .addContainerGap())
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addComponent(lblHeader79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFecNac2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(230, 230, 230))))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader74)
                    .addComponent(txtNom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecNac2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeader79))
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel38Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblHeader76)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblHeader80)
                                    .addComponent(rbMasc3)
                                    .addComponent(rbFem2))
                                .addGap(4, 4, 4)))
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel38Layout.createSequentialGroup()
                                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblHeader77))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblHeader78)))
                            .addGroup(jPanel38Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHeader75)
                                    .addComponent(txtDo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(btnAggEmp2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
        );

        jPanel39.setBackground(new java.awt.Color(102, 0, 0));
        jPanel39.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 51), 2, true));

        tbEmp.setBackground(new java.awt.Color(204, 204, 204));
        tbEmp.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        tbEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"2015", "General", "Nombre Apellido", "M", null, "XXX-XXXX", "33"}
            },
            new String [] {
                "ID", "Nombre", "Telefono", "Celular", "Edad", "Sexo", "Documento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbEmp.setGridColor(new java.awt.Color(255, 255, 153));
        tbEmp.setRowHeight(25);
        tbEmp.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tbEmp.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(tbEmp);

        lblHeader81.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader81.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader81.setText("LISTA DE EMPLEADOS");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 941, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(377, 377, 377)
                .addComponent(lblHeader81)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader81)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jPanel40.setBackground(new java.awt.Color(102, 0, 0));
        jPanel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51), 2));

        btnEliminarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnEliminarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnEliminarEmpleado.setText("DESACTIVAR");
        btnEliminarEmpleado.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEliminarEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminarEmpleado.setFocusable(false);
        btnEliminarEmpleado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminarEmpleado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarEmpleadoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel40Layout.createSequentialGroup()
                    .addGap(449, 449, 449)
                    .addComponent(btnEliminarEmpleado)
                    .addContainerGap(449, Short.MAX_VALUE)))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
            .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel40Layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(btnEliminarEmpleado)
                    .addContainerGap(16, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout Tab_Empleado2Layout = new javax.swing.GroupLayout(Tab_Empleado2);
        Tab_Empleado2.setLayout(Tab_Empleado2Layout);
        Tab_Empleado2Layout.setHorizontalGroup(
            Tab_Empleado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab_Empleado2Layout.createSequentialGroup()
                .addGroup(Tab_Empleado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Tab_Empleado2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tab_Empleado2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Tab_Empleado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        Tab_Empleado2Layout.setVerticalGroup(
            Tab_Empleado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab_Empleado2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Contenedor.addTab("EMPLEADOS", Tab_Empleado2);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(SideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(45, 45, 45))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
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
    
     public void llenarEmp() throws SQLException {
        // llenar el combobox de facultad
        Object[] array = this.conn.Obt_Empleado();

        this.idEmp = (int[]) array[0];
        DefaultComboBoxModel model = new DefaultComboBoxModel((Object[]) array[1]);
        this.cboEmpleado.setModel(model);
    }
    
       public void llenarEsp() throws SQLException {
        
        Object[] array = this.conn.Obt_Especialidad();

        this.idEsp = (int[]) array[0];
        DefaultComboBoxModel model = new DefaultComboBoxModel((Object[]) array[1]);
        this.cboEspecialidad.setModel(model);
    }
    
    public void llenarUsr() throws SQLException {
       
        Object[] array = this.conn.Obt_Usuario();

        this.idUsr = (int[]) array[0];
        DefaultComboBoxModel model = new DefaultComboBoxModel((Object[]) array[1]);
        this.cboUsuario.setModel(model);
    }
    
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

    private void btn_farmaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_farmaciaActionPerformed
        this.Contenedor.setSelectedIndex(2);
        this.lblHeader.setText("FARMACIA");

        this.btn_farmacia.setBackground(Color.decode("#660000"));
        this.btn_docs.setBackground(Color.black);
        this.btn_users.setBackground(Color.black);
        this.btn_reports.setBackground(Color.black);
        this.btn_config.setBackground(Color.black);
    }//GEN-LAST:event_btn_farmaciaActionPerformed

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

    private void SideBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SideBarMouseDragged
        //int x = evt.getXOnScreen();
        //int y = evt.getYOnScreen();
        //this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_SideBarMouseDragged

    private void SideBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SideBarMousePressed
        //this.setOpacity((float)0.8);
        //xx=evt.getX();
        //xy = evt.getY();
    }//GEN-LAST:event_SideBarMousePressed

    private void SideBarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SideBarMouseReleased
        //this.setOpacity((float)1.0);
    }//GEN-LAST:event_SideBarMouseReleased

    private void btnAggDoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggDoctorMouseClicked

        Doctor dc = new Doctor();

        dc.nombre = this.txtNombre.getText();
        dc.apellido = this.txtApellido.getText();
        dc.idEspecialidad = this.idEsp[this.cboEspecialidad.getSelectedIndex()];
        dc.telefono = this.txtTelefono.getText();
        dc.fechaNac = this.txtFecha.getText();
        dc.documento = this.txtDocumento.getText();
        dc.idUsuario = this.idUsr[this.cboUsuario.getSelectedIndex()];

        if (this.rbM.isSelected()) {
            dc.sexo = "M";

        } else {
            dc.sexo = "F";
        }

        if (dc.Validar().equals("Exito")) {

            String resultado = "";

            try {

                resultado = conn.aggDoctor(dc);
                this.tbDoctor.setModel(this.conn.getDocs(tbDoctor));
                this.txtNombre.setText("");
                this.txtApellido.setText("");
                this.txtTelefono.setText("");
                this.txtFecha.setText("");
                this.txtDocumento.setText("");

            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(this, ex.toString());
            }
            JOptionPane.showMessageDialog(this, resultado);
        } else {
            JOptionPane.showMessageDialog(this, "ERROR: Revise que no existan campos requeridos vacios");
        }

    }//GEN-LAST:event_btnAggDoctorMouseClicked

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
                Logger.getLogger(Home_Root_corrupted.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnEditMedicamentoMouseClicked

    private void btnBuscarMedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMedMouseClicked
        //Buscar medicamento pestaña farmacia
        this.pUpBuscarMedicamento.show(evt.getComponent(), evt.getX(), evt.getY());
    }//GEN-LAST:event_btnBuscarMedMouseClicked

    private void btnAggUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggUsuarioMouseClicked

        Usuario us= new Usuario();

        us.user= this.txtUsuario.getText();
        us.password1= new String(txtPassword1.getPassword());
        us.password2= new String(txtPassword2.getPassword());
        us.tipo_usr= this.cboTipoUsuario.getSelectedIndex();
        us.empleado=this.idEmp[this.cboEmpleado.getSelectedIndex()];

        if(us.ValidarAgg().equals("Exito")){

            String resultado="";

            try {

                resultado= conn.aggUsuario(us);
                this.tbUsuarios.setModel(this.conn.getUsuarios(tbUsuarios));
                this.txtUsuario.setText("");
                this.txtPassword1.setText("");
                this.txtPassword2.setText("");

            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(this,ex.toString());
            }
            JOptionPane.showMessageDialog(this, resultado);
        }else {
            JOptionPane.showMessageDialog(this, "ERROR: Revise que no existan campos requeridos vacios");
        }

    }//GEN-LAST:event_btnAggUsuarioMouseClicked

    private void jPanelEstNuevo4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEstNuevo4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelEstNuevo4MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked

    }//GEN-LAST:event_jLabel8MouseClicked

    private void jPanelEstNuevo5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEstNuevo5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelEstNuevo5MouseClicked

    private void btnBuscarExpedienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarExpedienteMouseClicked
        if(this.rdbCarnet.isSelected()){
            // Buscar medicamento por carnet
            if (this.txtCarnetRoot.getText().length() > 5){
                try {
                    String carnet = this.txtCarnetRoot.getText();
                    this.jtBuscarExpediente.setModel(this.conn.getExpedienteRootByCarnet(jtBuscarExpediente, carnet));
                } catch (SQLException ex) {
                    Logger.getLogger(Home_Recepcion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if(this.rdbApellidos.isSelected()){
            // Buscar medicamento por apellidos
            if (this.txtApellidos.getText().length() > 3){
                try {
                    String apellido = this.txtApellidos.getText();
                    this.jtBuscarExpediente.setModel(this.conn.getExpedienteRootByApellidos(jtBuscarExpediente, apellido));
                } catch (SQLException ex) {
                    Logger.getLogger(Home_Recepcion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if(this.rdbIdPac.isSelected()){
            // Buscar medicamento por ID
            if (this.txtIdPac.getText().length() > 0){
                try {
                    int id = Integer.parseInt(this.txtIdPac.getText());
                    this.jtBuscarExpediente.setModel(this.conn.getExpedienteRootByID(jtBuscarExpediente, id));
                } catch (SQLException ex) {
                    Logger.getLogger(Home_Recepcion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if(this.rdbNombres.isSelected()){
            // Buscar medicamento por Nombres
            if (this.txtNombres.getText().length() > 2){
                try {
                    String nombre = this.txtNombres.getText();
                    this.jtBuscarExpediente.setModel(this.conn.getExpedienteRootByNombres(jtBuscarExpediente, nombre));
                } catch (SQLException ex) {
                    Logger.getLogger(Home_Recepcion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }//GEN-LAST:event_btnBuscarExpedienteMouseClicked

    private void jPanelEstNuevo6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEstNuevo6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelEstNuevo6MouseClicked

    private void btnGenReporteExpedienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenReporteExpedienteMouseClicked
        //REPORTE DE EXPEDIENTE SELECCIONADO
        if (this.jtBuscarExpediente.getSelectedRows().length == 1)
        {
            int idConsulta = Integer.parseInt(this.jtBuscarExpediente.getModel().getValueAt(this.jtBuscarExpediente.getSelectedRow(), 0).toString());
            Map parameters = new HashMap ();
            //A nuestro informe de prueba le vamos a enviar la fecha de hoy
            parameters.put ("idConsulta", idConsulta);
            JasperReport reporte; //Creo el objeto reporte
            // Ubicacion del Reporte
            String path = ".\\src\\Reportes\\reporte_expediente.jasper"; //"../Reportes/reporte_expediente.jasper";
            try {
                reporte = (JasperReport) JRLoader.loadObjectFromFile(path); //Cargo el reporte al objeto
                JasperPrint jprint = JasperFillManager.fillReport(path, parameters, this.conn.conn); //Llenado del Reporte con Tres parametros ubicacion,parametros,conexion a la base de datos
                JasperViewer viewer = new JasperViewer(jprint,false); //Creamos la vista del Reporte
                viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Le agregamos que se cierre solo el reporte cuando lo cierre el usuario
                viewer.setVisible(true); //Inicializamos la vista del Reporte
            } catch (JRException ex) {
                Logger.getLogger(Home_Root_corrupted.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnGenReporteExpedienteMouseClicked

    private void jPanelEstNuevo7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEstNuevo7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelEstNuevo7MouseClicked

    private void btnAggCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggCategoriaMouseClicked
        TipoMedicamentoJpaController t=new TipoMedicamentoJpaController(entityMain.getInstance());
        TipoMedicamento tm=new TipoMedicamento();
        tm.setTipoMed(this.txtCategoria.getText());
        if(this.txtCategoria.getText().trim().length()>3){
            try{
                t.create(tm);
                conn.getCatMedicamento(this.jTcategorias);
                this.txtCategoria.setText("");
                JOptionPane.showMessageDialog(null,"Categoria agregada correctamente");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error"+e.toString());}
        }else{JOptionPane.showMessageDialog(null,"verifique el campo");}

    }//GEN-LAST:event_btnAggCategoriaMouseClicked

    private void btnEditCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditCategoriaMouseClicked
        int totalfilas=this.jTcategorias.getSelectedRowCount();
        if(totalfilas==1){
            int nfila=this.jTcategorias.getSelectedRow();
            int id=Integer.parseInt(jTcategorias.getValueAt(nfila, 0).toString());
            String nombreCat=jTcategorias.getValueAt(nfila, 1).toString();
            String categoria="";
            categoria=JOptionPane.showInputDialog(null, "Modificar categoria:",nombreCat);

            if((!categoria.equals("")) && (categoria.trim().length()>3)){
                try{
                    TipoMedicamentoJpaController t=new TipoMedicamentoJpaController(entityMain.getInstance());
                    TipoMedicamento tpm=new TipoMedicamento();
                    tpm.setIdtipoMed(id);
                    tpm.setTipoMed(categoria);
                    t.edit(tpm);
                    conn.getCatMedicamento(this.jTcategorias);
                    JOptionPane.showMessageDialog(null, "categoria Actualizada");
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e.getMessage().toString());
                }
            }else{
                JOptionPane.showMessageDialog(null, "Error en la edición");
            }

        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        }
    }//GEN-LAST:event_btnEditCategoriaMouseClicked

    private void btnAggFacultadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggFacultadMouseClicked
        FacultadJpaController t=new FacultadJpaController(entityMain.getInstance());
        Facultad fa=new Facultad();
        fa.setFactultad(txtFacultad.getText());
        if(this.txtFacultad.getText().trim().length()>3){
            try{
                t.create(fa);
                conn.getFacultades(this.jTfacultades);
                this.llenarFacultad();
                JOptionPane.showMessageDialog(null,"Facultad agregada correctamente");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error"+e.toString());}
        }else{ JOptionPane.showMessageDialog(null,"verifique el campo");}
    }//GEN-LAST:event_btnAggFacultadMouseClicked

    private void btnEditFacultadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditFacultadMouseClicked
        int totalfilas=this.jTfacultades.getSelectedRowCount();
        if(totalfilas==1){
            int nfila=this.jTfacultades.getSelectedRow();
            int id=Integer.parseInt(jTfacultades.getValueAt(nfila, 0).toString());
            String nombreFac="";
            nombreFac=jTfacultades.getValueAt(nfila, 1).toString();
            String facultad="";
            facultad=JOptionPane.showInputDialog(null, "Modificar facultad:",nombreFac);

            if((!facultad.equals("")) && (facultad.trim().length()>3)){
                try{
                    FacultadJpaController f=new FacultadJpaController(entityMain.getInstance());
                    Facultad fac2=f.findFacultad(id);
                    Facultad fac=new Facultad();
                    fac.setIdfacultad(id);
                    fac.setFactultad(facultad);
                    fac.setCarreraList(fac2.getCarreraList());
                    //   fac.setCarreraList(fac.getCarreraList());
                    f.edit(fac);
                    conn.getFacultades(this.jTfacultades);
                    JOptionPane.showMessageDialog(null, "Facultad actualizada");

                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
                }
            }else{
                JOptionPane.showMessageDialog(null, "Error en la edición");
            }

        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        }
    }//GEN-LAST:event_btnEditFacultadMouseClicked

    private void txtCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarreraActionPerformed

    private void btnAggCarreraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggCarreraMouseClicked
        CarreraJpaController controlador=new CarreraJpaController(entityMain.getInstance());
        // FacultadJpaController controlador=new FacultadJpaController(entityMain.getInstance());
        List<Facultad> lf=new ArrayList<Facultad>();
        Carrera ca=new Carrera();
        Facultad fa=new Facultad();
        ca.setCarrera(this.txtCarrera.getText());
        fa.setIdfacultad(this.idFacult[this.cboFacultad.getSelectedIndex()]);
        ca.setIdfacultad(fa);

        if(this.txtCarrera.getText().trim().length()>3){
            try{
                controlador.create(ca);
                conn.getCarreras(this.jTcarreras);
                this.txtCarrera.setText("");
                JOptionPane.showMessageDialog(null,"Carrera agregada correctamente");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error"+e.toString());}
        }else{JOptionPane.showMessageDialog(null,"verifique el campo");}

    }//GEN-LAST:event_btnAggCarreraMouseClicked

    private void btnEditarCarreraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarCarreraMouseClicked
        int totalfilas=this.jTcarreras.getSelectedRowCount();
        if(totalfilas==1){
            int nfila=this.jTcarreras.getSelectedRow();
            int id=Integer.parseInt(jTcarreras.getValueAt(nfila, 0).toString());
            String carrera=jTcarreras.getValueAt(nfila, 1).toString();
            String facultad=jTcarreras.getValueAt(nfila, 2).toString();
            String [] array ={"",""};
            JTextField txtCarrera2 = new JTextField();
            JComboBox cboFacultad2 = new JComboBox();
            txtCarrera2.setText(carrera);
            try {
                llenarFacultadEdit(cboFacultad2);
                cboFacultad2.setSelectedItem(facultad);
            } catch (SQLException ex) {
                Logger.getLogger(Home_Root_corrupted.class.getName()).log(Level.SEVERE, null, ex);
            }
            Object[] message = {
                "Carrera:", txtCarrera2,
                "Facultad:", cboFacultad2,
            };
            int option = JOptionPane.showConfirmDialog(null, message, "Editar carrera", JOptionPane.OK_CANCEL_OPTION);
            if(option == JOptionPane.OK_OPTION){
                array[0]=txtCarrera2.getText();
                array[1]=cboFacultad2.getSelectedItem().toString();

                if((array[0].trim().length()>3 && array[1].trim().length()>0)){
                    try{
                        CarreraJpaController t=new  CarreraJpaController(entityMain.getInstance());
                        Carrera car=new  Carrera();
                        car.setIdcarrera(id);
                        car.setCarrera(array[0]);
                        Facultad fa=new Facultad();
                        car.setCarrera(txtCarrera2.getText());
                        fa.setIdfacultad(this.idFacult[cboFacultad2.getSelectedIndex()]);
                        car.setIdfacultad(fa);
                        t.edit(car);
                        conn.getCarreras(this.jTcarreras);
                        JOptionPane.showMessageDialog(null, "Carrera Actualizada");
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, e.getMessage().toString());
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Error en la edición");
                }

            }
        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        }
    }//GEN-LAST:event_btnEditarCarreraMouseClicked

    private void btnAggEspecialidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggEspecialidadMouseClicked
        EspecialidadJpaController t=new EspecialidadJpaController(entityMain.getInstance());
        Especialidad esp=new Especialidad();
        esp.setEspecialidad(this.txtespecialidad.getText());
        if(this.txtespecialidad.getText().trim().length()>3){
            try{
                t.create(esp);
                conn.getEspecialidad(this.jTespecialidades);
                this.txtespecialidad.setText("");
                JOptionPane.showMessageDialog(null,"Especialidad agregada correctamente");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error"+e.toString()); }
        }else{
            JOptionPane.showMessageDialog(null,"verifique el campo");}
    }//GEN-LAST:event_btnAggEspecialidadMouseClicked

    private void btnEditEspecialidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditEspecialidadMouseClicked
        int totalfilas=this.jTespecialidades.getSelectedRowCount();
        if(totalfilas==1){
            int nfila=this.jTespecialidades.getSelectedRow();
            int id=Integer.parseInt(jTespecialidades.getValueAt(nfila, 0).toString());
            String nombreEsp=jTespecialidades.getValueAt(nfila, 1).toString();
            String especialidad="";
            especialidad=JOptionPane.showInputDialog(null, "Modificar categoria:",nombreEsp);

            if((especialidad.trim().length()>3)){
                try{
                    EspecialidadJpaController t=new EspecialidadJpaController(entityMain.getInstance());
                    Especialidad esp=new Especialidad();
                    esp.setIdespecialidad(id);
                    esp.setEspecialidad(especialidad);
                    t.edit(esp);
                    conn.getEspecialidad(this.jTespecialidades);
                    JOptionPane.showMessageDialog(null, "Especialidad Actualizada");
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e.getMessage().toString());
                }
            }else{
                JOptionPane.showMessageDialog(null, "Error en la edición");
            }

        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        }
    }//GEN-LAST:event_btnEditEspecialidadMouseClicked

    private void btnAggUnidMedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggUnidMedMouseClicked
        UnidadMedJpaController t=new UnidadMedJpaController(entityMain.getInstance());
        UnidadMed umed=new UnidadMed();
        umed.setUnidad(this.txtUnidMed.getText());
        umed.setUnidad(this.txtUnidAbrev.getText());
        if(this.txtUnidMed.getText().trim().length()>3 && this.txtUnidAbrev.getText().trim().length()>3){
            try{
                t.create(umed);
                conn.getUnidMedida(this.jTunidades);
                this.txtUnidAbrev.setText("");
                JOptionPane.showMessageDialog(null,"Unidad de Medida agregada correctamente");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error"+e.toString());
            }
        }else{
            JOptionPane.showMessageDialog(null,"verifique el campo");}
    }//GEN-LAST:event_btnAggUnidMedMouseClicked

    public void llenarFacultad() throws SQLException {
        // llenar el combobox de facultad
        Object[] array = this.conn.llenarFacultad();

        this.idFacult = (int[]) array[0];
        DefaultComboBoxModel model = new DefaultComboBoxModel((Object[]) array[1]);
        this.cboFacultad.setModel(model);
    }
    
public void llenarFacultadEdit(JComboBox cbo) throws SQLException {
        // llenar el combobox de facultad
        Object[] array = this.conn.llenarFacultad();

        this.idFacult = (int[]) array[0];
        DefaultComboBoxModel model = new DefaultComboBoxModel((Object[]) array[1]);
        cbo.setModel(model);
    }
    
    private void btnEditUnidMedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditUnidMedMouseClicked
        int totalfilas=this.jTunidades.getSelectedRowCount();
        if(totalfilas==1){
            int nfila=this.jTunidades.getSelectedRow();
            int id=Integer.parseInt(jTunidades.getValueAt(nfila, 0).toString());
            String nombreUnidad=jTunidades.getValueAt(nfila, 1).toString();
            String Uabrev=jTunidades.getValueAt(nfila, 2).toString();
            String [] array ={"",""};
            JTextField unidad = new JTextField();
            JTextField abrev = new JTextField();
            unidad.setText(nombreUnidad);
            abrev.setText(Uabrev);
            Object[] message = {
                "Unidad de Medida:", unidad,
                "Abreviatura:", abrev,};
            int option = JOptionPane.showConfirmDialog(null, message, "Editar unidad de medida", JOptionPane.OK_CANCEL_OPTION);
            if(option == JOptionPane.OK_OPTION){
                array[0]=unidad.getText();
                array[1]=abrev.getText();

                if((array[0].trim().length()>3 && array[1].trim().length()>0)){
                    try{
                        UnidadMedJpaController t=new  UnidadMedJpaController(entityMain.getInstance());
                        UnidadMed med=new  UnidadMed();
                        med.setIdunidadMed(id);
                        med.setUnidad(array[0]);
                        med.setAbreviatura(array[1]);
                        t.edit(med);
                        conn.getUnidMedida(this.jTunidades);
                        JOptionPane.showMessageDialog(null, "Unidad de Medida Actualizada");
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, e.getMessage().toString());
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Error en la edición");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        }
    }//GEN-LAST:event_btnEditUnidMedMouseClicked

    private void btnAggActividadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggActividadMouseClicked
        TipoPacienteJpaController t=new TipoPacienteJpaController(entityMain.getInstance());
        TipoPaciente tpc=new TipoPaciente();
        tpc.setTipopac(this.txtActividad.getText());
        if(this.txtActividad.getText().trim().length()>3){
            try{
                t.create(tpc);
                conn.getActividad(this.jTactividades);
                this.txtActividad.setText("");
                JOptionPane.showMessageDialog(null,"Actividad agregada correctamente");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error"+e.toString());
            }
        }else{
            JOptionPane.showMessageDialog(null,"verifique el campo");}
    }//GEN-LAST:event_btnAggActividadMouseClicked

    private void btnEditActividadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditActividadMouseClicked
        int totalfilas=this.jTactividades.getSelectedRowCount();
        if(totalfilas==1){
            int nfila=this.jTactividades.getSelectedRow();
            int id=Integer.parseInt(jTactividades.getValueAt(nfila, 0).toString());
            String nombreAct=jTactividades.getValueAt(nfila, 1).toString();
            String Actividad="";
            Actividad=JOptionPane.showInputDialog(null, "Modificar categoria:",nombreAct);

            if((Actividad.trim().length()>3)){
                try{
                    TipoPacienteJpaController t=new TipoPacienteJpaController(entityMain.getInstance());
                    TipoPaciente act=new TipoPaciente();
                    act.setIdtipopac(id);
                    act.setTipopac(Actividad);
                    t.edit(act);
                    conn.getActividad(this.jTactividades);
                    JOptionPane.showMessageDialog(null, "Actividad actualizada");
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e.getMessage().toString());
                }
            }else{
                JOptionPane.showMessageDialog(null, "Error en la edición");
            }

        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        }
    }//GEN-LAST:event_btnEditActividadMouseClicked

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

    private void btnElimCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElimCategoriaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnElimCategoriaMouseClicked

    private void btnElimanarDoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElimanarDoctorMouseClicked
        if (this.tbDoctor.getSelectedRows().length == 1)
        {
            
               try {
            int idDoc = Integer.parseInt(this.tbDoctor.getModel().getValueAt(this.tbDoctor.getSelectedRow(), 0).toString());
            Doctor doc = this.conn.DesactDoctor(idDoc);
            this.tbDoctor.setModel(this.conn.getDocs(tbDoctor));
               }
               
               catch (SQLException ex) {
            JOptionPane.showConfirmDialog(this,ex.toString());
        }
              
        }
            else {
            JOptionPane.showMessageDialog(this, "Seleccione una fila del doctor a eliminar"); 
        }
    }//GEN-LAST:event_btnElimanarDoctorMouseClicked

    private void btnEliminarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioMouseClicked
        if (this.tbUsuarios.getSelectedRows().length == 1)
        {
            
               try {
            int us = Integer.parseInt(this.tbUsuarios.getModel().getValueAt(this.tbUsuarios.getSelectedRow(), 0).toString());
            Usuario usr = this.conn.DesactUsuario(us);
            this.tbUsuarios.setModel(this.conn.getUsuarios(tbUsuarios));
               }
               
               catch (SQLException ex) {
            JOptionPane.showConfirmDialog(this,ex.toString());
        }
              
        }
            else {
            JOptionPane.showMessageDialog(this, "Seleccione una fila del usuario a eliminar"); 
        }


    }//GEN-LAST:event_btnEliminarUsuarioMouseClicked

    private void btn_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_empleadoActionPerformed

        this.Contenedor.setSelectedIndex(6);
        this.lblHeader.setText("EMPLEADOS");

        this.btn_home.setBackground(Color.decode("#660000"));
        this.btn_farmacia.setBackground(Color.black);
        this.btn_docs.setBackground(Color.black);
        this.btn_users.setBackground(Color.black);
        this.btn_config.setBackground(Color.black);
        this.btn_reports.setBackground(Color.black);

    }//GEN-LAST:event_btn_empleadoActionPerformed

    private void btnAggEmp2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggEmp2MouseClicked
        
         Empleado em = new Empleado();

        em.nombre = this.txtNom2.getText();
        em.apellido = this.txtAp2.getText();
        em.telefono = this.txtTel2.getText();
        em.celular = this.txtCel2.getText();
        em.fechaNac = this.txtFecNac2.getText();
        em.documento = this.txtDo2.getText();
      

        if (this.rbMasc3.isSelected()) {
            em.sexo = "M";

        } else {
           
            em.sexo = "F";
        }

        if (em.Validar().equals("Exito")) {

            String resultado = "";

            try {

                resultado = conn.aggEmpleado(em);
                this.tbEmp.setModel(this.conn.getEmpleado(tbEmp));
                this.txtNom2.setText("");
                this.txtAp2.setText("");
                this.txtTel2.setText("");
                this.txtCel2.setText("");
                this.txtFecNac2.setText("");
                this.txtDo2.setText("");
                


            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(this, ex.toString());
            }
            JOptionPane.showMessageDialog(this, resultado);
        } else {
            JOptionPane.showMessageDialog(this, "ERROR: Revise que no existan campos requeridos vacios");
        }

        
        
    }//GEN-LAST:event_btnAggEmp2MouseClicked

    private void btnEliminarEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarEmpleadoMouseClicked
       
         if (this.tbEmp.getSelectedRows().length == 1)
        {
            
               try {
            int e = Integer.parseInt(this.tbEmp.getModel().getValueAt(this.tbEmp.getSelectedRow(), 0).toString());
            Empleado emp = this.conn.DesactEmpleado(e);
            this.tbEmp.setModel(this.conn.getEmpleado(tbEmp));
               }
               
               catch (SQLException ex) {
            JOptionPane.showConfirmDialog(this,ex.toString());
        }
              
        }
            else {
            JOptionPane.showMessageDialog(this, "Seleccione una fila del empleado a eliminar"); 
        }
        
    }//GEN-LAST:event_btnEliminarEmpleadoMouseClicked

    private void btnMostrarElimDocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarElimDocMouseClicked
                 try{
        
                Activar_Doctor form = new Activar_Doctor();
                form.setVisible(true);        
       
                 }
         catch (SQLException ex) {
            JOptionPane.showConfirmDialog(this,ex.toString());
        }
        
    }//GEN-LAST:event_btnMostrarElimDocMouseClicked

    private void btnAlertaTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlertaTotalActionPerformed
    try {
        this.conn.obt_alertas(jTAlertas,1);
        this.btnAlertaTotal.setText("Todas("+jTAlertas.getRowCount()+")");
        this.btnAlertaTotal.setFont(new Font("Arial", Font.BOLD, 12)); 
        this.btnAlertaFecha.setFont(new Font("Arial", Font.PLAIN, 12));
        this.btnAlertaCant.setFont(new Font("Arial", Font.PLAIN, 12));
    } catch (SQLException ex) {
        Logger.getLogger(Home_Root.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnAlertaTotalActionPerformed

    private void btnAlertaFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlertaFechaActionPerformed
        try {
        this.conn.obt_alertas(jTAlertas,2);
        this.btnAlertaFecha.setText("Vencimiento("+jTAlertas.getRowCount()+")");
        this.btnAlertaFecha.setFont(new Font("Arial", Font.BOLD, 12)); 
        this.btnAlertaCant.setFont(new Font("Arial", Font.PLAIN, 12));
        this.btnAlertaTotal.setFont(new Font("Arial", Font.PLAIN, 12));
    } catch (SQLException ex) {
        Logger.getLogger(Home_Root.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnAlertaFechaActionPerformed

    private void btnAlertaCantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlertaCantActionPerformed
        try {
        this.conn.obt_alertas(jTAlertas,3);
        this.btnAlertaCant.setText("Existencia("+jTAlertas.getRowCount()+")");
        this.btnAlertaCant.setFont(new Font("Arial", Font.BOLD, 12));
        this.btnAlertaTotal.setFont(new Font("Arial", Font.PLAIN, 12));
        this.btnAlertaFecha.setFont(new Font("Arial", Font.PLAIN, 12));
    } catch (SQLException ex) {
        Logger.getLogger(Home_Root.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnAlertaCantActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Root().setVisible(true);
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
    private javax.swing.JPanel Tab_Empleado2;
    private javax.swing.JPanel Tab_Farmacia;
    private javax.swing.JPanel Tab_Usuarios;
    private javax.swing.JPanel Tab_home;
    private javax.swing.JPanel Tab_reports;
    private javax.swing.JLabel btnAggActividad;
    private javax.swing.JLabel btnAggCarrera;
    private javax.swing.JLabel btnAggCategoria;
    private javax.swing.JLabel btnAggDoctor;
    private javax.swing.JLabel btnAggEmp2;
    private javax.swing.JLabel btnAggEspecialidad;
    private javax.swing.JLabel btnAggFacultad;
    private javax.swing.JLabel btnAggMedicamento;
    private javax.swing.JLabel btnAggUnidMed;
    private javax.swing.JLabel btnAggUsuario;
    private javax.swing.JButton btnAlertaCant;
    private javax.swing.JButton btnAlertaFecha;
    private javax.swing.JButton btnAlertaTotal;
    private javax.swing.JLabel btnBuscarExpediente;
    private javax.swing.JLabel btnBuscarMed;
    private javax.swing.JLabel btnEditActividad;
    private javax.swing.JLabel btnEditCategoria;
    private javax.swing.JLabel btnEditEspecialidad;
    private javax.swing.JLabel btnEditFacultad;
    private javax.swing.JLabel btnEditMedicamento;
    private javax.swing.JLabel btnEditUnidMed;
    private javax.swing.JLabel btnEditarCarrera;
    private javax.swing.JLabel btnElimActividad;
    private javax.swing.JLabel btnElimCategoria;
    private javax.swing.JLabel btnElimUnidMed;
    private javax.swing.JLabel btnElimanarDoctor;
    private javax.swing.JLabel btnEliminarCarrera;
    private javax.swing.JLabel btnEliminarEmpleado;
    private javax.swing.JLabel btnEliminarEspec;
    private javax.swing.JLabel btnEliminarFacultad;
    private javax.swing.JLabel btnEliminarUsuario;
    private javax.swing.JLabel btnGenReporteExpediente;
    private javax.swing.JButton btnHome2;
    private javax.swing.JLabel btnMostrarElimDoc;
    private javax.swing.JLabel btn_close;
    private javax.swing.JButton btn_config;
    private javax.swing.JButton btn_docs;
    private javax.swing.JButton btn_empleado;
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
    private javax.swing.JComboBox<String> cboEmpleado;
    private javax.swing.JComboBox<String> cboEspecialidad;
    private javax.swing.JComboBox<String> cboFacultad;
    private javax.swing.JComboBox<String> cboPresentacionMed;
    private javax.swing.JComboBox<String> cboTipoUsuario;
    private javax.swing.JComboBox<String> cboUnidadesMed;
    private javax.swing.JComboBox<String> cboUsuario;
    private javax.swing.JComboBox<String> cmbActividad;
    private javax.swing.JComboBox<String> cmbCarrera;
    private javax.swing.JComboBox<String> cmbDcotor;
    private javax.swing.JComboBox<String> cmbDepartamento;
    private javax.swing.JComboBox<String> cmbFacultad;
    private javax.swing.JComboBox<String> cmbPeriodo;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JComboBox<String> cmbUbicacion;
    private javax.swing.JPanel header;
    private javax.swing.JMenuItem itemCatMed;
    private javax.swing.JMenuItem itemFechaV;
    private javax.swing.JMenuItem itemNombreMed;
    private javax.swing.JMenuItem itemPresMed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
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
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTAlertas;
    private javax.swing.JTable jTFarmacia;
    private javax.swing.JTable jTactividades;
    private javax.swing.JTable jTcarreras;
    private javax.swing.JTable jTcategorias;
    private javax.swing.JTable jTespecialidades;
    private javax.swing.JTable jTfacultades;
    private javax.swing.JTable jTunidades;
    private javax.swing.JTable jtBuscarExpediente;
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
    private javax.swing.JLabel lblHeader19;
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
    private javax.swing.JLabel lblHeader64;
    private javax.swing.JLabel lblHeader68;
    private javax.swing.JLabel lblHeader69;
    private javax.swing.JLabel lblHeader7;
    private javax.swing.JLabel lblHeader70;
    private javax.swing.JLabel lblHeader71;
    private javax.swing.JLabel lblHeader74;
    private javax.swing.JLabel lblHeader75;
    private javax.swing.JLabel lblHeader76;
    private javax.swing.JLabel lblHeader77;
    private javax.swing.JLabel lblHeader78;
    private javax.swing.JLabel lblHeader79;
    private javax.swing.JLabel lblHeader8;
    private javax.swing.JLabel lblHeader80;
    private javax.swing.JLabel lblHeader81;
    private javax.swing.JLabel lblHeader9;
    private javax.swing.JLabel lblMedicamentos;
    private javax.swing.JLabel lblMedxVencer;
    private javax.swing.JLabel lblPacientes;
    private javax.swing.JPopupMenu pUpBuscarMedicamento;
    private javax.swing.JRadioButton rbF;
    private javax.swing.JRadioButton rbFem2;
    private javax.swing.JRadioButton rbM;
    private javax.swing.JRadioButton rbMasc3;
    private javax.swing.JRadioButton rdbActividad;
    private javax.swing.JRadioButton rdbApellidos;
    private javax.swing.JRadioButton rdbCarnet;
    private javax.swing.JRadioButton rdbCarrera;
    private javax.swing.JRadioButton rdbCategoria;
    private javax.swing.JRadioButton rdbDepartamento;
    private javax.swing.JRadioButton rdbDoctor;
    private javax.swing.JRadioButton rdbFacultad;
    private javax.swing.ButtonGroup rdbFiltros1;
    private javax.swing.ButtonGroup rdbFiltros2;
    private javax.swing.JRadioButton rdbIdPac;
    private javax.swing.JRadioButton rdbNombres;
    private javax.swing.JRadioButton rdbSexo;
    private javax.swing.JRadioButton rdbUbicacion;
    private javax.swing.JTable tbDoctor;
    private javax.swing.JTable tbEmp;
    private javax.swing.JTable tbUsuarios;
    private javax.swing.JTextField txtActividad;
    private javax.swing.JTextField txtAp2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBuscarFechaV;
    private javax.swing.JTextField txtBuscarNombreMed;
    private javax.swing.JFormattedTextField txtCantMedicamento;
    private javax.swing.JTextField txtCarnetRoot;
    private javax.swing.JTextField txtCarrera;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JFormattedTextField txtCel2;
    private javax.swing.JTextField txtCodCat;
    private javax.swing.JTextField txtCodDiag;
    private javax.swing.JTextField txtDo2;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtFacultad;
    private javax.swing.JFormattedTextField txtFecNac2;
    private javax.swing.JFormattedTextField txtFecha;
    private javax.swing.JTextField txtFechaFinal;
    private javax.swing.JTextField txtFechaInicio;
    private javax.swing.JFormattedTextField txtFechaV;
    private javax.swing.JTextField txtIdPac;
    private javax.swing.JTextField txtNom2;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreMedicmento;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JPasswordField txtPassword1;
    private javax.swing.JPasswordField txtPassword2;
    private javax.swing.JFormattedTextField txtTel2;
    private javax.swing.JFormattedTextField txtTelefono;
    private javax.swing.JTextField txtUnidAbrev;
    private javax.swing.JTextField txtUnidMed;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtespecialidad;
    // End of variables declaration//GEN-END:variables
}
