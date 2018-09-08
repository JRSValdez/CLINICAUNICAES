/*
 Clase para validar campos vacios, formato de numeros, strings, validar con SQLi, etc.
 */
package Classes;

/**
 *
 * @author JRSVALDEZ
 */
public class Validar {
    
    String validarString(String _str){
        _str = validarSQLi(_str);
        return _str;
    }
    
    String validarSQLi(String _str){
        // procesar contra sqli
        return _str;
    }
    
    String validarTelefono(String _str){
        // valiadar numeros de celular o telefono
        return _str;
    }
    
    String validarFcarnet(String _str){
        // procesar para validar el carnet
        return _str;
    }
}
