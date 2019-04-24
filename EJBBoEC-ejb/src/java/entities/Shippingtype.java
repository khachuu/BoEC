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
@Table(name = "shippingtype")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Shippingtype.findAll", query = "SELECT s FROM Shippingtype s")
    , @NamedQuery(name = "Shippingtype.findById", query = "SELECT s FROM Shippingtype s WHERE s.id = :id")
    , @NamedQuery(name = "Shippingtype.findByName", query = "SELECT s FROM Shippingtype s WHERE s.name = :name")
    , @NamedQuery(name = "Shippingtype.findByVehicle", query = "SELECT s FROM Shippingtype s WHERE s.vehicle = :vehicle")})
public class Shippingtype implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "Name")
    private String name;
    @Size(max = 255)
    @Column(name = "Vehicle")
    private String vehicle;

    public Shippingtype() {
    }

    public Shippingtype(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
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
        if (!(object instanceof Shippingtype)) {
            return false;
        }
        Shippingtype other = (Shippingtype) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Shippingtype[ id=" + id + " ]";
    }
    
}
