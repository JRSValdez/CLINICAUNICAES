package Classes;

/**
 *
 * @author JRSVALDEZ
 */
public class solicitud_med {
    public int idMed;
    public String cardoc;
    public String nombre;
    public int cantidad;
    
    public String validarSolicitud(){
        if(this.cardoc.length() > 6 &&this.nombre.length() > 7 && this.cantidad > 0){
            return "Correcto";
        }
        return "Error";
    }
}
