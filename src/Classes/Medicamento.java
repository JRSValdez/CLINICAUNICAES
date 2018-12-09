
package Classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author JRSVALDEZ
 */
public class Medicamento {
    
    public int idMedicamente;
    public int idUnidad;
    public int idTipoMed;
    public int idPresentacion;
    public String medicamento;
    public String unidad_med;
    public int cantidad;
    public String presentacion;
    public String tipo;
    public String fechaV;
   
    
    public String validarMedicamento(){
        if(this.medicamento.length()>3 && this.cantidad > 0 && this.fechaV.length() == 10){
            try {
                Date date = new Date();
                Date fecha = new SimpleDateFormat("dd-MM-yyyy").parse(this.fechaV);
                if(fecha.compareTo(date) > 0) return "Correcto";
                
            } catch (ParseException ex) {
                return "Error";
            }
        }
        return "Error";
    }
}
