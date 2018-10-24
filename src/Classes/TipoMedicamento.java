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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author pedro
 */
@Entity
@Table(name = "TIPO_MEDICAMENTO")
@SequenceGenerator(name="MEDICAMENTO_SEQ",  sequenceName = "TIPO_MEDICAMENTO_SEQ",allocationSize = 1)
@NamedQueries({
    @NamedQuery(name = "TipoMedicamento.findAll", query = "SELECT t FROM TipoMedicamento t")})
public class TipoMedicamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy =GenerationType.SEQUENCE,generator="MEDICAMENTO_SEQ")
    @Column(name = "IDTIPO_MED")
    private Integer idtipoMed;
    @Column(name = "TIPO_MED")
    private String tipoMed;

    public TipoMedicamento() {
    }

    public TipoMedicamento(Integer idtipoMed) {
        this.idtipoMed = idtipoMed;
    }

    public Integer getIdtipoMed() {
        return idtipoMed;
    }

    public void setIdtipoMed(Integer idtipoMed) {
        this.idtipoMed = idtipoMed;
    }

    public String getTipoMed() {
        return tipoMed;
    }

    public void setTipoMed(String tipoMed) {
        this.tipoMed = tipoMed;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoMed != null ? idtipoMed.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoMedicamento)) {
            return false;
        }
        TipoMedicamento other = (TipoMedicamento) object;
        if ((this.idtipoMed == null && other.idtipoMed != null) || (this.idtipoMed != null && !this.idtipoMed.equals(other.idtipoMed))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Classes.TipoMedicamento[ idtipoMed=" + idtipoMed + " ]";
    }
    
}
