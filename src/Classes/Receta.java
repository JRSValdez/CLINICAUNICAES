
package Classes;

import java.util.Arrays;

/**
 *
 * @author JRSVALDEZ
 */
public class Receta {
    
    public Object[] rowReceta;
    private int con = 0;
    
    public Receta(){
        this.rowReceta = new Object[15];
    }
    
    public void aggRow(String[] _row){
        if (con < 15){
            this.rowReceta[con] = _row;
            con++;
        }
    }
    
    public void limpiarRows(){
        Arrays.fill(this.rowReceta, null);
        con = 0;
    }
    
}
