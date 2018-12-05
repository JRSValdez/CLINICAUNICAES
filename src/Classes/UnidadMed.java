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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author pedro
 */
@Entity
@Table(name = "unidad_med")
@NamedQueries({
    @NamedQuery(name = "UnidadMed.findAll", query = "SELECT u FROM UnidadMed u")})
public class UnidadMed implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idunidad_med")
    private Integer idunidadMed;
    @Column(name = "unidad")
    private String unidad;
    @Column(name = "abreviatura")
    private String abreviatura;

    public UnidadMed() {
    }

    public UnidadMed(Integer idunidadMed) {
        this.idunidadMed = idunidadMed;
    }

    public Integer getIdunidadMed() {
        return idunidadMed;
    }

    public void setIdunidadMed(Integer idunidadMed) {
        this.idunidadMed = idunidadMed;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idunidadMed != null ? idunidadMed.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnidadMed)) {
            return false;
        }
        UnidadMed other = (UnidadMed) object;
        if ((this.idunidadMed == null && other.idunidadMed != null) || (this.idunidadMed != null && !this.idunidadMed.equals(other.idunidadMed))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Classes.UnidadMed[ idunidadMed=" + idunidadMed + " ]";
    }
    
}
