package Classes;

import java.util.Arrays;

/**
 *
 * @author JRSValdez
 */
public class Diagnostico {
    
    public Object[] rowDiagnostico;
    private int con = 0;
    
    public Diagnostico(){
        this.rowDiagnostico = new Object[15];
    }
    
    public void aggRow(String[] _row){
        if (con < 15){
            this.rowDiagnostico[con] = _row;
            con++;
        }
    }
    
    public void limpiarRows(){
        Arrays.fill(this.rowDiagnostico, null);
        con = 0;
    }
}
