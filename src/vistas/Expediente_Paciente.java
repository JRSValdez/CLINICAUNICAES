
package vistas;

import Classes.Consulta;
import Classes.Paciente;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JRSValdez
 */
public class Expediente_Paciente extends javax.swing.JFrame {

    int xx, xy,xs, ys, sbx,sby;
    
    Consulta consulta;
    Paciente paciente;
    
    public Expediente_Paciente() {
        initComponents();
    }

    public Expediente_Paciente(Consulta consulta, Paciente paciente) {
        initComponents();
        this.consulta = consulta;
        this.paciente = paciente;
        
        this.setValues();
    }

    private void setValues(){
        this.lblNombre.setText(this.paciente.nombre);
        this.lblPacienteTitulo.setText(this.paciente.nombre);
        this.lblFechaCons.setText(this.consulta.fecha);
        this.lblAtendidoPo.setText("Doctor Estático");
        this.lblMotivo.setText(this.consulta.motivo);
        
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
        
        //lllenar JTBALES 
        DefaultTableModel modelAntecedentes = (DefaultTableModel) this.jtAntecedentes.getModel();
        for (int i = 0; i< this.consulta.antecedente.rowAntecedente.length; i++){
            if (this.consulta.antecedente.rowAntecedente[i] != null){
                modelAntecedentes.addRow((String[]) this.consulta.antecedente.rowAntecedente[i]);
            } else break;
        }
        
        DefaultTableModel modelDiagnostico = (DefaultTableModel) this.jtDiagnosticos.getModel();
        for (int i = 0; i< this.consulta.diagnostico.rowDiagnostico.length; i++){
            if (this.consulta.diagnostico.rowDiagnostico[i] != null){
                modelDiagnostico.addRow((String[]) this.consulta.diagnostico.rowDiagnostico[i]);
            } else break;
        }
        
        DefaultTableModel modelReceta = (DefaultTableModel) this.jtReceta.getModel();
        for (int i = 0; i< this.consulta.receta.rowReceta.length; i++){
            if (this.consulta.receta.rowReceta[i] != null){
                modelReceta.addRow((String[]) this.consulta.receta.rowReceta[i]);
            } else break;
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Barra_Superior = new javax.swing.JPanel();
        btnHome2 = new javax.swing.JButton();
        btn_close = new javax.swing.JLabel();
        lblHeader1 = new javax.swing.JLabel();
        lblPacienteTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblHeader50 = new javax.swing.JLabel();
        lblPeso1232412 = new javax.swing.JLabel();
        lblTalla3423 = new javax.swing.JLabel();
        lblTemp243 = new javax.swing.JLabel();
        lblPulso1 = new javax.swing.JLabel();
        lblFrecCar1 = new javax.swing.JLabel();
        lblPresArt1 = new javax.swing.JLabel();
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
        lblPeso = new javax.swing.JLabel();
        lblTalla = new javax.swing.JLabel();
        lblTemp = new javax.swing.JLabel();
        lblPulso = new javax.swing.JLabel();
        lblFrecCar = new javax.swing.JLabel();
        lblPresArt = new javax.swing.JLabel();
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
        jPanel4 = new javax.swing.JPanel();
        lblHeader78 = new javax.swing.JLabel();
        lblHeader81 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jtAntecedentes = new javax.swing.JTable();
        jScrollPane13 = new javax.swing.JScrollPane();
        jtDiagnosticos = new javax.swing.JTable();
        lblHeader83 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lblHeader11 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jtReceta = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 2, true));

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

        javax.swing.GroupLayout Barra_SuperiorLayout = new javax.swing.GroupLayout(Barra_Superior);
        Barra_Superior.setLayout(Barra_SuperiorLayout);
        Barra_SuperiorLayout.setHorizontalGroup(
            Barra_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Barra_SuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHeader1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPacienteTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_close)
                .addContainerGap())
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        lblCabeza.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblCabeza.setForeground(new java.awt.Color(255, 255, 255));
        lblCabeza.setText("CABEZA:CABEZA:CABEZA:CABEZA:CABEZA:CABEZA:CABEZA:");

        lblCuello.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblCuello.setForeground(new java.awt.Color(255, 255, 255));
        lblCuello.setText("CABEZA:CABEZA:CABEZA:CABEZA:CABEZA");

        lblTorax.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblTorax.setForeground(new java.awt.Color(255, 255, 255));
        lblTorax.setText("CABEZA:CABEZA:CABEZA:CABEZA:CABEZA:CABEZA:CABEZA:");

        lblAbdomen.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblAbdomen.setForeground(new java.awt.Color(255, 255, 255));
        lblAbdomen.setText("CABEZA:CABEZA:CABEZA:CABEZA:CABEZA:CABEZA:CABEZA:");

        lblExtremidades.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblExtremidades.setForeground(new java.awt.Color(255, 255, 255));
        lblExtremidades.setText("CABEZA:CABEZA:CABEZA:CABEZA:CABEZA:CABEZA:CABEZA:");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblTemp243, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTalla3423, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPeso1232412, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(lblTalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblFrecCar1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblFrecCar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblPresArt1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblPresArt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblPulso1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblPulso, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(97, 97, 97))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblHeader69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblHeader70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblHeader68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblCuello, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTorax, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                                    .addComponent(lblCabeza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblHeader71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblHeader72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblAbdomen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblExtremidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblHeader50)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblHeader50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPeso1232412)
                            .addComponent(lblPeso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTalla3423)
                            .addComponent(lblTalla))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTemp243)
                            .addComponent(lblTemp)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPulso1)
                            .addComponent(lblPulso))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblFrecCar1)
                                .addComponent(lblFrecCar))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPresArt1)
                                .addComponent(lblPresArt)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCabeza)
                    .addComponent(lblHeader68))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeader69)
                    .addComponent(lblCuello))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader70)
                    .addComponent(lblTorax))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader71)
                    .addComponent(lblAbdomen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader72)
                    .addComponent(lblExtremidades))
                .addContainerGap(18, Short.MAX_VALUE))
        );

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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader62)
                    .addComponent(lblMotivo))
                .addGap(50, 50, 50))
        );

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
                    .addComponent(jScrollPane12)
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
                        .addGap(0, 482, Short.MAX_VALUE)))
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
                .addGap(18, 18, 18)
                .addComponent(lblHeader81)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Barra_Superior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Barra_Superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void btnHome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome2ActionPerformed

    }//GEN-LAST:event_btnHome2ActionPerformed

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
    private javax.swing.JButton btnHome2;
    private javax.swing.JLabel btn_close;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane8;
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
    private javax.swing.JLabel lblHeader50;
    private javax.swing.JLabel lblHeader59;
    private javax.swing.JLabel lblHeader60;
    private javax.swing.JLabel lblHeader61;
    private javax.swing.JLabel lblHeader62;
    private javax.swing.JLabel lblHeader63;
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
    // End of variables declaration//GEN-END:variables
}
