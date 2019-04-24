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
@Table(name = "jewerly")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jewerly.findAll", query = "SELECT j FROM Jewerly j")
    , @NamedQuery(name = "Jewerly.findByProductsId", query = "SELECT j FROM Jewerly j WHERE j.productsId = :productsId")
    , @NamedQuery(name = "Jewerly.findBySize", query = "SELECT j FROM Jewerly j WHERE j.size = :size")
    , @NamedQuery(name = "Jewerly.findByColor", query = "SELECT j FROM Jewerly j WHERE j.color = :color")})
public class Jewerly implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductsId")
    private Integer productsId;
    @Size(max = 255)
    @Column(name = "Size")
    private String size;
    @Size(max = 255)
    @Column(name = "Color")
    private String color;

    public Jewerly() {
    }

    public Jewerly(Integer productsId) {
        this.productsId = productsId;
    }

    public Integer getProductsId() {
        return productsId;
    }

    public void setProductsId(Integer productsId) {
        this.productsId = productsId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        if (!(object instanceof Jewerly)) {
            return false;
        }
        Jewerly other = (Jewerly) object;
        if ((this.productsId == null && other.productsId != null) || (this.productsId != null && !this.productsId.equals(other.productsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Jewerly[ productsId=" + productsId + " ]";
    }
    
}
