/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author pedro
 */
@Entity
@Table(name = "CIE10_CATEGORIA")
@NamedQueries({
    @NamedQuery(name = "Cie10Categoria.findAll", query = "SELECT c FROM Cie10Categoria c")})
public class Cie10Categoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_CAT")
    private String codCat;
    @Basic(optional = false)
    @Column(name = "CATEGORIA")
    private String categoria;

    public Cie10Categoria() {
    }

    public Cie10Categoria(String codCat) {
        this.codCat = codCat;
    }

    public Cie10Categoria(String codCat, String categoria) {
        this.codCat = codCat;
        this.categoria = categoria;
    }

    public String getCodCat() {
        return codCat;
    }

    public void setCodCat(String codCat) {
        this.codCat = codCat;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCat != null ? codCat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cie10Categoria)) {
            return false;
        }
        Cie10Categoria other = (Cie10Categoria) object;
        if ((this.codCat == null && other.codCat != null) || (this.codCat != null && !this.codCat.equals(other.codCat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Classes.Cie10Categoria[ codCat=" + codCat + " ]";
    }
    
}
