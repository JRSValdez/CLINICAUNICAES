/*
 Procedimientos y funciones para obtener e insertar a la base de datos
 */
package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    
    public Consulta getConsulta(int _idConsulta) throws SQLException, ParseException{
        Consulta consulta = new Consulta();
        Statement stmt = conn.createStatement();
        String query = "SELECT C.IDCONSULTA, C.IDPACIENTE, C.IDDOCTOR, TO_DATE(C.CONS_FECHA, 'dd-mm-yyyy') FECHA, C.IDUSUARIO, DC.EF_CABEZA," +
                    " DC.EF_ABDOMEN, DC.EF_CUELLO, DC.EF_TORAX, DC.EF_EXTREMIDADES, DC.FREC_CAR, DC.PRES_ART, " +
                    " DC.PESO, DC.TALLA, DC.PULSO, DC.MOTIVO FROM CONSULTA C " +
                    " LEFT OUTER JOIN DET_CONSULTA DC ON DC.IDCONSULTA = C.IDCONSULTA" +
                    " WHERE C.IDCONSULTA = 1";
        ResultSet rs = stmt.executeQuery(query);
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
    
    public int aggConsulta(Consulta _consulta){
        int idConsulta = 0;
        
        //Ejecutar el procedimiento almacenado para det consulta
        
        return idConsulta;
    }
    
    public int iniciar_sesion(Paciente _paciente){
        
        String user = _paciente.apellido;
        String contra = _paciente.celular;
    
           
        //llamar procedimeinto almacenado
        
        return 0;
    }
    
    public void aggEstudiante(Estudiante _estudiante){
        //agregar a la base mediante un proc almecenado
    }
    
    public void aggEmpleado(Empleado _estudiante){
        //agregar a la base mediante un proc almecenado
    }
    
    public void aggProSocial(ProSocial _estudiante){
        //agregar a la base mediante un proc almecenado
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
    
    //////////////////////////////////////////////////////////////////////
    //////////////////////////  LLENAR JTABLES ///////////////////////////
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
    
}
