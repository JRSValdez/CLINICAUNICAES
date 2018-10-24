/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;


public class Doctor {
    
    public int idDoctor;
    public String nombre;
    public String apellido;
    public int idEspecialidad;
    public String telefono;
    public String fechaNac;
    public String sexo;
    public String documento;
    public int idUsuario;
    
    
    public String Validar(){
        
        if (this.nombre.length()>0 && this.apellido.length()>0 && this.telefono.length()>0 && this.fechaNac.length()>0 && this.documento.length()>0){
            return "Exito";
            
           
        }
         else return "Error";
        
        
    }
    
}
