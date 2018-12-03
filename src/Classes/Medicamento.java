
package Classes;


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
            return "Correcto";
        }
        return "Error";
    }
}
