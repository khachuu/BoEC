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
@Table(name = "creditcartpayment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Creditcartpayment.findAll", query = "SELECT c FROM Creditcartpayment c")
    , @NamedQuery(name = "Creditcartpayment.findByPaymentMethodId", query = "SELECT c FROM Creditcartpayment c WHERE c.paymentMethodId = :paymentMethodId")
    , @NamedQuery(name = "Creditcartpayment.findByCardNo", query = "SELECT c FROM Creditcartpayment c WHERE c.cardNo = :cardNo")
    , @NamedQuery(name = "Creditcartpayment.findByOwnerName", query = "SELECT c FROM Creditcartpayment c WHERE c.ownerName = :ownerName")})
public class Creditcartpayment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PaymentMethodId")
    private Integer paymentMethodId;
    @Size(max = 255)
    @Column(name = "CardNo")
    private String cardNo;
    @Size(max = 255)
    @Column(name = "OwnerName")
    private String ownerName;

    public Creditcartpayment() {
    }

    public Creditcartpayment(Integer paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public Integer getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(Integer paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentMethodId != null ? paymentMethodId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Creditcartpayment)) {
            return false;
        }
        Creditcartpayment other = (Creditcartpayment) object;
        if ((this.paymentMethodId == null && other.paymentMethodId != null) || (this.paymentMethodId != null && !this.paymentMethodId.equals(other.paymentMethodId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Creditcartpayment[ paymentMethodId=" + paymentMethodId + " ]";
    }
    
}
