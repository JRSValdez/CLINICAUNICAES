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
    private boolean validacionesMalas = false;
    
    String validarString(String _str){
        
        if (_str.length() > 0 && _str.matches("/\\D+/")){
           return _str;
        } else {
            this.validacionesMalas = true;
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
}
