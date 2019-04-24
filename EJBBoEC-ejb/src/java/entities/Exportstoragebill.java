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
@Table(name = "exportstoragebill")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Exportstoragebill.findAll", query = "SELECT e FROM Exportstoragebill e")
    , @NamedQuery(name = "Exportstoragebill.findById", query = "SELECT e FROM Exportstoragebill e WHERE e.id = :id")
    , @NamedQuery(name = "Exportstoragebill.findByStorageId", query = "SELECT e FROM Exportstoragebill e WHERE e.storageId = :storageId")
    , @NamedQuery(name = "Exportstoragebill.findByBillId", query = "SELECT e FROM Exportstoragebill e WHERE e.billId = :billId")
    , @NamedQuery(name = "Exportstoragebill.findByTime", query = "SELECT e FROM Exportstoragebill e WHERE e.time = :time")
    , @NamedQuery(name = "Exportstoragebill.findByTotalMoney", query = "SELECT e FROM Exportstoragebill e WHERE e.totalMoney = :totalMoney")})
public class Exportstoragebill implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Column(name = "StorageId")
    private Integer storageId;
    @Column(name = "BillId")
    private Integer billId;
    @Size(max = 255)
    @Column(name = "Time")
    private String time;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TotalMoney")
    private Double totalMoney;

    public Exportstoragebill() {
    }

    public Exportstoragebill(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStorageId() {
        return storageId;
    }

    public void setStorageId(Integer storageId) {
        this.storageId = storageId;
    }

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
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
        if (!(object instanceof Exportstoragebill)) {
            return false;
        }
        Exportstoragebill other = (Exportstoragebill) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Exportstoragebill[ id=" + id + " ]";
    }
    
}
