/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

public class Empleado {

    public int idEmp;
    public String nombre;
    public String apellido;
    public String telefono;
    public String celular;
    public String fechaNac;
    public String sexo;
    public String documento;

    public String Validar() {

        if (this.nombre.length() > 0 && this.apellido.length() > 0 && this.telefono.length() > 0
                && this.celular.length() > 0 && this.fechaNac.length() > 0 && this.documento.length() > 0) {
            if ((!this.telefono.equals("    -    ") || !this.celular.equals("    -    ")) && !this.fechaNac.equals("  -  -    ")) {
                return "Exito";
            } else {
                return "Error";
            }
        } else {
            return "Error";
        }

    }

}
