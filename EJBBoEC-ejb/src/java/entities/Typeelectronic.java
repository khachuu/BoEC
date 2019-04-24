/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author taint
 */
@Entity
@Table(name = "typeelectronic")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Typeelectronic.findAll", query = "SELECT t FROM Typeelectronic t")
    , @NamedQuery(name = "Typeelectronic.findById", query = "SELECT t FROM Typeelectronic t WHERE t.id = :id")
    , @NamedQuery(name = "Typeelectronic.findByNameTE", query = "SELECT t FROM Typeelectronic t WHERE t.nameTE = :nameTE")})
public class Typeelectronic implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 255)
    @Column(name = "NameTE")
    private String nameTE;

    public Typeelectronic() {
    }

    public Typeelectronic(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameTE() {
        return nameTE;
    }

    public void setNameTE(String nameTE) {
        this.nameTE = nameTE;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Typeelectronic)) {
            return false;
        }
        Typeelectronic other = (Typeelectronic) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Typeelectronic[ id=" + id + " ]";
    }
    
}
