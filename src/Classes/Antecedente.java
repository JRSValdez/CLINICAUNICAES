package Classes;

import java.util.Arrays;

/**
 *
 * @author JRSValdez
 */
public class Antecedente {
    
    public Object[] rowAntecedente;
    private int con = 0;
    
    public Antecedente(){
        this.rowAntecedente = new Object[15];
    }
    
    public void aggRow(String[] _row){
        if (con < 15){
            this.rowAntecedente[con] = _row;
            con++;
        }
    }
    
    public void limpiarRows(){
        Arrays.fill(this.rowAntecedente, null);
        con = 0;
    }
}
