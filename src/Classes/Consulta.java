
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
    public String fecha;
    public int idUsuario;
    
    public Receta receta;
    public Diagnostico diagnostico;
    public Antecedente antecedente;
    public String doctor;
    public String paciente;
    
    public String motivo;
    public String ef_cabeza;
    public String ef_cuello;
    public String ef_torax;
    public String ef_abdomen;
    public String ef_extremidades;
    public String peso;
    public String talla;
    public String pulso;
    public String temperatura;
    public String frec_card;
    public String pres_art;
    public String recomendaciones;
    public String tratamiento;
    
    private Validar val = new Validar();
    
    public String validarConsulta(){
        val.validacionesMalas = "";
        //se hace uso de la clase validacion para poder validar cada campo según el tipo de campo
        this.motivo = val.validarString(this.motivo, " motivo ");
        
        this.peso = val.validarString(this.peso, " peso ");
        this.talla = val.validarString(this.talla, " talla ");
        this.pulso = val.validarString(this.pulso, " pulso ");
        this.frec_card = val.validarString(this.frec_card, " Frecuencia Cardiaca ");
        this.pres_art = val.validarString(this.pres_art, " Presion Arterial ");
        
        return val.validacionesMalas;
    }
}
