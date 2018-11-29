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
            String url="jdbc:mysql://localhost:3306/clinica_unicaes";
            conn= DriverManager.getConnection(url,"root","jr2020");
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
    
    public int ContarConsultasByDoctor(int _idDoctor) throws SQLException{
        
        String query = "select count(idDoctor) from consulta WHERE estado = 1 and idDoctor = ?";
                
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setInt(1, _idDoctor);
        ResultSet rs = preparedStatement.executeQuery();
        int ncons=0;
          while (rs.next())
           {
              ncons=rs.getInt(1);
             
           }
           return ncons;
    }
    
    public int ContarConsultasEspera() throws SQLException{
        String query = "select count(idConsulta) from consulta where estado=0";
                
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = preparedStatement.executeQuery();
        int ncons=0;
        while (rs.next())
         {
            ncons=rs.getInt(1);

         }
         return ncons;
    }
    
    public Medicamento getMedicamentobyID(int _idMed) throws SQLException{
        DefaultTableModel model;
        
        String query = "SELECT M.IDMEDICAMENTO, TP.TIPO_MED, M.MEDICAMENTO, UM.UNIDAD, P.PRESENTACION, M.CANTIDAD, DATE_FORMAT(M.FECHA_V,'%d-%m-%Y') FECHA FROM MEDICAMENTO M " +
"INNER JOIN UNIDAD_MED UM ON UM.IDUNIDAD_MED = M.IDUNIDAD_MED " +
"INNER JOIN TIPO_MEDICAMENTO TP ON TP.IDTIPO_MED = M.IDTIPO " +
"INNER JOIN PRESENTACION P ON P.IDPRESENTACION = M.IDPRESENTACION " +
"WHERE M.IDMEDICAMENTO = ? AND M.ELIMINADO = 0";
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
                       "CONCAT(IFNULL(P.PAC_NOMBRE, '') , ' ' , IFNULL(P.PAC_APELLIDO, '')) NOMBRE, P.PAC_SEXO, " +
                       "P.PAC_CELULAR, P.PAC_TELEFONO, " +
                       "(concat(ifnull(truncate(TIMESTAMPDIFF(month,PAC_FECHA_NAC,curdate())/12, 0), '') , ' Años ' , " +
                       "ifnull(truncate(mod(TIMESTAMPDIFF(month,PAC_FECHA_NAC,curdate()),12), 0), '') , ' meses')) Edad, " +
                       "P.PAC_DIRECCION, D.DEPARTAMENTO,  P.PAC_RESPONSABLE, P.PAC_RES_TEL, PA.PARENTESCO " +
                       "FROM PACIENTES P " +
                       "LEFT OUTER JOIN CARRERA C ON C.IDCARRERA = P.IDCARRERA " +
                       "LEFT OUTER JOIN FACULTAD F ON F.IDFACULTAD = C.IDFACULTAD " +
                       "INNER JOIN TIPO_PACIENTE TP ON TP.IDTIPOPAC = P.IDTIPOPAC " +
                       "INNER JOIN PARENTESCO PA ON PA.IDPARENTESCO = P.IDPARENTESCO " +
                       "INNER JOIN DEPARTAMENTO D ON D.IDDEPARTAMENTO = P.IDDEPARTAMENTO " +
                       "WHERE P.IDPACIENTE = ?";
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
        String query = "SELECT C.IDCONSULTA, C.IDPACIENTE, C.IDDOCTOR, DATE_FORMAT(C.CONS_FECHA,'%d-%m-%Y'), C.IDUSUARIO, DC.EF_CABEZA," +
                       "DC.EF_ABDOMEN, DC.EF_CUELLO, DC.EF_TORAX, DC.EF_EXTREMIDADES, DC.FREC_CAR, DC.PRES_ART, " +
                       "DC.PESO, DC.TALLA, DC.PULSO, DC.TEMP, DC.MOTIVO, DC.RECOMENDACION, DC.TRATAMIENTO FROM CONSULTA C " +
                       "LEFT OUTER JOIN DET_CONSULTA DC ON DC.IDCONSULTA = C.IDCONSULTA " +
                       "WHERE C.IDCONSULTA = ?";
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
            consulta.recomendaciones = rs.getString(18);
            consulta.tratamiento = rs.getString(19);
            
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
                        " INNER JOIN DET_RECETA D ON D.IDRECETA = R.IDRECETA " +
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
    
     public String aggUsuario(Usuario _usuario, String _tabla, int _idOwner) throws SQLException{
        
        CallableStatement cst = this.conn.prepareCall("call  AGG_USUARIO(?,?,?,?,?,?)");
    
        cst.setString("PUSUARIO", _usuario.user);
        cst.setString("PCONTRA", _usuario.password1);
        cst.setInt("PTIPO", _usuario.tipo_usr);
        cst.setString("PTABLA",_tabla);
        cst.setInt("PIDOWNER",_idOwner);
           
        cst.registerOutParameter("MENSAJE", java.sql.Types.VARCHAR);
        cst.execute();
        
        String mensaje = cst.getString("MENSAJE");
        System.out.println(mensaje);
        return mensaje;
    }
     
      public String aggDoctor(Doctor _doctor) throws SQLException{
        
        CallableStatement cst = this.conn.prepareCall("call  AGREGARDOCTOR(?,?,?,?,?,?,?,?)");
        
    
        cst.setString("PNOMBRE", _doctor.nombre);
        cst.setString("PAPELLIDO", _doctor.apellido);
        cst.setInt("PIDESPECIALIDAD", _doctor.idEspecialidad);
        cst.setString("PTEL", _doctor.telefono);
        cst.setString("PFECHANAC", _doctor.fechaNac);
        cst.setString("PSEXO",_doctor.sexo);
        cst.setString("PDOC",_doctor.documento);
           
        cst.registerOutParameter("MSJ", java.sql.Types.VARCHAR);
        cst.execute();
        
        String mensaje = cst.getString("MSJ");
        System.out.println(mensaje);
        return mensaje;
        
        
    }
      
       public String aggEmpleado(Empleado _Emp) throws SQLException{
        
        String nombre = _Emp.nombre;
        String apellido = _Emp.apellido;
        String telefono= _Emp.telefono;
        String celular= _Emp.celular;
        String fecha= _Emp.fechaNac;
        String sexo= _Emp.sexo;
        String documento= _Emp.documento;
        
        
         
        CallableStatement cst = this.conn.prepareCall("call  AGREGAREMPLEADO(?,?,?,?,?,?,?,?)");
        
    
        cst.setString("PNOMBRE", _Emp.nombre);
        cst.setString("PAPELLIDO", _Emp.apellido);
        cst.setString("PTEL", _Emp.telefono);
        cst.setString("PCEL", _Emp.celular);
        cst.setString("PFECHANAC", _Emp.fechaNac);
        cst.setString("PSEXO",_Emp.sexo);
        cst.setString("PDOC",_Emp.documento);
            
           
        cst.registerOutParameter("MSJ", java.sql.Types.VARCHAR);
        cst.execute();
        
        String mensaje = cst.getString("MSJ");
        System.out.println(mensaje);
        return mensaje;
        
        
    }
      
      
    
    public int aggConsulta(int _idPaciente, int _idUsuario) throws SQLException{
     
        //Ejecutar el procedimiento almacenado para agg consulta con el estado = 0
         CallableStatement cst = this.conn.prepareCall("call  AGG_CONSULTA(?,?,?)");
        // Parametros de entrada
        cst.setInt("PIDUSUARIO", _idUsuario);
        cst.setInt("PIDPACIENTE", _idPaciente);
        
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
    
    public String aggDetConsulta(Consulta _consulta, int _idDoctor) throws SQLException{
        // agregar la consulta con el detalle de consulta con el procedimiento almecenado
        CallableStatement cst = this.conn.prepareCall("call  AGG_DET_CONSULTA(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        // Parametros de entrada
        cst.setInt("PIDCONSULTA", _consulta.idConsulta);
        cst.setInt("PIDDOCTOR", _idDoctor);
        cst.setString("PEF_CABEZA", _consulta.ef_cabeza);
        cst.setString("PEF_CUELLO", _consulta.ef_cuello);
        cst.setString("PEF_TORAX", _consulta.ef_torax);
        cst.setString("PEF_ABDOMEN", _consulta.ef_abdomen);
        cst.setString("PEF_EXTREMIDADES", _consulta.ef_extremidades);
        cst.setString("PPESO", _consulta.peso);
        cst.setString("PTALLA", _consulta.talla);
        cst.setString("PPULSO", _consulta.pulso);
        cst.setString("PFREC_C", _consulta.frec_card);
        cst.setString("PPRES_ART", _consulta.pres_art);
        cst.setString("PTEMP", _consulta.temperatura);
        cst.setString("PMOTIVO", _consulta.motivo);
        cst.setString("PRECOMENDACION", _consulta.recomendaciones);
        cst.setString("PTRATAMIENTO", _consulta.tratamiento);
        
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
    
    public String setEstadoConsulta(int _estado, int _idConsulta) throws SQLException{
        if(_estado == 2 || _estado == 3){
            String query= "UPDATE CONSULTA SET ESTADO = ? WHERE IDCONSULTA = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, _estado);
            ps.setInt(2, _idConsulta);
            int res = ps.executeUpdate();
            if(res > 0){
                return "Exito";
            } else return "Error al modificar consulta";
        } else {
            return "Estado no valido";
        }
    }
    
    public String aggSignosVitales(Consulta _consulta) throws SQLException{
        // agregar la consulta con el detalle de consulta con el procedimiento almecenado
        CallableStatement cst = this.conn.prepareCall("call  AGG_SIGNOS_VITALES(?,?,?,?,?,?,?,?,?)");
        // Parametros de entrada
        cst.setInt("PIDCONSULTA", _consulta.idConsulta);
        cst.setString("PPESO", _consulta.peso);
        cst.setString("PTALLA", _consulta.talla);
        cst.setString("PPULSO", _consulta.pulso);
        cst.setString("PFREC_C", _consulta.frec_card);
        cst.setString("PPRES_ART", _consulta.pres_art);
        cst.setString("PMOTIVO", _consulta.motivo);
        cst.setString("PTEMP", _consulta.temperatura);
        
        // Parametro de salida (mensaje)
        cst.registerOutParameter("MENSAJE", java.sql.Types.VARCHAR);
        
        // Ejecuta el procedimiento almacenado
        cst.execute();
        
        // Se obtienen la salida del procedimineto almacenado
        String mensaje = cst.getString("MENSAJE");
        
        return mensaje;
    }
    
    private int aggReceta(int _idConsulta) throws SQLException{
        CallableStatement cst = this.conn.prepareCall("call  AGG_RECETA(?,?)");
        // Parametros de entrada
        cst.setInt("PIDCONSULTA", _idConsulta);
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
        CallableStatement cst = this.conn.prepareCall("call  AGG_DET_RECETA(?,?,?,?,?)");
        // Parametros de entrada
        cst.setInt("PIDRECETA", _idReceta);
        cst.setInt("PIDMEDICAMENTO", Integer.parseInt(_row[0]));
        cst.setInt("PCANTIDAD", Integer.parseInt(_row[3]));
        cst.setString("PDOSIS",_row[2]);
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
         CallableStatement cst = this.conn.prepareCall("call  AGG_DIAGNOSTICO(?,?,?)");
        // Parametros de entrada
        cst.setInt("PIDCONSULTA", _idConsulta);
        cst.setString("PCOD_ENF", _row[2]);
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
         CallableStatement cst = this.conn.prepareCall("call  AGG_ANTECEDENTE(?,?,?)");
        // Parametros de entrada
        cst.setInt("PIDCONSULTA", _idConsulta);
        cst.setString("PCOD_ENF", _row[2]);
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
        CallableStatement cst = this.conn.prepareCall("call  AGG_MEDICAMENTO(?,?,?,?,?,?,?)");
        // Parametros de entrada
        cst.setString("PMEDICAMENTO", _med.medicamento);
        cst.setInt("PIDUNIDAD", _med.idUnidad);
        cst.setInt("PCANTIDAD", _med.cantidad);
        cst.setInt("PIDPRESENTACION", _med.idPresentacion);
        cst.setInt("PIDTIPO", _med.idTipoMed);
        cst.setString("PFECHA", _med.fechaV);
        
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
    
    public int[] iniciar_sesion(Usuario _usuario ) throws SQLException{
        
        String user = _usuario.user;
        String contra = _usuario.password;
        
        
         //llamar procedimeinto almacenado
        CallableStatement cst = this.conn.prepareCall("call  ValidacionUser(?,?,?)");
        cst.setString("PUSUARIO", _usuario.user);
        cst.setString("PCONTRA", _usuario.password);
        
        // Parametro de salida (mensaje)
        cst.registerOutParameter("PMENSAJE", java.sql.Types.VARCHAR);
        cst.execute();
        
        String mensaje = cst.getString("PMENSAJE");
        System.out.println(mensaje);
        if(!mensaje.equals("Error")){
            String[] splitter = mensaje.split(",");
            int tipo_usr=Integer.parseInt(splitter[1]);
            int id_user = Integer.parseInt(splitter[2]);
            int id_doc = Integer.parseInt(splitter[3]);
            return new int[]{tipo_usr,id_user,id_doc};
        } else return new int[]{-1};
       
    }
    
    public String editarMedicamento(Medicamento _med) throws SQLException {
        CallableStatement cst = this.conn.prepareCall("call  EDIT_MEDICAMENTO(?,?,?,?,?,?,?,?)");
        // Parametros de entrada
        cst.setInt("PIDMEDICAMENTO", _med.idMedicamente);
        cst.setString("PMEDICAMENTO", _med.medicamento);
        cst.setInt("PIDUNIDAD", _med.idUnidad);
        cst.setInt("PCANTIDAD", _med.cantidad);
        cst.setInt("PIDPRESENTACION", _med.idPresentacion);
        cst.setInt("PIDTIPO", _med.idTipoMed);
        cst.setString("PFECHA", _med.fechaV);
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
"INNER JOIN CONSULTA C ON C.IDPACIENTE = P.IDPACIENTE " +
"WHERE STR_TO_DATE(C.CONS_FECHA,'%d-%m-%Y') = STR_TO_DATE(CURRENT_TIMESTAMP,'%d-%m-%Y')";
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
        
        String query = "SELECT IDDOCTOR, CONCAT(IFNULL(DOC_NOMBRE,''),' ',IFNULL(DOC_APELLIDO,'')) DOCTOR FROM DOCTOR";
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
                       "CONCAT(IFNULL(P.PAC_NOMBRE,''),' ',IFNULL(P.PAC_APELLIDO,'')) NOMBRE, C.CARRERA, " +
                       "DATE_FORMAT(P.PAC_FECHA_NAC,'%d-%m-%Y') " +
                       "FROM PACIENTES P " +
                       "LEFT OUTER JOIN CARRERA C ON C.IDCARRERA = P.IDCARRERA " +
                       "INNER JOIN TIPO_PACIENTE TP ON TP.IDTIPOPAC = P.IDTIPOPAC ";
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
        String query = "SELECT C.IDCONSULTA, TP.TIPOPAC ACTIVIDAD, CONCAT(IFNULL(P.PAC_NOMBRE,''),' ',IFNULL(P.PAC_APELLIDO,'')) PACIENTE, " +
                       "(CONCAT(IFNULL(truncate(TIMESTAMPDIFF(month,PAC_FECHA_NAC,curdate())/12, 0)," +
                       "''),' Años ',IFNULL(truncate(mod(TIMESTAMPDIFF(month,PAC_FECHA_NAC,curdate()),12),0 )," +
                       "''), ' meses')) Edad, " +
                       "DATE_FORMAT(C.CONS_FECHA,'%d-%m-%Y') " +
                       "FROM CONSULTA C  \n" +
                       "INNER JOIN PACIENTES P ON P.IDPACIENTE = C.IDPACIENTE " +
                       "INNER JOIN TIPO_PACIENTE TP ON TP.IDTIPOPAC = P.IDTIPOPAC " +
                       "WHERE C.ESTADO = 0";
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
        String query = "SELECT DISTINCT cc.IDCONSULTA, p.PAC_CARNE, tp.TIPOPAC, CONCAT(IFNULL(p.PAC_NOMBRE,''),' ',IFNULL(p.PAC_APELLIDO,'')) PACIENTE, " +
                       "(CONCAT(IFNULL(truncate(TIMESTAMPDIFF(month,PAC_FECHA_NAC,curdate())/12, 0)," +
                       "''),' Años ',IFNULL(truncate(mod(TIMESTAMPDIFF(month,PAC_FECHA_NAC,curdate()),12),0 )," +
                       "''), ' meses')) EDAD, " +
                       "f.FACTULTAD, DATE_FORMAT(cc.CONS_FECHA,'%d-%m-%Y') as FECHA, CONCAT(IFNULL(d.DOC_NOMBRE,''),' ',IFNULL(d.DOC_APELLIDO,'')) as DOCTOR , dc.MOTIVO " +
                       "FROM Pacientes p " +
                       "INNER JOIN TIPO_PACIENTE tp on tp.IDTIPOPAC = p.IDTIPOPAC " +
                       "LEFT OUTER JOIN CARRERA c on c.IDCARRERA = p.IDCARRERA " +
                       "LEFT OUTER JOIN FACULTAD f on f.IDFACULTAD = c.IDFACULTAD  " +
                       "INNER JOIN CONSULTA cc on cc.IDPACIENTE = p.IDPACIENTE " +
                       "INNER JOIN DOCTOR d on d.IDDOCTOR = cc.IDDOCTOR " +
                       "INNER JOIN DET_CONSULTA dc on dc.IDCONSULTA = cc.IDCONSULTA " +
                       "WHERE DATE_FORMAT(cc.CONS_FECHA,'%d-%m-%Y') =  DATE_FORMAT(CURRENT_TIMESTAMP,'%d-%m-%Y') AND ESTADO = 1";
              
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
        
        String query = "SELECT M.IDMEDICAMENTO, TP.TIPO_MED, CONCAT(IFNULL(M.MEDICAMENTO,''),' ',IFNULL(UM.ABREVIATURA,'')) MEDICAMENTO, " +
                       "P.PRESENTACION, M.CANTIDAD, DATE_FORMAT(M.FECHA_V,'%d-%m-%Y') FECHA FROM MEDICAMENTO M " +
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
        
        String query = "SELECT M.IDMEDICAMENTO, TP.TIPO_MED, CONCAT(IFNULL(M.MEDICAMENTO,''),' ',IFNULL(UM.ABREVIATURA,'')) MEDICAMENTO, P.PRESENTACION, " +
"M.CANTIDAD, DATE_FORMAT(M.FECHA_V,'%d-%m-%Y') FECHA FROM MEDICAMENTO M " +
"INNER JOIN UNIDAD_MED UM ON UM.IDUNIDAD_MED = M.IDUNIDAD_MED " +
"INNER JOIN TIPO_MEDICAMENTO TP ON TP.IDTIPO_MED = M.IDTIPO " +
"INNER JOIN PRESENTACION P ON P.IDPRESENTACION = M.IDPRESENTACION " +
"WHERE M.ELIMINADO = 0";
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
        
        String query = "SELECT M.IDMEDICAMENTO, TP.TIPO_MED, CONCAT(IFNULL(M.MEDICAMENTO,''),' ',IFNULL(UM.ABREVIATURA,'')) MEDICAMENTO, P.PRESENTACION," +
                       "M.CANTIDAD, DATE_FORMAT(M.FECHA_V,'%d-%m-%Y') FECHA FROM MEDICAMENTO M " +
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
        String query = "SELECT M.IDMEDICAMENTO, TP.TIPO_MED ,CONCAT(IFNULL(M.MEDICAMENTO,''),' ',IFNULL(UM.ABREVIATURA,'')) MEDICAMENTO, P.PRESENTACION, M.CANTIDAD," +
                       " DATE_FORMAT(M.FECHA_V,'%d-%m-%Y') FECHA FROM MEDICAMENTO M " +
                       " INNER JOIN UNIDAD_MED UM ON UM.IDUNIDAD_MED = M.IDUNIDAD_MED " +
                       " INNER JOIN TIPO_MEDICAMENTO TP ON TP.IDTIPO_MED = M.IDTIPO " +
                       " INNER JOIN PRESENTACION P ON P.IDPRESENTACION = M.IDPRESENTACION " +
                       " WHERE M.FECHA_V = STR_TO_DATE(?,'%d-%m-%Y') AND M.ELIMINADO = 0";
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
        
        String query = "SELECT M.IDMEDICAMENTO, TP.TIPO_MED, CONCAT(IFNULL(M.MEDICAMENTO,''),' ',IFNULL(UM.ABREVIATURA,'')) MEDICAMENTO, P.PRESENTACION, " +
                       "M.CANTIDAD, DATE_FORMAT(M.FECHA_V,'%d-%m-%Y') FECHA FROM MEDICAMENTO M " +
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
        String query = "SELECT IDEMP,CONCAT(IFNULL(EMP_NOMBRE,''),' ',IFNULL(EMP_APELLIDO,'')) NOMBRE FROM EMPLEADO";
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
        
         public Object[] Obt_Doctores() throws SQLException {

        Statement stmt = conn.createStatement();
        String query = "SELECT IDDOCTOR,CONCAT(IFNULL(DOC_NOMBRE,''),' ',IFNULL(DOC_APELLIDO,'')) NOMBRE FROM DOCTOR";
         PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        
        ResultSet rs = preparedStatement.executeQuery();
        
        rs.last();
        int numRows = rs.getRow();
        rs.beforeFirst();
        
        if(numRows > 0){
            int[] idDoc = new int[numRows];
           String[] doc = new String[numRows];
            int con = 0;
            while (rs.next()){
                
                idDoc[con] = rs.getInt(1);
                doc[con] = rs.getString(2);
                con++;
            }
            return new Object[]{idDoc,doc};
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
        String query = "SELECT d.IDDOCTOR, CONCAT(IFNULL(d.DOC_NOMBRE,''),' ',IFNULL(d.DOC_APELLIDO,'')) NOMBRE, e.ESPECIALIDAD, " +
                       " d.DOC_SEXO, d.DOC_DOCUMENTO, d.DOC_TEL, " +
                       " (CONCAT(IFNULL(truncate(TIMESTAMPDIFF(month,DOC_FECHA_NAC,curdate())/12, 0)," +
                       " ''),' Años ',IFNULL(truncate(mod(TIMESTAMPDIFF(month,DOC_FECHA_NAC,curdate()),12),0 )," +
                       " ''), ' meses')) Edad" +
                       " FROM DOCTOR d " +
                       " INNER JOIN ESPECIALIDAD e on d.IDESPECIALIDAD = e.IDESPECIALIDAD " +
                       " WHERE d.ELIMINADO = 0";
              
        ResultSet rs = stmt.executeQuery(query);
          
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
        
        public DefaultTableModel getDocsDes( JTable jTable1) throws SQLException{
              
         //DOCTOR
        DefaultTableModel model;
        Statement stmt = conn.createStatement() ;
        String query = "SELECT d.IDDOCTOR, CONCAT(IFNULL(d.DOC_NOMBRE,''),' ',IFNULL(d.DOC_APELLIDO,'')) NOMBRE, e.ESPECIALIDAD, d.DOC_SEXO, d.DOC_DOCUMENTO, d.DOC_TEL, " +
                       "(CONCAT(IFNULL(truncate(TIMESTAMPDIFF(month,DOC_FECHA_NAC,curdate())/12, 0), " +
                       "''),' Años ',IFNULL(truncate(mod(TIMESTAMPDIFF(month,DOC_FECHA_NAC,curdate()),12),0 )," +
                       "''), ' meses')) Edad, " +
                       "u.USUARIO" +
                       "FROM DOCTOR d " +
                       "INNER JOIN ESPECIALIDAD e on d.IDESPECIALIDAD = e.IDESPECIALIDAD " +
                       "INNER JOIN USUARIO u on d.IDUSUARIO = u.IDUSUARIO " +
                       "WHERE d.ELIMINADO = 1";
              
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
        
        public DefaultTableModel getEmpleado( JTable jTable1) throws SQLException{
              
         //EMPLEADO
        DefaultTableModel model;
        Statement stmt = conn.createStatement() ;
        String query = "SELECT e.IDEMP, CONCAT(IFNULL(e.EMP_NOMBRE,''),' ',IFNULL(e.EMP_APELLIDO,'')) NOMBRE,e.EMP_TEL,e.EMP_CEL, " +
                       "(CONCAT(IFNULL(truncate(TIMESTAMPDIFF(month,EMP_FECHA_NAC,curdate())/12, 0)," +
                       "''),' Años ',IFNULL(truncate(mod(TIMESTAMPDIFF(month,EMP_FECHA_NAC,curdate()),12),0 )," +
                       "''), ' meses')) EDAD, " +
                       "e.EMP_SEXO, e.EMP_DOCUMENTO " +
                       "FROM EMPLEADO e " +
                       "WHERE e.ELIMINADO = 0";
              
        ResultSet rs = stmt.executeQuery(query);
          
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object Datos[]= new Object[7];
          
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
        
         public DefaultTableModel getUsuarios( JTable jTable1) throws SQLException{
        DefaultTableModel model;
        Statement stmt = conn.createStatement() ;
        String query = "SELECT u.IDUSUARIO, u.USUARIO,u.USR_CONTRA,u.USR_TIPO " +
                   " FROM USUARIO u " +
                   " WHERE u.ELIMINADO= 0";
              
        ResultSet rs = stmt.executeQuery(query);
          
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object Datos[]= new Object[5];
          
          while (rs.next())
           {
              for (int i=0;i<4;i++)
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
                       "  C.IDCONSULTA, " +
                       " CASE P.PAC_CARNE " +
                       "  WHEN NULL THEN P.PAC_DOCUMENTO " +
                       "  ELSE P.PAC_CARNE END CARENTDOC, " +
                       " CONCAT(IFNULL(P.PAC_NOMBRE,''),' ',IFNULL(P.PAC_APELLIDO,'')) NOMBRE, " +
                       " DATE_FORMAT(C.CONS_FECHA,'%d-%m-%Y') as FECHA " +
                       "  FROM  CONSULTA C " + 
                       "  INNER JOIN PACIENTES P ON P.IDPACIENTE = C.IDPACIENTE " +
                       "  WHERE P.PAC_CARNE LIKE ? OR P.PAC_DOCUMENTO LIKE ? AND C.ESTADO != 0";
                
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
" C.IDCONSULTA, " +
" CASE P.PAC_CARNE " +
" WHEN NULL THEN P.PAC_DOCUMENTO " +
"  ELSE P.PAC_CARNE END CARENTDOC, " +
" CONCAT(IFNULL(P.PAC_NOMBRE,''),' ',IFNULL(P.PAC_APELLIDO,'')) NOMBRE, " +
" DATE_FORMAT(C.CONS_FECHA,'%d-%m-%Y') as FECHA " +
"  FROM  CONSULTA C " +
"  INNER JOIN PACIENTES P ON P.IDPACIENTE = C.IDPACIENTE " +
"  WHERE P.IDPACIENTE = ? AND C.ESTADO != 0";
                
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
                       " C.IDCONSULTA, " +
                       " CASE P.PAC_CARNE " +
                       " WHEN NULL THEN P.PAC_DOCUMENTO " +
                       " ELSE P.PAC_CARNE END CARENTDOC, " +
                       " CONCAT(IFNULL(P.PAC_NOMBRE,''),' ',IFNULL(P.PAC_APELLIDO,'')) NOMBRE, " +
                       " DATE_FORMAT(C.CONS_FECHA,'%d-%m-%Y') as FECHA" +
                       " FROM  CONSULTA C " +
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
                       " C.IDCONSULTA, " +
                       " CASE P.PAC_CARNE " +
                       " WHEN NULL THEN P.PAC_DOCUMENTO " +
                       " ELSE P.PAC_CARNE END CARENTDOC, " +
                       " CONCAT(IFNULL(P.PAC_NOMBRE,''),' ',IFNULL(P.PAC_APELLIDO,'')) NOMBRE, " +
                       " DATE_FORMAT(C.CONS_FECHA,'%d-%m-%Y') as FECHA" +
                       " FROM  CONSULTA C " +
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
        CallableStatement cst = this.conn.prepareCall("call  AGREGARPACIENTE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        // Parametros de entrada
        cst.setString("PDOCUMENTO", pac.documento);
        cst.setInt("PTIPOPAC", pac.tipoPaciente);
        cst.setString("PNOMBRE", pac.nombre);
        cst.setString("PAPELLIDO", pac.apellido);
         cst.setString("PSEXO", pac.sexo);
         cst.setString("PFECHA", pac.FechaNac);
         cst.setString("PTELEFONO", pac.telefono);
         cst.setString("PCELULAR", pac.celular);
         cst.setInt("PDEPARTAMENTO", Integer.parseInt(pac.departamento));
         cst.setString("PDIRECCION", pac.direccion);
         cst.setInt("PZONA", pac.zona);
         cst.setString("PEMERGENCIA", pac.caso_emergencia);
         cst.setString("PTELEMERGENCIA", pac.tel_emergencia);
         cst.setInt("PPARENTEZCO", Integer.parseInt(pac.parentezco));
         cst.setString("PCARNET", pac.carne);
         cst.setInt("PCARRERA",pac.carreraP);
         
         
        // Parametro de salida (mensaje)
        cst.registerOutParameter("PMSJ", java.sql.Types.VARCHAR);
        cst.execute();
        
        String mensaje = cst.getString("PMSJ");
        
        return mensaje;
    }
    
    public DefaultTableModel getConsultasByID(JTable jTable1, int _idPaciente) throws SQLException{
        DefaultTableModel model;
        
        String query = "SELECT cc.IDCONSULTA, p.PAC_CARNE, tp.TIPOPAC, CONCAT(IFNULL(p.PAC_NOMBRE,''),' ',IFNULL(p.PAC_APELLIDO,'')) as PACIENTE, " +
                       " (CONCAT(IFNULL(truncate(TIMESTAMPDIFF(month,PAC_FECHA_NAC,curdate())/12, 0)," +
                       " ''),' Años ',IFNULL(truncate(mod(TIMESTAMPDIFF(month,PAC_FECHA_NAC,curdate()),12),0 )," +
                       " ''), ' meses')) EDAD, " +
                       " f.FACTULTAD,c.CARRERA, p.PAC_TELEFONO, cc.CONS_FECHA, CONCAT(IFNULL(d.DOC_NOMBRE,''),' ',IFNULL(d.DOC_APELLIDO,'')) as DOCTOR , dc.MOTIVO " +
                       " FROM Pacientes p  " +
                       " INNER JOIN TIPO_PACIENTE tp on tp.IDTIPOPAC = p.IDTIPOPAC " +
                       " LEFT OUTER JOIN CARRERA c on c.IDCARRERA = p.IDCARRERA " +
                       " LEFT OUTER JOIN FACULTAD f on f.IDFACULTAD = c.IDFACULTAD  " +
                       " INNER JOIN CONSULTA cc on cc.IDPACIENTE = p.IDPACIENTE " +
                       " INNER JOIN DOCTOR d on d.IDDOCTOR = cc.IDDOCTOR " +
                       " INNER JOIN DET_CONSULTA dc on dc.IDCONSULTA = cc.IDCONSULTA " +
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
        
        String query = "SELECT DISTINCT cc.IDCONSULTA, p.PAC_CARNE, tp.TIPOPAC, CONCAT(IFNULL(p.PAC_NOMBRE,''),' ',IFNULL(p.PAC_APELLIDO,'')) as PACIENTE, " +
                       " (CONCAT(IFNULL(truncate(TIMESTAMPDIFF(month,PAC_FECHA_NAC,curdate())/12, 0)," +
                       " ''),' Años ',IFNULL(truncate(mod(TIMESTAMPDIFF(month,PAC_FECHA_NAC,curdate()),12),0 )," +
                       " ''), ' meses')) EDAD, " +
                       " f.FACTULTAD,c.CARRERA, p.PAC_TELEFONO, cc.CONS_FECHA, CONCAT(IFNULL(d.DOC_NOMBRE,''),' ',IFNULL(d.DOC_APELLIDO,'')) as DOCTOR , dc.MOTIVO " +
                       " FROM Pacientes p " +
                       " INNER JOIN TIPO_PACIENTE tp on tp.IDTIPOPAC = p.IDTIPOPAC " +
                       " LEFT OUTER JOIN CARRERA c on c.IDCARRERA = p.IDCARRERA " +
                       " LEFT OUTER JOIN FACULTAD f on f.IDFACULTAD = c.IDFACULTAD  " +
                       " INNER JOIN CONSULTA cc on cc.IDPACIENTE = p.IDPACIENTE " +
                       " INNER JOIN DOCTOR d on d.IDDOCTOR = cc.IDDOCTOR " +
                       " INNER JOIN DET_CONSULTA dc on dc.IDCONSULTA = cc.IDCONSULTA " +
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
        
        String query = "SELECT DISTINCT cc.IDCONSULTA, p.PAC_CARNE, tp.TIPOPAC, CONCAT(IFNULL(p.PAC_NOMBRE,''),' ',IFNULL(p.PAC_APELLIDO,'')) as PACIENTE, " +
                       " (CONCAT(IFNULL(truncate(TIMESTAMPDIFF(month,PAC_FECHA_NAC,curdate())/12, 0)," +
                       " ''),' Años ',IFNULL(truncate(mod(TIMESTAMPDIFF(month,PAC_FECHA_NAC,curdate()),12),0 )," +
                       " ''), ' meses')) EDAD, " +
                       " f.FACTULTAD,c.CARRERA, p.PAC_TELEFONO, cc.CONS_FECHA, CONCAT(IFNULL(d.DOC_NOMBRE,''),' ',IFNULL(d.DOC_APELLIDO,'')) as DOCTOR , dc.MOTIVO " +
                       " FROM Pacientes p  " +
                       " INNER JOIN TIPO_PACIENTE tp on tp.IDTIPOPAC = p.IDTIPOPAC " +
                       " LEFT OUTER JOIN CARRERA c on c.IDCARRERA = p.IDCARRERA " +
                       " LEFT OUTER JOIN FACULTAD f on f.IDFACULTAD = c.IDFACULTAD  " +
                       " INNER JOIN CONSULTA cc on cc.IDPACIENTE = p.IDPACIENTE " +
                       " INNER JOIN DOCTOR d on d.IDDOCTOR = cc.IDDOCTOR " +
                       " INNER JOIN DET_CONSULTA dc on dc.IDCONSULTA = cc.IDCONSULTA " +
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
        
        String query = "SELECT DISTINCT cc.IDCONSULTA, p.PAC_CARNE, tp.TIPOPAC, CONCAT(IFNULL(p.PAC_NOMBRE,''),' ',IFNULL(p.PAC_APELLIDO,'')) as PACIENTE, " +
                       " (CONCAT(IFNULL(truncate(TIMESTAMPDIFF(month,PAC_FECHA_NAC,curdate())/12, 0)," +
                       " ''),' Años ',IFNULL(truncate(mod(TIMESTAMPDIFF(month,PAC_FECHA_NAC,curdate()),12),0 )," +
                       " ''), ' meses')) EDAD, " +
                       " f.FACTULTAD,c.CARRERA, p.PAC_TELEFONO, cc.CONS_FECHA, CONCAT(IFNULL(d.DOC_NOMBRE,''),' ',IFNULL(d.DOC_APELLIDO,'')) as DOCTOR , dc.MOTIVO " +
                       " FROM Pacientes p  " +
                       " INNER JOIN TIPO_PACIENTE tp on tp.IDTIPOPAC = p.IDTIPOPAC " +
                       " LEFT OUTER JOIN CARRERA c on c.IDCARRERA = p.IDCARRERA " +
                       " LEFT OUTER JOIN FACULTAD f on f.IDFACULTAD = c.IDFACULTAD  " +
                       " INNER JOIN CONSULTA cc on cc.IDPACIENTE = p.IDPACIENTE " +
                       " INNER JOIN DOCTOR d on d.IDDOCTOR = cc.IDDOCTOR " +
                       " INNER JOIN DET_CONSULTA dc on dc.IDCONSULTA = cc.IDCONSULTA " +
                       " WHERE c.IDCARRERA = ?";
                
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
        
        String query = "SELECT DISTINCT cc.IDCONSULTA, p.PAC_CARNE, tp.TIPOPAC, CONCAT(IFNULL(p.PAC_NOMBRE,''),' ',IFNULL(p.PAC_APELLIDO,'')) as PACIENTE, " +
                       " (CONCAT(IFNULL(truncate(TIMESTAMPDIFF(month,PAC_FECHA_NAC,curdate())/12, 0)," +
                       " ''),' Años ',IFNULL(truncate(mod(TIMESTAMPDIFF(month,PAC_FECHA_NAC,curdate()),12),0 )," +
                       " ''), ' meses')) EDAD, " +
                       " f.FACTULTAD,c.CARRERA, p.PAC_TELEFONO, cc.CONS_FECHA, CONCAT(IFNULL(d.DOC_NOMBRE,''),' ',IFNULL(d.DOC_APELLIDO,'')) as DOCTOR , dc.MOTIVO " +
                       " FROM Pacientes p  " +
                       " INNER JOIN TIPO_PACIENTE tp on tp.IDTIPOPAC = p.IDTIPOPAC " +
                       " LEFT OUTER JOIN CARRERA c on c.IDCARRERA = p.IDCARRERA " +
                       " LEFT OUTER JOIN FACULTAD f on f.IDFACULTAD = c.IDFACULTAD  " +
                       " INNER JOIN CONSULTA cc on cc.IDPACIENTE = p.IDPACIENTE " +
                       " INNER JOIN DOCTOR d on d.IDDOCTOR = cc.IDDOCTOR " +
                       " INNER JOIN DET_CONSULTA dc on dc.IDCONSULTA = cc.IDCONSULTA " +
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
        
        String query = "SELECT DISTINCT cc.IDCONSULTA, p.PAC_CARNE, tp.TIPOPAC, CONCAT(IFNULL(p.PAC_NOMBRE,''),' ',IFNULL(p.PAC_APELLIDO,'')) as PACIENTE, " +
                       " (CONCAT(IFNULL(truncate(TIMESTAMPDIFF(month,PAC_FECHA_NAC,curdate())/12, 0)," +
                       " ''),' Años ',IFNULL(truncate(mod(TIMESTAMPDIFF(month,PAC_FECHA_NAC,curdate()),12),0 )," +
                       " ''), ' meses')) EDAD, " +
                       " f.FACTULTAD,c.CARRERA, p.PAC_TELEFONO, cc.CONS_FECHA, CONCAT(IFNULL(d.DOC_NOMBRE,''),' ',IFNULL(d.DOC_APELLIDO,'')) as DOCTOR , dc.MOTIVO " +
                       " FROM Pacientes p  " +
                       " INNER JOIN TIPO_PACIENTE tp on tp.IDTIPOPAC = p.IDTIPOPAC " +
                       " LEFT OUTER JOIN CARRERA c on c.IDCARRERA = p.IDCARRERA " +
                       " LEFT OUTER JOIN FACULTAD f on f.IDFACULTAD = c.IDFACULTAD  " +
                       " INNER JOIN CONSULTA cc on cc.IDPACIENTE = p.IDPACIENTE " +
                       " INNER JOIN DOCTOR d on d.IDDOCTOR = cc.IDDOCTOR " +
                       " INNER JOIN DET_CONSULTA dc on dc.IDCONSULTA = cc.IDCONSULTA " +
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
        
        String query = "SELECT DISTINCT cc.IDCONSULTA, p.PAC_CARNE, tp.TIPOPAC, CONCAT(IFNULL(p.PAC_NOMBRE,''),' ',IFNULL(p.PAC_APELLIDO,'')) as PACIENTE, " +
                       " (CONCAT(IFNULL(truncate(TIMESTAMPDIFF(month,PAC_FECHA_NAC,curdate())/12, 0)," +
                       " ''),' Años ',IFNULL(truncate(mod(TIMESTAMPDIFF(month,PAC_FECHA_NAC,curdate()),12),0 )," +
                       " ''), ' meses')) EDAD, " +
                       " f.FACTULTAD,c.CARRERA, p.PAC_TELEFONO, cc.CONS_FECHA, CONCAT(IFNULL(d.DOC_NOMBRE,''),' ',IFNULL(d.DOC_APELLIDO,'')) as DOCTOR , dc.MOTIVO " +
                       " FROM Pacientes p  " +
                       " INNER JOIN TIPO_PACIENTE tp on tp.IDTIPOPAC = p.IDTIPOPAC " +
                       " LEFT OUTER JOIN CARRERA c on c.IDCARRERA = p.IDCARRERA " +
                       " LEFT OUTER JOIN FACULTAD f on f.IDFACULTAD = c.IDFACULTAD  " +
                       " INNER JOIN CONSULTA cc on cc.IDPACIENTE = p.IDPACIENTE " +
                       " INNER JOIN DOCTOR d on d.IDDOCTOR = cc.IDDOCTOR " +
                       " INNER JOIN DET_CONSULTA dc on dc.IDCONSULTA = cc.IDCONSULTA " +
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
        
        String query = "SELECT DISTINCT cc.IDCONSULTA, p.PAC_CARNE, tp.TIPOPAC, CONCAT(IFNULL(p.PAC_NOMBRE,''),' ',IFNULL(p.PAC_APELLIDO,'')) as PACIENTE, " +
                       " (CONCAT(IFNULL(truncate(TIMESTAMPDIFF(month,PAC_FECHA_NAC,curdate())/12, 0)," +
                       " ''),' Años ',IFNULL(truncate(mod(TIMESTAMPDIFF(month,PAC_FECHA_NAC,curdate()),12),0 )," +
                       " ''), ' meses')) EDAD, " +
                       " f.FACTULTAD,c.CARRERA, p.PAC_TELEFONO, cc.CONS_FECHA, CONCAT(IFNULL(d.DOC_NOMBRE,''),' ',IFNULL(d.DOC_APELLIDO,'')) as DOCTOR , dc.MOTIVO " +
                       " FROM Pacientes p  " +
                       " INNER JOIN TIPO_PACIENTE tp on tp.IDTIPOPAC = p.IDTIPOPAC " +
                       " LEFT OUTER JOIN CARRERA c on c.IDCARRERA = p.IDCARRERA " +
                       " LEFT OUTER JOIN FACULTAD f on f.IDFACULTAD = c.IDFACULTAD  " +
                       " INNER JOIN CONSULTA cc on cc.IDPACIENTE = p.IDPACIENTE " +
                       " INNER JOIN DOCTOR d on d.IDDOCTOR = cc.IDDOCTOR " +
                       " INNER JOIN DET_CONSULTA dc on dc.IDCONSULTA = cc.IDCONSULTA " +
                       " WHERE DATE_FORMAT(cc.CONS_FECHA,'%d-%m-%Y') = ? ";
                
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
        
        String query = "SELECT DISTINCT cc.IDCONSULTA, p.PAC_CARNE, tp.TIPOPAC, CONCAT(IFNULL(p.PAC_NOMBRE,''),' ',IFNULL(p.PAC_APELLIDO,'')) as PACIENTE, " +
                       " (CONCAT(IFNULL(truncate(TIMESTAMPDIFF(month,PAC_FECHA_NAC,curdate())/12, 0)," +
                       " ''),' Años ',IFNULL(truncate(mod(TIMESTAMPDIFF(month,PAC_FECHA_NAC,curdate()),12),0 )," +
                       " ''), ' meses')) EDAD, " +
                       " f.FACTULTAD,c.CARRERA, p.PAC_TELEFONO, cc.CONS_FECHA, CONCAT(IFNULL(d.DOC_NOMBRE,''),' ',IFNULL(d.DOC_APELLIDO,'')) as DOCTOR , dc.MOTIVO " +
                       " FROM Pacientes p  " +
                       " INNER JOIN TIPO_PACIENTE tp on tp.IDTIPOPAC = p.IDTIPOPAC " +
                       " LEFT OUTER JOIN CARRERA c on c.IDCARRERA = p.IDCARRERA " +
                       " LEFT OUTER JOIN FACULTAD f on f.IDFACULTAD = c.IDFACULTAD  " +
                       " INNER JOIN CONSULTA cc on cc.IDPACIENTE = p.IDPACIENTE " +
                       " INNER JOIN DOCTOR d on d.IDDOCTOR = cc.IDDOCTOR " +
                       " INNER JOIN DET_CONSULTA dc on dc.IDCONSULTA = cc.IDCONSULTA " +
                       " WHERE (EXTRACT(YEAR FROM curdate()) -EXTRACT(YEAR FROM p.PAC_FECHA_NAC)) = ? ";
                
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
    
    public Doctor DesactDoctor(int _idDoctor) throws SQLException {
        
        String query = "UPDATE DOCTOR SET ELIMINADO=1 WHERE IDDOCTOR=? ";
            
        PreparedStatement preparedStatement = conn.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setInt(1, _idDoctor);
        ResultSet rs = preparedStatement.executeQuery();
        Doctor res = new Doctor();
      
        return res;
    }


      public Usuario DesactUsuario(int _idUsuario) throws SQLException {
       
        String query = "UPDATE USUARIO SET ELIMINADO=1 WHERE IDUSUARIO= ? ";
            
        PreparedStatement preparedStatement = conn.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setInt(1, _idUsuario);
        ResultSet rs = preparedStatement.executeQuery();
        Usuario res = new Usuario();
      
        return res;
    }
    
       public Empleado DesactEmpleado(int _idEmp) throws SQLException {
       
        String query = "UPDATE EMPLEADO SET ELIMINADO=1 WHERE IDEMP= ? ";
            
        PreparedStatement preparedStatement = conn.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setInt(1, _idEmp);
        ResultSet rs = preparedStatement.executeQuery();
        Empleado emp = new Empleado();
      
        return emp;
    }
       
       public Doctor ActDoctor(int _idDoctor) throws SQLException {
        
        String query = "UPDATE DOCTOR SET ELIMINADO=0 WHERE IDDOCTOR=? ";
            
        PreparedStatement preparedStatement = conn.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setInt(1, _idDoctor);
        ResultSet rs = preparedStatement.executeQuery();
        Doctor res = new Doctor();
      
        return res;
    }
       
       
       public DefaultTableModel obt_alertas(JTable jTable1, int tipoA) throws SQLException {
           DefaultTableModel model;
        Statement stmt = conn.createStatement();
        String query="";
        switch(tipoA){
            case 1:
                 query= "select idmedicamento,medicamento,cantidad,fecha_v,DATE(fecha_v)-DATE(CURDATE()) as dias " +
                        "from medicamento " +
                        "where (cantidad<=5 or (DATE(fecha_v)-DATE(CURDATE())<10) " +
                        " and (DATE(fecha_v)-DATE(CURDATE())>0))  and eliminado=0";
                break;
            case 2:
                query = "select idmedicamento,medicamento,cantidad,fecha_v,DATE(fecha_v)-DATE(CURDATE()) as dias from medicamento " +
                        "where ((DATE(fecha_v)-DATE(CURDATE())<10) and (DATE(fecha_v)-DATE(CURDATE())>0))  and eliminado=0";
                break;
            case 3:
                query = "select idmedicamento,medicamento,cantidad,fecha_v,DATE(fecha_v)-DATE(CURDATE()) as dias " +
                        "from medicamento " +
                        "where (cantidad<=5 )and eliminado=0";
                break;
        }
        
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = preparedStatement.executeQuery();
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object Datos[]= new Object[5];
          
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
        
  
       
        public int ContarDoctores() throws SQLException{
        
        String query = "select count(idDoctor) from Doctor where eliminado=0";
                
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = preparedStatement.executeQuery();
        int ndoctores=0;
          while (rs.next())
           {
              ndoctores=rs.getInt(1);
             
           }
           return ndoctores;
    }
       
     public int ContarMedicamentos() throws SQLException{
        
        String query = "select count(idMedicamento) from Medicamento";
                
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = preparedStatement.executeQuery();
        int nmedicamentos=0;
          while (rs.next())
           {
              nmedicamentos=rs.getInt(1);
             
           }
           return nmedicamentos;
    }
   
public int ContarPacientes() throws SQLException{
        
        String query = "select count(idPaciente) from Pacientes";
                
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = preparedStatement.executeQuery();
        int npacientes=0;
          while (rs.next())
           {
              npacientes=rs.getInt(1);
             
           }
           return npacientes;
    }     
     
public int ConsultasxMes() throws SQLException{
        
        String query = "select count(idConsulta) from Consulta " +
                       " where cons_fecha > STR_TO_DATE((CONCAT('01/'," +
                       " IFNULL(month(CURRENT_TIMESTAMP),''),'/',IFNULL(year(CURRENT_TIMESTAMP),''))),'%d/%m/%Y')";
                
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = preparedStatement.executeQuery();
        int nconsultas=0;
          while (rs.next())
           {
              nconsultas=rs.getInt(1);
             
           }
           return nconsultas;
    }  


 public DefaultTableModel getHistorialPaciente(JTable jTable1,String query) throws SQLException{
        DefaultTableModel model;
        if (query.equals("no")){
        query = "Select idpaciente, pac_carne,pacientes.pac_documento, (pac_nombre||' '||pac_apellido) as nombre,tipopac," +
                " c.carrera,departamento.departamento," +
                " CASE PAC_ZONA WHEN '1' THEN 'Urbana' " +
                " ELSE 'Rural' END zona,pac_celular,CASE PAC_SEXO " +
                " WHEN 'M' THEN 'Masculino' " +
                " ELSE 'Femenino' END sexo from pacientes" +
                " inner join tipo_paciente on pacientes.idtipopac=tipo_paciente.idtipopac " +
                " inner join Carrera c on c.idcarrera=pacientes.idcarrera" +
                " inner join Facultad on facultad.idfacultad=c.idfacultad" +
                " inner join departamento on departamento.iddepartamento=pacientes.iddepartamento"; }          
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = preparedStatement.executeQuery();   
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object Datos[]= new Object[10];
          
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
 
 
 
 public Paciente getPacientebyID(int _idPac) throws SQLException{
        DefaultTableModel model;
        
        String query = "Select idpaciente,pac_nombre,pac_apellido,departamento," +
                       "PAC_ZONA,pac_celular from pacientes " +
                "INNER JOIN departamento on departamento.iddepartamento=pacientes.iddepartamento"+
                       " WHERE idpaciente = ?";
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setInt(1,_idPac);
        ResultSet rs2 = preparedStatement.executeQuery();
        
        Object Datos[]= new Object[6];
        Paciente pac = new Paciente();
          while (rs2.next())
           {
              pac.idPaciente = rs2.getInt(1);
              pac.nombre=rs2.getString(2);
              pac.apellido=rs2.getString(3);
              pac.departamento=rs2.getString(4);
              pac.zona=rs2.getInt(5);
              pac.celular=rs2.getString(6);
              
              
           }
           return pac;
    }
 
  public DefaultTableModel getSolicPacCarnet(JTable jTable1, String _idCarnet) throws SQLException{
        DefaultTableModel model;
        
        String query = "SELECT p.PAC_CARNE, p.PAC_DOCUMENTO, tp.TIPOPAC, CONCAT(IFNULL(p.PAC_NOMBRE,''),' ',IFNULL(p.PAC_APELLIDO,'')) as PACIENTE, " +
                       " (CONCAT(IFNULL(truncate(TIMESTAMPDIFF(month,PAC_FECHA_NAC,curdate())/12, 0)," +
                       " ''),' Años ',IFNULL(truncate(mod(TIMESTAMPDIFF(month,PAC_FECHA_NAC,curdate()),12),0 )," +
                       " ''), ' meses')) EDAD, " + 
                       " c.CARRERA " +
                       " FROM Pacientes p " + 
                       " INNER JOIN TIPO_PACIENTE tp on tp.IDTIPOPAC = p.IDTIPOPAC " +
                       " LEFT OUTER JOIN CARRERA c on c.IDCARRERA = p.IDCARRERA " +
                       " WHERE p.PAC_CARNE LIKE ?";
                
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setString(1,_idCarnet);
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
 
public String ActualizarPaciente(Paciente _pac) throws SQLException {
        
    String msj="";
    try{
        String query = "UPDATE PACIENTES SET pac_nombre=? , pac_apellido=? ,"
                + "iddepartamento=? , pac_zona=? , pac_celular=?  WHERE idpaciente=? ";
            
        PreparedStatement preparedStatement = conn.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setString(1, _pac.nombre);
        preparedStatement.setString(2, _pac.apellido);
        preparedStatement.setInt(3, Integer.parseInt(_pac.departamento));
        preparedStatement.setInt(4, _pac.zona);
        preparedStatement.setString(5, _pac.celular);
        preparedStatement.setInt(6, _pac.idPaciente);
        ResultSet rs = preparedStatement.executeQuery();
        msj="Exito";
    }catch (Exception e){
     msj="Error";
    }
      return msj;
    }
 public DefaultTableModel getSolicPacDoc(JTable jTable1, String _doc) throws SQLException{
        DefaultTableModel model;
        
        String query = "SELECT p.PAC_CARNE, p.PAC_DOCUMENTO, tp.TIPOPAC, CONCAT(IFNULL(p.PAC_NOMBRE,''),' ',IFNULL(p.PAC_APELLIDO,'')) as PACIENTE, " +
                       " (CONCAT(IFNULL(truncate(TIMESTAMPDIFF(month,PAC_FECHA_NAC,curdate())/12, 0)," +
                       " ''),' Años ',IFNULL(truncate(mod(TIMESTAMPDIFF(month,PAC_FECHA_NAC,curdate()),12),0 )," +
                       " ''), ' meses')) EDAD, " +
                       " c.CARRERA " +
                       " FROM Pacientes p " +
                       " INNER JOIN TIPO_PACIENTE tp on tp.IDTIPOPAC = p.IDTIPOPAC " +
                       " LEFT OUTER JOIN CARRERA c on c.IDCARRERA = p.IDCARRERA " +
                       " WHERE p.PAC_DOCUMENTO = ?";
                
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setString(1,_doc);
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
  public int aggSolicitud(String _carnet, String _documento) throws SQLException{
     
        //Ejecutar el procedimiento almacenado para agg consulta con el estado = 0
         CallableStatement cst = this.conn.prepareCall("call  AGG_SOLICITUD(?,?,?)");
        // Parametros de entrada
        cst.setString("PCARNET", _carnet);
        cst.setString("PDOCUMENTO", _documento);
        
        // Parametro de salida (mensaje)
        cst.registerOutParameter("MENSAJE", java.sql.Types.VARCHAR);
        
        // Ejecuta el procedimiento almacenado
        cst.execute();
        
        // Se obtienen la salida del procedimineto almacenado
        String mensaje = cst.getString("MENSAJE");
        System.out.println(mensaje);
        
        return 0;
        
 }




}
