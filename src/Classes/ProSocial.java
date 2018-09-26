
package Classes;

import java.util.Date;

/**
 *
 * @author JRSVALDEZ
 */
public class ProSocial extends Paciente {
    
    public String empleado;
    public String actividad;
    
    public ProSocial(String _nombre, String _apellido,
                    String _telefono, String _celular,
                    String _sexo, String _fecha_nac,
                    String _departamento, String _zona,
                    String _caso_emergencia,  String _tel_emergencia,
                    String _parentezco, String _actividad,
                    String _documento) {
        
        // instancia de la clase validar
        Validar validacion = new Validar();
        // validar con la clase validar cada parametro
        
        this.documento = _documento;
        this.nombre = validacion.validarString(_nombre);
        this.apellido = validacion.validarString(_apellido);
        this.actividad = _actividad;
       // this.fecha_nac = _fecha_nac;
        this.celular = _celular;
        this.telefono = _telefono;
        this.sexo = _sexo;
        this.departamento = _departamento;
       // this.zona = _zona;
        this.caso_emergencia = _caso_emergencia;
        this.tel_emergencia = _tel_emergencia;
        this.parentezco = _parentezco;
    }
    
}
