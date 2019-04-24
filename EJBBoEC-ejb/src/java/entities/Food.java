/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author taint
 */
@Entity
@Table(name = "food")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Food.findAll", query = "SELECT f FROM Food f")
    , @NamedQuery(name = "Food.findByProductsId", query = "SELECT f FROM Food f WHERE f.productsId = :productsId")
    , @NamedQuery(name = "Food.findByTypeFoodID", query = "SELECT f FROM Food f WHERE f.typeFoodID = :typeFoodID")
    , @NamedQuery(name = "Food.findByExprice", query = "SELECT f FROM Food f WHERE f.exprice = :exprice")
    , @NamedQuery(name = "Food.findByProtein", query = "SELECT f FROM Food f WHERE f.protein = :protein")
    , @NamedQuery(name = "Food.findByVitamin", query = "SELECT f FROM Food f WHERE f.vitamin = :vitamin")})
public class Food implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductsId")
    private Integer productsId;
    @Column(name = "TypeFoodID")
    private Integer typeFoodID;
    @Column(name = "Exprice")
    @Temporal(TemporalType.DATE)
    private Date exprice;
    @Size(max = 255)
    @Column(name = "Protein")
    private String protein;
    @Size(max = 255)
    @Column(name = "Vitamin")
    private String vitamin;

    public Food() {
    }

    public Food(Integer productsId) {
        this.productsId = productsId;
    }

    public Integer getProductsId() {
        return productsId;
    }

    public void setProductsId(Integer productsId) {
        this.productsId = productsId;
    }

    public Integer getTypeFoodID() {
        return typeFoodID;
    }

    public void setTypeFoodID(Integer typeFoodID) {
        this.typeFoodID = typeFoodID;
    }

    public Date getExprice() {
        return exprice;
    }

    public void setExprice(Date exprice) {
        this.exprice = exprice;
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public String getVitamin() {
        return vitamin;
    }

    public void setVitamin(String vitamin) {
        this.vitamin = vitamin;
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
        if (!(object instanceof Food)) {
            return false;
        }
        Food other = (Food) object;
        if ((this.productsId == null && other.productsId != null) || (this.productsId != null && !this.productsId.equals(other.productsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Food[ productsId=" + productsId + " ]";
    }
    
}
