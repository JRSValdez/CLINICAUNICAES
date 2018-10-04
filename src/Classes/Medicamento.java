
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
    
    private Validar val = new Validar();
    
    public String validarMedicamento(){
        this.medicamento = val.validarString(this.medicamento,"Nombre medicamento");
        this.fechaV = val.validarString(this.fechaV,"Fecha de vencimiento");
        
        return val.validacionesMalas;
    }
}
