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
@Table(name = "typebook")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Typebook.findAll", query = "SELECT t FROM Typebook t")
    , @NamedQuery(name = "Typebook.findById", query = "SELECT t FROM Typebook t WHERE t.id = :id")
    , @NamedQuery(name = "Typebook.findByNameTypeBook", query = "SELECT t FROM Typebook t WHERE t.nameTypeBook = :nameTypeBook")})
public class Typebook implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 255)
    @Column(name = "NameTypeBook")
    private String nameTypeBook;

    public Typebook() {
    }

    public Typebook(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameTypeBook() {
        return nameTypeBook;
    }

    public void setNameTypeBook(String nameTypeBook) {
        this.nameTypeBook = nameTypeBook;
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
        if (!(object instanceof Typebook)) {
            return false;
        }
        Typebook other = (Typebook) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Typebook[ id=" + id + " ]";
    }
    
}
