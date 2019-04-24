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
@Table(name = "bankpayment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bankpayment.findAll", query = "SELECT b FROM Bankpayment b")
    , @NamedQuery(name = "Bankpayment.findByPaymentMethodId", query = "SELECT b FROM Bankpayment b WHERE b.paymentMethodId = :paymentMethodId")
    , @NamedQuery(name = "Bankpayment.findByBankId", query = "SELECT b FROM Bankpayment b WHERE b.bankId = :bankId")
    , @NamedQuery(name = "Bankpayment.findByCartNo", query = "SELECT b FROM Bankpayment b WHERE b.cartNo = :cartNo")
    , @NamedQuery(name = "Bankpayment.findByOwnerName", query = "SELECT b FROM Bankpayment b WHERE b.ownerName = :ownerName")})
public class Bankpayment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PaymentMethodId")
    private Integer paymentMethodId;
    @Column(name = "BankId")
    private Integer bankId;
    @Size(max = 255)
    @Column(name = "CartNo")
    private String cartNo;
    @Size(max = 255)
    @Column(name = "OwnerName")
    private String ownerName;

    public Bankpayment() {
    }

    public Bankpayment(Integer paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public Integer getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(Integer paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getCartNo() {
        return cartNo;
    }

    public void setCartNo(String cartNo) {
        this.cartNo = cartNo;
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
        if (!(object instanceof Bankpayment)) {
            return false;
        }
        Bankpayment other = (Bankpayment) object;
        if ((this.paymentMethodId == null && other.paymentMethodId != null) || (this.paymentMethodId != null && !this.paymentMethodId.equals(other.paymentMethodId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Bankpayment[ paymentMethodId=" + paymentMethodId + " ]";
    }
    
}
