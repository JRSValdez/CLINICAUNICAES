/*
 Procedimientos y funciones para obtener e insertar a la base de datos
 */
package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author JRSVALDEZ
 */
public class ConexionDB {
    static Statement st;
    static ResultSet rs;
    public Connection con=null;
  
    //instanciar la clase validar
  
    public void conectar(){
        try {
            String url="jdbc:oracle:thin:@localhost:1521:XE";
            con= DriverManager.getConnection(url,"clinica1","master");
            st= con.createStatement();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"No ha sido posible conectarse \n" +  e);
        }
    }
        
    
    public void cerrarConexion (){
        try {
            con.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al cerrar la conexión \n" +  e);
        }
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
    
    public void aggEstudiante(Empleado _estudiante){
        //agregar a la base mediante un proc almecenado
    }
    
    public void aggEstudiante(ProSocial _estudiante){
        //agregar a la base mediante un proc almecenado
    }
}
