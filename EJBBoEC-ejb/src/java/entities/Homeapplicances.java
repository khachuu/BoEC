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
@Table(name = "homeapplicances")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Homeapplicances.findAll", query = "SELECT h FROM Homeapplicances h")
    , @NamedQuery(name = "Homeapplicances.findByProductsId", query = "SELECT h FROM Homeapplicances h WHERE h.productsId = :productsId")
    , @NamedQuery(name = "Homeapplicances.findByMaterial", query = "SELECT h FROM Homeapplicances h WHERE h.material = :material")
    , @NamedQuery(name = "Homeapplicances.findBySize", query = "SELECT h FROM Homeapplicances h WHERE h.size = :size")})
public class Homeapplicances implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductsId")
    private Integer productsId;
    @Size(max = 255)
    @Column(name = "Material")
    private String material;
    @Size(max = 255)
    @Column(name = "Size")
    private String size;

    public Homeapplicances() {
    }

    public Homeapplicances(Integer productsId) {
        this.productsId = productsId;
    }

    public Integer getProductsId() {
        return productsId;
    }

    public void setProductsId(Integer productsId) {
        this.productsId = productsId;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
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
        if (!(object instanceof Homeapplicances)) {
            return false;
        }
        Homeapplicances other = (Homeapplicances) object;
        if ((this.productsId == null && other.productsId != null) || (this.productsId != null && !this.productsId.equals(other.productsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Homeapplicances[ productsId=" + productsId + " ]";
    }
    
}
