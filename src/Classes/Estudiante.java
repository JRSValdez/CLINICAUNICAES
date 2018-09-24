/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Date;

/**
 *
 * @author JRSVALDEZ
 */
public class Estudiante extends Paciente {
    
    public String carnet;
    public String facultad;
    public String carrera;
    
    // instancia de la clase validar
    Validar validacion = new Validar();
    // validar con la clase validar cada parametro
    
    public Estudiante(String _nombre, String _apellido,
                    String _telefono, String _celular,
                    String _sexo, Date _fecha_nac,
                    String _departamento, String _zona,
                    String _caso_emergencia,  String _tel_emergencia,
                    String _parentezco, String _carnet,
                    String _facultad, String _carrera) {
        
        this.nombre = validacion.validarString(_nombre);
        this.apellido = validacion.validarString(_apellido);
        this.carnet = validacion.validarCarnet(_carnet);
        this.facultad = _facultad;
        this.carrera = _carrera;
        this.fecha_nac = validacion.validarFecha(_fecha_nac);
        this.celular = validacion.validarCelular(_celular);
        this.telefono = validacion.validarString(_telefono);
        this.sexo = validacion.validarSexo(_sexo);
        this.departamento = _departamento;
        this.zona = _zona;
        this.caso_emergencia = validacion.validarString(_caso_emergencia);
        this.tel_emergencia = validacion.validarCelular(_tel_emergencia);
        this.parentezco = _parentezco;
    }
    
}
