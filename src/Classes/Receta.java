
package Classes;

/**
 *
 * @author JRSVALDEZ
 */
public class Receta {
    
    public int idConsulta;
    public Object[] rowReceta;
    private int con = 0;
    
    public void aggRow(String[] _row){
        if (con < 15){
            this.rowReceta[con] = _row;
        }
    }
    
}
