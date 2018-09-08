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
    
    public Estudiante(String _nombre, String _apellido,
                    String _telefono, String _celular,
                    char _sexo, Date _fecha_nac,
                    String _departamento, String _zona,
                    String _caso_emergencia,  String _tel_emergencia,
                    String _parentezco, String _carnet,
                    String _facultad, String _carrera) {
        
        // instancia de la clase validar
        Validar validacion = new Validar();
        // validar con la clase validar cada parametro
        
        this.nombre = validacion.validarString(_nombre);
        this.apellido = validacion.validarString(_apellido);
        this.carnet = _carnet;
        this.facultad = _facultad;
        this.carrera = _carrera;
        this.fecha_nac = _fecha_nac;
        this.celular = _celular;
        this.telefono = _telefono;
        this.sexo = _sexo;
        this.departamento = _departamento;
        this.zona = _zona;
        this.caso_emergencia = _caso_emergencia;
        this.tel_emergencia = _tel_emergencia;
        this.parentezco = _parentezco;
    }
    
}
