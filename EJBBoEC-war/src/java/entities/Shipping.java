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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author taint
 */
@Entity
@Table(name = "shipping")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Shipping.findAll", query = "SELECT s FROM Shipping s")
    , @NamedQuery(name = "Shipping.findById", query = "SELECT s FROM Shipping s WHERE s.id = :id")
    , @NamedQuery(name = "Shipping.findByShippingTypeId", query = "SELECT s FROM Shipping s WHERE s.shippingTypeId = :shippingTypeId")
    , @NamedQuery(name = "Shipping.findByShippingStatusId", query = "SELECT s FROM Shipping s WHERE s.shippingStatusId = :shippingStatusId")
    , @NamedQuery(name = "Shipping.findByPriceShipping", query = "SELECT s FROM Shipping s WHERE s.priceShipping = :priceShipping")
    , @NamedQuery(name = "Shipping.findByRegion", query = "SELECT s FROM Shipping s WHERE s.region = :region")
    , @NamedQuery(name = "Shipping.findByDateDelay", query = "SELECT s FROM Shipping s WHERE s.dateDelay = :dateDelay")})
public class Shipping implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "ShippingTypeId")
    private Integer shippingTypeId;
    @Column(name = "ShippingStatusId")
    private Integer shippingStatusId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PriceShipping")
    private Float priceShipping;
    @Size(max = 255)
    @Column(name = "Region")
    private String region;
    @Column(name = "DateDelay")
    @Temporal(TemporalType.DATE)
    private Date dateDelay;

    public Shipping() {
    }

    public Shipping(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShippingTypeId() {
        return shippingTypeId;
    }

    public void setShippingTypeId(Integer shippingTypeId) {
        this.shippingTypeId = shippingTypeId;
    }

    public Integer getShippingStatusId() {
        return shippingStatusId;
    }

    public void setShippingStatusId(Integer shippingStatusId) {
        this.shippingStatusId = shippingStatusId;
    }

    public Float getPriceShipping() {
        return priceShipping;
    }

    public void setPriceShipping(Float priceShipping) {
        this.priceShipping = priceShipping;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Date getDateDelay() {
        return dateDelay;
    }

    public void setDateDelay(Date dateDelay) {
        this.dateDelay = dateDelay;
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
        if (!(object instanceof Shipping)) {
            return false;
        }
        Shipping other = (Shipping) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Shipping[ id=" + id + " ]";
    }
    
}
