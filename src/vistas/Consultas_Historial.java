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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;




public class Consultas_Historial extends javax.swing.JFrame {

   int xx,xy;
   int xs, ys, sbx,sby;
   
    int[] idFacult;
    int[] idCarrera;
    int[] idAct;

   ConexionDB conn;
   
    public Consultas_Historial() throws SQLException {
        initComponents();
        this.conn = new ConexionDB();
        this.llenarFacultad(); 
        this.llenarActividad();
        this.cboCarrera.setModel(this.llenarComboBoxCarrera(this.idFacult[this.cboFacultad.getSelectedIndex()]));
        
        this.tbConsultas.setSelectionForeground(Color.WHITE);
        
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        opcNombre = new javax.swing.JMenuItem();
        opcApellido = new javax.swing.JMenuItem();
        opcCarnet = new javax.swing.JMenuItem();
        opcFechaCon = new javax.swing.JMenuItem();
        opcEdad = new javax.swing.JMenuItem();
        opcActividad = new javax.swing.JMenuItem();
        opcFacultad = new javax.swing.JMenuItem();
        opcCarrera = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        Barra_Superior2 = new javax.swing.JPanel();
        btnHome4 = new javax.swing.JButton();
        lblHeader4 = new javax.swing.JLabel();
        btn_close2 = new javax.swing.JLabel();
        lblHeader5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblHeader48 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblHeader49 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblHeader50 = new javax.swing.JLabel();
        lblHeader51 = new javax.swing.JLabel();
        cboCarrera = new javax.swing.JComboBox<>();
        lblHeader52 = new javax.swing.JLabel();
        lblHeader53 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        lblHeader54 = new javax.swing.JLabel();
        cboFacultad = new javax.swing.JComboBox<>();
        lblHeader25 = new javax.swing.JLabel();
        cboActividad = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JLabel();
        txtCarnet = new javax.swing.JFormattedTextField();
        txtFecha = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbConsultas = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        opcNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/popUp_apellidos.png"))); // NOI18N
        opcNombre.setText("Nombre");
        opcNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcNombreActionPerformed(evt);
            }
        });
        jPopupMenu1.add(opcNombre);

        opcApellido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/popUp_apellidos.png"))); // NOI18N
        opcApellido.setText("Apellido");
        opcApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcApellidoActionPerformed(evt);
            }
        });
        jPopupMenu1.add(opcApellido);

        opcCarnet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/popUp_carnet.png"))); // NOI18N
        opcCarnet.setText("Carnet");
        opcCarnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcCarnetActionPerformed(evt);
            }
        });
        jPopupMenu1.add(opcCarnet);

        opcFechaCon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/popUp_fecha.png"))); // NOI18N
        opcFechaCon.setText("Fecha Consulta");
        opcFechaCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcFechaConActionPerformed(evt);
            }
        });
        jPopupMenu1.add(opcFechaCon);

        opcEdad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PopUp_edad.png"))); // NOI18N
        opcEdad.setText("Edad");
        opcEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcEdadActionPerformed(evt);
            }
        });
        jPopupMenu1.add(opcEdad);

        opcActividad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/popUp_tipo.png"))); // NOI18N
        opcActividad.setText("Actividad");
        opcActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcActividadActionPerformed(evt);
            }
        });
        jPopupMenu1.add(opcActividad);

        opcFacultad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/popUp_Carrera.png"))); // NOI18N
        opcFacultad.setText("Facultad");
        opcFacultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcFacultadActionPerformed(evt);
            }
        });
        jPopupMenu1.add(opcFacultad);

        opcCarrera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/popUp_Carrera.png"))); // NOI18N
        opcCarrera.setText("Carrera");
        opcCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcCarreraActionPerformed(evt);
            }
        });
        jPopupMenu1.add(opcCarrera);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1050, 650));

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
        btnHome4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lista.png"))); // NOI18N
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
                .addGap(20, 20, 20))
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

        jPanel2.setBackground(new java.awt.Color(102, 0, 0));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Busqueda Personalizada");

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

        lblHeader51.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader51.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader51.setText("CARRERA:");

        cboCarrera.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cboCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CARRERA 1", "CARRERA 2", " " }));
        cboCarrera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader52.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader52.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader52.setText("FECHA CONSULTA:");

        lblHeader53.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader53.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader53.setText("EDAD:");

        txtEdad.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtEdad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        lblHeader54.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader54.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader54.setText("FACULTAD:");

        cboFacultad.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cboFacultad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ING y ARQ", "CC HH", "CC SALUD" }));
        cboFacultad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));
        cboFacultad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboFacultadItemStateChanged(evt);
            }
        });

        lblHeader25.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader25.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader25.setText("ACTIVIDAD:");

        cboActividad.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cboActividad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hora clase", "tiempo completo", "Administrativo", "Ordenanza" }));
        cboActividad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnBuscar.setFocusable(false);
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        txtCarnet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));
        try {
            txtCarnet.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-AA-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));
        try {
            txtFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFecha.setToolTipText("dd-mm-yyyy");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHeader50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHeader49, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHeader48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtApellido)
                            .addComponent(txtNombre)
                            .addComponent(txtCarnet, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblHeader53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblHeader52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblHeader25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEdad)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblHeader51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblHeader54, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cboFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(cboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cboActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                                .addComponent(btnBuscar)
                                .addGap(149, 149, 149))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblHeader48)
                                .addComponent(txtNombre))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblHeader52)
                                .addComponent(lblHeader54)
                                .addComponent(cboFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblHeader51)
                                .addComponent(cboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblHeader53)
                                .addComponent(txtEdad)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblHeader50)
                                        .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cboActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblHeader25)))
                                .addGap(27, 27, 27))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader49)
                            .addComponent(txtApellido))
                        .addGap(74, 74, 74))))
        );

        jPanel3.setBackground(new java.awt.Color(102, 0, 0));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 3, true));

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
            tbConsultas.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(226, 226, 226))
        );

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Historial de Consultas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Barra_Superior2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Barra_Superior2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1152, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
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
       this.jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY());  
    }//GEN-LAST:event_btnBuscarMouseClicked

    public void llenarFacultad() throws SQLException {

        Object[] array = this.conn.llenarFacultad();

        this.idFacult = (int[]) array[0];
        DefaultComboBoxModel model = new DefaultComboBoxModel((Object[]) array[1]);
        this.cboFacultad.setModel(model);
    }
    
     public void llenarActividad() throws SQLException {

        Object[] array = this.conn.Obt_TipoPaciente();

        this.idAct = (int[]) array[0];
        DefaultComboBoxModel model = new DefaultComboBoxModel((Object[]) array[1]);
        this.cboActividad.setModel(model);
    }
    
    public DefaultComboBoxModel llenarComboBoxCarrera(int _idCarr) throws SQLException{
        Object[] arrays = this.conn.llenarCarreras(_idCarr);
     
        this.idCarrera = (int[]) arrays[0];
        
        DefaultComboBoxModel model = new DefaultComboBoxModel( (Object[]) arrays[2] );
        return model;
    }
    
    
    
    private void opcCarnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcCarnetActionPerformed
     
        
         try {
            String carnet = this.txtCarnet.getText();
            this.tbConsultas.setModel(this.conn.getHistorialConCarnet(tbConsultas, carnet));
        } catch (SQLException ex) {
            Logger.getLogger(Consultorio_Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_opcCarnetActionPerformed

    private void cboFacultadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboFacultadItemStateChanged
        
        try {

            int idFac = this.idFacult[this.cboFacultad.getSelectedIndex()];
            this.cboCarrera.setModel(this.llenarComboBoxCarrera(idFac));
        } catch (SQLException ex) {
            Logger.getLogger(Home_Recepcion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cboFacultadItemStateChanged

    private void opcCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcCarreraActionPerformed
      
        try {

            int idCar = this.idCarrera[this.cboCarrera.getSelectedIndex()];
        this.tbConsultas.setModel(this.conn.getHistorialConCarrera(tbConsultas, idCar));
        } catch (SQLException ex) {
            Logger.getLogger(Home_Recepcion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_opcCarreraActionPerformed

    private void opcFacultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcFacultadActionPerformed
       
        try {
            int idFa = this.idFacult[this.cboFacultad.getSelectedIndex()];
            this.tbConsultas.setModel(this.conn.getHistorialConFacult(tbConsultas, idFa));
        } catch (SQLException ex) {
            Logger.getLogger(Consultorio_Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_opcFacultadActionPerformed

    private void opcActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcActividadActionPerformed
        
         
        try {
            int idA = this.idAct[this.cboActividad.getSelectedIndex()];
            this.tbConsultas.setModel(this.conn.getHistorialConActividad(tbConsultas, idA));
        } catch (SQLException ex) {
            Logger.getLogger(Consultorio_Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_opcActividadActionPerformed

    private void opcNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcNombreActionPerformed
        
         try {
            String nombre = this.txtNombre.getText();
            this.tbConsultas.setModel(this.conn.getHistorialConNombre(tbConsultas, nombre));
        } catch (SQLException ex) {
            Logger.getLogger(Consultorio_Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_opcNombreActionPerformed

    private void opcApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcApellidoActionPerformed
       
        try {
            String apellido = this.txtApellido.getText();
            this.tbConsultas.setModel(this.conn.getHistorialConApellido(tbConsultas, apellido));
        } catch (SQLException ex) {
            Logger.getLogger(Consultorio_Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_opcApellidoActionPerformed

    private void opcFechaConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcFechaConActionPerformed
        
        try {
            String fecha = this.txtFecha.getText();
            this.tbConsultas.setModel(this.conn.getHistorialConFecha(tbConsultas, fecha));
        } catch (SQLException ex) {
            Logger.getLogger(Consultorio_Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_opcFechaConActionPerformed

    private void opcEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcEdadActionPerformed
        
        //pendiente
        try {
            String edad = this.txtEdad.getText();
            this.tbConsultas.setModel(this.conn.getHistorialConEdad(tbConsultas, edad));
        } catch (SQLException ex) {
            Logger.getLogger(Consultorio_Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_opcEdadActionPerformed

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
            java.util.logging.Logger.getLogger(Consultas_Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultas_Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultas_Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultas_Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 try {
                    new Consultas_Historial().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Consultas_Historial.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra_Superior2;
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JButton btnHome4;
    private javax.swing.JLabel btn_close2;
    private javax.swing.JComboBox<String> cboActividad;
    private javax.swing.JComboBox<String> cboCarrera;
    private javax.swing.JComboBox<String> cboFacultad;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeader25;
    private javax.swing.JLabel lblHeader4;
    private javax.swing.JLabel lblHeader48;
    private javax.swing.JLabel lblHeader49;
    private javax.swing.JLabel lblHeader5;
    private javax.swing.JLabel lblHeader50;
    private javax.swing.JLabel lblHeader51;
    private javax.swing.JLabel lblHeader52;
    private javax.swing.JLabel lblHeader53;
    private javax.swing.JLabel lblHeader54;
    private javax.swing.JMenuItem opcActividad;
    private javax.swing.JMenuItem opcApellido;
    private javax.swing.JMenuItem opcCarnet;
    private javax.swing.JMenuItem opcCarrera;
    private javax.swing.JMenuItem opcEdad;
    private javax.swing.JMenuItem opcFacultad;
    private javax.swing.JMenuItem opcFechaCon;
    private javax.swing.JMenuItem opcNombre;
    private javax.swing.JTable tbConsultas;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JFormattedTextField txtCarnet;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JFormattedTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
