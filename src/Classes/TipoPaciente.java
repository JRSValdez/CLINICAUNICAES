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
@Table(name = "tipo_paciente")
@NamedQueries({
    @NamedQuery(name = "TipoPaciente.findAll", query = "SELECT t FROM TipoPaciente t")})
public class TipoPaciente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipopac")
    private Integer idtipopac;
    @Column(name = "tipopac")
    private String tipopac;

    public TipoPaciente() {
    }

    public TipoPaciente(Integer idtipopac) {
        this.idtipopac = idtipopac;
    }

    public Integer getIdtipopac() {
        return idtipopac;
    }

    public void setIdtipopac(Integer idtipopac) {
        this.idtipopac = idtipopac;
    }

    public String getTipopac() {
        return tipopac;
    }

    public void setTipopac(String tipopac) {
        this.tipopac = tipopac;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipopac != null ? idtipopac.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoPaciente)) {
            return false;
        }
        TipoPaciente other = (TipoPaciente) object;
        if ((this.idtipopac == null && other.idtipopac != null) || (this.idtipopac != null && !this.idtipopac.equals(other.idtipopac))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Classes.TipoPaciente[ idtipopac=" + idtipopac + " ]";
    }
    
}
