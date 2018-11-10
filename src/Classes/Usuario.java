/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Rodrigo
 */
public class Usuario {
    
    public int idUsuario;
    public String user;
    public String password;
    public int tipo_usr;
    public int empleado;
    public int idDoctor;
   
    public String password1;
    public String password2;
    
    public String Validar(){
        
        if (this.user.length()>3 && this.password.length()>5){
            return "Exito";
            
           
        }
         else return "Error";
        
        
    }
    
    public String ValidarAgg(){
        
        if(this.user.length()>3 && this.password1.length()>5)
        {
            if (this.password1.equals(this.password2)){
            return "Exito";
            
        }
         else return "Error";
  
    } else return "Error";
    }
    
}
