/*
 Procedimientos y funciones para obtener e insertar a la base de datos
 */
package Classes;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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
            conn= DriverManager.getConnection(url,"clinica1","master");
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
    
    public Paciente getPaciente(int _idPaciente) throws SQLException{
        Paciente paciente = new Paciente();
        Statement stmt = conn.createStatement();
        String query = "SELECT P.IDPACIENTE, P.PAC_CARNE, TP.TIPOPAC, C.CARRERA, " +
                        " P.PAC_NOMBRE || ' ' || P.PAC_APELLIDO NOMBRE, P.PAC_SEXO, P.PAC_CELULAR, P.PAC_TELEFONO, " +
                        " (trunc(months_between(sysdate,PAC_FECHA_NAC)/12) || ' Años ' || trunc(mod(months_between(sysdate,PAC_FECHA_NAC),12)) || ' meses') Edad, " +
                        " P.PAC_DIRECCION, D.DEPARTAMENTO,  P.PAC_RESPONSABLE, P.PAC_RES_TEL, PA.PARENTESCO " +
                    "FROM PACIENTES P " +
                    " INNER JOIN CARRERA C ON C.IDCARRERA = P.IDCARRERA " +
                    " INNER JOIN FACULTAD F ON F.IDFACULTAD = C.IDFACULTAD " +
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
            paciente.carrera = rs.getString(4);
            paciente.nombre = rs.getString(5);
            paciente.sexo = rs.getString(6);
            paciente.celular = rs.getString(7);
            paciente.telefono = rs.getString(8);
            paciente.edad = rs.getString(9);
            paciente.direccion = rs.getString(10);
            paciente.departamento = rs.getString(11);
            //faltan mas xD
        }
        
        return paciente;
    }
    
    public Consulta getConsulta(int _idConsulta) throws SQLException, ParseException{
        Consulta consulta = new Consulta();
        Statement stmt = conn.createStatement();
        String query = "SELECT C.IDCONSULTA, C.IDPACIENTE, C.IDDOCTOR, TO_DATE(C.CONS_FECHA, 'dd-mm-yyyy') FECHA, C.IDUSUARIO, DC.EF_CABEZA," +
                    " DC.EF_ABDOMEN, DC.EF_CUELLO, DC.EF_TORAX, DC.EF_EXTREMIDADES, DC.FREC_CAR, DC.PRES_ART, " +
                    " DC.PESO, DC.TALLA, DC.PULSO, DC.MOTIVO FROM CONSULTA C " +
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
            consulta.fecha = formatter.parse(rs.getString(4));
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
            consulta.motivo = rs.getString(15);
        }
        return consulta;
    }
    
    public Object[] getCIE10Cats(String _cat) throws SQLException{
        String query = "SELECT COD_CAT, CATEGORIA FROM CIE10_CATEGORIA WHERE CATEGORIA LIKE ?";
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setString(1, "%" + _cat + "%");
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
    
    public int aggConsulta(Consulta _consulta){
        int idConsulta = 0;
        
        //Ejecutar el procedimiento almacenado para det consulta
        
        return idConsulta;
    }
    
    public String aggDetConsulta(Consulta _consulta) throws SQLException{
        
        CallableStatement cst = this.conn.prepareCall("{call  AGG_DET_CONSULTA(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
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
        cst.setString("pMOTIVO", _consulta.motivo);
        cst.setString("pRECOMENDACIONES", _consulta.recomendaciones);
        
        // Parametro de salida (mensaje)
        cst.registerOutParameter("MENSAJE", java.sql.Types.VARCHAR);
        
        // Ejecuta el procedimiento almacenado
        cst.execute();
        
        // Se obtienen la salida del procedimineto almacenado
        String mensaje = cst.getString("MENSAJE");
        
        if(!mensaje.equals("ERROR")){
            // agregar receta y detalle de receta
        }
        System.out.println(mensaje);        
        return mensaje;
    }
    
    //////////////////////////////////////////////////////////////////
    ////////////////////// OTROS //////////////////////////////////////
    //////////////////////////////////////////////////////////////////
    
    public int iniciar_sesion(Paciente _paciente){
        
        String user = _paciente.apellido;
        String contra = _paciente.celular;
    
           
        //llamar procedimeinto almacenado
        
        return 0;
    }
    
    
    //////////////////////////////////////////////////////////////////////
    //////////////////////////  LLENAR JTABLES, COMBOBOXs ///////////////////////////
    //////////////////////////////////////////////////////////////////////
    
    public DefaultTableModel getConsultasEnEspera( JTable jTable1) throws SQLException{
        DefaultTableModel model;
        Statement stmt = conn.createStatement() ;
        String query = "SELECT C.IDCONSULTA, TP.TIPOPAC ACTIVIDAD, P.PAC_NOMBRE || P.PAC_APELLIDO PACIENTE, " +
                "(trunc(months_between(sysdate,PAC_FECHA_NAC)/12) || ' Años ' || trunc(mod(months_between(sysdate,PAC_FECHA_NAC),12)) || ' meses') Edad, "+
                " C.CONS_FECHA FECHA "+
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
    
    public DefaultTableModel getMedicamentos(JTable jTable1, int _idTipo) throws SQLException{
        DefaultTableModel model;
        
        String query = "SELECT M.IDMEDICAMENTO, M.MEDICAMENTO || ' ' || UM.ABREVIATURA MEDICAMENTO, P.PRESENTACION, M.CANTIDAD, TO_DATE(M.FECHA_V, 'dd-mm-yyyy') FECHA FROM MEDICAMENTO M " +
                            " INNER JOIN UNIDAD_MED UM ON UM.IDUNIDAD_MED = M.IDUNIDAD_MED " +
                            " INNER JOIN TIPO_MEDICAMENTO TP ON TP.IDTIPO_MED = M.IDTIPO " +
                            " INNER JOIN PRESENTACION P ON P.IDPRESENTACION = M.IDPRESENTACION " +
                        " WHERE M.IDTIPO = ? AND M.ELIMINADO = 0";
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setInt(1,_idTipo);
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
    
    public DefaultTableModel getMedicamento(JTable jTable1, String _med) throws SQLException{
        DefaultTableModel model;
        
        String query = "SELECT M.IDMEDICAMENTO, M.MEDICAMENTO || ' ' || UM.ABREVIATURA MEDICAMENTO, P.PRESENTACION, M.CANTIDAD, TO_DATE(M.FECHA_V, 'dd-mm-yyyy') FECHA FROM MEDICAMENTO M " +
                            " INNER JOIN UNIDAD_MED UM ON UM.IDUNIDAD_MED = M.IDUNIDAD_MED " +
                            " INNER JOIN TIPO_MEDICAMENTO TP ON TP.IDTIPO_MED = M.IDTIPO " +
                            " INNER JOIN PRESENTACION P ON P.IDPRESENTACION = M.IDPRESENTACION " +
                        " WHERE M.MEDICAMENTO LIKE ? AND M.ELIMINADO = 0";
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setString(1,"%" + _med + "%");
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
    
    public DefaultComboBoxModel Obt_Depart() throws SQLException {

        DefaultComboBoxModel ListaModelo = new DefaultComboBoxModel();
        ListaModelo.removeAllElements();
        ListaModelo.addElement("Seleccione una opción");

        Statement stmt = conn.createStatement();

        String query = "SELECT IDDEPARTAMENTO, DEPARTAMENTO FROM DEPARTAMENTO";
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            ListaModelo.addElement(rs.getString("DEPARTAMENTO"));

        }
        rs.close();

        return ListaModelo;
    }
    
     public DefaultComboBoxModel Obt_Parentesco() throws SQLException {

        DefaultComboBoxModel ListaModelo = new DefaultComboBoxModel();
        ListaModelo.removeAllElements();
        ListaModelo.addElement("Seleccione una opción");

        Statement stmt = conn.createStatement();

        String query = "SELECT IDPARENTESCO, PARENTESCO FROM PARENTESCO";
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            ListaModelo.addElement(rs.getString("PARENTESCO"));

        }
        rs.close();

        return ListaModelo;
    }
     
      public Object[] llenarFacultad(JComboBox _combo) throws SQLException{
        DefaultComboBoxModel model;
        
        String query = "SELECT * FROM FACULTAD";
        PreparedStatement preparedStatement = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = preparedStatement.executeQuery();
        
        rs.last();
        int numRows = rs.getRow();
        rs.beforeFirst();
        
        int[] idFac =  new int[numRows];
        String[] Facult = new String[numRows];
        
        model = (DefaultComboBoxModel) _combo.getModel();
        model.removeAllElements();
        int con = 0;
          while (rs.next())
           {
              idFac[con]= rs.getInt(1);
              Facult[con] = rs.getString(2);
              model.addElement(rs.getString(2));
              con++;
           }
        
        return new Object[]{model, idFac};
    }
    
}
