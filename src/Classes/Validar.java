/*
 Clase para validar campos vacios, formato de numeros, strings, validar con SQLi, etc.
 */
package Classes;

import java.util.Date;

/**
 *
 * @author JRSVALDEZ
 */
public class Validar {
    // variable que irá guardando los campos mal validados para verficar cuales deben ser corregidos
    public String validacionesMalas = "";
    
    String validarString(String _str, String _nombre){
        
        if (_str.length() > 0 ){
           return _str;
        } else {
            this.validacionesMalas += _nombre + " no valido " ;
            return _str;
        }
       
    }
    
    String validarSQLi(String _str){
        // procesar contra sqli
        return _str;
    }
    
    String validarCelular(String _str){
        // valiadar numeros de celular o telefono
        return _str;
    }
    
    String validarCarnet(String _str){
        // procesar para validar el carnet
        return _str;
    }
    
    String validarFecha(Date _fecha){
        // procesar para validar la fecha sea menor a la fecha actual
        String fechaString = "";
        return fechaString;
    }
    
    String validarSexo(String _str){
        // procesar para validar el sexo solo sea M o F
        return _str;
    }
    
    private String validarEmail(String _email){
        if(_email.matches("^([\\w-]+\\.)*?[\\w-]+@[\\w-]+\\.([\\w-]+\\.)*?[\\w]+$")){
            return _email;
        } else {
            this.validacionesMalas += " Email incorrecto ";
            return _email;
        }
    }
    
    
    
}
