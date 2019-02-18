package vistas;

import Classes.ConexionDB;
import Classes.Consulta;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
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
public class Expediente_Paciente extends javax.swing.JFrame {

    int xx, xy, xs, ys, sbx, sby;

    Consulta consulta;
    ConexionDB conn;

    public Expediente_Paciente() {
        initComponents();
    }

    public Expediente_Paciente(Consulta consulta) {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("clinica_unicaes.png")).getImage());
        this.consulta = consulta;
        this.consulta.setFecha();

        this.setValues();
    }

    private void setValues() {
        this.lblNombre.setText(this.consulta.paciente);
        this.lblPacienteTitulo.setText(this.consulta.paciente);
        this.lblFechaCons.setText(this.consulta.fechaString);
        this.lblAtendidoPo.setText(this.consulta.doctor);
        this.lblMotivo.setText(this.consulta.motivo);
        this.txtPresente_enf.setText(this.consulta.presenta_enf);

        this.lblPeso.setText(this.consulta.peso);
        this.lblTalla.setText(this.consulta.talla);
        this.lblTemp.setText("ESTATICA ");
        this.lblPulso.setText(this.consulta.pulso);
        this.lblFrecCar.setText(this.consulta.frec_card);
        this.lblPresArt.setText(this.consulta.pres_art);

        this.lblCabeza.setText(this.consulta.ef_cabeza);
        this.lblCuello.setText(this.consulta.ef_cuello);
        this.lblTorax.setText(this.consulta.ef_torax);
        this.lblAbdomen.setText(this.consulta.ef_abdomen);
        this.lblExtremidades.setText(this.consulta.ef_extremidades);

        this.txtAreaRecomendaciones.setText(this.consulta.recomendaciones);
        this.txtAreaTratamiento.setText(this.consulta.tratamiento);

        //lllenar JTBALES 
        DefaultTableModel modelAntecedentes = (DefaultTableModel) this.jtAntecedentes.getModel();
        for (int i = 0; i < this.consulta.antecedente.rowAntecedente.length; i++) {
            if (this.consulta.antecedente.rowAntecedente[i] != null) {
                modelAntecedentes.addRow((String[]) this.consulta.antecedente.rowAntecedente[i]);
            } else {
                break;
            }
        }

        DefaultTableModel modelDiagnostico = (DefaultTableModel) this.jtDiagnosticos.getModel();
        for (int i = 0; i < this.consulta.diagnostico.rowDiagnostico.length; i++) {
            if (this.consulta.diagnostico.rowDiagnostico[i] != null) {
                modelDiagnostico.addRow((String[]) this.consulta.diagnostico.rowDiagnostico[i]);
            } else {
                break;
            }
        }

        DefaultTableModel modelReceta = (DefaultTableModel) this.jtReceta.getModel();
        for (int i = 0; i < this.consulta.receta.rowReceta.length; i++) {
            if (this.consulta.receta.rowReceta[i] != null) {
                modelReceta.addRow((String[]) this.consulta.receta.rowReceta[i]);
            } else {
                break;
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Barra_Superior = new javax.swing.JPanel();
        btnHome2 = new javax.swing.JButton();
        btn_close = new javax.swing.JLabel();
        lblHeader1 = new javax.swing.JLabel();
        lblPacienteTitulo = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblHeader59 = new javax.swing.JLabel();
        lblHeader60 = new javax.swing.JLabel();
        lblHeader61 = new javax.swing.JLabel();
        lblHeader62 = new javax.swing.JLabel();
        lblHeader63 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblFechaCons = new javax.swing.JLabel();
        lblAtendidoPo = new javax.swing.JLabel();
        lblMotivo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblHeader50 = new javax.swing.JLabel();
        lblPeso1232412 = new javax.swing.JLabel();
        lblTalla3423 = new javax.swing.JLabel();
        lblTemp243 = new javax.swing.JLabel();
        lblPulso1 = new javax.swing.JLabel();
        lblFrecCar1 = new javax.swing.JLabel();
        lblPresArt1 = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        lblTalla = new javax.swing.JLabel();
        lblTemp = new javax.swing.JLabel();
        lblPulso = new javax.swing.JLabel();
        lblFrecCar = new javax.swing.JLabel();
        lblPresArt = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        lblHeader68 = new javax.swing.JLabel();
        lblHeader69 = new javax.swing.JLabel();
        lblHeader70 = new javax.swing.JLabel();
        lblHeader71 = new javax.swing.JLabel();
        lblHeader72 = new javax.swing.JLabel();
        lblCabeza = new javax.swing.JLabel();
        lblCuello = new javax.swing.JLabel();
        lblTorax = new javax.swing.JLabel();
        lblAbdomen = new javax.swing.JLabel();
        lblExtremidades = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        lblHeader67 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtPresente_enf = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblHeader78 = new javax.swing.JLabel();
        lblHeader81 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jtAntecedentes = new javax.swing.JTable();
        jScrollPane13 = new javax.swing.JScrollPane();
        jtDiagnosticos = new javax.swing.JTable();
        lblHeader83 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        lblHeader11 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jtReceta = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        lblHeader12 = new javax.swing.JLabel();
        lblHeader13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaRecomendaciones = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaTratamiento = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblHeader64 = new javax.swing.JLabel();
        btnGenReporteConstancia = new javax.swing.JLabel();
        txtDiasReposo = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        lblHeader65 = new javax.swing.JLabel();
        txtCentro = new javax.swing.JTextField();
        btnGenReporteReferencia = new javax.swing.JLabel();
        lblHeader66 = new javax.swing.JLabel();
        txtEspecialidad = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        btnGenReporteReceta = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        btnGenReporteExpediente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Barra_Superior.setBackground(new java.awt.Color(102, 0, 0));
        Barra_Superior.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
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

        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btn_close.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
        });

        lblHeader1.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        lblHeader1.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader1.setText("CLÍNICA UNIVERSITARIA - EXPEDIENTE DE");

        lblPacienteTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblPacienteTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblPacienteTitulo.setText("\"PACIENTE\"");

        jTabbedPane1.setBackground(new java.awt.Color(102, 0, 0));

        jPanel6.setBackground(new java.awt.Color(102, 0, 0));

        jPanel3.setBackground(new java.awt.Color(102, 0, 0));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));

        lblHeader59.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblHeader59.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader59.setText("DATOS GENERALES");

        lblHeader60.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblHeader60.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader60.setText("FECHA DE CONSULTA:");

        lblHeader61.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblHeader61.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader61.setText("ATENDIDO POR:");

        lblHeader62.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblHeader62.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader62.setText("MOTIVO DE CONSULTA:");

        lblHeader63.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblHeader63.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader63.setText("PACIENTE:");

        lblNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("PACIENTE:");

        lblFechaCons.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblFechaCons.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaCons.setText("FECHA DE CONSULTA:");

        lblAtendidoPo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblAtendidoPo.setForeground(new java.awt.Color(255, 255, 255));
        lblAtendidoPo.setText("ATENDIDO POR:");

        lblMotivo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblMotivo.setForeground(new java.awt.Color(255, 255, 255));
        lblMotivo.setText("MOTIVO DE CONSULTA:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeader60)
                    .addComponent(lblHeader61)
                    .addComponent(lblHeader62)
                    .addComponent(lblHeader63))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblFechaCons)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblAtendidoPo)
                            .addComponent(lblMotivo))
                        .addContainerGap(304, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHeader59)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblHeader59)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader63)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader60)
                    .addComponent(lblFechaCons))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader61)
                    .addComponent(lblAtendidoPo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblHeader62)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblMotivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(102, 0, 0));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));

        lblHeader50.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblHeader50.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader50.setText("SIGNOS VITALES Y EXAMEN FÍSICO");

        lblPeso1232412.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblPeso1232412.setForeground(new java.awt.Color(255, 255, 255));
        lblPeso1232412.setText("PESO:");

        lblTalla3423.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblTalla3423.setForeground(new java.awt.Color(255, 255, 255));
        lblTalla3423.setText("TALLA:");

        lblTemp243.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblTemp243.setForeground(new java.awt.Color(255, 255, 255));
        lblTemp243.setText("TEMP:");

        lblPulso1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblPulso1.setForeground(new java.awt.Color(255, 255, 255));
        lblPulso1.setText("PULSO:");

        lblFrecCar1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblFrecCar1.setForeground(new java.awt.Color(255, 255, 255));
        lblFrecCar1.setText("FRECUENCIA CARDÍACA:");

        lblPresArt1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblPresArt1.setForeground(new java.awt.Color(255, 255, 255));
        lblPresArt1.setText("PRESIÓN ARTERIAL:");

        lblPeso.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblPeso.setForeground(new java.awt.Color(255, 255, 255));
        lblPeso.setText("PESO:");

        lblTalla.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblTalla.setForeground(new java.awt.Color(255, 255, 255));
        lblTalla.setText("TALLA:");

        lblTemp.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblTemp.setForeground(new java.awt.Color(255, 255, 255));
        lblTemp.setText("TEMP:");

        lblPulso.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblPulso.setForeground(new java.awt.Color(255, 255, 255));
        lblPulso.setText("PESO:");

        lblFrecCar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblFrecCar.setForeground(new java.awt.Color(255, 255, 255));
        lblFrecCar.setText("PESO:");

        lblPresArt.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblPresArt.setForeground(new java.awt.Color(255, 255, 255));
        lblPresArt.setText("PESO:");

        jScrollPane3.setBackground(new java.awt.Color(102, 0, 0));
        jScrollPane3.setBorder(null);

        jPanel5.setBackground(new java.awt.Color(102, 0, 0));
        jPanel5.setPreferredSize(new java.awt.Dimension(1100, 158));

        lblHeader68.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblHeader68.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader68.setText("CABEZA:");

        lblHeader69.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblHeader69.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader69.setText("CUELLO:");

        lblHeader70.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblHeader70.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader70.setText("TÓRAX:");

        lblHeader71.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblHeader71.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader71.setText("ABDOMEN:");

        lblHeader72.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblHeader72.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader72.setText("EXTREMIDADES:");

        lblCabeza.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblCabeza.setForeground(new java.awt.Color(255, 255, 255));
        lblCabeza.setText("CABEZA:CABEZA:CABEZA:CABEZA:CABEZA:CABEZA:CABEZA:");

        lblCuello.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblCuello.setForeground(new java.awt.Color(255, 255, 255));
        lblCuello.setText("CABEZA:CABEZA:CABEZA:CABEZA:CABEZA");

        lblTorax.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblTorax.setForeground(new java.awt.Color(255, 255, 255));
        lblTorax.setText("CABEZA:CABEZA:CABEZA:CABEZA:CABEZA:CABEZA:CABEZA:");

        lblAbdomen.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblAbdomen.setForeground(new java.awt.Color(255, 255, 255));
        lblAbdomen.setText("CABEZA:CABEZA:CABEZA:CABEZA:CABEZA:CABEZA:CABEZA:");

        lblExtremidades.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblExtremidades.setForeground(new java.awt.Color(255, 255, 255));
        lblExtremidades.setText("CABEZA:CABEZA:CABEZA:CABEZA:CABEZA:CABEZA:CABEZA:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHeader69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeader70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeader68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCabeza, javax.swing.GroupLayout.DEFAULT_SIZE, 1049, Short.MAX_VALUE)
                            .addComponent(lblCuello, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTorax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblHeader71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeader72))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAbdomen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblExtremidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCabeza)
                    .addComponent(lblHeader68))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader69)
                    .addComponent(lblCuello))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader70)
                    .addComponent(lblTorax))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader71)
                    .addComponent(lblAbdomen, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader72)
                    .addComponent(lblExtremidades))
                .addGap(16, 16, 16))
        );

        jScrollPane3.setViewportView(jPanel5);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHeader50)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1194, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblTemp243, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTalla3423, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPeso1232412, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTalla, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblFrecCar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblFrecCar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblPresArt1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblPresArt, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblPulso1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblPulso, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblHeader50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPeso1232412)
                            .addComponent(lblPeso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTalla3423)
                            .addComponent(lblTalla))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTemp243)
                            .addComponent(lblTemp)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblPulso1)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lblPulso)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblFrecCar1)
                                .addComponent(lblFrecCar))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPresArt1)
                                .addComponent(lblPresArt)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(102, 0, 0));
        jPanel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));

        lblHeader67.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblHeader67.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader67.setText("PRESENTE ENFERMEDAD");

        txtPresente_enf.setEditable(false);
        txtPresente_enf.setColumns(20);
        txtPresente_enf.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtPresente_enf.setRows(5);
        jScrollPane4.setViewportView(txtPresente_enf);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblHeader67)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(lblHeader67)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("SIGNOS VITALES", jPanel6);

        jPanel7.setBackground(new java.awt.Color(102, 0, 0));

        jPanel4.setBackground(new java.awt.Color(102, 0, 0));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));

        lblHeader78.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblHeader78.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader78.setText("ANTECEDENTES Y DIAGNÓSTICOS");

        lblHeader81.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader81.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader81.setText("DIAGNÓSTICOS");

        jtAntecedentes.setBackground(new java.awt.Color(204, 204, 204));
        jtAntecedentes.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jtAntecedentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Enfermedad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
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
        jtAntecedentes.setGridColor(new java.awt.Color(255, 255, 153));
        jtAntecedentes.setRowHeight(25);
        jtAntecedentes.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jtAntecedentes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtAntecedentes.getTableHeader().setReorderingAllowed(false);
        jScrollPane12.setViewportView(jtAntecedentes);
        if (jtAntecedentes.getColumnModel().getColumnCount() > 0) {
            jtAntecedentes.getColumnModel().getColumn(0).setMaxWidth(60);
        }

        jtDiagnosticos.setBackground(new java.awt.Color(204, 204, 204));
        jtDiagnosticos.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jtDiagnosticos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Enfermedad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
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
        jtDiagnosticos.setGridColor(new java.awt.Color(255, 255, 153));
        jtDiagnosticos.setRowHeight(25);
        jtDiagnosticos.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jtDiagnosticos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtDiagnosticos.getTableHeader().setReorderingAllowed(false);
        jScrollPane13.setViewportView(jtDiagnosticos);
        if (jtDiagnosticos.getColumnModel().getColumnCount() > 0) {
            jtDiagnosticos.getColumnModel().getColumn(0).setMaxWidth(60);
        }

        lblHeader83.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHeader83.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader83.setText("ANTECEDENTES");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 1182, Short.MAX_VALUE)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(lblHeader83)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblHeader78)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(lblHeader81)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lblHeader78)
                .addGap(3, 3, 3)
                .addComponent(lblHeader83)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHeader81)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ANTECEDENTES Y DIAGNÓSTICOS", jPanel7);

        jPanel8.setBackground(new java.awt.Color(102, 0, 0));

        jPanel10.setBackground(new java.awt.Color(102, 0, 0));
        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        jPanel10.setPreferredSize(new java.awt.Dimension(480, 150));

        lblHeader11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
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
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtReceta.setGridColor(new java.awt.Color(255, 255, 153));
        jtReceta.setRowHeight(25);
        jtReceta.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jtReceta.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtReceta.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(jtReceta);
        if (jtReceta.getColumnModel().getColumnCount() > 0) {
            jtReceta.getColumnModel().getColumn(0).setMaxWidth(35);
        }

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblHeader11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane8))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(lblHeader11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(102, 0, 0));
        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        jPanel11.setPreferredSize(new java.awt.Dimension(480, 150));

        lblHeader12.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblHeader12.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader12.setText("RECOMENDACIONES");

        lblHeader13.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblHeader13.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader13.setText("TRATAMIENTO");

        txtAreaRecomendaciones.setEditable(false);
        txtAreaRecomendaciones.setColumns(20);
        txtAreaRecomendaciones.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtAreaRecomendaciones.setRows(4);
        jScrollPane1.setViewportView(txtAreaRecomendaciones);

        txtAreaTratamiento.setEditable(false);
        txtAreaTratamiento.setColumns(20);
        txtAreaTratamiento.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtAreaTratamiento.setRows(4);
        jScrollPane2.setViewportView(txtAreaTratamiento);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(lblHeader12))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(lblHeader13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 748, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(128, 128, 128))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblHeader13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 1208, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1208, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("RECETA Y TRATAMIENTO", jPanel8);

        jPanel9.setBackground(new java.awt.Color(102, 0, 0));

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 51), 1, true));

        lblHeader64.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblHeader64.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader64.setText("DIAS DE REPOSO:");

        btnGenReporteConstancia.setForeground(new java.awt.Color(255, 255, 255));
        btnGenReporteConstancia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGenReporteConstancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/folder.png"))); // NOI18N
        btnGenReporteConstancia.setText("IMPRIMIR CONSTANCIA");
        btnGenReporteConstancia.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnGenReporteConstancia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        btnGenReporteConstancia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenReporteConstancia.setFocusable(false);
        btnGenReporteConstancia.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnGenReporteConstancia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenReporteConstanciaMouseClicked(evt);
            }
        });

        txtDiasReposo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtDiasReposo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(304, Short.MAX_VALUE)
                .addComponent(lblHeader64, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDiasReposo, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenReporteConstancia, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(304, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader64)
                    .addComponent(btnGenReporteConstancia)
                    .addComponent(txtDiasReposo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(102, 0, 0));
        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 51), 1, true));

        lblHeader65.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblHeader65.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader65.setText("CENTRO A REFERIR:");

        txtCentro.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtCentro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        btnGenReporteReferencia.setForeground(new java.awt.Color(255, 255, 255));
        btnGenReporteReferencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGenReporteReferencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doctor.png"))); // NOI18N
        btnGenReporteReferencia.setText("IMPRIMIR REFERENCIA");
        btnGenReporteReferencia.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnGenReporteReferencia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        btnGenReporteReferencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenReporteReferencia.setFocusable(false);
        btnGenReporteReferencia.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnGenReporteReferencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenReporteReferenciaMouseClicked(evt);
            }
        });

        lblHeader66.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblHeader66.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader66.setText("ESPECIALIDAD:");

        txtEspecialidad.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtEspecialidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(lblHeader65, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCentro))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(lblHeader66, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEspecialidad, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenReporteReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHeader65)
                        .addComponent(txtCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnGenReporteReferencia))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader66)
                    .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel13.setBackground(new java.awt.Color(102, 0, 0));
        jPanel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 51), 1, true));

        btnGenReporteReceta.setForeground(new java.awt.Color(255, 255, 255));
        btnGenReporteReceta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGenReporteReceta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/solmedicamento.png"))); // NOI18N
        btnGenReporteReceta.setText("IMPRIMIR RECETA");
        btnGenReporteReceta.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnGenReporteReceta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        btnGenReporteReceta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenReporteReceta.setFocusable(false);
        btnGenReporteReceta.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnGenReporteReceta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenReporteRecetaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGenReporteReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(btnGenReporteReceta)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(102, 0, 0));
        jPanel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 51), 1, true));

        btnGenReporteExpediente.setForeground(new java.awt.Color(255, 255, 255));
        btnGenReporteExpediente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGenReporteExpediente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lista.png"))); // NOI18N
        btnGenReporteExpediente.setText("IMPRIMIR EXPEDIENTE");
        btnGenReporteExpediente.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnGenReporteExpediente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
        btnGenReporteExpediente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenReporteExpediente.setFocusable(false);
        btnGenReporteExpediente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnGenReporteExpediente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenReporteExpedienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGenReporteExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(btnGenReporteExpediente)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        jTabbedPane1.addTab("REPORTES", jPanel9);

        javax.swing.GroupLayout Barra_SuperiorLayout = new javax.swing.GroupLayout(Barra_Superior);
        Barra_Superior.setLayout(Barra_SuperiorLayout);
        Barra_SuperiorLayout.setHorizontalGroup(
            Barra_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Barra_SuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Barra_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(Barra_SuperiorLayout.createSequentialGroup()
                        .addComponent(btnHome2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHeader1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPacienteTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        Barra_SuperiorLayout.setVerticalGroup(
            Barra_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Barra_SuperiorLayout.createSequentialGroup()
                .addGroup(Barra_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Barra_SuperiorLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(Barra_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_close)
                            .addGroup(Barra_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblHeader1)
                                .addComponent(lblPacienteTitulo)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Barra_Superior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Barra_Superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome2ActionPerformed

    }//GEN-LAST:event_btnHome2ActionPerformed

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        this.dispose();
    }//GEN-LAST:event_btn_closeMouseClicked

    private void Barra_SuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Barra_SuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_Barra_SuperiorMouseDragged

    private void Barra_SuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Barra_SuperiorMousePressed
        this.setOpacity((float) 0.8);
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_Barra_SuperiorMousePressed

    private void Barra_SuperiorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Barra_SuperiorMouseReleased
        this.setOpacity((float) 1.0);
    }//GEN-LAST:event_Barra_SuperiorMouseReleased

    private void btnGenReporteExpedienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenReporteExpedienteMouseClicked
        //REPORTE DE EXPEDIENTE SELECCIONADO
        int idConsulta = this.consulta.idConsulta;
        Map parameters = new HashMap();
        //A nuestro informe de prueba le vamos a enviar la fecha de hoy
        parameters.put("idConsulta", idConsulta);
        JasperReport reporte; //Creo el objeto reporte
        // Ubicacion del Reporte
        String path = ".\\src\\Reportes\\reporte_expediente.jasper";
        try {
            this.conn = new ConexionDB();
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path); //Cargo el reporte al objeto
            JasperPrint jprint = JasperFillManager.fillReport(path, parameters, this.conn.conn); //Llenado del Reporte con Tres parametros ubicacion,parametros,conexion a la base de datos
            JasperViewer viewer = new JasperViewer(jprint, false); //Creamos la vista del Reporte
            viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Le agregamos que se cierre solo el reporte cuando lo cierre el usuario
            viewer.setVisible(true); //Inicializamos la vista del Reporte
        } catch (JRException ex) {
            Logger.getLogger(Home_Root.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGenReporteExpedienteMouseClicked

    private void btnGenReporteRecetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenReporteRecetaMouseClicked
        //REPORTE DE RECETA DEL EXPEDIENTE SELECCIONADO
        int idConsulta = this.consulta.idConsulta;
        Map parameters = new HashMap();
        //A nuestro informe de prueba le vamos a enviar la fecha de hoy
        parameters.put("idConsulta", idConsulta);
        JasperReport reporte; //Creo el objeto reporte
        // Ubicacion del Reporte
        String path = ".\\src\\Reportes\\reporte_receta.jasper";
        try {
            this.conn = new ConexionDB();
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path); //Cargo el reporte al objeto
            JasperPrint jprint = JasperFillManager.fillReport(path, parameters, this.conn.conn); //Llenado del Reporte con Tres parametros ubicacion,parametros,conexion a la base de datos
            JasperViewer viewer = new JasperViewer(jprint, false); //Creamos la vista del Reporte
            viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Le agregamos que se cierre solo el reporte cuando lo cierre el usuario
            viewer.setVisible(true); //Inicializamos la vista del Reporte
        } catch (JRException ex) {
            Logger.getLogger(Home_Root.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGenReporteRecetaMouseClicked

    private void btnGenReporteConstanciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenReporteConstanciaMouseClicked
        if (!this.txtDiasReposo.getText().isEmpty()) {
            //REPORTE CONTANCIA 
            Map parameters = new HashMap();

            parameters.put("dias", this.txtDiasReposo.getText());
            parameters.put("medico", this.consulta.doctor.toUpperCase());
            parameters.put("paciente", this.consulta.paciente.toUpperCase());
            parameters.put("fecha", this.consulta.fechaString);
            
            String[] diagnostico1 = null; String[] diagnostico2 = null;
            String diagnostico = "";
            
            if((String[]) this.consulta.diagnostico.rowDiagnostico[0] != null){
                diagnostico1= (String[]) this.consulta.diagnostico.rowDiagnostico[0];
                diagnostico += diagnostico1[1];
            }
            if((String[]) this.consulta.diagnostico.rowDiagnostico[1] != null){
                diagnostico2 = (String[]) this.consulta.diagnostico.rowDiagnostico[1];
                diagnostico += " \n" + diagnostico2[1];
            }
            
            parameters.put("diagnostico",  diagnostico);
            
            JasperReport reporte;

            String path = ".\\src\\Reportes\\reporte_incapacidad.jasper";
            try {
                this.conn = new ConexionDB();
                reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
                JasperPrint jprint = JasperFillManager.fillReport(path, parameters, this.conn.conn);
                JasperViewer viewer = new JasperViewer(jprint, false);
                viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                viewer.setVisible(true);
            } catch (JRException ex) {
                Logger.getLogger(Home_Root.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnGenReporteConstanciaMouseClicked

    private void btnGenReporteReferenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenReporteReferenciaMouseClicked
        //REPORTE REFERENCIA 
        if (!this.txtEspecialidad.getText().isEmpty() && !this.txtCentro.getText().isEmpty()) {
            Map parameters = new HashMap();

            parameters.put("especialidad", this.txtEspecialidad.getText().toUpperCase());
            parameters.put("centro", this.txtCentro.getText().toUpperCase());
            parameters.put("medico", this.consulta.doctor.toUpperCase());
            parameters.put("paciente", this.consulta.paciente.toUpperCase());
            parameters.put("fecha", this.consulta.fechaString);
            
            String[] diagnostico1 = null; String[] diagnostico2 = null;
            String diagnostico = "";
            
            if((String[]) this.consulta.diagnostico.rowDiagnostico[0] != null){
                diagnostico1= (String[]) this.consulta.diagnostico.rowDiagnostico[0];
                diagnostico += diagnostico1[1];
            }
            if((String[]) this.consulta.diagnostico.rowDiagnostico[1] != null){
                diagnostico2 = (String[]) this.consulta.diagnostico.rowDiagnostico[1];
                diagnostico += " \n" + diagnostico2[1];
            }
            
            
            parameters.put("diagnostico",  diagnostico);
            
            JasperReport reporte;

            String path = ".\\src\\Reportes\\reporte_referencia.jasper";
            try {
                this.conn = new ConexionDB();
                reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
                JasperPrint jprint = JasperFillManager.fillReport(path, parameters, this.conn.conn);
                JasperViewer viewer = new JasperViewer(jprint, false);
                viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                viewer.setVisible(true);
            } catch (JRException ex) {
                Logger.getLogger(Home_Root.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnGenReporteReferenciaMouseClicked

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
            java.util.logging.Logger.getLogger(Expediente_Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Expediente_Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Expediente_Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Expediente_Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Expediente_Paciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra_Superior;
    private javax.swing.JLabel btnGenReporteConstancia;
    private javax.swing.JLabel btnGenReporteExpediente;
    private javax.swing.JLabel btnGenReporteReceta;
    private javax.swing.JLabel btnGenReporteReferencia;
    private javax.swing.JButton btnHome2;
    private javax.swing.JLabel btn_close;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jtAntecedentes;
    private javax.swing.JTable jtDiagnosticos;
    private javax.swing.JTable jtReceta;
    private javax.swing.JLabel lblAbdomen;
    private javax.swing.JLabel lblAtendidoPo;
    private javax.swing.JLabel lblCabeza;
    private javax.swing.JLabel lblCuello;
    private javax.swing.JLabel lblExtremidades;
    private javax.swing.JLabel lblFechaCons;
    private javax.swing.JLabel lblFrecCar;
    private javax.swing.JLabel lblFrecCar1;
    private javax.swing.JLabel lblHeader1;
    private javax.swing.JLabel lblHeader11;
    private javax.swing.JLabel lblHeader12;
    private javax.swing.JLabel lblHeader13;
    private javax.swing.JLabel lblHeader50;
    private javax.swing.JLabel lblHeader59;
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
    private javax.swing.JLabel lblHeader70;
    private javax.swing.JLabel lblHeader71;
    private javax.swing.JLabel lblHeader72;
    private javax.swing.JLabel lblHeader78;
    private javax.swing.JLabel lblHeader81;
    private javax.swing.JLabel lblHeader83;
    private javax.swing.JLabel lblMotivo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPacienteTitulo;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblPeso1232412;
    private javax.swing.JLabel lblPresArt;
    private javax.swing.JLabel lblPresArt1;
    private javax.swing.JLabel lblPulso;
    private javax.swing.JLabel lblPulso1;
    private javax.swing.JLabel lblTalla;
    private javax.swing.JLabel lblTalla3423;
    private javax.swing.JLabel lblTemp;
    private javax.swing.JLabel lblTemp243;
    private javax.swing.JLabel lblTorax;
    private javax.swing.JTextArea txtAreaRecomendaciones;
    private javax.swing.JTextArea txtAreaTratamiento;
    private javax.swing.JTextField txtCentro;
    private javax.swing.JTextField txtDiasReposo;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextArea txtPresente_enf;
    // End of variables declaration//GEN-END:variables
}
