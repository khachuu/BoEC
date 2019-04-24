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
@Table(name = "toys")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Toys.findAll", query = "SELECT t FROM Toys t")
    , @NamedQuery(name = "Toys.findByProductsId", query = "SELECT t FROM Toys t WHERE t.productsId = :productsId")
    , @NamedQuery(name = "Toys.findByAgeLimit", query = "SELECT t FROM Toys t WHERE t.ageLimit = :ageLimit")
    , @NamedQuery(name = "Toys.findByMaterial", query = "SELECT t FROM Toys t WHERE t.material = :material")})
public class Toys implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductsId")
    private Integer productsId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AgeLimit")
    private int ageLimit;
    @Size(max = 255)
    @Column(name = "Material")
    private String material;

    public Toys() {
    }

    public Toys(Integer productsId) {
        this.productsId = productsId;
    }

    public Toys(Integer productsId, int ageLimit) {
        this.productsId = productsId;
        this.ageLimit = ageLimit;
    }

    public Integer getProductsId() {
        return productsId;
    }

    public void setProductsId(Integer productsId) {
        this.productsId = productsId;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productsId != null ? productsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Toys)) {
            return false;
        }
        Toys other = (Toys) object;
        if ((this.productsId == null && other.productsId != null) || (this.productsId != null && !this.productsId.equals(other.productsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Toys[ productsId=" + productsId + " ]";
    }
    
}
