/*
 Procedimientos y funciones para obtener e insertar a la base de datos
 */
package Classes;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JRSVALDEZ
 */
public class ConexionDB {
    static Statement st;
    static ResultSet rs;
    public Connection conn=null;
    SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
  
    //instanciar la clase validar

    public ConexionDB(){
        conectar();
    }
  
    public void conectar(){
        try {
            String url="jdbc:oracle:thin:@localhost:1521:XE";
            conn= DriverManager.getConnection(url,"clinica","unicaes");
            st= conn.createStatement();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"No ha sido posible connectarse \n" +  e);
        }
    }
        
    public void cerrarConexion (){
        try {
            conn.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al cerrar la connexión \n" +  e);
        }
    }
    
    //////////////////////////////////////////////////////////////////
    ////////////////////// GETS //////////////////////////////////////
    //////////////////////////////////////////////////////////////////
    
    public Medicamento getMedicamentobyID(int _idMed) throws SQLException{
        DefaultTableModel model;
        
        String query = "SELECT M.IDMEDICAMENTO, TP.TIPO_MED, M.MEDICAMENTO, UM.UNIDAD, P.PRESENTACION, M.CANTIDAD, TO_CHAR(M.FECHA_V, 'dd-mm-yyyy') FECHA FROM MEDICAMENTO M " +
                            " INNER JOIN UNIDAD_MED UM ON UM.IDUNIDAD_MED = M.IDUNIDAD_MED " +
                            " INNER JOIN TIPO_MEDICAMENTO TP ON TP.IDTIPO_MED = M.IDTIPO " +
                            " INNER JOIN PRESENTACION P ON P.IDPRESENTACION = M.IDPRESENTACION " +
                        " WHERE M.IDMEDICAMENTO = ? AND M.ELIMINADO = 0";
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setInt(1,_idMed);
        ResultSet rs = preparedStatement.executeQuery();
        
        Object Datos[]= new Object[6];
        Medicamento med = new Medicamento();
          while (rs.next())
           {
              med.idMedicamente = rs.getInt(1);
              med.tipo = rs.getString(2);
              med.medicamento = rs.getString(3);
              med.unidad_med = rs.getString(4);
              med.presentacion = rs.getString(5);
              med.cantidad = rs.getInt(6);
              med.fechaV = rs.getString(7);
           }
           return med;
    }
    
    public Paciente getPaciente(int _idPaciente) throws SQLException{
        Paciente paciente = new Paciente();
        Statement stmt = conn.createStatement();
        String query = "SELECT P.IDPACIENTE, P.PAC_CARNE, TP.TIPOPAC, C.CARRERA, " +
                        " P.PAC_NOMBRE || ' ' || P.PAC_APELLIDO NOMBRE, P.PAC_SEXO, P.PAC_CELULAR, P.PAC_TELEFONO, " +
                        " (trunc(months_between(sysdate,PAC_FECHA_NAC)/12) || ' Años ' || trunc(mod(months_between(sysdate,PAC_FECHA_NAC),12)) || ' meses') Edad, " +
                        " P.PAC_DIRECCION, D.DEPARTAMENTO,  P.PAC_RESPONSABLE, P.PAC_RES_TEL, PA.PARENTESCO " +
                    "FROM PACIENTES P " +
                    " LEFT OUTER JOIN CARRERA C ON C.IDCARRERA = P.IDCARRERA " +
                    " LEFT OUTER JOIN FACULTAD F ON F.IDFACULTAD = C.IDFACULTAD " +
                    " INNER JOIN TIPO_PACIENTE TP ON TP.IDTIPOPAC = P.IDTIPOPAC " +
                    " INNER JOIN PARENTESCO PA ON PA.IDPARENTESCO = P.IDPARENTESCO " +
                    " INNER JOIN DEPARTAMENTO D ON D.IDDEPARTAMENTO = P.IDDEPARTAMENTO " +
                    " WHERE P.IDPACIENTE = ?";
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setInt(1,_idPaciente);
        ResultSet rs = preparedStatement.executeQuery();
        
        while (rs.next())
        {
            paciente.idPaciente = rs.getInt(1);
            paciente.carne = rs.getString(2);
            paciente.actividad = rs.getString(3);
            paciente.carrera = rs.getString(4);
            paciente.nombre = rs.getString(5);
            paciente.sexo = rs.getString(6);
            paciente.celular = rs.getString(7);
            paciente.telefono = rs.getString(8);
            paciente.edad = rs.getString(9);
            paciente.direccion = rs.getString(10);
            paciente.departamento = rs.getString(11);
            paciente.responsable = rs.getString(12);
            paciente.responsable_tel = rs.getString(13);
            paciente.responsable_parentesco = rs.getString(14);
        }
        
        return paciente;
    }
    
    public Consulta getConsulta(int _idConsulta) throws SQLException, ParseException{
        Consulta consulta = new Consulta();
        Statement stmt = conn.createStatement();
        String query = "SELECT C.IDCONSULTA, C.IDPACIENTE, C.IDDOCTOR, TO_CHAR(C.CONS_FECHA, 'dd-mm-yyyy'), C.IDUSUARIO, DC.EF_CABEZA," +
                    " DC.EF_ABDOMEN, DC.EF_CUELLO, DC.EF_TORAX, DC.EF_EXTREMIDADES, DC.FREC_CAR, DC.PRES_ART, " +
                    " DC.PESO, DC.TALLA, DC.PULSO, DC.TEMP, DC.MOTIVO FROM CONSULTA C " +
                    " LEFT OUTER JOIN DET_CONSULTA DC ON DC.IDCONSULTA = C.IDCONSULTA" +
                    " WHERE C.IDCONSULTA = ?";
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setInt(1,_idConsulta);
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next())
        {
            consulta.idConsulta = rs.getInt(1);
            consulta.idPaciente = rs.getInt(2);
            consulta.idDoctor = rs.getInt(3);
            consulta.fecha = rs.getString(4);
            consulta.idUsuario = rs.getInt(5);
            consulta.ef_cabeza = rs.getString(6);
            consulta.ef_abdomen = rs.getString(7);
            consulta.ef_cuello = rs.getString(8);
            consulta.ef_torax = rs.getString(9);
            consulta.ef_extremidades = rs.getString(10);
            consulta.frec_card = rs.getString(11);
            consulta.pres_art = rs.getString(12);
            consulta.peso = rs.getString(13);
            consulta.talla = rs.getString(14);
            consulta.pulso = rs.getString(15);
            consulta.temperatura = rs.getString(16);
            consulta.motivo = rs.getString(17);
            
            consulta.antecedente = this.getAntecedentes(consulta.idConsulta);
            consulta.diagnostico = this.getDiagnosticos(consulta.idConsulta);
            consulta.receta = this.getReceta(consulta.idConsulta);
        }
        return consulta;
    }
    
    private Antecedente getAntecedentes(int _idConsulta) throws SQLException{
        String query = "SELECT ENF.COD_CAT, ENF.ENFERMEDAD FROM ANTECEDENTES_X_CONS ANT " +
                    " INNER JOIN CIE10_ENFERMEDAD ENF ON ENF.COD_ENF = ANT.COD_ENF " +
                    " WHERE IDCONSULTA = ?";
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setInt(1,_idConsulta);
        ResultSet rs = preparedStatement.executeQuery();
        Antecedente antecedente = new Antecedente();
        while (rs.next())
        {
            String[] row = {rs.getString(1), rs.getString(2)};
            antecedente.aggRow(row);
        }
        return antecedente;
    }
    
    private Diagnostico getDiagnosticos(int _idConsulta) throws SQLException{
        String query = "SELECT ENF.COD_CAT, ENF.ENFERMEDAD FROM DIAGNOSTICO_X_CONS DIA " +
                    " INNER JOIN CIE10_ENFERMEDAD ENF ON ENF.COD_ENF = DIA.COD_ENF " +
                    " WHERE IDCONSULTA = ?";
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setInt(1,_idConsulta);
        ResultSet rs = preparedStatement.executeQuery();
        Diagnostico diagnostico = new Diagnostico();
        while (rs.next())
        {
            String[] row = {rs.getString(1), rs.getString(2)};
            diagnostico.aggRow(row);
        }
        return diagnostico;
    }
    
    private Receta getReceta(int _idConsulta) throws SQLException{
        String query = "SELECT M.IDMEDICAMENTO, M.MEDICAMENTO, D.CANTIDAD, D.DOSIS FROM RECETA R " +
                        " INNER JOIN DET_RECETA D ON D.IDDET_RECETA = R.IDRECETA " +
                        " INNER JOIN MEDICAMENTO M ON M.IDMEDICAMENTO = D.IDMEDICAMENTO " +
                    "WHERE R.IDCONSULTA = ?";
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setInt(1,_idConsulta);
        ResultSet rs = preparedStatement.executeQuery();
        Receta receta = new Receta();
        while (rs.next())
        {
            String[] row = {rs.getString(1), rs.getString(2),rs.getString(4), rs.getString(3)};
            receta.aggRow(row);
        }
        return receta;
    }
    
    public Object[] getCIE10Cats(String _cat) throws SQLException{
        String query = "SELECT COD_CAT, CATEGORIA FROM CIE10_CATEGORIA WHERE CATEGORIA LIKE ?";
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setString(1, "%" + _cat.toUpperCase() + "%");
        ResultSet rs = preparedStatement.executeQuery();
        
        rs.last();
        int numRows = rs.getRow();
        rs.beforeFirst();
        
        if(numRows > 0){
            String[] cats = new String[numRows];
            String[] idCats = new String[numRows];
            int con = 0;
            while (rs.next()){
                idCats[con] = rs.getString(1);
                cats[con] = rs.getString(2);
                con++;
            }
            return new Object[]{idCats, cats};
        }
        else{
            return null;
        }
    }
    
    public Object[] getCIE10Enfs(String _idCat) throws SQLException{
        String query = "SELECT COD_ENF, COD_CAT, ENFERMEDAD FROM CIE10_ENFERMEDAD WHERE COD_CAT = ?";
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setString(1,_idCat);
        ResultSet rs = preparedStatement.executeQuery();
        
        rs.last();
        int numRows = rs.getRow();
        rs.beforeFirst();
        
        if(numRows > 0){
            String[] idEnfs = new String[numRows];
            String[] idCats = new String[numRows];
            String[] enfs = new String[numRows];
            int con = 0;
            while (rs.next()){
                idEnfs[con] = rs.getString(1);
                idCats[con] = rs.getString(2);
                enfs[con] = rs.getString(3);
                con++;
            }
            return new Object[]{idEnfs,idCats, enfs};
        }
        else{
            return null;
        }
    }
    
    public Medicamento getMedicamentos(int _idTipo) throws SQLException{
        Medicamento medicamento = new Medicamento();
        
        return medicamento;
    }
    
    //////////////////////////////////////////////////////////////////
    ////////////////////// ADDS //////////////////////////////////////
    //////////////////////////////////////////////////////////////////
    
     public String aggUsuario(Usuario _usuario) throws SQLException{
        
        String user = _usuario.user;
        String contra = _usuario.password1;
        int tipo= _usuario.tipo_usr;
        int empleado= _usuario.empleado;
         
        CallableStatement cst = this.conn.prepareCall("{call  AGREGARUSUARIO(?,?,?,?,?)}");
        
    
        cst.setString("pUsuario", _usuario.user);
        cst.setString("pContra", _usuario.password1);
        cst.setInt("pTipo", _usuario.tipo_usr);
        cst.setInt("pEmp",_usuario.empleado);
        
           
           
        cst.registerOutParameter("pMsj", java.sql.Types.VARCHAR);
        cst.execute();
        
        String mensaje = cst.getString("pMsj");
        System.out.println(mensaje);
        return mensaje;
        
        
    }
     
      public String aggDoctor(Doctor _doctor) throws SQLException{
        
        String nombre = _doctor.nombre;
        String apellido = _doctor.apellido;
        int especialidad= _doctor.idEspecialidad;
        String telefono= _doctor.telefono;
        String fecha= _doctor.fechaNac;
        String sexo= _doctor.sexo;
        String documento= _doctor.documento;
        int usuario= _doctor.idUsuario;
        
         
        CallableStatement cst = this.conn.prepareCall("{call  AGREGARDOCTOR(?,?,?,?,?,?,?,?,?)}");
        
    
        cst.setString("pNombre", _doctor.nombre);
        cst.setString("pApellido", _doctor.apellido);
        cst.setInt("pIdEspecialidad", _doctor.idEspecialidad);
        cst.setString("pTel", _doctor.telefono);
        cst.setString("pFechaNac", _doctor.fechaNac);
        cst.setString("pSexo",_doctor.sexo);
        cst.setString("pDoc",_doctor.documento);
        cst.setInt("pIdUsuario",_doctor.idUsuario);
            
           
        cst.registerOutParameter("Msj", java.sql.Types.VARCHAR);
        cst.execute();
        
        String mensaje = cst.getString("Msj");
        System.out.println(mensaje);
        return mensaje;
        
        
    }
    
    public int aggConsulta(int _idPaciente, int _idDoctor, int _idUsuario) throws SQLException{
     
        //Ejecutar el procedimiento almacenado para agg consulta con el estado = 0
         CallableStatement cst = this.conn.prepareCall("{call  AGG_CONSULTA(?,?,?,?)}");
        // Parametros de entrada
        cst.setInt("pIDUSUARIO", _idUsuario);
        cst.setInt("pIDPACIENTE", _idPaciente);
        cst.setInt("pIDDOCTOR", _idDoctor);
        
        // Parametro de salida (mensaje)
        cst.registerOutParameter("MENSAJE", java.sql.Types.VARCHAR);
        
        // Ejecuta el procedimiento almacenado
        cst.execute();
        
        // Se obtienen la salida del procedimineto almacenado
        String mensaje = cst.getString("MENSAJE");
        System.out.println(mensaje);
        if(!mensaje.equals("ERROR")){
            int idConsulta = Integer.parseInt(mensaje.substring(10,mensaje.length()));
            return idConsulta;
        }
        else{
            return 0;
        }
    }
    
    public String aggDetConsulta(Consulta _consulta) throws SQLException{
        // agregar la consulta con el detalle de consulta con el procedimiento almecenado
        CallableStatement cst = this.conn.prepareCall("{call  AGG_DET_CONSULTA(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
        // Parametros de entrada
        cst.setInt("pIDCONSULTA", _consulta.idConsulta);
        cst.setString("pEF_CABEZA", _consulta.ef_cabeza);
        cst.setString("pEF_CUELLO", _consulta.ef_cuello);
        cst.setString("pEF_TORAX", _consulta.ef_torax);
        cst.setString("pEF_ABDOMEN", _consulta.ef_abdomen);
        cst.setString("pEF_EXTREMIDADES", _consulta.ef_extremidades);
        cst.setString("pPESO", _consulta.peso);
        cst.setString("pTALLA", _consulta.talla);
        cst.setString("pPULSO", _consulta.pulso);
        cst.setString("pFREC_C", _consulta.frec_card);
        cst.setString("pPRES_ART", _consulta.pres_art);
        cst.setString("pTEMP", _consulta.temperatura);
        cst.setString("pMOTIVO", _consulta.motivo);
        cst.setString("pRECOMENDACION", _consulta.recomendaciones);
        
        // Parametro de salida (mensaje)
        cst.registerOutParameter("MENSAJE", java.sql.Types.VARCHAR);
        
        // Ejecuta el procedimiento almacenado
        cst.execute();
        
        // Se obtienen la salida del procedimineto almacenado
        String mensaje = cst.getString("MENSAJE");
        
        if(!mensaje.equals("ERROR")){
            // agregar receta y detalle de receta
            // agregar diagnostico y detalle de diagnostico
            // agregar antecedente y detalle de antecedente
            int idConsulta = _consulta.idConsulta;
            
            int idReceta = this.aggReceta(idConsulta);
            
            if(idReceta != 0){
                //agregar detalle de receta
                for(int i = 0; i < _consulta.receta.rowReceta.length; i++){
                    if(_consulta.receta.rowReceta[i] != null){
                        String row = this.aggDetReceta(idReceta, (String[]) _consulta.receta.rowReceta[i]);
                        if((row.indexOf("ERROR:") > 0) || (row.equals("ERROR"))){
                            return "ERROR: detalle de receta";
                        }
                    }
                }
                //agregar diagnosticos
                for(int i = 0; i < _consulta.diagnostico.rowDiagnostico.length; i++){
                    if(_consulta.diagnostico.rowDiagnostico[i] != null){
                        String row = this.aggDiagnostico(idConsulta, (String[]) _consulta.diagnostico.rowDiagnostico[i]);
                        if((row.indexOf("ERROR:") > 0) || (row.equals("ERROR"))){
                            return "ERROR: diagnostico";
                        }
                    }
                }
                //agregar antecedentes
                for(int i = 0; i < _consulta.antecedente.rowAntecedente.length; i++){
                    if(_consulta.antecedente.rowAntecedente[i] != null){
                        String row = this.aggAntecedente(idConsulta, (String[]) _consulta.antecedente.rowAntecedente[i]);
                        if((row.indexOf("ERROR:") > 0) || (row.equals("ERROR"))){
                            return "ERROR: antecedente";
                        }
                    }
                }
            }
        }
        System.out.println(mensaje);
        if (mensaje.equals("EXITO")){
            this.commit();
        }
        return mensaje;
    }
    
    public String aggSignosVitales(Consulta _consulta) throws SQLException{
        // agregar la consulta con el detalle de consulta con el procedimiento almecenado
        CallableStatement cst = this.conn.prepareCall("{call  AGG_SIGNOS_VITALES(?,?,?,?,?,?,?,?,?)}");
        // Parametros de entrada
        cst.setInt("pIDCONSULTA", _consulta.idConsulta);
        cst.setString("pPESO", _consulta.peso);
        cst.setString("pTALLA", _consulta.talla);
        cst.setString("pPULSO", _consulta.pulso);
        cst.setString("pFREC_C", _consulta.frec_card);
        cst.setString("pPRES_ART", _consulta.pres_art);
        cst.setString("pMOTIVO", _consulta.motivo);
        cst.setString("pTEMP", _consulta.temperatura);
        
        // Parametro de salida (mensaje)
        cst.registerOutParameter("MENSAJE", java.sql.Types.VARCHAR);
        
        // Ejecuta el procedimiento almacenado
        cst.execute();
        
        // Se obtienen la salida del procedimineto almacenado
        String mensaje = cst.getString("MENSAJE");
        
        return mensaje;
    }
    
    private int aggReceta(int _idConsulta) throws SQLException{
        CallableStatement cst = this.conn.prepareCall("{call  AGG_RECETA(?,?)}");
        // Parametros de entrada
        cst.setInt("pIDCONSULTA", _idConsulta);
        // Parametro de salida (mensaje)
        cst.registerOutParameter("MENSAJE", java.sql.Types.VARCHAR);
        cst.execute();
        
        String mensaje = cst.getString("MENSAJE");
        if(mensaje.equals("ERROR")){
            return 0;
        }
        int idReceta = Integer.parseInt(mensaje.substring(9,mensaje.length()));
        return idReceta;
    }
    
    private String aggDetReceta(int _idReceta, String[] _row) throws SQLException{
        CallableStatement cst = this.conn.prepareCall("{call  AGG_DET_RECETA(?,?,?,?,?)}");
        // Parametros de entrada
        cst.setInt("pIDRECETA", _idReceta);
        cst.setInt("pIDMEDICAMENTO", Integer.parseInt(_row[0]));
        cst.setInt("pCANTIDAD", Integer.parseInt(_row[3]));
        cst.setString("pDOSIS",_row[2]);
        // Parametro de salida (mensaje)
        cst.registerOutParameter("MENSAJE", java.sql.Types.VARCHAR);
        cst.execute();
        
        String mensaje = cst.getString("MENSAJE");
        if(mensaje.equals("EXITO")){
            return mensaje;
        }
        return "ERROR: " + mensaje;
    }
    
    private String aggDiagnostico(int _idConsulta, String[] _row) throws SQLException{
         CallableStatement cst = this.conn.prepareCall("{call  AGG_DIAGNOSTICO(?,?,?)}");
        // Parametros de entrada
        cst.setInt("pIDCONSULTA", _idConsulta);
        cst.setString("pCOD_ENF", _row[2]);
        // Parametro de salida (mensaje)
        cst.registerOutParameter("MENSAJE", java.sql.Types.VARCHAR);
        cst.execute();
        
        String mensaje = cst.getString("MENSAJE");
        if(mensaje.equals("EXITO")){
            return mensaje;
        }
        return "ERROR";
    }
    
    private String aggAntecedente(int _idConsulta, String[] _row) throws SQLException{
         CallableStatement cst = this.conn.prepareCall("{call  AGG_ANTECEDENTE(?,?,?)}");
        // Parametros de entrada
        cst.setInt("pIDCONSULTA", _idConsulta);
        cst.setString("pCOD_ENF", _row[2]);
        // Parametro de salida (mensaje)
        cst.registerOutParameter("MENSAJE", java.sql.Types.VARCHAR);
        cst.execute();
        
        String mensaje = cst.getString("MENSAJE");
        if(mensaje.equals("EXITO")){
            return mensaje;
        }
        return "ERROR";
    }
    
    public String aggMedicamento(Medicamento _med) throws SQLException{
        CallableStatement cst = this.conn.prepareCall("{call  AGG_MEDICAMENTO(?,?,?,?,?,?,?)}");
        // Parametros de entrada
        cst.setString("pMEDICAMENTO", _med.medicamento);
        cst.setInt("pIDUNIDAD", _med.idUnidad);
        cst.setInt("pCANTIDAD", _med.cantidad);
        cst.setInt("pIDPRESENTACION", _med.idPresentacion);
        cst.setInt("pIDTIPO", _med.idTipoMed);
        cst.setString("pFECHA", _med.fechaV);
        
        // Parametro de salida (mensaje)
        cst.registerOutParameter("MENSAJE", java.sql.Types.VARCHAR);
        
        // Ejecuta el procedimiento almacenado
        cst.execute();
        
        // Se obtienen la salida del procedimineto almacenado
        String mensaje = cst.getString("MENSAJE");
        System.out.println(mensaje);
        return mensaje;
    }
    
    //////////////////////////////////////////////////////////////////
    ////////////////////// OTROS //////////////////////////////////////
    //////////////////////////////////////////////////////////////////
    
    public int iniciar_sesion(Usuario _usuario ) throws SQLException{
        
        String user = _usuario.user;
        String contra = _usuario.password;
        
        
         //llamar procedimeinto almacenado
        CallableStatement cst = this.conn.prepareCall("{call  ValidacionUser(?,?,?)}");
        cst.setString("pUsuario", _usuario.user);
        cst.setString("pContra", _usuario.password);
        
        // Parametro de salida (mensaje)
        cst.registerOutParameter("pMensaje", java.sql.Types.VARCHAR);
        cst.execute();
        
        String mensaje = cst.getString("pMensaje");
        if(!mensaje.equals("Error")){
           
            int tipo_usr=Integer.parseInt(mensaje.substring(7,8));
            return tipo_usr;
        } else return -1;
       
    }
    
    public String editarMedicamento(Medicamento _med) throws SQLException {
        CallableStatement cst = this.conn.prepareCall("{call  EDIT_MEDICAMENTO(?,?,?,?,?,?,?,?)}");
        // Parametros de entrada
        cst.setInt("pIDMEDICAMENTO", _med.idMedicamente);
        cst.setString("pMEDICAMENTO", _med.medicamento);
        cst.setInt("pIDUNIDAD", _med.idUnidad);
        cst.setInt("pCANTIDAD", _med.cantidad);
        cst.setInt("pIDPRESENTACION", _med.idPresentacion);
        cst.setInt("pIDTIPO", _med.idTipoMed);
        cst.setString("pFECHA", _med.fechaV);
        // Parametro de salida (mensaje)
        cst.registerOutParameter("MENSAJE", java.sql.Types.VARCHAR);
        cst.execute();
        
        String mensaje = cst.getString("MENSAJE");
        return mensaje;
    }
    
    private void commit() throws SQLException{
        String query = "COMMIT";
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = preparedStatement.executeQuery();
    }
    
    public String[] getDashBoardRecepcion() throws SQLException{
        String queryPacientes = "SELECT COUNT(*) FROM PACIENTES P " +
                        " INNER JOIN CONSULTA C ON C.IDPACIENTE = P.IDPACIENTE " +
                    " WHERE TO_DATE(C.CONS_FECHA, 'dd-mm-yyyy') = TO_DATE(CURRENT_DATE, 'dd-mm-yyyy')";
        PreparedStatement preparedStatement = conn.prepareStatement(queryPacientes,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = preparedStatement.executeQuery();
        String total = "";
        while(rs.next()){
            total = rs.getString(1);
        }
        
        String queryConsEspera = "SELECT COUNT(*) FROM CONSULTA C WHERE C.ESTADO = 0";
        PreparedStatement preparedStatement2 = conn.prepareStatement(queryConsEspera);
        ResultSet rs2 = preparedStatement2.executeQuery();
        String total2 = "";
        while(rs2.next()){
            total2 = rs2.getString(1);
        }
        
        return new String[]{"0", total, total2};
    }
    
    //////////////////////////////////////////////////////////////////////
    //////////////////////////  LLENAR JTABLES, COMBOBOXs ///////////////////////////
    //////////////////////////////////////////////////////////////////////
    
    public Object[] llenarDoctores(JComboBox _combo) throws SQLException{
        DefaultComboBoxModel model;
        
        String query = "SELECT IDDOCTOR, DOC_NOMBRE || ' ' || DOC_APELLIDO DOCTOR FROM DOCTOR";
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = preparedStatement.executeQuery();
        
        rs.last();
        int numRows = rs.getRow();
        rs.beforeFirst();
        
        int[] idDoctor =  new int[numRows];
        
        model = (DefaultComboBoxModel) _combo.getModel();
        model.removeAllElements();
        int con = 0;
          while (rs.next())
           {
              idDoctor[con]= rs.getInt(1);
              model.addElement(rs.getString(2));
              con++;
           }
        
        return new Object[]{model, idDoctor};
    }
    
    public DefaultTableModel getPacientes(JTable jTable1, String _filtro, String _parametro) throws SQLException{
        Statement stmt = conn.createStatement();
        //_parametro = _parametro.toUpperCase();
        String query = "SELECT P.IDPACIENTE, P.PAC_CARNE, P.PAC_DOCUMENTO, TP.TIPOPAC, " +
                        " P.PAC_NOMBRE || ' ' || P.PAC_APELLIDO NOMBRE, C.CARRERA, " +
                        " TO_CHAR(P.PAC_FECHA_NAC, 'dd-mm-yyyy') " + 
                    "FROM PACIENTES P " +
                    " LEFT OUTER JOIN CARRERA C ON C.IDCARRERA = P.IDCARRERA " +
                    " INNER JOIN TIPO_PACIENTE TP ON TP.IDTIPOPAC = P.IDTIPOPAC ";
        switch(_filtro){
            case "Apellido":
                query += " WHERE P.PAC_APELLIDO LIKE ?";
                break;
            case "Telefono":
                query += " WHERE P.PAC_TELEFONO LIKE ? OR P.PAC_CELULAR LIKE ?";
                break;
            case "Carnet":
                query += " WHERE P.PAC_CARNE LIKE ?";
                break;
//            case "Fecha":
//                query += " WHERE P.PAC_FECHA_NAC LIKE ?";
//                break;
            default:
                query += " ";
                break;
        }
        
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setString(1,"%"+_parametro+"%");
        if(_filtro.equals("Telefono")){
            preparedStatement.setString(2,"%"+_parametro+"%");
        }
        ResultSet rs = preparedStatement.executeQuery();
        
        DefaultTableModel model;
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object Datos[]= new Object[8];
          
          while (rs.next())
           {
              for (int i=0;i<7;i++)
              {
                Datos[i]=rs.getObject(i+1);
              }
              
              model.addRow(Datos);
           }
           return model;
    }
    
    public DefaultTableModel getConsultasEnEspera( JTable jTable1) throws SQLException{
        DefaultTableModel model;
        Statement stmt = conn.createStatement() ;
        String query = "SELECT C.IDCONSULTA, TP.TIPOPAC ACTIVIDAD, P.PAC_NOMBRE || P.PAC_APELLIDO PACIENTE, " +
                "(trunc(months_between(sysdate,PAC_FECHA_NAC)/12) || ' Años ' || trunc(mod(months_between(sysdate,PAC_FECHA_NAC),12)) || ' meses') Edad, "+
                " TO_CHAR(C.CONS_FECHA, 'dd-mm-yyyy') "+
                " FROM CONSULTA C "+ 
                " INNER JOIN PACIENTES P ON P.IDPACIENTE = C.IDPACIENTE "+
                " INNER JOIN TIPO_PACIENTE TP ON TP.IDTIPOPAC = P.IDTIPOPAC "+
                " WHERE C.ESTADO =0";
        ResultSet rs = stmt.executeQuery(query);
          
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object Datos[]= new Object[5];
          
          while (rs.next())
           {
              for (int i=0;i<5;i++)
              {
                Datos[i]=rs.getObject(i+1);
              }
              
              model.addRow(Datos);
           }
           return model;
        }
    
    public DefaultTableModel getConsultasAhora( JTable jTable1) throws SQLException{
        DefaultTableModel model;
        Statement stmt = conn.createStatement() ;
        String query = "SELECT p.PAC_CARNE, tp.TIPOPAC, p.PAC_NOMBRE ||' '|| p.PAC_APELLIDO PACIENTE, " +
                "(trunc(months_between(sysdate,PAC_FECHA_NAC)/12) || ' Años ' || trunc(mod(months_between(sysdate,PAC_FECHA_NAC),12)) || ' meses') Edad, "+
                " f.FACTULTAD, TO_CHAR(cc.CONS_FECHA, 'dd-mm-yyyy'), d.DOC_NOMBRE ||' '|| d.DOC_APELLIDO , dc.MOTIVO "+
                " FROM Pacientes p "+ 
                " INNER JOIN TIPO_PACIENTE tp on tp.IDTIPOPAC= p.IDTIPOPAC "+
                " INNER JOIN CARRERA c on c.IDCARRERA= p.IDCARRERA "+
                " INNER JOIN FACULTAD f on f.IDFACULTAD= c.IDFACULTAD  "+
                " INNER JOIN CONSULTA cc on cc.IDCONSULTA= p.IDPACIENTE "+
                " INNER JOIN DOCTOR d on d.IDDOCTOR= cc.IDDOCTOR "+
                " INNER JOIN DET_CONSULTA dc on dc.IDCONSULTA= cc.IDCONSULTA "+
                " WHERE TO_DATE(cc.CONS_FECHA,'DD/MM/YY')=TO_DATE(SYSDATE,'DD/MM/YY')";
              
        ResultSet rs = stmt.executeQuery(query);
          
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object Datos[]= new Object[8];
          
          while (rs.next())
           {
              for (int i=0;i<8;i++)
              {
                Datos[i]=rs.getObject(i+1);
              }
              
              model.addRow(Datos);
           }
           return model;
        }
    
    public DefaultTableModel getMedicamentosbyCat(JTable jTable1, int _idTipo) throws SQLException{
        DefaultTableModel model;
        
        String query = "SELECT M.IDMEDICAMENTO, TP.TIPO_MED, M.MEDICAMENTO || ' ' || UM.ABREVIATURA MEDICAMENTO, P.PRESENTACION, M.CANTIDAD, TO_CHAR(M.FECHA_V, 'dd-mm-yyyy') FECHA FROM MEDICAMENTO M " +
                            " INNER JOIN UNIDAD_MED UM ON UM.IDUNIDAD_MED = M.IDUNIDAD_MED " +
                            " INNER JOIN TIPO_MEDICAMENTO TP ON TP.IDTIPO_MED = M.IDTIPO " +
                            " INNER JOIN PRESENTACION P ON P.IDPRESENTACION = M.IDPRESENTACION " +
                        " WHERE M.IDTIPO = ? AND M.ELIMINADO = 0";
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setInt(1,_idTipo);
        ResultSet rs = preparedStatement.executeQuery();
        
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object Datos[]= new Object[6];
          
          while (rs.next())
           {
              for (int i=0;i<Datos.length;i++)
              {
                Datos[i]=rs.getObject(i+1);
              }
              
              model.addRow(Datos);
           }
           return model;
    }
    
    public DefaultTableModel getMedicamentos(JTable jTable1) throws SQLException{
        DefaultTableModel model;
        
        String query = "SELECT M.IDMEDICAMENTO, TP.TIPO_MED, M.MEDICAMENTO || ' ' || UM.ABREVIATURA MEDICAMENTO, P.PRESENTACION, M.CANTIDAD, TO_CHAR(M.FECHA_V, 'dd-mm-yyyy') FECHA FROM MEDICAMENTO M " +
                            " INNER JOIN UNIDAD_MED UM ON UM.IDUNIDAD_MED = M.IDUNIDAD_MED " +
                            " INNER JOIN TIPO_MEDICAMENTO TP ON TP.IDTIPO_MED = M.IDTIPO " +
                            " INNER JOIN PRESENTACION P ON P.IDPRESENTACION = M.IDPRESENTACION " +
                        " WHERE M.ELIMINADO = 0";
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = preparedStatement.executeQuery();
        
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object Datos[]= new Object[6];
          
          while (rs.next())
           {
              for (int i=0;i<Datos.length;i++)
              {
                Datos[i]=rs.getObject(i+1);
              }
              
              model.addRow(Datos);
           }
           return model;
    }
    
    public DefaultTableModel getMedicamentobyNombre(JTable jTable1, String _med) throws SQLException{
        DefaultTableModel model;
        
        String query = "SELECT M.IDMEDICAMENTO, TP.TIPO_MED, M.MEDICAMENTO || ' ' || UM.ABREVIATURA MEDICAMENTO, P.PRESENTACION, M.CANTIDAD, TO_CHAR(M.FECHA_V, 'dd-mm-yyyy') FECHA FROM MEDICAMENTO M " +
                            " INNER JOIN UNIDAD_MED UM ON UM.IDUNIDAD_MED = M.IDUNIDAD_MED " +
                            " INNER JOIN TIPO_MEDICAMENTO TP ON TP.IDTIPO_MED = M.IDTIPO " +
                            " INNER JOIN PRESENTACION P ON P.IDPRESENTACION = M.IDPRESENTACION " +
                        " WHERE M.MEDICAMENTO LIKE ? AND M.ELIMINADO = 0";
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setString(1,"%" + _med + "%");
        ResultSet rs = preparedStatement.executeQuery();
        
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object Datos[]= new Object[6];
          
          while (rs.next())
           {
              for (int i=0;i<Datos.length;i++)
              {
                Datos[i]=rs.getObject(i+1);
              }
              
              model.addRow(Datos);
           }
           return model;
    }
    
    public DefaultTableModel getMedicamentosbyFechaV(JTable jTable1, String _fecha) throws SQLException{
        DefaultTableModel model;
        String query = "SELECT M.IDMEDICAMENTO, TP.TIPO_MED ,M.MEDICAMENTO || ' ' || UM.ABREVIATURA MEDICAMENTO, P.PRESENTACION, M.CANTIDAD, TO_CHAR(M.FECHA_V, 'dd-mm-yyyy') FECHA FROM MEDICAMENTO M " +
                            " INNER JOIN UNIDAD_MED UM ON UM.IDUNIDAD_MED = M.IDUNIDAD_MED " +
                            " INNER JOIN TIPO_MEDICAMENTO TP ON TP.IDTIPO_MED = M.IDTIPO " +
                            " INNER JOIN PRESENTACION P ON P.IDPRESENTACION = M.IDPRESENTACION " +
                        " WHERE M.FECHA_V = TO_DATE(?, 'dd-mm-yyyy') AND M.ELIMINADO = 0";
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setString(1,_fecha);
        ResultSet rs = preparedStatement.executeQuery();
        
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object Datos[]= new Object[6];
          
          while (rs.next())
           {
              for (int i=0;i<Datos.length;i++)
              {
                Datos[i]=rs.getObject(i+1);
              }
              
              model.addRow(Datos);
           }
           return model;
    }
    
    public DefaultTableModel getMedicamentobyPresentacion(JTable jTable1, int _idPres) throws SQLException{
        DefaultTableModel model;
        
        String query = "SELECT M.IDMEDICAMENTO, TP.TIPO_MED, M.MEDICAMENTO || ' ' || UM.ABREVIATURA MEDICAMENTO, P.PRESENTACION, M.CANTIDAD, TO_CHAR(M.FECHA_V, 'dd-mm-yyyy') FECHA FROM MEDICAMENTO M " +
                            " INNER JOIN UNIDAD_MED UM ON UM.IDUNIDAD_MED = M.IDUNIDAD_MED " +
                            " INNER JOIN TIPO_MEDICAMENTO TP ON TP.IDTIPO_MED = M.IDTIPO " +
                            " INNER JOIN PRESENTACION P ON P.IDPRESENTACION = M.IDPRESENTACION " +
                        " WHERE M.IDPRESENTACION = ? AND M.ELIMINADO = 0";
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setInt(1,_idPres);
        ResultSet rs = preparedStatement.executeQuery();
        
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object Datos[]= new Object[6];
          
          while (rs.next())
           {
              for (int i=0;i<Datos.length;i++)
              {
                Datos[i]=rs.getObject(i+1);
              }
              
              model.addRow(Datos);
           }
           return model;
    }
    
    public Object[] llenarCatsMedicamentos(JComboBox _combo) throws SQLException{
        DefaultComboBoxModel model;
        
        String query = "SELECT * FROM TIPO_MEDICAMENTO";
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = preparedStatement.executeQuery();
        
        rs.last();
        int numRows = rs.getRow();
        rs.beforeFirst();
        
        int[] idCats =  new int[numRows];
        
        model = (DefaultComboBoxModel) _combo.getModel();
        model.removeAllElements();
        int con = 0;
          while (rs.next())
           {
              idCats[con]= rs.getInt(1);
              model.addElement(rs.getString(2));
              con++;
           }
        
        return new Object[]{model, idCats};
    }

    public Object[] llenarPresentacionesMed(JComboBox _combo) throws SQLException{
        DefaultComboBoxModel model;
        
        String query = "SELECT * FROM PRESENTACION";
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = preparedStatement.executeQuery();
        
        rs.last();
        int numRows = rs.getRow();
        rs.beforeFirst();
        
        int[] idPres =  new int[numRows];
        
        model = (DefaultComboBoxModel) _combo.getModel();
        model.removeAllElements();
        int con = 0;
          while (rs.next())
           {
              idPres[con]= rs.getInt(1);
              model.addElement(rs.getString(2));
              con++;
           }
        
        return new Object[]{model, idPres};
    }
    
    public Object[] llenarUnidadesMed(JComboBox _combo) throws SQLException{
        DefaultComboBoxModel model;
        
        String query = "SELECT * FROM UNIDAD_MED";
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = preparedStatement.executeQuery();
        
        rs.last();
        int numRows = rs.getRow();
        rs.beforeFirst();
        
        int[] idUnidad =  new int[numRows];
        
        model = (DefaultComboBoxModel) _combo.getModel();
        model.removeAllElements();
        int con = 0;
          while (rs.next())
           {
              idUnidad[con]= rs.getInt(1);
              model.addElement(rs.getString(2));
              con++;
           }
        
        return new Object[]{model, idUnidad};
    }
    
    public Object[] Obt_Depart() throws SQLException {

        DefaultComboBoxModel ListaModelo = new DefaultComboBoxModel();
        ListaModelo.removeAllElements();

        Statement stmt = conn.createStatement();

        String query = "SELECT IDDEPARTAMENTO, DEPARTAMENTO FROM DEPARTAMENTO";
          PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
      
           ResultSet rs = preparedStatement.executeQuery();
        
        rs.last();
        int numRows = rs.getRow();
        rs.beforeFirst();
        
        if(numRows > 0){
            int[] idDep = new int[numRows];
           String[] depart = new String[numRows];
            int con = 0;
            while (rs.next()){
                
                idDep[con] = rs.getInt(1);
                depart[con] = rs.getString(2);
                con++;
            }
            return new Object[]{idDep,depart};
        }
        else{
            return null;
        }
    }
    
    public Object[] Obt_Parentesco() throws SQLException {
        Statement stmt = conn.createStatement();
        String query = "SELECT IDPARENTESCO, PARENTESCO FROM PARENTESCO";
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        
        ResultSet rs = preparedStatement.executeQuery();
        
        rs.last();
        int numRows = rs.getRow();
        rs.beforeFirst();
        
        if(numRows > 0){
            int[] idFacul = new int[numRows];
           String[] facult = new String[numRows];
            int con = 0;
            while (rs.next()){
                
                idFacul[con] = rs.getInt(1);
                facult[con] = rs.getString(2);
                con++;
            }
            return new Object[]{idFacul,facult};
        }
        else{
            return null;
        }
    }
    
        public Object[] Obt_TipoPaciente() throws SQLException {

        Statement stmt = conn.createStatement();
        String query = "SELECT IDTIPOPAC, TIPOPAC FROM TIPO_PACIENTE";
         PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        
        ResultSet rs = preparedStatement.executeQuery();
        
        rs.last();
        int numRows = rs.getRow();
        rs.beforeFirst();
        
        if(numRows > 0){
            int[] idTipoPac = new int[numRows];
           String[] tipoPac = new String[numRows];
            int con = 0;
            while (rs.next()){
                
                idTipoPac[con] = rs.getInt(1);
                tipoPac[con] = rs.getString(2);
                con++;
            }
            return new Object[]{idTipoPac,tipoPac};
        }
        else{
            return null;
        }
    }
        
        public Object[] Obt_Empleado() throws SQLException {

        Statement stmt = conn.createStatement();
        String query = "SELECT IDEMP,EMP_NOMBRE || ' ' || EMP_APELLIDO NOMBRE FROM EMPLEADO";
         PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        
        ResultSet rs = preparedStatement.executeQuery();
        
        rs.last();
        int numRows = rs.getRow();
        rs.beforeFirst();
        
        if(numRows > 0){
            int[] idEmp = new int[numRows];
           String[] Emp = new String[numRows];
            int con = 0;
            while (rs.next()){
                
                idEmp[con] = rs.getInt(1);
                Emp[con] = rs.getString(2);
                con++;
            }
            return new Object[]{idEmp,Emp};
        }
        else{
            return null;
        }
    }
        
         public Object[] Obt_Usuario() throws SQLException {
          //DOCTOR AGG
        Statement stmt = conn.createStatement();
        String query = "SELECT IDUSUARIO,USUARIO FROM USUARIO";
         PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        
        ResultSet rs = preparedStatement.executeQuery();
        
        rs.last();
        int numRows = rs.getRow();
        rs.beforeFirst();
        
        if(numRows > 0){
            int[] idUsr = new int[numRows];
           String[] Usr = new String[numRows];
            int con = 0;
            while (rs.next()){
                
                idUsr[con] = rs.getInt(1);
                Usr[con] = rs.getString(2);
                con++;
            }
            return new Object[]{idUsr,Usr};
        }
        else{
            return null;
        }
    }
         
            public Object[] Obt_Especialidad() throws SQLException {
       //DOCTOR AGG
        Statement stmt = conn.createStatement();
        String query = "SELECT IDESPECIALIDAD,ESPECIALIDAD FROM ESPECIALIDAD";
         PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        
        ResultSet rs = preparedStatement.executeQuery();
        
        rs.last();
        int numRows = rs.getRow();
        rs.beforeFirst();
        
        if(numRows > 0){
            int[] idEsp = new int[numRows];
           String[] Esp = new String[numRows];
            int con = 0;
            while (rs.next()){
                
                idEsp[con] = rs.getInt(1);
                Esp[con] = rs.getString(2);
                con++;
            }
            return new Object[]{idEsp,Esp};
        }
        else{
            return null;
        }
          
 }
            
        public DefaultTableModel getDocs( JTable jTable1) throws SQLException{
              
         //DOCTOR
        DefaultTableModel model;
        Statement stmt = conn.createStatement() ;
        String query = "SELECT d.IDDOCTOR, d.DOC_NOMBRE || ' ' || d.DOC_APELLIDO NOMBRE, e.ESPECIALIDAD, d.DOC_SEXO, d.DOC_DOCUMENTO, d.DOC_TEL, " +
                   "(trunc(months_between(sysdate,d.DOC_FECHA_NAC)/12) || ' Años ' || trunc(mod(months_between(sysdate,d.DOC_FECHA_NAC),12)) || ' meses') Edad, "+
                    "u.USUARIO"+
                   " FROM DOCTOR d " +
                   " INNER JOIN ESPECIALIDAD e on d.IDESPECIALIDAD= e.IDESPECIALIDAD " +
                   " INNER JOIN USUARIO u on d.IDUSUARIO= u.IDUSUARIO " +
                   " WHERE d.ELIMINADO= 0";
              
        ResultSet rs = stmt.executeQuery(query);
          
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object Datos[]= new Object[8];
          
          while (rs.next())
           {
              for (int i=0;i<8;i++)
              {
                Datos[i]=rs.getObject(i+1);
              }
              
              model.addRow(Datos);
           }
           return model;
        }
        
         public DefaultTableModel getUsuarios( JTable jTable1) throws SQLException{
        DefaultTableModel model;
        Statement stmt = conn.createStatement() ;
        String query = "SELECT u.IDUSUARIO, u.USUARIO,u.USR_CONTRA,u.USR_TIPO, emp.EMP_NOMBRE || ' ' || emp.EMP_APELLIDO NOMBRE " +
                   " FROM USUARIO u " +
                   " INNER JOIN EMPLEADO emp on u.IDEMP= emp.IDEMP " +
                   " WHERE u.ELIMINADO= 0";
              
        ResultSet rs = stmt.executeQuery(query);
          
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object Datos[]= new Object[5];
          
          while (rs.next())
           {
              for (int i=0;i<5;i++)
              {
                Datos[i]=rs.getObject(i+1);
              }
              
              model.addRow(Datos);
           }
           return model;
        }
     
    public DefaultComboBoxModel Obt_TipoPac() throws SQLException {

        DefaultComboBoxModel ListaModelo = new DefaultComboBoxModel();
        ListaModelo.removeAllElements();
        

        Statement stmt = conn.createStatement();

        String query = "SELECT IDTIPOPAC, TIPOPAC FROM TIPO_PACIENTE";
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            ListaModelo.addElement(rs.getString("TIPOPAC"));

        }
        rs.close();

        return ListaModelo;
    }
     
    public Object[] llenarFacultad() throws SQLException{
        String query = "SELECT IDFACULTAD, FACTULTAD FROM FACULTAD";
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        
        ResultSet rs = preparedStatement.executeQuery();
        
        rs.last();
        int numRows = rs.getRow();
        rs.beforeFirst();
        
        if(numRows > 0){
            int[] idFacul = new int[numRows];
           String[] facult = new String[numRows];
            int con = 0;
            while (rs.next()){
                
                idFacul[con] = rs.getInt(1);
                facult[con] = rs.getString(2);
                con++;
            }
            return new Object[]{idFacul,facult};
        }
        else{
            return null;
        }
      }
      
    public Object[] llenarCarreras(int _idFac) throws SQLException{
        String query = "SELECT IDCARRERA, IDFACULTAD, CARRERA FROM CARRERA WHERE IDFACULTAD = ?";
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setInt(1,_idFac);
        ResultSet rs = preparedStatement.executeQuery();
        
        rs.last();
        int numRows = rs.getRow();
        rs.beforeFirst();
        
        if(numRows > 0){
            int[] idCarrera = new int[numRows];
            int[] idFacul = new int[numRows];
            String[] carr = new String[numRows];
            int con = 0;
            while (rs.next()){
                idCarrera[con] = rs.getInt(1);
                idFacul[con] = rs.getInt(2);
                carr[con] = rs.getString(3);
                con++;
            }
            return new Object[]{idCarrera,idFacul, carr};
        }
        else{
            return null;
        }
  
      }
    
    public DefaultTableModel getExpedienteRootByCarnet(JTable jTable1, String _idCarnet) throws SQLException{
        DefaultTableModel model;
        
        String query = "SELECT " +
                        "    C.IDCONSULTA, " +
                        "    CASE P.PAC_CARNE " +
                        "        WHEN NULL THEN P.PAC_DOCUMENTO " +
                        "        ELSE P.PAC_CARNE END CARENTDOC, " +
                        "    P.PAC_NOMBRE || ' ' || P.PAC_APELLIDO NOMBRE, " +
                        "    TO_CHAR(C.CONS_FECHA, 'dd-mm-yyyy') " +
                        "    FROM  CONSULTA C " +
                        " INNER JOIN PACIENTES P ON P.IDPACIENTE = C.IDPACIENTE " +
                        " WHERE P.PAC_CARNE LIKE ? OR P.PAC_DOCUMENTO LIKE ? AND C.ESTADO != 0";
                
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setString(1, "%" + _idCarnet + "%");
        preparedStatement.setString(2, "%" + _idCarnet + "%");
        ResultSet rs = preparedStatement.executeQuery();
        
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object Datos[]= new Object[4];
          
          while (rs.next())
           {
              for (int i=0;i<Datos.length;i++)
              {
                Datos[i]=rs.getObject(i+1);
              }
              
              model.addRow(Datos);
           }
           return model;
    }
    
    public DefaultTableModel getExpedienteRootByID(JTable jTable1, int _idPac) throws SQLException{
        DefaultTableModel model;
        
        String query = "SELECT " +
                        "    C.IDCONSULTA, " +
                        "    CASE P.PAC_CARNE " +
                        "        WHEN NULL THEN P.PAC_DOCUMENTO " +
                        "        ELSE P.PAC_CARNE END CARENTDOC, " +
                        "    P.PAC_NOMBRE || ' ' || P.PAC_APELLIDO NOMBRE, " +
                        "    TO_CHAR(C.CONS_FECHA, 'dd-mm-yyyy') " +
                        "    FROM  CONSULTA C " +
                        " INNER JOIN PACIENTES P ON P.IDPACIENTE = C.IDPACIENTE " +
                        " WHERE P.IDPACIENTE = ? AND C.ESTADO != 0";
                
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setInt(1, _idPac);
        ResultSet rs = preparedStatement.executeQuery();
        
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object Datos[]= new Object[4];
          
          while (rs.next())
           {
              for (int i=0;i<Datos.length;i++)
              {
                Datos[i]=rs.getObject(i+1);
              }
              
              model.addRow(Datos);
           }
           return model;
    }
    
    public DefaultTableModel getExpedienteRootByApellidos(JTable jTable1, String _apellido) throws SQLException{
        DefaultTableModel model;
        
        String query = "SELECT " +
                        "    C.IDCONSULTA, " +
                        "    CASE P.PAC_CARNE " +
                        "        WHEN NULL THEN P.PAC_DOCUMENTO " +
                        "        ELSE P.PAC_CARNE END CARENTDOC, " +
                        "    P.PAC_NOMBRE || ' ' || P.PAC_APELLIDO NOMBRE, " +
                        "    TO_CHAR(C.CONS_FECHA, 'dd-mm-yyyy') " +
                        "    FROM  CONSULTA C " +
                        " INNER JOIN PACIENTES P ON P.IDPACIENTE = C.IDPACIENTE " +
                        " WHERE P.PAC_APELLIDO LIKE ? AND C.ESTADO != 0";
                
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setString(1, "%" +_apellido + "%");
        ResultSet rs = preparedStatement.executeQuery();
        
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object Datos[]= new Object[4];
          
          while (rs.next())
           {
              for (int i=0;i<Datos.length;i++)
              {
                Datos[i]=rs.getObject(i+1);
              }
              
              model.addRow(Datos);
           }
           return model;
    }
    
    public DefaultTableModel getExpedienteRootByNombres(JTable jTable1, String _nombre) throws SQLException{
        DefaultTableModel model;
        
        String query = "SELECT " +
                        "    C.IDCONSULTA, " +
                        "    CASE P.PAC_CARNE " +
                        "        WHEN NULL THEN P.PAC_DOCUMENTO " +
                        "        ELSE P.PAC_CARNE END CARENTDOC, " +
                        "    P.PAC_NOMBRE || ' ' || P.PAC_APELLIDO NOMBRE, " +
                        "    TO_CHAR(C.CONS_FECHA, 'dd-mm-yyyy') " +
                        "    FROM  CONSULTA C " +
                        " INNER JOIN PACIENTES P ON P.IDPACIENTE = C.IDPACIENTE " +
                        " WHERE P.PAC_NOMBRE LIKE ? AND C.ESTADO != 0";
                
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setString(1, "%" +_nombre + "%");
        ResultSet rs = preparedStatement.executeQuery();
        
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object Datos[]= new Object[4];
          
          while (rs.next())
           {
              for (int i=0;i<Datos.length;i++)
              {
                Datos[i]=rs.getObject(i+1);
              }
              
              model.addRow(Datos);
           }
           return model;
    }
    
    public String aggPaciente(Paciente pac) throws SQLException{
        CallableStatement cst = this.conn.prepareCall("{call  AGREGARPACIENTE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
        // Parametros de entrada
        cst.setString("pdocumento", pac.documento);
        cst.setInt("ptipoPac", pac.tipoPaciente);
        cst.setString("pnombre", pac.nombre);
        cst.setString("papellido", pac.apellido);
         cst.setString("psexo", pac.sexo);
         cst.setString("pfecha", pac.FechaNac);
         cst.setString("ptelefono", pac.telefono);
         cst.setString("pcelular", pac.celular);
         cst.setInt("pdepartamento", Integer.parseInt(pac.departamento));
         cst.setString("pdireccion", pac.direccion);
         cst.setInt("pzona", pac.zona);
         cst.setString("pemergencia", pac.caso_emergencia);
         cst.setString("ptelEmergencia", pac.tel_emergencia);
         cst.setInt("pparentezco", Integer.parseInt(pac.parentezco));
         cst.setString("pCarnet", pac.carne);
         cst.setInt("pcarrera",pac.carreraP);
         
         
        // Parametro de salida (mensaje)
        cst.registerOutParameter("pMsj", java.sql.Types.VARCHAR);
        cst.execute();
        
        String mensaje = cst.getString("pMsj");
        
        return mensaje;
    }
    
    public DefaultTableModel getConsultasByID(JTable jTable1, int _idPaciente) throws SQLException{
        DefaultTableModel model;
        
        String query = "SELECT cc.IDCONSULTA, p.PAC_CARNE, tp.TIPOPAC, p.PAC_NOMBRE || ' ' || p.PAC_APELLIDO, " +
                "(trunc(months_between(sysdate,PAC_FECHA_NAC)/12) || ' Años ' || trunc(mod(months_between(sysdate,PAC_FECHA_NAC),12)) || ' meses') Edad, "+
                " f.FACTULTAD,c.CARRERA, p.PAC_TELEFONO, cc.CONS_FECHA, d.DOC_NOMBRE ||' '|| d.DOC_APELLIDO , dc.MOTIVO "+
                " FROM Pacientes p "+ 
                " INNER JOIN TIPO_PACIENTE tp on tp.IDTIPOPAC= p.IDTIPOPAC "+
                " LEFT OUTER JOIN CARRERA c on c.IDCARRERA= p.IDCARRERA "+
                " LEFT OUTER JOIN FACULTAD f on f.IDFACULTAD= c.IDFACULTAD  "+
                " INNER JOIN CONSULTA cc on cc.IDPACIENTE= p.IDPACIENTE "+
                " INNER JOIN DOCTOR d on d.IDDOCTOR= cc.IDDOCTOR "+
                " INNER JOIN DET_CONSULTA dc on dc.IDCONSULTA= cc.IDCONSULTA "+
                " WHERE cc.IDPACIENTE = ?";
                
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setInt(1,_idPaciente);
        ResultSet rs = preparedStatement.executeQuery();
        
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object Datos[]= new Object[11];
          
          while (rs.next())
           {
              for (int i=0;i<Datos.length;i++)
              {
                Datos[i]=rs.getObject(i+1);
              }
              
              model.addRow(Datos);
           }
           return model;
    }
    
    public DefaultTableModel getHistorialConFacult(JTable jTable1, int _idFac) throws SQLException{
        DefaultTableModel model;
        
        String query = "SELECT cc.IDCONSULTA, p.PAC_CARNE, tp.TIPOPAC, p.PAC_NOMBRE || ' ' || p.PAC_APELLIDO, " +
                "(trunc(months_between(sysdate,PAC_FECHA_NAC)/12) || ' Años ' || trunc(mod(months_between(sysdate,PAC_FECHA_NAC),12)) || ' meses') Edad, "+
                " f.FACTULTAD,c.CARRERA, p.PAC_TELEFONO, cc.CONS_FECHA, d.DOC_NOMBRE ||' '|| d.DOC_APELLIDO , dc.MOTIVO "+
                " FROM Pacientes p "+ 
                " INNER JOIN TIPO_PACIENTE tp on tp.IDTIPOPAC= p.IDTIPOPAC "+
                " LEFT OUTER JOIN CARRERA c on c.IDCARRERA= p.IDCARRERA "+
                " LEFT OUTER JOIN FACULTAD f on f.IDFACULTAD= c.IDFACULTAD  "+
                " INNER JOIN CONSULTA cc on cc.IDPACIENTE= p.IDPACIENTE "+
                " INNER JOIN DOCTOR d on d.IDDOCTOR= cc.IDDOCTOR "+
                " INNER JOIN DET_CONSULTA dc on dc.IDCONSULTA= cc.IDCONSULTA "+
                " WHERE f.IDFACULTAD = ?";
                
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setInt(1,_idFac);
        ResultSet rs = preparedStatement.executeQuery();
        
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object Datos[]= new Object[11];
          
          while (rs.next())
           {
              for (int i=0;i<Datos.length;i++)
              {
                Datos[i]=rs.getObject(i+1);
              }
              
              model.addRow(Datos);
           }
           return model;
    }
       
       public DefaultTableModel getHistorialConCarnet(JTable jTable1, String _idCarnet) throws SQLException{
        DefaultTableModel model;
        
        String query = "SELECT cc.IDCONSULTA, p.PAC_CARNE, tp.TIPOPAC, p.PAC_NOMBRE || ' ' || p.PAC_APELLIDO, " +
                "(trunc(months_between(sysdate,PAC_FECHA_NAC)/12) || ' Años ' || trunc(mod(months_between(sysdate,PAC_FECHA_NAC),12)) || ' meses') Edad, "+
                " f.FACTULTAD,c.CARRERA, p.PAC_TELEFONO, cc.CONS_FECHA, d.DOC_NOMBRE ||' '|| d.DOC_APELLIDO , dc.MOTIVO "+
                " FROM Pacientes p "+ 
                " INNER JOIN TIPO_PACIENTE tp on tp.IDTIPOPAC= p.IDTIPOPAC "+
                " LEFT OUTER JOIN CARRERA c on c.IDCARRERA= p.IDCARRERA "+
                " LEFT OUTER JOIN FACULTAD f on f.IDFACULTAD= c.IDFACULTAD  "+
                " INNER JOIN CONSULTA cc on cc.IDPACIENTE= p.IDPACIENTE "+
                " INNER JOIN DOCTOR d on d.IDDOCTOR= cc.IDDOCTOR "+
                " INNER JOIN DET_CONSULTA dc on dc.IDCONSULTA= cc.IDCONSULTA "+
                " WHERE p.PAC_CARNE LIKE ?";
                
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setString(1,_idCarnet);
        ResultSet rs = preparedStatement.executeQuery();
        
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object Datos[]= new Object[11];
          
          while (rs.next())
           {
              for (int i=0;i<Datos.length;i++)
              {
                Datos[i]=rs.getObject(i+1);
              }
              
              model.addRow(Datos);
           }
           return model;
    }
       
       public DefaultTableModel getHistorialConCarrera(JTable jTable1, int _idCarrera) throws SQLException{
        DefaultTableModel model;
        
        String query = "SELECT cc.IDCONSULTA, p.PAC_CARNE, tp.TIPOPAC, p.PAC_NOMBRE || ' ' || p.PAC_APELLIDO, " +
                "(trunc(months_between(sysdate,PAC_FECHA_NAC)/12) || ' Años ' || trunc(mod(months_between(sysdate,PAC_FECHA_NAC),12)) || ' meses') Edad, "+
                " f.FACTULTAD,c.CARRERA, p.PAC_TELEFONO, cc.CONS_FECHA, d.DOC_NOMBRE ||' '|| d.DOC_APELLIDO , dc.MOTIVO "+
                " FROM Pacientes p "+ 
                " INNER JOIN TIPO_PACIENTE tp on tp.IDTIPOPAC= p.IDTIPOPAC "+
                " LEFT OUTER JOIN CARRERA c on c.IDCARRERA= p.IDCARRERA "+
                " LEFT OUTER JOIN FACULTAD f on f.IDFACULTAD= c.IDFACULTAD  "+
                " INNER JOIN CONSULTA cc on cc.IDPACIENTE= p.IDPACIENTE "+
                " INNER JOIN DOCTOR d on d.IDDOCTOR= cc.IDDOCTOR "+
                " INNER JOIN DET_CONSULTA dc on dc.IDCONSULTA= cc.IDCONSULTA "+
                " WHERE c.IDCARRERA  = ? ";
                
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setInt(1,_idCarrera);
        ResultSet rs = preparedStatement.executeQuery();
        
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object Datos[]= new Object[11];
          
          while (rs.next())
           {
              for (int i=0;i<Datos.length;i++)
              {
                Datos[i]=rs.getObject(i+1);
              }
              
              model.addRow(Datos);
           }
           return model;
    }
       
       public DefaultTableModel getHistorialConActividad(JTable jTable1, int _idPac) throws SQLException{
        DefaultTableModel model;
        
        String query = "SELECT cc.IDCONSULTA, p.PAC_CARNE, tp.TIPOPAC, p.PAC_NOMBRE || ' ' || p.PAC_APELLIDO, " +
                "(trunc(months_between(sysdate,PAC_FECHA_NAC)/12) || ' Años ' || trunc(mod(months_between(sysdate,PAC_FECHA_NAC),12)) || ' meses') Edad, "+
                " f.FACTULTAD,c.CARRERA, p.PAC_TELEFONO, cc.CONS_FECHA, d.DOC_NOMBRE ||' '|| d.DOC_APELLIDO , dc.MOTIVO "+
                " FROM Pacientes p "+ 
                " INNER JOIN TIPO_PACIENTE tp on tp.IDTIPOPAC= p.IDTIPOPAC "+
                " LEFT OUTER JOIN CARRERA c on c.IDCARRERA= p.IDCARRERA "+
                " LEFT OUTER JOIN FACULTAD f on f.IDFACULTAD= c.IDFACULTAD  "+
                " INNER JOIN CONSULTA cc on cc.IDPACIENTE= p.IDPACIENTE "+
                " INNER JOIN DOCTOR d on d.IDDOCTOR= cc.IDDOCTOR "+
                " INNER JOIN DET_CONSULTA dc on dc.IDCONSULTA= cc.IDCONSULTA "+
                " WHERE p.IDTIPOPAC  = ? ";
                
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setInt(1,_idPac);
        ResultSet rs = preparedStatement.executeQuery();
        
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object Datos[]= new Object[11];
          
          while (rs.next())
           {
              for (int i=0;i<Datos.length;i++)
              {
                Datos[i]=rs.getObject(i+1);
              }
              
              model.addRow(Datos);
           }
           return model;
    }
       
        public DefaultTableModel getHistorialConNombre(JTable jTable1, String _Pac) throws SQLException{
        DefaultTableModel model;
        
        String query = "SELECT cc.IDCONSULTA, p.PAC_CARNE, tp.TIPOPAC, p.PAC_NOMBRE || ' ' || p.PAC_APELLIDO, " +
                "(trunc(months_between(sysdate,PAC_FECHA_NAC)/12) || ' Años ' || trunc(mod(months_between(sysdate,PAC_FECHA_NAC),12)) || ' meses') Edad, "+
                " f.FACTULTAD,c.CARRERA, p.PAC_TELEFONO, cc.CONS_FECHA, d.DOC_NOMBRE ||' '|| d.DOC_APELLIDO , dc.MOTIVO "+
                " FROM Pacientes p "+ 
                " INNER JOIN TIPO_PACIENTE tp on tp.IDTIPOPAC= p.IDTIPOPAC "+
                " LEFT OUTER JOIN CARRERA c on c.IDCARRERA= p.IDCARRERA "+
                " LEFT OUTER JOIN FACULTAD f on f.IDFACULTAD= c.IDFACULTAD  "+
                " INNER JOIN CONSULTA cc on cc.IDPACIENTE= p.IDPACIENTE "+
                " INNER JOIN DOCTOR d on d.IDDOCTOR= cc.IDDOCTOR "+
                " INNER JOIN DET_CONSULTA dc on dc.IDCONSULTA= cc.IDCONSULTA "+
                " WHERE p.PAC_NOMBRE  LIKE  ? ";
                
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setString(1,_Pac);
        ResultSet rs = preparedStatement.executeQuery();
        
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object Datos[]= new Object[11];
          
          while (rs.next())
           {
              for (int i=0;i<Datos.length;i++)
              {
                Datos[i]=rs.getObject(i+1);
              }
              
              model.addRow(Datos);
           }
           return model;
    }
        
    public DefaultTableModel getHistorialConApellido(JTable jTable1, String _Pac) throws SQLException{
        DefaultTableModel model;
        
        String query = "SELECT cc.IDCONSULTA, p.PAC_CARNE, tp.TIPOPAC, p.PAC_NOMBRE || ' ' || p.PAC_APELLIDO, " +
                "(trunc(months_between(sysdate,PAC_FECHA_NAC)/12) || ' Años ' || trunc(mod(months_between(sysdate,PAC_FECHA_NAC),12)) || ' meses') Edad, "+
                " f.FACTULTAD,c.CARRERA, p.PAC_TELEFONO, cc.CONS_FECHA, d.DOC_NOMBRE ||' '|| d.DOC_APELLIDO , dc.MOTIVO "+
                " FROM Pacientes p "+ 
                " INNER JOIN TIPO_PACIENTE tp on tp.IDTIPOPAC= p.IDTIPOPAC "+
                " LEFT OUTER JOIN CARRERA c on c.IDCARRERA= p.IDCARRERA "+
                " LEFT OUTER JOIN FACULTAD f on f.IDFACULTAD= c.IDFACULTAD  "+
                " INNER JOIN CONSULTA cc on cc.IDPACIENTE= p.IDPACIENTE "+
                " INNER JOIN DOCTOR d on d.IDDOCTOR= cc.IDDOCTOR "+
                " INNER JOIN DET_CONSULTA dc on dc.IDCONSULTA= cc.IDCONSULTA "+
                " WHERE p.PAC_APELLIDO  LIKE  ? ";
                
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setString(1,_Pac);
        ResultSet rs = preparedStatement.executeQuery();
        
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object Datos[]= new Object[11];
          
          while (rs.next())
           {
              for (int i=0;i<Datos.length;i++)
              {
                Datos[i]=rs.getObject(i+1);
              }
              
              model.addRow(Datos);
           }
           return model;
    }
         
    public DefaultTableModel getHistorialConFecha(JTable jTable1, String _Fecha) throws SQLException{
        DefaultTableModel model;
        
        String query = "SELECT cc.IDCONSULTA, p.PAC_CARNE, tp.TIPOPAC, p.PAC_NOMBRE || ' ' || p.PAC_APELLIDO, " +
                "(trunc(months_between(sysdate,PAC_FECHA_NAC)/12) || ' Años ' || trunc(mod(months_between(sysdate,PAC_FECHA_NAC),12)) || ' meses') Edad, "+
                " f.FACTULTAD,c.CARRERA, p.PAC_TELEFONO, cc.CONS_FECHA, d.DOC_NOMBRE ||' '|| d.DOC_APELLIDO , dc.MOTIVO "+
                " FROM Pacientes p "+ 
                " INNER JOIN TIPO_PACIENTE tp on tp.IDTIPOPAC= p.IDTIPOPAC "+
                " LEFT OUTER JOIN CARRERA c on c.IDCARRERA= p.IDCARRERA "+
                " LEFT OUTER JOIN FACULTAD f on f.IDFACULTAD= c.IDFACULTAD  "+
                " INNER JOIN CONSULTA cc on cc.IDPACIENTE= p.IDPACIENTE "+
                " INNER JOIN DOCTOR d on d.IDDOCTOR= cc.IDDOCTOR "+
                " INNER JOIN DET_CONSULTA dc on dc.IDCONSULTA= cc.IDCONSULTA "+
                " WHERE TO_CHAR(cc.CONS_FECHA , 'dd/mm/yy') = ? ";
                
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setString(1,_Fecha);
        ResultSet rs = preparedStatement.executeQuery();
        
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object Datos[]= new Object[11];
          
          while (rs.next())
           {
              for (int i=0;i<Datos.length;i++)
              {
                Datos[i]=rs.getObject(i+1);
              }
              
              model.addRow(Datos);
           }
           return model;
    }
          
    public DefaultTableModel getHistorialConEdad(JTable jTable1, String _Fecha) throws SQLException{
        DefaultTableModel model;
        
        String query = "SELECT cc.IDCONSULTA, p.PAC_CARNE, tp.TIPOPAC, p.PAC_NOMBRE || ' ' || p.PAC_APELLIDO, " +
                "(trunc(months_between(sysdate,PAC_FECHA_NAC)/12) || ' Años ' || trunc(mod(months_between(sysdate,PAC_FECHA_NAC),12)) || ' meses') Edad, "+
                " f.FACTULTAD,c.CARRERA, p.PAC_TELEFONO, cc.CONS_FECHA, d.DOC_NOMBRE ||' '|| d.DOC_APELLIDO , dc.MOTIVO "+
                " FROM Pacientes p "+ 
                " INNER JOIN TIPO_PACIENTE tp on tp.IDTIPOPAC= p.IDTIPOPAC "+
                " LEFT OUTER JOIN CARRERA c on c.IDCARRERA= p.IDCARRERA "+
                " LEFT OUTER JOIN FACULTAD f on f.IDFACULTAD= c.IDFACULTAD  "+
                " INNER JOIN CONSULTA cc on cc.IDPACIENTE= p.IDPACIENTE "+
                " INNER JOIN DOCTOR d on d.IDDOCTOR= cc.IDDOCTOR "+
                " INNER JOIN DET_CONSULTA dc on dc.IDCONSULTA= cc.IDCONSULTA "+
                " WHERE (EXTRACT(YEAR FROM SYSDATE) -EXTRACT(YEAR FROM p.PAC_FECHA_NAC)) = ? ";
                
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setString(1,_Fecha);
        ResultSet rs = preparedStatement.executeQuery();
        
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object Datos[]= new Object[11];
          
          while (rs.next())
           {
              for (int i=0;i<Datos.length;i++)
              {
                Datos[i]=rs.getObject(i+1);
              }
              
              model.addRow(Datos);
           }
           return model;
    }
           
           
           
           
  public DefaultTableModel getFacultades(JTable jTable1) throws SQLException{
        DefaultTableModel model;
        
        String query = "SELECT * FROM facultad ";
                
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = preparedStatement.executeQuery();
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object Datos[]= new Object[2];
          
          while (rs.next())
           {
              for (int i=0;i<Datos.length;i++)
              {
                Datos[i]=rs.getObject(i+1);
              }
              
              model.addRow(Datos);
           }
           return model;
    }         
           
    public DefaultTableModel getCatMedicamento(JTable jTable1) throws SQLException{
        DefaultTableModel model;
        
        String query = "SELECT * FROM tipo_medicamento ";
                
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = preparedStatement.executeQuery();
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object Datos[]= new Object[2];
          
          while (rs.next())
           {
              for (int i=0;i<Datos.length;i++)
              {
                Datos[i]=rs.getObject(i+1);
              }
              
              model.addRow(Datos);
           }
           return model;
    }         
    
    public DefaultTableModel getCarreras(JTable jTable1) throws SQLException{
        DefaultTableModel model;
        
        String query = "SELECT Carrera.idCarrera,Carrera,Factultad FROM carrera inner join facultad on facultad.idfacultad=carrera.idfacultad";
                
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = preparedStatement.executeQuery();
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object Datos[]= new Object[3];
          
          while (rs.next())
           {
              for (int i=0;i<Datos.length;i++)
              {
                Datos[i]=rs.getObject(i+1);
              }
              
              model.addRow(Datos);
           }
           return model;
    }         
    
    public DefaultTableModel getEspecialidad(JTable jTable1) throws SQLException{
        DefaultTableModel model;
        
        String query = "SELECT * FROM especialidad";
                
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = preparedStatement.executeQuery();
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object Datos[]= new Object[2];
          
          while (rs.next())
           {
              for (int i=0;i<Datos.length;i++)
              {
                Datos[i]=rs.getObject(i+1);
              }
              
              model.addRow(Datos);
           }
           return model;
    }
    
    
    public DefaultTableModel getUnidMedida(JTable jTable1) throws SQLException{
        DefaultTableModel model;
        
        String query = "SELECT * FROM unidad_Med";
                
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = preparedStatement.executeQuery();
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object Datos[]= new Object[3];
          
          while (rs.next())
           {
              for (int i=0;i<Datos.length;i++)
              {
                Datos[i]=rs.getObject(i+1);
              }
              
              model.addRow(Datos);
           }
           return model;
    }
    
    
    public DefaultTableModel getActividad(JTable jTable1) throws SQLException{
        DefaultTableModel model;
        
        String query = "SELECT * FROM tipo_paciente";
                
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = preparedStatement.executeQuery();
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object Datos[]= new Object[2];
          
          while (rs.next())
           {
              for (int i=0;i<Datos.length;i++)
              {
                Datos[i]=rs.getObject(i+1);
              }
              
              model.addRow(Datos);
           }
           return model;
    }
    
    
    
}
