package Classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JRSVALDEZ
 */
public class Consulta {

    public int idConsulta;
    public int idDoctor;
    public int idPaciente;
    public int reposo;
    public String fecha;
    public String fechaString;
    public int idUsuario;

    public Receta receta;
    public Diagnostico diagnostico;
    public Antecedente antecedente;
    public String doctor;
    public String paciente;

    public String motivo;
    public String presenta_enf;
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

    public void setFecha() {
        try {
            SimpleDateFormat formateador = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy 'a las ' HH:mm", new Locale("es", "ES"));
            Date fechaDate = new SimpleDateFormat("dd-MM-yyyy HH:mm").parse(this.fecha);
            this.fechaString = formateador.format(fechaDate).toUpperCase();
        } catch (ParseException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String validarConsulta(int _tipo) {
        val.validacionesMalas = "";
        //se hace uso de la clase validacion para poder validar cada campo según el tipo de campo
        this.motivo = val.validarString(this.motivo, " motivo ");

        this.peso = val.validarString(this.peso, " peso ");
        this.talla = val.validarString(this.talla, " talla ");
        this.pulso = val.validarString(this.pulso, " pulso ");
        this.frec_card = val.validarString(this.frec_card, " Frecuencia Cardiaca ");
        this.pres_art = val.validarString(this.pres_art, " Presion Arterial ");

        if (_tipo == 1) {
            if (this.presenta_enf.length() > 600) {
                val.validacionesMalas += " \n Presenta enfermadad tiene demasiados caracteres";
            }
            if (this.recomendaciones.length() > 600) {
                val.validacionesMalas += " \n Recomendación tiene demasiados caracteres";
            }
            if (this.tratamiento.length() > 600) {
                val.validacionesMalas += " \n Tratamiento tiene demasiados caracteres";
            }
        }

        return val.validacionesMalas;
    }
}
