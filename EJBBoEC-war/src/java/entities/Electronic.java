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
@Table(name = "electronic")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Electronic.findAll", query = "SELECT e FROM Electronic e")
    , @NamedQuery(name = "Electronic.findByProductsId", query = "SELECT e FROM Electronic e WHERE e.productsId = :productsId")
    , @NamedQuery(name = "Electronic.findByTypeElectronicID", query = "SELECT e FROM Electronic e WHERE e.typeElectronicID = :typeElectronicID")
    , @NamedQuery(name = "Electronic.findByProductivity", query = "SELECT e FROM Electronic e WHERE e.productivity = :productivity")
    , @NamedQuery(name = "Electronic.findByOperatingSystem", query = "SELECT e FROM Electronic e WHERE e.operatingSystem = :operatingSystem")})
public class Electronic implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductsId")
    private Integer productsId;
    @Column(name = "TypeElectronicID")
    private Integer typeElectronicID;
    @Column(name = "Productivity")
    private Integer productivity;
    @Size(max = 255)
    @Column(name = "OperatingSystem")
    private String operatingSystem;

    public Electronic() {
    }

    public Electronic(Integer productsId) {
        this.productsId = productsId;
    }

    public Integer getProductsId() {
        return productsId;
    }

    public void setProductsId(Integer productsId) {
        this.productsId = productsId;
    }

    public Integer getTypeElectronicID() {
        return typeElectronicID;
    }

    public void setTypeElectronicID(Integer typeElectronicID) {
        this.typeElectronicID = typeElectronicID;
    }

    public Integer getProductivity() {
        return productivity;
    }

    public void setProductivity(Integer productivity) {
        this.productivity = productivity;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
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
        if (!(object instanceof Electronic)) {
            return false;
        }
        Electronic other = (Electronic) object;
        if ((this.productsId == null && other.productsId != null) || (this.productsId != null && !this.productsId.equals(other.productsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Electronic[ productsId=" + productsId + " ]";
    }
    
}
