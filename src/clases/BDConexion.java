package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class BDConexion {
    
  static Statement st;
  static ResultSet rs;
  
  public Connection con=null;
  
  //con= DriverManager.getConnection(url,"clinica1","master");
    
    public Connection conectar(){
        try {
            
            String url="jdbc:oracle:thin:@localhost:1521:XE";
            con= DriverManager.getConnection(url,"clinica1","master");
            st= con.createStatement();
            
        }
            catch (Exception e){
                    JOptionPane.showMessageDialog(null,"No ha sido posible conectarse \n" +  e);
                    
                    }
        return con;
        }
    
    public void cerrarConexion (Connection con){
        try {
            con.close();
            
        }
        catch(SQLException e){
            
        }
    }
    
    
}
