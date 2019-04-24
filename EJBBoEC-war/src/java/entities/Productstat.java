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
@Table(name = "productstat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productstat.findAll", query = "SELECT p FROM Productstat p")
    , @NamedQuery(name = "Productstat.findById", query = "SELECT p FROM Productstat p WHERE p.id = :id")
    , @NamedQuery(name = "Productstat.findByBoughtTime", query = "SELECT p FROM Productstat p WHERE p.boughtTime = :boughtTime")
    , @NamedQuery(name = "Productstat.findByMostBuy", query = "SELECT p FROM Productstat p WHERE p.mostBuy = :mostBuy")})
public class Productstat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "BoughtTime")
    private int boughtTime;
    @Size(max = 255)
    @Column(name = "MostBuy")
    private String mostBuy;

    public Productstat() {
    }

    public Productstat(Integer id) {
        this.id = id;
    }

    public Productstat(Integer id, int boughtTime) {
        this.id = id;
        this.boughtTime = boughtTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getBoughtTime() {
        return boughtTime;
    }

    public void setBoughtTime(int boughtTime) {
        this.boughtTime = boughtTime;
    }

    public String getMostBuy() {
        return mostBuy;
    }

    public void setMostBuy(String mostBuy) {
        this.mostBuy = mostBuy;
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
        if (!(object instanceof Productstat)) {
            return false;
        }
        Productstat other = (Productstat) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Productstat[ id=" + id + " ]";
    }
    
}
