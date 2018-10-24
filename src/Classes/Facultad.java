/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author pedro
 */
@Entity
@Table(name = "FACULTAD")
@SequenceGenerator(name="facultadSeq",  sequenceName = "FACULTAD_SEQ",allocationSize = 1)
@NamedQueries({
    @NamedQuery(name = "Facultad.findAll", query = "SELECT f FROM Facultad f")})
public class Facultad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy =GenerationType.SEQUENCE,generator="facultadSeq")
    @Column(name = "IDFACULTAD")
    private Integer idfacultad;
    @Column(name = "FACTULTAD")
    private String factultad;
    @OneToMany(mappedBy = "idfacultad")
    private List<Carrera> carreraList;

    public Facultad() {
    }

    public Facultad(Integer idfacultad) {
        this.idfacultad = idfacultad;
    }

    public Integer getIdfacultad() {
        return idfacultad;
    }

    public void setIdfacultad(Integer idfacultad) {
        this.idfacultad = idfacultad;
    }

    public String getFactultad() {
        return factultad;
    }

    public void setFactultad(String factultad) {
        this.factultad = factultad;
    }

    public List<Carrera> getCarreraList() {
        return carreraList;
    }

    public void setCarreraList(List<Carrera> carreraList) {
        this.carreraList = carreraList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfacultad != null ? idfacultad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facultad)) {
            return false;
        }
        Facultad other = (Facultad) object;
        if ((this.idfacultad == null && other.idfacultad != null) || (this.idfacultad != null && !this.idfacultad.equals(other.idfacultad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Classes.Facultad[ idfacultad= " + idfacultad + " ]";
    }
    
}
