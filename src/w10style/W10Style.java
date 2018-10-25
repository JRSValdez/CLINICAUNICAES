/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W10Style;

import java.sql.SQLException;
import javax.swing.UIManager;
import vistas.Home_Recepcion;
import vistas.Login;

/**
 *
 * @author JRSVALDEZ
 */
public class W10Style {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) throws SQLException {
        
        try {
            UIManager.setLookAndFeel( "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            Login main = new Login();
            main.show();
        }
        catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(W10Style.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(W10Style.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(W10Style.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(W10Style.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
}
