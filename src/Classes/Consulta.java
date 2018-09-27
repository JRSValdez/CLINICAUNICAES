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
public class Consulta {
    
    public int idConsulta;
    public int idDoctor;
    public int idPaciente;
    public Date fecha;
    public int idUsuario;
    
    public Receta receta;
    
    public String motivo;
    public String ef_cabeza;
    public String ef_cuello;
    public String ef_torax;
    public String ef_abdomen;
    public String ef_extremidades;
    public String peso;
    public String talla;
    public String pulso;
    public String frec_card;
    public String pres_art;
    public String recomendaciones;
    
    private String validacion;
    private Validar val = new Validar();
    
    public String validarConsulta(){
        val.validacionesMalas = "";
        this.motivo = val.validarString(this.motivo, " motivo ");
        
        this.peso = val.validarString(this.peso, " peso ");
        this.talla = val.validarString(this.talla, " talla ");
        this.pulso = val.validarString(this.pulso, " pulso ");
        this.frec_card = val.validarString(this.frec_card, " Frecuencia Cardiaca ");
        this.pres_art = val.validarString(this.pres_art, " Presion Arterial ");
        
        return val.validacionesMalas;
    }
}
