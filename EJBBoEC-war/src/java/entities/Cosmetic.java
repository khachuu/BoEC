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
@Table(name = "cosmetic")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cosmetic.findAll", query = "SELECT c FROM Cosmetic c")
    , @NamedQuery(name = "Cosmetic.findByProductsId", query = "SELECT c FROM Cosmetic c WHERE c.productsId = :productsId")
    , @NamedQuery(name = "Cosmetic.findBySex", query = "SELECT c FROM Cosmetic c WHERE c.sex = :sex")
    , @NamedQuery(name = "Cosmetic.findByExprice", query = "SELECT c FROM Cosmetic c WHERE c.exprice = :exprice")})
public class Cosmetic implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductsId")
    private Integer productsId;
    @Size(max = 255)
    @Column(name = "Sex")
    private String sex;
    @Column(name = "Exprice")
    private Integer exprice;

    public Cosmetic() {
    }

    public Cosmetic(Integer productsId) {
        this.productsId = productsId;
    }

    public Integer getProductsId() {
        return productsId;
    }

    public void setProductsId(Integer productsId) {
        this.productsId = productsId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getExprice() {
        return exprice;
    }

    public void setExprice(Integer exprice) {
        this.exprice = exprice;
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
        if (!(object instanceof Cosmetic)) {
            return false;
        }
        Cosmetic other = (Cosmetic) object;
        if ((this.productsId == null && other.productsId != null) || (this.productsId != null && !this.productsId.equals(other.productsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Cosmetic[ productsId=" + productsId + " ]";
    }
    
}
