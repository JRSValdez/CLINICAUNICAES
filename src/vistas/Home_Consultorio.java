
package vistas;

import Classes.ConexionDB;
import Classes.Consulta;
import Classes.Paciente;
import Classes.Usuario;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.SQLException;
import java.text.ParseException;
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
public class Home_Consultorio extends javax.swing.JFrame {

    int xx, xy;
    int xs, ys, sbx,sby;
    ConexionDB conn;
    Usuario user;
    int[] idCatsMedicamentos;
    
    public Home_Consultorio(){
        initComponents();
    }
    
    public Home_Consultorio(Usuario _user) throws SQLException {
        initComponents();
        conn = new ConexionDB();
        user = _user;
        //FECHA DEL SISTEMA
        Date sistFecha=new Date();
        SimpleDateFormat formato=new SimpleDateFormat("dd/MMMMM/YYYY");
        lblFecha.setText(formato.format(sistFecha)); 
        
        this.tbConsultasEspera.setModel(conn.getConsultasEnEspera(this.tbConsultasEspera));
        this.tbConsultasEspera.setSelectionForeground(Color.white);
        
        xs = this.Contenedor.getWidth();
        ys = this.Contenedor.getHeight();
        sbx = this.SideBar.getWidth();
        sby = this.SideBar.getHeight();
        
        //llenar medicamentos en farmacia
        try {
            this.jtMedicamentos.setSelectionForeground(Color.white);
            this.jtMedicamentos.setModel(this.conn.getMedicamentos(jtMedicamentos));
            
            // llenar el combobox de categorias de medicamentos
            Object[] array = this.conn.llenarCatsMedicamentos((JComboBox) cmbCatMedicamento);

            this.idCatsMedicamentos = (int[]) array[1];
            this.cmbCatMedicamento.setModel((DefaultComboBoxModel)array[0]);
        } catch (SQLException ex) {
            Logger.getLogger(Home_Recepcion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.jTAlertas.setModel(this.conn.obt_alertas(jTAlertas,1));
        this.btnAlertaTotal.setText("Todas("+jTAlertas.getRowCount()+")");
        this.btnAlertaTotal.setFont(new Font("Arial", Font.BOLD, 12)); 
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        SideBar = new javax.swing.JPanel();
        Botonera = new javax.swing.JPanel();
        btn_cons = new javax.swing.JButton();
        btn_home = new javax.swing.JButton();
        btn_farmacia = new javax.swing.JButton();
        Contenedor = new javax.swing.JTabbedPane();
        Tab_home = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        lblMedxVencer = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAlertas = new javax.swing.JTable();
        btnAlertaTotal = new javax.swing.JButton();
        btnAlertaFecha = new javax.swing.JButton();
        btnAlertaCant = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        lblPac_atendidos = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblConsult_espera = new javax.swing.JLabel();
        Tab_Cons = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnAtender = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanelExistente = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbConsultasEspera = new javax.swing.JTable();
        lblHeader2 = new javax.swing.JLabel();
        Tab_Farmacia = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lblHeader55 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblHeader68 = new javax.swing.JLabel();
        txtBuscarMedicamento = new javax.swing.JTextField();
        btnBuscarMedicamento = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblHeader69 = new javax.swing.JLabel();
        cmbCatMedicamento = new javax.swing.JComboBox<>();
        btnBuscarCatMedicamento = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lblHeader56 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jtMedicamentos = new javax.swing.JTable();
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

        Botonera.setBackground(new java.awt.Color(255, 250, 118));
        Botonera.setMinimumSize(new java.awt.Dimension(265, 306));
        Botonera.setPreferredSize(new java.awt.Dimension(265, 306));

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

        javax.swing.GroupLayout BotoneraLayout = new javax.swing.GroupLayout(Botonera);
        Botonera.setLayout(BotoneraLayout);
        BotoneraLayout.setHorizontalGroup(
            BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoneraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cons, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(btn_home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_farmacia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        BotoneraLayout.setVerticalGroup(
            BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotoneraLayout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cons, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(Botonera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
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

        lblFecha.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("jLabel2");

        jPanel16.setBackground(new java.awt.Color(102, 0, 0));
        jPanel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

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
                "ID", "Medicamento", "Cantidad", "Fecha Vencimiento", "Vence (dìas)"
            }
        ));
        jScrollPane2.setViewportView(jTAlertas);

        btnAlertaTotal.setText("Total");
        btnAlertaTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlertaTotalActionPerformed(evt);
            }
        });

        btnAlertaFecha.setText("Vencimiento");
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

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAlertaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAlertaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAlertaCant, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblMedxVencer))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblMedxVencer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(btnAlertaTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlertaFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlertaCant)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 0, 0));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        jPanel13.setBackground(new java.awt.Color(102, 0, 0));
        jPanel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        jPanel13.setPreferredSize(new java.awt.Dimension(250, 250));

        lblPac_atendidos.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblPac_atendidos.setForeground(new java.awt.Color(255, 255, 255));
        lblPac_atendidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPac_atendidos.setText("100");

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
                    .addComponent(lblPac_atendidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(lblPac_atendidos)
                .addContainerGap(28, Short.MAX_VALUE))
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
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
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
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(Tab_homeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        Contenedor.addTab("HOME", null, Tab_home, "");

        Tab_Cons.setBackground(new java.awt.Color(102, 0, 0));
        Tab_Cons.setForeground(new java.awt.Color(255, 255, 255));
        Tab_Cons.setMinimumSize(new java.awt.Dimension(990, 660));
        Tab_Cons.setPreferredSize(new java.awt.Dimension(990, 660));

        jPanel3.setBackground(new java.awt.Color(102, 0, 0));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        btnAtender.setForeground(new java.awt.Color(255, 255, 255));
        btnAtender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnAtender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accept.png"))); // NOI18N
        btnAtender.setText("ATENDER");
        btnAtender.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAtender.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAtender.setFocusable(false);
        btnAtender.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtender.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtenderMouseClicked(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clock.png"))); // NOI18N
        jLabel7.setText("POSPONER");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel7.setFocusable(false);
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/history.png"))); // NOI18N
        jLabel14.setText("Historial");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel14.setFocusable(false);
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/today.png"))); // NOI18N
        jLabel15.setText("ATENDIDAS HOY");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel15.setFocusable(false);
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jLabel8.setText("QUITAR");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel8.setFocusable(false);
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(296, Short.MAX_VALUE)
                .addComponent(btnAtender)
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addGap(25, 25, 25)
                .addComponent(jLabel8)
                .addGap(25, 25, 25)
                .addComponent(jLabel15)
                .addGap(25, 25, 25)
                .addComponent(jLabel14)
                .addContainerGap(297, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel7)
                    .addComponent(btnAtender))
                .addGap(15, 15, 15))
        );

        jPanelExistente.setBackground(new java.awt.Color(102, 0, 0));
        jPanelExistente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102), 3));
        jPanelExistente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelExistenteMouseClicked(evt);
            }
        });

        tbConsultasEspera.setBackground(new java.awt.Color(204, 204, 204));
        tbConsultasEspera.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        tbConsultasEspera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo Paciente", "Paciente", "Edad", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
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
        tbConsultasEspera.setColumnSelectionAllowed(true);
        tbConsultasEspera.setGridColor(new java.awt.Color(255, 255, 153));
        tbConsultasEspera.setRowHeight(25);
        tbConsultasEspera.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tbConsultasEspera.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbConsultasEspera.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbConsultasEspera);
        tbConsultasEspera.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tbConsultasEspera.getColumnModel().getColumnCount() > 0) {
            tbConsultasEspera.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        lblHeader2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader2.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader2.setText("CONSULTAS PENDIENTES");

        javax.swing.GroupLayout jPanelExistenteLayout = new javax.swing.GroupLayout(jPanelExistente);
        jPanelExistente.setLayout(jPanelExistenteLayout);
        jPanelExistenteLayout.setHorizontalGroup(
            jPanelExistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelExistenteLayout.createSequentialGroup()
                .addContainerGap(368, Short.MAX_VALUE)
                .addComponent(lblHeader2)
                .addContainerGap(368, Short.MAX_VALUE))
        );
        jPanelExistenteLayout.setVerticalGroup(
            jPanelExistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExistenteLayout.createSequentialGroup()
                .addComponent(lblHeader2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout Tab_ConsLayout = new javax.swing.GroupLayout(Tab_Cons);
        Tab_Cons.setLayout(Tab_ConsLayout);
        Tab_ConsLayout.setHorizontalGroup(
            Tab_ConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab_ConsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Tab_ConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelExistente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Tab_ConsLayout.setVerticalGroup(
            Tab_ConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab_ConsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelExistente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        Contenedor.addTab("CONSULTAS", Tab_Cons);

        Tab_Farmacia.setBackground(new java.awt.Color(102, 0, 0));
        Tab_Farmacia.setMinimumSize(new java.awt.Dimension(990, 660));
        Tab_Farmacia.setPreferredSize(new java.awt.Dimension(990, 660));

        jPanel6.setBackground(new java.awt.Color(102, 0, 0));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        lblHeader55.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader55.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader55.setText("BUSCAR MEDICAMENTO");

        jPanel4.setBackground(new java.awt.Color(102, 0, 0));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 153), 1, true));

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
        btnBuscarMedicamento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarMedicamento.setFocusable(false);
        btnBuscarMedicamento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarMedicamento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscarMedicamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMedicamentoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblHeader68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(152, 152, 152))
                    .addComponent(txtBuscarMedicamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarMedicamento))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscarMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblHeader68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscarMedicamento)))
                .addGap(4, 4, 4))
        );

        jPanel5.setBackground(new java.awt.Color(102, 0, 0));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 153), 1, true));

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
        btnBuscarCatMedicamento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarCatMedicamento.setFocusable(false);
        btnBuscarCatMedicamento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarCatMedicamento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscarCatMedicamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarCatMedicamentoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblHeader69)
                        .addGap(0, 232, Short.MAX_VALUE))
                    .addComponent(cmbCatMedicamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarCatMedicamento))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnBuscarCatMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(lblHeader69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCatMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblHeader55)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(lblHeader55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(102, 0, 0));
        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        lblHeader56.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblHeader56.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader56.setText("LISTA DE MEDICAMENTOS");

        jtMedicamentos.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jtMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Categoría", "Medicamento", "Presentación", "Stock", "Fecha de vencimiento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false
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

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblHeader56)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane9))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(lblHeader56)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout Tab_FarmaciaLayout = new javax.swing.GroupLayout(Tab_Farmacia);
        Tab_Farmacia.setLayout(Tab_FarmaciaLayout);
        Tab_FarmaciaLayout.setHorizontalGroup(
            Tab_FarmaciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab_FarmaciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Tab_FarmaciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Tab_FarmaciaLayout.setVerticalGroup(
            Tab_FarmaciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab_FarmaciaLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
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
        lblHeader1.setText("CLÍNICA UNIVERSITARIA - CONSULTORIO");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 335, Short.MAX_VALUE)
                .addComponent(lblHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 332, Short.MAX_VALUE)
                .addComponent(btn_minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_maximize)
                .addGap(6, 6, 6)
                .addComponent(btn_close)
                .addGap(20, 20, 20))
        );
        Barra_SuperiorLayout.setVerticalGroup(
            Barra_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnHome2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(Barra_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(btn_maximize)
                .addComponent(btn_close)
                .addGroup(Barra_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader)
                    .addComponent(lblHeader1))
                .addComponent(btn_minimize))
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

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        this.Contenedor.setSelectedIndex(0);
        this.lblHeader.setText("HOME");
        
        this.btn_home.setBackground(Color.decode("#660000"));
        this.btn_cons.setBackground(Color.black);
        this.btn_farmacia.setBackground(Color.black);
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

    private void btn_consActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consActionPerformed
        this.Contenedor.setSelectedIndex(1);
        this.lblHeader.setText("CONSULTAS");
        
        this.btn_cons.setBackground(Color.decode("#660000"));
        this.btn_home.setBackground(Color.black);
        this.btn_farmacia.setBackground(Color.black);
        actualizarConsultasEspera();
    }//GEN-LAST:event_btn_consActionPerformed

    private void actualizarConsultasEspera() {
        try {
            this.tbConsultasEspera.setModel(conn.getConsultasEnEspera(this.tbConsultasEspera));
        } catch (SQLException ex) {
            Logger.getLogger(Home_Consultorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void btnHome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome2ActionPerformed
        this.Contenedor.setSelectedIndex(0);
        this.lblHeader.setText("HOME");
        
        this.btn_home.setBackground(Color.decode("#660000"));
        this.btn_cons.setBackground(Color.black);
        this.btn_farmacia.setBackground(Color.black);
    }//GEN-LAST:event_btnHome2ActionPerformed

    private void jPanelExistenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelExistenteMouseClicked
       
    }//GEN-LAST:event_jPanelExistenteMouseClicked

    private void btn_farmaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_farmaciaActionPerformed
        this.Contenedor.setSelectedIndex(2);
        this.lblHeader.setText("FARMACIA");

        this.btn_farmacia.setBackground(Color.decode("#660000"));
        this.btn_cons.setBackground(Color.black);
        this.btn_home.setBackground(Color.black);
    }//GEN-LAST:event_btn_farmaciaActionPerformed

    private void btn_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizeMouseClicked
        this.setExtendedState(0);
        this.Contenedor.setMinimumSize(new Dimension(xs, ys));
    }//GEN-LAST:event_btn_minimizeMouseClicked

    private void btn_maximizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_maximizeMouseClicked
        this.setExtendedState(6);
        int l = this.getHeight();
        int a = this.getWidth() - this.SideBar.getWidth();
        this.Contenedor.setMinimumSize(new Dimension(a, this.Contenedor.getWidth()));
        //this.SideBar.setPreferredSize(new Dimension(sbx,sby));
    }//GEN-LAST:event_btn_maximizeMouseClicked

    private void btnAtenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtenderMouseClicked
         // ////////////// ATENDER CONSULTA SELECCIONADA ////////////////////
        if (this.tbConsultasEspera.getSelectedRows().length == 1)
        {
             Object [] opciones ={"Aceptar","Cancelar"};
            int eleccion = JOptionPane.showOptionDialog(rootPane,"¿Desea agregar esta consulta?","Advertencia",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,null,opciones,"Aceptar");
            if (eleccion == JOptionPane.YES_OPTION)
            {
                int idConsulta = Integer.parseInt(this.tbConsultasEspera.getModel().getValueAt(this.tbConsultasEspera.getSelectedRow(), 0).toString());
                try {
                    Consulta consulta = this.conn.getConsulta(idConsulta);
                    Paciente paciente = this.conn.getPaciente(consulta.idPaciente);
                    Consultorio_Consulta form = new Consultorio_Consulta(consulta, paciente);
                    form.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Consultas_En_espera.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(Consultas_En_espera.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnAtenderMouseClicked

    private void btnBuscarMedicamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMedicamentoMouseClicked
        try {
            String med = this.txtBuscarMedicamento.getText();
            this.jtMedicamentos.setModel(this.conn.getMedicamentobyNombre(jtMedicamentos, med));
        } catch (SQLException ex) {
            Logger.getLogger(Consultorio_Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarMedicamentoMouseClicked

    private void btnBuscarCatMedicamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCatMedicamentoMouseClicked
        // LLenar el Jtable de medicamentos segun la categoria elegida en el combobox
        try {
            int idCat = this.idCatsMedicamentos[this.cmbCatMedicamento.getSelectedIndex()];
            this.jtMedicamentos.setModel(this.conn.getMedicamentosbyCat(jtMedicamentos, idCat));
        } catch (SQLException ex) {
            Logger.getLogger(Consultorio_Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnBuscarCatMedicamentoMouseClicked

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
            java.util.logging.Logger.getLogger(Home_Consultorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Consultorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Consultorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Consultorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Consultorio().setVisible(true);
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
    private javax.swing.JPanel Tab_home;
    private javax.swing.JButton btnAlertaCant;
    private javax.swing.JButton btnAlertaFecha;
    private javax.swing.JButton btnAlertaTotal;
    private javax.swing.JLabel btnAtender;
    private javax.swing.JLabel btnBuscarCatMedicamento;
    private javax.swing.JLabel btnBuscarMedicamento;
    private javax.swing.JButton btnHome2;
    private javax.swing.JLabel btn_close;
    private javax.swing.JButton btn_cons;
    private javax.swing.JButton btn_farmacia;
    private javax.swing.JButton btn_home;
    private javax.swing.JLabel btn_maximize;
    private javax.swing.JLabel btn_minimize;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cmbCatMedicamento;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelExistente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTAlertas;
    private javax.swing.JTable jtMedicamentos;
    private javax.swing.JLabel lblConsult_espera;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblHeader1;
    private javax.swing.JLabel lblHeader2;
    private javax.swing.JLabel lblHeader55;
    private javax.swing.JLabel lblHeader56;
    private javax.swing.JLabel lblHeader68;
    private javax.swing.JLabel lblHeader69;
    private javax.swing.JLabel lblMedxVencer;
    private javax.swing.JLabel lblPac_atendidos;
    private javax.swing.JTable tbConsultasEspera;
    private javax.swing.JTextField txtBuscarMedicamento;
    // End of variables declaration//GEN-END:variables

}
