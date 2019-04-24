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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author taint
 */
@Entity
@Table(name = "bill")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bill.findAll", query = "SELECT b FROM Bill b")
    , @NamedQuery(name = "Bill.findById", query = "SELECT b FROM Bill b WHERE b.id = :id")
    , @NamedQuery(name = "Bill.findByOrderId", query = "SELECT b FROM Bill b WHERE b.orderId = :orderId")
    , @NamedQuery(name = "Bill.findByOnlineSaleEmplEmployeeId", query = "SELECT b FROM Bill b WHERE b.onlineSaleEmplEmployeeId = :onlineSaleEmplEmployeeId")
    , @NamedQuery(name = "Bill.findByShopkeeperEmployeeId", query = "SELECT b FROM Bill b WHERE b.shopkeeperEmployeeId = :shopkeeperEmployeeId")
    , @NamedQuery(name = "Bill.findByTotal", query = "SELECT b FROM Bill b WHERE b.total = :total")
    , @NamedQuery(name = "Bill.findByDatePayments", query = "SELECT b FROM Bill b WHERE b.datePayments = :datePayments")})
public class Bill implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Column(name = "OrderId")
    private Integer orderId;
    @Column(name = "OnlineSaleEmplEmployeeId")
    private Integer onlineSaleEmplEmployeeId;
    @Column(name = "ShopkeeperEmployeeId")
    private Integer shopkeeperEmployeeId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Total")
    private Double total;
    @Column(name = "DatePayments")
    @Temporal(TemporalType.DATE)
    private Date datePayments;

    public Bill() {
    }

    public Bill(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOnlineSaleEmplEmployeeId() {
        return onlineSaleEmplEmployeeId;
    }

    public void setOnlineSaleEmplEmployeeId(Integer onlineSaleEmplEmployeeId) {
        this.onlineSaleEmplEmployeeId = onlineSaleEmplEmployeeId;
    }

    public Integer getShopkeeperEmployeeId() {
        return shopkeeperEmployeeId;
    }

    public void setShopkeeperEmployeeId(Integer shopkeeperEmployeeId) {
        this.shopkeeperEmployeeId = shopkeeperEmployeeId;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Date getDatePayments() {
        return datePayments;
    }

    public void setDatePayments(Date datePayments) {
        this.datePayments = datePayments;
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
        if (!(object instanceof Bill)) {
            return false;
        }
        Bill other = (Bill) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Bill[ id=" + id + " ]";
    }
    
}
